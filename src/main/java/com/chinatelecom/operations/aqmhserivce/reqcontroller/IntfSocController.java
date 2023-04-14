package com.chinatelecom.operations.aqmhserivce.reqcontroller;

import com.chinatelecom.operations.aqmhserivce.entity.Student;
import com.chinatelecom.operations.aqmhserivce.service.IStudentService;
import com.chinatelecom.operations.aqmhserivce.utils.JsonResult;
import com.chinatelecom.udp.core.datarouter.IDataResponse;
import com.chinatelecom.udp.core.datarouter.IWorkService;
import com.chinatelecom.udp.core.datarouter.ServiceMethodInfo;
import com.chinatelecom.udp.core.datarouter.response.JsonResponse;
import com.chinatelecom.udp.core.lang.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.Date;

import static com.chinatelecom.operations.aqmhserivce.utils.JsonResult.TRUE;


@Component
public class IntfSocController implements IWorkService {

    @Autowired
    private IStudentService iStudentService;

    /**
     *添加
     * @return IDataResponse
     */
    @ServiceMethodInfo(authentincation = false)
    public IDataResponse addStudent() {
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            student.setArea("杭州"+i);
            student.setScore(new BigDecimal(200+i*10));
            student.setBirthday(new Date());
            student.setName("name"+i);
            iStudentService.save(student);
        }

        return new JsonResponse(new JsonResult("添加成功"));
    }



    @Override
    public String getCode() {
        return "intfSocController";
    }

    @Override
    public String getName() {
        return "定级系统2";
    }
}
