#include <jni.h>
#include <string>


void msg(char* msg , char* title){
    //C语言里面字符串用char指针代替

    printf("msg+title%s%s",msg,title);

}
extern "C"
jstring Java_www_jin_com_jin_1text_MainActivity_stringFromJNI(
        JNIEnv *env, jobject obj/* this */) {

    std::string hello = "Hello from C++";

    int i = 90;
    int *t=&i;
    int *p =t;

    printf("%d",*t);

    printf("%d",*p);


    void(*fun)(char* msg, char* title) = msg;

    fun("我爱你","李璐");


    return env->NewStringUTF(hello.c_str());

}



