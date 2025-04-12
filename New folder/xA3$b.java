/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA3$b
extends Lambda
implements Function1 {
    public final /* synthetic */ xa3_1 c;

    public xA3$b(xa3_1 xa3_12) {
        this.c = xa3_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Kt0)object;
        xa3_1 xa3_12 = this.c;
        n11_0 n11_02 = xa3_12.b;
        float f5 = xa3_12.k;
        float f6 = xa3_12.l;
        xL$b xL$b = object.M0();
        long l2 = xL$b.l();
        Object object2 = xL$b.a();
        object2.p();
        try {
            object2 = xL$b.a;
            long l3 = 0L;
            ((yl_0)object2).e(f5, f6, l3);
            n11_02.a((Kt0)object);
            return Unit.a;
        }
        finally {
            jz.b(xL$b, l2);
        }
    }
}

