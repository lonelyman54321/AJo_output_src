/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class eR1$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ef_2 c;
    public final /* synthetic */ u90_0 d;

    public eR1$a(ef_2 ef_22, u90_0 u90_02, f80_0 f80_02) {
        this.c = ef_22;
        this.d = u90_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ef_2 ef_22 = this.c;
        u90_0 u90_02 = this.d;
        eR1$a eR1$a = new eR1$a(ef_22, u90_02, f80_02);
        eR1$a.b = object;
        return eR1$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (eR1$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((eR1$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                int n7;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.a;
                            n3 = 2;
                            n7 = 1;
                            if (n4 == 0) break block2;
                            if (n4 == n7) break block3;
                            if (n4 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (sj3_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (sj3_2)object;
                gf_2 gf_22 = ((sj3_2)object2).a;
                this.b = object2;
                this.a = n7;
                object = hr1_2.a;
                boolean bl2 = true;
                u90_0 u90_02 = this.d;
                ef_2 ef_22 = this.c;
                long l2 = 8193L;
                object = wf_1.m(u90_02, ef_22, gf_22, l2, bl2, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = ((sj3_2)object2).a;
            n4 = 0;
            object2 = null;
            this.b = null;
            this.a = n3;
            object = object.c(this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

