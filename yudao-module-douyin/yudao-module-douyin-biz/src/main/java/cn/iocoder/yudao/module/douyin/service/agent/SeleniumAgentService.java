package cn.iocoder.yudao.module.douyin.service.agent;

import java.util.List;

import cn.iocoder.yudao.module.douyin.dal.dataobject.SeleniumAgentDO;

/**
 * @author renjiyun
 */
public interface SeleniumAgentService {

    /**
     * 获取代理列表
     * 
     * @return
     */
    List<SeleniumAgentDO> getAgentList();

    /**
     * 创建代理
     * 
     * @return
     */
    SeleniumAgentDO createAgent();

}
