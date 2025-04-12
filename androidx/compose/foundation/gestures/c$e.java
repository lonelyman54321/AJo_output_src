/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$c;
import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.f;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class c$e
extends Lambda
implements gx0_2 {
    public final /* synthetic */ b c;
    public final /* synthetic */ bB3 d;

    public c$e(bB3 bB32, b b2) {
        this.c = b2;
        this.d = bB32;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (aw2_0)object;
        object2 = (aw2_0)object2;
        long l2 = ((e72)object3).a;
        object3 = this.c;
        Object object4 = (Boolean)((b)object3).q.invoke(object);
        boolean n3 = (Boolean)object4;
        if (n3) {
            boolean bl2 = ((b)object3).v;
            if (!bl2) {
                boolean bl3;
                object4 = ((b)object3).t;
                if (object4 == null) {
                    int n4 = -1 >>> 1;
                    int n7 = 6;
                    ((b)object3).t = object4 = sr_2.a(n4, n7, null);
                }
                ((b)object3).v = bl3 = true;
                object4 = ((LP1$c)object3).f1();
                f f5 = new f((b)object3, null);
                int n8 = 3;
                Ae3.d((i90_0)object4, null, null, f5, n8);
            }
            object4 = this.d;
            eb3_0.a((bB3)object4, (aw2_0)object);
            long l3 = e72.h(((aw2_0)object2).c, l2);
            object3 = ((b)object3).t;
            if (object3 != null) {
                a$c a$c = new a$c(l3);
                object3.j(a$c);
            }
        }
        return Unit.a;
    }
}

