/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class EU0$a
extends Lambda
implements Function0 {
    public final /* synthetic */ EU0 c;

    public EU0$a(EU0 eU0) {
        this.c = eU0;
        super(0);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke() {
        block25: {
            block23: {
                var1_1 = this.c;
                var2_2 = var1_1.a;
                var3_3 = 0;
                var4_4 = null;
                while (true) {
                    block24: {
                        var5_5 = 1;
                        var6_6 = ru0_1.c;
                        var7_7 = 7;
                        var8_8 = 16;
                        var9_9 = 0;
                        if (var2_2 == null) break;
                        var10_10 = var2_2 instanceof FocusTargetNode;
                        if (var10_10 == 0) break block24;
                        var2_2 = (FocusTargetNode)var2_2;
                        var1_1 = var2_2.r1();
                        var11_14 = var1_1.a;
                        if (var11_14 != 0) {
                            var11_14 = yu0_1.g((FocusTargetNode)var2_2);
lbl19:
                            // 4 sources

                            while (true) {
                                var9_9 = var11_14;
                                break block23;
                                break;
                            }
                        }
                        var11_14 = Ts3.e((FocusTargetNode)var2_2, var7_7, (Function1)var6_6);
                        ** GOTO lbl19
                    }
                    var12_11 = var2_2.c & 1024;
                    if (var12_11 != 0 && (var12_11 = var2_2 instanceof mo0_0) != 0) {
                        var6_6 = var2_2;
                        var6_6 = ((mo0_0)var2_2).o;
                        while (var6_6 != null) {
                            var7_7 = var6_6.c & 1024;
                            if (var7_7 != 0) {
                                if (++var9_9 == var5_5) {
                                    var2_2 = var6_6;
                                } else {
                                    if (var4_4 == null) {
                                        var13_12 = new LP1$c[var8_8];
                                        var4_4 = new WR1(var13_12);
                                    }
                                    if (var2_2 != null) {
                                        var4_4.b(var2_2);
                                        var14_13 = false;
                                        var2_2 = null;
                                    }
                                    var4_4.b(var6_6);
                                }
                            }
                            var6_6 = var6_6.f;
                        }
                        if (var9_9 == var5_5) continue;
                    }
                    var2_2 = go0.b((WR1)var4_4);
                }
                var1_1 = var1_1.a;
                var14_13 = var1_1.m;
                if (!var14_13) break block25;
                var4_4 = new LP1$c[var8_8];
                var2_2 = new WR1((Object[])var4_4);
                var4_4 = var1_1.f;
                if (var4_4 == null) {
                    go0.a((WR1)var2_2, (LP1$c)var1_1);
                } else {
                    var2_2.b(var4_4);
                }
                block3: while ((var11_14 = var2_2.l()) != 0) {
                    var11_14 = var2_2.c - var5_5;
                    var1_1 = (LP1$c)var2_2.n(var11_14);
                    var3_3 = var1_1.d & 1024;
                    if (var3_3 == 0) {
                        go0.a((WR1)var2_2, (LP1$c)var1_1);
                        continue;
                    }
                    while (var1_1 != null) {
                        block26: {
                            var3_3 = var1_1.c & 1024;
                            if (var3_3 == 0) break block26;
                            var3_3 = 0;
                            var4_4 = null;
                            while (var1_1 != null) {
                                block27: {
                                    block28: {
                                        var10_10 = var1_1 instanceof FocusTargetNode;
                                        if (var10_10 == 0) break block27;
                                        var1_1 = (FocusTargetNode)var1_1;
                                        var2_2 = var1_1.r1();
                                        var14_13 = var2_2.a;
                                        if (!var14_13) break block28;
                                        var11_14 = (int)yu0_1.g((FocusTargetNode)var1_1);
                                        ** GOTO lbl19
                                    }
                                    var11_14 = (int)Ts3.e((FocusTargetNode)var1_1, var7_7, (Function1)var6_6);
                                    ** continue;
                                }
                                var10_10 = ((LP1$c)var1_1).c & 1024;
                                if (var10_10 != 0 && (var10_10 = var1_1 instanceof mo0_0) != 0) {
                                    var15_15 = var1_1;
                                    var15_15 = ((mo0_0)var1_1).o;
                                    var16_16 = 0;
                                    while (var15_15 != null) {
                                        var17_17 = var15_15.c & 1024;
                                        if (var17_17 != 0) {
                                            if (++var16_16 == var5_5) {
                                                var1_1 = var15_15;
                                            } else {
                                                if (var4_4 == null) {
                                                    var18_18 = new LP1$c[var8_8];
                                                    var4_4 = new WR1(var18_18);
                                                }
                                                if (var1_1 != null) {
                                                    var4_4.b(var1_1);
                                                    var11_14 = 0;
                                                    var1_1 = null;
                                                }
                                                var4_4.b(var15_15);
                                            }
                                        }
                                        var15_15 = var15_15.f;
                                    }
                                    if (var16_16 == var5_5) continue;
                                }
                                var1_1 = go0.b((WR1)var4_4);
                            }
                            continue block3;
                        }
                        var1_1 = var1_1.f;
                    }
                }
            }
            return (boolean)var9_9;
        }
        var2_2 = "visitChildren called on an unattached node".toString();
        var1_1 = new IllegalStateException((String)var2_2);
        throw var1_1;
    }
}

