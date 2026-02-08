package Learn_Lambda;

import java.util.function.Consumer;
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

    @Override
    public String toString() {
        return "s_example{" +
                "name='" + name + '\'' +
                '}';
    }
}
