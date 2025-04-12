/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 */
import android.content.Context;
import android.view.GestureDetector;

public final class kZ0 {
    public final GestureDetector a;

    public kZ0(Context context, GestureDetector.OnGestureListener onGestureListener) {
        GestureDetector gestureDetector;
        this.a = gestureDetector = new GestureDetector(context, onGestureListener, null);
    }
}

