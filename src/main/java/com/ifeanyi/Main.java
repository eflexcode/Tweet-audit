package com.ifeanyi;

import com.ifeanyi.environment.Evn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
//    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Evn evn = Evn.Instance();
        boolean initEvn = Evn.initEvn();

        if (!initEvn){
//            log.error("failed to load evn closing app");
            System.exit(0);
        }


    }

}