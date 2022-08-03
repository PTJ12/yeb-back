package cn.ut.server.service.impl;

import ch.qos.logback.classic.spi.EventArgUtil;
import cn.ut.server.mapper.MenuRoleMapper;
import cn.ut.server.pojo.MenuRole;
import cn.ut.server.pojo.RespBean;
import cn.ut.server.service.IMenuRoleService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ut
 * @since 2022-07-09
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));

        if (null == mids || 0 == mids.length){
            return RespBean.success("更新成功");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (result == mids.length){
            return RespBean.success("更新成功");
        }
        return RespBean.error("更新失败");
    }
}
