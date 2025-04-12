/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class nF$a
extends qg3_2
implements Function2 {
    public Object a;
    public uf_1 b;
    public qb2_2 c;
    public Long d;
    public Object e;
    public byte[] f;
    public long g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ uf_1 k;
    public final /* synthetic */ qb2_2 l;
    public final /* synthetic */ Long m;

    public nF$a(uf_1 uf_12, qb2_2 qb2_22, Long l2, f80_0 f80_02) {
        this.k = uf_12;
        this.l = qb2_22;
        this.m = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qb2_2 qb2_22 = this.l;
        Long l2 = this.m;
        uf_1 uf_12 = this.k;
        nF$a nF$a = new nF$a(uf_12, qb2_22, l2, f80_02);
        nF$a.j = object;
        return nF$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (nF$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nF$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block22: {
            block25: {
                block26: {
                    block27: {
                        var2_2 = this;
                        var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var4_11 = this.i;
                        var5_12 = null;
                        var6_13 = 4;
                        var7_14 = 3;
                        var8_15 = 2;
                        var9_16 = 1;
                        if (var4_11 == 0) ** GOTO lbl93
                        if (var4_11 == var9_16) ** GOTO lbl74
                        if (var4_11 == var8_15) break block26;
                        if (var4_11 == var7_14) break block27;
                        if (var4_11 != var6_13) {
                            var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var3_3 /* !! */ ;
                        }
                        var10_17 = this.a;
                        var3_3 /* !! */  = this.j;
                        var5_12 = var3_3 /* !! */ ;
                        var5_12 = (p62_0)var3_3 /* !! */ ;
                        vl2_2.b(var1_1);
                        ** GOTO lbl-1000
                        {
                            catch (Throwable var3_4) {
                                break block22;
                            }
                        }
                    }
                    var11_18 = this.g;
                    var10_17 = this.f;
                    var13_19 = this.e;
                    var14_20 = this.d;
                    var15_21 = this.c;
                    var16_22 = this.b;
                    var17_23 = (p62_0)this.a;
                    var18_24 = (sj3_2)this.j;
                    try {
                        vl2_2.b(var1_1);
                        var19_25 = var11_18;
                        var21_26 = var13_19;
                        var22_27 = var14_20;
                        var23_28 = var15_21;
                        var13_19 = var16_22;
                        var9_16 = 3;
                        var24_29 = 2;
                        var15_21 = var18_24;
                        var18_24 = var17_23;
                        ** GOTO lbl179
                    }
                    catch (Throwable var3_5) {
                        var5_12 = var17_23;
                        var10_17 = var13_19;
                        break block22;
                    }
                }
                var4_11 = this.h;
                var25_30 = this.g;
                var17_23 = this.f;
                var22_27 = this.e;
                var23_28 = this.d;
                var13_19 = this.c;
                var14_20 = this.b;
                var15_21 = (p62_0)this.a;
                var16_22 = (sj3_2)this.j;
                try {
                    vl2_2.b(var1_1);
                    var19_25 = var25_30;
                    var21_26 = var22_27;
                    var18_24 = var16_22;
                    var16_22 = var14_20;
                    var24_29 = 2;
                    var27_31 = var13_19;
                    var13_19 = var23_28;
                    var23_28 = var27_31;
                    ** GOTO lbl155
                }
                catch (Throwable var3_6) {
                    block28: {
                        var10_17 = var22_27;
                        break block28;
lbl74:
                        // 1 sources

                        var25_30 = this.g;
                        var10_17 = this.f;
                        var17_23 = this.e;
                        var22_27 = this.d;
                        var23_28 = this.c;
                        var13_19 = this.b;
                        var14_20 = (p62_0)this.a;
                        var15_21 = (sj3_2)this.j;
                        try {
                            vl2_2.b(var1_1);
                            var16_22 = var1_1;
                            var19_25 = var25_30;
                            var21_26 = var17_23;
                            var18_24 = var14_20;
                            ** GOTO lbl130
                        }
                        catch (Throwable var3_8) {
                            var10_17 = var17_23;
                            var5_12 = var14_20;
                            break block22;
                        }
lbl93:
                        // 1 sources

                        vl2_2.b(var1_1);
                        var10_17 = (sj3_2)this.j;
                        var18_24 = xe_0.a;
                        var17_23 = var21_26 = var18_24.g0();
                        var17_23 = (byte[])var21_26;
                        var22_27 = this.k;
                        var23_28 = this.l;
                        var13_19 = this.m;
                        var15_21 = var10_17;
                        var10_17 = var17_23;
                        var19_25 = 0L;
                        var27_31 = var13_19;
                        var13_19 = var22_27;
                        var22_27 = var27_31;
                    }
lbl110:
                    // 2 sources

                    while (true) {
                        var5_12 = var15_21;
                        break block22;
                        break;
                    }
                }
                while (true) {
                    block24: {
                        block23: {
                            var28_32 = var13_19.i();
                            if (var28_32 != 0) break;
                            var2_2.j = var15_21;
                            var2_2.a = var18_24;
                            var2_2.b = var13_19;
                            var2_2.c = var23_28;
                            var2_2.d = var22_27;
                            var2_2.e = var21_26;
                            var2_2.f = (byte[])var10_17;
                            var2_2.g = var19_25;
                            var2_2.i = var9_16;
                            var28_32 = ((Object)var10_17).length;
                            var16_22 = wf_1.f((uf_1)var13_19, (byte[])var10_17, 0, var28_32, var2_2);
                            if (var16_22 != var3_3 /* !! */ ) break block23;
                            return var3_3 /* !! */ ;
                        }
                        var16_22 = (Number)var16_22;
                        var28_32 = var16_22.intValue();
                        if (var28_32 <= 0) break block24;
                        var17_23 = var15_21.a;
                        var2_2.j = var15_21;
                        var2_2.a = var18_24;
                        var2_2.b = var13_19;
                        var2_2.c = var23_28;
                        var2_2.d = var22_27;
                        var2_2.e = var21_26;
                        var2_2.f = (byte[])var10_17;
                        var2_2.g = var19_25;
                        var2_2.h = var28_32;
                        var2_2.i = var24_29 = 2;
                        if ((var17_23 = kf_1.b((gf_2)var17_23, (byte[])var10_17, 0, var28_32, var2_2)) == var3_3 /* !! */ ) {
                            return var3_3 /* !! */ ;
                        }
                        var17_23 = var10_17;
                        var4_11 = var28_32;
                        var16_22 = var13_19;
                        var13_19 = var22_27;
                        var27_31 = var15_21;
                        var15_21 = var18_24;
                        var18_24 = var27_31;
lbl155:
                        // 2 sources

                        var29_33 = var4_11;
                        var19_25 += var29_33;
                        try {
                            var2_2.j = var18_24;
                            var2_2.a = var15_21;
                            var2_2.b = var16_22;
                            var2_2.c = var23_28;
                            var2_2.d = var13_19;
                            var2_2.e = var21_26;
                            var2_2.f = (byte[])var17_23;
                            var2_2.g = var19_25;
                            var2_2.i = var9_16 = 3;
                            var10_17 = var23_28.a();
                            if (var10_17 == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            }
                            var10_17 = var17_23;
                            var22_27 = var13_19;
                            var13_19 = var16_22;
                            var27_31 = var15_21;
                            var15_21 = var18_24;
                            var18_24 = var27_31;
                        }
                        catch (Throwable var3_9) {
                            var10_17 = var21_26;
                            ** continue;
                        }
lbl179:
                        // 2 sources

                        var9_16 = 1;
                        continue;
                    }
                    var24_29 = 2;
                }
                try {
                    var10_17 = var13_19.f();
                    var5_12 = var15_21.a;
                    kf_1.a((gf_2)var5_12, (Throwable)var10_17);
                    if (var10_17 != null || (var6_13 = (int)((cfr_temp_0 = var19_25 - (var31_34 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) != 0) break block25;
                    var2_2.j = var18_24;
                    var2_2.a = var21_26;
                    var4_11 = 0;
                    var10_17 = null;
                    var2_2.b = null;
                    var2_2.c = null;
                    var2_2.d = null;
                    var2_2.e = null;
                    var2_2.f = null;
                    var2_2.i = var4_11 = 4;
                    var10_17 = var23_28.a();
                    if (var10_17 == var3_3 /* !! */ ) {
                        return var3_3 /* !! */ ;
                    }
                }
                catch (Throwable var3_10) {
                    var5_12 = var18_24;
                    var10_17 = var21_26;
                    break block22;
                }
            }
            var5_12 = var18_24;
            var10_17 = var21_26;
lbl-1000:
            // 2 sources

            {
                var3_3 /* !! */  = Unit.a;
                var5_12.C0(var10_17);
                return Unit.a;
            }
        }
        var5_12.C0(var10_17);
        throw var3_7;
    }
}

