/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.ToggleButton
 */
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AG2
 */
public final class ag2_0
extends RecyclerView$B {
    public final iI0 a;
    public final ToggleButton b;
    public final TextView c;

    public ag2_0(View view, iI0 iI02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(iI02, "faqListener");
        super(view);
        this.a = iI02;
        int n3 = R$id.r_ques;
        iI02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(iI02, string2);
        iI02 = (ToggleButton)iI02;
        this.b = iI02;
        n3 = R$id.r_ans;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
    }

    public final void w(ReferralFAQInfo referralFAQInfo) {
        Intrinsics.checkNotNullParameter(referralFAQInfo, "referralFAQ");
        Object object = referralFAQInfo.getQues();
        ToggleButton toggleButton = this.b;
        toggleButton.setContentDescription((CharSequence)object);
        object = referralFAQInfo.getQues();
        toggleButton.setTextOn((CharSequence)object);
        object = referralFAQInfo.getQues();
        toggleButton.setTextOff((CharSequence)object);
        object = referralFAQInfo.getAns();
        TextView textView = this.c;
        textView.setContentDescription((CharSequence)object);
        object = referralFAQInfo.getAns();
        textView.setText((CharSequence)object);
        int n3 = referralFAQInfo.isExpanded();
        toggleButton.setChecked(n3 != 0);
        n3 = referralFAQInfo.isExpanded();
        if (n3 != 0) {
            n3 = 0;
            object = null;
            textView.setVisibility(0);
        } else {
            n3 = 8;
            textView.setVisibility(n3);
        }
        object = new zG2(referralFAQInfo, this);
        toggleButton.setOnClickListener((View.OnClickListener)object);
    }
}

