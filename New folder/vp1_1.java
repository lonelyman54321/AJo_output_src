/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Vp1
 */
public abstract class vp1_1
implements op1_1 {
    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final int maxIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.v(n3);
    }

    public final int maxIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.P(n3);
    }

    public final int minIntrinsicHeight(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.I(n3);
    }

    public final int minIntrinsicWidth(Rj1 rj1, Qj1 qj1, int n3) {
        return qj1.N(n3);
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

