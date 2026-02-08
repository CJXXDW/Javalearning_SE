package Learn_Lambda;

import java.util.function.Supplier;

public class Lambda_main {
    public static void main(String[] args) {
        try_void tryVoid = () -> System.out.println("lambda表达式简单格式");   //1.不需要返回值的简单lambda表达式格式

        Try_return STR = (a) ->{
            System.out.println("这就是如何添加参数和return");
            return a+"NB";
        };  //2.这里可以注意到，创建了一个类，原来接口里定义的是一个方法

        Try_return str = a -> "今天学会了"+ a;   //2.1一个参数时可以省略括号，只有返回时可以省略花括号

        Try_int in = (a,b) ->Integer.sum(a,b);  //3.方法引用之引用原本就有的方法，注意定义的格式要相同

        Try_int in1 = Integer::sum; //3.更简便简单的写法

        Try_return stt = Lambda_main::ylrc;//3.引用其他自己写的方法

        try_void ne = try_new::new;//3. 通过new来引用构造方法


        tryVoid.try_void(); //1.的引用

        System.out.println(STR.STRING_return("原来如此"));  //2.的引用
        System.out.println(str.STRING_return(",原来如此"));  //2.的引用

        System.out.println(in.try_int(101,9798) + in1.try_int(7784,56));  //3.的引用
        System.out.println(stt.STRING_return("NB"));  //3.的引用
        ne.try_void();  //3.的引用

        /*函数式接口
         */
        s_example s_example = new s_example();
//        ex.getname(new Supplier<String>() {});//4.1可以通过新建一个对象来实现，也可以使用lambda表达式
        s_example.getname(() -> {
            System.out.println("实现了第一个函数式方法引用");
            return "测试结果";
        });
        System.out.println(s_example.toString());

        s_example.usename(System.out::println);

    }
    static String ylrc(String y){
        System.out.println("这是一个内部方法");
        return y+"NB";
    }
}
