/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$b;
import androidx.compose.foundation.gestures.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c$b
extends Lambda
implements Function2 {
    public final /* synthetic */ bB3 c;
    public final /* synthetic */ b d;

    public c$b(bB3 bB32, b b2) {
        this.c = bB32;
        this.d = b2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (aw2_0)object;
        long l2 = ((e72)object2).a;
        object2 = this.c;
        eb3_0.a((bB3)object2, (aw2_0)object);
        object = this.d.t;
        if (object != null) {
            object2 = new a$b(l2);
            object.j(object2);
        }
        return Unit.a;
    }
}

