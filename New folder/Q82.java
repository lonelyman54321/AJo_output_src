/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class Q82
implements Comparator {
    public static final Q82 a;

    static {
        Q82 q82;
        a = q82 = new Object();
    }

    public final int compare(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (xp1_0)object2;
        int n3 = ((xp1_0)object2).k;
        int n4 = ((xp1_0)object).k;
        if ((n3 = Intrinsics.compare(n3, n4)) == 0) {
            int n7 = object.hashCode();
            int n8 = object2.hashCode();
            n3 = Intrinsics.compare(n7, n8);
        }
        return n3;
    }
}

