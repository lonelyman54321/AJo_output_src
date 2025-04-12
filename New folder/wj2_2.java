/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from WJ2
 */
public final class wj2_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ gx0_2 c;

    public wj2_2(gx0_2 gx0_22, f80_0 f80_02) {
        this.c = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.c;
        object2 = new wj2_2(gx0_22, (f80_0)object3);
        ((wj2_2)object2).b = object;
        object = Unit.a;
        return ((wj2_2)object2).invokeSuspend(object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        block7: {
            Throwable throwable2;
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block8: {
                int n7;
                block5: {
                    block6: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        n4 = this.a;
                        n3 = 2;
                        n7 = 1;
                        if (n4 == 0) break block5;
                        if (n4 == n7) break block6;
                        if (n4 != n3) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        break block7;
                    }
                    object2 = this.b;
                    try {
                        vl2_2.b(object);
                        return Unit.a;
                    }
                    catch (Throwable throwable2) {}
                    break block8;
                }
                vl2_2.b(object);
                object2 = this.b;
                {
                    this.b = object2;
                    this.a = n7;
                    object = ((is2_2)object2).c(this);
                    if (object != j90_02) return Unit.a;
                    return j90_02;
                }
            }
            object2 = (db1_2)((is2_2)object2).a;
            Object object3 = W91.a;
            object3 = new aa1_2((db1_2)object2);
            n4 = 0;
            this.b = null;
            this.a = n3;
            object2 = this.c;
            object = object2.invoke(object3, throwable2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (Throwable)object;
        if (object != null) throw object;
        return Unit.a;
    }
}

