/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from qk0
 */
public final class qk0_0
implements vv1$a,
o60_0,
js0_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ qk0_0(Object object) {
        this.a = object;
    }

    public /* synthetic */ qk0_0(oe$a oe$a, wc3_0 wc3_02) {
        this.a = wc3_02;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public double c(double d2) {
        gp2_0 gp2_02 = (gp2_0)this.a;
        js0_0 js0_02 = gp2_02.n;
        double d5 = gp2_02.e;
        double d7 = gp2_02.f;
        d2 = f.e(d2, d5, d7);
        return js0_02.c(d2);
    }

    public void invoke(Object object) {
        object = (oe)object;
        wc3_0 wc3_02 = (wc3_0)this.a;
        object.a(wc3_02);
        int cfr_ignored_0 = wc3_02.a;
    }
}

