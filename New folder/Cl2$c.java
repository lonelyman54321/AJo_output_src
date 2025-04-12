/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Cl2$c
implements ii2_0 {
    public final /* synthetic */ Cl2 b;

    public Cl2$c(Cl2 cl2) {
        this.b = cl2;
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final void g(xp1_0 xp1_02) {
        this.b.w.setValue(xp1_02);
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

