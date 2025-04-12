/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b$b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/*
 * Renamed from u92
 */
public final class u92_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(FocusTargetNode object, b$b object2) {
        Object object3 = ((FocusTargetNode)object).s1();
        int[] nArray = u92$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object3).ordinal();
        n3 = nArray[n3];
        int n4 = 4;
        int n7 = 3;
        boolean bl2 = false;
        int n8 = 2;
        int n10 = 1;
        if (n3 != n10) {
            if (n3 == n8) return u92_0.d((FocusTargetNode)object, (b$b)object2);
            if (n3 == n7) return u92_0.d((FocusTargetNode)object, (b$b)object2);
            if (n3 == n4) {
                boolean bl3;
                n3 = (int)(u92_0.d((FocusTargetNode)object, (b$b)object2) ? 1 : 0);
                if (n3 != 0) return true;
                object3 = ((FocusTargetNode)object).r1();
                n3 = (int)(((ju0_0)object3).a ? 1 : 0);
                if (n3 != 0) {
                    object = (Boolean)((b$b)object2).invoke(object);
                    bl3 = (Boolean)object;
                } else {
                    bl3 = false;
                    object = null;
                }
                if (!bl3) return bl2;
                return true;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object3 = AU0.c((FocusTargetNode)object);
        String string2 = "ActiveParent must have a focusedChild";
        if (object3 != null) {
            uu0_1 uu0_12 = ((FocusTargetNode)object3).s1();
            int n14 = uu0_12.ordinal();
            int n15 = nArray[n14];
            if (n15 != n10) {
                if (n15 == n8) return u92_0.c((FocusTargetNode)object, (FocusTargetNode)object3, n8, (b$b)object2);
                if (n15 == n7) return u92_0.c((FocusTargetNode)object, (FocusTargetNode)object3, n8, (b$b)object2);
                if (n15 != n4) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object2 = string2.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            n15 = (int)(u92_0.a((FocusTargetNode)object3, (b$b)object2) ? 1 : 0);
            if (n15 != 0) return true;
            boolean bl4 = u92_0.c((FocusTargetNode)object, (FocusTargetNode)object3, n8, (b$b)object2);
            if (bl4) return true;
            object = ((FocusTargetNode)object3).r1();
            bl4 = ((ju0_0)object).a;
            if (!bl4) return bl2;
            object = (Boolean)((b$b)object2).invoke(object3);
            bl4 = (Boolean)object;
            if (!bl4) return bl2;
            return true;
        }
        object2 = string2.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(FocusTargetNode object, b$b object2) {
        Object object3 = ((FocusTargetNode)object).s1();
        int[] nArray = u92$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object3).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            if (n3 == n4) return (int)(u92_0.e((FocusTargetNode)object, (b$b)object2) ? 1 : 0) != 0;
            n4 = 3;
            if (n3 == n4) return (int)(u92_0.e((FocusTargetNode)object, (b$b)object2) ? 1 : 0) != 0;
            n4 = 4;
            if (n3 == n4) {
                object3 = ((FocusTargetNode)object).r1();
                n3 = (int)(((ju0_0)object3).a ? 1 : 0);
                if (n3 == 0) return (int)(u92_0.e((FocusTargetNode)object, (b$b)object2) ? 1 : 0) != 0;
                object = (Boolean)((b$b)object2).invoke(object);
                return (int)(((Boolean)object).booleanValue() ? 1 : 0) != 0;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object3 = AU0.c((FocusTargetNode)object);
        if (object3 != null) {
            boolean bl2 = u92_0.b((FocusTargetNode)object3, (b$b)object2);
            if (bl2) return n4 != 0;
            boolean bl3 = u92_0.c((FocusTargetNode)object, (FocusTargetNode)object3, n4, (b$b)object2);
            if (!bl3) return 0 != 0;
            return n4 != 0;
        }
        object2 = "ActiveParent must have a focusedChild".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final boolean c(FocusTargetNode object, FocusTargetNode focusTargetNode, int n3, b$b b$b) {
        boolean bl2;
        boolean bl3 = u92_0.f((FocusTargetNode)object, focusTargetNode, n3, b$b);
        if (bl3) {
            return true;
        }
        v92 v922 = new v92((FocusTargetNode)object, focusTargetNode, n3, b$b);
        if ((object = (Boolean)Bx.a((FocusTargetNode)object, n3, v922)) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean d(FocusTargetNode var0, b$b var1_1) {
        var2_2 = 16;
        var3_3 = new FocusTargetNode[var2_2];
        var0 = var0.a;
        var4_4 = var0.m;
        if (var4_4) {
            var6_6 /* !! */  = new LP1$c[var2_2];
            var5_5 = new WR1(var6_6 /* !! */ );
            var6_6 /* !! */  = var0.f;
            if (var6_6 /* !! */  == null) {
                go0.a((WR1)var5_5, (LP1$c)var0);
lbl11:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5.b(var6_6 /* !! */ );
            ** continue;
            var7_7 = 0;
            var0 = null;
            block1: while (true) {
                var8_8 = var5_5.l();
                var9_9 = 1;
                if (var8_8 == 0) break;
                var8_8 = var5_5.c - var9_9;
                var6_6 /* !! */  = (LP1$c)var5_5.n(var8_8);
                var10_10 = var6_6 /* !! */ .d & 1024;
                if (var10_10 == 0) {
                    go0.a((WR1)var5_5, (LP1$c)var6_6 /* !! */ );
                    continue;
                }
                while (true) {
                    if (var6_6 /* !! */  == null) continue block1;
                    var10_10 = var6_6 /* !! */ .c & 1024;
                    if (var10_10 != 0) {
                        var10_10 = 0;
                        var11_11 = null;
                        while (true) {
                            if (var6_6 /* !! */  == null) ** break;
                            var12_12 = var6_6 /* !! */  instanceof FocusTargetNode;
                            if (var12_12 != 0) {
                                var6_6 /* !! */  = (FocusTargetNode)var6_6 /* !! */ ;
                                var13_13 = var3_3.length;
                                var12_12 = var7_7 + 1;
                                if (var13_13 < var12_12) {
                                    var13_13 = var3_3.length * 2;
                                    var13_13 = Math.max(var12_12, var13_13);
                                    var3_3 = Arrays.copyOf(var3_3, var13_13);
                                    var14_14 = "copyOf(this, newSize)";
                                    Intrinsics.checkNotNullExpressionValue(var3_3, var14_14);
                                }
                                var3_3[var7_7] = var6_6 /* !! */ ;
                                var7_7 = var12_12;
                            } else {
                                var12_12 = ((LP1$c)var6_6 /* !! */ ).c & 1024;
                                if (var12_12 != 0 && (var12_12 = var6_6 /* !! */  instanceof mo0_0) != 0) {
                                    var15_15 /* !! */  = var6_6 /* !! */ ;
                                    var15_15 /* !! */  = ((mo0_0)var6_6 /* !! */ ).o;
                                    var13_13 = 0;
                                    var14_14 = null;
                                    while (var15_15 /* !! */  != null) {
                                        var16_16 = var15_15 /* !! */ .c & 1024;
                                        if (var16_16 != 0) {
                                            if (++var13_13 == var9_9) {
                                                var6_6 /* !! */  = var15_15 /* !! */ ;
                                            } else {
                                                if (var11_11 == null) {
                                                    var17_17 = new LP1$c[var2_2];
                                                    var11_11 = new WR1(var17_17);
                                                }
                                                if (var6_6 /* !! */  != null) {
                                                    var11_11.b(var6_6 /* !! */ );
                                                    var8_8 = 0;
                                                    var6_6 /* !! */  = null;
                                                }
                                                var11_11.b(var15_15 /* !! */ );
                                            }
                                        }
                                        var15_15 /* !! */  = var15_15 /* !! */ .f;
                                    }
                                    if (var13_13 == var9_9) continue;
                                }
                            }
                            var6_6 /* !! */  = go0.b(var11_11);
                        }
                    }
                    var6_6 /* !! */  = var6_6 /* !! */ .f;
                }
                break;
            }
            var18_18 = BU0.a;
            Intrinsics.checkNotNullParameter(var3_3, "<this>");
            var5_5 = "comparator";
            Intrinsics.checkNotNullParameter(var18_18, (String)var5_5);
            Arrays.sort(var3_3, 0, var7_7, var18_18);
            if (var7_7 > 0) {
                var7_7 -= var9_9;
                do {
                    if (!(var4_4 = AU0.d((FocusTargetNode)(var18_18 = var3_3[var7_7]))) || (var2_2 = (int)u92_0.a((FocusTargetNode)var18_18, (b$b)var1_1)) == 0) continue;
                    return (boolean)var9_9;
                } while ((var7_7 += -1) >= 0);
            }
            return false;
        }
        var1_1 = "visitChildren called on an unattached node".toString();
        var0 = new IllegalStateException((String)var1_1);
        throw var0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean e(FocusTargetNode var0, b$b var1_1) {
        var2_2 = 16;
        var3_3 = new FocusTargetNode[var2_2];
        var0 = var0.a;
        var4_4 = var0.m;
        if (var4_4) {
            var6_6 /* !! */  = new LP1$c[var2_2];
            var5_5 = new WR1(var6_6 /* !! */ );
            var6_6 /* !! */  = var0.f;
            var7_7 = false;
            if (var6_6 /* !! */  == null) {
                go0.a((WR1)var5_5, (LP1$c)var0);
lbl12:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5.b(var6_6 /* !! */ );
            ** continue;
            var8_8 = 0;
            var0 = null;
            block1: while (true) {
                var9_9 = var5_5.l();
                var10_10 = 1;
                if (var9_9 == 0) break;
                var9_9 = var5_5.c - var10_10;
                var6_6 /* !! */  = (LP1$c)var5_5.n(var9_9);
                var11_11 = var6_6 /* !! */ .d & 1024;
                if (var11_11 == 0) {
                    go0.a((WR1)var5_5, (LP1$c)var6_6 /* !! */ );
                    continue;
                }
                while (true) {
                    if (var6_6 /* !! */  == null) continue block1;
                    var11_11 = var6_6 /* !! */ .c & 1024;
                    if (var11_11 != 0) {
                        var11_11 = 0;
                        var12_12 = null;
                        while (true) {
                            if (var6_6 /* !! */  == null) ** break;
                            var13_13 = var6_6 /* !! */  instanceof FocusTargetNode;
                            if (var13_13 != 0) {
                                var6_6 /* !! */  = (FocusTargetNode)var6_6 /* !! */ ;
                                var14_14 = var3_3.length;
                                var13_13 = var8_8 + 1;
                                if (var14_14 < var13_13) {
                                    var14_14 = var3_3.length * 2;
                                    var14_14 = Math.max(var13_13, var14_14);
                                    var3_3 = Arrays.copyOf(var3_3, var14_14);
                                    var15_15 = "copyOf(this, newSize)";
                                    Intrinsics.checkNotNullExpressionValue(var3_3, var15_15);
                                }
                                var3_3[var8_8] = var6_6 /* !! */ ;
                                var8_8 = var13_13;
                            } else {
                                var13_13 = ((LP1$c)var6_6 /* !! */ ).c & 1024;
                                if (var13_13 != 0 && (var13_13 = var6_6 /* !! */  instanceof mo0_0) != 0) {
                                    var16_16 /* !! */  = var6_6 /* !! */ ;
                                    var16_16 /* !! */  = ((mo0_0)var6_6 /* !! */ ).o;
                                    var14_14 = 0;
                                    var15_15 = null;
                                    while (var16_16 /* !! */  != null) {
                                        var17_17 = var16_16 /* !! */ .c & 1024;
                                        if (var17_17 != 0) {
                                            if (++var14_14 == var10_10) {
                                                var6_6 /* !! */  = var16_16 /* !! */ ;
                                            } else {
                                                if (var12_12 == null) {
                                                    var18_18 = new LP1$c[var2_2];
                                                    var12_12 = new WR1(var18_18);
                                                }
                                                if (var6_6 /* !! */  != null) {
                                                    var12_12.b(var6_6 /* !! */ );
                                                    var9_9 = 0;
                                                    var6_6 /* !! */  = null;
                                                }
                                                var12_12.b(var16_16 /* !! */ );
                                            }
                                        }
                                        var16_16 /* !! */  = var16_16 /* !! */ .f;
                                    }
                                    if (var14_14 == var10_10) continue;
                                }
                            }
                            var6_6 /* !! */  = go0.b(var12_12);
                        }
                    }
                    var6_6 /* !! */  = var6_6 /* !! */ .f;
                }
                break;
            }
            var19_19 = BU0.a;
            Intrinsics.checkNotNullParameter(var3_3, "<this>");
            var5_5 = "comparator";
            Intrinsics.checkNotNullParameter(var19_19, (String)var5_5);
            Arrays.sort(var3_3, 0, var8_8, var19_19);
            if (var8_8 > 0) {
                var2_2 = 0;
                var19_19 = null;
                do {
                    if ((var9_9 = (int)AU0.d((FocusTargetNode)(var5_5 = var3_3[var2_2]))) == 0 || !(var4_4 = u92_0.b((FocusTargetNode)var5_5, (b$b)var1_1))) continue;
                    var7_7 = true;
                    break;
                } while (++var2_2 < var8_8);
            }
            return var7_7;
        }
        var1_1 = "visitChildren called on an unattached node".toString();
        var0 = new IllegalStateException((String)var1_1);
        throw var0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean f(FocusTargetNode var0, FocusTargetNode var1_1, int var2_2, b$b var3_3) {
        block48: {
            block49: {
                block51: {
                    block46: {
                        block50: {
                            var4_4 = var0;
                            var5_5 = var1_1;
                            var6_6 = var2_2;
                            var7_7 = var3_3;
                            var8_8 = var0.s1();
                            if (var8_8 != (var9_9 /* !! */  = uu0_1.ActiveParent)) break block48;
                            var10_10 = 16;
                            var9_9 /* !! */  = new FocusTargetNode[var10_10];
                            var11_11 = var0.a;
                            var12_12 = var11_11.m;
                            if (var12_12 == 0) break block49;
                            var14_14 /* !! */  = new LP1$c[var10_10];
                            var13_13 /* !! */  = new WR1(var14_14 /* !! */ );
                            var14_14 /* !! */  = var11_11.f;
                            if (var14_14 /* !! */  == null) {
                                go0.a((WR1)var13_13 /* !! */ , (LP1$c)var11_11);
lbl17:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var13_13 /* !! */ .b(var14_14 /* !! */ );
                            ** while (true)
                            var15_15 = 0;
                            var11_11 = null;
                            block1: while (true) {
                                var16_16 = var13_13 /* !! */ .l();
                                var17_17 = 1;
                                var18_18 = 2;
                                if (var16_16 == 0) break;
                                var16_16 = var13_13 /* !! */ .c - var17_17;
                                var14_14 /* !! */  = (LP1$c)var13_13 /* !! */ .n(var16_16);
                                var19_19 = var14_14 /* !! */ .d & 1024;
                                if (var19_19 == 0) {
                                    go0.a((WR1)var13_13 /* !! */ , (LP1$c)var14_14 /* !! */ );
                                    continue;
                                }
                                while (true) {
                                    if (var14_14 /* !! */  == null) continue block1;
                                    var19_19 = var14_14 /* !! */ .c & 1024;
                                    if (var19_19 != 0) {
                                        var19_19 = 0;
                                        var20_20 = null;
                                        while (true) {
                                            if (var14_14 /* !! */  == null) ** break;
                                            var21_21 = var14_14 /* !! */  instanceof FocusTargetNode;
                                            if (var21_21 != 0) {
                                                var14_14 /* !! */  = (FocusTargetNode)var14_14 /* !! */ ;
                                                var22_22 = var9_9 /* !! */ .length;
                                                var21_21 = var15_15 + 1;
                                                if (var22_22 < var21_21) {
                                                    var22_22 = var9_9 /* !! */ .length * 2;
                                                    var22_22 = Math.max(var21_21, var22_22);
                                                    var9_9 /* !! */  = Arrays.copyOf(var9_9 /* !! */ , var22_22);
                                                    var23_23 = "copyOf(this, newSize)";
                                                    Intrinsics.checkNotNullExpressionValue(var9_9 /* !! */ , var23_23);
                                                }
                                                var9_9 /* !! */ [var15_15] = var14_14 /* !! */ ;
                                                var15_15 = var21_21;
                                            } else {
                                                var21_21 = ((LP1$c)var14_14 /* !! */ ).c & 1024;
                                                if (var21_21 != 0 && (var21_21 = var14_14 /* !! */  instanceof mo0_0) != 0) {
                                                    var24_24 /* !! */  = var14_14 /* !! */ ;
                                                    var24_24 /* !! */  = ((mo0_0)var14_14 /* !! */ ).o;
                                                    var22_22 = 0;
                                                    var23_23 = null;
                                                    while (var24_24 /* !! */  != null) {
                                                        var25_25 = var24_24 /* !! */ .c & 1024;
                                                        if (var25_25 != 0) {
                                                            if (++var22_22 == var17_17) {
                                                                var14_14 /* !! */  = var24_24 /* !! */ ;
                                                            } else {
                                                                if (var20_20 == null) {
                                                                    var26_26 = new LP1$c[var10_10];
                                                                    var20_20 = new WR1(var26_26);
                                                                }
                                                                if (var14_14 /* !! */  != null) {
                                                                    var20_20.b(var14_14 /* !! */ );
                                                                    var16_16 = 0;
                                                                    var14_14 /* !! */  = null;
                                                                }
                                                                var20_20.b(var24_24 /* !! */ );
                                                            }
                                                        }
                                                        var24_24 /* !! */  = var24_24 /* !! */ .f;
                                                    }
                                                    if (var22_22 == var17_17) continue;
                                                }
                                            }
                                            var14_14 /* !! */  = go0.b(var20_20);
                                        }
                                    }
                                    var14_14 /* !! */  = var14_14 /* !! */ .f;
                                }
                                break;
                            }
                            var13_13 /* !! */  = BU0.a;
                            Intrinsics.checkNotNullParameter(var9_9 /* !! */ , "<this>");
                            var14_14 /* !! */  = "comparator";
                            Intrinsics.checkNotNullParameter(var13_13 /* !! */ , (String)var14_14 /* !! */ );
                            Arrays.sort(var9_9 /* !! */ , 0, var15_15, var13_13 /* !! */ );
                            var12_12 = LT0.a(var6_6, var17_17);
                            if (var12_12 == 0) break block50;
                            var13_13 /* !! */  = new c(0, var15_15 -= var17_17, var17_17);
                            var15_15 = var13_13 /* !! */ .b;
                            if (var15_15 >= 0) {
                                var12_12 = 0;
                                var13_13 /* !! */  = null;
                                var16_16 = 0;
                                var14_14 /* !! */  = null;
                                while (true) {
                                    if (var12_12 != 0 && (var25_25 = AU0.d((FocusTargetNode)(var27_27 = var9_9 /* !! */ [var16_16]))) != 0 && (var18_18 = (int)u92_0.b((FocusTargetNode)var27_27, var7_7)) != 0) {
                                        return (boolean)var17_17;
                                    }
                                    var27_27 = var9_9 /* !! */ [var16_16];
                                    var18_18 = (int)Intrinsics.areEqual(var27_27, var5_5);
                                    if (var18_18 != 0) {
                                        var12_12 = 1;
                                    }
                                    if (var16_16 != var15_15) {
                                        ++var16_16;
                                        continue;
                                    }
                                    break block46;
                                    break;
                                }
                            }
                            break block46;
                        }
                        var12_12 = LT0.a(var6_6, var18_18);
                        if (var12_12 != 0) {
                            var13_13 /* !! */  = new c(0, var15_15 -= var17_17, var17_17);
                            var15_15 = var13_13 /* !! */ .b;
                            if (var15_15 >= 0) {
                                var12_12 = 0;
                                var13_13 /* !! */  = null;
                                while (true) {
                                    if (var12_12 != 0 && (var18_18 = (int)AU0.d((FocusTargetNode)(var14_14 /* !! */  = var9_9 /* !! */ [var15_15]))) != 0 && (var16_16 = (int)u92_0.a((FocusTargetNode)var14_14 /* !! */ , var7_7)) != 0) {
                                        return (boolean)var17_17;
                                    }
                                    var14_14 /* !! */  = var9_9 /* !! */ [var15_15];
                                    var16_16 = (int)Intrinsics.areEqual(var14_14 /* !! */ , var5_5);
                                    if (var16_16 != 0) {
                                        var12_12 = 1;
                                    }
                                    if (var15_15 == 0) ** break;
                                    var15_15 += -1;
                                }
                            } else {
                                ** GOTO lbl128
                            }
                        }
                        break block51;
                    }
                    if (!(var28_28 = LT0.a(var6_6, var17_17))) {
                        var5_5 = var0.r1();
                        var28_28 = var5_5.a;
                        if (var28_28) {
                            var5_5 = var4_4.a;
                            var6_6 = (int)var5_5.m;
                            if (var6_6 != 0) {
                                block47: {
                                    var5_5 = var5_5.e;
                                    var29_29 = go0.f(var0);
                                    while (var29_29 != null) {
                                        var9_9 /* !! */  = var29_29.y.e;
                                        var30_30 = var9_9 /* !! */ .d & 1024;
                                        if (var30_30 != 0) {
                                            while (var5_5 != null) {
                                                var30_30 = var5_5.c & 1024;
                                                if (var30_30 != 0) {
                                                    var9_9 /* !! */  = var5_5;
                                                    var15_15 = 0;
                                                    var11_11 = null;
                                                    while (var9_9 /* !! */  != null) {
                                                        var12_12 = var9_9 /* !! */  instanceof FocusTargetNode;
                                                        if (var12_12 != 0) {
                                                            var26_26 = var9_9 /* !! */ ;
                                                            break block47;
                                                        }
                                                        var12_12 = ((LP1$c)var9_9 /* !! */ ).c & 1024;
                                                        if (var12_12 != 0 && (var12_12 = var9_9 /* !! */  instanceof mo0_0) != 0) {
                                                            var13_13 /* !! */  = var9_9 /* !! */ ;
                                                            var13_13 /* !! */  = ((mo0_0)var9_9 /* !! */ ).o;
                                                            var16_16 = 0;
                                                            var14_14 /* !! */  = null;
                                                            while (var13_13 /* !! */  != null) {
                                                                var18_18 = var13_13 /* !! */ .c & 1024;
                                                                if (var18_18 != 0) {
                                                                    if (++var16_16 == var17_17) {
                                                                        var9_9 /* !! */  = var13_13 /* !! */ ;
                                                                    } else {
                                                                        if (var11_11 == null) {
                                                                            var27_27 = new LP1$c[var10_10];
                                                                            var11_11 = new WR1(var27_27);
                                                                        }
                                                                        if (var9_9 /* !! */  != null) {
                                                                            var11_11.b(var9_9 /* !! */ );
                                                                            var30_30 = 0;
                                                                            var9_9 /* !! */  = null;
                                                                        }
                                                                        var11_11.b(var13_13 /* !! */ );
                                                                    }
                                                                }
                                                                var13_13 /* !! */  = var13_13 /* !! */ .f;
                                                            }
                                                            if (var16_16 == var17_17) continue;
                                                        }
                                                        var9_9 /* !! */  = go0.b((WR1)var11_11);
                                                    }
                                                }
                                                var5_5 = var5_5.e;
                                            }
                                        }
                                        if ((var29_29 = var29_29.A()) != null && (var5_5 = var29_29.y) != null) {
                                            var5_5 = var5_5.d;
                                            continue;
                                        }
                                        var28_28 = false;
                                        var5_5 = null;
                                    }
                                    var25_25 = 0;
                                    var26_26 = null;
                                }
                                if (var26_26 != null) {
                                    return (Boolean)var7_7.invoke(var4_4);
                                }
                            } else {
                                var5_5 = "visitAncestors called on an unattached node".toString();
                                var4_4 = new IllegalStateException((String)var5_5);
                                throw var4_4;
                            }
                        }
                    }
                    return false;
                }
                var5_5 = "This function should only be used for 1-D focus search".toString();
                var4_4 = new IllegalStateException((String)var5_5);
                throw var4_4;
            }
            var5_5 = "visitChildren called on an unattached node".toString();
            var4_4 = new IllegalStateException((String)var5_5);
            throw var4_4;
        }
        var5_5 = "This function should only be used within a parent that has focus.".toString();
        var4_4 = new IllegalStateException((String)var5_5);
        throw var4_4;
    }
}

