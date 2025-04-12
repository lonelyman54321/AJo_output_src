/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

public final class T32 {
    public final xp1_0 a;
    public final Fh1 b;
    public w32_0 c;
    public final ai3_1 d;
    public LP1$c e;
    public WR1 f;
    public WR1 g;
    public T32$a h;

    public T32(xp1_0 object) {
        Fh1 fh1;
        this.a = object;
        this.b = fh1 = new Fh1((xp1_0)object);
        this.c = fh1;
        this.d = object = fh1.P;
        this.e = object;
    }

    public static final void a(T32 t32, LP1$c object, w32_0 w32_02) {
        t32.getClass();
        object = ((LP1$c)object).e;
        while (object != null) {
            U32$a u32$a = U32.a;
            if (object == u32$a) {
                object = t32.a.A();
                object = object != null ? ((xp1_0)object).y.b : null;
                w32_02.q = object;
                t32.c = w32_02;
                break;
            }
            int n3 = ((LP1$c)object).c & 2;
            if (n3 != 0) break;
            ((LP1$c)object).q1(w32_02);
            object = ((LP1$c)object).e;
        }
    }

    public static LP1$c b(LP1$b object, LP1$c lP1$c) {
        LP1$c lP1$c2;
        int n3 = object instanceof up1_0;
        int n4 = 1;
        if (n3 != 0) {
            object = ((up1_0)object).b();
            ((LP1$c)object).c = n3 = c42_0.g((LP1$c)object);
        } else {
            int n7;
            lP1$c2 = new LP1$c();
            lP1$c2.c = n7 = c42_0.e((LP1$b)object);
            lP1$c2.n = object;
            lP1$c2.o = n4;
            object = new HashSet();
            lP1$c2.q = object;
            object = lP1$c2;
        }
        n3 = ((LP1$c)object).m ^ n4;
        if (n3 != 0) {
            ((LP1$c)object).i = n4;
            lP1$c2 = lP1$c.f;
            if (lP1$c2 != null) {
                lP1$c2.e = object;
                ((LP1$c)object).f = lP1$c2;
            }
            lP1$c.f = object;
            ((LP1$c)object).e = lP1$c;
            return object;
        }
        bh1_1.c("A ModifierNodeElement cannot return an already attached node from create() ");
        throw null;
    }

    public static LP1$c c(LP1$c lP1$c) {
        Object object;
        int n3 = lP1$c.m;
        if (n3 != 0) {
            object = c42_0.a;
            if (n3 != 0) {
                n3 = -1;
                int n4 = 2;
                c42_0.b(lP1$c, n3, n4);
                lP1$c.o1();
                lP1$c.i1();
            } else {
                bh1_1.c("autoInvalidateRemovedNode called on unattached node");
                throw null;
            }
        }
        LP1$c lP1$c2 = lP1$c.f;
        object = lP1$c.e;
        if (lP1$c2 != null) {
            lP1$c2.e = object;
            lP1$c.f = null;
        }
        if (object != null) {
            ((LP1$c)object).f = lP1$c2;
            lP1$c.e = null;
        }
        Intrinsics.checkNotNull(object);
        return object;
    }

    public static void h(LP1$b object, LP1$b object2, LP1$c lP1$c) {
        block11: {
            block10: {
                int n3;
                boolean bl2;
                boolean bl3;
                block9: {
                    bl3 = object instanceof up1_0;
                    bl2 = true;
                    if (!bl3 || !(bl3 = object2 instanceof up1_0)) break block9;
                    object2 = (up1_0)object2;
                    object = U32.a;
                    object = "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe";
                    Intrinsics.checkNotNull(lP1$c, (String)object);
                    ((up1_0)object2).j(lP1$c);
                    bl3 = lP1$c.m;
                    if (bl3) {
                        c42_0.d(lP1$c);
                    } else {
                        lP1$c.j = bl2;
                    }
                    break block10;
                }
                bl3 = lP1$c instanceof eu_1;
                if (!bl3) break block11;
                object = lP1$c;
                object = (eu_1)lP1$c;
                boolean bl4 = ((LP1$c)object).m;
                if (bl4) {
                    ((eu_1)object).s1();
                }
                ((eu_1)object).n = object2;
                ((LP1$c)object).c = n3 = c42_0.e((LP1$b)object2);
                n3 = ((LP1$c)object).m ? 1 : 0;
                if (n3 != 0) {
                    n3 = 0;
                    object2 = null;
                    ((eu_1)object).r1(false);
                }
                if (bl3 = lP1$c.m) {
                    c42_0.d(lP1$c);
                } else {
                    lP1$c.j = bl2;
                }
            }
            return;
        }
        object2 = "Unknown Modifier.Node type".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final boolean d(int n3) {
        LP1$c lP1$c = this.e;
        int n4 = lP1$c.d;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void e() {
        LP1$c lP1$c = this.e;
        while (lP1$c != null) {
            lP1$c.n1();
            boolean bl2 = lP1$c.i;
            if (bl2) {
                c42_0.a(lP1$c);
            }
            if (bl2 = lP1$c.j) {
                c42_0.d(lP1$c);
            }
            bl2 = false;
            lP1$c.i = false;
            lP1$c.j = false;
            lP1$c = lP1$c.f;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(int var1_1, WR1 var2_2, WR1 var3_3, LP1$c var4_4, boolean var5_5) {
        var6_6 /* !! */  = var1_1;
        var7_7 = var2_2;
        var8_8 = var3_3;
        var9_9 = this.h;
        if (var9_9 == null) {
            var9_9 = var10_10;
            var11_11 = var4_4;
            var12_12 = var1_1;
            var13_13 = var3_3;
            var14_14 /* !! */  = var5_5;
            var10_10 = new T32$a(this, var4_4, var1_1, var2_2, var3_3, (boolean)var5_5);
            this.h = var10_10;
        } else {
            var9_9.a = var4_4;
            var9_9.b = var1_1;
            var9_9.c = var2_2;
            var9_9.d = var3_3;
            var15_15 /* !! */  = var5_5;
            var9_9.e = var5_5;
        }
        var15_15 /* !! */  = var7_7.c - var6_6 /* !! */ ;
        var16_16 /* !! */  = var8_8.c - var6_6 /* !! */ ;
        var12_12 = var15_15 /* !! */  + var16_16 /* !! */ ;
        var17_17 /* !! */  = 1;
        var18_18 = 1.4E-45f;
        var12_12 += var17_17 /* !! */ ;
        var19_19 /* !! */  = 2;
        var6_6 /* !! */  = (var12_12 /= var19_19 /* !! */ ) * 3;
        var20_20 = new ej1(var6_6 /* !! */ );
        var22_22 = var12_12 * 4;
        var21_21 = new ej1(var22_22);
        var22_22 = 0;
        var7_7 = null;
        var21_21.b(0, var15_15 /* !! */ , 0, var16_16 /* !! */ );
        var12_12 = var12_12 * 2 + var17_17 /* !! */ ;
        var8_8 = new int[var12_12];
        var10_10 = new int[var12_12];
        var23_23 = 5;
        var24_24 = new int[var23_23];
        block0: while ((var25_25 = var21_21.b) != 0) {
            block36: {
                block35: {
                    var26_26 = var21_21.a;
                    var21_21.b = var27_27 /* !! */  = var25_25 + -1;
                    var27_27 /* !! */  = var26_26[var27_27 /* !! */ ];
                    var21_21.b = var22_22 = var25_25 + -2;
                    var22_22 = var26_26[var22_22];
                    var21_21.b = var19_19 /* !! */  = var25_25 + -3;
                    var19_19 /* !! */  = var26_26[var19_19 /* !! */ ];
                    var21_21.b = var25_25 += -4;
                    var25_25 = var26_26[var25_25];
                    var28_28 /* !! */  = var19_19 /* !! */  - var25_25;
                    var29_29 /* !! */  = (reference)(var27_27 /* !! */  - var22_22);
                    if (var28_28 /* !! */  >= var17_17 /* !! */  && var29_29 /* !! */  >= var17_17 /* !! */ ) break block35;
                    var30_30 = var15_15 /* !! */ ;
                    var31_31 = var16_16 /* !! */ ;
                    var5_5 = var12_12;
                    var13_13 = var21_21;
                    break block36;
                }
                var17_17 /* !! */  = (var28_28 /* !! */  + var29_29 /* !! */  + 1) / 2;
                var32_32 = var12_12 / 2;
                var33_33 = var32_32 + 1;
                var8_8[var33_33] = var25_25;
                var10_10[var33_33] = var19_19 /* !! */ ;
                var5_5 = var12_12;
                for (var12_12 = 0; var12_12 < var17_17 /* !! */ ; ++var12_12) {
                    var33_33 = var28_28 /* !! */  - var29_29 /* !! */ ;
                    var34_34 /* !! */  = Math.abs(var33_33);
                    var35_35 = var17_17 /* !! */ ;
                    var36_36 = 2;
                    var17_17 /* !! */  = var34_34 /* !! */  % 2;
                    var34_34 /* !! */  = (int)var29_29 /* !! */ ;
                    var29_29 /* !! */  = (reference)true;
                    if (var17_17 /* !! */  == var29_29 /* !! */ ) {
                        var17_17 /* !! */  = 1;
                        var18_18 = 1.4E-45f;
                    } else {
                        var17_17 /* !! */  = 0;
                        var18_18 = 0.0f;
                    }
                    var29_29 /* !! */  = (reference)(-var12_12);
                    var36_36 = var28_28 /* !! */ ;
                    var28_28 /* !! */  = (int)var29_29 /* !! */ ;
                    while (true) {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block37: {
                                            block39: {
                                                block38: {
                                                    var37_37 = 4;
                                                    if (var28_28 /* !! */  > var12_12) break;
                                                    if (var28_28 /* !! */  == var29_29 /* !! */ ) break block37;
                                                    if (var28_28 /* !! */  == var12_12) break block38;
                                                    var38_38 = var28_28 /* !! */  + 1 + var32_32;
                                                    var30_30 = var15_15 /* !! */ ;
                                                    var15_15 /* !! */  = (int)var8_8[var38_38];
                                                    var38_38 = var28_28 /* !! */  + -1 + var32_32;
                                                    var31_31 = var16_16 /* !! */ ;
                                                    var16_16 /* !! */  = (int)var8_8[var38_38];
                                                    if (var15_15 /* !! */  <= var16_16 /* !! */ ) break block39;
                                                    break block40;
                                                }
                                                var30_30 = var15_15 /* !! */ ;
                                                var31_31 = var16_16 /* !! */ ;
                                            }
                                            var15_15 /* !! */  = var28_28 /* !! */  + -1 + var32_32;
                                            var15_15 /* !! */  = (int)var8_8[var15_15 /* !! */ ];
                                            var16_16 /* !! */  = var15_15 /* !! */  + 1;
                                            break block41;
                                        }
                                        var30_30 = var15_15 /* !! */ ;
                                        var31_31 = var16_16 /* !! */ ;
                                    }
                                    var15_15 /* !! */  = var28_28 /* !! */  + 1 + var32_32;
                                    var16_16 /* !! */  = var15_15 /* !! */  = (int)var8_8[var15_15 /* !! */ ];
                                }
                                var38_38 = var16_16 /* !! */  - var25_25 + var22_22 - var28_28 /* !! */ ;
                                var39_39 = var12_12 != 0 && var16_16 /* !! */  == var15_15 /* !! */  ? var38_38 + -1 : var38_38;
                                var40_40 = var21_21;
                                for (var6_6 /* !! */  = var38_38; var16_16 /* !! */  < var19_19 /* !! */  && var6_6 /* !! */  < var27_27 /* !! */  && (var41_41 = (int)var9_9.a(var16_16 /* !! */ , var6_6 /* !! */ )) != 0; ++var16_16 /* !! */ , ++var6_6 /* !! */ ) {
                                }
                                var41_41 = var32_32 + var28_28 /* !! */ ;
                                var8_8[var41_41] = var16_16 /* !! */ ;
                                var41_41 = var17_17 /* !! */ ;
                                var42_42 = var18_18;
                                if (var17_17 /* !! */  == 0) break block42;
                                var17_17 /* !! */  = var33_33 - var28_28 /* !! */ ;
                                var43_43 = var20_20;
                                var14_14 /* !! */  = (int)(var29_29 /* !! */  + true);
                                if (var17_17 /* !! */  < var14_14 /* !! */  || var17_17 /* !! */  > (var14_14 /* !! */  = var12_12 + -1)) break block43;
                                var17_17 /* !! */  = var32_32 + var17_17 /* !! */ ;
                                if ((var17_17 /* !! */  = (int)var10_10[var17_17 /* !! */ ]) > var16_16 /* !! */ ) break block43;
                                var17_17 /* !! */  = 0;
                                var18_18 = 0.0f;
                                var24_24[0] = var15_15 /* !! */ ;
                                var24_24[1] = var39_39;
                                var24_24[2] = var16_16 /* !! */ ;
                                var24_24[3] = var6_6 /* !! */ ;
                                var24_24[var37_37] = 0;
                                var39_39 = var19_19 /* !! */ ;
                                var41_41 = var27_27 /* !! */ ;
                                var15_15 /* !! */  = 1;
                                var16_16 /* !! */  = 3;
                                ** GOTO lbl199
                            }
                            var43_43 = var20_20;
                        }
                        var28_28 /* !! */  += 2;
                        var21_21 = var40_40;
                        var15_15 /* !! */  = var30_30;
                        var16_16 /* !! */  = var31_31;
                        var17_17 /* !! */  = var41_41;
                        var18_18 = var42_42;
                        var20_20 = var43_43;
                    }
                    var30_30 = var15_15 /* !! */ ;
                    var31_31 = var16_16 /* !! */ ;
                    var43_43 = var20_20;
                    var40_40 = var21_21;
                    var15_15 /* !! */  = var33_33 % 2;
                    var15_15 /* !! */  = var15_15 /* !! */  == 0 ? 1 : 0;
                    for (var16_16 /* !! */  = (int)var29_29 /* !! */ ; var16_16 /* !! */  <= var12_12; var16_16 /* !! */  += 2) {
                        block44: {
                            block34: {
                                if (var16_16 /* !! */  == var29_29 /* !! */ ) ** GOTO lbl-1000
                                if (var16_16 /* !! */  == var12_12) ** GOTO lbl-1000
                                var17_17 /* !! */  = var16_16 /* !! */  + 1 + var32_32;
                                var17_17 /* !! */  = (int)var10_10[var17_17 /* !! */ ];
                                var14_14 /* !! */  = var16_16 /* !! */  + -1 + var32_32;
                                if (var17_17 /* !! */  >= (var14_14 /* !! */  = (int)var10_10[var14_14 /* !! */ ])) lbl-1000:
                                // 2 sources

                                {
                                    var17_17 /* !! */  = var16_16 /* !! */  + -1 + var32_32;
                                    var17_17 /* !! */  = (int)var10_10[var17_17 /* !! */ ];
                                    var14_14 /* !! */  = var17_17 /* !! */  + -1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var17_17 /* !! */  = var16_16 /* !! */  + 1 + var32_32;
                                    var14_14 /* !! */  = var17_17 /* !! */  = (int)var10_10[var17_17 /* !! */ ];
                                }
                                var6_6 /* !! */  = var19_19 /* !! */  - var14_14 /* !! */  - var16_16 /* !! */ ;
                                var6_6 /* !! */  = var27_27 /* !! */  - var6_6 /* !! */ ;
                                var28_28 /* !! */  = var12_12 != 0 && var14_14 /* !! */  == var17_17 /* !! */  ? var6_6 /* !! */  + 1 : var6_6 /* !! */ ;
                                while (var14_14 /* !! */  > var25_25 && var6_6 /* !! */  > var22_22) {
                                    var39_39 = var19_19 /* !! */ ;
                                    var19_19 /* !! */  = var14_14 /* !! */  + -1;
                                    var41_41 = var27_27 /* !! */ ;
                                    var27_27 /* !! */  = var6_6 /* !! */  + -1;
                                    if ((var19_19 /* !! */  = (int)var9_9.a(var19_19 /* !! */ , var27_27 /* !! */ )) != 0) {
                                        var14_14 /* !! */  += -1;
                                        var6_6 /* !! */  += -1;
                                        var19_19 /* !! */  = var39_39;
                                        var27_27 /* !! */  = var41_41;
                                        continue;
                                    }
                                    break block34;
                                }
                                var39_39 = var19_19 /* !! */ ;
                                var41_41 = var27_27 /* !! */ ;
                            }
                            var19_19 /* !! */  = var32_32 + var16_16 /* !! */ ;
                            var10_10[var19_19 /* !! */ ] = var14_14 /* !! */ ;
                            if (var15_15 /* !! */  == 0 || (var19_19 /* !! */  = var33_33 - var16_16 /* !! */ ) < var29_29 /* !! */  || var19_19 /* !! */  > var12_12) break block44;
                            var19_19 /* !! */  = var32_32 + var19_19 /* !! */ ;
                            if ((var19_19 /* !! */  = (int)var8_8[var19_19 /* !! */ ]) < var14_14 /* !! */ ) break block44;
                            var19_19 /* !! */  = 0;
                            var13_13 = null;
                            var24_24[0] = var14_14 /* !! */ ;
                            var15_15 /* !! */  = 1;
                            var24_24[var15_15 /* !! */ ] = var6_6 /* !! */ ;
                            var24_24[2] = var17_17 /* !! */ ;
                            var16_16 /* !! */  = 3;
                            var24_24[var16_16 /* !! */ ] = var28_28 /* !! */ ;
                            var24_24[var37_37] = var15_15 /* !! */ ;
lbl199:
                            // 2 sources

                            var12_12 = h83.b(var24_24);
                            if (var12_12 > 0) {
                                var12_12 = var24_24[var16_16 /* !! */ ];
                                var16_16 /* !! */  = var24_24[var15_15 /* !! */ ];
                                var17_17 /* !! */  = var24_24[2];
                                var15_15 /* !! */  = 0;
                                var19_19 /* !! */  = var24_24[0];
                                if ((var12_12 -= var16_16 /* !! */ ) != (var17_17 /* !! */  -= var19_19 /* !! */ )) {
                                    var15_15 /* !! */  = var24_24[var37_37];
                                    if (var15_15 /* !! */  != 0) {
                                        var15_15 /* !! */  = h83.b(var24_24);
                                        var20_20 = var43_43;
                                        var43_43.a(var19_19 /* !! */ , var16_16 /* !! */ , var15_15 /* !! */ );
                                    } else {
                                        var20_20 = var43_43;
                                        if (var12_12 > var17_17 /* !! */ ) {
                                            var15_15 /* !! */  = h83.b(var24_24);
                                            var43_43.a(var19_19 /* !! */ , ++var16_16 /* !! */ , var15_15 /* !! */ );
                                        } else {
                                            var15_15 /* !! */  = h83.b(var24_24);
                                            var43_43.a(++var19_19 /* !! */ , var16_16 /* !! */ , var15_15 /* !! */ );
                                        }
                                    }
                                } else {
                                    var20_20 = var43_43;
                                    var43_43.a(var19_19 /* !! */ , var16_16 /* !! */ , var17_17 /* !! */ );
                                }
lbl223:
                                // 5 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var20_20 = var43_43;
                            ** continue;
                            var15_15 /* !! */  = 0;
                            var16_16 /* !! */  = var24_24[0];
                            var17_17 /* !! */  = 1;
                            var18_18 = 1.4E-45f;
                            var15_15 /* !! */  = var24_24[var17_17 /* !! */ ];
                            var13_13 = var40_40;
                            var40_40.b(var25_25, var16_16 /* !! */ , var22_22, var15_15 /* !! */ );
                            var6_6 /* !! */  = 2;
                            var15_15 /* !! */  = var24_24[var6_6 /* !! */ ];
                            var16_16 /* !! */  = var24_24[3];
                            var28_28 /* !! */  = var39_39;
                            var27_27 /* !! */  = var41_41;
                            var40_40.b(var15_15 /* !! */ , var39_39, var16_16 /* !! */ , var41_41);
lbl240:
                            // 2 sources

                            while (true) {
                                var12_12 = var5_5;
                                var21_21 = var13_13;
                                var15_15 /* !! */  = var30_30;
                                var16_16 /* !! */  = var31_31;
                                var19_19 /* !! */  = 2;
                                var22_22 = 0;
                                var7_7 = null;
                                continue block0;
                                break;
                            }
                        }
                        var13_13 = var40_40;
                        var28_28 /* !! */  = var39_39;
                        var27_27 /* !! */  = var41_41;
                        var20_20 = var43_43;
                        var17_17 /* !! */  = 1;
                        var18_18 = 1.4E-45f;
                        var6_6 /* !! */  = 2;
                        var19_19 /* !! */  = var39_39;
                    }
                    var28_28 /* !! */  = var19_19 /* !! */ ;
                    var13_13 = var40_40;
                    var20_20 = var43_43;
                    var18_18 = 1.4E-45f;
                    var6_6 /* !! */  = 2;
                    var21_21 = var40_40;
                    var29_29 /* !! */  = (reference)var34_34 /* !! */ ;
                    var28_28 /* !! */  = var36_36;
                    var17_17 /* !! */  = var35_35;
                    var15_15 /* !! */  = var30_30;
                    var16_16 /* !! */  = var31_31;
                }
                var30_30 = var15_15 /* !! */ ;
                var31_31 = var16_16 /* !! */ ;
                var13_13 = var21_21;
                var17_17 /* !! */  = 1;
                var18_18 = 1.4E-45f;
            }
            var6_6 /* !! */  = 2;
            ** continue;
        }
        var30_30 = var15_15 /* !! */ ;
        var31_31 = var16_16 /* !! */ ;
        var15_15 /* !! */  = var20_20.b;
        var16_16 /* !! */  = var15_15 /* !! */  % 3;
        if (var16_16 /* !! */  == 0) {
            var16_16 /* !! */  = 3;
            if (var15_15 /* !! */  > var16_16 /* !! */ ) {
                var17_17 /* !! */  = 0;
                var18_18 = 0.0f;
                var20_20.c(0, var15_15 /* !! */  -= var16_16 /* !! */ );
lbl289:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var17_17 /* !! */  = 0;
            var18_18 = 0.0f;
            ** continue;
            var15_15 /* !! */  = var30_30;
            var16_16 /* !! */  = var31_31;
            var20_20.a(var30_30, var31_31, 0);
            var15_15 /* !! */  = 0;
            var16_16 /* !! */  = 0;
            var11_11 = null;
            var12_12 = 0;
            block9: while (var15_15 /* !! */  < (var19_19 /* !! */  = var20_20.b)) {
                var13_13 = var20_20.a;
                var29_29 /* !! */  = var13_13[var15_15 /* !! */ ];
                var6_6 /* !! */  = var15_15 /* !! */  + 2;
                var6_6 /* !! */  = (int)var13_13[var6_6 /* !! */ ];
                var29_29 /* !! */  -= var6_6 /* !! */ ;
                var22_22 = var15_15 /* !! */  + 1;
                var19_19 /* !! */  = (int)(var13_13[var22_22] - var6_6 /* !! */ );
                var15_15 /* !! */  += 3;
                while (var16_16 /* !! */  < var29_29 /* !! */ ) {
                    var9_9.c();
                    ++var16_16 /* !! */ ;
                }
                while (var12_12 < var19_19 /* !! */ ) {
                    var9_9.b(var12_12);
                    ++var12_12;
                }
                while (true) {
                    var19_19 /* !! */  = var6_6 /* !! */  + -1;
                    if (var6_6 /* !! */  <= 0) continue block9;
                    var9_9.d(var16_16 /* !! */ , var12_12);
                    ++var16_16 /* !! */ ;
                    ++var12_12;
                    var6_6 /* !! */  = var19_19 /* !! */ ;
                }
            }
            var9_9 = this.d.e;
            var22_22 = 0;
            var7_7 = null;
            while (var9_9 != null && var9_9 != (var11_11 = U32.a)) {
                var16_16 /* !! */  = var9_9.c;
                var9_9.d = var22_22 |= var16_16 /* !! */ ;
                var9_9 = var9_9.e;
            }
            return;
        }
        bh1_1.c("Array size not a multiple of 3");
        throw null;
    }

    public final void g() {
        Object object;
        Object object2 = this.d.e;
        w32_0 w32_02 = this.b;
        while (true) {
            object = this.a;
            if (object2 == null) break;
            rp1_1 rp1_12 = go0.c((LP1$c)object2);
            if (rp1_12 != null) {
                w32_0 w32_03 = ((LP1$c)object2).h;
                if (w32_03 != null) {
                    Intrinsics.checkNotNull(w32_03, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    w32_03 = (sp1_1)w32_03;
                    object = ((sp1_1)w32_03).P;
                    ((sp1_1)w32_03).H1(rp1_12);
                    if (object != object2 && (object = w32_03.G) != null) {
                        object.invalidate();
                    }
                } else {
                    w32_03 = new sp1_1((xp1_0)object, rp1_12);
                    ((LP1$c)object2).q1(w32_03);
                }
                w32_02.q = w32_03;
                w32_03.p = w32_02;
                w32_02 = w32_03;
            } else {
                ((LP1$c)object2).q1(w32_02);
            }
            object2 = ((LP1$c)object2).e;
        }
        object2 = ((xp1_0)object).A();
        object2 = object2 != null ? ((xp1_0)object2).y.b : null;
        w32_02.q = object2;
        this.c = w32_02;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("[");
        LP1$c lP1$c = this.e;
        ai3_1 ai3_12 = this.d;
        String string2 = "]";
        if (lP1$c == ai3_12) {
            ((StringBuilder)charSequence).append(string2);
        } else {
            while (lP1$c != null && lP1$c != ai3_12) {
                Object object = String.valueOf(lP1$c);
                ((StringBuilder)charSequence).append((String)object);
                object = lP1$c.f;
                if (object == ai3_12) {
                    ((StringBuilder)charSequence).append(string2);
                    break;
                }
                object = ",";
                ((StringBuilder)charSequence).append((String)object);
                lP1$c = lP1$c.f;
            }
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder().apply(builderAction).toString()");
        return charSequence;
    }
}

