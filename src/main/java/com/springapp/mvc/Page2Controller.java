package com.springapp.mvc;

import com.springapp.data.HibMock;
import com.springapp.data.LoginInfo;
import com.springapp.data.Page2Stub;
import com.springapp.exceptionPac.LoginNotFound;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Page2Controller {
    private Log log = LogFactory.getLog(Page1Controller.class);
    HibMock hibMock = HibMock.getHibMock();

    @RequestMapping(value = "/page2/{id}", method = RequestMethod.GET)
    public String getPage2Start(ModelMap model, @PathVariable("id") long id) {
        log.debug("Continue login - page2. id:'" + id + "'.");
        LoginInfo info = getLoginInfo(id);
        Page2Stub stub = new Page2Stub(info);
        model.addAttribute("page2Stub", stub);
        return "page2";
    }

    // create, go step 2
    @RequestMapping(value = "/page2", method = RequestMethod.POST)
    public String addNoodleOrder(@ModelAttribute("page2Stub") Page2Stub stub, ModelMap model){
        log.debug("Create(post) login page2.");
        Long id = stub.getId();
        LoginInfo info = getLoginInfo(id);
        info.setEmail(stub.getEmail());
        return "redirect:page3/"+ id;
    }


    private LoginInfo getLoginInfo(long id) {
        LoginInfo info = null;
        try {
            info = hibMock.get(id);
        } catch (LoginNotFound loginNotFound) {
            log.debug("Could not get info with id: '" + id + "'.");
        }
        return info;
    }
}
