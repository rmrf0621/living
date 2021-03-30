package com.fc.bot.controller;

import com.fc.bot.model.TgGroup;
import com.fc.bot.service.TgGroupService;
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
 * 飞机群组Controller
 * @ClassName: TgGroupController
 * @author fuce
 * @date 2021-02-07 18:50:13
 */
@Api(value = "飞机群组")
@Controller
@RequestMapping("/tgGroup")
public class TgGroupController extends BaseController{
	
	private String prefix = "admin/tgGroup";
	
	@Autowired
	private TgGroupService tgGroupService;
	
	
	/**
	 * 飞机群组页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("tg:group:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @return
	 */
	//@Log(title = "飞机群组", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@RequiresPermissions("tg:group:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar, TgGroup tgGroup){
		PageInfo<TgGroup> page=tgGroupService.list(tablepar,tgGroup) ;
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
	//@Log(title = "飞机群组新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("tg:group:add")
	@ResponseBody
	public AjaxResult add(TgGroup tgGroup){
		int b=tgGroupService.insertSelective(tgGroup);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * 飞机群组删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "飞机群组删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@RequiresPermissions("tg:group:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tgGroupService.deleteByPrimaryKey(ids);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	
	/**
	 * 修改跳转
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "修改跳转", notes = "修改跳转")
	@GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap map)
    {
        map.put("TgGroup", tgGroupService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "飞机群组修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("tg:group:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TgGroup tgGroup)
    {
        return toAjax(tgGroupService.updateByPrimaryKeySelective(tgGroup));
    }

    
    

	
}
