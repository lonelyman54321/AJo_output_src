/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.payment.fragment.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dw
 */
public final class dw_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ew_2 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dw_1(ew_2 ew_22, Object object, int n3) {
        this.a = n3;
        this.b = ew_22;
        this.c = object;
    }

    public final void onClick(View object) {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object = (f)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Context context = (Context)this.c;
                Intrinsics.checkNotNullParameter(context, "$context");
                tj2_0.e(AnalyticsManager.Companion, "AppRating_popup", "Ratenow", "order confirmation screen");
                jo_2 jo_22 = ((ew_2)object).a;
                boolean bl3 = true;
                jo_22.putPreference("DISABLE_RATING_DIALOG", bl3);
                ((ew_2)object).a.putPreference("SHOW_RATING_ON_LP", false);
                ((f)object).t = bl3;
                mz3_0.I(context);
                return;
            }
            case 0: 
        }
        ew_2 ew_22 = this.b;
        Intrinsics.checkNotNullParameter(ew_22, "this$0");
        object = ew_22.getActivity();
        if (object != null) {
            object = ew_22.getActivity();
            if (object != null) {
                boolean bl4 = object.isFinishing();
                object = bl4;
            } else {
                boolean bl5 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            boolean bl6 = (Boolean)object;
            if (!bl6 && (object = ew_22.getActivity()) != null) {
                ew_22 = (MenuItem)this.c;
                object.onOptionsItemSelected((MenuItem)ew_22);
            }
        }
    }
}

