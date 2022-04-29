package com.DLY;

public class StackStruTest {
    public static void main(String[] args) {
        //java 反编译 指令
        // D:\git_Dome\study-jvm\dome1\target\classes\com\DLY> javap -v StackStruTest.class
        // 是基于栈式架构    指令集更加细腻
        // 寄存器架构的话    指令更少 依赖硬件

        int i=2;
        int j=3;
        int k=i+j;
    }
}
//反编译文件
/*

Classfile /D:/git_Dome/study-jvm/dome1/target/classes/com/DLY/StackStruTest.class
  Last modified 2022-4-29; size 422 bytes
  MD5 checksum cd52fc2ffa30f5979e997af636f1bda5
  Compiled from "StackStruTest.java"
public class com.DLY.StackStruTest
  minor version: 0
  major version: 51
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#19         // java/lang/Object."<init>":()V
   #2 = Class              #20            // com/DLY/StackStruTest
   #3 = Class              #21            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable
   #8 = Utf8               LocalVariableTable
   #9 = Utf8               this
  #10 = Utf8               Lcom/DLY/StackStruTest;
  #11 = Utf8               main
  #12 = Utf8               ([Ljava/lang/String;)V
  #13 = Utf8               args
  #14 = Utf8               [Ljava/lang/String;
  #15 = Utf8               i
  #16 = Utf8               I
  #17 = Utf8               SourceFile
  #18 = Utf8               StackStruTest.java
  #19 = NameAndType        #4:#5          // "<init>":()V
  #20 = Utf8               com/DLY/StackStruTest
  #21 = Utf8               java/lang/Object
{
  public com.DLY.StackStruTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/DLY/StackStruTest;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=2, args_size=1
         0: iconst_2
         1: istore_1
         2: return
      LineNumberTable:
        line 5: 0
        line 6: 2
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       3     0  args   [Ljava/lang/String;
            2       1     1     i   I
}
SourceFile: "StackStruTest.java"
PS D:\git_Dome\study-jvm\dome1\target\classes\com\DLY> javap -v StackStruTest.class
Classfile /D:/git_Dome/study-jvm/dome1/target/classes/com/DLY/StackStruTest.class
  Last modified 2022-4-29; size 464 bytes
  MD5 checksum bbae376c6efa2a3c3999fa6959c89a52
  Compiled from "StackStruTest.java"
public class com.DLY.StackStruTest
  minor version: 0
  major version: 51
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #3.#21         // java/lang/Object."<init>":()V
   #2 = Class              #22            // com/DLY/StackStruTest
   #3 = Class              #23            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable
   #8 = Utf8               LocalVariableTable
   #9 = Utf8               this
  #10 = Utf8               Lcom/DLY/StackStruTest;
  #11 = Utf8               main
  #12 = Utf8               ([Ljava/lang/String;)V
  #13 = Utf8               args
  #14 = Utf8               [Ljava/lang/String;
  #15 = Utf8               i
  #16 = Utf8               I
  #17 = Utf8               j
  #18 = Utf8               k
  #19 = Utf8               SourceFile
  #20 = Utf8               StackStruTest.java
  #21 = NameAndType        #4:#5          // "<init>":()V
  #22 = Utf8               com/DLY/StackStruTest
  #23 = Utf8               java/lang/Object
{
  public com.DLY.StackStruTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/DLY/StackStruTest;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_2    #声明一个操作数2
         1: istore_1    #存放到栈空间1
         2: iconst_3    #声明一个操作数3
         3: istore_2    #存放到栈空间1
         4: iload_1     #读栈空间1
         5: iload_2     #读栈空间2
         6: iadd        #调用加法器
         7: istore_3    #保存到栈空间3
         8: return      #返回
      LineNumberTable:
        line 7: 0
        line 8: 2
        line 9: 4
        line 10: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       9     0  args   [Ljava/lang/String;
            2       7     1     i   I
            4       5     2     j   I
            8       1     3     k   I
}
SourceFile: "StackStruTest.java"

* */