package cn.catme.boot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import javax.servlet.ServletException;

/**
 * Created by xx on 2017/1/11.
 */
public class EmbedTomcat {
    private final Log log= LogFactory.getLog(getClass());
    private Tomcat tomcat=new Tomcat();
    private int port;
    private String PROJECT_PATH=System.getProperty("user.dir");
    EmbedTomcat(int port){
        this.port=port;
        log.info("Construct PROJECT_PATH:"+PROJECT_PATH);
    }
    public void start(){
        tomcat.setBaseDir(PROJECT_PATH);
        tomcat.setPort(this.port);
        try {
            tomcat.addWebapp("",PROJECT_PATH+"/web/webapp");
            tomcat.start();
            tomcat.getServer().await();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
        log.info("tomcat started! port:"+port);

    }
    public void stop(){
        try {
            tomcat.stop();
            log.info("tomcat stopped!");
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }


}
