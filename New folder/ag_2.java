/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCComplaintDetailViewHolderRefresh;

/*
 * Renamed from aG
 */
public final class ag_2
implements View.OnClickListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ CCComplaintDetailViewHolderRefresh e;

    public /* synthetic */ ag_2(String string2, String string3, String string4, long l2, CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = l2;
        this.e = cCComplaintDetailViewHolderRefresh;
    }

    public final void onClick(View view) {
        long l2 = this.d;
        CCComplaintDetailViewHolderRefresh cCComplaintDetailViewHolderRefresh = this.e;
        String string2 = this.a;
        String string3 = this.b;
        String string4 = this.c;
        CCComplaintDetailViewHolderRefresh.w(string2, string3, string4, l2, cCComplaintDetailViewHolderRefresh, view);
    }
}

