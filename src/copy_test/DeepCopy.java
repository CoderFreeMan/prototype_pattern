package copy_test;

import java.util.ArrayList;

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
public class DeepCopy implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected DeepCopy clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        try {
            deepCopy = (DeepCopy) super.clone();
            deepCopy.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepCopy;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
