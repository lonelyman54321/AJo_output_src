/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.view.View;
import android.widget.AdapterView;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from mh1
 */
public final class mh1_2
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ InflateView a;
    public final /* synthetic */ String b;

    public /* synthetic */ mh1_2(InflateView inflateView, String string2) {
        this.a = inflateView;
        this.b = string2;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n3, long l2) {
        InflateView inflateView = this.a;
        String string2 = this.b;
        InflateView.j(inflateView, string2, adapterView, view, n3, l2);
    }
}

