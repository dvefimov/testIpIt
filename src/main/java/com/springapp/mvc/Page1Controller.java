package com.springapp.mvc;

import com.springapp.data.HibMock;
import com.springapp.data.LoginInfo;
import com.springapp.exceptionPac.LoginNotFound;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Page1Controller {
    private Log log = LogFactory.getLog(Page1Controller.class);
    HibMock hibMock = HibMock.getHibMock();

    @RequestMapping(value = "/page1", method = RequestMethod.GET)
    public String getPage1Start(ModelMap model) {
        log.debug("Start get login page1, with new.");
        LoginInfo info = new LoginInfo();
        model.addAttribute("infoPage1", info);
        return "page1";
    }

// create, go step 2
    @RequestMapping(value = "/page1", method = RequestMethod.POST)
    public String addNoodleOrder(@ModelAttribute("infoPage1") LoginInfo info, ModelMap model){
        log.debug("Create(post) login page1.");
        model.addAttribute("infoPage1", info);   //?
        //todo validate info
//        service.create(info);
        long nextId = hibMock.getNextId();
        info.setId(nextId);
        hibMock.add(info);
//        model.asMap().clear();
        return "redirect:page2/"+nextId;
    }

    @RequestMapping(value = "/page1/{id}", method = RequestMethod.GET)
	public String getPage1(@PathVariable("id") long id, ModelMap model) throws LoginNotFound {
        log.debug("Start get login page1 , with '" + id + "'.");
        LoginInfo info = hibMock.get(id);
        model.addAttribute("infoPage1", info);
		return "page1";
	}

/*
SEVERE: Servlet.service() for servlet [mvc-dispatcher] in context with path [] threw exception [Request processing failed; nested exception is org.springframework.web.bind.annotation.support.HandlerMethodInvocationException: Failed to invoke handler method [public java.lang.String com.springapp.mvc.Page1Controller.getPage1(int,org.springframework.ui.ModelMap)]; nested exception is java.lang.IllegalStateException: Could not find @PathVariable [id] in @RequestMapping] with root cause
java.lang.IllegalStateException: Could not find @PathVariable [id] in @RequestMapping

http://stackoverflow.com/questions/5493767/can-pathvariable-return-null-if-its-not-found
http://stackoverflow.com/questions/5749023/in-a-spring-controller-can-i-have-a-method-called-based-on-the-number-of-reques
*/

    @RequestMapping(value = "/page1", method = RequestMethod.PUT)
    public String updatePage1(@ModelAttribute("infoPage1") LoginInfo info, ModelMap model)
            throws LoginNotFound {
        log.debug("Start update login page1.");
        model.addAttribute("message", "Hello world!");
        return "page1";
    }

}