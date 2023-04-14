package com.chinatelecom.operations.aqmhserivce.service.impl;

import com.chinatelecom.operations.aqmhserivce.entity.Student;
import com.chinatelecom.operations.aqmhserivce.mapper.StudentMapper;
import com.chinatelecom.operations.aqmhserivce.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangXu
 * @since 2023-04-07
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
