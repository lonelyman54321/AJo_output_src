/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.gestures.l$b$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class l$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ long c;

    public l$b(l l2, long l3, f80_0 f80_02) {
        this.b = l2;
        this.c = l3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        l l2 = this.b;
        long l3 = this.c;
        object = new l$b(l2, l3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (l$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l$b)object).invokeSuspend(object2);
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
            object = this.b.C;
            aS1 aS12 = aS1.UserInput;
            long l2 = this.c;
            l$b$a l$b$a = new l$b$a(l2, null);
            this.a = n4;
            object = ((ku2_0)object).e(aS12, l$b$a, this);
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

