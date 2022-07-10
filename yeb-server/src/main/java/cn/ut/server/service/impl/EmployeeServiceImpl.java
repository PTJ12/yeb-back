package cn.ut.server.service.impl;

import cn.ut.server.mapper.EmployeeMapper;
import cn.ut.server.pojo.Employee;
import cn.ut.server.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
