package test1;

/**
 * <p> Date             :2018/4/25 </p>
 * <p> Module           : </p>
 * <p> Description      : </p>
 * <p> Remark           : </p>
 *
 * @author yangdejun
 * @version 1.0
 * <p>--------------------------------------------------------------</p>
 * <p>修改历史</p>
 * <p>    序号    日期    修改人    修改原因    </p>
 * <p>    1                                     </p>
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//产生一个对象
        Thing thing = new Thing();
//拷贝一个对象您的设计模式第  264  页
        Thing cloneThing = (Thing) thing.clone();
    }
}
