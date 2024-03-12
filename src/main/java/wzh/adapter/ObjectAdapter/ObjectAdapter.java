package wzh.adapter.ObjectAdapter;

import wzh.adapter.Target;
import wzh.adapter.Translator;

/**
 * @author wzh
 * @date 2023年10月03日 17:32
 * Description:
 */
public class ObjectAdapter implements Target {
    private Translator translator = new Translator();

    @Override
    public void translate(String source, String target, String words) {
        if ("中文".equals(source) && "英文".equals(target)) {
            translator.translateInEn(words);
        } else if ("英文".equals(source) && "中文".equals(target)) {
            translator.translateInZh(words);
        }
    }
}
