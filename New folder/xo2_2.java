/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xO2
 */
public final class xo2_2
implements Comparator {
    public static final xo2_2 a;

    static {
        xo2_2 xo2_22;
        a = xo2_22 = new Object();
    }

    public final int compare(Object object, Object object2) {
        object = (Comparable)object;
        object2 = (Comparable)object2;
        Intrinsics.checkNotNullParameter(object, "a");
        Intrinsics.checkNotNullParameter(object2, "b");
        return object2.compareTo(object);
    }

    public final Comparator reversed() {
        return ps1_1.a;
    }
}

