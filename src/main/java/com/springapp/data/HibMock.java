package com.springapp.data;

import com.springapp.exceptionPac.LoginNotFound;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: техно сити
 * Date: 14.11.14
 * Time: 18:12
 * To change this template use File | Settings | File Templates.
 */
public class HibMock {
    private Log log = LogFactory.getLog(HibMock.class);
    private List<LoginInfo> logins = new ArrayList<LoginInfo>();
    private static HibMock singleton;

    private HibMock() {
    }

    public static HibMock getHibMock() {
        if(singleton == null){
            singleton = new HibMock();
//            log.debug("Create new hib mock list.");
        }
        return singleton;
    }

    public long getNextId(){
        log.debug("Ask new id.");
        return (logins.size());
    }

    public void add(LoginInfo info){
        log.debug("Add info to hib mock list.");
        logins.add(info);
    }

    public LoginInfo get(Long id) throws LoginNotFound{
        if(id<0 || id> logins.size()-1){
            log.error("Could not get login info with id:'"+id+"'.");
            throw new LoginNotFound("Could not get login info with id:'"+id+"'.");
        }
        return logins.get(id.intValue());
    }
}
