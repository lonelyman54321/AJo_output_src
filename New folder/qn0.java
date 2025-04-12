/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class qn0
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (Integer)object;
        object2 = (Integer)object2;
        int n4 = (Integer)object;
        if (n4 == (n3 = -1)) {
            int n7 = (Integer)object2;
            if (n7 == n3) {
                n3 = 0;
            }
        } else {
            n4 = (Integer)object2;
            if (n4 == n3) {
                n3 = 1;
            } else {
                int n8 = (Integer)object;
                int n10 = (Integer)object2;
                n3 = n8 - n10;
            }
        }
        return n3;
    }
}

