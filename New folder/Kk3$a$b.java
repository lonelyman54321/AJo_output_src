/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Kk3$a$b
extends qg3_2
implements Function2 {
    public tr1_0 a;
    public int b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wr1_1 e;

    public Kk3$a$b(tr1_0 tr1_02, boolean bl2, wr1_1 wr1_12, f80_0 f80_02) {
        this.c = tr1_02;
        this.d = bl2;
        this.e = wr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.d;
        wr1_1 wr1_12 = this.e;
        tr1_0 tr1_02 = this.c;
        object = new Kk3$a$b(tr1_02, bl2, wr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Kk3$a$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Kk3$a$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block7: {
            Object object2;
            block8: {
                block6: {
                    int n3;
                    block4: {
                        block5: {
                            object2 = j90_0.COROUTINE_SUSPENDED;
                            int n4 = this.b;
                            n3 = 1;
                            if (n4 == 0) break block4;
                            if (n4 != n3) break block5;
                            object2 = this.a;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    object = this.c;
                    Object object3 = (Ey2$b)object.getValue();
                    if (object3 == null) break block7;
                    boolean bl2 = this.d;
                    ey2_0 ey2_02 = bl2 ? new Ey2$c((Ey2$b)object3) : new Ey2$a((Ey2$b)object3);
                    object3 = this.e;
                    if (object3 == null) break block8;
                    this.a = object;
                    this.b = n3;
                    if ((object3 = object3.a(ey2_02, this)) == object2) {
                        return object2;
                    }
                    object2 = object;
                }
                object = object2;
            }
            object2 = null;
            object.setValue(null);
        }
        return Unit.a;
    }
}

