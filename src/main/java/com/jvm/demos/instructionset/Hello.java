package com.jvm.demos.instructionset;

public class Hello {
    int i = 3;
    public static void main(String[] args) {
        Object hello = new Hello();
        hello.toString();
    }

    public String toString() {
        System.out.println("Hello");
        return "hello";
    }
}

/* ## Bytecode instruction
* Classfile Hello.class
  Last modified 8 de jun. de 2023; size 776 bytes
  SHA-256 checksum 8df8d70628baf822cacb5d92ab1f190ceee5ce89c6efd5019a8c6d36b7a92870
  Compiled from "Hello.java"
public class com.jvm.demos.instructionset.Hello
  minor version: 0
  major version: 61
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #8                          // com/jvm/demos/instructionset/Hello
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 1, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Fieldref           #8.#9          // com/jvm/demos/instructionset/Hello.i:I
   #8 = Class              #10            // com/jvm/demos/instructionset/Hello
   #9 = NameAndType        #11:#12        // i:I
  #10 = Utf8               com/jvm/demos/instructionset/Hello
  #11 = Utf8               i
  #12 = Utf8               I
  #13 = Methodref          #8.#3          // com/jvm/demos/instructionset/Hello."<init>":()V
  #14 = Methodref          #2.#15         // java/lang/Object.toString:()Ljava/lang/String;
  #15 = NameAndType        #16:#17        // toString:()Ljava/lang/String;
  #16 = Utf8               toString
  #17 = Utf8               ()Ljava/lang/String;
  #18 = Fieldref           #19.#20        // java/lang/System.out:Ljava/io/PrintStream;
  #19 = Class              #21            // java/lang/System
  #20 = NameAndType        #22:#23        // out:Ljava/io/PrintStream;
  #21 = Utf8               java/lang/System
  #22 = Utf8               out
  #23 = Utf8               Ljava/io/PrintStream;
  #24 = String             #25            // Hello
  #25 = Utf8               Hello
  #26 = Methodref          #27.#28        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #27 = Class              #29            // java/io/PrintStream
  #28 = NameAndType        #30:#31        // println:(Ljava/lang/String;)V
  #29 = Utf8               java/io/PrintStream
  #30 = Utf8               println
  #31 = Utf8               (Ljava/lang/String;)V
  #32 = String             #33            // hello
  #33 = Utf8               hello
  #34 = Utf8               Code
  #35 = Utf8               LineNumberTable
  #36 = Utf8               LocalVariableTable
  #37 = Utf8               this
  #38 = Utf8               Lcom/jvm/demos/instructionset/Hello;
  #39 = Utf8               main
  #40 = Utf8               ([Ljava/lang/String;)V
  #41 = Utf8               args
  #42 = Utf8               [Ljava/lang/String;
  #43 = Utf8               Ljava/lang/Object;
  #44 = Utf8               SourceFile
  #45 = Utf8               Hello.java
{
  int i;
    descriptor: I
    flags: (0x0000)

  public com.jvm.demos.instructionset.Hello();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_3
         6: putfield      #7                  // Field i:I
         9: return
      LineNumberTable:
        line 3: 0
        line 4: 4
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  this   Lcom/jvm/demos/instructionset/Hello;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: new           #8                  // class com/jvm/demos/instructionset/Hello
         3: dup
         4: invokespecial #13                 // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: invokevirtual #14                 // Method java/lang/Object.toString:()Ljava/lang/String;
        12: pop
        13: return
      LineNumberTable:
        line 6: 0
        line 7: 8
        line 8: 13
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      14     0  args   [Ljava/lang/String;
            8       6     1 hello   Ljava/lang/Object;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: ldc           #24                 // String Hello
         5: invokevirtual #26                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
         8: ldc           #32                 // String hello
        10: areturn
      LineNumberTable:
        line 11: 0
        line 12: 8
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lcom/jvm/demos/instructionset/Hello;
}
SourceFile: "Hello.java"
*/