/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$f;
import com.facebook.login.DeviceAuthDialog;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class eV
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eV(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        var1_1 = "this$0";
        var2_2 = this.b;
        var3_3 = this.a;
        switch (var3_3) {
            default: {
                var4_4 = "<u>";
                var2_2 = (vv2_2)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, (String)var1_1);
                var2_2.L9();
                var2_2.i = var5_6 = var2_2.i ^ true;
                var1_1 = var5_6 != false ? "Done" : "Edit";
                var6_7 = og1_1.c();
                if (!var6_7) ** GOTO lbl47
                try {
                    var7_8 /* !! */  = var2_2.G;
                    if (var7_8 /* !! */  == null) ** GOTO lbl50
                }
                catch (Throwable v0) {
                    var4_4 = var2_2.G;
                    if (var4_4 != null) {
                        var4_4.setText((CharSequence)var1_1);
                    }
                    ** GOTO lbl50
                }
                var8_10 = Locale.getDefault();
                var9_12 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(var8_10, (String)var9_12);
                var8_10 = var1_1.toUpperCase((Locale)var8_10);
                var9_12 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(var8_10, (String)var9_12);
                var9_12 = new StringBuilder((String)var4_4);
                var9_12.append((String)var8_10);
                var4_4 = "</u>";
                var9_12.append((String)var4_4);
                var4_4 = var9_12.toString();
                var4_4 = hv3_0.f((String)var4_4);
                var7_8 /* !! */ .setText((CharSequence)var4_4);
lbl47:
                // 1 sources

                var4_4 = var2_2.G;
                if (var4_4 != null) {
                    var4_4.setText((CharSequence)var1_1);
                }
lbl50:
                // 6 sources

                var1_1 = var2_2.j;
                var3_3 = 0;
                var4_4 = null;
                var7_8 /* !! */  = "mSearchHistoryAdapter";
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var7_8 /* !! */ );
                    var5_6 = false;
                    var1_1 = null;
                }
                var1_1.c = var10_13 = var2_2.i;
                var1_1 = var2_2.B;
                if (var1_1 != null) {
                    var2_2 = var2_2.j;
                    if (var2_2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var7_8 /* !! */ );
                    } else {
                        var4_4 = var2_2;
                    }
                    var1_1.setAdapter((RecyclerView$f)var4_4);
                }
                return;
            }
            case 3: {
                var2_2 = (or2_0)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, (String)var1_1);
                var1_1 = AnalyticsManager.Companion;
                var4_5 = var1_1.getInstance().getGtmEvents();
                var7_9 = "Card_clicked";
                var8_11 = "Add Credit/Debit card selected";
                ak0_0.a((AnalyticsManager$Companion)var1_1, var4_5, var7_9, var8_11);
                var1_1 = var2_2.c;
                if (var1_1 != null) {
                    var1_1.o3();
                }
                return;
            }
            case 2: {
                var2_2 = (BottomSheetDialog)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, "$brandDescDialog");
                var2_2.dismiss();
                return;
            }
            case 1: {
                var2_2 = (DeviceAuthDialog)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, (String)var1_1);
                var2_2.Qa();
                return;
            }
            case 0: 
        }
        var2_2 = (fv_0)var2_2;
        Intrinsics.checkNotNullParameter(var2_2, (String)var1_1);
        var2_2.dismiss();
    }
}

