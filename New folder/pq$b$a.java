/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class pq$b$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pq_0 c;

    public pq$b$a(pq_0 pq_02, f80_0 f80_02) {
        this.c = pq_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pq_0 pq_02 = this.c;
        pq$b$a pq$b$a = new pq$b$a(pq_02, f80_02);
        pq$b$a.b = object;
        return pq$b$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (pe1_0)object;
        object2 = (f80_0)object2;
        object = (pq$b$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pq$b$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var1_10;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            object2 = (pq_0)this.b;
            vl2_2.b(object);
        } else {
            yx2_0 yx2_02;
            yx2_0 yx2_03;
            WS2 wS2;
            vl2_2.b(object);
            pe1_0 pe1_02 = (pe1_0)this.b;
            pq_0 pq_02 = this.c;
            ce1_0 ce1_02 = (ce1_0)pq_02.o.getValue();
            pe1$a_0 pe1$a_0 = pe1_0.a(pe1_02);
            rq_0 rq_02 = new rq_0(pq_02);
            pe1$a_0.d = rq_02;
            pe1$a_0.c();
            Yn0 yn0 = pe1_02.L;
            L63 l63 = yn0.b;
            if (l63 == null) {
                tq_0 tq_02 = new tq_0(pq_02);
                pe1$a_0.K = tq_02;
                pe1$a_0.c();
            }
            if ((wS2 = yn0.c) == null) {
                void var8_29;
                boolean bl2;
                i70_0 i70_02 = pq_02.j;
                Object object3 = Lz3.b;
                object3 = i70$a.b;
                boolean bl3 = Intrinsics.areEqual(i70_02, object3);
                if (!bl3 && !(bl2 = Intrinsics.areEqual(i70_02, object3 = i70$a.e))) {
                    WS2 wS22 = WS2.FILL;
                } else {
                    WS2 wS23 = WS2.FIT;
                }
                pe1$a_0.L = var8_29;
            }
            if ((yx2_03 = yn0.i) != (yx2_02 = yx2_0.EXACT)) {
                yx2_0 yx2_04;
                pe1$a_0.j = yx2_04 = yx2_0.INEXACT;
            }
            pe1_0 pe1_03 = pe1$a_0.a();
            this.b = pq_02;
            this.a = n4;
            Object object4 = ce1_02.c(pe1_03, this);
            if (object4 == object2) {
                return object2;
            }
            object2 = pq_02;
        }
        se1_0 se1_02 = (se1_0)var1_10;
        object2.getClass();
        n3 = se1_02 instanceof cg3_2;
        if (n3 != 0) {
            cg3_2 cg3_22 = (cg3_2)se1_02;
            Drawable drawable2 = cg3_22.a;
            object2 = ((pq_0)object2).b(drawable2);
            return new pq$a$d((im2)object2, cg3_22);
        }
        n3 = se1_02 instanceof hb0_0;
        if (n3 == 0) {
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        hb0_0 hb0_02 = (hb0_0)se1_02;
        Drawable drawable3 = hb0_02.a;
        object2 = drawable3 != null ? ((pq_0)object2).b(drawable3) : null;
        return new pq$a$b((im2)object2, hb0_02);
    }
}

