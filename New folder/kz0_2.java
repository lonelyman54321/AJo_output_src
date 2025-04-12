/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kz0
 */
public final class kz0_2
implements l41_0 {
    public static final kz0_2 c;

    static {
        kz0_2 kz0_22;
        c = kz0_22 = new Object();
    }

    public final void a(Function2 function2) {
        function2 = (we3_2)function2;
        Intrinsics.checkNotNullParameter(function2, "body");
        ue3$a.a(this, function2);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        String string2 = "Content-Encoding";
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        this.d(string2);
        return false;
    }

    public final List d(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        return null;
    }

    public final Set entries() {
        return vz0_2.a;
    }

    public final String get(String string2) {
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        this.d(string2);
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Headers ");
        vz0_2 vz0_22 = vz0_2.a;
        stringBuilder.append(vz0_22);
        return stringBuilder.toString();
    }
}

