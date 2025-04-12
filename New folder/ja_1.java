/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$color;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.IncentivizeBottomSheetBinding;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.ResultIncentivise;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jA
 */
public final class ja_1
extends ClickableSpan {
    public final /* synthetic */ ia_1 a;

    public ja_1(ia_1 ia_12) {
        this.a = ia_12;
    }

    public final void onClick(View view) {
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "clickedView");
        Object object2 = AnalyticsManager.Companion;
        Object object3 = object2.getInstance().getNewCustomEventsRevamp();
        String string2 = object2.getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
        String string3 = object2.getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
        String string4 = cv_0.a(object2);
        String string5 = bv_0.a(object2);
        object2 = this;
        object = this.a;
        Bundle bundle = ((ia_1)object).Pa();
        Object object4 = "return metric section";
        Object object5 = "know more click";
        String string6 = "return and exchange nudge bottom card";
        int n3 = 1568;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string3, (String)object4, (String)object5, string2, string6, null, string5, bundle, string4, false, null, n3, null);
        object3 = ((ia_1)object).g;
        string3 = null;
        object3 = object3 != null && (object3 = ((qz1_2)object3).k0) != null ? (DataCallback)((LiveData)object3).d() : null;
        if (object3 != null && (object3 = (IncentiviseHighReturnData)((DataCallback)object3).getData()) != null && (object3 = ((IncentiviseHighReturnData)object3).getResult()) != null && (object3 = ((ResultIncentivise)object3).getEXCHANGE_NUDGE()) != null) {
            object4 = ag1_1.Companion;
            object5 = ((Fragment)object).requireActivity();
            object4.getClass();
            object4 = "profileType";
            Intrinsics.checkNotNullParameter(object4, (String)object4);
            Intrinsics.checkNotNullParameter(object3, "profileHealth");
            object4 = new ag1_1();
            ((ag1_1)object4).d = string2 = "knowMore";
            ((ag1_1)object4).e = object3;
            ((ag1_1)object4).g = object5;
        } else {
            object4 = null;
        }
        if (object4 != null) {
            object = ((Fragment)object).requireActivity().getSupportFragmentManager();
            ((DialogFragment)object4).show((FragmentManager)object, null);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        int n3;
        Intrinsics.checkNotNullParameter(textPaint, "drawState");
        super.updateDrawState(textPaint);
        IncentivizeBottomSheetBinding incentivizeBottomSheetBinding = this.a.f;
        if (incentivizeBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            n3 = 0;
            incentivizeBottomSheetBinding = null;
        }
        incentivizeBottomSheetBinding = incentivizeBottomSheetBinding.rvpSeekBarLayoutView.tvKnowMore.getContext();
        int n4 = R$color.option_blue;
        n3 = t70.getColor((Context)incentivizeBottomSheetBinding, n4);
        textPaint.setColor(n3);
        textPaint.setUnderlineText(false);
    }
}

