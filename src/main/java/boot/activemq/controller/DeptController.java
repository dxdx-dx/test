package boot.activemq.controller;

import boot.activemq.service.IDeptService;
import boot.activemq.util.controller.AbstractBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController extends AbstractBaseController {
    @Resource
    private IDeptService deptService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object list() { // 通过model可以实现内容的传递
        return this.deptService.list();
    }
}
