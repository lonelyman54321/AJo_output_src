/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a$a;
import androidx.compose.foundation.gestures.b;
import androidx.compose.foundation.gestures.c$b;
import androidx.compose.foundation.gestures.c$c;
import androidx.compose.foundation.gestures.c$d;
import androidx.compose.foundation.gestures.c$e;
import androidx.compose.foundation.gestures.c$f;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.d;

public final class c$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;
    public final /* synthetic */ hw2_0 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function2 i;

    public c$a(b b2, hw2_0 hw2_02, c$e c$e, c$d c$d, c$c c$c, c$f c$f, c$b c$b, f80_0 f80_02) {
        this.c = b2;
        this.d = hw2_02;
        this.e = c$e;
        this.f = c$d;
        this.g = c$c;
        this.h = c$f;
        this.i = c$b;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        c$a c$a;
        fx0_2 fx0_22;
        gx0_2 gx0_22 = fx0_22 = this.e;
        gx0_22 = (c$e)fx0_22;
        fx0_2 fx0_23 = fx0_22 = this.f;
        fx0_23 = (c$d)fx0_22;
        fx0_2 fx0_24 = fx0_22 = this.g;
        fx0_24 = (c$c)fx0_22;
        fx0_2 fx0_25 = fx0_22 = this.h;
        fx0_25 = (c$f)fx0_22;
        fx0_2 fx0_26 = fx0_22 = this.i;
        fx0_26 = (c$b)fx0_22;
        b b2 = this.c;
        hw2_0 hw2_02 = this.d;
        fx0_22 = c$a;
        c$a = new c$a(b2, hw2_02, (c$e)gx0_22, (c$d)fx0_23, (c$c)fx0_24, (c$f)fx0_25, (c$b)fx0_26, f80_02);
        c$a.b = object;
        return c$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (c$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        void var2_7;
        boolean bl2;
        Object object2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        Object object3 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            i90_0 i90_02 = (i90_0)this.b;
            try {
                vl2_2.b(object);
                return Unit.a;
            }
            catch (CancellationException cancellationException) {}
        } else {
            CancellationException cancellationException2;
            block10: {
                block11: {
                    Function2 function2;
                    Function0 function0;
                    Function0 function02;
                    Function1 function1;
                    gx0_2 gx0_22;
                    pg2_0 pg2_02;
                    vl2_2.b(object);
                    object = (i90_0)this.b;
                    try {
                        pg2_02 = ((b)object3).p;
                        object2 = this.d;
                        gx0_22 = this.e;
                        function1 = this.f;
                        function02 = this.g;
                        function0 = this.h;
                        function2 = this.i;
                        this.b = object;
                        this.a = n4;
                    }
                    catch (CancellationException cancellationException2) {
                        break block10;
                    }
                    {
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        rs0_0 rs0_02 = new rs0_0(function0, ref$LongRef, pg2_02, gx0_22, function2, function02, function1, null);
                        object2 = vv0_0.b((hw2_0)object2, rs0_02, this);
                        if (object2 == j90_02) break block11;
                    }
                    {
                        object2 = Unit.a;
                    }
                }
                if (object2 != j90_02) return Unit.a;
                return j90_02;
            }
            CancellationException cancellationException3 = cancellationException2;
            Object object4 = object;
            object = cancellationException3;
        }
        object2 = ((b)object3).t;
        if (object2 != null) {
            object3 = a$a.a;
            object2.j(object3);
        }
        if (!(bl2 = kotlinx.coroutines.d.d((i90_0)var2_7))) throw object;
        return Unit.a;
    }
}

