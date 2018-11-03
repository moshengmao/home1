package com.example.lenovo.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button Btn0;
    private Button Btn1;
    private Button Btn2;
    private Button Btn4;
    private Button Btn5;
    private Button Btn6;
    private Button Btn7;
    private Button Btn8;
    private Button Btn9;
    private Button BtnSign;
    private Button BtnSquare;
    private Button BtnReciprocal;
    private Button BtnCE;
    private Button BtnC;
    private Button BtnBack;
    private Button BtnDivide;
    private Button BtnMultiply;
    private Button BtnMinus;
    private Button BtnPlus;
    private Button BtnPoint;
    private Button BtnEqual;
    private Button BtnRooting;
    private TextView et_input;
    boolean clear_flag;
    private Button Btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Btn0 = (Button) findViewById(R.id.Btn0);
        Btn1=(Button) findViewById(R.id.Btn1);
        Btn2=(Button)findViewById(R.id.Btn2);
        Btn3 = (Button) findViewById(R.id.Btn3);
        Btn4=(Button)findViewById(R.id.Btn4);
        Btn5=(Button)findViewById(R.id.Btn5);
        Btn6=(Button)findViewById(R.id.Btn6);
        Btn7=(Button)findViewById(R.id.Btn7);
        Btn8=(Button)findViewById(R.id.Btn8);
        Btn9=(Button)findViewById(R.id.Btn9);
        BtnSign=(Button)findViewById(R.id.BtnSign);
        BtnSquare=(Button)findViewById(R.id.BtnSquare);
        BtnReciprocal=(Button)findViewById(R.id.BtnReciprocal);
        BtnCE=(Button)findViewById(R.id.BtnCE);
        BtnC=(Button)findViewById(R.id.BtnC);
        BtnBack=(Button)findViewById(R.id.BtnBack);
        BtnDivide=(Button)findViewById(R.id.BtnDivide);
        BtnMultiply=(Button)findViewById(R.id.BtnMultiply);
        BtnMinus=(Button)findViewById(R.id.BtnMinus);
        BtnPlus=(Button)findViewById(R.id.BtnPlus);
        BtnPoint=(Button)findViewById(R.id.BtnPoint);
        BtnEqual=(Button)findViewById(R.id.BtnEqual);
        BtnRooting = (Button) findViewById(R.id.BtnRooting);
        et_input = (TextView) findViewById(R.id.textView);
        Btn0.setOnClickListener(this);
        Btn1.setOnClickListener(this);
        Btn2.setOnClickListener(this);
        Btn3.setOnClickListener(this);
        Btn4.setOnClickListener(this);
        Btn5.setOnClickListener(this);
        Btn6.setOnClickListener(this);
        Btn7.setOnClickListener(this);
        Btn8.setOnClickListener(this);
        Btn9.setOnClickListener(this);
        BtnSign.setOnClickListener(this);
        BtnSquare.setOnClickListener(this);
        BtnReciprocal.setOnClickListener(this);
        BtnCE.setOnClickListener(this);
        BtnC.setOnClickListener(this);
        BtnBack.setOnClickListener(this);
        BtnDivide.setOnClickListener(this);
        BtnMultiply.setOnClickListener(this);
        BtnMinus.setOnClickListener(this);
        BtnPlus.setOnClickListener(this);
        BtnPoint.setOnClickListener(this);
        BtnEqual.setOnClickListener(this);
        BtnRooting.setOnClickListener(this);
    }
    @SuppressLint({"Assert", "SetTextI18n"})
    @Override
    public void onClick(View v) {
            //assert false;
            String str;
        String result1 = null;
            str = et_input.getText().toString();
        switch (v.getId()){
            case R.id.Btn0:
            case R.id.Btn1:
            case R.id.Btn2:
            case R.id.Btn3:
            case R.id.Btn4:
            case R.id.Btn5:
            case R.id.Btn6:
            case R.id.Btn7:
            case R.id.Btn8:
            case R.id.Btn9:
                    int count;
                    count=str.length();
                    if(str.contains("0")&&count==1){
                    et_input.setText(((Button)v).getText());
                    }
                    else{
                        if(clear_flag){
                        clear_flag=false;
                        et_input.setText("");
                    }
                    et_input.setText(str+((Button)v).getText());}
                    break;
            case R.id.BtnPoint:
                    if (!Objects.equals(str, ".")) {
                    if (clear_flag) {
                        clear_flag = false;
                        et_input.setText("");
                    }
                    et_input.setText(str + ((Button) v).getText());
                }else{break;}
                    break;
            case R.id.BtnPlus:
            case R.id.BtnMinus:
            case R.id.BtnMultiply:
                if (str!=null&&!str.equals("")) {
                    clear_flag = false;
                    str = "";
                    et_input.setText("");
                    et_input.setText(str + "" + "");
                }break;
            case R.id.BtnDivide:
                if (str!=null&&!str.equals("")) {
                    int count1=str.length();
                    if(str.contains("0")&&count1==1){
                        str="0";
                }else {
                    clear_flag = false;
                    str = "";
                    et_input.setText("");
                }
                    et_input.setText(str + "" + "");
                }break;
            case R.id.BtnSquare:
                    if(clear_flag){
                        clear_flag=false;
                        et_input.setText("");
                    }
                    et_input.setText("");
                    break;
            case R.id.BtnReciprocal:
                    if(str.contains("0")){
                        if(clear_flag){
                        clear_flag=false;
                    et_input.setText("输入无意义");
                }}
                else {
                        et_input.setText(str + "");
                    }break;
            case R.id.BtnRooting:
                if(clear_flag){
                    clear_flag=false;
                    str="";
                    et_input.setText("");
                }
                et_input.setText(str+"");
                break;
            case R.id.BtnSign:
                if(clear_flag){
                    clear_flag=false;
                    str="";
                    et_input.setText("");
                }
                et_input.setText(str+"");
                break;
            case R.id.BtnCE:
                    clear_flag =false ;
                    et_input.setText("");
                    str="0";
                    et_input.setText(str+"");
                    break;
            case R.id.BtnBack:
                    if (clear_flag) {
                        clear_flag =false ;
                        et_input.setText("");
                    }else if (str!=null&&!str.equals("")){
                        et_input.setText(str.substring(0,str.length()-1));
                    }
                    break;
            case R.id.BtnC:
                    clear_flag =false ;
                    et_input.setText("");
                    str="0";
                    et_input.setText(str);
                break;
            case R.id.BtnEqual:
                    getResult(result1);
                    et_input.setText(getResult(result1));
                    break ;
            default:
                        break;
        }
    }
    /* 单独的调用运算结果 * * * */
    private String getResult(String exp1){
        String exp = et_input.getText().toString();
        double result=0;
        String result1=Double.toString(result);
        exp=result1;
        exp1=exp;
        String s1 = exp.substring(0,exp.indexOf(" ")); //运算符前面的字符串
        String op = exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2) ;
        String s2 = exp.substring(exp.indexOf(" ")+3) ;
        double d1 = Double.parseDouble(s1) ;
        double d2 = Double.parseDouble(s2) ;
        if (exp == null||exp.equals("")){
            return exp1;
        }
        if (exp.equals("")){
            return result1;
        }
        if(!exp.contains(" ")) {
            return exp1;
        }
        if (clear_flag){
            clear_flag = false ;
            return exp1;
        }
        clear_flag = true ;
        if (!s1.equals(" ")&&!s2.equals(" ")){
            switch (op) {
                case "+":
                    result = d1 + d2;
                    result1=Double.toString(result);
                    System.out.println(result1);
                    break;
                case "-":
                    result = d1 - d2;
                    result1=Double.toString(result);
                    break;
                case "×":
                    result = d1 * d2;
                    result1=Double.toString(result);
                    break;
                case "±":
                    result = -1 * d1;
                    result1=Double.toString(result);
                    break;
                case "1/x":
                    if (d1 == 0) {
                    return exp1;
                    }
                    else {
                        result = 1 / d1;
                        result1 = Double.toString(result);
                    }break;
                case "x²":
                    result = d1 * d1;
                    break;
                case "√":
                    result = sqrt(d1);
                    break;
                case "CE":
                case "C":
                    result = 0;
                    break;
                case "←":
                    String s3 = exp.substring(0,exp.indexOf(" ")-1);
                    double d3 = Double.parseDouble(s3) ;
                    result=d3;
                    result1=Double.toString(result);
                    break;
                case "/": {
                    if (d2 == 0) {
                        System.out.print("输入有误");
                    } else {
                        result = d1 / d2;
                    }
                    result1=Double.toString(result);
                    break;
                }
            }
        return exp1;}
        if (s1.contains(".") && s2.contains(".")) {
            int r;
            r = (int)result;
            et_input.setText(r + "");
        } else {
            et_input.setText(result + "");
        }
        if (!s1.equals("") && s2.equals("")) {
            et_input.setText(exp);
        }
        if (s1.equals("")&&!s2.equals(""))
        {
            switch (op) {
                case"+":
                    result=0;
                       break;
                        case "-":
                            result = 0 - d1;
                            break;
                        case "×":
                            result = 0;
                            break;
                        case "/":
                            result = 0;
                            break;
                    }
                }
            if (s2.contains(".")) {
                    int r = (int) result;
                   et_input.setText(r+"");
    }else {et_input.setText(result+"");
            }
        return exp1;}
}
