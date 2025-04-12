/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

public final class pd0
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (Di1)object;
        object2 = (Di1)object2;
        Intrinsics.checkNotNullExpressionValue(object2, "o2");
        object.getClass();
        String string2 = "data";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = ((Di1)object).g;
        if (object != null) {
            long l2 = (Long)object;
            object = ((Di1)object2).g;
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

