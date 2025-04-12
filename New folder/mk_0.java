/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from mk
 */
public final class mk_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ bb1_1 d;
    public final /* synthetic */ QB1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ PB1 i;
    public final /* synthetic */ OB1 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ tr1_0 l;

    public mk_0(boolean bl2, boolean bl3, bb1_1 bb1_12, QB1 qB1, int n3, boolean bl4, float f5, PB1 pB1, OB1 oB1, boolean bl5, tr1_0 tr1_02, f80_0 f80_02) {
        this.b = bl2;
        this.c = bl3;
        this.d = bb1_12;
        this.e = qB1;
        this.f = n3;
        this.g = bl4;
        this.h = f5;
        this.i = pB1;
        this.j = oB1;
        this.k = bl5;
        this.l = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.k;
        tr1_0 tr1_02 = this.l;
        boolean bl3 = this.b;
        boolean bl4 = this.c;
        bb1_1 bb1_12 = this.d;
        QB1 qB1 = this.e;
        int n3 = this.f;
        boolean bl5 = this.g;
        float f5 = this.h;
        PB1 pB1 = this.i;
        OB1 oB1 = this.j;
        object = new mk_0(bl3, bl4, bb1_12, qB1, n3, bl5, f5, pB1, oB1, bl2, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mk_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mk_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        boolean bl2;
        QB1 qB1;
        int n3;
        int n4;
        boolean bl3;
        int n7;
        tr1_0 tr1_02;
        Object object3;
        j90_0 j90_02;
        block8: {
            void var9_14;
            float f5;
            float f6;
            block9: {
                block12: {
                    block10: {
                        PB1 pB1;
                        block11: {
                            boolean bl4;
                            boolean bl5;
                            int n8;
                            block7: {
                                j90_02 = j90_0.COROUTINE_SUSPENDED;
                                int n10 = this.a;
                                object3 = this.d;
                                tr1_02 = this.l;
                                n7 = 2;
                                bl3 = this.b;
                                n8 = 1;
                                if (n10 == 0) break block7;
                                if (n10 != n8) {
                                    if (n10 == n7) {
                                        vl2_2.b(object);
                                        return Unit.a;
                                    }
                                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw object;
                                }
                                vl2_2.b(object);
                                break block8;
                            }
                            vl2_2.b(object);
                            if (!bl3 || (bl5 = ((Boolean)(object = (Boolean)tr1_02.getValue())).booleanValue()) || !(bl4 = this.c)) break block8;
                            this.a = n8;
                            object = object3.p();
                            pB1 = object3.r();
                            float f7 = object3.j();
                            n4 = 1065353216;
                            f6 = 1.0f;
                            n3 = 0;
                            float f8 = f7 - 0.0f;
                            Object object4 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                            if (object4 < 0 && object == null) break block9;
                            if (object == null) break block10;
                            if (object4 >= 0) break block11;
                            if (pB1 == null) break block9;
                            f5 = pB1.a();
                            break block12;
                        }
                        if (pB1 == null) break block10;
                        f5 = pB1.b();
                        break block12;
                    }
                    n4 = 0;
                    f6 = 0.0f;
                    break block9;
                }
                f6 = f5;
            }
            qB1 = object3.p();
            f5 = object3.l();
            float f11 = f6 - f5;
            Object object5 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (object5 == false) {
                boolean bl6 = true;
                f5 = Float.MIN_VALUE;
            } else {
                boolean bl7 = false;
                f5 = 0.0f;
                object = null;
            }
            bl2 = var9_14 ^ 1;
            n3 = 1;
            object2 = object3;
            object = object3.n(qB1, f6, n3, bl2, this);
            if (object != j90_02) {
                object = Unit.a;
            }
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = bl3;
        tr1_02.setValue(object);
        if (!bl3) {
            return Unit.a;
        }
        float f12 = object3.l();
        this.a = n7;
        n4 = object3.m();
        OB1 oB1 = this.j;
        boolean bl8 = this.k;
        qB1 = this.e;
        n3 = this.f;
        bl2 = this.g;
        float f14 = this.h;
        object = this.i;
        n7 = 0;
        object2 = object3;
        object3 = object;
        if ((object = object2.q(qB1, n4, n3, bl2, f14, (PB1)object, f12, false, oB1, bl8, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

