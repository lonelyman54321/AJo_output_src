/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.core.view.f$k;
import com.google.android.material.internal.ScrimInsetsFrameLayout;

class ScrimInsetsFrameLayout$1
implements T72 {
    final /* synthetic */ ScrimInsetsFrameLayout this$0;

    public ScrimInsetsFrameLayout$1(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        this.this$0 = scrimInsetsFrameLayout;
    }

    public f onApplyWindowInsets(View object, f object2) {
        object = this.this$0;
        Object object3 = object.insets;
        if (object3 == null) {
            object3 = new Rect();
            object.insets = object3;
        }
        object = this.this$0.insets;
        int n3 = ((f)object2).b();
        int n4 = ((f)object2).d();
        int n7 = ((f)object2).c();
        int n8 = ((f)object2).a();
        object.set(n3, n4, n7, n8);
        this.this$0.onInsetsChanged((f)object2);
        object = this.this$0;
        object2 = ((f)object2).a;
        object3 = ((f$k)object2).j();
        ei1 ei12 = ei1.e;
        n3 = (int)(((ei1)object3).equals(ei12) ? 1 : 0);
        n4 = 1;
        if ((n3 ^= n4) != 0 && (object3 = this.this$0.insetForeground) != null) {
            n4 = 0;
            ei12 = null;
        }
        object.setWillNotDraw(n4 != 0);
        object = this.this$0;
        object3 = ViewCompat.a;
        object.postInvalidateOnAnimation();
        return ((f$k)object2).c();
    }
}

