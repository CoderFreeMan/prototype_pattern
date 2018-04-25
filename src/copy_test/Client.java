package copy_test;

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
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setValue("张三");
        ShallowCopy clone = shallowCopy.clone();
        clone.setValue("李四");
        System.out.println(shallowCopy.getValue());

        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setValue("张三");
        DeepCopy clone1 = deepCopy.clone();
        clone1.setValue("李四");
        System.out.println(deepCopy.getValue());
    }
}
