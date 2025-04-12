/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import androidx.work.c$a;
import androidx.work.c$a$a;
import androidx.work.c$a$b;
import androidx.work.c$a$c;
import androidx.work.impl.a;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class XI3
implements Callable {
    public final /* synthetic */ WI3$b a;
    public final /* synthetic */ WI3 b;

    public /* synthetic */ XI3(WI3$b wI3$b, WI3 wI3) {
        this.a = wI3$b;
        this.b = wI3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object call() {
        block16: {
            block8: {
                block15: {
                    block9: {
                        block7: {
                            block10: {
                                block14: {
                                    block13: {
                                        block11: {
                                            block12: {
                                                var1_1 = this.a;
                                                var2_2 = var1_1 instanceof WI3$b$b;
                                                var3_3 = this.b;
                                                var4_4 = 1;
                                                var5_5 = 0;
                                                var6_6 /* !! */  = null;
                                                if (var2_2 == 0) break block9;
                                                var1_1 = ((WI3$b$b)var1_1).a;
                                                var7_7 = var3_3.j;
                                                var8_9 /* !! */  = var3_3.c;
                                                var9_11 = var7_7.h(var8_9 /* !! */ );
                                                var10_12 /* !! */  = var3_3.i.e();
                                                var10_12 /* !! */ .delete(var8_9 /* !! */ );
                                                if (var9_11 == null) lbl-1000:
                                                // 7 sources

                                                {
                                                    while (true) {
                                                        var4_4 = 0;
                                                        var11_13 /* !! */  = null;
                                                        break block7;
                                                        break;
                                                    }
                                                }
                                                var10_12 /* !! */  = hI3$b.RUNNING;
                                                if (var9_11 != var10_12 /* !! */ ) break block10;
                                                var12_14 = var1_1 instanceof c$a$c;
                                                var10_12 /* !! */  = var3_3.a;
                                                if (!var12_14) break block11;
                                                var4_4 = androidx.work.impl.a.a;
                                                var11_13 /* !! */  = qx1.a();
                                                var11_13 /* !! */ .getClass();
                                                var4_4 = (int)var10_12 /* !! */ .f();
                                                if (var4_4 == 0) break block12;
                                                var3_3.c();
                                                ** GOTO lbl-1000
                                            }
                                            var11_13 /* !! */  = hI3$b.SUCCEEDED;
                                            var7_7.d((hI3$b)var11_13 /* !! */ , var8_9 /* !! */ );
                                            Intrinsics.checkNotNull(var1_1, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                                            var1_1 = ((c$a$c)var1_1).a;
                                            var11_13 /* !! */  = "success.outputData";
                                            Intrinsics.checkNotNullExpressionValue(var1_1, (String)var11_13 /* !! */ );
                                            var7_7.u(var8_9 /* !! */ , (b)var1_1);
                                            var3_3.g.getClass();
                                            var13_16 = System.currentTimeMillis();
                                            var1_1 = var3_3.k;
                                            var3_3 = var1_1.a(var8_9 /* !! */ ).iterator();
                                            while (true) {
                                                if ((var4_4 = (int)var3_3.hasNext()) == 0) ** GOTO lbl-1000
                                                var11_13 /* !! */  = (String)var3_3.next();
                                                var8_9 /* !! */  = var7_7.h((String)var11_13 /* !! */ );
                                                if (var8_9 /* !! */  != (var15_17 = hI3$b.BLOCKED) || (var16_18 = var1_1.b((String)var11_13 /* !! */ )) == 0) continue;
                                                var16_18 = androidx.work.impl.a.a;
                                                qx1.a().getClass();
                                                var8_9 /* !! */  = hI3$b.ENQUEUED;
                                                var7_7.d((hI3$b)var8_9 /* !! */ , (String)var11_13 /* !! */ );
                                                var7_7.t(var13_16, (String)var11_13 /* !! */ );
                                            }
                                        }
                                        var2_2 = var1_1 instanceof c$a.b;
                                        if (var2_2 == 0) break block13;
                                        var17_19 = androidx.work.impl.a.a;
                                        var1_1 = qx1.a();
                                        var1_1.getClass();
                                        var17_19 = -256;
                                        var3_3.b(var17_19);
                                        break block7;
                                    }
                                    var2_2 = androidx.work.impl.a.a;
                                    var7_7 = qx1.a();
                                    var7_7.getClass();
                                    var2_2 = (int)var10_12 /* !! */ .f();
                                    if (var2_2 == 0) break block14;
                                    var3_3.c();
                                    ** GOTO lbl-1000
                                }
                                if (var1_1 == null) {
                                    var1_1 = new c$a$a();
                                }
                                var3_3.d((c$a)var1_1);
                                ** GOTO lbl-1000
                            }
                            var17_20 = var9_11.isFinished();
                            if (var17_20 != 0) ** GOTO lbl-1000
                            var17_20 = -512;
                            var3_3.b(var17_20);
                        }
lbl89:
                        // 2 sources

                        while (true) {
                            var5_5 = var4_4;
                            break block8;
                            break;
                        }
                    }
                    var2_2 = var1_1 instanceof WI3$b$a;
                    if (var2_2 == 0) break block15;
                    var1_1 = ((WI3$b$a)var1_1).a;
                    var3_3.d((c$a)var1_1);
                    break block8;
                }
                var2_2 = var1_1 instanceof WI3$b$c;
                if (var2_2 != 0) {
                    var1_1 = (WI3$b$c)var1_1;
                    var17_21 = var1_1.a;
                    var7_8 = var3_3.j;
                    var3_3 = var3_3.c;
                    var8_10 = var7_8.h((String)var3_3);
                    if (var8_10 != null && !(var12_15 = var8_10.isFinished())) {
                        var5_5 = androidx.work.impl.a.a;
                        var6_6 /* !! */  = qx1.a();
                        var8_10.toString();
                        var6_6 /* !! */ .getClass();
                        var6_6 /* !! */  = hI3$b.ENQUEUED;
                        var7_8.d((hI3$b)var6_6 /* !! */ , (String)var3_3);
                        var7_8.w(var17_21, (String)var3_3);
                        var18_22 = -1;
                        var7_8.b(var18_22, (String)var3_3);
                        ** continue;
                    }
                    var17_21 = androidx.work.impl.a.a;
                    var1_1 = qx1.a();
                    Objects.toString((Object)var8_10);
                    var1_1.getClass();
                    ** continue;
                }
                break block16;
            }
            return (boolean)var5_5;
        }
        var1_1 = new NoWhenBranchMatchedException();
        throw var1_1;
    }
}

