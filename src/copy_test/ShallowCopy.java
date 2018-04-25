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
public class ShallowCopy implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected ShallowCopy clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = null;
        try {
            shallowCopy = (ShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shallowCopy;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
