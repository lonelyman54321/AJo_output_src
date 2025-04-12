/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vo2
 */
public final class vo2_1
implements o60_0,
js0_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ vo2_1(Object object) {
        this.a = object;
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public double c(double d2) {
        Lq3 lq3 = (Lq3)this.a;
        double d5 = lq3.b;
        double d7 = lq3.e;
        double d9 = lq3.d;
        double d12 = d2 - (d7 *= d9);
        Object object = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object >= 0) {
            d9 = lq3.a;
            d7 = 1.0 / d9;
            d2 = Math.pow(d2, d7);
            d7 = lq3.c;
            d2 = (d2 - d7) / d5;
        } else {
            d2 /= d9;
        }
        return d2;
    }
}

