/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 */
package com.ril.ajio.videoPlayer.ui;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.videoPlayer.ui.SwipeDismissBaseActivity$a;

public abstract class SwipeDismissBaseActivity
extends AppCompatActivity {
    public GestureDetector X;

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean bl2;
        GestureDetector gestureDetector = this.X;
        if (gestureDetector != null && (bl2 = gestureDetector.onTouchEvent(motionEvent))) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SwipeDismissBaseActivity$a swipeDismissBaseActivity$a = new SwipeDismissBaseActivity$a(this);
        bundle = new GestureDetector((GestureDetector.OnGestureListener)swipeDismissBaseActivity$a);
        this.X = bundle;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.X.onTouchEvent(motionEvent);
    }
}

