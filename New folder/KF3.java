/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public final class KF3
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (LF3$a)object;
        object2 = (LF3$a)object2;
        int n3 = ((LF3$a)object).a.b;
        int n4 = ((LF3$a)object2).a.b;
        return Integer.compare(n3, n4);
    }
}

