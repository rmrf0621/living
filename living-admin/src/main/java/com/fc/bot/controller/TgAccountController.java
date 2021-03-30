package com.fc.bot.controller;

import com.fc.bot.model.TgAccount;
import com.fc.bot.service.TgAccountService;
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
 * tg账号设置Controller
 * @ClassName: TgAccountController
 * @author fuce
 * @date 2021-02-07 14:41:00
 */
@Api(value = "tg账号设置")
@Controller
@RequestMapping("/tgAccount")
public class TgAccountController extends BaseController{
	
	private String prefix = "admin/tgAccount";
	
	@Autowired
	private TgAccountService tgAccountService;
	
	
	/**
	 * tg账号设置页面展示
	 * @param model
	 * @return String
	 * @author fuce
	 */
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/view")
	@RequiresPermissions("tg:tgAccount:view")
    public String view(ModelMap model)
    {
        return prefix + "/list";
    }
	
	/**
	 * list集合
	 * @param tablepar
	 * @return
	 */
	//@Log(title = "tg账号设置", action = "111")
	@ApiOperation(value = "分页跳转", notes = "分页跳转")
	@GetMapping("/list")
	@RequiresPermissions("tg:tgAccount:list")
	@ResponseBody
	public ResultTable list(Tablepar tablepar,TgAccount tgAccount){
		PageInfo<TgAccount> page=tgAccountService.list(tablepar,tgAccount) ;
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
	//@Log(title = "tg账号设置新增", action = "111")
	@ApiOperation(value = "新增", notes = "新增")
	@PostMapping("/add")
	@RequiresPermissions("tg:tgAccount:add")
	@ResponseBody
	public AjaxResult add(TgAccount tgAccount){
		int b=tgAccountService.insertSelective(tgAccount);
		if(b>0){
			return success();
		}else{
			return error();
		}
	}
	
	/**
	 * tg账号设置删除
	 * @param ids
	 * @return
	 */
	//@Log(title = "tg账号设置删除", action = "111")
	@ApiOperation(value = "删除", notes = "删除")
	@DeleteMapping("/remove")
	@RequiresPermissions("tg:tgAccount:remove")
	@ResponseBody
	public AjaxResult remove(String ids){
		int b=tgAccountService.deleteByPrimaryKey(ids);
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
        map.put("TgAccount", tgAccountService.selectByPrimaryKey(id));

        return prefix + "/edit";
    }
	
	/**
     * 修改保存
     */
    //@Log(title = "tg账号设置修改", action = "111")
	@ApiOperation(value = "修改保存", notes = "修改保存")
    @RequiresPermissions("tg:tgAccount:edit")
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TgAccount tgAccount)
    {
        return toAjax(tgAccountService.updateByPrimaryKeySelective(tgAccount));
    }

    
    

	
}
