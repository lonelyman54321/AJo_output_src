/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from LP2
 */
public final class lp2_0
extends LP1$c
implements kp2_0 {
    public Function1 n;
    public Function1 o;

    public lp2_0() {
        throw null;
    }

    public final boolean V(MP2 object) {
        boolean bl2;
        Function1 function1 = this.o;
        if (function1 != null) {
            object = (Boolean)function1.invoke(object);
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean j0(MP2 object) {
        boolean bl2;
        Function1 function1 = this.n;
        if (function1 != null) {
            object = (Boolean)function1.invoke(object);
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

