package cn.ut.server.service.impl;

import cn.ut.server.mapper.MenuMapper;
import cn.ut.server.pojo.Menu;
import cn.ut.server.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ut
 * @since 2022-07-09
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
