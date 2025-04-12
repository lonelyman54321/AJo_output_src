/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$d;
import androidx.compose.foundation.gestures.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c$d
extends Lambda
implements Function1 {
    public final /* synthetic */ bB3 c;
    public final /* synthetic */ b d;

    public c$d(bB3 bB32, b b2) {
        this.c = bB32;
        this.d = b2;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        object = (aw2_0)object;
        Object object2 = this.c;
        eb3_0.a((bB3)object2, (aw2_0)object);
        object = O30.q;
        Object object3 = this.d;
        object = (NC3)K30.a((J30)object3, (H30)object);
        float f6 = object.e();
        long l2 = XA3.a(f6, f6);
        f6 = WA3.b(l2);
        float f7 = 0.0f;
        float f8 = f6 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (f11 > 0 && (f11 = (f5 = (f6 = WA3.c(l2)) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) > 0) {
            f6 = WA3.b(l2);
            ZA3 zA3 = ((bB3)object2).a;
            f6 = zA3.b(f6);
            float f12 = WA3.c(l2);
            ZA3 zA32 = ((bB3)object2).b;
            f12 = zA32.b(f12);
            long l3 = XA3.a(f6, f12);
            object = zA3.d;
            rp_1.o(null, (Object[])object);
            f11 = 0.0f;
            f6 = 0.0f;
            zA3.e = 0;
            Object[] objectArray = zA32.d;
            rp_1.o(null, objectArray);
            zA32.e = 0;
            ((bB3)object2).c = l2 = 0L;
            object = ((b)object3).t;
            if (object != null) {
                object3 = Zs0.a;
                float f14 = WA3.b(l3);
                boolean bl2 = Float.isNaN(f14);
                if (bl2) {
                    bl2 = false;
                    f14 = 0.0f;
                    object3 = null;
                } else {
                    f14 = WA3.b(l3);
                }
                f12 = WA3.c(l3);
                boolean bl3 = Float.isNaN(f12);
                if (!bl3) {
                    f7 = WA3.c(l3);
                }
                long l4 = XA3.a(f14, f7);
                object2 = new a$d(l4);
                object.j(object2);
            }
            return Unit.a;
        }
        object = new StringBuilder("maximumVelocity should be a positive value. You specified=");
        object2 = WA3.g(l2);
        ((StringBuilder)object).append(object2);
        bh1_1.c(((StringBuilder)object).toString());
        throw null;
    }
}

