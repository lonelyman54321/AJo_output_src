/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class H8
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ H8(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(View var1_1) {
        var1_1 = this.b;
        var2_2 = "this$0";
        var3_3 = this.a;
        switch (var3_3) {
            default: {
                var1_1 = (gd1_2)var1_1;
                Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
                var1_1 = var1_1.b;
                if (var1_1 != null) {
                    var1_1.l();
                }
                return;
            }
            case 0: 
        }
        var4_4 = q9_0.Companion;
        var1_1 = (q9_0)var1_1;
        Intrinsics.checkNotNullParameter(var1_1, (String)var2_2);
        var1_1.Ob();
        var2_2 = var1_1.X;
        var4_4 = "ajiohomeViewModel";
        var5_5 = null;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
            var6_6 = 0;
            var2_2 = null;
        }
        if ((var2_2 = var2_2.I) != null && (var6_6 = var2_2.isEmpty()) == 0) ** GOTO lbl-1000
        var2_2 = var1_1.X;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
            var6_6 = 0;
            var2_2 = null;
        }
        if ((var6_6 = (int)var2_2.t) != 0) {
            var2_2 = var1_1.X;
            if (var2_2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                var6_6 = 0;
                var2_2 = null;
            }
            var2_2.e();
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = var1_1.C1;
            var3_3 = 0;
            var4_4 = null;
            var1_1.yb(var6_6, false);
        }
        var2_2 = var1_1.k;
        if (var2_2 == null) {
            var2_2 = "homeListener";
            Intrinsics.throwUninitializedPropertyAccessException((String)var2_2);
        } else {
            var5_5 = var2_2;
        }
        var5_5.O0();
        var1_1 = var1_1.y;
        if (var1_1 != null) {
            ai0_2.i((View)var1_1);
        }
    }
}

