/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iw2
 */
public final class iw2_1
implements fw2 {
    public Function1 b;
    public vj2_1 c;
    public boolean d;
    public final iw2$b e;

    public iw2_1() {
        iw2$b iw2$b;
        this.e = iw2$b = new iw2$b(this);
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

    public final iw2$b h() {
        return this.e;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

