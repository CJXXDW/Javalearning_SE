package Learn_Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class s_example {
    private String name;

//    public void getname(String name){  //这是普通情况下的写法
//        this.name = name;
//    }

    public void getname(Supplier<String> supplier){   //4.1函数式接口用法
        this.name = supplier.get();
    }

    public void usename(Consumer<String> consumer){
        consumer.accept(name);
    }
    public void lengthname(Function<String,Integer> function){
        Integer lengt = function.apply(name);
        System.out.println("名字长度是"+lengt);
    }

    public void nameInvalid(Predicate<String> predicate){
        boolean test = predicate.test(name);
        System.out.println(test ? "名字合法" : "名字不合法");
    }

    @Override
    public String toString() {
        return "s_example{" +
                "name='" + name + '\'' +
                '}';
    }
}
