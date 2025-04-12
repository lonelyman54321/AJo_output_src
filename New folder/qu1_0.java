/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from Qu1
 */
public final class qu1_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (Ru1$a)object;
        object2 = (Ru1$a)object2;
        int n4 = ((Ru1$a)object).c;
        int n7 = ((Ru1$a)object2).c;
        if (n4 < n7) {
            n3 = -1;
        } else if (n4 > n7) {
            n3 = 1;
        } else {
            int n8 = ((Ru1$a)object2).d;
            n3 = ((Ru1$a)object).d;
            n3 = Integer.compare(n8, n3);
        }
        return n3;
    }
}

