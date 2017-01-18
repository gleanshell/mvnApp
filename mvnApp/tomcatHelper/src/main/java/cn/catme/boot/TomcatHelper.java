package cn.catme.boot;

import org.apache.catalina.startup.Tomcat;

/**
 * Created by xx on 2017/1/11.
 */
public class TomcatHelper {

    public static void main(String ...a){
        EmbedTomcat tomcat=new EmbedTomcat(80);
        tomcat.start();
    }
}
