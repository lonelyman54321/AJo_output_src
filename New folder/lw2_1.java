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
 * Renamed from lW2
 */
public final class lw2_1
implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return SearchView.i(view, motionEvent);
    }
}

