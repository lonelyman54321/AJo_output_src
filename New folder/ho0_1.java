/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.util.FirstDrawDoneListener;

/*
 * Renamed from hO0
 */
public final class ho0_1
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FirstDrawDoneListener a;
    public final /* synthetic */ View b;

    public /* synthetic */ ho0_1(FirstDrawDoneListener firstDrawDoneListener, View view) {
        this.a = firstDrawDoneListener;
        this.b = view;
    }

    public final void onGlobalLayout() {
        FirstDrawDoneListener firstDrawDoneListener = this.a;
        View view = this.b;
        FirstDrawDoneListener.a(firstDrawDoneListener, view);
    }
}

