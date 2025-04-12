/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from UP1
 */
public abstract class up1_0
implements LP1$b {
    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public abstract LP1$c b();

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public abstract void j(LP1$c var1);

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

