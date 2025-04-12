/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from UU0
 */
public final class uu0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ vu0_1 c;
    public final /* synthetic */ ut3 d;

    public uu0_2(vu0_1 vu0_12, ut3 ut32) {
        this.c = vu0_12;
        this.d = ut32;
        super(1);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object var1_1) {
        block94: {
            block71: {
                block68: {
                    block66: {
                        block76: {
                            block75: {
                                block73: {
                                    block74: {
                                        block72: {
                                            block70: {
                                                var2_2 = this;
                                                var3_3 = 1;
                                                var4_4 = var1_1;
                                                var4_4 = (Function1)var1_1;
                                                var5_5 = this.c;
                                                var6_9 = var5_5.d;
                                                var7_10 = this.d;
                                                var8_11 = var5_5.a;
                                                var9_12 = var5_5.f;
                                                var6_9.getClass();
                                                var5_5 = var7_10.a;
                                                var10_13 = var5_5 instanceof av0_0;
                                                if (var10_13 != 0) break block70;
                                                var11_14 = 0;
                                                var9_12 = null;
                                                break block71;
                                            }
                                            var5_5 = ((av0_0)var5_5).f;
                                            var12_15 = var7_10.b;
                                            var13_16 = var7_10.c;
                                            var15_18 = var5_5.size();
                                            var14_17 /* !! */  = new ArrayList<E>(var15_18);
                                            var15_18 = var5_5.size();
                                            var17_20 = null;
                                            for (var16_19 = 0; var16_19 < var15_18; var16_19 += var3_3) {
                                                var19_22 = var18_21 = var5_5.get(var16_19);
                                                var19_22 = (LU0)var18_21;
                                                var20_23 = var19_22.getWeight();
                                                var21_24 = (int)Intrinsics.areEqual(var20_23, var12_15);
                                                if (var21_24 == 0 || (var21_24 = (int)nV0.a(var19_22.b(), var13_16)) == 0) continue;
                                                var14_17 /* !! */ .add(var18_21);
                                            }
                                            var21_24 = var14_17 /* !! */ .isEmpty() ^ var3_3;
                                            if (var21_24 != 0) ** GOTO lbl116
                                            var21_24 = var5_5.size();
                                            var14_17 /* !! */  = new ArrayList<E>(var21_24);
                                            var21_24 = var5_5.size();
                                            var22_25 = null;
                                            for (var15_18 = 0; var15_18 < var21_24; var15_18 += var3_3) {
                                                var18_21 = var17_20 = (Object)var5_5.get(var15_18);
                                                var18_21 = (LU0)var17_20;
                                                var23_26 = nV0.a(var18_21.b(), var13_16);
                                                if (var23_26 == 0) continue;
                                                var14_17 /* !! */ .add(var17_20);
                                            }
                                            var13_16 = (int)var14_17 /* !! */ .isEmpty();
                                            if (var13_16 == 0) {
                                                var5_5 = var14_17 /* !! */ ;
                                            }
                                            var5_5 = (List)var5_5;
                                            var24_27 = tv0_0.e;
                                            var13_16 = var12_15.a((tv0_0)var24_27);
                                            var25_28 = var12_15.a;
                                            if (var13_16 >= 0) break block72;
                                            var10_13 = var5_5.size();
                                            var13_16 = 0;
                                            var24_27 = null;
                                            var21_24 = 0;
                                            var20_23 = null;
                                            var22_25 = null;
                                            break block73;
                                        }
                                        var27_30 = tv0_0.f;
                                        var10_13 = var12_15.a((tv0_0)var27_30);
                                        if (var10_13 <= 0) break block74;
                                        var26_29 = var5_5.size();
                                        var10_13 = 0;
                                        var12_15 = null;
                                        var13_16 = 0;
                                        var24_27 = null;
                                        var20_23 = null;
                                        break block75;
                                    }
                                    var10_13 = var5_5.size();
                                    var13_16 = 0;
                                    var24_27 = null;
                                    var21_24 = 0;
                                    var20_23 = null;
                                    var22_25 = null;
                                    break block76;
                                }
                                for (var15_18 = 0; var15_18 < var10_13; var15_18 += var3_3) {
                                    var17_20 = ((LU0)var5_5.get(var15_18)).getWeight();
                                    var23_26 = Intrinsics.compare(var17_20.a, var25_28);
                                    var26_29 = var17_20.a;
                                    if (var23_26 < 0) {
                                        if (var24_27 != null && (var26_29 = Intrinsics.compare(var26_29, var23_26 = var24_27.a)) <= 0) continue;
                                        var24_27 = var17_20;
                                        continue;
                                    }
                                    var23_26 = Intrinsics.compare(var26_29, var25_28);
                                    if (var23_26 > 0) {
                                        if (var20_23 != null && (var26_29 = Intrinsics.compare(var26_29, var23_26 = var20_23.a)) >= 0) continue;
                                        var20_23 = var17_20;
                                        continue;
                                    }
                                    var24_27 = var17_20;
                                    var20_23 = var17_20;
                                    break;
                                }
                                if (var24_27 == null) {
                                    var24_27 = var20_23;
                                }
                                var10_13 = var5_5.size();
                                var27_30 = new Object(var10_13);
                                var10_13 = var5_5.size();
                                var14_17 /* !! */  = null;
                                for (var25_28 = 0; var25_28 < var10_13; var25_28 += var3_3) {
                                    var22_25 = var20_23 = var5_5.get(var25_28);
                                    var22_25 = ((LU0)var20_23).getWeight();
                                    var15_18 = (int)Intrinsics.areEqual(var22_25, var24_27);
                                    if (var15_18 == 0) continue;
                                    var27_30.add(var20_23);
                                }
lbl114:
                                // 4 sources

                                while (true) {
                                    var14_17 /* !! */  = var27_30;
lbl116:
                                    // 2 sources

                                    var27_30 = var6_9.a;
                                    var3_3 = var14_17 /* !! */ .size();
                                    var10_13 = 0;
                                    var12_15 = null;
                                    var24_27 = null;
                                    break block66;
                                    break;
                                }
                            }
                            for (var21_24 = 0; var21_24 < var26_29; var21_24 += var3_3) {
                                var22_25 = ((LU0)var5_5.get(var21_24)).getWeight();
                                var16_19 = Intrinsics.compare(var22_25.a, var25_28);
                                var23_26 = var22_25.a;
                                if (var16_19 < 0) {
                                    if (var12_15 != null) {
                                        var16_19 = var12_15.a;
                                        if ((var16_19 = Intrinsics.compare(var23_26, var16_19)) <= 0) continue;
                                    }
                                    var12_15 = var22_25;
                                    continue;
                                }
                                var16_19 = Intrinsics.compare(var23_26, var25_28);
                                if (var16_19 > 0) {
                                    if (var24_27 != null) {
                                        var16_19 = var24_27.a;
                                        if ((var16_19 = Intrinsics.compare(var23_26, var16_19)) >= 0) continue;
                                    }
                                    var24_27 = var22_25;
                                    continue;
                                }
                                var12_15 = var22_25;
                                var24_27 = var22_25;
                                break;
                            }
                            if (var24_27 != null) {
                                var12_15 = var24_27;
                            }
                            var13_16 = var5_5.size();
                            var27_30 = new Object(var13_16);
                            var13_16 = var5_5.size();
                            var25_28 = 0;
                            var14_17 /* !! */  = null;
                            while (true) {
                                if (var25_28 >= var13_16) ** GOTO lbl114
                                var22_25 = var20_23 = var5_5.get(var25_28);
                                var22_25 = ((LU0)var20_23).getWeight();
                                var15_18 = (int)Intrinsics.areEqual(var22_25, var12_15);
                                if (var15_18 != 0) {
                                    var27_30.add(var20_23);
                                }
                                var25_28 += var3_3;
                            }
                        }
                        for (var15_18 = 0; var15_18 < var10_13; var15_18 += var3_3) {
                            block80: {
                                block77: {
                                    block81: {
                                        block78: {
                                            block79: {
                                                var17_20 = ((LU0)var5_5.get(var15_18)).getWeight();
                                                var23_26 = var17_20.a;
                                                var3_3 = var27_30.a;
                                                if ((var3_3 = Intrinsics.compare(var23_26, var3_3)) > 0) break block77;
                                                var3_3 = Intrinsics.compare(var17_20.a, var25_28);
                                                var23_26 = var17_20.a;
                                                if (var3_3 >= 0) break block78;
                                                if (var24_27 == null) break block79;
                                                var3_3 = var24_27.a;
                                                if ((var3_3 = Intrinsics.compare(var23_26, var3_3)) <= 0) break block77;
                                            }
                                            var24_27 = var17_20;
                                            break block77;
                                        }
                                        var3_3 = Intrinsics.compare(var23_26, var25_28);
                                        if (var3_3 <= 0) break block80;
                                        if (var20_23 == null) break block81;
                                        var3_3 = var20_23.a;
                                        if ((var3_3 = Intrinsics.compare(var23_26, var3_3)) >= 0) break block77;
                                    }
                                    var20_23 = var17_20;
                                }
                                var3_3 = 1;
                                continue;
                            }
                            var24_27 = var17_20;
                            var20_23 = var17_20;
                            break;
                        }
                        if (var20_23 != null) {
                            var24_27 = var20_23;
                        }
                        var3_3 = var5_5.size();
                        var27_30 = new Object(var3_3);
                        var3_3 = var5_5.size();
                        var12_15 = null;
                        for (var10_13 = 0; var10_13 < var3_3; var10_13 += var21_24) {
                            var22_25 = var20_23 = var5_5.get(var10_13);
                            var22_25 = ((LU0)var20_23).getWeight();
                            var15_18 = (int)Intrinsics.areEqual(var22_25, var24_27);
                            if (var15_18 != 0) {
                                var27_30.add(var20_23);
                            }
                            var21_24 = 1;
                        }
                        var3_3 = (int)var27_30.isEmpty();
                        if (var3_3 == 0) ** GOTO lbl114
                        var27_30 = tv0_0.f;
                        var3_3 = var5_5.size();
                        var10_13 = 0;
                        var12_15 = null;
                        var13_16 = 0;
                        var24_27 = null;
                        var20_23 = null;
                        for (var21_24 = 0; var21_24 < var3_3; var21_24 += var15_18) {
                            block86: {
                                block83: {
                                    block87: {
                                        block84: {
                                            block85: {
                                                block82: {
                                                    var22_25 = ((LU0)var5_5.get(var21_24)).getWeight();
                                                    if (var27_30 == null) break block82;
                                                    var16_19 = var22_25.a;
                                                    var23_26 = var27_30.a;
                                                    if ((var16_19 = Intrinsics.compare(var16_19, var23_26)) < 0) break block83;
                                                }
                                                var16_19 = Intrinsics.compare(var22_25.a, var25_28);
                                                var23_26 = var22_25.a;
                                                if (var16_19 >= 0) break block84;
                                                if (var12_15 == null) break block85;
                                                var16_19 = var12_15.a;
                                                if ((var16_19 = Intrinsics.compare(var23_26, var16_19)) <= 0) break block83;
                                            }
                                            var12_15 = var22_25;
                                            break block83;
                                        }
                                        var16_19 = Intrinsics.compare(var23_26, var25_28);
                                        if (var16_19 <= 0) break block86;
                                        if (var24_27 == null) break block87;
                                        var16_19 = var24_27.a;
                                        if ((var16_19 = Intrinsics.compare(var23_26, var16_19)) >= 0) break block83;
                                    }
                                    var24_27 = var22_25;
                                }
                                var15_18 = 1;
                                continue;
                            }
                            var12_15 = var22_25;
                            var24_27 = var22_25;
                            break;
                        }
                        if (var24_27 != null) {
                            var12_15 = var24_27;
                        }
                        var3_3 = var5_5.size();
                        var27_30 = new Object(var3_3);
                        var3_3 = var5_5.size();
                        var13_16 = 0;
                        var24_27 = null;
                        while (true) {
                            if (var13_16 < var3_3) ** break;
                            ** continue;
                            var14_17 /* !! */  = var5_5.get(var13_16);
                            var20_23 = var14_17 /* !! */ ;
                            var20_23 = ((LU0)var14_17 /* !! */ ).getWeight();
                            var21_24 = (int)Intrinsics.areEqual(var20_23, var12_15);
                            if (var21_24 != 0) {
                                var27_30.add(var14_17 /* !! */ );
                            }
                            var25_28 = 1;
                            var13_16 += var25_28;
                        }
                    }
                    for (var13_16 = 0; var13_16 < var3_3; var13_16 += var15_18) {
                        block91: {
                            block92: {
                                block88: {
                                    block89: {
                                        var20_23 = var5_5 = var14_17 /* !! */ .get(var13_16);
                                        var20_23 = (LU0)var5_5;
                                        var28_32 = var20_23.a();
                                        var15_18 = 0;
                                        var22_25 = null;
                                        var16_19 = (int)dV0.d(var28_32, 0);
                                        if (var16_19 == 0) break block88;
                                        var29_33 = var27_30.c;
                                        synchronized (var29_33) {
                                            block67: {
                                                try {
                                                    var8_11.getClass();
                                                    var11_14 = 0;
                                                    var9_12 = null;
                                                    var5_5 = new Fq$b((LU0)var20_23, null);
                                                    var9_12 = var27_30.a;
                                                    var9_12 = var9_12.a(var5_5);
                                                    var9_12 = (Fq$a)var9_12;
                                                    if (var9_12 == null) {
                                                        var9_12 = var27_30.b;
                                                        var9_12 = var5_5 = var9_12.a(var5_5);
                                                        var9_12 = (Fq$a)var5_5;
                                                    }
                                                    if (var9_12 == null) break block67;
                                                    var5_5 = var9_12.a;
                                                }
                                                catch (Throwable var5_6) {}
                                                break block89;
                                            }
                                            var5_5 = Unit.a;
                                            ** break block90
                                        }
                                        try {
                                            var5_5 = var8_11.a((LU0)var20_23);
                                        }
                                        catch (Exception var27_31) {
                                            var29_33 = new StringBuilder("Unable to load font ");
                                            var29_33.append(var20_23);
                                            var29_33 = var29_33.toString();
                                            var5_5 = new IllegalStateException((String)var29_33, var27_31);
                                            throw var5_5;
                                        }
                                        Fq.b(var27_30, (LU0)var20_23, var8_11, var5_5);
                                    }
                                    if (var5_5 == null) {
                                        var27_30 = new Object("Unable to load font ");
                                        var27_30.append(var20_23);
                                        var27_30 = var27_30.toString();
                                        var5_5 = new IllegalStateException((String)var27_30);
                                        throw var5_5;
                                    }
                                    var26_29 = var7_10.d;
                                    var29_33 = var7_10.b;
                                    var11_14 = var7_10.c;
                                    var5_5 = pV0.a(var26_29, var5_5, (LU0)var20_23, (tv0_0)var29_33, var11_14);
                                    var27_30 = new Object(var12_15, var5_5);
                                    break block68;
lbl-1000:
                                    // 1 sources

                                    {
                                        throw var5_6;
                                    }
                                }
                                var15_18 = 1;
                                var16_19 = (int)dV0.d(var28_32, var15_18);
                                if (var16_19 == 0) break block91;
                                var22_25 = var27_30.c;
                                synchronized (var22_25) {
                                    block69: {
                                        try {
                                            var8_11.getClass();
                                            var16_19 = 0;
                                            var17_20 = null;
                                            var5_5 = new Fq$b((LU0)var20_23, null);
                                            var17_20 = var27_30.a;
                                            var17_20 = var17_20.a(var5_5);
                                            var17_20 = (Fq$a)var17_20;
                                            if (var17_20 == null) {
                                                var17_20 = var27_30.b;
                                                var17_20 = var5_5 = var17_20.a(var5_5);
                                                var17_20 = (Fq$a)var5_5;
                                            }
                                            if (var17_20 == null) break block69;
                                            var5_5 = var17_20.a;
                                        }
                                        catch (Throwable var5_7) {}
                                        break block92;
                                    }
                                    var5_5 = Unit.a;
                                    ** break block93
                                }
                                try {
                                    var5_5 = tl2_2.b;
                                    var5_5 = var8_11.a((LU0)var20_23);
                                }
                                catch (Throwable var5_8) {
                                    var22_25 = tl2_2.b;
                                    var5_5 = vl2_2.a(var5_8);
                                }
                                var15_18 = var5_5 instanceof tL2$b;
                                if (var15_18 != 0) {
                                    var28_32 = 0;
                                    var5_5 = null;
                                }
                                Fq.b((Fq)var27_30, (LU0)var20_23, var8_11, var5_5);
                            }
                            if (var5_5 != null) {
                                var26_29 = var7_10.d;
                                var29_33 = var7_10.b;
                                var11_14 = var7_10.c;
                                var5_5 = pV0.a(var26_29, var5_5, (LU0)var20_23, (tv0_0)var29_33, var11_14);
                                var27_30 = new Object(var12_15, var5_5);
                                break block68;
                            } else {
                                var15_18 = 1;
                                var16_19 = 0;
                                var17_20 = null;
                                continue;
                            }
lbl-1000:
                            // 1 sources

                            {
                                throw var5_7;
                            }
                        }
                        var15_18 = 2;
                        if ((var28_32 = (int)dV0.d(var28_32, var15_18)) == 0) {
                            var27_30 = new Object("Unknown font type ");
                            var27_30.append(var20_23);
                            var27_30 = var27_30.toString();
                            var5_5 = new IllegalStateException((String)var27_30);
                            throw var5_5;
                        }
                        var5_5 = var27_30.a((LU0)var20_23, var8_11);
                        if (var5_5 == null) {
                            if (var12_15 == null) {
                                var15_18 = 1;
                                var5_5 = new LU0[var15_18];
                                var16_19 = 0;
                                var17_20 = null;
                                var5_5[0] = var20_23;
                                var12_15 = var5_5 = xx_2.j((Object[])var5_5);
                                continue;
                            }
                            var15_18 = 1;
                            var16_19 = 0;
                            var17_20 = null;
                            var12_15.add(var20_23);
                            continue;
                        }
                        var15_18 = 1;
                        var16_19 = 0;
                        var17_20 = null;
                        var5_5 = var5_5.a;
                        if (var5_5 == null) {
                            continue;
                        }
                        var26_29 = var7_10.d;
                        var29_33 = var7_10.b;
                        var11_14 = var7_10.c;
                        var5_5 = pV0.a(var26_29, var5_5, (LU0)var20_23, (tv0_0)var29_33, var11_14);
                        var27_30 = new Object(var12_15, var5_5);
                        break block68;
                    }
                    var5_5 = var9_12.invoke(var7_10);
                    var27_30 = new Object(var12_15, var5_5);
                }
                var12_15 = var5_5 = var27_30.a;
                var12_15 = (List)var5_5;
                var24_27 = var27_30.b;
                if (var12_15 == null) {
                    var26_29 = 1;
                    var9_12 = var5_5 = new xt3$b(var24_27, (boolean)var26_29);
                } else {
                    var14_17 /* !! */  = var6_9.a;
                    var9_12 = var5_5;
                    var5_5 = new jq_0((List)var12_15, var24_27, var7_10, (Fq)var14_17 /* !! */ , (Function1)var4_4, var8_11);
                    var27_30 = var6_9.b;
                    var29_33 = l90_0.UNDISPATCHED;
                    var10_13 = 0;
                    var12_15 = null;
                    var9_12 = new bv0_0((jq_0)var5_5, null);
                    var13_16 = 1;
                    Ae3.d(var27_30, null, (l90_0)var29_33, (Function2)var9_12, var13_16);
                    var9_12 = new xt3$a((jq_0)var5_5);
                }
            }
            if (var9_12 != null) return var9_12;
            var5_5 = var2_2.c.e;
            var27_30 = var2_2.d;
            var5_5.getClass();
            var29_33 = var27_30.a;
            var11_14 = var29_33 == null ? 1 : var29_33 instanceof Sl0;
            var5_5 = var5_5.a;
            var10_13 = var27_30.c;
            var27_30 = var27_30.b;
            if (var11_14 == 0) break block94;
            var5_5 = var5_5.a((tv0_0)var27_30, var10_13);
            ** GOTO lbl458
        }
        var11_14 = var29_33 instanceof gz0_1;
        if (var11_14 != 0) {
            var29_33 = (gz0_1)var29_33;
            var5_5 = var5_5.c((gz0_1)var29_33, (tv0_0)var27_30, var10_13);
lbl458:
            // 2 sources

            var26_29 = 1;
            var20_23 = new xt3$b(var5_5, (boolean)var26_29);
        } else {
            var28_32 = var29_33 instanceof sv1_0;
            if (var28_32 != 0) {
                ((sv1_0)var29_33).getClass();
                Intrinsics.checkNotNull(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                throw null;
            }
            var21_24 = 0;
            var20_23 = null;
        }
        if (var20_23 != null) {
            return var20_23;
        }
        var5_5 = new IllegalStateException("Could not load font");
        throw var5_5;
    }
}

