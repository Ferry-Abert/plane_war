package com.bjsxt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame_practice extends Frame {
    //初始化窗口
    public void launchFrame(){
        this.setTitle("飞机大战--java小练习");
        this.setVisible(true);//窗口默认不可见，需要让他可见
        this.setSize(500,500);//窗口的大小
        this.setLocation(300,300);//窗口的位置

        //增加关闭窗口的功能
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Color old=g.getColor();
        g.setColor(Color.BLUE);
        //g.setColor(new Color(0,0,255));

        //g就是一支画笔
        g.drawLine(100,50,300,300);
        g.drawRect(100,50,300,300);
        g.drawOval(100,50,300,300);
        g.drawString("SXT",100,100);

        g.setColor(old);
    }

    public static void main(String[] args) {
        MyGameFrame_practice frame=new MyGameFrame_practice();
        frame.launchFrame();

    }

}
