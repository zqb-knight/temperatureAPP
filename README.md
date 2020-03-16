## 一. 实验环境

1. Android studio 3.6.1
2. JDK 8
3. Gradle 5.6.4
4. Mac OS 10.15
5. 测试设备：小米6（真机），Pixel 3a（虚拟机）

## 二. 使用控件

- TextView
- Button
- ImageView
- EditText
- CheckBox
- SeekBar

## 三. 实现功能

1. 文字输入，显示
2. 将摄氏度转化为华氏度
3. 图片显示
4. Button监听,实现转换
5. CheckBox监听，实现字体颜色变化
6. SeekBar监听，实时显示进度
7. 使用ADB进行调试，并使用Log输出日志文件
8. 使用Git+Github进行版本控制

## 四. 代码分析

### 4.1 Button监听&&温度转换

```java
btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextC = findViewById (R.id.temperatureC);
                String s = editTextC.getText().toString();
                int T_c = Integer.parseInt(s);
                double T_f = T_c * 1.8 +32;
                String res = String.valueOf(T_f);
                TextView resT = findViewById (R.id.textViewRes);
                resT.setText(res);
                Log.d("button", "onButtonChanged: 开始转换");
            }
        });
```

### 4.2 CheckBox监听&&字体颜色转换

```java
cB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    TextView textc = findViewById (R.id.textC);
                    TextView texth = findViewById (R.id.textH);
                    textc.setTextColor(Color.parseColor("#ff5e9cff"));//设置颜色
                    texth.setTextColor(Color.parseColor("#ff5e9cff"));//设置颜色
                    Log.d("checkbox", "onCheckedChanged: 字体变换为蓝色");

                }else{
                    TextView textc = findViewById (R.id.textC);
                    TextView texth = findViewById (R.id.textH);
                    textc.setTextColor(Color.parseColor("#272727"));//设置颜色
                    texth.setTextColor(Color.parseColor("#272727"));//设置颜色
                    Log.d("checkbox", "onCheckedChanged: 字体变换为黑色");
                }
            }});
```

### 4.3 seekBar监听&&显示进度

```Java
sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                //textView8
                Log.d("seekbar", "onProgressChanged: 进度条改变");
                TextView textV = findViewById (R.id.textView8);
                textV.setText("当前进度条是" + progress + "/100");

            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
```

## 五. 调试过程

### 5.1 程序运行界面

