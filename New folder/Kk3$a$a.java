/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Kk3$a$a
extends qg3_2
implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ wr1_1 e;

    public Kk3$a$a(tr1_0 tr1_02, long l2, wr1_1 wr1_12, f80_0 f80_02) {
        this.c = tr1_02;
        this.d = l2;
        this.e = wr1_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.d;
        wr1_1 wr1_12 = this.e;
        tr1_0 tr1_02 = this.c;
        object = new Kk3$a$a(tr1_02, l2, wr1_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Kk3$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Kk3$a$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        tr1_0 tr1_02;
        block15: {
            Object object2;
            block12: {
                Object object3;
                int n3;
                wr1_1 wr1_12;
                block14: {
                    block13: {
                        int n4;
                        block9: {
                            block10: {
                                block11: {
                                    object2 = j90_0.COROUTINE_SUSPENDED;
                                    int n7 = this.b;
                                    wr1_12 = this.e;
                                    n3 = 2;
                                    n4 = 1;
                                    tr1_02 = this.c;
                                    if (n7 == 0) break block9;
                                    if (n7 == n4) break block10;
                                    if (n7 != n3) break block11;
                                    object2 = (Ey2$b)this.a;
                                    vl2_2.b(object);
                                    break block12;
                                }
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            object3 = (tr1_0)this.a;
                            vl2_2.b(object);
                            break block13;
                        }
                        vl2_2.b(object);
                        object = (Ey2$b)tr1_02.getValue();
                        if (object == null) break block14;
                        object3 = new Ey2$a((Ey2$b)object);
                        if (wr1_12 != null) {
                            this.a = tr1_02;
                            this.b = n4;
                            object = wr1_12.a((kj1)object3, this);
                            if (object == object2) {
                                return object2;
                            }
                        }
                        object3 = tr1_02;
                    }
                    object = null;
                    object3.setValue(null);
                }
                long l2 = this.d;
                object = new Ey2$b(l2);
                if (wr1_12 == null) break block15;
                this.a = object;
                this.b = n3;
                object3 = wr1_12.a((kj1)object, this);
                if (object3 == object2) {
                    return object2;
                }
                object2 = object;
            }
            object = object2;
        }
        tr1_02.setValue(object);
        return Unit.a;
    }
}

