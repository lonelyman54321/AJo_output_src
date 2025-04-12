/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;

public final class KF2
extends qg3_2
implements Function2 {
    public oq_2 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FF2 d;
    public final /* synthetic */ gx0_2 e;
    public final /* synthetic */ yp1_2 f;

    public KF2(FF2 fF2, LF2 lF2, yp1_2 yp1_22, f80_0 f80_02) {
        this.d = fF2;
        this.e = lF2;
        this.f = yp1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        FF2 fF2 = this.d;
        LF2 lF2 = (LF2)this.e;
        yp1_2 yp1_22 = this.f;
        KF2 kF2 = new KF2(fF2, lF2, yp1_22, f80_02);
        kF2.c = object;
        return kF2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (KF2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((KF2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        jr2_1 jr2_12;
        Object object5;
        block26: {
            int n3;
            block25: {
                int n4;
                Object object6;
                Object object7;
                Object object8;
                n3 = 1;
                object5 = j90_0.COROUTINE_SUSPENDED;
                int n7 = this.b;
                jr2_12 = null;
                if (n7 != 0) {
                    if (n7 != n3) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object4 = this.a;
                    object5 = (i)this.c;
                    try {
                        vl2_2.b(object);
                        break block25;
                    }
                    catch (Throwable throwable) {
                        break block26;
                    }
                }
                vl2_2.b(object);
                object = mm0.e(((i90_0)this.c).getCoroutineContext());
                FF2.x(this.d, (i)object);
                object3 = this.d;
                object2 = new KF2$b((FF2)object3);
                object2 = v83$a.d((KF2$b)object2);
                object3 = this.d.u;
                while ((object8 = (lr2)((kb3_2)(object7 = FF2.v)).getValue()) != (object6 = object8.add(object3)) && (n4 = ((kb3_2)object7).j(object8, object6)) == 0) {
                }
                try {
                    object3 = this.d;
                    object7 = ((FF2)object3).b;
                    // MONITORENTER : object7
                    object3 = ((FF2)object3).D();
                    // MONITOREXIT : object7
                    n4 = object3.size();
                    object8 = null;
                    for (int i3 = 0; i3 < n4; i3 += n3) {
                        object6 = object3.get(i3);
                        object6 = (k80)object6;
                        object6.invalidateAll();
                    }
                }
                catch (Throwable throwable) {
                    object5 = object;
                    object = throwable;
                    object4 = object2;
                    break block26;
                }
                object7 = this.e;
                object8 = this.f;
                object7 = (LF2)object7;
                object3 = new KF2$a((LF2)object7, (yp1_2)object8, null);
                this.c = object;
                this.a = object2;
                this.b = n3;
                object4 = kotlinx.coroutines.d.c((Function2)object3, this);
                if (object4 == object5) {
                    return object5;
                }
                object5 = object;
                object4 = object2;
            }
            ((oq_2)object4).a();
            object = this.d;
            object4 = ((FF2)object).b;
            // MONITORENTER : object4
            object2 = ((FF2)object).c;
            if (object2 == object5) {
                ((FF2)object).c = null;
            }
            ((FF2)object).A();
            // MONITOREXIT : object4
            object = FF2.v;
            object = this.d.u;
            do {
                if ((object5 = (lr2)((kb3_2)(object4 = FF2.v)).getValue()) == (object2 = object5.remove(object))) return Unit.a;
            } while ((n3 = (int)(((kb3_2)object4).j(object5, object2) ? 1 : 0)) == 0);
            return Unit.a;
        }
        ((oq_2)object4).a();
        object4 = this.d;
        object2 = ((FF2)object4).b;
        // MONITORENTER : object2
        object3 = ((FF2)object4).c;
        if (object3 == object5) {
            ((FF2)object4).c = null;
        }
        ((FF2)object4).A();
        // MONITOREXIT : object2
        object4 = FF2.v;
        object4 = this.d.u;
        while ((object2 = (lr2)((kb3_2)(object5 = FF2.v)).getValue()) != (jr2_12 = object2.remove(object4))) {
            boolean bl2 = ((kb3_2)object5).j(object2, jr2_12);
            if (bl2) throw object;
        }
        throw object;
    }
}

