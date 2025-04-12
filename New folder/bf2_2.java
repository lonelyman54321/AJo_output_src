/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from bF2
 */
public final class bf2_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ gx0_2 c;

    public bf2_2(gx0_2 gx0_22, f80_0 f80_02) {
        this.c = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object2 = (kb1_2)object2;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.c;
        object2 = new bf2_2(gx0_22, (f80_0)object3);
        ((bf2_2)object2).b = object;
        object = Unit.a;
        return ((bf2_2)object2).invokeSuspend(object);
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
            i90_0 i90_02;
            int n3;
            int n4;
            j90_0 j90_02;
            block8: {
                block5: {
                    block6: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n7 = this.a;
                        n4 = 2;
                        n3 = 1;
                        if (n7 == 0) break block5;
                        if (n7 == n3) break block6;
                        if (n7 != n4) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        break block7;
                    }
                    i90_02 = this.b;
                    try {
                        vl2_2.b(object);
                        return Unit.a;
                    }
                    catch (Throwable throwable2) {}
                    break block8;
                }
                vl2_2.b(object);
                i90_02 = this.b;
                {
                    this.b = i90_02;
                    this.a = n3;
                    object = i90_02.c(this);
                    if (object != j90_02) return Unit.a;
                    return j90_02;
                }
            }
            i90_02 = ((ea1_2)i90_02.a).c();
            n3 = 0;
            this.b = null;
            this.a = n4;
            gx0_2 gx0_22 = this.c;
            object = gx0_22.invoke(i90_02, throwable2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (Throwable)object;
        if (object != null) throw object;
        return Unit.a;
    }
}

