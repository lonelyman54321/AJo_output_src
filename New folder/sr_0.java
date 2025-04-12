/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from sR
 */
public final class sr_0
extends wf3_0 {
    public final ArrayList k;
    public int l;

    public sr_0(Y50 object, int n3) {
        super((Y50)object);
        object = new ArrayList();
        this.k = object;
        this.f = n3;
        object = this.b;
        Object object2 = ((Y50)object).r(n3);
        while (true) {
            Y50 y50 = object2;
            object2 = object;
            object = y50;
            if (y50 == null) break;
            n3 = this.f;
            object2 = y50.r(n3);
        }
        this.b = object2;
        int n4 = this.f;
        int n7 = 0;
        int n8 = 1;
        if (n4 == 0) {
            object = ((Y50)object2).d;
        } else if (n4 == n8) {
            object = ((Y50)object2).e;
        } else {
            n4 = 0;
            object = null;
        }
        ArrayList arrayList = this.k;
        arrayList.add(object);
        n4 = this.f;
        for (object = ((Y50)object2).q(n4); object != null; object = ((Y50)object).q(n3)) {
            n3 = this.f;
            if (n3 == 0) {
                object2 = ((Y50)object).d;
            } else if (n3 == n8) {
                object2 = ((Y50)object).e;
            } else {
                n3 = 0;
                object2 = null;
            }
            arrayList.add(object2);
            n3 = this.f;
        }
        object = arrayList.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (wf3_0)object.next();
            n7 = this.f;
            if (n7 == 0) {
                object2 = ((wf3_0)object2).b;
                ((Y50)object2).b = this;
                continue;
            }
            if (n7 != n8) continue;
            object2 = ((wf3_0)object2).b;
            ((Y50)object2).c = this;
        }
        n4 = this.f;
        if (n4 == 0) {
            object = (Z50)this.b.X;
            n4 = (int)(((Z50)object).C0 ? 1 : 0);
            if (n4 != 0 && (n4 = arrayList.size()) > n8) {
                this.b = object = ((wf3_0)pp_0.a((int)n8, (ArrayList)arrayList)).b;
            }
        }
        if ((n4 = this.f) == 0) {
            object = this.b;
            n4 = ((Y50)object).o0;
        } else {
            object = this.b;
            n4 = ((Y50)object).p0;
        }
        this.l = n4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(Zo0 var1_1) {
        block110: {
            block116: {
                block115: {
                    block114: {
                        block108: {
                            block107: {
                                var2_2 = this;
                                var3_3 /* !! */  = this.h;
                                var4_4 = var3_3 /* !! */ .j;
                                if (var4_4 == 0) break block110;
                                var5_5 = this.i;
                                var6_6 = var5_5.j;
                                if (var6_6 == 0) break block110;
                                var7_7 = this.b.X;
                                var8_8 = var7_7 instanceof Z50;
                                if (var8_8 != 0) {
                                    var7_7 = (Z50)var7_7;
                                    var6_6 = var7_7.C0;
                                } else {
                                    var6_6 = 0;
                                    var9_9 = 0.0f;
                                    var7_7 = null;
                                }
                                var8_8 = var5_5.g;
                                var10_10 = var3_3 /* !! */ .g;
                                var8_8 -= var10_10;
                                var11_11 = var2_2.k;
                                var12_12 = var11_11.size();
                                var13_13 = 0;
                                var14_14 = 0.0f;
                                var15_15 = null;
                                while (true) {
                                    var16_16 = -1;
                                    var17_17 = 8;
                                    var18_18 = 1.1E-44f;
                                    if (var13_13 >= var12_12) break;
                                    var19_19 = ((wf3_0)var11_11.get((int)var13_13)).b;
                                    var20_20 = var19_19.k0;
                                    if (var20_20 == var17_17) {
                                        ++var13_13;
                                        continue;
                                    }
                                    break block107;
                                    break;
                                }
                                var13_13 = -1;
                                var14_14 = 0.0f / 0.0f;
                            }
                            for (var21_21 = var20_20 = var12_12 + -1; var21_21 >= 0; var21_21 += -1) {
                                var22_22 /* !! */  = ((wf3_0)var11_11.get((int)var21_21)).b;
                                var23_23 = var22_22 /* !! */ .k0;
                                if (var23_23 == var17_17) {
                                    continue;
                                }
                                var16_16 = var21_21;
                                break;
                            }
                            var21_21 = 0;
                            while (true) {
                                var24_24 = 2;
                                var25_25 = 2.8E-45f;
                                if (var21_21 >= var24_24) break block108;
                                var24_24 = 0;
                                var25_25 = 0.0f;
                                var27_27 /* !! */  = null;
                                var28_28 = 0;
                                var29_29 = null;
                                var30_30 = 0;
                                var31_31 = 0.0f;
                                for (var26_26 = 0; var26_26 < var12_12; ++var26_26) {
                                    block112: {
                                        block113: {
                                            block111: {
                                                var32_32 = var11_11.get(var26_26);
                                                var22_22 /* !! */  = var32_32;
                                                var22_22 /* !! */  = (wf3_0)var32_32;
                                                var33_33 = var22_22 /* !! */ .b;
                                                var34_34 = var11_11;
                                                var10_10 = var33_33.k0;
                                                if (var10_10 != var17_17) break block111;
                                                var35_35 = var13_13;
                                                break block112;
                                            }
                                            ++var30_30;
                                            if (var26_26 > 0 && var26_26 >= var13_13) {
                                                var11_11 = var22_22 /* !! */ .h;
                                                var10_10 = var11_11.f;
                                                var24_24 += var10_10;
                                            }
                                            var11_11 = var22_22 /* !! */ .e;
                                            var36_36 = var17_17 = var11_11.g;
                                            var37_37 = var22_22 /* !! */ .d;
                                            var35_35 = var13_13;
                                            var15_15 = Y50$b.MATCH_CONSTRAINT;
                                            if (var37_37 != var15_15) {
                                                var13_13 = 1;
                                                var14_14 = 1.4E-45f;
                                            } else {
                                                var13_13 = 0;
                                                var14_14 = 0.0f;
                                                var15_15 = null;
                                            }
                                            if (var13_13 == 0) break block113;
                                            var10_10 = var2_2.f;
                                            if (var10_10 == 0) {
                                                var37_37 = var33_33.d.e;
                                                var17_17 = (int)var37_37.j;
                                                if (var17_17 == 0) {
                                                    return;
                                                }
                                            }
                                            var17_17 = 1;
                                            var18_18 = 1.4E-45f;
                                            if (var10_10 == var17_17) {
                                                var11_11 = var33_33.e.e;
                                                var10_10 = (int)var11_11.j;
                                                if (var10_10 == 0) {
                                                    return;
                                                }
                                            }
                                            var38_38 = var13_13;
                                            ** GOTO lbl117
                                        }
                                        var38_38 = var13_13;
                                        var17_17 = 1;
                                        var18_18 = 1.4E-45f;
                                        var13_13 = var22_22 /* !! */ .a;
                                        if (var13_13 == var17_17 && var21_21 == 0) {
                                            var17_17 = var11_11.m;
                                            ++var28_28;
lbl110:
                                            // 2 sources

                                            while (true) {
                                                var38_38 = 1;
                                                break;
                                            }
                                        } else {
                                            var10_10 = (int)var11_11.j;
                                            if (var10_10 != 0) {
                                                var17_17 = var36_36;
                                                ** continue;
                                            }
lbl117:
                                            // 3 sources

                                            var17_17 = var36_36;
                                        }
                                        if (var38_38 == 0) {
                                            ++var28_28;
                                            var11_11 = var33_33.q0;
                                            var13_13 = var2_2.f;
                                            var39_39 = (float)var11_11[var13_13];
                                            var13_13 = 0;
                                            var14_14 = 0.0f;
                                            var15_15 = null;
                                            cfr_temp_0 = var39_39 - 0.0f;
                                            var17_17 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                            if (var17_17 >= 0) {
                                                var31_31 += var39_39;
                                            }
                                        } else {
                                            var24_24 += var17_17;
                                        }
                                        if (var26_26 < var20_20 && var26_26 < var16_16) {
                                            var11_11 = var22_22 /* !! */ .i;
                                            var10_10 = -var11_11.f;
                                            var24_24 += var10_10;
                                        }
                                    }
                                    var11_11 = var34_34;
                                    var13_13 = var35_35;
                                    var17_17 = 8;
                                    var18_18 = 1.1E-44f;
                                }
                                var34_34 = var11_11;
                                var35_35 = var13_13;
                                if (var24_24 < var8_8 || var28_28 == 0) break;
                                ++var21_21;
                                var17_17 = 8;
                                var18_18 = 1.1E-44f;
                            }
                            var26_26 = var28_28;
                            var10_10 = var30_30;
                            break block114;
                        }
                        var34_34 = var11_11;
                        var35_35 = var13_13;
                        var26_26 = 0;
                        var10_10 = 0;
                        var39_39 = 0.0f;
                        var11_11 = null;
                        var24_24 = 0;
                        var25_25 = 0.0f;
                        var27_27 /* !! */  = null;
                        var31_31 = 0.0f;
                    }
                    var40_40 = var3_3 /* !! */ .g;
                    if (var6_6 != 0) {
                        var40_40 = var5_5.g;
                    }
                    var4_4 = 0x3F000000;
                    var41_41 = 0.5f;
                    if (var24_24 > var8_8) {
                        var13_13 = 0x40000000;
                        var14_14 = 2.0f;
                        if (var6_6 != 0) {
                            var17_17 = var24_24 - var8_8;
                            var18_18 = (float)var17_17 / var14_14 + var41_41;
                            var13_13 = (int)var18_18;
                            var40_40 += var13_13;
                        } else {
                            var17_17 = var24_24 - var8_8;
                            var18_18 = (float)var17_17 / var14_14 + var41_41;
                            var13_13 = (int)var18_18;
                            var40_40 -= var13_13;
                        }
                    }
                    if (var26_26 <= 0) break block115;
                    var13_13 = var8_8 - var24_24;
                    var14_14 = var13_13;
                    var18_18 = var26_26;
                    var18_18 = var14_14 / var18_18 + var41_41;
                    var17_17 = (int)var18_18;
                    var23_23 = 0;
                    var22_22 /* !! */  = null;
                    for (var21_21 = 0; var21_21 < var12_12; ++var21_21) {
                        block109: {
                            var33_33 = var34_34;
                            var29_29 = var34_34.get(var21_21);
                            var5_5 = var29_29;
                            var5_5 = var29_29;
                            var28_28 = var17_17;
                            var37_37 = var5_5.b;
                            var42_42 = var24_24;
                            var24_24 = var37_37.k0;
                            var36_36 = var40_40;
                            var40_40 = 8;
                            if (var24_24 == var40_40) lbl-1000:
                            // 3 sources

                            {
                                while (true) {
                                    var38_38 = var6_6;
                                    var43_43 = var14_14;
                                    break block109;
                                    break;
                                }
                            }
                            var3_3 /* !! */  = var5_5.d;
                            var27_27 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                            if (var3_3 /* !! */  != var27_27 /* !! */ ) ** GOTO lbl-1000
                            var3_3 /* !! */  = var5_5.e;
                            var24_24 = (int)var3_3 /* !! */ .j;
                            if (var24_24 == 0) ** break;
                            ** continue;
                            var24_24 = 0;
                            var25_25 = 0.0f;
                            var27_27 /* !! */  = null;
                            cfr_temp_1 = var31_31 - 0.0f;
                            var44_44 /* !! */  = (float)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                            if (var44_44 /* !! */  > 0) {
                                var27_27 /* !! */  = (Y50$b)var37_37.q0;
                                var38_38 = var6_6;
                                var6_6 = var2_2.f;
                                var9_9 = (float)(var27_27 /* !! */ [var6_6] * var14_14 / var31_31);
                                var24_24 = 0x3F000000;
                                var25_25 = 0.5f;
                                var6_6 = (int)(var9_9 += var25_25);
                            } else {
                                var38_38 = var6_6;
                                var6_6 = var17_17;
                            }
                            var24_24 = var2_2.f;
                            if (var24_24 == 0) {
                                var24_24 = var37_37.x;
                                var17_17 = var37_37.w;
                            } else {
                                var24_24 = var37_37.A;
                                var17_17 = var37_37.z;
                            }
                            var4_4 = var5_5.a;
                            var43_43 = var14_14;
                            var13_13 = 1;
                            var14_14 = 1.4E-45f;
                            if (var4_4 == var13_13) {
                                var4_4 = var3_3 /* !! */ .m;
                                var4_4 = Math.min(var6_6, var4_4);
                            } else {
                                var4_4 = var6_6;
                            }
                            var4_4 = Math.max(var17_17, var4_4);
                            if (var24_24 > 0) {
                                var4_4 = Math.min(var24_24, var4_4);
                            }
                            if (var4_4 != var6_6) {
                                ++var23_23;
                                var6_6 = var4_4;
                            }
                            var3_3 /* !! */ .d(var6_6);
                        }
                        var17_17 = var28_28;
                        var24_24 = var42_42;
                        var40_40 = var36_36;
                        var6_6 = var38_38;
                        var14_14 = var43_43;
                        var4_4 = 0x3F000000;
                        var41_41 = 0.5f;
                        var34_34 = var33_33;
                    }
                    var36_36 = var40_40;
                    var38_38 = var6_6;
                    var33_33 = var34_34;
                    var42_42 = var24_24;
                    if (var23_23 > 0) {
                        var26_26 -= var23_23;
                        var3_3 /* !! */  = null;
                        var24_24 = 0;
                        var25_25 = 0.0f;
                        var27_27 /* !! */  = null;
                        for (var40_40 = 0; var40_40 < var12_12; ++var40_40) {
                            var5_5 = (wf3_0)var33_33.get(var40_40);
                            var7_7 = var5_5.b;
                            var6_6 = var7_7.k0;
                            var13_13 = 8;
                            var14_14 = 1.1E-44f;
                            if (var6_6 == var13_13) {
                                var13_13 = var35_35;
                            } else {
                                var13_13 = var35_35;
                                if (var40_40 > 0 && var40_40 >= var35_35) {
                                    var7_7 = var5_5.h;
                                    var6_6 = var7_7.f;
                                    var24_24 += var6_6;
                                }
                                var7_7 = var5_5.e;
                                var6_6 = var7_7.g;
                                var24_24 += var6_6;
                                if (var40_40 < var20_20 && var40_40 < var16_16) {
                                    var5_5 = var5_5.i;
                                    var4_4 = -var5_5.f;
                                    var24_24 += var4_4;
                                }
                            }
                            var35_35 = var13_13;
                        }
                        var13_13 = var35_35;
                    } else {
                        var13_13 = var35_35;
                    }
                    var40_40 = var2_2.l;
                    var4_4 = 2;
                    var41_41 = 2.8E-45f;
                    if (var40_40 == var4_4 && var23_23 == 0) {
                        var40_40 = 0;
                        var3_3 /* !! */  = null;
                        var2_2.l = 0;
                    } else {
                        var40_40 = 0;
                        var3_3 /* !! */  = null;
                    }
                    break block116;
                }
                var36_36 = var40_40;
                var38_38 = var6_6;
                var33_33 = var34_34;
                var13_13 = var35_35;
                var40_40 = 0;
                var3_3 /* !! */  = null;
                var4_4 = 2;
                var41_41 = 2.8E-45f;
                var42_42 = var24_24;
            }
            if (var24_24 > var8_8) {
                var2_2.l = var4_4;
            }
            if (var10_10 > 0 && var26_26 == 0 && var13_13 == var16_16) {
                var2_2.l = var4_4;
            }
            var4_4 = var2_2.l;
            var6_6 = 1;
            var9_9 = 1.4E-45f;
            if (var4_4 == var6_6) {
                if (var10_10 > var6_6) {
                    var8_8 -= var24_24;
                    var8_8 /= (var10_10 -= var6_6);
                } else if (var10_10 == var6_6) {
                    var8_8 -= var24_24;
                    var4_4 = 2;
                    var41_41 = 2.8E-45f;
                    var8_8 /= var4_4;
                } else {
                    var8_8 = 0;
                    var45_45 = null;
                }
                if (var26_26 > 0) {
                    var8_8 = 0;
                    var45_45 = null;
                }
                var40_40 = var36_36;
                for (var26_26 = 0; var26_26 < var12_12; ++var26_26) {
                    if (var38_38 != 0) {
                        var4_4 = var26_26 + 1;
                        var4_4 = var12_12 - var4_4;
                    } else {
                        var4_4 = var26_26;
                    }
                    var5_5 = (wf3_0)var33_33.get(var4_4);
                    var7_7 = var5_5.b;
                    var6_6 = var7_7.k0;
                    var11_11 = var5_5.i;
                    var37_37 = var5_5.h;
                    var21_21 = 8;
                    if (var6_6 == var21_21) {
                        var37_37.d(var40_40);
                        var11_11.d(var40_40);
                        continue;
                    }
                    if (var26_26 > 0) {
                        var40_40 = var38_38 != 0 ? (var40_40 -= var8_8) : (var40_40 += var8_8);
                    }
                    if (var26_26 > 0 && var26_26 >= var13_13) {
                        if (var38_38 != 0) {
                            var6_6 = var37_37.f;
                            var40_40 -= var6_6;
                        } else {
                            var6_6 = var37_37.f;
                            var40_40 += var6_6;
                        }
                    }
                    if (var38_38 != 0) {
                        var11_11.d(var40_40);
                    } else {
                        var37_37.d(var40_40);
                    }
                    var7_7 = var5_5.e;
                    var21_21 = var7_7.g;
                    var22_22 /* !! */  = var5_5.d;
                    var27_27 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                    if (var22_22 /* !! */  == var27_27 /* !! */ ) {
                        var23_23 = var5_5.a;
                        var24_24 = 1;
                        var25_25 = 1.4E-45f;
                        if (var23_23 == var24_24) {
                            var21_21 = var7_7.m;
                        }
                    }
                    var40_40 = var38_38 != 0 ? (var40_40 -= var21_21) : (var40_40 += var21_21);
                    if (var38_38 != 0) {
                        var37_37.d(var40_40);
lbl386:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var11_11.d(var40_40);
                    ** continue;
                    var6_6 = 1;
                    var9_9 = 1.4E-45f;
                    var5_5.g = var6_6;
                    if (var26_26 >= var20_20 || var26_26 >= var16_16) continue;
                    if (var38_38 != 0) {
                        var4_4 = -var11_11.f;
                        var40_40 -= var4_4;
                        continue;
                    }
                    var4_4 = -var11_11.f;
                    var40_40 += var4_4;
                }
            } else if (var4_4 == 0) {
                var8_8 -= var24_24;
                var4_4 = 1;
                var41_41 = 1.4E-45f;
                var8_8 /= (var10_10 += var4_4);
                if (var26_26 > 0) {
                    var8_8 = 0;
                    var45_46 = null;
                }
                var40_40 = var36_36;
                for (var26_26 = 0; var26_26 < var12_12; ++var26_26) {
                    if (var38_38 != 0) {
                        var4_4 = var26_26 + 1;
                        var4_4 = var12_12 - var4_4;
                    } else {
                        var4_4 = var26_26;
                    }
                    var5_5 = (wf3_0)var33_33.get(var4_4);
                    var7_7 = var5_5.b;
                    var6_6 = var7_7.k0;
                    var11_11 = var5_5.i;
                    var37_37 = var5_5.h;
                    var21_21 = 8;
                    if (var6_6 == var21_21) {
                        var37_37.d(var40_40);
                        var11_11.d(var40_40);
                        continue;
                    }
                    var40_40 = var38_38 != 0 ? (var40_40 -= var8_8) : (var40_40 += var8_8);
                    if (var26_26 > 0 && var26_26 >= var13_13) {
                        if (var38_38 != 0) {
                            var6_6 = var37_37.f;
                            var40_40 -= var6_6;
                        } else {
                            var6_6 = var37_37.f;
                            var40_40 += var6_6;
                        }
                    }
                    if (var38_38 != 0) {
                        var11_11.d(var40_40);
                    } else {
                        var37_37.d(var40_40);
                    }
                    var7_7 = var5_5.e;
                    var21_21 = var7_7.g;
                    var22_22 /* !! */  = var5_5.d;
                    var27_27 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                    if (var22_22 /* !! */  == var27_27 /* !! */  && (var4_4 = var5_5.a) == (var23_23 = 1)) {
                        var4_4 = var7_7.m;
                        var21_21 = Math.min(var21_21, var4_4);
                    }
                    var40_40 = var38_38 != 0 ? (var40_40 -= var21_21) : (var40_40 += var21_21);
                    if (var38_38 != 0) {
                        var37_37.d(var40_40);
                    } else {
                        var11_11.d(var40_40);
                    }
                    if (var26_26 >= var20_20 || var26_26 >= var16_16) continue;
                    if (var38_38 != 0) {
                        var4_4 = -var11_11.f;
                        var40_40 -= var4_4;
                        continue;
                    }
                    var4_4 = -var11_11.f;
                    var40_40 += var4_4;
                }
            } else {
                var6_6 = 2;
                var9_9 = 2.8E-45f;
                if (var4_4 == var6_6) {
                    var4_4 = var2_2.f;
                    if (var4_4 == 0) {
                        var5_5 = var2_2.b;
                        var41_41 = var5_5.h0;
                    } else {
                        var5_5 = var2_2.b;
                        var41_41 = var5_5.i0;
                    }
                    if (var38_38 != 0) {
                        var6_6 = 1065353216;
                        var9_9 = 1.0f;
                        var41_41 = var9_9 - var41_41;
                    }
                    var9_9 = (float)(var8_8 -= var24_24) * var41_41;
                    var41_41 = 0.5f;
                    var4_4 = (int)(var9_9 += var41_41);
                    if (var4_4 < 0 || var26_26 > 0) {
                        var4_4 = 0;
                        var41_41 = 0.0f;
                        var5_5 = null;
                    }
                    var4_4 = var38_38 != 0 ? var36_36 - var4_4 : var36_36 + var4_4;
                    for (var26_26 = 0; var26_26 < var12_12; ++var26_26) {
                        if (var38_38 != 0) {
                            var40_40 = var26_26 + 1;
                            var40_40 = var12_12 - var40_40;
                        } else {
                            var40_40 = var26_26;
                        }
                        var3_3 /* !! */  = (wf3_0)var33_33.get(var40_40);
                        var7_7 = var3_3 /* !! */ .b;
                        var6_6 = var7_7.k0;
                        var45_47 = var3_3 /* !! */ .i;
                        var11_11 = var3_3 /* !! */ .h;
                        var17_17 = 8;
                        var18_18 = 1.1E-44f;
                        if (var6_6 == var17_17) {
                            var11_11.d(var4_4);
                            var45_47.d(var4_4);
                            var23_23 = 1;
                            continue;
                        }
                        if (var26_26 > 0 && var26_26 >= var13_13) {
                            if (var38_38 != 0) {
                                var6_6 = var11_11.f;
                                var4_4 -= var6_6;
                            } else {
                                var6_6 = var11_11.f;
                                var4_4 += var6_6;
                            }
                        }
                        if (var38_38 != 0) {
                            var45_47.d(var4_4);
                        } else {
                            var11_11.d(var4_4);
                        }
                        var7_7 = var3_3 /* !! */ .e;
                        var21_21 = var7_7.g;
                        var22_22 /* !! */  = var3_3 /* !! */ .d;
                        var27_27 /* !! */  = Y50$b.MATCH_CONSTRAINT;
                        if (var22_22 /* !! */  == var27_27 /* !! */ ) {
                            var40_40 = var3_3 /* !! */ .a;
                            var23_23 = 1;
                            if (var40_40 == var23_23) {
                                var21_21 = var7_7.m;
                            }
                        } else {
                            var23_23 = 1;
                        }
                        var4_4 = var38_38 != 0 ? (var4_4 -= var21_21) : (var4_4 += var21_21);
                        if (var38_38 != 0) {
                            var11_11.d(var4_4);
                        } else {
                            var45_47.d(var4_4);
                        }
                        if (var26_26 >= var20_20 || var26_26 >= var16_16) continue;
                        if (var38_38 != 0) {
                            var40_40 = -var45_47.f;
                            var4_4 -= var40_40;
                            continue;
                        }
                        var40_40 = -var45_47.f;
                        var4_4 += var40_40;
                    }
                }
            }
        }
    }

    public final void d() {
        Object object;
        int n3;
        Object object2 = this.k;
        Object object3 = ((ArrayList)object2).iterator();
        while ((n3 = object3.hasNext()) != 0) {
            object = (wf3_0)object3.next();
            ((wf3_0)object).d();
        }
        int n4 = ((ArrayList)object2).size();
        if (n4 < (n3 = 1)) {
            return;
        }
        dp0 dp02 = null;
        Y50 y50 = ((wf3_0)((ArrayList)object2).get((int)0)).b;
        object2 = ((wf3_0)((ArrayList)object2).get((int)(n4 -= n3))).b;
        n4 = this.f;
        dp0 dp03 = this.i;
        dp0 dp04 = this.h;
        if (n4 == 0) {
            object3 = y50.L;
            object2 = ((Y50)object2).N;
            object = wf3_0.i((v50_0)object3, 0);
            n4 = ((v50_0)object3).e();
            y50 = this.m();
            if (y50 != null) {
                object3 = y50.L;
                n4 = ((v50_0)object3).e();
            }
            if (object != null) {
                wf3_0.b(dp04, (dp0)object, n4);
            }
            object3 = wf3_0.i((v50_0)object2, 0);
            int n7 = ((v50_0)object2).e();
            object = this.n();
            if (object != null) {
                object2 = ((Y50)object).N;
                n7 = ((v50_0)object2).e();
            }
            if (object3 != null) {
                n7 = -n7;
                wf3_0.b(dp03, (dp0)object3, n7);
            }
        } else {
            object3 = y50.M;
            object2 = ((Y50)object2).O;
            dp02 = wf3_0.i((v50_0)object3, n3);
            n4 = ((v50_0)object3).e();
            y50 = this.m();
            if (y50 != null) {
                object3 = y50.M;
                n4 = ((v50_0)object3).e();
            }
            if (dp02 != null) {
                wf3_0.b(dp04, dp02, n4);
            }
            object3 = wf3_0.i((v50_0)object2, n3);
            int n8 = ((v50_0)object2).e();
            object = this.n();
            if (object != null) {
                object2 = ((Y50)object).O;
                n8 = ((v50_0)object2).e();
            }
            if (object3 != null) {
                n8 = -n8;
                wf3_0.b(dp03, (dp0)object3, n8);
            }
        }
        dp04.a = this;
        dp03.a = this;
    }

    public final void e() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.k)).size()); ++i3) {
            object = (wf3_0)((ArrayList)object).get(i3);
            ((wf3_0)object).e();
        }
    }

    public final void f() {
        boolean bl2;
        this.c = null;
        Iterator iterator = this.k.iterator();
        while (bl2 = iterator.hasNext()) {
            wf3_0 wf3_02 = (wf3_0)iterator.next();
            wf3_02.f();
        }
    }

    public final long j() {
        ArrayList arrayList = this.k;
        int n3 = arrayList.size();
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            wf3_0 wf3_02 = (wf3_0)arrayList.get(i3);
            dp0 dp02 = wf3_02.h;
            int n4 = dp02.f;
            long l3 = n4;
            l2 += l3;
            l3 = wf3_02.j() + l2;
            dp0 dp03 = wf3_02.i;
            int n7 = dp03.f;
            l2 = (long)n7 + l3;
        }
        return l2;
    }

    public final boolean k() {
        ArrayList arrayList = this.k;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            wf3_0 wf3_02 = (wf3_0)arrayList.get(i3);
            boolean bl2 = wf3_02.k();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public final Y50 m() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.k)).size()); ++i3) {
            object = ((wf3_0)((ArrayList)object).get((int)i3)).b;
            n3 = ((Y50)object).k0;
            int n4 = 8;
            if (n3 == n4) continue;
            return object;
        }
        return null;
    }

    public final Y50 n() {
        ArrayList arrayList = this.k;
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            Y50 y50 = ((wf3_0)arrayList.get((int)i3)).b;
            int n3 = y50.k0;
            int n4 = 8;
            if (n3 == n4) continue;
            return y50;
        }
        return null;
    }

    public final String toString() {
        boolean bl2;
        Object object = "ChainRun ";
        StringBuilder stringBuilder = new StringBuilder((String)object);
        int n3 = this.f;
        object = n3 == 0 ? "horizontal : " : "vertical : ";
        stringBuilder.append((String)object);
        object = this.k.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (wf3_0)object.next();
            String string2 = "<";
            stringBuilder.append(string2);
            stringBuilder.append(object2);
            object2 = "> ";
            stringBuilder.append((String)object2);
        }
        return stringBuilder.toString();
    }
}

