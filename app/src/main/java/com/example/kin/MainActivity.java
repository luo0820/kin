package com.example.kin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zhangfu,qizi,fuqin,muqin,gege,didi,jiejie,meimei,erzi,nver,delete,clear,help,exit;
    TextView t1,t2;
    String str1="我",str2="",strs="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chaim();

    }

    private void chaim() {
        zhangfu=findViewById(R.id.lao_gong);
        qizi=findViewById(R.id.lao_po);
        fuqin=findViewById(R.id.fu_qin);
        muqin=findViewById(R.id.mu_qin);
        gege=findViewById(R.id.ge_ge);
        didi=findViewById(R.id.di_di);
        jiejie=findViewById(R.id.jie_jie);
        meimei=findViewById(R.id.mei_mei);
        erzi=findViewById(R.id.er_zi);
        nver=findViewById(R.id.nv_er);
        delete=findViewById(R.id.tui_ge);
        clear=findViewById(R.id.clear);
        help=findViewById(R.id.help);
        exit=findViewById(R.id.exit);
        t1=findViewById(R.id.kin_t1);
        t2=findViewById(R.id.kin_t2);


        zhangfu.setOnClickListener(this::onclick);
        qizi.setOnClickListener(this::onclick);
        fuqin.setOnClickListener(this::onclick);
        muqin.setOnClickListener(this::onclick);
        gege.setOnClickListener(this::onclick);
        didi.setOnClickListener(this::onclick);
        jiejie.setOnClickListener(this::onclick);
        meimei.setOnClickListener(this::onclick);
        erzi.setOnClickListener(this::onclick);
        nver.setOnClickListener(this::onclick);
        delete.setOnClickListener(this::onclick);
        clear.setOnClickListener(this::onclick);
        help.setOnClickListener(this::onclick);
        exit.setOnClickListener(this::onclick);

    }

    private void onclick(View view) {
        switch (view.getId()){
            case R.id.lao_gong://z
                strs+="z";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.lao_po://q
                strs+="q";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.fu_qin://f
                strs+="f";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.mu_qin://m
                strs+="m";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.ge_ge://g
                strs+="g";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.di_di://d
                strs+="d";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.jie_jie://j
                strs+="j";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.mei_mei://s
                strs+="s";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.er_zi://e
                strs+="e";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.nv_er://n
                strs+="n";
                str1+="的"+((Button)view).getText();
                t1.setText(str1);
                panduan(strs);
                break;
            case R.id.tui_ge:
                tuige();
                break;
            case R.id.clear:
                break;
            case R.id.help:
                break;
            case R.id.exit:
                break;

        }
    }

    private void tuige() {
        str1=str1.substring(0,str1.length()-3);
        strs=strs.substring(0,strs.length()-1);
        panduan(strs);
        t1.setText(str1);
    }

    private void panduan(String strs) {
      switch (strs){
          case "z":
          case "zef":
          case "znf":
              str2="老公";
              break;
          case "q":
              str2="老婆";
              break;
          case "f":
              str2="爸爸";
              break;
          case "m":
              str2="妈妈";
              break;
          case "g":
              str2="哥哥";
              break;
          case "d":
              str2="弟弟";
              break;
          case "j":
              str2="姐姐";
              break;
          case "s":
              str2="妹妹";
              break;
          case "e":
          case "ze":
          case "qe":
          case "zeg":
          case "zed":
          case "znd":
          case "zng":
              str2="儿子";
              break;
          case "n":
          case "qn":
          case "zn":
          case "zej":
          case "zes":
          case "znj":
          case "zns":
              str2="女儿";
              break;
          case "zq":
          case "zem":
          case "znm":
          case "qz":
              str2="我";
              break;
          case "zf":
          case "zgf":
          case "zdf":
          case "zjf":
          case "zsf":
              str2="公公";
              break;
          case "zm":
          case "zgm":
          case "zdm":
          case "zjm":
          case "zsm":
              str2="婆婆";
              break;
          case "zg":
          case "zgg":
          case "zjg":
              str2="大伯子";
              break;
          case "zd":
          case "zdd":
          case "zjd":
              str2="小叔子";
              break;
          case "zj":
          case "zgj":
          case "zjj":
              str2="大姑子";
              break;
          case "zs":
          case "zss":
              str2="小姑子";
              break;
          case "zff":
          case "zgff":
              str2="祖翁";
              break;
          case "zfm":
          case "zgfm":
              str2="祖婆";
              break;
          case "zfg":
          case "zgfg":
              str2="伯翁";
              break;
          case "zfd":
          case "zgfd":
              str2="叔公";
              break;
          case "zfj":
          case "zfs":
          case "zgfj":
          case "zgfs":
          case "zffn":
              str2="姑婆";
              break;
          case "zfe":
          case "zgfe":
          case "zgd":
          case "zdg":
              str2="大伯子/老公/小叔子";
              break;
          case "zfn":
          case "zgfn":
          case "zgs":
          case "zds":
          case "zdj":
              str2="大姑子/小姑子";
              break;
          case "zfff":
              str2="太公翁";
              break;
          case "zffm":
              str2="太奶亲";
              break;
          case "zffd":
              str2="叔祖翁";
              break;
          case "zffg":
              str2="伯祖翁";
              break;
          case "zffj":
          case "zffs":
              str2="祖姑母";
              break;
          case "zffe":
              str2="叔公/伯翁/公公";
              break;
          case "zmf":
              str2="外公";
              break;
          case "zmm":
              str2="外婆";
              break;
          case "zmg":
          case "zmd":
          case "zmfe":
          case "zmme":
              str2="舅公";
              break;
          case "zmj":
          case "zms":
              str2="姨婆";
              break;
          case "zme":
              str2="大伯子/老公/小叔子";
              break;
          case "zmn":
              str2="大姑子/小姑子";
              break;
          case "zmff":
              str2="外曾祖父";
              break;
          case "zmfm":
              str2="外曾祖母";
              break;
          case "zmfg":
              str2="伯外祖父";
              break;
          case "zmfd":
              str2="叔外祖父";
              break;
          case "zmfj":
          case "zmfs":
              str2="姑外祖母";
              break;
          case "zmfn":
          case "zmmn":
              str2="姨婆/婆婆";
              break;
          case "zmmf":
              str2="外曾外祖父";
              break;
          case "zmmm":
              str2="外曾外祖母";
              break;
          case "zmmg":
          case "zmmd":
              str2="外舅公";
              break;
          case "zmmj":
          case "zmms":
              str2="姨外祖母";
              break;
          case "zge":
          case "zde":
              str2="婆家侄";
              break;
          case "zgn":
          case "zdn":
              str2="侄女";
              break;
          case "zje":
          case "zse":
              str2="婆家甥";
              break;
          case "zjn":
          case "zsn":
              str2="外甥女";
              break;
          case "zjz":
              str2="大姑父";
              break;
          case "zeq":
              str2="儿媳妇";
              break;
         case "zgq":
              str2="大婶子";
              break;
         case "zsz":
              str2="小姑父";
              break;
         case "zee":
              str2="孙子";
              break;
         case "zen":
              str2="孙女";
              break;
         case "znz":
              str2="女婿";
              break;
         case "zne":
              str2="外孙";
              break;
         case "znn":
              str2="外孙女";
              break;
         case "zdq":
              str2="小婶子";
              break;
         case "qf":
         case "qmz":
         case "qgf":
         case "qdf":
         case "qjf":
         case "qsf":
              str2="岳父";
              break;
         case "qm":
         case "qgm":
         case "qdm":
         case "qfq":
         case "qjm":
         case "qsm":
              str2="岳母";
              break;
         case "qg":
         case "qgg":
         case "qjg":
              str2="大舅子";
              break;
         case "qd":
              str2="小舅子";
              break;
         case "qj":
         case "qgj":
         case "qjj":
              str2="大姨子";
              break;
         case "qs":
         case "qds":
              str2="小姨子";
              break;
         case "qff":
              str2="太岳父";
              break;
         case "qmf":
              str2="外太岳父";
              break;
         case "qfm":
              str2="太岳母";
              break;
         case "qmm":
              str2="外太岳母";
              break;
         case "qfg":
              str2="伯岳";
              break;
         case "qfd":
              str2="叔岳";
              break;
         case "qfj":
         case "qfs":
              str2="姑岳母";
              break;
         case "qfe":
         case "qme":
         case "qgd":
         case "qdg":
         case "qjd":
              str2="小舅子/大舅子";
              break;
         case "qfn":
         case "qmn":
         case "qgs":
         case "qdj":
         case "qjs":
              str2="小姨子/大姨子/老婆";
              break;
         case "qmg":
         case "qmd":
              str2="舅岳父";
              break;
         case "qmj":
         case "qms":
              str2="舅岳母";
              break;
         case "qgq":
              str2="舅嫂";
              break;
         case "qge":
         case "qde":
              str2="内侄";
              break;
         case "qgn":
         case "qdn":
              str2="内侄女";
              break;
         case "qdq":
              str2="舅弟媳";
              break;
         case "qjz":
              str2="大姨夫";
              break;
         case "qje":
              str2="内甥";
              break;
         case "qjn":
              str2="姨甥女";
              break;
         case "qsz":
              str2="小姨夫";
              break;

      }





        t2.setText(str2);
    }
}