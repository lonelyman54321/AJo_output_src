/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 */
package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppCompatDelegateImpl$m;
import androidx.appcompat.widget.ContentFrameLayout;

public final class AppCompatDelegateImpl$l
extends ContentFrameLayout {
    public final /* synthetic */ AppCompatDelegateImpl i;

    public AppCompatDelegateImpl$l(AppCompatDelegateImpl appCompatDelegateImpl, d80 d802) {
        this.i = appCompatDelegateImpl;
        super((Context)d802);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl2;
        AppCompatDelegateImpl appCompatDelegateImpl = this.i;
        boolean bl3 = appCompatDelegateImpl.I(keyEvent);
        if (!bl3 && !(bl2 = super.dispatchKeyEvent(keyEvent))) {
            bl2 = false;
            keyEvent = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean onInterceptTouchEvent(MotionEvent object) {
        int n3 = object.getAction();
        if (n3 == 0) {
            float f5 = object.getX();
            n3 = (int)f5;
            float f6 = object.getY();
            int n4 = (int)f6;
            int n7 = -5;
            if (n3 < n7 || n4 < n7 || n3 > (n7 = this.getWidth() + 5) || n4 > (n3 = this.getHeight() + 5)) {
                object = this.i;
                AppCompatDelegateImpl$m appCompatDelegateImpl$m = ((AppCompatDelegateImpl)object).P(0);
                n4 = 1;
                ((AppCompatDelegateImpl)object).G(appCompatDelegateImpl$m, n4 != 0);
                return n4 != 0;
            }
        }
        return super.onInterceptTouchEvent((MotionEvent)object);
    }

    public final void setBackgroundResource(int n3) {
        Drawable drawable2 = xn.a(this.getContext(), n3);
        this.setBackgroundDrawable(drawable2);
    }
}

