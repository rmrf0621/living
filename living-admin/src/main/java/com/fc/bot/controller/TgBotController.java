package com.fc.bot.controller;

import com.fc.bot.model.TgBot;
import com.fc.bot.service.TgBotService;
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
 * telegram机器人Controller
 * @ClassName: TgBotController
 * @author fuce
 * @date 2021-02-07 14:41:01
 */
@Api(value = "telegram机器人")
@Controller
@RequestMapping("/tgbot")
public class TgBotController extends BaseController{
	
	private String prefix = "admin/tgbot";
	
	@Autowired
	private TgBotService tgBotService;
	
	
	/**
	 * telegram机器人页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("tg:bot:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @return
	 */
	//@Log(title = "telegram机器人", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@RequiresPermissions("tg:bot:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar, TgBot tgBot){
		PageInfo<TgBot> page=tgBotService.list(tablepar,tgBot) ;
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
	//@Log(title = "telegram机器人新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("tg:bot:add")
	@ResponseBody
	public AjaxResult add(TgBot tgBot){
		int b=tgBotService.insertSelective(tgBot);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * telegram机器人删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "telegram机器人删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@RequiresPermissions("tg:bot:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tgBotService.deleteByPrimaryKey(ids);
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
        map.put("TgBot", tgBotService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "telegram机器人修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("tg:bot:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TgBot tgBot)
    {
        return toAjax(tgBotService.updateByPrimaryKeySelective(tgBot));
    }

    
    

	
}
