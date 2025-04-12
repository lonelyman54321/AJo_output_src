/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Rq3
 */
public final class rq3_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public final /* synthetic */ ix0_2 c;

    public rq3_0(ix0_2 ix0_22, f80_0 f80_02) {
        this.c = ix0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        ix0_2 ix0_22 = this.c;
        object2 = new rq3_0(ix0_22, (f80_0)object3);
        ((rq3_0)object2).b = object;
        object = Unit.a;
        return ((rq3_0)object2).invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
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
                qq3_0 qq3_02 = new qq3_0();
                Object object2 = is2_22.a;
                Object object3 = is2_22.b();
                object = (db1_2)is2_22.a;
                object.getClass();
                Object object4 = qj2_1.a;
                Object object5 = object = ((db1_2)object).f.a((xq_2)object4);
                object5 = (at3_0)object;
                this.b = is2_22;
                this.a = n3;
                object4 = this.c;
                object = object4.invoke(qq3_02, object2, object3, object5, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (bg2_2)object;
            if (object != null) {
                n3 = 0;
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

