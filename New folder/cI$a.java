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

public final class cI$a
implements View.OnTouchListener {
    public final /* synthetic */ ci_1 a;

    public cI$a(ci_1 ci_12) {
        this.a = ci_12;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.j.onTouchEvent(motionEvent);
        return true;
    }
}

