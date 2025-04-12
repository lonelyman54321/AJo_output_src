/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PS1
 */
public final class ps1_1
implements Comparator {
    public static final ps1_1 a;

    static {
        ps1_1 ps1_12;
        a = ps1_12 = new Object();
    }

    public final int compare(Object object, Object object2) {
        object = (Comparable)object;
        object2 = (Comparable)object2;
        Intrinsics.checkNotNullParameter(object, "a");
        Intrinsics.checkNotNullParameter(object2, "b");
        return object.compareTo(object2);
    }

    public final Comparator reversed() {
        return xo2_2.a;
    }
}

