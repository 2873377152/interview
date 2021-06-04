package com.tz;

import javax.swing.*;
import java.awt.*;

/**
 * @author ：TianZhuang
 * @PackageName：com.tz
 * @className ：demo
 * @date ：Created 2021/5/28 10:42
 * @description：四则运算器
 */
public class demo extends JFrame {
    demo(){
        super("简易计算器");
        Font f=new Font("黑体",30,30);
        JTextField jt1=new JTextField(null);
        JTextField jt2=new JTextField(null);
        jt1.setFont(f);
        jt2.setFont(f);
        jt1.setHorizontalAlignment(JTextField.RIGHT);
        jt2.setHorizontalAlignment(JTextField.RIGHT);
        Container c=getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
        c.add(jt1);
        c.add(jt2);
        jt1.setPreferredSize(new Dimension(370,70));
        jt2.setPreferredSize(new Dimension(370,75));
        jt1.setEditable(false);
        jt2.setEditable(false);
        JButton jb[]=new JButton[16];
        for(int j=0;j<16;j++){
            jb[j]=new JButton();
            jb[j].setBackground(Color.WHITE);
            jb[j].setFocusable(false);
            jb[j].setPreferredSize(new Dimension(90,90));
            jb[j].setFont(f);
            c.add(jb[j]);
        }

    }


}
