#### prototype pattern
demo1 包中是最简单的prototype pattern模式，多线程是是线程不安全的
demo2 包中是采用clone的方式实现prototype patter模式，多线程是是线程安全的
test1 包中是测试在拷贝过程中是否会执行默认的构造方法，答案是不会
copy_test 包中是测试浅拷贝和深拷贝的区别