package com.ifeanyi.environment;

import com.ifeanyi.util.Util;

import java.io.IOException;
import java.util.Map;

public class Evn {

    private static Evn evn;

    private Evn() {

    }

    public static Evn Instance() {

        if (evn == null) {
            return evn = new Evn();
        }
        return evn;

    }

    public static boolean initEvn() {

        ProcessBuilder processBuilder = new ProcessBuilder();
        Map<String, String> env = processBuilder.environment();
        env.put("GeminiKey", Util.GEMINI_KEY);
        env.put("GptKey", Util.GPT_KEY);


        try {
            Process process = processBuilder.start();
            return true;
        } catch (IOException e) {
            return false;
        }

    }

}
