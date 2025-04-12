/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from qJ2
 */
public final class qj2_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gx0_2 d;

    public qj2_2(gx0_2 gx0_22, f80_0 f80_02) {
        this.d = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.d;
        qj2_2 qj2_22 = new qj2_2(gx0_22, (f80_0)object3);
        qj2_22.b = object;
        qj2_22.c = object2;
        object = Unit.a;
        return qj2_22.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            gx0_2 gx0_22;
            is2_2 is2_22;
            int n3;
            int n4;
            j90_0 j90_02;
            block7: {
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n3) break block4;
                            if (n7 != n4) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    is2_22 = this.b;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                is2_22 = this.b;
                object = this.c;
                Object object2 = is2_22.a;
                this.b = is2_22;
                this.a = n3;
                gx0_22 = this.d;
                object = gx0_22.invoke(object2, object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (bg2_2)object;
            if (object != null) {
                n3 = 0;
                gx0_22 = null;
                this.b = null;
                this.a = n4;
                if ((object = is2_22.d(this, object)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

