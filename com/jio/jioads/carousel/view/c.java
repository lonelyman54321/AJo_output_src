/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
package com.jio.jioads.carousel.view;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;

public final class c
implements View.OnFocusChangeListener {
    public final void onFocusChange(View object, boolean bl2) {
        float f5 = 1.0f;
        if (bl2) {
            object = ViewCompat.a((View)object);
            WeakReference weakReference = ((zd3_1)object).a;
            View view = (View)weakReference.get();
            float f6 = 1.05f;
            if (view != null) {
                view = view.animate();
                view.scaleX(f6);
            }
            if ((view = (View)weakReference.get()) != null) {
                view = view.animate();
                view.scaleY(f6);
            }
            long l2 = 30;
            ((zd3_1)object).c(l2);
            object = (View)weakReference.get();
            if (object != null) {
                object = object.animate();
                object.translationZ(f5);
            }
            if ((object = (View)weakReference.get()) != null) {
                object = object.animate();
                object.start();
            }
        } else {
            object = ViewCompat.a((View)object);
            WeakReference weakReference = ((zd3_1)object).a;
            View view = (View)weakReference.get();
            if (view != null) {
                view = view.animate();
                view.scaleX(f5);
            }
            if ((view = (View)weakReference.get()) != null) {
                view = view.animate();
                view.scaleY(f5);
            }
            long l3 = 10;
            ((zd3_1)object).c(l3);
            object = (View)weakReference.get();
            if (object != null) {
                object = object.animate();
                f5 = 0.0f;
                object.translationZ(0.0f);
            }
            if ((object = (View)weakReference.get()) != null) {
                object = object.animate();
                object.start();
            }
        }
    }
}

