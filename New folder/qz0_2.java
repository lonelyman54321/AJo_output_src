/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qz0
 */
public final class qz0_2
implements im2_2 {
    public static final qz0_2 c;

    static {
        qz0_2 qz0_22;
        c = qz0_22 = new Object();
    }

    public final void a(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "body");
        ue3$a.a(this, function2);
    }

    public final boolean b() {
        return true;
    }

    public final List d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return null;
    }

    public final Set entries() {
        return vz0_2.a;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof im2_2;
        if (bl3 && (bl2 = (object = (im2_2)object).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Parameters ");
        vz0_2 vz0_22 = vz0_2.a;
        stringBuilder.append(vz0_22);
        return stringBuilder.toString();
    }
}

