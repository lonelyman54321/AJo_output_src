/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Hk2
 */
public final class hk2_0
extends qg3_2
implements Function2 {
    public Jk2$a a;
    public ks1_1 b;
    public yk2_1 c;
    public int d;
    public final /* synthetic */ yk2_1 e;

    public hk2_0(yk2_1 yk2_12, f80_0 f80_02) {
        this.e = yk2_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yk2_1 yk2_12 = this.e;
        object = new hk2_0(yk2_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hk2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hk2_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        block13: {
            Object object3;
            yk2_1 yk2_12;
            int n3;
            j90_0 j90_02;
            block14: {
                int n4;
                block10: {
                    block11: {
                        block12: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.d;
                            n3 = 2;
                            n4 = 1;
                            if (n7 == 0) break block10;
                            if (n7 == n4) break block11;
                            if (n7 != n3) break block12;
                            vl2_2.b(object);
                            break block13;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    yk2_12 = this.c;
                    object2 = this.b;
                    object3 = this.a;
                    vl2_2.b(object);
                    break block14;
                }
                vl2_2.b(object);
                yk2_12 = this.e;
                object3 = yk2_12.k;
                object = ((Jk2$a)object3).a;
                this.a = object3;
                this.b = object;
                this.c = yk2_12;
                this.d = n4;
                object2 = ((ks1_1)object).d(this, null);
                if (object2 == j90_02) {
                    return j90_02;
                }
                object2 = object;
            }
            object = ((Jk2$a)object3).b;
            object3 = ((Jk2)object).i;
            object3 = ms0_1.g((af2_2)object3);
            lk2_2 lk2_22 = new lk2_2((Jk2)object, null);
            object = new ys0_2((es0_2)object3, lk2_22);
            object2 = Rv1.PREPEND;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = n3;
            object = yk2_1.a(yk2_12, (ys0_2)object, (Rv1)((Object)object2), this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
        finally {
            object2.b(null);
        }
    }
}

