/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.ondemand.customercare.callmeback.CallMeLangViewHolder;

/*
 * Renamed from OJ
 */
public final class oj_2
implements View.OnClickListener {
    public final /* synthetic */ CallMeLangViewHolder a;
    public final /* synthetic */ String b;

    public /* synthetic */ oj_2(CallMeLangViewHolder callMeLangViewHolder, String string2) {
        this.a = callMeLangViewHolder;
        this.b = string2;
    }

    public final void onClick(View view) {
        CallMeLangViewHolder callMeLangViewHolder = this.a;
        String string2 = this.b;
        CallMeLangViewHolder.w(callMeLangViewHolder, string2, view);
    }
}

