/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Z20
extends ni1_0
implements LP1$b {
    public final gx0_2 c;

    public Z20(Function1 function1, gx0_2 gx0_22) {
        super(function1);
        this.c = gx0_22;
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

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

