/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ik
 */
public final class ik_0
extends qg3_2
implements Function2 {
    public rr_2 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dr_2 d;
    public final /* synthetic */ Lj e;
    public final /* synthetic */ ib3_0 f;
    public final /* synthetic */ ib3_0 g;

    public ik_0(dr_2 dr_22, Lj lj, tr1_0 tr1_02, tr1_0 tr1_03, f80_0 f80_02) {
        this.d = dr_22;
        this.e = lj;
        this.f = tr1_02;
        this.g = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ik_0 ik_02;
        Object object2 = this.f;
        ib3_0 ib3_02 = object2;
        ib3_02 = (tr1_0)object2;
        object2 = this.g;
        ib3_0 ib3_03 = object2;
        ib3_03 = (tr1_0)object2;
        dr_2 dr_22 = this.d;
        Lj lj = this.e;
        object2 = ik_02;
        ik_02 = new ik_0(dr_22, lj, (tr1_0)ib3_02, (tr1_0)ib3_03, f80_02);
        ik_02.c = object;
        return ik_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ik_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ik_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block2: {
            block3: {
                var2_2 = j90_0.COROUTINE_SUSPENDED;
                var3_3 = this.b;
                var4_4 = this.d;
                var5_5 = 1;
                if (var3_3 == 0) break block2;
                if (var3_3 != var5_5) break block3;
                var6_6 = this.a;
                var7_7 = (i90_0)this.c;
                vl2_2.b(var1_1);
                ** GOTO lbl26
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var1_1);
        var1_1 = (i90_0)this.c;
        var6_6 = var4_4.iterator();
        var7_7 = var1_1;
        while (true) {
            this.c = var7_7;
            this.a = var6_6;
            this.b = var5_5;
            var1_1 = var6_6.b(this);
            if (var1_1 == var2_2) {
                return var2_2;
            }
lbl26:
            // 3 sources

            var1_1 = (Boolean)var1_1;
            var8_8 = var1_1.booleanValue();
            if (!var8_8) break;
            var1_1 = var6_6.next();
            var9_9 = vr_2.a(var4_4.m());
            var10_10 = var9_9 == null ? var1_1 : var9_9;
            var11_11 = var9_9 = this.f;
            var11_11 = (tr1_0)var9_9;
            var12_12 = var9_9 = this.g;
            var12_12 = (tr1_0)var9_9;
            var13_13 = this.e;
            var1_1 = new ik$a_0(var10_10, var13_13, (tr1_0)var11_11, (tr1_0)var12_12, null);
            var14_14 = 3;
            Ae3.d((i90_0)var7_7, null, null, (Function2)var1_1, var14_14);
        }
        return Unit.a;
    }
}

