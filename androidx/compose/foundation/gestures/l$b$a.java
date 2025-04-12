/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class l$b$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    public l$b$a(long l2, f80_0 f80_02) {
        this.b = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.b;
        l$b$a l$b$a = new l$b$a(l2, f80_02);
        l$b$a.a = object;
        return l$b$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (l$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = (tU1)this.a;
        long l2 = this.b;
        object.a(l2);
        return Unit.a;
    }
}

