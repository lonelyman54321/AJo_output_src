/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class ro0
extends Lambda
implements Function0 {
    public final /* synthetic */ to0_1 c;

    public ro0(to0_1 to0_12) {
        this.c = to0_12;
        super(0);
    }

    public final Object invoke() {
        Object object = vp2_0.b;
        to0_1 to0_12 = this.c;
        if ((object = (pp2_0)K30.a(to0_12, (H30)object)) == null || (object = ((pp2_0)object).b) == null) {
            object = w60_0.a;
            long l2 = ((OX)K30.a((J30)to0_12, (H30)object)).a;
            object = mz_0.a;
            boolean bl2 = ((lZ)(object = (lZ)K30.a(to0_12, (H30)object))).i();
            if (bl2) {
                float f5 = zx_0.h(l2);
                double d2 = f5;
                l2 = 4602678819172646912L;
                double d5 = 0.5;
                double d7 = d2 - d5;
                Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
                object = object2 > 0 ? vp2_0.e : vp2_0.f;
            } else {
                object = vp2_0.g;
            }
        }
        return object;
    }
}

