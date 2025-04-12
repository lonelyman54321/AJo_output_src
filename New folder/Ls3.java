/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class Ls3 {
    /*
     * WARNING - void declaration
     */
    public static Ms3 a(Ms3 object, String[] object2, Map map2) {
        void var2_4;
        int n3 = 1;
        if (object == null) {
            if (object2 == null) {
                return null;
            }
            int n4 = ((Object)object2).length;
            if (n4 == n3) {
                object = object2[0];
                return (Ms3)var2_4.get(object);
            }
            n4 = ((Object)object2).length;
            if (n4 > n3) {
                object = new Ms3();
                for (Object object3 : object2) {
                    Ms3 ms3 = (Ms3)var2_4.get(object3);
                    ((Ms3)object).a(ms3);
                }
                return object;
            }
        } else {
            int n7;
            if (object2 != null && (n7 = ((Object)object2).length) == n3) {
                Object object4 = object2[0];
                Ms3 ms3 = (Ms3)var2_4.get(object4);
                ((Ms3)object).a(ms3);
                return object;
            }
            if (object2 != null && (n7 = ((Object)object2).length) > n3) {
                int n8;
                n3 = ((Object)object2).length;
                while (n8 < n3) {
                    Object object5 = object2[n8];
                    Ms3 ms3 = (Ms3)var2_4.get(object5);
                    ((Ms3)object).a(ms3);
                    ++n8;
                }
            }
        }
        return object;
    }
}

