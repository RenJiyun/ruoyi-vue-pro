package cn.iocoder.yudao.module.douyin.convert.agent;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cn.iocoder.yudao.module.douyin.controller.admin.agent.vo.SeleniumAgentRespVO;
import cn.iocoder.yudao.module.douyin.dal.dataobject.SeleniumAgentDO;

@Mapper
public interface SeleniumAgentConvert {
    SeleniumAgentConvert INSTANCE = Mappers.getMapper(SeleniumAgentConvert.class);

    List<SeleniumAgentRespVO> convertList(List<SeleniumAgentDO> list);

    SeleniumAgentRespVO convert(SeleniumAgentDO seleniumAgentDO);
}
