package com.fc.bot.controller;


import com.fc.bot.model.TgBofeatures;
import com.fc.bot.service.TgBofeaturesService;
import com.fc.v2.common.base.BaseController;
import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.common.domain.ResultTable;
import com.fc.v2.model.custom.Tablepar;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 机器人功能列表Controller
 * @ClassName: TgBofeaturesController
 * @author fuce
 * @date 2021-02-09 15:12:35
 */
@Api(value = "机器人功能列表")
@Controller
@RequestMapping("/tgBotfeatures")
public class TgBofeaturesController extends BaseController {
	
	private String prefix = "admin/tgBotfeatures";
	
	@Autowired
	private TgBofeaturesService tgBofeaturesService;
	
	
	/**
	 * 机器人功能列表页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("tg:features:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @return
	 */
	//@Log(title = "机器人功能列表", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@RequiresPermissions("tg:features:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar, TgBofeatures tgBofeatures){
		PageInfo<TgBofeatures> page=tgBofeaturesService.list(tablepar,tgBofeatures) ; 
		return pageTable(page.getList(),page.getTotal());
	}
	
	/**
     * 新增跳转
     */
	@ApiOperation(value = "新增跳转", notes = "新增跳转")
    @GetMapping("/add")
    public String add(ModelMap modelMap)
    {
        return prefix + "/add";
    }
	
    /**
     * 新增保存
     * @param 
     * @return
     */
	//@Log(title = "机器人功能列表新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("tg:features:add")
	@ResponseBody
	public AjaxResult add(TgBofeatures tgBofeatures){
		int b=tgBofeaturesService.insertSelective(tgBofeatures);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 机器人功能列表删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "机器人功能列表删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@RequiresPermissions("tg:features:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tgBofeaturesService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @param map
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("TgBofeatures", tgBofeaturesService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "机器人功能列表修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("tg:features:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TgBofeatures tgBofeatures)
    {
        return toAjax(tgBofeaturesService.updateByPrimaryKeySelective(tgBofeatures));
    }
}
