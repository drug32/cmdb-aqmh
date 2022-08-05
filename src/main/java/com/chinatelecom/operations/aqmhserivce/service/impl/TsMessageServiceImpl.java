package com.chinatelecom.operations.aqmhserivce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chinatelecom.operations.aqmhserivce.entity.TsMessage;
import com.chinatelecom.operations.aqmhserivce.mapper.TsMessageMapper;
import com.chinatelecom.operations.aqmhserivce.service.TsMessageService;
import org.springframework.stereotype.Service;

/**
 * @Author: Wang
 * @Date: 2022/8/4 15:44
 * @Description:
 */
@Service
public class TsMessageServiceImpl extends ServiceImpl<TsMessageMapper, TsMessage> implements TsMessageService {
}
