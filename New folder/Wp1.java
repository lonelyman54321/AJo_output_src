/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class Wp1
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (xp1_0)object;
        object2 = (xp1_0)object2;
        bq1$b bq1$b = ((xp1_0)object).z.r;
        float f5 = bq1$b.z;
        bq1$b bq1$b2 = ((xp1_0)object2).z.r;
        float f6 = bq1$b2.z;
        float f7 = f5 - f6;
        Object object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object3 == false) {
            n3 = ((xp1_0)object).B();
            int n4 = ((xp1_0)object2).B();
            n3 = Intrinsics.compare(n3, n4);
        } else {
            n3 = Float.compare(f5, f6);
        }
        return n3;
    }
}

