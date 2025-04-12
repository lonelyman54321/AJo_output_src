/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class fV0
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        block3: {
            int n4 = ((Object)(object = (Object)((byte[])object))).length;
            int n7 = ((Object)(object2 = (Object)((byte[])object2))).length;
            if (n4 != n7) {
                n3 = ((Object)object).length;
                int n8 = ((Object)object2).length;
                n3 -= n8;
            } else {
                Object object3;
                n4 = 0;
                for (n7 = 0; n7 < (object3 = ((Object)object).length); ++n7) {
                    object3 = object[n7];
                    Object object4 = object2[n7];
                    if (object3 == object4) continue;
                    n3 = object3 - object4;
                    break block3;
                }
                n3 = 0;
                object = null;
            }
        }
        return n3;
    }
}

