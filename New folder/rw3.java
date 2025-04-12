/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class rw3
extends Lambda
implements Function1 {
    public final /* synthetic */ tw3 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;

    public rw3(tw3 tw32, float f5, Function1 function1) {
        this.c = tw32;
        this.d = f5;
        this.e = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2;
        kl_1 kl_12;
        long l3 = ((Number)object).longValue();
        object = this.c;
        long l4 = ((tw3)object).b;
        long l7 = Long.MIN_VALUE;
        long l8 = l4 - l7;
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 == false) {
            ((tw3)object).b = l3;
        }
        float f5 = ((tw3)object).e;
        kl_1 kl_13 = new kl_1(f5);
        f5 = 0.0f;
        kl_1 kl_14 = null;
        float f6 = this.d;
        float f7 = f6 - 0.0f;
        Object object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object3 == false) {
            f6 = ((tw3)object).e;
            kl_14 = new kl_1(f6);
            kl_1 kl_15 = tw3.f;
            kl_12 = ((tw3)object).c;
            JA3 jA3 = ((tw3)object).a;
            l2 = jA3.g(kl_14, kl_15, kl_12);
        } else {
            long l12 = ((tw3)object).b;
            l12 = l3 - l12;
            f5 = (float)l12 / f6;
            double d2 = f5;
            l2 = ok1_1.c(d2);
        }
        kl_12 = tw3.f;
        kl_1 kl_16 = ((tw3)object).c;
        float f8 = ((kl_1)((tw3)object).a.f((long)l2, (Ol)kl_13, (Ol)kl_12, (Ol)kl_16)).a;
        kl_16 = ((tw3)object).c;
        ((tw3)object).c = kl_13 = (kl_1)((tw3)object).a.e(l2, kl_13, kl_12, kl_16);
        ((tw3)object).b = l3;
        float f11 = ((tw3)object).e - f8;
        ((tw3)object).e = f8;
        object = Float.valueOf(f11);
        this.e.invoke(object);
        return Unit.a;
    }
}

