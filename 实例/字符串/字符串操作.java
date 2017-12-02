package 实例.字符串;

public class 字符串操作 {
    public static void main(String[] args) {

        String str = "  Hello World  ";

        // 从指定的索引位置开始截取子字符串
        String substr1 = str.substring(5);
        System.out.println(substr1);

        // 从指定的索引位置开始截取到另一指定位置
        String substr2 = str.substring(0, 5);
        System.out.println(substr2);

        // 去除空格
        System.out.println(str + "  " + str.length());
        System.out.println(str.trim() + "  " + str.trim().length());

        // 字符串替换
        String newstr = str.replace("l", "L");
        System.out.println(newstr);

        // 判断字符串的开始与结尾
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith(" "));

        // 判断字符串是否相等
        String a = new String("i am a student");
        String b = new String("I Am A Student");
        boolean c = (a == b);
        System.out.println(c);
        System.out.println(a.equals(b)); // 区分大小写
        System.out.println(a.equalsIgnoreCase(b)); // 不区分大小写

        // 按字典顺序比较两个字符串
        System.out.println(a.compareTo(b));



    }
}
