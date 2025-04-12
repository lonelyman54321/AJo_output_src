/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.services.data.referral.transform.ReferralFAQInfo;
import kotlin.jvm.internal.Intrinsics;

public final class zG2
implements View.OnClickListener {
    public final /* synthetic */ ReferralFAQInfo a;
    public final /* synthetic */ ag2_0 b;

    public /* synthetic */ zG2(ReferralFAQInfo referralFAQInfo, ag2_0 ag2_02) {
        this.a = referralFAQInfo;
        this.b = ag2_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$referralFAQ");
        ag2_0 ag2_02 = this.b;
        Intrinsics.checkNotNullParameter(ag2_02, "this$0");
        boolean bl2 = ag2_02.b.isChecked();
        ((ReferralFAQInfo)object).setExpanded(bl2);
        boolean n3 = ((ReferralFAQInfo)object).isExpanded();
        TextView textView = ag2_02.c;
        if (n3) {
            boolean bl3 = false;
            object = null;
            textView.setVisibility(0);
        } else {
            int n4 = 8;
            textView.setVisibility(n4);
        }
        object = ag2_02.a;
        int n7 = ag2_02.getAdapterPosition();
        object.R7(n7);
    }
}

