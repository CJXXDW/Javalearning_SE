package optional;

import java.util.Optional;

public class better {
    public static void main(String[] args) {
        test("close");
        test(null);
        tes("open");
        //tes(null);
        tesduanyan("entity");
        testmap("tip");
    }

    private static void test(String y){
        Optional.ofNullable(y).ifPresent(System.out::println);//基础的

        Optional.ofNullable(y).ifPresentOrElse(s -> {  //增强后的判空包装
            System.out.println("我有值"+s);
        }, () ->{
            System.out.println("空的");
        });
    }

    private static void tes(String y){
        Optional
                .ofNullable(y).or(() -> Optional.of("备选方案"))
                .ifPresent(System.out::println);

        //Optional.ofNullable(y).orElseThrow();
        Optional.ofNullable(y).orElseThrow(() ->new RuntimeException("没有这个元素"));
    }

    private static void tesduanyan(String y){
        System.out.println(Optional.ofNullable(y).filter(sy -> sy.contains("i")).get());
        System.out.println(Optional.ofNullable(y).isEmpty());
    }
    private static void testmap(String y){
        System.out.println(Optional.ofNullable(y).flatMap(s -> Optional.of("aaa" + s)).get());
    }
}
