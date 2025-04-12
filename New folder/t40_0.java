/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.remoteconfig.devsettings.view.a;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.user.UserProfileData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t40
 */
public final class t40_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t40_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int bl2 = this.a;
        switch (bl2) {
            default: {
                object3 = (ma2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = object.getTag();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Product.ProductOptionItem");
                object = (ProductOptionItem)object;
                object2 = ((ma2_2)object3).a;
                if (object2 != null) {
                    object2.e((ProductOptionItem)object);
                }
                return;
            }
            case 1: {
                object3 = (bz1_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                Object object4 = "my account screen";
                ((GTMEvents)object).pushButtonTapEvent("verify email click", object4, (String)object4);
                object = new hw3_0();
                ((DialogFragment)object).setCancelable(false);
                object2 = new Bundle();
                object4 = ((bz1_2)object3).D;
                Intrinsics.checkNotNull(object4);
                object4 = ((Object)((AppCompatTextView)object4).getText()).toString();
                object2.putString("INTENT_USER_PHONE_NUMBER", (String)object4);
                object4 = ((bz1_2)object3).B;
                String string2 = null;
                if (object4 != null) {
                    object4 = ((AppCompatTextView)object4).getText();
                } else {
                    boolean bl3 = false;
                    object4 = null;
                }
                object4 = String.valueOf(object4);
                String string3 = "INTENT_USER_EMAIL_ID";
                object2.putString(string3, (String)object4);
                boolean bl4 = true;
                object2.putBoolean("INTENT_FRAUD_REDUCTION_FLOW", bl4);
                object4 = ((bz1_2)object3).N;
                if (object4 != null) {
                    string2 = ((UserProfileData)object4).updateNumberRequestWindow;
                }
                object2.putString("INTENT_UPDATE_MOBILE_NUMBER_WINDOW", string2);
                object4 = ((bz1_2)object3).N;
                if (object4 != null) {
                    boolean bl5 = ((UserProfileData)object4).updateRequestPending;
                    string2 = "INTENT_UPDATE_PENDING_REQUEST";
                    object2.putBoolean(string2, bl5);
                }
                ((Fragment)object).setArguments((Bundle)object2);
                object2 = ((Fragment)object3).requireActivity().getSupportFragmentManager();
                ((DialogFragment)object).show((FragmentManager)object2, "UpdateProfileOtpBottomSheetFragment");
                return;
            }
            case 0: 
        }
        object3 = (a)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object = ((Fragment)object3).getActivity();
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

