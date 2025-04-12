/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pa1
 */
public final class pa1_0 {
    public static final pa1_0 b;
    public static final pa1_0 c;
    public static final pa1_0 d;
    public static final List e;
    public final String a;

    static {
        pa1_0 pa1_02;
        pa1_0 pa1_03;
        pa1_0 pa1_04;
        b = pa1_04 = new pa1_0("GET");
        c = pa1_03 = new pa1_0("POST");
        pa1_0 pa1_05 = new pa1_0("PUT");
        pa1_0 pa1_06 = new pa1_0("PATCH");
        pa1_0 pa1_07 = new pa1_0("DELETE");
        d = pa1_02 = new pa1_0("HEAD");
        pa1_0 pa1_08 = new pa1_0("OPTIONS");
        Object[] objectArray = new pa1_0[]{pa1_04, pa1_03, pa1_05, pa1_06, pa1_07, pa1_02, pa1_08};
        e = xx_2.i(objectArray);
    }

    public pa1_0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.a = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof pa1_0;
        if (!bl3) {
            return false;
        }
        object = (pa1_0)object;
        String string2 = this.a;
        object = ((pa1_0)object).a;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

