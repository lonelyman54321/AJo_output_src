/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class AndroidViewHolder$j
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ AndroidViewHolder c;
    public final /* synthetic */ long d;

    public AndroidViewHolder$j(boolean bl2, AndroidViewHolder androidViewHolder, long l2, f80_0 f80_02) {
        this.b = bl2;
        this.c = androidViewHolder;
        this.d = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AndroidViewHolder androidViewHolder = this.c;
        long l2 = this.d;
        boolean bl2 = this.b;
        object = new AndroidViewHolder$j(bl2, androidViewHolder, l2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (AndroidViewHolder$j)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((AndroidViewHolder$j)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7 && n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            boolean bl2 = this.b;
            Object object2 = this.c;
            if (!bl2) {
                pU1 pU12 = ((AndroidViewHolder)object2).a;
                this.a = n7;
                long l2 = 0L;
                long l3 = this.d;
                object = pU12.a(l2, l3, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object2 = ((AndroidViewHolder)object2).a;
                this.a = n4;
                long l4 = this.d;
                long l7 = 0L;
                object = ((pU1)object2).a(l4, l7, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

