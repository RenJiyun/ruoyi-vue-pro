package cn.iocoder.yudao.module.douyin.service.agent;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import cn.iocoder.yudao.module.douyin.dal.dataobject.SeleniumAgentDO;
import lombok.extern.slf4j.Slf4j;

/**
 * @author renjiyun
 */
@Service
@Valid
@Slf4j
public class SeleniumAgentServiceImpl implements SeleniumAgentService {

    @Override
    public List<SeleniumAgentDO> getAgentList() {
        return new ArrayList<>();
    }

    @Override
    public SeleniumAgentDO createAgent() {
        return new SeleniumAgentDO();
    }
}
