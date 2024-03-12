package wzh.adapter.ClassAdapter;

import wzh.adapter.Target;
import wzh.adapter.Translator;

/**
 * @author wzh
 * @date 2023年10月03日 17:23
 * Description:
 */
public class ClassAdapter extends Translator implements Target {
    @Override
    public void translate(String source, String target, String words) {
        if ("中文".equals(source) && "英文".equals(target)) {
            this.translateInEn(words);
        } else if ("英文".equals(source) && "中文".equals(target)) {
            this.translateInZh(words);
        }
    }
}
