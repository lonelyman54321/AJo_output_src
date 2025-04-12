/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnKeyListener
 */
import android.view.KeyEvent;
import android.view.View;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from ih1
 */
public final class ih1_2
implements View.OnKeyListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ ih1_2(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final boolean onKey(View view, int n3, KeyEvent keyEvent) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        return InflateView.k(inflateView, string2, view, n3, keyEvent);
    }
}

