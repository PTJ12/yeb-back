package cn.ut.server.service.impl;

import cn.ut.server.mapper.PositionMapper;
import cn.ut.server.pojo.Position;
import cn.ut.server.service.IPositionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ut
 * @since 2022-07-19
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

}
