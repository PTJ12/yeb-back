package cn.ut.server.controller;

import cn.ut.server.pojo.Menu;
import cn.ut.server.pojo.MenuRole;
import cn.ut.server.pojo.RespBean;
import cn.ut.server.pojo.Role;
import cn.ut.server.service.IMenuRoleService;
import cn.ut.server.service.IMenuService;
import cn.ut.server.service.IRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PuTongjiao
 * @date 2022/8/3 20:29
 */
@RestController
@RequestMapping("/system/basic/permiss")
public class PerimessController {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IMenuRoleService menuRoleService;

    @ApiOperation(value = "获取所有角色")
    @GetMapping("/")
    public List<Role> getAllRole(){
        return roleService.list();
    }

    @ApiOperation(value = "添加角色")
    @PostMapping("/")
    public RespBean addRole(Role role){
        if (!role.getName().startsWith("ROLE_")){
            role.setName("ROLE_" + role.getName());
        }
        if (roleService.save(role)){
            return RespBean.success("添加成功");
        }
        return RespBean.error("添加失败");
    }

    @ApiOperation(value = "删除角色")
    @DeleteMapping("/role/{rid}")
    public RespBean deleteRole(@PathVariable Integer rid){
        if (roleService.removeById(rid)){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @ApiOperation(value = "查询所有菜单")
    @GetMapping("/menus")
    public List<Menu> getAllMenus(){
        return menuService.getAllMenus();
    }

    @ApiOperation(value = "根据角色id查询菜单id")
    @GetMapping("/mid/{rid}")
    public List<Integer> getMidByRid(@PathVariable Integer rid){
        return menuRoleService.list(new QueryWrapper<MenuRole>().eq("rid", rid)).stream().map(MenuRole::getMid).collect(Collectors.toList());
    }

    @ApiOperation(value = "更新角色菜单")
    @PutMapping("/")
    public RespBean updateMenuRole(Integer rid, Integer[] mids){
        return menuRoleService.updateMenuRole(rid, mids);
    }
}
