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
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseActivity$b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ov
 */
public final class ov_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ov_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (jx0_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = AnalyticsManager.Companion;
                String string2 = "Reload";
                String string3 = "single page checkout";
                String string4 = "EDD api failure popup";
                tj2_0.e((AnalyticsManager$Companion)object, string4, string2, string3);
                object = ((jx0_1)object2).a;
                if (object != null) {
                    object.M2();
                }
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 0: 
        }
        BaseActivity$b baseActivity$b = BaseActivity.Companion;
        object2 = (BaseActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((BaseActivity)object2).G2();
    }
}

