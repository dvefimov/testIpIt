package com.springapp.mvc;

import com.springapp.data.HibMock;
import com.springapp.data.LoginInfo;
import com.springapp.exceptionPac.LoginNotFound;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Page3Controller {
    private Log log = LogFactory.getLog(Page1Controller.class);
    HibMock hibMock = HibMock.getHibMock();

    @RequestMapping(value = "/page3/{id}", method = RequestMethod.GET)
    public String getPage3Start(ModelMap model, @PathVariable("id") long id) throws LoginNotFound {
        log.debug("Continue login - page3. id:'" + id + "'.");
        LoginInfo info = hibMock.get(id);
        model.addAttribute("infoPage3", info);
        return "page3";
    }
}
