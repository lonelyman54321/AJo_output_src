/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class gp0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (xp1_0)object2;
        int n3 = ((xp1_0)object).k;
        int n4 = ((xp1_0)object2).k;
        if ((n3 = Intrinsics.compare(n3, n4)) == 0) {
            int n7 = object.hashCode();
            int n8 = object2.hashCode();
            n3 = Intrinsics.compare(n7, n8);
        }
        return n3;
    }
}

