package cn.iocoder.yudao.module.douyin.controller.admin.agent;

import cn.iocoder.yudao.module.douyin.service.agent.SeleniumAgentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import javax.annotation.Resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import cn.iocoder.yudao.module.douyin.controller.admin.agent.vo.SeleniumAgentRespVO;
import cn.iocoder.yudao.module.douyin.convert.agent.SeleniumAgentConvert;
import cn.iocoder.yudao.module.douyin.dal.dataobject.SeleniumAgentDO;



@Tag(name = "管理后台 - 抖音代理")
@RestController
@RequestMapping("/douyin/agent")
@Validated
public class SeleniumAgentController {

    @Resource
    private SeleniumAgentService seleniumAgentService;

    @GetMapping("/list")
    @Operation(summary = "获得代理列表")
    @PreAuthorize("@ss.hasPermission('douyin:agent:query')")
    public CommonResult<List<SeleniumAgentRespVO>> list() {
        List<SeleniumAgentDO> list = seleniumAgentService.getAgentList();
        return success(SeleniumAgentConvert.INSTANCE.convertList(list));
    }


    @PostMapping("/create")
    @Operation(summary = "创建代理")
    @PreAuthorize("@ss.hasPermission('douyin:agent:create')")
    public CommonResult<SeleniumAgentRespVO> createAgent() {
        SeleniumAgentDO seleniumAgentDO = seleniumAgentService.createAgent();
        return success(SeleniumAgentConvert.INSTANCE.convert(seleniumAgentDO));
    }
}
