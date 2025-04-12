/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.c$a;
import androidx.compose.foundation.gestures.c$b;
import androidx.compose.foundation.gestures.c$c;
import androidx.compose.foundation.gestures.c$d;
import androidx.compose.foundation.gestures.c$e;
import androidx.compose.foundation.gestures.c$f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class c
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;

    public c(b b2, f80_0 f80_02) {
        this.c = b2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        b b2 = this.c;
        c c2 = new c(b2, f80_02);
        c2.b = object;
        return c2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (hw2_0)object;
        object2 = (f80_0)object2;
        object = (c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = object = this.b;
            object2 = (hw2_0)object;
            object = new bB3();
            b b2 = this.c;
            c$e c$e = new c$e((bB3)object, b2);
            c$d c$d = new c$d((bB3)object, b2);
            c$c c$c = new c$c(b2);
            c$f c$f = new c$f(b2);
            c$b c$b = new c$b((bB3)object, b2);
            b b3 = this.c;
            object = new c$a(b3, (hw2_0)object2, c$e, c$d, c$c, c$f, c$b, null);
            this.a = n4;
            object = d.c((Function2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

