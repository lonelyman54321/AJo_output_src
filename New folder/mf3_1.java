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

/*
 * Renamed from mF3
 */
public final class mf3_1
implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean bl2 = view.hasFocus();
        if (!bl2) {
            view.requestFocus();
        }
        return false;
    }
}

