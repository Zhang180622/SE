##

### 变量
```text
变量就是计算机内存中的一个空间，可以用来存放或读取指定类型的数据，数据可以变更，特点喜新厌旧。
```

### 计算机存储单元--内存
```text
无论内存或磁盘，计算机的最小存储单元为：比特位(bit)
1byte=8bit
1kb=1024byte
```

### java数据类型
```text
基本类型之四类八种
整型|byte|1B|-128~127|
整型|short|2B|-32768~32767|
整型|int|4B|-21亿~21亿|
整型|long|8B|-2^64~2^63|
浮点型|float|4B||
浮点型|double|8B||
字符型|char|2B|一个字符|
布尔型|boolean|1B|true false|
```



### 学习任务

```text
1、Java中的关键字、标识符、符号 (解释说明并总结)
    关键字：是编程语言里事先定义好并赋予了特殊含义的单词.也称作保留字；java所有的关键字都是小写的
    标识符：程序中定义一些符号来标记一些名称,如包名,类名,方法名,参数名,变量名等.这些符号被称为标识符
        组成元素：字母、数字、下划线、美元符号
        组成规则：不能以数字开头；不能是Java关键字；
        为了增加代码的可读性,在定义标识符时还应该遵守以下规则 :
        1.	包名所有字母一律小写.例如 : cn.study.test
        2.	类名和接口名每个单词的首字母都要大写.例如 : ArrayList, Iterator
        3.	常量名所有字母都大写.单词之间用下划线连接.例如 DAY_OF_MONTH.
        4.	变量名和方法名的第一个单词首字母小写.从第二个单词开始每个单词的首字母大写.例如: lineNumber, getLineNumber
        5.	在程序中,应该尽量使用有意义的英文单词来定义标识符.使得程序便于阅读.例如使用 userName 表示用户名. password 表示密码.
    符号：Java代码中常用的符号：
       {} ：它一般是在划定程序某些代码区域（范围）。
       () ：它表示的左侧一般是一个方法名，一般用在方法上。
        ; ：英文分号在java中一句话写完，一般需要一个分号结束。
       [] ：它表示的内容是数组。
        . : 表示调用属性或方法.
2、注释的详细讲解 (说明与举例)
    注释的分类:
    1.	单行注释    // 后面的这一行内容就是注释
    2.	多行注释    /* 里面的所有内容都会被当作注释,无论多少行,多行注释是不能嵌套的. */
    3.	文档注释	   /**   */

3、Java的常量 (区分和举例说明)
    常量就是在程序中固定不变的值,是不能改变的数据
    常量根据数据类型可以分为以下几种：
    整型常量、浮点型常量、字符型常量、字符串型常量、布尔型常量、null型常量；
    
    特殊字符--反斜杠（\）
    在字符串常量中,反斜杠(\)是一个特殊的字符,被称为转义字符.它的作用是用来转义后面的一个字符.转义后的字符通常用于表示一个不可见的字符或具有特殊含义的字符.如 :
    1.	\n 表示换行符.换到下一行的开头.
    2.	\t 表示制表符.将光标移到下一个制表符的位置.就像在文档中用 Tab 键一样.
    •	以上的字符都有特殊意义.无法直接表示.所以用反斜杠加上另外一个字符来表示.
    1.	\' 表示单引号字符.Java代码中单引号表示字符的开始和结束.如果直接写单引号字符('),程序会认为前两个是一对的,会报错.因此需要使用转义符(\').
    2.	\" 表示双引号字符.Java代码中双引号表示字符串的开始和结束.包含在字符串中的上引号需要转义.比如 "he says \"Thank you\".".
    3.	\\ 表示反斜杠字符.由于在Java代码中的反斜杠(\)是转义字符,因此需要表示字面意义上的\,就需要使用双反斜杠(\\).

4、进制的转换 (独立实现并总结)
    进制：人类或者其他物种记数的一种方式, 侧重点在于记数的时候逢多少进一
    二进制：逢2进1，以0b开头
    八进制：逢8进1，以数字0开头
    十进制：逢10进1 
    十六进制：逢16进1，以0x开头
5、Java中的变量（解释说明） 小驼峰命名变量
    变量：在程序运行期间.随时可能产生一些临时数据.应用程序会将这些数据保存在一些内存单元中. CPU进行运算时,只能从内存中读取数据
    在编写程序时,每个内存单元都可以用一个标识符来标识.这些内存单元被称为变量.定义的标识符就是变量名.内存单元中存储的数据就是变量的值.
    1.	变量是内存中的一个存储区域.在内存中,每一块空间都有其独一无二的地址.
    2.	该区域有自己的名称 (变量名) 通过名称就可以找到这块内存地址. 和类型 (数据类型) 决定了开辟空间的大小.
    3.	该区域的数据可以在同一数据类型范围内不断变化.

    为什么定义变量？ 重复使用，提高内存利用率
    为什么要定义数据类型？ 合理分配内存空间，提高内存利用率
    变量的作用域？仅在一对 { } 之间有效
    变量定义格式及使用的步骤（变量使用三部曲：定义、初始化、使用）？ 数据类型 变量名 = 初始值; 
    变量的特点？ 喜新厌旧
    java是强类型语言 必须声明变量的数据类型
6、Java数据类型（应用语法与定义变量）
    内存中的单位是使用字节(byte)来表示的
    8bit=1byte, 1024byte=1kb ......
    基本数据类型：
        整型(byte 1字节,short 2字节,int 4字节,long 8字节) 各类型表达范围需了解
        浮点型(float 4字节,double 8字节) 各类型表达范围需了解
        字符型(char 2字节)
        布尔型(boolean 1字节)
    引用数据类型：类class，接口interface，字符串String，数组[] 等

7、数据类型转换（独立分析与讲解细节）
    把一种类型数据的值赋给另一种类型数据的变量时,需要进行数据类型转换.根据转换方式的不同,数据类型转换可以分为两种
    1.	自动类型转换. (隐式类型转换)
    2.	强制类型转换. (显式 / 强制类型转换)
    格式: (被转换的类型)(变量名 / 表达式);
    
    类型按照精度从低到高排列:
    byte  short  int  long  float  double
    当把级别高的变量的值赋值给级别低的变量时,需要使用强制类型转换，强制类型转换容易产生数据精度丢失
    
    表达式是指由变量和运算符组成的一个算式.变量在表达式中进行运算时,也有可能发生自动类型转换.
    这就是表达式数据类型的自动提升.如一个byte型的变量在运算期间会自动提升为int型.short类型同理.

8、算术运算符（实现需求并应用语法）
    运算符用于对数据进行算术运算,赋值和比较操作.在Java中,运算符可以分为算术运算符,赋值运算符,比较运算符,逻辑运算符和位运算符

    算术运算符
    +   -   *   /   % 
    注意: 在进行取模(%)运算时,运算结果的正负取决于被模数(%左边的数)的符号.与模数(%右边的数)的符号无关.如,(-5)%3=-2, 而5%(-3)=2
    •	先乘除模(取余) 后加减. 如果同级别, 就从左到右, 依次的计算. 有小括弧的就先计算小括弧里面的. 
    •	可以使用小括弧来改变算术运算符的优先级. 小括弧可以嵌套, 但是小括弧一定要成对出现

    赋值运算符
    一个变量的值, 只有在为其赋值的时候才会发生改变
    •	要想让一个变量的值在自身的基础上做改变, 那么还可以有另外一种写法 :    +=    -=    *=    /=    %=
    注意： 在为变量赋值时,当两种类型彼此不兼容,或者目标类型取值范围小于源类型时,需要进行强制类型转换. 
    然而在使用 +=, -=, *=, /=, %= 运算符进行赋值时,强制类型转换会自动完成.程序不需要做任何显式声明  
    short s = 3;
    int i = 5;
    s = s + i;//编译错误，不兼容的类型
    s += i;//编译正确 

9、自增和自减表达式(分析区别与总结归纳)
    自增&自减
        无论是前自增还是后自增都是将变量的值增加 1；无论是前自减还是后自减都是将变量的值减少 1；
        前自增和后自增的区别（前自减和后自减区别同样）
            •	i++ 这是一个表达式, 叫做后自增表达式.    先将i的值拿出来当做表达式的结果, 然后i的值再加1.
                (首先在内存中开辟临时空间用来存储i的数值,将临时空间的数值作为表达式的结果)
            •	++i 这也是一个表达式, 叫做前自增表达式.    先将i的值增加1, 然后才将i的值拿出来当做表达式的结果.(无需在内存中开辟临时空间)
        总结 : ++i; 前自增,不开辟临时空间,两值都一样. i++;后自增,开辟临时空间,两值不一样.
        注意：浮点型和字符型数据均支持自增和自减运算。
10、编码表 (解释说明并归纳重点)
    Java语言使用Unicode标准字符集，编码表参考ASCII.jpg
    如果给char类型赋值整数.计算机会自动将这些整数转化为所对应的字符
    1.	'a'    97
    2.	'A'    65
    3.	'0'    48
11、逗号表达式 (独立编写与代码解释)
    •	逗号在Java语言中, 是一个运算符, 由逗号连接起来的式子就叫做逗号表达式.
    •	格式 : 数据类型 变量1 = 值1, 变量2 = 值2, 变量3 = 值3,…;
    •	语法 : 表达式1, 表达式2, 表达式3, ......表达式n;
    class Demo{
    	public static void main(String[] args) {
    		char ch1 = 97, ch2 = 65, ch3 = 48;
    		int i1 = 'a', i2 = 'A', i3 = '0';
    		System.out.println("ch1="+ch1+", ch2="+ch2+", ch3="+ch3);
    		System.out.println("i1="+i1+", i2="+i2+", i3="+i3);
    	}
    }

12、比较运算符 (应用语法)
    比较表达式 : 由比较运算符连接起来的表达式就是比较表达式.用于对两个数值或变量进行比较.其结果是一个布尔值.即true或false.
    •	比较运算符 (关系运算符)  作用 : 用来比较两个数据的大小
    •	比较表达式 (关系表达式)  由比较运算符连接起来的式子就叫做比较表达式. 比较表达式表示的是一个条件, 既然是一个条件, 那么这个条件要么是成立的,要么是不成立的. 所以, 比较表达式的结果要么是真, 要么是假.
    •	Java 语言中使用 boolean 类型来表示真假, false 为假, true 为真. 如果条件成立, 那么返回的值是true, 否则返回的值是false.


```