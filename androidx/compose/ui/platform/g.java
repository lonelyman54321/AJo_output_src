/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class g
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ j b;

    public g(j j3, f80_0 f80_02) {
        this.b = j3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        j j3 = this.b;
        object = new g(j3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (g)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((g)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b.a;
        this.a = n4;
        object = ((AndroidComposeView)object).p.b(this);
        if (object != j90_02) {
            object = Unit.a;
        }
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

