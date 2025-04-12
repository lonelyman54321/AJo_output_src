/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class AndroidViewHolder$k
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ AndroidViewHolder b;
    public final /* synthetic */ long c;

    public AndroidViewHolder$k(AndroidViewHolder androidViewHolder, long l2, f80_0 f80_02) {
        this.b = androidViewHolder;
        this.c = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AndroidViewHolder androidViewHolder = this.b;
        long l2 = this.c;
        object = new AndroidViewHolder$k(androidViewHolder, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (AndroidViewHolder$k)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((AndroidViewHolder$k)object).invokeSuspend(object2);
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
            object = this.b.a;
            this.a = n4;
            long l2 = this.c;
            object = ((pU1)object).b(l2, this);
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

