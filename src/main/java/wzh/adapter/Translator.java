package wzh.adapter;

/**
 * @author wzh
 * @date 2023年10月03日 17:21
 * Description:
 */
public class Translator {

    public void translateInZh(String words){
        if ("hello world".equals(words)){
            System.out.println("翻译成中文: 你好世界");
        }
    }

    public void translateInEn(String words){
        if ("你好世界".equals(words)){
            System.out.println("translate in english: hello world");
        }
    }
}
