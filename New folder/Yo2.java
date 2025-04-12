/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.source.m$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Yo2
implements o60_0,
m$a,
js0_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ Yo2(Object object) {
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
        double d9 = d2 - d7;
        Object object = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
        if (object >= 0) {
            d5 *= d2;
            d2 = lq3.c;
            d5 += d2;
            d2 = lq3.a;
            d2 = Math.pow(d5, d2);
            double d12 = lq3.f;
            d2 += d12;
        } else {
            d5 = lq3.d * d2;
            d2 = lq3.g + d5;
        }
        return d2;
    }
}

