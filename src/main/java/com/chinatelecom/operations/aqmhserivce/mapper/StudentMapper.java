package com.chinatelecom.operations.aqmhserivce.mapper;

import com.chinatelecom.operations.aqmhserivce.entity.AccountInfor;
import com.chinatelecom.operations.aqmhserivce.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YangXu
 * @since 2023-04-07
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getStudentAndEmpeeByAreas(String area);
}
