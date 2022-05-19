package com.chinatelecom.operations.aqmhserivce.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.chinatelecom.operations.aqmhserivce.utils.IdGenerator;
import org.springframework.stereotype.Component;
@Component
public class CustomerIdGenerator implements IdentifierGenerator {
    @Override
    public Long nextId(Object entity) {
        // 填充自己的Id生成器，
        return IdGenerator.generateId();
    }
}