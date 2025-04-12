/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
import android.view.ViewTreeObserver;
import com.ril.ajio.analytics.handler.ImpressionTrackableAdapter;

/*
 * Renamed from ff1
 */
public final class ff1_1
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ ImpressionTrackableAdapter a;

    public /* synthetic */ ff1_1(ImpressionTrackableAdapter impressionTrackableAdapter) {
        this.a = impressionTrackableAdapter;
    }

    public final void onScrollChanged() {
        ImpressionTrackableAdapter.g(this.a);
    }
}

