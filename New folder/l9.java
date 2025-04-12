/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.jio.jioads.adinterfaces.JioAdView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class l9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void run() {
        block19: {
            block20: {
                block18: {
                    var1_1 = this.b;
                    var2_2 = this.a;
                    switch (var2_2) {
                        default: {
                            JioAdView.a((JioAdView)var1_1);
                            return;
                        }
                        case 0: 
                    }
                    var3_3 /* !! */  = q9_0.Companion;
                    var1_1 = (q9_0)var1_1;
                    Intrinsics.checkNotNullParameter(var1_1, "this$0");
                    var3_3 /* !! */  = var1_1.B;
                    var4_4 = 0;
                    var5_5 /* !! */  = null;
                    if (var3_3 /* !! */  != null) break block18;
                    var1_1 = yn3_0.a;
                    var5_5 /* !! */  = new Object[]{};
                    var1_1.d("fahLuxeTabLayout or fahLuxeTabContainer is null", var5_5 /* !! */ );
                    var5_5 /* !! */  = "AjioHomeFragment";
                    var3_3 /* !! */  = new Exception((String)var5_5 /* !! */ );
                    var1_1.e((Throwable)var3_3 /* !! */ );
                    break block19;
                }
                var3_3 /* !! */  = var1_1.G;
                Intrinsics.checkNotNull(var3_3 /* !! */ );
                var2_2 = var3_3 /* !! */ .getVisibility();
                var6_6 = 4 != 0;
                if (var2_2 != var6_6 || (var3_3 /* !! */  = var1_1.B) == null || (var2_2 = var3_3 /* !! */ .getVisibility()) != var6_6) {
                    var3_3 /* !! */  = var1_1.G;
                    if (var3_3 /* !! */  != null) {
                        ai0_2.k((View)var3_3 /* !! */ );
                    }
                    if ((var3_3 /* !! */  = var1_1.B) != null) {
                        ai0_2.k((View)var3_3 /* !! */ );
                    }
                }
                var3_3 /* !! */  = var1_1.G;
                Intrinsics.checkNotNull(var3_3 /* !! */ );
                var2_2 = var3_3 /* !! */ .getWidth();
                var7_7 = var1_1.B;
                Intrinsics.checkNotNull((Object)var7_7);
                var8_8 = R$id.fahLuxeTabContainer;
                var7_7.setId(var8_8);
                var9_9 = var1_1.G;
                Intrinsics.checkNotNull((Object)var9_9);
                var10_10 = R$id.fahLuxeTabLayout;
                var9_9.setId(var10_10);
                var11_11 /* !! */  = yn3_0.a;
                var12_12 = Gj0.b((int)var2_2, "AjioHome: LuxeTabWidth: ", " :: marginSide: 10");
                var13_13 = new Object[]{};
                var11_11 /* !! */ .a(var12_12, var13_13);
                var11_11 /* !! */  = var9_9.getLayoutParams();
                var12_12 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
                Intrinsics.checkNotNull(var11_11 /* !! */ , var12_12);
                var11_11 /* !! */  = (ConstraintLayout$LayoutParams)var11_11 /* !! */ ;
                var14_14 = 1;
                var15_15 = 10;
                if (var2_2 <= false) break block20;
                AJIOApplication.Companion.getClass();
                var16_16 = AJIOApplication$a.a();
                var17_17 = el3.b((Context)var16_16) + -20;
                if (var2_2 < var17_17) ** GOTO lbl-1000
            }
            if ((var2_2 = var9_9.getTabCount()) <= var6_6) lbl-1000:
            // 2 sources

            {
                var2_2 = var7_7.getId();
                var11_11 /* !! */ .t = var2_2;
                var2_2 = var7_7.getId();
                var11_11 /* !! */ .v = var2_2;
                var11_11 /* !! */ .setMarginStart(var15_15);
                var11_11 /* !! */ .setMarginEnd(var15_15);
                var9_9.setLayoutParams((ViewGroup.LayoutParams)var11_11 /* !! */ );
                var9_9.requestLayout();
                var3_3 /* !! */  = var1_1.G;
                if (var3_3 /* !! */  != null) {
                    var4_4 = 2;
                    var3_3 /* !! */ .setTabGravity(var4_4);
                }
                if ((var3_3 /* !! */  = var1_1.G) != null) {
                    var3_3 /* !! */ .setTabMode(var14_14);
                }
            } else {
                var2_2 = var7_7.getId();
                var11_11 /* !! */ .t = var2_2;
                var11_11 /* !! */ .setMarginStart(var15_15);
                var11_11 /* !! */ .setMarginEnd(var15_15);
                var9_9.setLayoutParams((ViewGroup.LayoutParams)var11_11 /* !! */ );
                var9_9.requestLayout();
                var3_3 /* !! */  = var1_1.G;
                if (var3_3 /* !! */  != null) {
                    var3_3 /* !! */ .setTabGravity(var14_14);
                }
                if ((var3_3 /* !! */  = var1_1.G) != null) {
                    var3_3 /* !! */ .setTabMode(0);
                }
            }
            var3_3 /* !! */  = var1_1.G;
            Intrinsics.checkNotNull(var3_3 /* !! */ );
            var2_2 = var3_3 /* !! */ .getVisibility();
            if (var2_2 || (var3_3 /* !! */  = var1_1.B) == null || (var2_2 = var3_3 /* !! */ .getVisibility())) {
                var3_3 /* !! */  = var1_1.G;
                if (var3_3 /* !! */  != null) {
                    ai0_2.B((View)var3_3 /* !! */ );
                }
                if ((var3_3 /* !! */  = var1_1.B) != null) {
                    ai0_2.B((View)var3_3 /* !! */ );
                }
            }
            if ((var3_3 /* !! */  = var1_1.w) != null) {
                ai0_2.B((View)var3_3 /* !! */ );
            }
            var2_2 = var1_1.X0;
            var1_1.Ra(var2_2);
            var3_3 /* !! */  = var1_1.x;
            if (var3_3 /* !! */  != null) {
                ai0_2.i((View)var3_3 /* !! */ );
            }
            if ((var1_1 = var1_1.Q) != null) {
                ai0_2.B((View)var1_1);
            }
        }
    }
}

