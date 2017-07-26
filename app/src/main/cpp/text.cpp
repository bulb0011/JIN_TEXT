//
// Created by Administrator on 2017/7/17.
//
#include <jni.h>
#include <string>
#include <stdlib.h>
#include <stdio.h>

/*// 代表可以被 Java 调用
JNIEXPORT
// 返回值类型
_jstring
//声明遵守JNI Java 调用C的规则
JNICALL*/

extern "C"
JNIEXPORT void JNICALL
Java_www_jin_com_jin_1text_TextNDK_CryptFile(JNIEnv *env, jobject instance, jstring src_,
                                             jstring dest_) {
    const char *src = env->GetStringUTFChars(src_, 0);
    const char *dest = env->GetStringUTFChars(dest_, 0);

    // TODO

    env->ReleaseStringUTFChars(src_, src);
    env->ReleaseStringUTFChars(dest_, dest);
}

extern "C"
jstring Java_www_jin_com_jin_1text_TextNDK_TextNdk(JNIEnv *env, jobject instance) {

    // TODO
    std::string hello3 = "Hello from textndkobjC++";

    return env->NewStringUTF(hello3.c_str());
}

extern "C"
jstring Java_www_jin_com_jin_1text_MainActivity_TextJNI(
        JNIEnv *env, jobject /* this */) {

    std::string hello = "Hello from textC++";


    return env->NewStringUTF(hello.c_str());

}



