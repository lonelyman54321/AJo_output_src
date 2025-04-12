/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ix0
 */
public final class ix0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogFragment b;

    public /* synthetic */ ix0_1(BottomSheetDialogFragment bottomSheetDialogFragment, int n3) {
        this.a = n3;
        this.b = bottomSheetDialogFragment;
    }

    public final void onClick(View object) {
        object = "this$0";
        BottomSheetDialogFragment bottomSheetDialogFragment = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                PM2$a pM2$a = pm2_2.Companion;
                bottomSheetDialogFragment = (pm2_2)bottomSheetDialogFragment;
                Intrinsics.checkNotNullParameter(bottomSheetDialogFragment, (String)object);
                bottomSheetDialogFragment.dismiss();
                pm2_2.Pa("cross");
                return;
            }
            case 0: 
        }
        bottomSheetDialogFragment = (jx0_1)bottomSheetDialogFragment;
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragment, (String)object);
        object = AnalyticsManager.Companion;
        String string2 = "EDD api failure popup";
        String string3 = "Go To Bag";
        String string4 = "single page checkout";
        tj2_0.e((AnalyticsManager$Companion)object, string2, string3, string4);
        object = ((jx0_1)bottomSheetDialogFragment).a;
        if (object != null) {
            object.v9();
        }
        bottomSheetDialogFragment.dismiss();
    }
}

