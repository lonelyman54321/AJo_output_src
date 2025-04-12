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
 * Renamed from cG
 */
public final class cg_2
implements View.OnClickListener {
    public final /* synthetic */ CCComplaintItemViewHolderRefresh a;
    public final /* synthetic */ CCComplaintInfoHelper$CCComplaintInfo b;

    public /* synthetic */ cg_2(CCComplaintItemViewHolderRefresh cCComplaintItemViewHolderRefresh, CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo) {
        this.a = cCComplaintItemViewHolderRefresh;
        this.b = cCComplaintInfoHelper$CCComplaintInfo;
    }

    public final void onClick(View view) {
        CCComplaintItemViewHolderRefresh cCComplaintItemViewHolderRefresh = this.a;
        CCComplaintInfoHelper$CCComplaintInfo cCComplaintInfoHelper$CCComplaintInfo = this.b;
        CCComplaintItemViewHolderRefresh.w(cCComplaintItemViewHolderRefresh, cCComplaintInfoHelper$CCComplaintInfo, view);
    }
}

