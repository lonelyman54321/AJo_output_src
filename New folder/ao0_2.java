/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener;
import com.ril.ajio.databinding.DeleteAccountSucessFragmentBinding;
import com.ril.ajio.web.CustomWebViewActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ao0
 */
public final class ao0_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public DeleteAccountSucessFragmentBinding a;
    public DeleteAccountInteractionListener b;
    public final NewCustomEventsRevamp c;

    public ao0_2() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        this.c = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void onClick(View view) {
        Object object;
        int n3;
        ao0_2 ao0_22 = this;
        if (view != null) {
            n3 = view.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.tv_delete_account;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            NewCustomEventsRevamp newCustomEventsRevamp = ao0_22.c;
            String string2 = newCustomEventsRevamp.getEVENT_CATEGORY_DELETE_PROFILE();
            String string3 = ao0_22.c.getEVENT_ACTION_DELETE_ACCOUNT_DONE();
            object = AnalyticsManager.Companion;
            String string4 = bv_0.a((AnalyticsManager$Companion)object);
            String string5 = cv_0.a((AnalyticsManager$Companion)object);
            int n7 = 1668;
            String string6 = "buttonTap";
            String string7 = "delete your profile screen";
            String string8 = "delete your profile screen";
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, null, string6, string7, string8, string4, null, string5, false, null, n7, null);
            object = ao0_22.b;
            if (object != null) {
                object.closeActivity();
            }
            this.dismiss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ((BottomSheetDialog)object).setCanceledOnTouchOutside(false);
        zo0_2 zo0_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)zo0_22);
        return object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object = DeleteAccountSucessFragmentBinding.inflate(object, viewGroup, false);
        this.a = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object = object.getRoot();
        Intrinsics.checkNotNullExpressionValue(object, "getRoot(...)");
        return object;
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.getContext();
        object2 = "null cannot be cast to non-null type android.app.Activity";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (Activity)object;
        boolean bl2 = object instanceof CustomWebViewActivity;
        if (bl2) {
            object2 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (DeleteAccountInteractionListener)object;
            this.b = object;
        }
        object = this.a;
        bl2 = false;
        object2 = null;
        string2 = "binding";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object = null;
        }
        object = object.tvMessage;
        Object object3 = h40_0.a;
        object3 = h40_0.s().optString("account_deleted_info");
        String string3 = "optString(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string3);
        object.setText((CharSequence)object3);
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        object2.tvDeleteAccount.setOnClickListener(this);
    }
}

