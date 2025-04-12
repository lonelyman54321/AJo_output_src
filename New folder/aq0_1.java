/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
import android.view.KeyEvent;
import android.view.View;
import androidx.navigation.e;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aQ0
 */
public final class aq0_1
implements View.OnKeyListener {
    public final /* synthetic */ fq0_2 a;

    public /* synthetic */ aq0_1(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean onKey(View var1_1, int var2_2, KeyEvent var3_3) {
        block13: {
            block10: {
                block12: {
                    block11: {
                        var1_1 = fq0_2.Companion;
                        var1_1 = this.a;
                        var4_4 = "this$0";
                        Intrinsics.checkNotNullParameter(var1_1, var4_4);
                        var5_5 = var3_3 /* !! */ .getAction();
                        if (var5_5 != 0 || var2_2 != (var5_5 = 4)) break block10;
                        var2_2 = (int)var1_1.s;
                        if (var2_2 == 0) break block11;
                        if ((var1_1 = var1_1.getActivity()) != null) {
                            var1_1.onBackPressed();
                        }
                        break block12;
                    }
                    var6_6 = var1_1.o;
                    var5_5 = 0;
                    var3_3 /* !! */  = null;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fleekAppNavHostController");
                        var2_2 = 0;
                        var6_6 = null;
                    }
                    if ((var2_2 = (int)var6_6.q()) != 0) break block12;
                    var6_6 = var1_1.n;
                    var4_4 = "bottomNavHostController";
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                        var2_2 = 0;
                        var6_6 = null;
                    }
                    if ((var2_2 = (int)var6_6.q()) != 0) break block12;
                    var6_6 = h40_0.a;
                    var2_2 = (int)h40_0.c();
                    if (var2_2 == 0) ** GOTO lbl-1000
                    var6_6 = var1_1.q;
                    if (var6_6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                        var2_2 = 0;
                        var6_6 = null;
                    }
                    if ((var2_2 = (int)var6_6.o()) == 0) {
                        var6_6 = var1_1.n;
                        if (var6_6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                            var2_2 = 0;
                            var6_6 = null;
                        }
                        if ((var1_1 = var1_1.n) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var4_4);
                            var7_7 = false;
                            var1_1 = null;
                        }
                        if ((var1_1 = var1_1.h()) != null) {
                            var3_3 /* !! */  = var1_1.h;
                        }
                        T61.f((e)var6_6, (String)var3_3 /* !! */ );
                    } else if ((var1_1 = var1_1.getActivity()) != null) {
                        var1_1.onBackPressed();
                    }
                }
                var7_7 = true;
                break block13;
            }
            var7_7 = false;
            var1_1 = null;
        }
        return var7_7;
    }
}

