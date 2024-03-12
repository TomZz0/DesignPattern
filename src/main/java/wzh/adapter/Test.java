package wzh.adapter;

import wzh.adapter.ClassAdapter.ClassAdapter;
import wzh.adapter.ObjectAdapter.ObjectAdapter;

/**
 * @author wzh
 * @date 2023年10月03日 17:25
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.translate("中文","英文","你好世界");

        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.translate("英文","中文","hello world");
    }
}
