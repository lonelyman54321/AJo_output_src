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

public final class bI$a
implements View.OnTouchListener {
    public final /* synthetic */ bi_1 a;

    public bI$a(bi_1 bi_12) {
        this.a = bi_12;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.j.onTouchEvent(motionEvent);
        return true;
    }
}

