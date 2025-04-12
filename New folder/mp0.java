/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class mp0
extends qb3_0
implements np0_0 {
    public final Function0 b;
    public final I83 c;
    public mp0$a d;

    public mp0(I83 object, Function0 function0) {
        this.b = function0;
        this.c = object;
        this.d = object = new mp0$a();
    }

    public final I83 a() {
        return this.c;
    }

    public final void g(Rb3 rb3) {
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        rb3 = (mp0$a)rb3;
        this.d = rb3;
    }

    public final Object getValue() {
        Object object = A83.k().f();
        if (object != null) {
            object.invoke(this);
        }
        object = A83.k();
        mp0$a mp0$a = (mp0$a)A83.j(this.d, (v83_0)object);
        Function0 function0 = this.b;
        return this.x((mp0$a)mp0$a, (v83_0)object, (boolean)true, (Function0)function0).f;
    }

    public final Rb3 h() {
        return this.d;
    }

    public final mp0$a s() {
        v83_0 v83_02 = A83.k();
        mp0$a mp0$a = (mp0$a)A83.j(this.d, v83_02);
        Function0 function0 = this.b;
        return this.x(mp0$a, v83_02, false, function0);
    }

    public final String toString() {
        v83_0 v83_02;
        Object object = (mp0$a)A83.i(this.d);
        object = new StringBuilder("DerivedState(value=");
        Object object2 = (mp0$a)A83.i(this.d);
        boolean bl2 = ((mp0$a)object2).c(this, v83_02 = A83.k());
        object2 = bl2 ? String.valueOf(((mp0$a)object2).f) : "<Not calculated>";
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(")@");
        int n3 = this.hashCode();
        ((StringBuilder)object).append(n3);
        return ((StringBuilder)object).toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final mp0$a x(mp0$a var1_1, v83_0 var2_2, boolean var3_3, Function0 var4_4) {
        block33: {
            block35: {
                block31: {
                    block30: {
                        var5_5 = this;
                        var6_6 = var1_1;
                        var7_10 = var2_2;
                        var8_11 = var1_1.c(this, var2_2);
                        var9_12 = 1;
                        var10_13 = 0;
                        var11_14 = null;
                        if (var8_11 == 0) break block35;
                        if (var3_3 == false) return var6_6;
                        var12_15 = J83.c();
                        var13_17 = var12_15.c;
                        if (var13_17 > 0) {
                            var14_19 = var12_15.a;
                            var15_21 = 0;
                            var16_22 = null;
                            do {
                                var17_24 = (Object[])var14_19[var15_21];
                                var17_24.start();
                            } while ((var15_21 += var9_12) < var13_17);
                        }
                        try {
                            var18_26 = var6_6.e;
                            var14_19 = K83.a;
                            var16_22 = var14_19.a();
                            var16_22 = (Xi1)var16_22;
                            if (var16_22 != null) break block30;
                            var16_22 = new Xi1(0);
                            var14_19.b(var16_22);
                        }
                        catch (Throwable var6_7) {
                            break block31;
                        }
                    }
                    var19_28 = var16_22.a;
                    var17_24 = var18_26.b;
                    var20_30 = var18_26.c;
                    var18_26 = var18_26.a;
                    var21_31 = ((Object)var18_26).length + -2;
                    if (var21_31 < 0) ** GOTO lbl-1000
                    var22_32 = 0;
                    while (true) {
                        var23_33 = var18_26[var22_32];
                        var25_34 = var18_26;
                        var26_35 = var23_33 ^ (long)-1;
                        var28_36 = 7;
                        var26_35 = var26_35 << var28_36 & var23_33;
                        var29_38 = -9187201950435737472L;
                        cfr_temp_0 = (var26_35 &= var29_38) - var29_38;
                        var31_39 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                        if (var31_39 != false) {
                            var10_13 = ~(var22_32 - var21_31) >>> 31;
                            var13_17 = 8;
                            var10_13 = 8 - var10_13;
                            for (var32_40 = 0; var32_40 < var10_13; var23_33 >>= 8, ++var32_40) {
                                block32: {
                                    var33_41 = var23_33 & 255L;
                                    var35_42 = 128L;
                                    cfr_temp_1 = var33_41 - var35_42;
                                    var37_43 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                                    if (var37_43 < 0) {
                                        var38_44 = (var22_32 << 3) + var32_40;
                                        {
                                            var39_45 = var17_24[var38_44];
                                            var38_44 = var20_30[var38_44];
                                            var40_46 = var39_45;
                                            var40_46 = (pb3_0)var39_45;
                                            var16_22.a = var13_17 = var19_28 + var38_44;
                                            var18_26 = var2_2.f();
                                            if (var18_26 == null) break block32;
                                            var18_26.invoke(var40_46);
                                        }
                                    }
                                }
                                var9_12 = 1;
                                var13_17 = 8;
                            }
                            var9_12 = 8;
                            var13_17 = 1;
                            if (var10_13 != var9_12) break;
                        } else {
                            var13_17 = 1;
                        }
                        if (var22_32 == var21_31) break;
                        var22_32 += var13_17;
                        var18_26 = var25_34;
                        var9_12 = 1;
                        var10_13 = 0;
                        var11_14 = null;
                    }
lbl-1000:
                    // 3 sources

                    {
                        var16_22.a = var19_28;
                        var7_10 = Unit.a;
                        var41_48 = var12_15.c;
                        if (var41_48 <= 0) return var6_6;
                        var12_15 = var12_15.a;
                        var10_13 = 0;
                        var11_14 = null;
                    }
                    do {
                        var40_46 = (op0_0)var12_15[var10_13];
                        var40_46.a();
                    } while ((var10_13 += (var9_12 = 1)) < var41_48);
                    return var6_6;
                }
                var41_49 = var12_15.c;
                if (var41_49 <= 0) throw var6_7;
                var12_15 = var12_15.a;
                var10_13 = 0;
                var11_14 = null;
                while (true) {
                    var40_46 = (op0_0)var12_15[var10_13];
                    var40_46.a();
                    var9_12 = 1;
                    if ((var10_13 += var9_12) >= var41_49) throw var6_7;
                }
            }
            var8_11 = 0;
            var7_10 = new gr1_1(null);
            var12_16 /* !! */  = K83.a;
            var40_47 /* !! */  = (Xi1)var12_16 /* !! */ .a();
            if (var40_47 /* !! */  == null) {
                var10_13 = 0;
                var11_14 = null;
                var40_47 /* !! */  = new Xi1(0);
                var12_16 /* !! */ .b(var40_47 /* !! */ );
            } else {
                var10_13 = 0;
                var11_14 = null;
            }
            var8_11 = var40_47 /* !! */ .a;
            var18_27 = J83.c();
            var19_29 = var18_27.c;
            if (var19_29 > 0) {
                var16_23 /* !! */  = var18_27.a;
                var28_37 = 0;
                while (true) {
                    var17_25 = (op0_0)var16_23 /* !! */ [var28_37];
                    var17_25.start();
                    var42_52 = var28_37 + 1;
                    if (var42_52 >= var19_29) break;
                    var28_37 = var42_52;
                }
            }
            var19_29 = var8_11 + 1;
            try {
                var40_47 /* !! */ .a = var19_29;
                var14_20 = new mp0$b(var5_5, (Xi1)var40_47 /* !! */ , (gr1_1)var7_10, var8_11);
                var16_23 /* !! */  = var4_4;
                var14_20 = v83$a.c(var4_4, (Function1)var14_20);
                var40_47 /* !! */ .a = var8_11;
                var8_11 = var18_27.c;
                if (var8_11 <= 0) break block33;
                var40_47 /* !! */  = var18_27.a;
            }
            catch (Throwable var6_9) {
                var41_51 = var18_27.c;
                if (var41_51 <= 0) throw var6_9;
                var12_16 /* !! */  = var18_27.a;
                while (true) {
                    var40_47 /* !! */  = (op0_0)var12_16 /* !! */ [var10_13];
                    var40_47 /* !! */ .a();
                    var9_12 = 1;
                    if ((var10_13 += var9_12) >= var41_51) throw var6_9;
                }
            }
            do {
                var18_27 = (op0_0)var40_47 /* !! */ [var10_13];
                var18_27.a();
            } while ((var10_13 += (var13_18 = 1)) < var8_11);
        }
        var12_16 /* !! */  = A83.c;
        synchronized (var12_16 /* !! */ ) {
            try {
                var40_47 /* !! */  = A83.k();
                var11_14 = var6_6.f;
                var18_27 = mp0$a.h;
                if (var11_14 != var18_27) {
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var6_8) {
                ** break block34
            }
            var18_27 = var5_5.c;
            if (var18_27 != null && (var10_13 = (int)var18_27.b(var14_20, var11_14)) == (var13_18 = 1)) {
                var6_6.e = var7_10;
                var6_6.g = var41_50 = var6_6.d(var5_5, (v83_0)var40_47 /* !! */ );
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = var5_5.d;
                var6_6 = A83.n(var6_6, var5_5, (v83_0)var40_47 /* !! */ );
                var6_6.e = var7_10;
                var6_6.g = var41_50 = var6_6.d(var5_5, (v83_0)var40_47 /* !! */ );
                var6_6.f = var14_20;
            }
        }
        var7_10 = (Xi1)K83.a.a();
        if (var7_10 == null) return var6_6;
        var41_50 = var7_10.a;
        if (var41_50 != 0) return var6_6;
        var7_10 = A83.k();
        var7_10.m();
        synchronized (var12_16 /* !! */ ) {
            var7_10 = A83.k();
            var6_6.c = var9_12 = var7_10.d();
            var6_6.d = var41_50 = var7_10.h();
            var7_10 = Unit.a;
            return var6_6;
        }
lbl-1000:
        // 1 sources

        {
            throw var6_8;
        }
    }
}

