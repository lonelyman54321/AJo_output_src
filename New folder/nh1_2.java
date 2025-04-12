/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from nh1
 */
public final class nh1_2
implements View.OnFocusChangeListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ nh1_2(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final void onFocusChange(View view, boolean bl2) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        InflateView.g(inflateView, string2, view, bl2);
    }
}

