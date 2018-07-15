package com.rockstar.gta.vicecity.custom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.List;

public class AutoKeyboard {

    public void callProfessionalTools() throws InterruptedException {

        List<Integer> listKeyEvent = Arrays.asList(KeyEvent.VK_P, KeyEvent.VK_R, KeyEvent.VK_O, KeyEvent.VK_F, KeyEvent.VK_E, KeyEvent.VK_S, KeyEvent.VK_S, KeyEvent.VK_I, KeyEvent.VK_O, KeyEvent.VK_N,
            KeyEvent.VK_A, KeyEvent.VK_L, KeyEvent.VK_T, KeyEvent.VK_O, KeyEvent.VK_O, KeyEvent.VK_L, KeyEvent.VK_S);

        try {

            Robot robot = new Robot();
            for (Integer item : listKeyEvent) {
                Thread.sleep(500);
                robot.keyPress(item); // Simulating press of space bar
            }

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
