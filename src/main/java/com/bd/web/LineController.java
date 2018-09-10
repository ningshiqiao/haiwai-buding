package com.bd.web;

import com.bd.Global;
import com.bd.anon.AopLog;
import com.bd.helper.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * 监控功能
 */
@RestController
@RequestMapping(value = "/v1/line")
//@Api(tags = "9个人消息相关Api",description = "个人消息")
public class LineController {

    private static final Logger logger = LoggerFactory.getLogger(LineController.class);

//    @Resource
//    private LineService lineService;
//
//    @AopLog
//    @RequestMapping(value = "/callback", method = RequestMethod.POST)
//    @ApiOperation(value = "list个人消息分页消息", notes = "list个人消息分页消息")
//    @ApiImplicitParam(name = "messageQueryVo", value = "messageQueryVo", required = true, dataType = "MessageQueryVo")
//    public Result callback(@RequestHeader(Global.USER_ID) Long userId,@RequestBody String accessToken)  {
//
//        lineService.getProfile(userId,accessToken);
//
//        return new Result().setData("SUCCESS");
//    }
}
