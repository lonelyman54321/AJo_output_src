/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Za1$b
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ dZ2$a b;
    public /* synthetic */ db1_2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ mv_2 e;

    public Za1$b(boolean bl2, mv_2 mv_22, f80_0 f80_02) {
        this.d = bl2;
        this.e = mv_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (dZ2$a)object;
        object2 = (db1_2)object2;
        object3 = (f80_0)object3;
        mv_2 mv_22 = this.e;
        boolean bl2 = this.d;
        Za1$b za1$b = new Za1$b(bl2, mv_22, (f80_0)object3);
        za1$b.b = object;
        za1$b.c = object2;
        object = Unit.a;
        return za1$b.invokeSuspend(object);
    }

    public final Object invokeSuspend(Object object) {
        block6: {
            pa1_0 pa1_02;
            Object object2;
            Object object3;
            db1_2 db1_22;
            int n3;
            j90_0 j90_02;
            block7: {
                int n4;
                block3: {
                    block4: {
                        block5: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block3;
                            if (n7 == n4) break block4;
                            if (n7 != n3) break block5;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    db1_22 = this.c;
                    object3 = this.b;
                    vl2_2.b(object);
                    break block7;
                }
                vl2_2.b(object);
                object = this.b;
                db1_22 = this.c;
                this.b = object;
                this.c = db1_22;
                this.a = n4;
                object3 = ((dZ2$a)object).a.a(db1_22, this);
                if (object3 == j90_02) {
                    return j90_02;
                }
                Object object4 = object3;
                object3 = object;
                object = object4;
            }
            object = (ea1_2)object;
            boolean bl2 = this.d;
            if (bl2 && !(bl2 = (object2 = za1_1.a).contains(pa1_02 = ((ea1_2)object).c().getMethod()))) {
                return object;
            }
            object2 = this.e.a;
            pa1_02 = null;
            this.b = null;
            this.c = null;
            this.a = n3;
            if ((object = za1_1.a((dZ2$a)object3, db1_22, (ea1_2)object, (da1_2)object2, this)) == j90_02) {
                return j90_02;
            }
        }
        return object;
    }
}

