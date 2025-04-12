/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tL2
 */
public final class tl2_2
implements Serializable {
    public static final tL2$a b;
    public final Object a;

    static {
        tL2$a tL2$a;
        b = tL2$a = new tL2$a(null);
    }

    public /* synthetic */ tl2_2(Object object) {
        this.a = object;
    }

    public static final Throwable a(Object object) {
        boolean bl2 = object instanceof tL2$b;
        object = bl2 ? ((tL2$b)object).a : null;
        return object;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof tL2$b;
    }

    public final boolean equals(Object object) {
        Object object2;
        boolean bl2;
        boolean bl3 = object instanceof tl2_2;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(object2 = this.a, object = ((tl2_2)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public final String toString() {
        Object object = this.a;
        boolean bl2 = object instanceof tL2$b;
        if (bl2) {
            object = ((tL2$b)object).toString();
        } else {
            String string2 = "Success(";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            char c2 = ')';
            stringBuilder.append(c2);
            object = stringBuilder.toString();
        }
        return object;
    }
}

