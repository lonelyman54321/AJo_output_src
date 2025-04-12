/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.databinding.FragmentYourDataDeleteAccountBinding;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wJ3
 */
public final class wj3_2
extends fw_2
implements View.OnClickListener {
    public static final wJ3$a Companion;
    public FragmentYourDataDeleteAccountBinding a;
    public final NewCustomEventsRevamp b;
    public final hh3_2 c;

    static {
        wJ3$a wJ3$a;
        Companion = wJ3$a = new Object();
    }

    public wj3_2() {
        Object object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.b = object;
        object = new gv1_2(1);
        this.c = object = yr1_2.b((Function0)object);
    }

    public final void onClick(View view) {
        Object object;
        int n3;
        wj3_2 wj3_22 = this;
        if (view != null) {
            n3 = view.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.tv_delete;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            NewCustomEventsRevamp newCustomEventsRevamp = wj3_22.b;
            Object object2 = newCustomEventsRevamp.getEVENT_CATEGORY_MY_ACCOUNT_INTERACTIONS();
            Object object3 = newCustomEventsRevamp.getEVENT_ACTION_YOUR_DATA_DELETE_ACCOUNT_CLICK();
            String string2 = newCustomEventsRevamp.getEVENT_DELETE_MY_ACCOUNT_INTERACTIONS();
            object = AnalyticsManager.Companion;
            String string3 = bv_0.a((AnalyticsManager$Companion)object);
            String string4 = cv_0.a((AnalyticsManager$Companion)object);
            String string5 = "your data screen";
            String string6 = "your data screen";
            int n7 = 1668;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object2, (String)object3, null, string2, string5, string6, string3, null, string4, false, null, n7, null);
            object = new hw3_0();
            n4 = 0;
            ((DialogFragment)object).setCancelable(false);
            newCustomEventsRevamp = new Bundle();
            object3 = this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(object3, "requireActivity(...)");
            object2 = new jo_2((Context)object3);
            String string7 = "";
            object2 = ((sw_0)object2).getPreference("INPUT_MOBILE_NUMBER", string7);
            newCustomEventsRevamp.putString("INTENT_USER_PHONE_NUMBER", (String)object2);
            object2 = ((UserInformation)wj3_22.c.getValue()).getUserEmailId();
            object3 = "INTENT_USER_EMAIL_ID";
            newCustomEventsRevamp.putString((String)object3, (String)object2);
            object2 = "IS_IMPS";
            newCustomEventsRevamp.putBoolean((String)object2, false);
            boolean bl2 = true;
            newCustomEventsRevamp.putBoolean("INTENT_IS_FROM_DELETE_ACCOUNT_JOURNEY", bl2);
            ((Fragment)object).setArguments((Bundle)newCustomEventsRevamp);
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            ((DialogFragment)object).show(fragmentManager, null);
        }
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object = FragmentYourDataDeleteAccountBinding.inflate((LayoutInflater)object, viewGroup, false);
        this.a = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        return ((FragmentYourDataDeleteAccountBinding)object).getRoot();
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        object = this.a;
        bundle = null;
        String string2 = "binding";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object = object.tvMessage;
        Object object2 = h40_0.a;
        object2 = h40_0.s().optString("your_data");
        String string3 = "optString(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        object.setText((CharSequence)object2);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            bundle = object;
        }
        bundle.tvDelete.setOnClickListener(this);
    }
}

