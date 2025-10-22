package lab5;

public class task1 {
    public static void main(String[] args){
        String str = "zrwyexcty___biupomp,[poiutyd__r__6w354689879-90-iokL:____FGVDKLEFKV_EF___VMWEFGV_FMF]";
        int count_ = 0;
        for(int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '_') {
                ++count_;
            }
        }
        System.out.println("Символ _ встречается " + count_);
    }
}
