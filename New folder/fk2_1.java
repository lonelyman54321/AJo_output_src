/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Fk2
 */
public final class fk2_1
extends qg3_2
implements Function2 {
    public ks1_1 a;
    public fs0_2 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yk2_1 e;

    public fk2_1(yk2_1 yk2_12, f80_0 f80_02) {
        this.e = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.e;
        fk2_1 fk2_12 = new fk2_1(yk2_12, f80_02);
        fk2_12.d = object;
        return fk2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (fk2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fk2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        block6: {
            Jk2$a jk2$a;
            Object object3;
            int n3;
            j90_0 j90_02;
            block10: {
                int n4;
                block7: {
                    block8: {
                        block9: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.c;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block7;
                            if (n7 == n4) break block8;
                            if (n7 != n3) break block9;
                            vl2_2.b(object);
                            break block6;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object3 = this.b;
                    object2 = this.a;
                    jk2$a = (Jk2$a)this.d;
                    vl2_2.b(object);
                    break block10;
                }
                vl2_2.b(object);
                object3 = object = this.d;
                object3 = (fs0_2)object;
                jk2$a = this.e.k;
                object = jk2$a.a;
                this.d = jk2$a;
                this.a = object;
                this.b = object3;
                this.c = n4;
                object2 = ((ks1_1)object).d(this, null);
                if (object2 == j90_02) {
                    return j90_02;
                }
                object2 = object;
            }
            object = jk2$a.b;
            object = ((Jk2)object).l;
            object = ((AR1)object).d();
            object2 = new rk2$c((Qv1)object, null);
            this.d = null;
            this.a = null;
            this.b = null;
            this.c = n3;
            object = object3.emit(object2, this);
            if (object != j90_02) break block6;
            return j90_02;
        }
        return Unit.a;
        finally {
            object2.b(null);
        }
    }
}

