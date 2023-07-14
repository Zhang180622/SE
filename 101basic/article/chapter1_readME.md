## java
### java概述
```text
SUN公司于1995年开发的一门编程语言，后被Oracle公司收购。
java语言可以开发以下类型程序：
    桌面程序
    互联网软件（擅长方向）
    安卓开发
企业级应用：
    OA：办公自动化
    CRM：客户关系管理
    ERP：企业资源规划
```

### 常用cmd
```text
win+R 输入cmd回车，可以调出cmd窗口
d:      切换盘符
cd..    返回上层目录
dir     查看当前目录下的文件信息
cls     清屏
cd\     回到根目录
```

### 开发环境搭建
```text
JDK下载：建议使用1.7及以上版本，企业内部版本一致。
JDK安装：安装路径不建议有中文字符
配置环境变量
    写死配置
    配置JAVA_HOME及path
配置classpath
```

### java跨平台原理
```text
JDK:JRE+java开发工具包
JRE:JVM+基础包
JVM:JAVA虚拟机
JDK>JRE>JVM
java语言跨平台是依赖JVM实现的，JVM不是跨平台的，不同的系统安装不同平台的JVM。
```

### HelloWorld编写
```java
//HelloWorld.java
//编写：源文件.java文件
//编译：字节码文件.class文件，给jvm虚拟机用
//运行：调用解释器，解释执行字节码文件
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}
```

### 编译及运行java程序
```cmd
code>d:\java\jdk\jre\bin\javac HelloWorld.java

code>d:\java\jdk\jre\bin\java HelloWorld
code>Hello World!
```

### 环境变量配置
```text
JAVA_HOME=d:\java\jdk\jre
path=%JAVA_HOME%\bin;
```

### 开发工具选择
```text
notepad++
ultraeditplus
vscode
idea
eclipse
```

### 注释
```text
注释是给编程人员做笔记，协助理解代码用，java虚拟机会忽略注释部分。
//单行注释

/*
多行注释
多行注释
*/

/** 用于生成java API文档
文档注释
文档注释
*/
```

### 关键字
```text
被java官方预留的，赋予了特殊含义的词汇，无需记忆，常用即可。
备注：main不是关键字，但是不能用，是java程序的程序入口。
```

### 标识符
```text
java程序中自定义的词汇都是标识符，如包名、类名、变量名、方法名等。
标识符规则：
    组成：字母a-z A-Z，数字0-9，下划线 _，美元符 $。
    注意：不能以数字开头，不能为关键字，要求见名知意。
    包名：全小写
    类名：大驼峰
    变量：
    常量：全大写，单词间用下划线分隔
    方法名：小驼峰
```

### 数据类型
```text
程序是用来处理数据的逻辑，java语言中的数据类型有两大部分：
基本数据类型
    整数: byte short int long
    小数: float double
    字符: char
    布尔: boolean
引用数据类型
    字符串
    数组
    类
    接口
```

### 常量
```text
常量就是固定不变的数据，根据java基本数据类型，分为下述四种：
整数类型常量
    十进制整数常量表示法：正常数字，如 0，-5，100 等
    二进制整数常量表示法：以0b(0B)开头，如0b1011, 0B101 等
    八进制整数常量表示法：以数字0开头，如01, 07，0721 等
    十六进制整数常量表示法：以0x(0X)开头，数字0-9及A-F组成，如0x23A2 等
浮点数类型常量
    如1.0, -3.14, 5.812 等
布尔类型常量
    true, false
字符类型常量
    以英文单引号包裹的一个字符，只能是一个字符，不能多不能少，如 'A', '家', '#' 等
字符型常量
    以英文双引号包裹的任意个数字符，0-N个字符，如 "中国", "UTF-8"
```

### 作业
```text
1、输出各种基本数据类型常量：整数四种进制、浮点数、字符、布尔、字符串；
2、整数各进制数据转换；
3、ASCII编码了解；
```

### 学习任务

```text
1、课堂纪律和学习方法 (遵守) 
    主动学习，向别人讲课； //向他人教授/对所学内容的立即运用
    遇到困难，不钻牛角尖  //很可能后面随着学习的深入，豁然开朗
2、软件和硬件
    应用软件调用系统软件，间接控制计算机
3、人机交互
    用户和程序的交流形式，常见的形式有命令行方式(Command Line Interface CLI)和图形方式(UI)
4、常用的DOS命令
    切换盘符：d:
    切换路径：cd.    cd..    cd dir_name
    清屏: cls
    查看文件信息: dir
    帮助: help
5、什么是计算机语言
    低级语言: 机器语言，计算机可以直接识别运行的语言
    汇编语言：使用一些怪异的符号来写程序,可移植性不高,与硬件的关系很密切
    高级语言：模拟人的思维方式,使用更容易理解的英文单词进行组合来编写程序,与底层交互不密切.可移植性比较高。如C C++ C# JAVA PYTHON等
6、Java语言介绍
    Java语言之父 : James Gosling 詹姆斯.高斯林
    SUN于1995年推出的一门高级编程语言，2009年4月20 SUN公司被Oracle公司以74亿美元收购
7、Java三种技术架构（解释）
    JAVASE：为开发普通桌面和商务应用程序提供的解决方案
        JavaSE是三个平台中最核心的部分.JavaEE,JavaME都是从JavaSE的基础上发展而来的.
        JavaSE平台中包括了Java最核心的类库.如,集合, IO, 数据库连接以及编程等
    JAVAEE: 为开发企业级应用程序提供的一套解决方案
        该技术体系中包含的技术如 Servlet Jsp, JavaBean, JDBC, EJB, Web Service等技术,主要针对于 Web 应用程序开发.
    JAVAME: 为开发电子消费产品和嵌入式设备提供的解决方案
        该技术体系主要应用于小型电子消费类产品.比如手机中的应用程序,现在已经被安卓取代
8、Java语言特性（跨平台原理)
    1、开源，免费的，你可以看见Java是怎样写的。
    2、跨平台性,使用Java应用开发的软件可以在任何平台上运行。
    JVM : Java Virtual Machine (Java虚拟机),是一款用来解释和执行 Java 程序的一个应用软件
    Java 程序是通过 Java 虚拟机可以达到跨平台性,但是 Java 虚拟机并不是跨平台的,
    也就是说,不同操作系统上的Java虚拟机是不同的,它的存在只是Java程序到操作系统之间的一个过渡.
9、Java开发环境搭建(JRE、JDK区别，下载、安装JDK，测试)（独立配置）
    JRE: (java runtime environment)java运行环境，包括JVM和java核心类库
    JDK： (java development kit)java开发工具包，包括JRE和java开发工具包
10、环境变量path配置（永久性配置、技巧性配置、临时性配置）
    1、path硬编码
    2、使用JAVA_HOME配置环境变量（推荐使用）
    3、临时配置（了解）
11、第一个Java程序之hello world书写（独立编写与代码解释）
    编写java源文件、编译java文件生成class字节码文件、运行class文件
    //Hello.java文件内容
    public class Hello{
        public static void main(String[] args){
            System.out.println("Hello java");
        }
    }
12、错误与bug演示 (独立分析与代码修正)
    各种错误的排查解决
13、classpath环境变量的配置 (解释和说明)
    系统寻找class文件的范围
14、编程风格 (举例)
    Allmans风格也称 “独行” 风格,即左,右大括号各自独占一行
    Kernighan风格也称 “行尾” 风格,即左大括号在上一行的行尾,而右大括号独占一行

```

