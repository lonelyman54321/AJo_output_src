/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yU0
 */
public final class yu0_1 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(FocusTargetNode object, boolean bl2, boolean bl3) {
        Object object2 = ((FocusTargetNode)object).s1();
        int[] nArray = yU0$a.$EnumSwitchMapping$1;
        int n3 = ((Enum)object2).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    int n8 = 4;
                    if (n3 == n8) {
                        return true;
                    }
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object2 = AU0.c((FocusTargetNode)object);
                bl2 = object2 != null ? yu0_1.a((FocusTargetNode)object2, bl2, bl3) : true;
                if (!bl2) return false;
                uu0_1 uu0_12 = uu0_1.Inactive;
                ((FocusTargetNode)object).w1(uu0_12);
                if (!bl3) return true;
                OT0.b((FocusTargetNode)object);
                return true;
            }
        } else {
            uu0_1 uu0_13 = uu0_1.Inactive;
            ((FocusTargetNode)object).w1(uu0_13);
            if (!bl3) return true;
            OT0.b((FocusTargetNode)object);
            return true;
        }
        if (!bl2) return bl2;
        object2 = uu0_1.Inactive;
        ((FocusTargetNode)object).w1((uu0_1)object2);
        if (!bl3) return bl2;
        OT0.b((FocusTargetNode)object);
        return bl2;
    }

    public static final void b(FocusTargetNode focusTargetNode) {
        Object object = new zu0_2(focusTargetNode);
        H62.a(focusTargetNode, (Function0)object);
        object = focusTargetNode.s1();
        int[] nArray = yU0$a.$EnumSwitchMapping$1;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 3;
        if (n3 == n4 || n3 == (n4 = 4)) {
            object = uu0_1.Active;
            focusTargetNode.w1((uu0_1)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Ef0 c(FocusTargetNode object, int n3) {
        Object object2;
        block9: {
            Throwable throwable2;
            block11: {
                Object object3;
                Object object4;
                block10: {
                    Object object5 = ((FocusTargetNode)object).s1();
                    object4 = yU0$a.$EnumSwitchMapping$1;
                    int n4 = ((Enum)object5).ordinal();
                    int n7 = 1;
                    if ((n4 = object4[n4]) == n7) return Ef0.None;
                    int n8 = 2;
                    if (n4 == n8) {
                        return Ef0.Cancelled;
                    }
                    n8 = 3;
                    if (n4 != n8) {
                        int n10 = 4;
                        if (n4 == n10) return Ef0.None;
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object5 = AU0.c((FocusTargetNode)object);
                    if (object5 == null) {
                        String string2 = "ActiveParent with no focused child".toString();
                        object = new IllegalArgumentException(string2);
                        throw object;
                    }
                    if ((object5 = yu0_1.c((FocusTargetNode)object5, n3)) == (object2 = Ef0.None)) {
                        n4 = 0;
                        object5 = null;
                    }
                    if (object5 != null) return object5;
                    n4 = (int)(((FocusTargetNode)object).n ? 1 : 0);
                    if (n4 != 0) return object2;
                    ((FocusTargetNode)object).n = n7;
                    n4 = 0;
                    object5 = null;
                    try {
                        object4 = ((FocusTargetNode)object).r1();
                        object4 = ((ju0_0)object4).k;
                        LT0 lT0 = new LT0(n3);
                        object3 = object4.invoke(lT0);
                        object3 = (ou0_0)object3;
                        object4 = ou0_0.b;
                        if (object3 == object4) break block9;
                        object4 = ou0_0.c;
                        if (object3 != object4) break block10;
                        object2 = Ef0.Cancelled;
                        break block9;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                }
                object4 = nu0_1.c;
                n3 = (int)(((ou0_0)object3).a((Function1)object4) ? 1 : 0);
                object3 = n3 != 0 ? Ef0.Redirected : Ef0.RedirectCancelled;
                object2 = object3;
                break block9;
            }
            ((FocusTargetNode)object).n = false;
            throw throwable2;
        }
        ((FocusTargetNode)object).n = false;
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Ef0 d(FocusTargetNode focusTargetNode, int n3) {
        Throwable throwable2;
        block7: {
            block5: {
                Object object;
                Object object2;
                block6: {
                    boolean bl2 = focusTargetNode.o;
                    if (bl2) return Ef0.None;
                    focusTargetNode.o = true;
                    bl2 = false;
                    try {
                        object2 = focusTargetNode.r1();
                        object2 = ((ju0_0)object2).j;
                        LT0 lT0 = new LT0(n3);
                        object = object2.invoke(lT0);
                        object = (ou0_0)object;
                        object2 = ou0_0.b;
                        if (object == object2) break block5;
                        object2 = ou0_0.c;
                        if (object != object2) break block6;
                        object = Ef0.Cancelled;
                        focusTargetNode.o = false;
                        return object;
                    }
                    catch (Throwable throwable2) {}
                }
                object2 = nu0_1.c;
                n3 = (int)(((ou0_0)object).a((Function1)object2) ? 1 : 0);
                object = n3 != 0 ? Ef0.Redirected : Ef0.RedirectCancelled;
                break block7;
                focusTargetNode.o = false;
                return object;
            }
            focusTargetNode.o = false;
            return Ef0.None;
        }
        focusTargetNode.o = false;
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Ef0 e(FocusTargetNode var0, int var1_1) {
        block21: {
            block22: {
                block23: {
                    block24: {
                        block27: {
                            block25: {
                                block26: {
                                    block20: {
                                        var2_2 /* !! */  = var0.s1();
                                        var3_3 = yU0$a.$EnumSwitchMapping$1;
                                        var4_4 = var2_2 /* !! */ .ordinal();
                                        var5_5 = 1;
                                        if ((var4_4 = var3_3[var4_4]) == var5_5 || var4_4 == (var6_6 = 2)) break block21;
                                        var7_7 = 3;
                                        if (var4_4 == var7_7) break block22;
                                        var8_8 = 4;
                                        if (var4_4 != var8_8) break block23;
                                        var2_2 /* !! */  = var0.a;
                                        var9_9 = var2_2 /* !! */ .m;
                                        if (!var9_9) break block24;
                                        var2_2 /* !! */  = var2_2 /* !! */ .e;
                                        var0 = go0.f((fo0)var0);
                                        while (true) {
                                            var9_9 = false;
                                            var10_10 /* !! */  = null;
                                            if (var0 == null) break;
                                            var11_11 = var0.y.e;
                                            var12_12 = var11_11.d & 1024;
                                            if (var12_12 != 0) {
                                                while (var2_2 /* !! */  != null) {
                                                    var12_12 = var2_2 /* !! */ .c & 1024;
                                                    if (var12_12 != 0) {
                                                        var11_11 = var2_2 /* !! */ ;
                                                        var13_13 = null;
                                                        while (var11_11 != null) {
                                                            var14_14 = var11_11 instanceof FocusTargetNode;
                                                            if (var14_14 == 0) {
                                                                var14_14 = ((LP1$c)var11_11).c & 1024;
                                                                if (var14_14 != 0 && (var14_14 = var11_11 instanceof mo0_0) != 0) {
                                                                    var15_15 = var11_11;
                                                                    var15_15 = ((mo0_0)var11_11).o;
                                                                    var16_16 = 0;
                                                                    while (var15_15 != null) {
                                                                        var17_17 = var15_15.c & 1024;
                                                                        if (var17_17 != 0) {
                                                                            if (++var16_16 == var5_5) {
                                                                                var11_11 = var15_15;
                                                                            } else {
                                                                                if (var13_13 == null) {
                                                                                    var17_17 = 16;
                                                                                    var18_18 = new LP1$c[var17_17];
                                                                                    var13_13 = new WR1(var18_18);
                                                                                }
                                                                                if (var11_11 != null) {
                                                                                    var13_13.b(var11_11);
                                                                                    var12_12 = 0;
                                                                                    var11_11 = null;
                                                                                }
                                                                                var13_13.b(var15_15);
                                                                            }
                                                                        }
                                                                        var15_15 = var15_15.f;
                                                                    }
                                                                    if (var16_16 == var5_5) continue;
                                                                }
                                                                var11_11 = go0.b(var13_13);
                                                                continue;
                                                            }
                                                            break block20;
                                                        }
                                                    }
                                                    var2_2 /* !! */  = var2_2 /* !! */ .e;
                                                }
                                            }
                                            if ((var0 = var0.A()) != null && (var2_2 /* !! */  = var0.y) != null) {
                                                var2_2 /* !! */  = var2_2 /* !! */ .d;
                                                continue;
                                            }
                                            var4_4 = 0;
                                            var2_2 /* !! */  = null;
                                        }
                                        var12_12 = 0;
                                        var11_11 = null;
                                    }
                                    if ((var11_11 = (FocusTargetNode)var11_11) == null) {
                                        return Ef0.None;
                                    }
                                    var0 = var11_11.s1();
                                    var2_2 /* !! */  = yU0$a.$EnumSwitchMapping$1;
                                    var19_19 /* !! */  = var0.ordinal();
                                    if ((var19_19 /* !! */  = (int)var2_2 /* !! */ [var19_19 /* !! */ ]) == var5_5) break block25;
                                    if (var19_19 /* !! */  == var6_6) break block26;
                                    if (var19_19 /* !! */  == var7_7) ** GOTO lbl84
                                    if (var19_19 /* !! */  == var8_8) {
                                        var0 = yu0_1.e((FocusTargetNode)var11_11, var1_1);
                                        if (var0 != (var2_2 /* !! */  = Ef0.None)) {
                                            var10_10 /* !! */  = var0;
                                        }
                                        if (var10_10 /* !! */  == null) {
                                            var10_10 /* !! */  = yu0_1.d((FocusTargetNode)var11_11, var1_1);
                                        }
                                    } else {
                                        var0 = new NoWhenBranchMatchedException();
                                        throw var0;
lbl84:
                                        // 1 sources

                                        var10_10 /* !! */  = yu0_1.e((FocusTargetNode)var11_11, var1_1);
                                    }
                                    break block27;
                                }
                                var10_10 /* !! */  = Ef0.Cancelled;
                                break block27;
                            }
                            var10_10 /* !! */  = yu0_1.d((FocusTargetNode)var11_11, var1_1);
                        }
                        return var10_10 /* !! */ ;
                    }
                    var20_20 = "visitAncestors called on an unattached node".toString();
                    var0 = new IllegalStateException(var20_20);
                    throw var0;
                }
                var0 = new NoWhenBranchMatchedException();
                throw var0;
            }
            if ((var0 = AU0.c((FocusTargetNode)var0)) != null) {
                return yu0_1.c((FocusTargetNode)var0, var1_1);
            }
            var20_21 = "ActiveParent with no focused child".toString();
            var0 = new IllegalArgumentException(var20_21);
            throw var0;
        }
        return Ef0.None;
    }

    /*
     * Unable to fully structure code
     */
    public static final boolean f(FocusTargetNode var0) {
        block21: {
            var1_1 = var0.s1();
            var2_2 = yU0$a.$EnumSwitchMapping$1;
            var3_3 = var1_1.ordinal();
            var4_4 = 1;
            if ((var3_3 = var2_2[var3_3]) == var4_4 || var3_3 == (var5_5 = 2)) break block21;
            var5_5 = 0;
            var6_6 = null;
            var7_7 = 3;
            if (var3_3 == var7_7) ** GOTO lbl86
            var7_7 = 4;
            if (var3_3 != var7_7) ** GOTO lbl84
            var1_1 = var0.a;
            var7_7 = (int)var1_1.m;
            if (var7_7 == 0) ** GOTO lbl81
            var1_1 = var1_1.e;
            var8_8 = go0.f((fo0)var0);
            block0: while (true) {
                var9_9 = null;
                if (var8_8 == null) break;
                var10_10 = var8_8.y.e;
                var11_11 = var10_10.d & 1024;
                if (var11_11 != 0) {
                    while (var1_1 != null) {
                        var11_11 = var1_1.c & 1024;
                        if (var11_11 != 0) {
                            var10_10 = var1_1;
                            var12_12 = null;
                            while (var10_10 != null) {
                                var13_13 = var10_10 instanceof FocusTargetNode;
                                if (var13_13 != 0) {
                                    var9_9 = var10_10;
                                    break block0;
                                }
                                var13_13 = ((LP1$c)var10_10).c & 1024;
                                if (var13_13 != 0 && (var13_13 = var10_10 instanceof mo0_0) != 0) {
                                    var14_14 = var10_10;
                                    var14_14 = ((mo0_0)var10_10).o;
                                    var15_15 = 0;
                                    while (var14_14 != null) {
                                        var16_16 = var14_14.c & 1024;
                                        if (var16_16 != 0) {
                                            if (++var15_15 == var4_4) {
                                                var10_10 = var14_14;
                                            } else {
                                                if (var12_12 == null) {
                                                    var16_16 = 16;
                                                    var17_17 = new LP1$c[var16_16];
                                                    var12_12 = new WR1(var17_17);
                                                }
                                                if (var10_10 != null) {
                                                    var12_12.b(var10_10);
                                                    var11_11 = 0;
                                                    var10_10 = null;
                                                }
                                                var12_12.b(var14_14);
                                            }
                                        }
                                        var14_14 = var14_14.f;
                                    }
                                    if (var15_15 == var4_4) continue;
                                }
                                var10_10 = go0.b(var12_12);
                            }
                        }
                        var1_1 = var1_1.e;
                    }
                }
                if ((var8_8 = var8_8.A()) != null && (var1_1 = var8_8.y) != null) {
                    var1_1 = var1_1.d;
                    continue;
                }
                var3_3 = 0;
                var1_1 = null;
            }
            if ((var9_9 = (FocusTargetNode)var9_9) != null) {
                var1_1 = var9_9.s1();
                var4_4 = yu0_1.i((FocusTargetNode)var9_9, (FocusTargetNode)var0);
                if (var4_4 != 0 && var1_1 != (var6_6 = var9_9.s1())) {
                    OT0.b((FocusTargetNode)var9_9);
                }
            } else {
                var1_1 = go0.g((fo0)var0).getFocusOwner();
                var3_3 = var1_1.f();
                if (var3_3 != 0) {
                    yu0_1.b((FocusTargetNode)var0);
                } else {
                    while (true) {
                        var4_4 = 0;
                        var2_2 = null;
                        break block21;
                        break;
                    }
lbl81:
                    // 1 sources

                    var1_1 = "visitAncestors called on an unattached node".toString();
                    var0 = new IllegalStateException((String)var1_1);
                    throw var0;
lbl84:
                    // 1 sources

                    var0 = new NoWhenBranchMatchedException();
                    throw var0;
lbl86:
                    // 1 sources

                    if ((var3_3 = (var1_1 = AU0.c((FocusTargetNode)var0)) != null ? yu0_1.a((FocusTargetNode)var1_1, false, (boolean)var4_4) : 1) == 0) ** continue;
                    yu0_1.b((FocusTargetNode)var0);
                }
            }
        }
        if (var4_4 != 0) {
            OT0.b((FocusTargetNode)var0);
        }
        return (boolean)var4_4;
    }

    public static final boolean g(FocusTargetNode object) {
        boolean bl2;
        int n3 = 7;
        if ((object = yu0_1.h((FocusTargetNode)object, n3)) != null) {
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Boolean h(FocusTargetNode object, int object2) {
        Throwable throwable2;
        xu0_0 xu0_02;
        block8: {
            Object object3;
            Object object4;
            block7: {
                xu0_02 = go0.g((fo0)object).getFocusOwner().c();
                object4 = new yu0$b_0((FocusTargetNode)object);
                try {
                    object3 = xu0_02.c;
                    if (object3 == 0) break block7;
                    xu0_0.a(xu0_02);
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            xu0_02.c = object3 = 1;
            WR1 wR1 = xu0_02.b;
            wR1.b(object4);
            Ef0 ef0 = yu0_1.e((FocusTargetNode)object, object2);
            object4 = yU0$a.$EnumSwitchMapping$0;
            object2 = ef0.ordinal();
            object2 = object4[object2];
            if (object2 != object3) {
                Object object5 = 2;
                if (object2 != object5) {
                    object5 = 3;
                    if (object2 != object5 && object2 != (object5 = 4)) {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    object5 = 0;
                    object = null;
                } else {
                    object = Boolean.TRUE;
                }
            } else {
                boolean bl2 = yu0_1.f((FocusTargetNode)object);
                object = bl2;
            }
            xu0_0.b(xu0_02);
            return object;
        }
        xu0_0.b(xu0_02);
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean i(FocusTargetNode var0, FocusTargetNode var1_1) {
        block33: {
            block34: {
                block32: {
                    block35: {
                        block40: {
                            block36: {
                                block37: {
                                    block38: {
                                        block39: {
                                            block31: {
                                                var2_2 = var1_1.a;
                                                var3_3 = var2_2.m;
                                                var4_4 = "visitAncestors called on an unattached node";
                                                if (!var3_3) break block33;
                                                var2_2 = var2_2.e;
                                                var5_5 = go0.f((fo0)var1_1);
                                                while (true) {
                                                    var6_6 = false;
                                                    var7_7 = 1;
                                                    var8_8 = 16;
                                                    var9_9 = null;
                                                    if (var5_5 == null) break;
                                                    var10_10 = var5_5.y.e;
                                                    var11_11 = var10_10.d & 1024;
                                                    if (var11_11 != 0) {
                                                        while (var2_2 != null) {
                                                            var11_11 = var2_2.c & 1024;
                                                            if (var11_11 != 0) {
                                                                var10_10 = var2_2;
                                                                var12_12 = 0;
                                                                var13_13 = null;
                                                                while (var10_10 != null) {
                                                                    var14_14 = var10_10 instanceof FocusTargetNode;
                                                                    if (var14_14 == 0) {
                                                                        var14_14 = ((LP1$c)var10_10).c & 1024;
                                                                        if (var14_14 != 0 && (var14_14 = var10_10 instanceof mo0_0) != 0) {
                                                                            var15_15 = var10_10;
                                                                            var15_15 = ((mo0_0)var10_10).o;
                                                                            var16_16 = 0;
                                                                            var17_17 = null;
                                                                            while (var15_15 != null) {
                                                                                var18_18 = var15_15.c & 1024;
                                                                                if (var18_18 != 0) {
                                                                                    if (++var16_16 == var7_7) {
                                                                                        var10_10 = var15_15;
                                                                                    } else {
                                                                                        if (var13_13 == null) {
                                                                                            var19_19 = new LP1$c[var8_8];
                                                                                            var13_13 = new WR1(var19_19);
                                                                                        }
                                                                                        if (var10_10 != null) {
                                                                                            var13_13.b(var10_10);
                                                                                            var11_11 = 0;
                                                                                            var10_10 = null;
                                                                                        }
                                                                                        var13_13.b(var15_15);
                                                                                    }
                                                                                }
                                                                                var15_15 = var15_15.f;
                                                                            }
                                                                            if (var16_16 == var7_7) continue;
                                                                        }
                                                                        var10_10 = go0.b(var13_13);
                                                                        continue;
                                                                    }
                                                                    break block31;
                                                                }
                                                            }
                                                            var2_2 = var2_2.e;
                                                        }
                                                    }
                                                    if ((var5_5 = var5_5.A()) != null && (var2_2 = var5_5.y) != null) {
                                                        var2_2 = var2_2.d;
                                                        continue;
                                                    }
                                                    var20_20 = 0;
                                                    var2_2 = null;
                                                }
                                                var11_11 = 0;
                                                var10_10 = null;
                                            }
                                            if (!(var20_20 = Intrinsics.areEqual(var10_10, var0))) break block34;
                                            var2_2 = var0.s1();
                                            var5_5 = yU0$a.$EnumSwitchMapping$1;
                                            var20_20 = var2_2.ordinal();
                                            if ((var20_20 = (boolean)var5_5[var20_20]) == var7_7) break block35;
                                            var3_3 = 2 != 0;
                                            if (var20_20 == var3_3) break block32;
                                            var3_3 = 3 != 0;
                                            if (var20_20 == var3_3) break block36;
                                            var3_3 = 4 != 0;
                                            if (var20_20 != var3_3) break block37;
                                            var2_2 = var0.a;
                                            var3_3 = var2_2.m;
                                            if (!var3_3) break block38;
                                            var2_2 = var2_2.e;
                                            var5_5 = go0.f((fo0)var0);
                                            block4: while (var5_5 != null) {
                                                var4_4 = var5_5.y.e;
                                                var21_21 = var4_4.d & 1024;
                                                if (var21_21 != 0) {
                                                    while (var2_2 != null) {
                                                        var21_21 = var2_2.c & 1024;
                                                        if (var21_21 != 0) {
                                                            var4_4 = var2_2;
                                                            var11_11 = 0;
                                                            var10_10 = null;
                                                            while (var4_4 != null) {
                                                                var12_12 = var4_4 instanceof FocusTargetNode;
                                                                if (var12_12 != 0) {
                                                                    var9_9 = var4_4;
                                                                    break block4;
                                                                }
                                                                var12_12 = ((LP1$c)var4_4).c & 1024;
                                                                if (var12_12 != 0 && (var12_12 = var4_4 instanceof mo0_0) != 0) {
                                                                    var13_13 = var4_4;
                                                                    var13_13 = ((mo0_0)var4_4).o;
                                                                    var14_14 = 0;
                                                                    var15_15 = null;
                                                                    while (var13_13 != null) {
                                                                        var16_16 = var13_13.c & 1024;
                                                                        if (var16_16 != 0) {
                                                                            if (++var14_14 == var7_7) {
                                                                                var4_4 = var13_13;
                                                                            } else {
                                                                                if (var10_10 == null) {
                                                                                    var17_17 = new LP1$c[var8_8];
                                                                                    var10_10 = new WR1(var17_17);
                                                                                }
                                                                                if (var4_4 != null) {
                                                                                    var10_10.b(var4_4);
                                                                                    var21_21 = 0;
                                                                                    var4_4 = null;
                                                                                }
                                                                                var10_10.b(var13_13);
                                                                            }
                                                                        }
                                                                        var13_13 = var13_13.f;
                                                                    }
                                                                    if (var14_14 == var7_7) continue;
                                                                }
                                                                var4_4 = go0.b((WR1)var10_10);
                                                            }
                                                        }
                                                        var2_2 = var2_2.e;
                                                    }
                                                }
                                                if ((var5_5 = var5_5.A()) != null && (var2_2 = var5_5.y) != null) {
                                                    var2_2 = var2_2.d;
                                                    continue;
                                                }
                                                var20_20 = false;
                                                var2_2 = null;
                                            }
                                            if ((var9_9 = (FocusTargetNode)var9_9) == null && (var20_20 = (var2_2 = go0.g((fo0)var0).getFocusOwner()).f())) {
                                                yu0_1.b((FocusTargetNode)var1_1);
                                                var1_1 = uu0_1.ActiveParent;
                                                var0.w1((uu0_1)var1_1);
lbl130:
                                                // 3 sources

                                                while (true) {
                                                    var6_6 = true;
                                                    break block32;
                                                    break;
                                                }
                                            }
                                            if (var9_9 == null || !(var20_20 = yu0_1.i((FocusTargetNode)var9_9, (FocusTargetNode)var0))) break block32;
                                            var6_6 = yu0_1.i((FocusTargetNode)var0, (FocusTargetNode)var1_1);
                                            if ((var0 = var0.s1()) != (var1_1 = uu0_1.ActiveParent)) break block39;
                                            if (var6_6) {
                                                OT0.b((FocusTargetNode)var9_9);
                                            }
                                            break block32;
                                        }
                                        var1_1 = "Deactivated node is focused".toString();
                                        var0 = new IllegalStateException((String)var1_1);
                                        throw var0;
                                    }
                                    var1_1 = var4_4.toString();
                                    var0 = new IllegalStateException((String)var1_1);
                                    throw var0;
                                }
                                var0 = new NoWhenBranchMatchedException();
                                throw var0;
                            }
                            var2_2 = AU0.c((FocusTargetNode)var0);
                            if (var2_2 == null) break block40;
                            var22_22 = (var0 = AU0.c((FocusTargetNode)var0)) != null ? yu0_1.a((FocusTargetNode)var0, false, (boolean)var7_7) : true;
                            if (!var22_22) break block32;
                            yu0_1.b((FocusTargetNode)var1_1);
                            ** GOTO lbl130
                        }
                        var1_1 = "ActiveParent with no focused child".toString();
                        var0 = new IllegalArgumentException((String)var1_1);
                        throw var0;
                    }
                    yu0_1.b((FocusTargetNode)var1_1);
                    var1_1 = uu0_1.ActiveParent;
                    var0.w1((uu0_1)var1_1);
                    ** while (true)
                }
                return var6_6;
            }
            var1_1 = "Non child node cannot request focus.".toString();
            var0 = new IllegalStateException((String)var1_1);
            throw var0;
        }
        var1_1 = var4_4.toString();
        var0 = new IllegalStateException((String)var1_1);
        throw var0;
    }
}

