/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class S32
extends i42_0 {
    public final LP1$c b;
    public final Zv2 c;
    public final pb1_0 d;
    public w32_0 e;
    public mv2_0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public S32(LP1$c object) {
        boolean bl2;
        this.b = object;
        object = new Object();
        int n3 = 2;
        long[] lArray = new long[n3];
        ((Zv2)object).b = lArray;
        this.c = object;
        this.d = object = new pb1_0(n3);
        this.h = bl2 = true;
        this.i = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a(pb1_0 var1_1, zp1 var2_2, zj1 var3_3, boolean var4_4) {
        block39: {
            var5_5 = this;
            var6_6 = var1_1;
            var7_7 = var2_2;
            var8_8 = var3_3;
            var9_9 = super.a(var1_1, var2_2, var3_3, var4_4);
            var10_10 = this.b;
            var11_11 = var10_10.m;
            var12_12 = 1;
            if (var11_11 == 0) {
                return (boolean)var12_12;
            }
            var13_13 = 0;
            var14_14 = null;
            while (var10_10 != null) {
                var15_15 = var10_10 instanceof gw2_0;
                var16_16 = 16;
                if (var15_15 != 0) {
                    var5_5.e = var10_10 = go0.d((gw2_0)var10_10, var16_16);
                } else {
                    var15_15 = var10_10.c & var16_16;
                    if (var15_15 != 0 && (var15_15 = var10_10 instanceof mo0_0) != 0) {
                        var17_17 = var10_10;
                        var17_17 = ((mo0_0)var10_10).o;
                        var18_18 = 0;
                        var19_19 = null;
                        while (var17_17 != null) {
                            var20_20 = var17_17.c & var16_16;
                            if (var20_20 != 0) {
                                if (++var18_18 == var12_12) {
                                    var10_10 = var17_17;
                                } else {
                                    if (var14_14 == null) {
                                        var21_21 = new LP1$c[var16_16];
                                        var14_14 = new WR1(var21_21);
                                    }
                                    if (var10_10 != null) {
                                        var14_14.b(var10_10);
                                        var22_22 = 0;
                                        var23_23 = 0.0f;
                                        var10_10 = null;
                                    }
                                    var14_14.b(var17_17);
                                }
                            }
                            var17_17 = var17_17.f;
                        }
                        if (var18_18 == var12_12) continue;
                    }
                }
                var10_10 = go0.b(var14_14);
            }
            var22_22 = var1_1.n();
            var13_13 = 0;
            var14_14 = null;
            while (true) {
                var17_17 = var5_5.d;
                var24_24 = var5_5.c;
                if (var13_13 >= var22_22) break;
                var25_25 = var6_6.k(var13_13);
                var27_26 = (aw2_0)var6_6.o(var13_13);
                var16_16 = (int)var24_24.b(var25_25);
                if (var16_16 == 0 || (var16_16 = (int)e72.g(var28_27 = var27_26.g)) == 0) ** GOTO lbl-1000
                var30_28 = var17_17;
                var31_29 = var27_26.c;
                var16_16 = (int)e72.g(var31_29);
                if (var16_16 != 0) {
                    var33_30 = var27_26.k;
                    if (var33_30 == null) {
                        var33_30 = mz0_2.a;
                    }
                    var34_31 = var33_30.size();
                    var24_24 = new ArrayList<Object>(var34_31);
                    var33_30 = var27_26.k;
                    if (var33_30 == null) {
                        var33_30 = mz0_2.a;
                    }
                    var35_32 = var22_22;
                    var22_22 = var33_30.size();
                    var36_33 = var9_9;
                    var37_34 = null;
                    for (var9_9 = 0; var9_9 < var22_22; ++var9_9) {
                        var38_35 /* !! */  = var33_30.get(var9_9);
                        var39_36 = var22_22;
                        var10_10 = var38_35 /* !! */ ;
                        var10_10 = (A61)var38_35 /* !! */ ;
                        var40_37 = var25_25;
                        var25_25 = var10_10.b;
                        var42_38 = e72.g(var25_25);
                        if (var42_38) {
                            var38_35 /* !! */  = var33_30;
                            var8_8 = var5_5.e;
                            Intrinsics.checkNotNull(var8_8);
                            var43_39 = var8_8.r1((zp1)var7_7, var25_25);
                            var25_25 = var10_10.a;
                            var45_40 = var13_13;
                            var46_41 = var31_29;
                            var48_42 = var10_10.c;
                            var50_43 = var25_25;
                            var33_30 = new A61(var25_25, var43_39, var48_42);
                            var24_24.add(var33_30);
                        } else {
                            var45_40 = var13_13;
                            var46_41 = var31_29;
                            var38_35 /* !! */  = var33_30;
                        }
                        var13_13 = var45_40;
                        var33_30 = var38_35 /* !! */ ;
                        var22_22 = var39_36;
                        var31_29 = var46_41;
                        var25_25 = var40_37;
                        var8_8 = var3_3;
                    }
                    var45_40 = var13_13;
                    var46_41 = var31_29;
                    var40_37 = var25_25;
                    var37_34 = var5_5.e;
                    Intrinsics.checkNotNull(var37_34);
                    var52_44 = var37_34.r1((zp1)var7_7, var28_27);
                    var37_34 = var5_5.e;
                    Intrinsics.checkNotNull(var37_34);
                    var54_45 = var31_29;
                    var43_39 = var37_34.r1((zp1)var7_7, var31_29);
                    var38_35 /* !! */  = var37_34;
                    var56_46 = var27_26.j;
                    var58_47 = var27_26.l;
                    var60_48 = var27_26.a;
                    var50_43 = var27_26.b;
                    var62_49 = var27_26.d;
                    var23_23 = var27_26.e;
                    var46_41 = var54_45 = var27_26.f;
                    var63_50 = var27_26.h;
                    var22_22 = var27_26.i;
                    var37_34 = new aw2_0(var60_48, var50_43, var43_39, var62_49, var23_23, var54_45, var52_44, var63_50, var22_22, var24_24, var56_46, var58_47);
                    var37_34.m = var10_10 = var27_26.m;
                    var10_10 = var30_28;
                    var28_27 = var25_25;
                    var30_28.l(var25_25, var37_34);
                } else lbl-1000:
                // 2 sources

                {
                    var36_33 = var9_9;
                    var35_32 = var22_22;
                    var45_40 = var13_13;
                }
                var13_13 = var45_40 + 1;
                var8_8 = var3_3;
                var22_22 = var35_32;
                var9_9 = var36_33;
                var12_12 = 1;
            }
            var36_33 = var9_9;
            var10_10 = var17_17;
            var64_51 = (int)var17_17.j();
            if (var64_51 != 0) {
                var24_24.a = 0;
                var5_5.a.g();
                return true;
            }
            var64_51 = 1;
            for (var45_40 = var24_24.a - var64_51; (var64_51 = -1) < var45_40; var45_40 += -1) {
                var7_7 = var24_24.b;
                var28_27 = (long)var7_7[var45_40];
                var64_51 = var6_6.i(var28_27);
                if (var64_51 >= 0) continue;
                var24_24.c(var45_40);
            }
            var64_51 = var10_10.n();
            var6_6 = new ArrayList(var64_51);
            var64_51 = var10_10.n();
            var8_8 = null;
            for (var45_40 = 0; var45_40 < var64_51; ++var45_40) {
                var37_34 = var10_10.o(var45_40);
                var6_6.add(var37_34);
            }
            var8_8 = var3_3;
            var7_7 = new mv2_0((List)var6_6, var3_3);
            var9_9 = var6_6.size();
            var23_23 = 0.0f;
            var10_10 = null;
            for (var22_22 = 0; var22_22 < var9_9; ++var22_22) {
                var66_53 /* !! */  = var65_52 /* !! */  = var6_6.get(var22_22);
                var66_53 /* !! */  = (aw2_0)var65_52 /* !! */ ;
                var67_54 = var66_53 /* !! */ .a;
                var12_12 = (int)var8_8.a(var67_54);
                if (var12_12 == 0) {
                    continue;
                }
                break block39;
            }
            var11_11 = 0;
            var65_52 /* !! */  = null;
        }
        var65_52 /* !! */  = (aw2_0)var65_52 /* !! */ ;
        var69_55 = 3;
        if (var65_52 /* !! */  != null) {
            var45_40 = (int)var65_52 /* !! */ .d;
            if (!var4_4) {
                var9_9 = 0;
                var37_34 = null;
                var5_5.h = false;
                while (true) {
                    var11_11 = 1;
                    break;
                }
            } else {
                var9_9 = 0;
                var37_34 = null;
                if ((var22_22 = (int)var5_5.h) != 0 || var45_40 == 0 && (var22_22 = (int)var65_52 /* !! */ .h) == 0) ** continue;
                var10_10 = var5_5.e;
                Intrinsics.checkNotNull(var10_10);
                var67_54 = var10_10.c;
                var22_22 = (int)si0_2.e(var65_52 /* !! */ , var67_54);
                var11_11 = 1;
                var5_5.h = var22_22 ^= var11_11;
            }
            var22_22 = (int)var5_5.h;
            var12_12 = var5_5.g;
            var13_13 = 5;
            var18_18 = 4;
            if (var22_22 != var12_12 && ((var22_22 = (int)Pv2.a(var7_7.d, var69_55)) != 0 || (var22_22 = (int)Pv2.a(var7_7.d, var18_18)) != 0 || (var22_22 = (int)Pv2.a(var7_7.d, var13_13)) != 0)) {
                var45_40 = (int)var5_5.h;
                if (var45_40 != 0) {
                    var13_13 = 4;
                }
                var7_7.d = var13_13;
            } else {
                var22_22 = (int)Pv2.a(var7_7.d, var18_18);
                if (var22_22 != 0 && (var22_22 = (int)var5_5.g) != 0 && (var22_22 = (int)var5_5.i) == 0) {
                    var7_7.d = var69_55;
                } else {
                    var22_22 = (int)Pv2.a(var7_7.d, var13_13);
                    if (var22_22 != 0 && (var22_22 = (int)var5_5.h) != 0 && var45_40 != 0) {
                        var7_7.d = var69_55;
                    }
                }
            }
        } else {
            var9_9 = 0;
            var37_34 = null;
            var11_11 = 1;
        }
        if (var36_33 == 0 && (var69_55 = (int)Pv2.a(var45_40 = var7_7.d, var69_55)) != 0 && (var6_6 = var5_5.f) != null && (var45_40 = (var6_6 = var6_6.a).size()) == (var12_12 = (var10_10 = var7_7.a).size())) {
            var45_40 = var10_10.size();
            var66_53 /* !! */  = null;
            for (var12_12 = 0; var12_12 < var45_40; ++var12_12) {
                var14_14 = (aw2_0)var6_6.get(var12_12);
                var19_19 = (aw2_0)var10_10.get(var12_12);
                var70_56 = var14_14.c;
                var48_42 = var19_19.c;
                var13_13 = (int)e72.b(var70_56, var48_42);
                if (var13_13 != 0) {
                    continue;
                }
                ** break block40
            }
            var12_12 = 0;
            var66_53 /* !! */  = null;
        } else lbl-1000:
        // 2 sources

        {
            var12_12 = 1;
        }
        var5_5.f = var7_7;
        return (boolean)var12_12;
    }

    public final void b(zj1 zj12) {
        boolean bl2;
        boolean bl3;
        super.b(zj12);
        mv2_0 mv2_02 = this.f;
        if (mv2_02 == null) {
            return;
        }
        this.g = bl3 = this.h;
        List list = mv2_02.a;
        int n3 = list.size();
        block0: for (int i3 = 0; i3 < n3; ++i3) {
            Object object = (aw2_0)list.get(i3);
            int n4 = ((aw2_0)object).d ^ 1;
            long l2 = ((aw2_0)object).a;
            boolean bl4 = zj12.a(l2) ^ true;
            int n7 = this.h ^ 1;
            if ((n4 == 0 || !bl4) && (n4 == 0 || n7 == 0)) continue;
            object = this.c;
            n4 = ((Zv2)object).a;
            for (n7 = 0; n7 < n4; ++n7) {
                long[] lArray = ((Zv2)object).b;
                long l3 = lArray[n7];
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 != false) continue;
                ((Zv2)object).c(n7);
                continue block0;
            }
        }
        this.h = false;
        this.i = bl2 = Pv2.a(mv2_02.d, 5);
    }

    public final void d() {
        Object object;
        WR1 wR1;
        int n3;
        Object[] objectArray = this.a;
        int n4 = objectArray.c;
        int n7 = 1;
        if (n4 > 0) {
            objectArray = objectArray.a;
            n3 = 0;
            wR1 = null;
            do {
                object = (S32)objectArray[n3];
                ((S32)object).d();
            } while ((n3 += n7) < n4);
        }
        objectArray = null;
        Object object2 = this.b;
        n3 = 0;
        wR1 = null;
        while (object2 != null) {
            int n8 = object2 instanceof gw2_0;
            if (n8 != 0) {
                object2 = (gw2_0)object2;
                object2.A0();
            } else {
                n8 = ((LP1$c)object2).c;
                int n10 = 16;
                if ((n8 &= n10) != 0 && (n8 = object2 instanceof mo0_0) != 0) {
                    object = object2;
                    object = ((mo0_0)object2).o;
                    int n14 = 0;
                    while (object != null) {
                        int n15 = ((LP1$c)object).c & n10;
                        if (n15 != 0) {
                            if (++n14 == n7) {
                                object2 = object;
                            } else {
                                if (wR1 == null) {
                                    Object[] objectArray2 = new LP1$c[n10];
                                    wR1 = new WR1(objectArray2);
                                }
                                if (object2 != null) {
                                    wR1.b(object2);
                                    n4 = 0;
                                    object2 = null;
                                }
                                wR1.b(object);
                            }
                        }
                        object = ((LP1$c)object).f;
                    }
                    if (n14 == n7) continue;
                }
            }
            object2 = go0.b(wR1);
        }
    }

    public final boolean e(zj1 zj12) {
        pb1_0 pb1_02 = this.d;
        boolean bl2 = pb1_02.j();
        int n3 = 0;
        if (!bl2) {
            Object[] objectArray = this.b;
            int n4 = objectArray.m;
            if (n4 != 0) {
                int n7;
                mv2_0 mv2_02 = this.f;
                Intrinsics.checkNotNull(mv2_02);
                Object object = this.e;
                Intrinsics.checkNotNull(object);
                long l2 = ((Ns2)object).c;
                fo0 fo02 = objectArray;
                WR1 wR1 = null;
                while (true) {
                    n7 = 1;
                    if (fo02 == null) break;
                    int n8 = fo02 instanceof gw2_0;
                    if (n8 != 0) {
                        fo02 = (gw2_0)fo02;
                        Nv2 nv2 = Nv2.Final;
                        fo02.G(mv2_02, nv2, l2);
                    } else {
                        n8 = ((LP1$c)fo02).c;
                        int n10 = 16;
                        if ((n8 &= n10) != 0 && (n8 = fo02 instanceof mo0_0) != 0) {
                            fo0 fo03 = fo02;
                            fo03 = ((mo0_0)fo02).o;
                            int n14 = 0;
                            while (fo03 != null) {
                                int n15 = ((LP1$c)fo03).c & n10;
                                if (n15 != 0) {
                                    if (++n14 == n7) {
                                        fo02 = fo03;
                                    } else {
                                        if (wR1 == null) {
                                            Object[] objectArray2 = new LP1$c[n10];
                                            wR1 = new WR1(objectArray2);
                                        }
                                        if (fo02 != null) {
                                            wR1.b(fo02);
                                            fo02 = null;
                                        }
                                        wR1.b(fo03);
                                    }
                                }
                                fo03 = ((LP1$c)fo03).f;
                            }
                            if (n14 == n7) continue;
                        }
                    }
                    fo02 = go0.b(wR1);
                }
                bl2 = objectArray.m;
                if (bl2) {
                    objectArray = this.a;
                    n4 = objectArray.c;
                    if (n4 > 0) {
                        objectArray = objectArray.a;
                        do {
                            object = (S32)objectArray[n3];
                            ((S32)object).e(zj12);
                        } while ((n3 += n7) < n4);
                    }
                }
                n3 = 1;
            }
        }
        this.b(zj12);
        pb1_02.d();
        this.e = null;
        return n3 != 0;
    }

    public final boolean f(zj1 object, boolean bl2) {
        Object object2 = this.d;
        boolean bl3 = object2.j();
        boolean bl4 = false;
        if (!bl3) {
            object2 = this.b;
            boolean bl5 = object2.m;
            if (bl5) {
                boolean bl6;
                int n3;
                Object[] objectArray;
                S32 s32;
                Object object3;
                int n4;
                int n7;
                int n8;
                mv2_0 mv2_02 = this.f;
                Intrinsics.checkNotNull(mv2_02);
                w32_0 w32_02 = this.e;
                Intrinsics.checkNotNull(w32_02);
                long l2 = w32_02.c;
                Object[] objectArray2 = object2;
                int n10 = 0;
                Object[] objectArray3 = null;
                while (true) {
                    n8 = 1;
                    n7 = 16;
                    if (objectArray2 == null) break;
                    n4 = objectArray2 instanceof gw2_0;
                    if (n4 != 0) {
                        objectArray2 = (gw2_0)objectArray2;
                        Nv2 nv2 = Nv2.Initial;
                        objectArray2.G(mv2_02, nv2, l2);
                    } else {
                        n4 = ((LP1$c)objectArray2).c & n7;
                        if (n4 != 0 && (n4 = objectArray2 instanceof mo0_0) != 0) {
                            object3 = objectArray2;
                            object3 = ((mo0_0)objectArray2).o;
                            int n14 = 0;
                            s32 = null;
                            while (object3 != null) {
                                int n15 = object3.c & n7;
                                if (n15 != 0) {
                                    if (++n14 == n8) {
                                        objectArray2 = object3;
                                    } else {
                                        if (objectArray3 == null) {
                                            objectArray = new LP1$c[n7];
                                            objectArray3 = new WR1(objectArray);
                                        }
                                        if (objectArray2 != null) {
                                            objectArray3.b(objectArray2);
                                            n3 = 0;
                                            objectArray2 = null;
                                        }
                                        objectArray3.b(object3);
                                    }
                                }
                                object3 = object3.f;
                            }
                            if (n14 == n8) continue;
                        }
                    }
                    objectArray2 = go0.b(objectArray3);
                }
                n3 = object2.m;
                if (n3 != 0) {
                    objectArray2 = this.a;
                    n10 = objectArray2.c;
                    if (n10 > 0) {
                        objectArray2 = objectArray2.a;
                        n4 = 0;
                        object3 = null;
                        do {
                            s32 = (S32)objectArray2[n4];
                            objectArray = this.e;
                            Intrinsics.checkNotNull(objectArray);
                            s32.f((zj1)object, bl2);
                        } while ((n4 += n8) < n10);
                    }
                }
                if (bl6 = object2.m) {
                    bl6 = false;
                    object = null;
                    while (object2 != null) {
                        Object object4;
                        int n16 = object2 instanceof gw2_0;
                        if (n16 != 0) {
                            object2 = (gw2_0)object2;
                            object4 = Nv2.Main;
                            object2.G(mv2_02, (Nv2)((Object)object4), l2);
                        } else {
                            n16 = ((LP1$c)object2).c & n7;
                            if (n16 != 0 && (n16 = object2 instanceof mo0_0) != 0) {
                                object4 = object2;
                                object4 = ((mo0_0)object2).o;
                                n3 = 0;
                                objectArray2 = null;
                                while (object4 != null) {
                                    n10 = ((LP1$c)object4).c & n7;
                                    if (n10 != 0) {
                                        if (++n3 == n8) {
                                            object2 = object4;
                                        } else {
                                            if (object == null) {
                                                objectArray3 = new LP1$c[n7];
                                                object = new WR1(objectArray3);
                                            }
                                            if (object2 != null) {
                                                ((WR1)object).b(object2);
                                                bl3 = false;
                                                object2 = null;
                                            }
                                            ((WR1)object).b(object4);
                                        }
                                    }
                                    object4 = ((LP1$c)object4).f;
                                }
                                if (n3 == n8) continue;
                            }
                        }
                        object2 = go0.b((WR1)object);
                    }
                }
                bl4 = true;
            }
        }
        return bl4;
    }

    public final void g(long l2, hr1_0 hr1_02) {
        S32 s32;
        int n3;
        Object object = this.c;
        boolean n32 = ((Zv2)object).b(l2);
        int n4 = 0;
        if (n32 && (n3 = hr1_02.a(this)) < 0) {
            int n7 = ((Zv2)object).a;
            s32 = null;
            for (int i3 = 0; i3 < n7; ++i3) {
                long[] lArray = ((Zv2)object).b;
                long l3 = lArray[i3];
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 != false) continue;
                ((Zv2)object).c(i3);
                break;
            }
            object = this.d;
            ((pb1_0)object).m(l2);
        }
        object = this.a;
        int n8 = ((WR1)object).c;
        if (n8 > 0) {
            object = ((WR1)object).a;
            do {
                s32 = (S32)object[n4];
                s32.g(l2, hr1_02);
            } while (++n4 < n8);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Node(pointerInputFilter=");
        Object object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", children=");
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", pointerIds=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

