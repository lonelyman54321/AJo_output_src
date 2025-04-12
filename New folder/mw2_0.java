/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;

/*
 * Renamed from mW2
 */
public final class mw2_0
implements View.OnTouchListener {
    public final /* synthetic */ SearchView a;

    public /* synthetic */ mw2_0(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return SearchView.c(this.a, view, motionEvent);
    }
}

