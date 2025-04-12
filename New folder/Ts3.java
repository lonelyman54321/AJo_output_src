/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b$b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Ts3 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(aG2 aG22, aG2 aG23, aG2 aG24, int n3) {
        String string2;
        Object object;
        Object object2;
        block6: {
            block11: {
                block16: {
                    int n4;
                    float f5;
                    float f6;
                    float f7;
                    block13: {
                        float f8;
                        float f11;
                        int n7;
                        int n8;
                        block15: {
                            float f12;
                            float f14;
                            int n10;
                            block14: {
                                float f15;
                                int n14;
                                block12: {
                                    float f16;
                                    int n15;
                                    int n16;
                                    block8: {
                                        block10: {
                                            block9: {
                                                block7: {
                                                    block3: {
                                                        block5: {
                                                            block4: {
                                                                block2: {
                                                                    object2 = aG22;
                                                                    object = aG23;
                                                                    n8 = n3;
                                                                    n16 = Ts3.b(n3, aG24, aG22);
                                                                    if (n16 != 0) return false;
                                                                    n16 = Ts3.b(n3, aG23, aG22);
                                                                    if (n16 == 0) return false;
                                                                    n16 = 3;
                                                                    n15 = LT0.a(n3, n16);
                                                                    string2 = "This function should only be used for 2-D focus search";
                                                                    n7 = 6;
                                                                    n10 = 5;
                                                                    n14 = 4;
                                                                    f14 = aG24.b;
                                                                    f11 = aG24.d;
                                                                    f16 = aG24.a;
                                                                    f7 = aG24.c;
                                                                    f8 = aG22.d;
                                                                    f12 = aG22.b;
                                                                    f15 = aG22.c;
                                                                    f6 = aG22.a;
                                                                    if (n15 == 0) break block2;
                                                                    n15 = f6 == f7 ? 0 : (f6 > f7 ? 1 : -1);
                                                                    if (n15 < 0) return true;
                                                                    break block3;
                                                                }
                                                                n15 = LT0.a(n3, n14);
                                                                if (n15 == 0) break block4;
                                                                n15 = f15 == f16 ? 0 : (f15 < f16 ? -1 : 1);
                                                                if (n15 > 0) return true;
                                                                break block3;
                                                            }
                                                            n15 = LT0.a(n3, n10) ? 1 : 0;
                                                            if (n15 == 0) break block5;
                                                            n15 = f12 == f11 ? 0 : (f12 > f11 ? 1 : -1);
                                                            if (n15 < 0) return true;
                                                            break block3;
                                                        }
                                                        n15 = LT0.a(n3, n7) ? 1 : 0;
                                                        if (n15 == 0) break block6;
                                                        n15 = f8 == f14 ? 0 : (f8 < f14 ? -1 : 1);
                                                        if (n15 > 0) return true;
                                                    }
                                                    n15 = LT0.a(n8, n16) ? 1 : 0;
                                                    if (n15 != 0) return true;
                                                    n15 = LT0.a(n8, n14) ? 1 : 0;
                                                    if (n15 != 0) return true;
                                                    n15 = LT0.a(n8, n16) ? 1 : 0;
                                                    if (n15 == 0) break block7;
                                                    f5 = ((aG2)object).c;
                                                    f5 = f6 - f5;
                                                    break block8;
                                                }
                                                n15 = LT0.a(n8, n14) ? 1 : 0;
                                                if (n15 == 0) break block9;
                                                f5 = ((aG2)object).a - f15;
                                                break block8;
                                            }
                                            n15 = LT0.a(n8, n10) ? 1 : 0;
                                            if (n15 == 0) break block10;
                                            f5 = ((aG2)object).d;
                                            f5 = f12 - f5;
                                            break block8;
                                        }
                                        n15 = LT0.a(n8, n7) ? 1 : 0;
                                        if (n15 == 0) break block11;
                                        f5 = ((aG2)object).b - f8;
                                    }
                                    n15 = 0;
                                    f5 = Math.max(0.0f, f5);
                                    n16 = LT0.a(n8, n16) ? 1 : 0;
                                    if (n16 == 0) break block12;
                                    f6 -= f16;
                                    break block13;
                                }
                                n4 = LT0.a(n8, n14);
                                if (n4 == 0) break block14;
                                f6 = f7 - f15;
                                break block13;
                            }
                            n4 = LT0.a(n8, n10);
                            if (n4 == 0) break block15;
                            f6 = f12 - f14;
                            break block13;
                        }
                        n4 = LT0.a(n8, n7);
                        if (n4 == 0) break block16;
                        f6 = f11 - f8;
                    }
                    f7 = 1.0f;
                    f6 = Math.max(f7, f6);
                    n4 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
                    if (n4 >= 0) return false;
                    return true;
                }
                object = string2.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            object = string2.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object = string2.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(int n3, aG2 object, aG2 aG22) {
        float f5;
        float f6 = 4.2E-45f;
        int n4 = LT0.a(n3, 3);
        boolean bl2 = true;
        if (n4 != 0) {
            n4 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            f6 = 5.6E-45f;
            n4 = LT0.a(n3, 4);
        }
        if (n4 != 0) {
            f6 = ((aG2)object).d;
            float f7 = aG22.b;
            float f8 = f6 - f7;
            n3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (n3 <= 0) return false;
            f7 = ((aG2)object).b;
            float f11 = aG22.d;
            float f12 = f7 - f11;
            n3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
            if (n3 >= 0) return false;
            return bl2;
        }
        f6 = 7.0E-45f;
        n4 = LT0.a(n3, 5);
        if (n4 != 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n4 = 6;
            f6 = 8.4E-45f;
            n3 = LT0.a(n3, n4) ? 1 : 0;
        }
        if (n3 != 0) {
            f6 = ((aG2)object).c;
            f5 = aG22.a;
            float f14 = f6 - f5;
            n3 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
            if (n3 <= 0) return false;
            f5 = ((aG2)object).a;
            float f15 = aG22.c;
            float f16 = f5 - f15;
            n3 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            if (n3 >= 0) return false;
            return bl2;
        }
        object = "This function should only be used for 2-D focus search".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static final void c(fo0 object, WR1 object2) {
        Object object3 = object.e();
        boolean bl2 = ((LP1$c)object3).m;
        if (bl2) {
            int n3;
            int n4 = 16;
            Object object4 = new LP1$c[n4];
            object3 = new WR1((Object[])object4);
            object4 = object.e().f;
            if (object4 == null) {
                object = object.e();
                go0.a((WR1)object3, (LP1$c)object);
            } else {
                ((WR1)object3).b(object4);
            }
            block0: while ((n3 = ((WR1)object3).l()) != 0) {
                n3 = ((WR1)object3).c;
                int n7 = 1;
                object = (LP1$c)((WR1)object3).n(n3 -= n7);
                int n8 = ((LP1$c)object).d & 0x400;
                if (n8 == 0) {
                    go0.a((WR1)object3, (LP1$c)object);
                    continue;
                }
                while (object != null) {
                    n8 = ((LP1$c)object).c & 0x400;
                    if (n8 != 0) {
                        n8 = 0;
                        WR1 wR1 = null;
                        while (object != null) {
                            Object object5;
                            int n10 = object instanceof FocusTargetNode;
                            if (n10 != 0) {
                                object = (FocusTargetNode)object;
                                n10 = ((LP1$c)object).m;
                                if (n10 != 0) {
                                    object5 = go0.f((fo0)object);
                                    n10 = ((xp1_0)object5).I ? 1 : 0;
                                    if (n10 == 0) {
                                        object5 = ((FocusTargetNode)object).r1();
                                        n10 = ((ju0_0)object5).a ? 1 : 0;
                                        if (n10 != 0) {
                                            ((WR1)object2).b(object);
                                        } else {
                                            Ts3.c((fo0)object, (WR1)object2);
                                        }
                                    }
                                }
                            } else {
                                n10 = ((LP1$c)object).c & 0x400;
                                if (n10 != 0 && (n10 = object instanceof mo0_0) != 0) {
                                    object5 = object;
                                    object5 = ((mo0_0)object).o;
                                    int n14 = 0;
                                    while (object5 != null) {
                                        int n15 = ((LP1$c)object5).c & 0x400;
                                        if (n15 != 0) {
                                            if (++n14 == n7) {
                                                object = object5;
                                            } else {
                                                if (wR1 == null) {
                                                    Object[] objectArray = new LP1$c[n4];
                                                    wR1 = new WR1(objectArray);
                                                }
                                                if (object != null) {
                                                    wR1.b(object);
                                                    n3 = 0;
                                                    object = null;
                                                }
                                                wR1.b(object5);
                                            }
                                        }
                                        object5 = ((LP1$c)object5).f;
                                    }
                                    if (n14 == n7) continue;
                                }
                            }
                            object = go0.b(wR1);
                        }
                        continue block0;
                    }
                    object = ((LP1$c)object).f;
                }
            }
            return;
        }
        object2 = "visitChildren called on an unattached node".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static final FocusTargetNode d(WR1 objectArray, aG2 object, int n3) {
        block9: {
            aG2 aG22;
            float f5;
            boolean bl2;
            int n4;
            block6: {
                boolean bl3;
                float f6;
                block8: {
                    block7: {
                        block5: {
                            f6 = 4.2E-45f;
                            bl3 = LT0.a(n3, 3);
                            n4 = 0;
                            bl2 = true;
                            f5 = Float.MIN_VALUE;
                            if (!bl3) break block5;
                            f6 = ((aG2)object).d();
                            f5 = (float)bl2;
                            aG22 = ((aG2)object).h(f6 += f5, 0.0f);
                            break block6;
                        }
                        f6 = 5.6E-45f;
                        bl3 = LT0.a(n3, 4);
                        if (!bl3) break block7;
                        f6 = ((aG2)object).d();
                        f5 = (float)bl2;
                        f6 = -(f6 + f5);
                        aG22 = ((aG2)object).h(f6, 0.0f);
                        break block6;
                    }
                    f6 = 7.0E-45f;
                    bl3 = LT0.a(n3, 5);
                    if (!bl3) break block8;
                    f6 = ((aG2)object).c();
                    f5 = (float)bl2;
                    aG22 = ((aG2)object).h(0.0f, f6 += f5);
                    break block6;
                }
                f6 = 8.4E-45f;
                bl3 = LT0.a(n3, 6);
                if (!bl3) break block9;
                f6 = ((aG2)object).c();
                f5 = (float)bl2;
                f6 = -(f6 + f5);
                aG22 = ((aG2)object).h(0.0f, f6);
            }
            n4 = objectArray.c;
            bl2 = false;
            f5 = 0.0f;
            FocusTargetNode focusTargetNode = null;
            if (n4 > 0) {
                objectArray = objectArray.a;
                int n7 = 0;
                do {
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    aG2 aG23;
                    boolean bl4;
                    FocusTargetNode focusTargetNode2;
                    boolean bl5;
                    if (!(bl5 = AU0.d(focusTargetNode2 = (FocusTargetNode)objectArray[n7])) || !(bl4 = Ts3.g(n3, aG23 = AU0.b(focusTargetNode2), (aG2)object)) || (bl4 = Ts3.g(n3, aG22, (aG2)object)) && !(bl4 = Ts3.a((aG2)object, aG23, aG22, n3)) && ((bl4 = Ts3.a((aG2)object, aG22, aG23, n3)) || (l7 = (l4 = (l3 = Ts3.h(n3, (aG2)object, aG23)) - (l2 = Ts3.h(n3, (aG2)object, aG22))) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0)) continue;
                    focusTargetNode = focusTargetNode2;
                    aG22 = aG23;
                } while (++n7 < n4);
            }
            return focusTargetNode;
        }
        object = "This function should only be used for 2-D focus search".toString();
        objectArray = new IllegalStateException((String)object);
        throw objectArray;
    }

    public static final boolean e(FocusTargetNode object, int n3, Function1 function1) {
        block12: {
            boolean bl2;
            WR1 wR1;
            Object object2;
            block11: {
                float f5;
                int n4;
                int n7;
                block10: {
                    object2 = new FocusTargetNode[16];
                    wR1 = new WR1((Object[])object2);
                    Ts3.c((fo0)object, wR1);
                    n7 = wR1.c;
                    bl2 = false;
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    if (n7 <= n4) {
                        boolean bl3 = wR1.k();
                        if (bl3) {
                            bl3 = false;
                            float f6 = 0.0f;
                            object = null;
                        } else {
                            object = wR1.a[0];
                        }
                        object = (FocusTargetNode)object;
                        if (object != null) {
                            object = (Boolean)function1.invoke(object);
                            bl2 = (Boolean)object;
                        }
                        return bl2;
                    }
                    n7 = LT0.a(n3, 7) ? 1 : 0;
                    int n8 = 4;
                    if (n7 != 0) {
                        n3 = 4;
                    }
                    if ((n7 = (n7 = (int)(LT0.a(n3, n8) ? 1 : 0)) != 0 ? 1 : (int)(LT0.a(n3, 6) ? 1 : 0)) == 0) break block10;
                    object = AU0.b((FocusTargetNode)object);
                    f5 = ((aG2)object).b;
                    float f7 = ((aG2)object).a;
                    object2 = new aG2(f7, f5, f7, f5);
                    break block11;
                }
                n7 = LT0.a(n3, 3) ? 1 : 0;
                if (n7 == 0) {
                    n7 = 5;
                    n4 = LT0.a(n3, n7) ? 1 : 0;
                }
                if (n4 == 0) break block12;
                object = AU0.b((FocusTargetNode)object);
                f5 = ((aG2)object).d;
                float f8 = ((aG2)object).c;
                object2 = new aG2(f8, f5, f8, f5);
            }
            object = Ts3.d(wR1, (aG2)object2, n3);
            if (object != null) {
                object = (Boolean)function1.invoke(object);
                bl2 = (Boolean)object;
            }
            return bl2;
        }
        String string2 = "This function should only be used for 2-D focus search".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static final boolean f(int n3, aG2 aG22, b$b b2, FocusTargetNode focusTargetNode) {
        boolean bl2 = Ts3.i(n3, aG22, b2, focusTargetNode);
        if (bl2) {
            return true;
        }
        Us3 us3 = new Us3(n3, aG22, b2, focusTargetNode);
        Boolean bl3 = (Boolean)Bx.a(focusTargetNode, n3, us3);
        if (bl3 != null) {
            n3 = bl3.booleanValue() ? 1 : 0;
        } else {
            n3 = 0;
            bl3 = null;
        }
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean g(int n3, aG2 object, aG2 aG22) {
        int n4 = LT0.a(n3, 3);
        float f5 = ((aG2)object).a;
        float f6 = ((aG2)object).c;
        boolean bl2 = false;
        if (n4 != 0) {
            float f7 = aG22.c;
            float f8 = aG22.a;
            n3 = f7 == f6 ? 0 : (f7 > f6 ? 1 : -1);
            if (n3 <= 0) {
                n3 = f8 == f6 ? 0 : (f8 > f6 ? 1 : -1);
                if (n3 < 0) return bl2;
            }
            if ((n3 = (int)(f8 == f5 ? 0 : (f8 > f5 ? 1 : -1))) <= 0) return bl2;
            return true;
        }
        n4 = LT0.a(n3, 4);
        if (n4 != 0) {
            float f11 = aG22.a;
            float f12 = aG22.c;
            n3 = f11 == f5 ? 0 : (f11 < f5 ? -1 : 1);
            if (n3 >= 0) {
                n3 = f12 == f5 ? 0 : (f12 < f5 ? -1 : 1);
                if (n3 > 0) return bl2;
            }
            if ((n3 = (int)(f12 == f6 ? 0 : (f12 < f6 ? -1 : 1))) >= 0) return bl2;
            return true;
        }
        n4 = LT0.a(n3, 5);
        f5 = ((aG2)object).b;
        float f14 = ((aG2)object).d;
        if (n4 != 0) {
            float f15 = aG22.d;
            float f16 = aG22.b;
            n3 = f15 == f14 ? 0 : (f15 > f14 ? 1 : -1);
            if (n3 <= 0) {
                n3 = f16 == f14 ? 0 : (f16 > f14 ? 1 : -1);
                if (n3 < 0) return bl2;
            }
            if ((n3 = (int)(f16 == f5 ? 0 : (f16 > f5 ? 1 : -1))) <= 0) return bl2;
            return true;
        }
        n4 = 6;
        if ((n3 = (int)(LT0.a(n3, n4) ? 1 : 0)) != 0) {
            float f17 = aG22.b;
            float f18 = aG22.d;
            n3 = f17 == f5 ? 0 : (f17 < f5 ? -1 : 1);
            if (n3 >= 0) {
                n3 = f18 == f5 ? 0 : (f18 < f5 ? -1 : 1);
                if (n3 > 0) return bl2;
            }
            if ((n3 = (int)(f18 == f14 ? 0 : (f18 < f14 ? -1 : 1))) >= 0) return bl2;
            return true;
        }
        object = "This function should only be used for 2-D focus search".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    /*
     * Unable to fully structure code
     */
    public static final long h(int var0, aG2 var1_1, aG2 var2_2) {
        block12: {
            block13: {
                block10: {
                    block9: {
                        block11: {
                            var3_3 = 3;
                            var4_4 = 4.2E-45f;
                            var5_5 = LT0.a(var0, var3_3);
                            var6_6 = var2_2.b;
                            var7_7 = var2_2.a;
                            var8_8 = "This function should only be used for 2-D focus search";
                            var9_9 = 6;
                            var10_10 = 5;
                            var11_11 = 4;
                            if (var5_5) {
                                var12_12 = var1_1.a;
                                var13_13 = var2_2.c;
lbl13:
                                // 2 sources

                                while (true) {
                                    var12_12 -= var13_13;
                                    break block9;
                                    break;
                                }
                            }
                            var5_5 = LT0.a(var0, var11_11);
                            if (!var5_5) break block11;
                            var12_12 = var1_1.c;
                            var12_12 = var7_7 - var12_12;
                            break block9;
                        }
                        var5_5 = LT0.a(var0, var10_10);
                        if (var5_5) {
                            var12_12 = var1_1.b;
                            var13_13 = var2_2.d;
                            ** continue;
                        }
                        var5_5 = LT0.a(var0, var9_9);
                        if (!var5_5) break block12;
                        var12_12 = var1_1.d;
                        var12_12 = var6_6 - var12_12;
                    }
                    var13_13 = 0.0f;
                    var14_14 = (long)Math.abs(Math.max(0.0f, var12_12));
                    var3_3 = (int)LT0.a(var0, var3_3);
                    var5_5 = true;
                    var12_12 = 1.4E-45f;
                    if (var3_3 != 0) {
                        var3_3 = 1;
                        var4_4 = 1.4E-45f;
                    } else {
                        var3_3 = (int)LT0.a(var0, var11_11);
                    }
                    var11_11 = 2;
                    if (var3_3 != 0) {
                        var16_15 = var1_1.c();
                        var4_4 = var11_11;
                        var16_15 /= var4_4;
                        var17_16 = var1_1.b;
                        var16_15 += var17_16;
                        var17_16 = var2_2.c() / var4_4 + var6_6;
lbl50:
                        // 2 sources

                        while (true) {
                            break block10;
                            break;
                        }
                    }
                    var3_3 = (int)LT0.a(var0, var10_10);
                    if (var3_3 == 0) {
                        var5_5 = LT0.a(var0, var9_9);
                    }
                    if (var5_5) {
                        var16_15 = var1_1.d();
                        var4_4 = var11_11;
                        var16_15 /= var4_4;
                        var17_16 = var1_1.a;
                        var16_15 += var17_16;
                        var17_16 = var2_2.d() / var4_4 + var7_7;
                        ** continue;
                    }
                    break block13;
                }
                var18_17 = (long)Math.abs(var16_15 -= var17_16);
                var20_18 = (long)13 * var14_14 * var14_14;
                return var18_17 * var18_17 + var20_18;
            }
            var1_1 = var8_8.toString();
            var22_19 = new IllegalStateException((String)var1_1);
            throw var22_19;
        }
        var1_1 = var8_8.toString();
        var22_20 = new IllegalStateException((String)var1_1);
        throw var22_20;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final boolean i(int var0, aG2 var1_1, b$b var2_2, FocusTargetNode var3_3) {
        var5_5 = 16;
        var6_6 = new FocusTargetNode[var5_5];
        var4_4 = new WR1((Object[])var6_6);
        var3_3 = var3_3.a;
        var7_7 = var3_3.m;
        if (var7_7) {
            var8_8 /* !! */  = new LP1$c[var5_5];
            var6_6 = new WR1(var8_8 /* !! */ );
            var8_8 /* !! */  = var3_3.f;
            if (var8_8 /* !! */  == null) {
                go0.a((WR1)var6_6, var3_3);
            } else {
                var6_6.b(var8_8 /* !! */ );
            }
            block0: while (true) {
                var9_9 = var6_6.l();
                var10_10 = 1;
                if (var9_9 == 0) break;
                var9_9 = var6_6.c - var10_10;
                var3_3 = (LP1$c)var6_6.n(var9_9);
                var11_11 = var3_3.d & 1024;
                if (var11_11 == 0) {
                    go0.a((WR1)var6_6, var3_3);
                    continue;
                }
                while (true) {
                    if (var3_3 == null) continue block0;
                    var11_11 = var3_3.c & 1024;
                    if (var11_11 != 0) {
                        var11_11 = 0;
                        var12_12 = null;
                        while (true) {
                            if (var3_3 != null) ** break;
                            continue block0;
                            var13_13 = var3_3 instanceof FocusTargetNode;
                            if (var13_13 != 0) {
                                var3_3 = (FocusTargetNode)var3_3;
                                var13_13 = var3_3.m;
                                if (var13_13 != 0) {
                                    var4_4.b(var3_3);
                                }
                            } else {
                                var13_13 = var3_3.c & 1024;
                                if (var13_13 != 0 && (var13_13 = var3_3 instanceof mo0_0) != 0) {
                                    var14_14 = var3_3;
                                    var14_14 = ((mo0_0)var3_3).o;
                                    var15_15 = 0;
                                    while (var14_14 != null) {
                                        var16_16 = var14_14.c & 1024;
                                        if (var16_16 != 0) {
                                            if (++var15_15 == var10_10) {
                                                var3_3 = var14_14;
                                            } else {
                                                if (var12_12 == null) {
                                                    var17_17 = new LP1$c[var5_5];
                                                    var12_12 = new WR1(var17_17);
                                                }
                                                if (var3_3 != null) {
                                                    var12_12.b(var3_3);
                                                    var9_9 = 0;
                                                    var3_3 = null;
                                                }
                                                var12_12.b(var14_14);
                                            }
                                        }
                                        var14_14 = var14_14.f;
                                    }
                                    if (var15_15 == var10_10) continue;
                                }
                            }
                            var3_3 = go0.b(var12_12);
                        }
                    }
                    var3_3 = var3_3.f;
                }
                break;
            }
            while ((var9_9 = var4_4.l()) != 0) {
                var3_3 = Ts3.d(var4_4, (aG2)var1_1, var0);
                if (var3_3 == null) {
                    return false;
                }
                var18_18 = var3_3.r1();
                var5_5 = (int)var18_18.a;
                if (var5_5 != 0) {
                    return (Boolean)var2_2.invoke(var3_3);
                }
                var5_5 = (int)Ts3.f(var0, (aG2)var1_1, var2_2, (FocusTargetNode)var3_3);
                if (var5_5 != 0) {
                    return (boolean)var10_10;
                }
                var4_4.m(var3_3);
            }
            return false;
        }
        var1_1 = "visitChildren called on an unattached node".toString();
        var19_19 = new IllegalStateException((String)var1_1);
        throw var19_19;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Boolean j(int n3, aG2 object, b$b b$b, FocusTargetNode focusTargetNode) {
        Object object2 = focusTargetNode.s1();
        int[] nArray = Ts3$a.$EnumSwitchMapping$0;
        int n4 = ((Enum)object2).ordinal();
        n4 = nArray[n4];
        int n7 = 4;
        int n8 = 3;
        int n10 = 2;
        int n14 = 1;
        if (n4 != n14) {
            if (n4 == n10) return Ts3.e(focusTargetNode, n3, b$b);
            if (n4 == n8) return Ts3.e(focusTargetNode, n3, b$b);
            if (n4 == n7) {
                object2 = focusTargetNode.r1();
                n4 = ((ju0_0)object2).a ? 1 : 0;
                if (n4 != 0) {
                    return (Boolean)b$b.invoke(focusTargetNode);
                }
                if (object == null) {
                    n3 = Ts3.e(focusTargetNode, n3, b$b) ? 1 : 0;
                    return n3 != 0;
                }
                n3 = Ts3.i(n3, (aG2)object, b$b, focusTargetNode) ? 1 : 0;
                return n3 != 0;
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        object2 = AU0.c(focusTargetNode);
        String string2 = "ActiveParent must have a focusedChild";
        if (object2 != null) {
            uu0_1 uu0_12;
            Boolean bl2;
            uu0_1 uu0_13 = ((FocusTargetNode)object2).s1();
            int n15 = uu0_13.ordinal();
            int n16 = nArray[n15];
            if (n16 != n14) {
                if (n16 != n10 && n16 != n8) {
                    if (n16 != n7) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    object = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
                if (object != null) return Ts3.f(n3, (aG2)object, b$b, focusTargetNode);
                object = AU0.b((FocusTargetNode)object2);
                return Ts3.f(n3, (aG2)object, b$b, focusTargetNode);
            }
            Boolean bl3 = Ts3.j(n3, (aG2)object, b$b, (FocusTargetNode)object2);
            n7 = Intrinsics.areEqual(bl3, bl2 = Boolean.FALSE) ? 1 : 0;
            if (n7 == 0) {
                return bl3;
            }
            if (object != null) return Ts3.f(n3, (aG2)object, b$b, focusTargetNode);
            object = ((FocusTargetNode)object2).s1();
            if (object == (uu0_12 = uu0_1.ActiveParent)) {
                object = AU0.a((FocusTargetNode)object2);
                if (object == null) {
                    object = string2.toString();
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
            } else {
                object = "Searching for active node in inactive hierarchy".toString();
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            object = AU0.b((FocusTargetNode)object);
            return Ts3.f(n3, (aG2)object, b$b, focusTargetNode);
        }
        object = string2.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

