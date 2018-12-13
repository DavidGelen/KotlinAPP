package lib.study.util;

/**
 * @name KotlinAPP
 * @class name：lib.study.util
 * @anthor David
 * @time 2018/12/13 23:41
 * @class describe
 */
public class Test {

    public static void main(String[] args) {
        // Java中调用Kotlin中定义顶层函数，如果自定义生成类名，直接用定义类名调用。
        System.out.println("文件大小: " + FileFormatUtil.formateFileSize(1343553));
    }

}
