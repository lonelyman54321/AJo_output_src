/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.view.View;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from jh1
 */
public final class jh1_2
implements View.OnLongClickListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ jh1_2(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final boolean onLongClick(View view) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        return InflateView.l(inflateView, string2, view);
    }
}

