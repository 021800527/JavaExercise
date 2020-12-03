package exp2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MainFrame extends JFrame {

    Frame container;
    // 同名构造函数，直接调用的其实是JFrame()
    public MainFrame() {
        // TODO Auto-generated constructor stub
        super("网上超市购物车");
        // 这里新建了一个Frame窗口，示例代码也在新建(选项卡，但是我不需要)
        init();
    }

    void init() {
        setLocation(0, 0);
        setSize(1280, 720);
        ImageIcon bg = new ImageIcon("src/exp2/bj.jpg");
        // 把背景图片显示在一个标签里
        JLabel label = new JLabel(bg);
        // 把标签的大小位置设置为图片刚好填充整个界面
        label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        // 添加图片到第二层，即ContentPanel;
        initLoginPanel();
        // 现在部署第三层 LayPanel
        getLayeredPane().add(label);
        getLayeredPane().setVisible(true);
        validate();
        //使布局重新有效
        validate();
        repaint();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void initLoginPanel(){
        //初始化盒子布局
        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();
        Box box3 = Box.createHorizontalBox();
        Box box4 = Box.createVerticalBox();
        //  商品名称标签
        JLabel idLabel = new JLabel("商品名称");
        //  设置字体大小
        idLabel.setFont(new java.awt.Font("Dialog",1,30));
        //  设置空白域的长度
        final JTextField idTextField = new JTextField(20);
        //  商品价格标签
        JLabel priceLabel = new JLabel("价格");
        //  设置字体大小
        priceLabel.setFont(new java.awt.Font("Dialog",1,30));
        //  设置空白域的长度
        final JTextField priceTextField = new JTextField(20);
        //  商品名称标签
        JLabel numLabel = new JLabel("价格");
        //  设置字体大小
        numLabel.setFont(new java.awt.Font("Dialog",1,30));
        //  设置空白域的长度
        final JTextField numTextField = new JTextField(20);
        //  设置按钮
        JButton enterButton = new JButton("确认");
        //  设置按钮大小
        enterButton.setFont(new java.awt.Font("Dialog",1,30));
        //  制作panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,5));
        box1.add(Box.createVerticalStrut(100));
        box1.add(idLabel);
        //  用盒子模型生成空隙
        box1.add(Box.createVerticalStrut(40));
        box1.add(priceLabel);
        box1.add(Box.createVerticalStrut(40));
        box1.add(numLabel);

        box2.add(Box.createVerticalStrut(100));
        box2.add(idTextField);
        //  用盒子模型生成空隙
        box2.add(Box.createVerticalStrut(40));
        box2.add(priceTextField);
        box2.add(Box.createVerticalStrut(40));
        box2.add(numTextField);

        box3.add(box1);
        box3.add(Box.createHorizontalStrut(20));
        box3.add(box2);
        box3.add(Box.createHorizontalStrut(20));
        box4.add(box3);
        box4.add(Box.createVerticalStrut(60));
        box4.add(enterButton);

        panel.add(box4);
        add(panel);
    }
}
