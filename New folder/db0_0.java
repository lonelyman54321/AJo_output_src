/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dB0
 */
public final class db0_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (cb0_0)object;
        object2 = (cb0_0)object2;
        Intrinsics.checkNotNullExpressionValue(object2, "o2");
        object.getClass();
        String string2 = "data";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = ((cb0_0)object).c;
        if (object != null) {
            long l2 = (Long)object;
            object = ((cb0_0)object2).c;
            if (object != null) {
                long l3 = (Long)object;
                n3 = Intrinsics.compare(l3, l2);
            } else {
                n3 = 1;
            }
        } else {
            n3 = -1;
        }
        return n3;
    }
}

