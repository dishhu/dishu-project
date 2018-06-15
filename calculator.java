
import java.awt.*;
import java.awt.event.*;
public class calculator extends Frame implements ActionListener,TextListener
{
int num1=0,num2=0;

Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b13,b14,b15,b16,b17;
TextField ta;
Font f,f1;
FlowLayout g;
Label l,l1;
     public static boolean add=false;
     public static boolean sub=false;
     public static boolean mul=false;
     public static boolean div=false;
     public static boolean mod=false;
     public static boolean cf=true;

     public int sum=0;
     public int sub1=0;
     public int mul1=0;
     public int div1=0;
     public int mod1=0;

        public calculator(String a)
        {
        super(a);
        setBackground(Color.BLACK);
        g=new FlowLayout();
        setLayout(g);
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("ALGERIAN",Font.ITALIC,15);
        ta=new TextField("0",23);
        ta.setFont(f);
        ta.setEditable(false);
        ta.setBackground(Color.cyan);
        l=new Label(" Shams");
        l.setFont(f1);
        l.setForeground(Color.yellow);
        l1=new Label("All Rights Reserve By");
        l1.setForeground(Color.red);
  b1=new Button("1");
  b2=new Button("2");
  b3=new Button("3");
  b4=new Button("4");
  b5=new Button("5");
  b6=new Button("6");
  b7=new Button("7");
  b8=new Button("8");
  b9=new Button("9" );
  b0=new Button("0");
  b11=new Button("+");
  b12=new Button("-");
  b13=new Button("*");
  b14=new Button("/");
  b15=new Button("%");
  b16=new Button("=");
  b17=new Button("c");
  b1.setFont(f);
  b2.setFont(f);
  b3.setFont(f);
  b4.setFont(f);
  b5.setFont(f);
  b6.setFont(f);
  b7.setFont(f);
  b8.setFont(f);
  b9.setFont(f);
  b0.setFont(f);
  b11.setFont(f);
  b12.setFont(f);
  b13.setFont(f);
  b14.setFont(f);
  b15.setFont(f);
  b16.setFont(f);
  b17.setFont(f);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);

        ta.addTextListener(this);
       
  add(ta);
  add(b1);
  add(b2);
  add(b3);
  add(b4);
  add(b5);
  add(b6);
  add(b7);
  add(b8);
  add(b9);
  add(b0);
  add(b11);
  add(b12);
  add(b13);
  add(b14);
  add(b15);
  add(b16);
  add(b17);
  add(l1);
  add(l);
        setVisible(true);
        setSize(300,200);

        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we)
        {
        System.exit(0);
        }
        });
        }

public void textValueChanged(TextEvent a)
{
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
if(cf==true)
{
ta.setText("1");
}
else
{
ta.setText(ta.getText()+"1");
}
cf=false;
}

if(ae.getSource()==b2)
{
if(cf==true)
{
ta.setText("2");
}
else
{
ta.setText(ta.getText()+"2");
}
cf=false;
}

if(ae.getSource()==b3)
{
if(cf==true)
{
ta.setText("3");
}
else
{
ta.setText(ta.getText()+"3");
}
cf=false;
}

if(ae.getSource()==b4)
{
if(cf==true)
{
ta.setText("4");
}
else
{
ta.setText(ta.getText()+"4");
}
cf=false;
}

if(ae.getSource()==b5)
{
if(cf==true)
{
ta.setText("5");
}
else
{
ta.setText(ta.getText()+"5");
}
cf=false;
}


if(ae.getSource()==b6)
{
if(cf==true)
{
ta.setText("6");
}
else
{
ta.setText(ta.getText()+"6");
}
cf=false;
}


if(ae.getSource()==b7)
{
if(cf==true)
{
ta.setText("7");
}
else
{
ta.setText(ta.getText()+"7");
}
cf=false;
}


if(ae.getSource()==b8)
{
if(cf==true)
{
ta.setText("8");
}
else
{
ta.setText(ta.getText()+"8");
}
cf=false;
}

if(ae.getSource()==b9)
{
if(cf==true)
{
ta.setText("9");
}
else
{
ta.setText(ta.getText()+"9");
}
cf=false;
}

if(ae.getSource()==b0)
{
if(cf==true)
{
ta.setText("0");
}
else
{
ta.setText(ta.getText()+"0");
}
cf=false;
}

if(ae.getSource()==b11)
{
num1=Integer.parseInt(ta.getText());
System.out.println(num1);
ta.setText("+");
cf=true;
add=true;
}

if(ae.getSource()==b16)
{
num2=Integer.parseInt(ta.getText());
System.out.println(num2);

if(add==true)
{
sum=num1+num2;
ta.setText(Integer.toString(sum));
add=false;
}

if(sub==true)
{
sub1=num1-num2;
ta.setText(Integer.toString(sub1));
sub=false;
}

if(mul==true)
{
mul1=num1*num2;
ta.setText(Integer.toString(mul1));
mul=false;
}

if(div==true)
{
  if(num1<num2 && num1!=0)
   {
   ta.setText("ERROR");
   }
  else if(num2==0)
   {
   ta.setText("INFINITE ");
   }
   else
   {
   div1=num1/num2;
   ta.setText(Integer.toString(div1));
   }
div=false;
}

if(mod==true)
{
if(num1<num2)
{
ta.setText("ERROR");
}
else
{
mod1=num1%num2;
ta.setText(Integer.toString(mod1));
mod=false;
}
}
}



if(ae.getSource()==b12)
{
num1=Integer.parseInt(ta.getText());
ta.setText("-");
cf=true;
sub=true;
}


if(ae.getSource()==b13)
{
num1=Integer.parseInt(ta.getText());
ta.setText("*");
cf=true;
mul=true;
}

if(ae.getSource()==b14)
{
num1=Integer.parseInt(ta.getText());
ta.setText("/");
cf=true;
div=true;
}

if(ae.getSource()==b15)
{
num1=Integer.parseInt(ta.getText());
ta.setText("%");
cf=true;
mod=true;
}


if(ae.getSource()==b17)
{
num1=0;
num2=0;
ta.setText("0");
}
}

public static void main(String args[])
{
new calculator("calculator");
}                 
}
