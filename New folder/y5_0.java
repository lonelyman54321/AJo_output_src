/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from y5
 */
public final class y5_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gx0_2 d;

    public y5_0(gx0_2 gx0_22, f80_0 f80_02) {
        this.d = gx0_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        gx0_2 gx0_22 = this.d;
        y5_0 y5_02 = new y5_0(gx0_22, (f80_0)object3);
        y5_02.b = object;
        y5_02.c = object2;
        object = Unit.a;
        return y5_02.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block7: {
            gx0_2 gx0_22;
            is2_2 is2_22;
            int n3;
            int n4;
            j90_0 j90_02;
            block8: {
                block4: {
                    block5: {
                        block6: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block4;
                            if (n7 == n3) break block5;
                            if (n7 != n4) break block6;
                            vl2_2.b(object);
                            break block7;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    is2_22 = this.b;
                    vl2_2.b(object);
                    break block8;
                }
                vl2_2.b(object);
                is2_22 = this.b;
                object = this.c;
                boolean bl2 = object instanceof bg2_2;
                if (!bl2) {
                    return Unit.a;
                }
                Object object2 = is2_22.a;
                this.b = is2_22;
                this.a = n3;
                gx0_22 = this.d;
                if ((object = gx0_22.invoke(object2, object, this)) == j90_02) {
                    return j90_02;
                }
            }
            object = (bg2_2)object;
            if (object == null) {
                return Unit.a;
            }
            n3 = 0;
            gx0_22 = null;
            this.b = null;
            this.a = n4;
            if ((object = is2_22.d(this, object)) == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

