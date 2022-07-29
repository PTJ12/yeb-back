package cn.ut.server.mapper;

import cn.ut.server.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ut
 * @since 2022-07-09
 */
public interface RoleMapper extends BaseMapper<Role> {


    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);
}
