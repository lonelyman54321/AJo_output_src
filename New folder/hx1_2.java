/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Hx1
 */
public final class hx1_2
extends qg3_2
implements Function2 {
    public long a;
    public int b;
    public final /* synthetic */ if_1 c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ int e;
    public final /* synthetic */ uf_1 f;

    public hx1_2(if_1 if_12, byte[] byArray, int n3, uf_1 uf_12, f80_0 f80_02) {
        this.c = if_12;
        this.d = byArray;
        this.e = n3;
        this.f = uf_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.e;
        uf_1 uf_12 = this.f;
        if_1 if_12 = this.c;
        byte[] byArray = this.d;
        object = new hx1_2(if_12, byArray, n3, uf_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (hx1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hx1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        block7: {
            long l3;
            if_1 if_12;
            int n3;
            j90_0 j90_02;
            block8: {
                int n4;
                block9: {
                    int n7;
                    int n8;
                    block3: {
                        block4: {
                            block5: {
                                block6: {
                                    j90_02 = j90_0.COROUTINE_SUSPENDED;
                                    n8 = this.b;
                                    n3 = 3;
                                    n4 = 2;
                                    n7 = 1;
                                    if_12 = this.c;
                                    if (n8 == 0) break block3;
                                    if (n8 == n7) break block4;
                                    if (n8 == n4) break block5;
                                    if (n8 != n3) break block6;
                                    l2 = this.a;
                                    vl2_2.b(object);
                                    break block7;
                                }
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            vl2_2.b(object);
                            break block8;
                        }
                        vl2_2.b(object);
                        break block9;
                    }
                    vl2_2.b(object);
                    this.b = n7;
                    object = this.d;
                    n8 = 0;
                    n7 = this.e;
                    object = kf_1.b(if_12, (byte[])object, 0, n7, this);
                    if (object == j90_02) {
                        return j90_02;
                    }
                }
                this.b = n4;
                object = wf_1.b(this.f, if_12, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            this.a = l3 = ((Number)object).longValue();
            this.b = n3;
            object = if_12.c(this);
            if (object == j90_02) {
                return j90_02;
            }
            l2 = l3;
        }
        object = new Long(l2);
        return object;
    }
}

