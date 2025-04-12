/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.Button
 */
package com.clevertap.android.sdk.inapp;

import android.content.Context;
import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.a$a;
import com.clevertap.android.sdk.inapp.d$a;

public abstract class d
extends sh_1
implements View.OnTouchListener,
View.OnLongClickListener {
    public final GestureDetector j;
    public View k;

    public d() {
        GestureDetector gestureDetector;
        Context context = this.c;
        d$a d$a = new d$a(this);
        this.j = gestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)d$a);
    }

    public final void Ua(Button button, CTInAppNotificationButton object, int n3) {
        if (object != null) {
            Object object2 = n3;
            button.setTag(object2);
            button.setVisibility(0);
            object2 = ((CTInAppNotificationButton)object).f;
            button.setText((CharSequence)object2);
            object2 = ((CTInAppNotificationButton)object).g;
            n3 = Color.parseColor((String)object2);
            button.setTextColor(n3);
            int n4 = Color.parseColor((String)((CTInAppNotificationButton)object).a);
            button.setBackgroundColor(n4);
            object = new a$a(this);
            button.setOnClickListener((View.OnClickListener)object);
        } else {
            int n7 = 8;
            button.setVisibility(n7);
        }
    }

    public final boolean onLongClick(View view) {
        return true;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int n3;
        view = this.j;
        int n4 = view.onTouchEvent(motionEvent);
        if (n4 == 0 && (n4 = motionEvent.getAction()) != (n3 = 2)) {
            n4 = 0;
            view = null;
        } else {
            n4 = 1;
        }
        return n4 != 0;
    }
}

