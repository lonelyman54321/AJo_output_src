/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintItemViewHolderRefresh;
import com.ril.ajio.services.data.CustomerCare.CCComplaintInfoHelper$CCComplaintInfo;

/*
 * Renamed from bG
 */
public final class bg_2
implements View.OnClickListener {
    public final /* synthetic */ CCComplaintInfoHelper$CCComplaintInfo a;
    public final /* synthetic */ CCComplaintItemViewHolderRefresh b;

    public /* synthetic */ bg_2(CCComplaintItemViewHolderRefresh cCComplaintItemViewHolderRefresh, CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo) {
        this.a = cCComplaintInfoHelper$CCComplaintInfo;
        this.b = cCComplaintItemViewHolderRefresh;
    }

    public final void onClick(View view) {
        CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo = this.a;
        CCComplaintItemViewHolderRefresh.x(this.b, cCComplaintInfoHelper$CCComplaintInfo, view);
    }
}

