/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.f$a;
import androidx.compose.foundation.gestures.g;
import androidx.compose.foundation.gestures.h$a;
import androidx.compose.foundation.gestures.h$b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class h
extends b {
    public gx0_2 A;
    public gx0_2 B;
    public boolean C;
    public at0 x;
    public pg2_0 y;
    public boolean z;

    public h() {
        throw null;
    }

    public final void A1(long l2) {
        qg3_2 qg3_22;
        Object object;
        boolean bl2 = this.m;
        if (bl2 && !(bl2 = Intrinsics.areEqual(object = this.B, qg3_22 = Zs0.b))) {
            object = this.f1();
            qg3_22 = new h$b(this, l2, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)((Object)qg3_22), n3);
        }
    }

    public final boolean B1() {
        return this.z;
    }

    public final Object y1(f$a object, f80_0 object2) {
        at0 at02 = this.x;
        aS1 aS12 = aS1.UserInput;
        g g3 = new g((f$a)object, this, null);
        if ((object = at02.a(aS12, g3, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final void z1(long l2) {
        qg3_2 qg3_22;
        Object object;
        boolean bl2 = this.m;
        if (bl2 && !(bl2 = Intrinsics.areEqual(object = this.A, qg3_22 = Zs0.a))) {
            object = this.f1();
            qg3_22 = new h$a(this, l2, null);
            int n3 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)((Object)qg3_22), n3);
        }
    }
}

