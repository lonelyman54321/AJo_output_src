/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class yr3$b
extends Lambda
implements Function1 {
    public static final yr3$b c;

    static {
        yr3$b yr3$b;
        c = yr3$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (gx2_0)object;
        long l2 = ((gx2_0)object).f;
        Object object2 = (S83)yr3.b.getValue();
        yr3$b yr3$b = yr3.a;
        kx2_1 kx2_12 = ((gx2_0)object).g;
        ((S83)object2).d(object, yr3$b, kx2_12);
        long l3 = ((gx2_0)object).f;
        Object object3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object3 != false) {
            gX2$a gX2$a = ((gx2_0)object).n;
            if (gX2$a != null) {
                gX2$a.g = l3;
                JA3 jA3 = gX2$a.b;
                if (jA3 == null) {
                    long l4;
                    jA3 = null;
                    object2 = gX2$a.e;
                    float f5 = ((kl_1)object2).a(0);
                    double d2 = f5;
                    double d5 = 1.0 - d2;
                    d2 = ((gx2_0)object).f;
                    gX2$a.h = l4 = ok1_1.c(d5 *= d2);
                }
            } else {
                l2 = 0L;
                long l7 = l3 - l2;
                object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object3 != false) {
                    ((gx2_0)object).n();
                }
            }
        }
        return Unit.a;
    }
}

