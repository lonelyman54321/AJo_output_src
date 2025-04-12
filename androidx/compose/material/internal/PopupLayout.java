/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 *  android.view.MotionEvent
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.compose.material.internal;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import androidx.compose.material.internal.PopupLayout$a;
import androidx.compose.ui.platform.AbstractComposeView;

final class PopupLayout
extends AbstractComposeView
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final void a(b30_0 object, int n3) {
        object = object.g(-864350873);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x((Object)this) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        if ((n4 &= 3) == n7 && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
            object = ((j30_0)object).X();
            if (object != null) {
                PopupLayout$a popupLayout$a = new PopupLayout$a(this, n3);
                ((CF2)object).d = popupLayout$a;
            }
            return;
        }
        throw null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3;
        int n4 = keyEvent.getKeyCode();
        if (n4 == (n3 = 4)) {
            KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
            if (dispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            n4 = keyEvent.getAction();
            n3 = 1;
            if (!n4 && !(n4 = keyEvent.getRepeatCount())) {
                dispatcherState = this.getKeyDispatcherState();
                if (dispatcherState != null) {
                    dispatcherState.startTracking(keyEvent, (Object)this);
                }
                return n3 != 0;
            }
            n4 = keyEvent.getAction();
            if (n4 == n3 && (dispatcherState = this.getKeyDispatcherState()) != null && (n4 = dispatcherState.isTracking(keyEvent)) && !(n4 = keyEvent.isCanceled())) {
                return n3 != 0;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return false;
    }

    public final void onGlobalLayout() {
        throw null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        block6: {
            float f5;
            int n3;
            int n4;
            block5: {
                float f6;
                float f7;
                int n7;
                float f8;
                float f11;
                if (motionEvent == null) {
                    return super.onTouchEvent(motionEvent);
                }
                n4 = motionEvent.getAction();
                if (n4 != 0) break block5;
                float f12 = motionEvent.getX();
                n3 = 0;
                f5 = 0.0f;
                float f14 = f12 - 0.0f;
                n4 = (int)(f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1));
                if (n4 < 0 || (n4 = (int)((f11 = (f12 = motionEvent.getX()) - (f8 = (float)(n7 = this.getWidth()))) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1))) >= 0 || (n4 = (int)((f7 = (f12 = motionEvent.getY()) - 0.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1))) < 0 || (n4 = (int)((f6 = (f12 = motionEvent.getY()) - (f5 = (float)(n3 = this.getHeight()))) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) >= 0) break block6;
            }
            n4 = motionEvent.getAction();
            n3 = 4;
            f5 = 5.6E-45f;
            if (n4 != n3) {
                return super.onTouchEvent(motionEvent);
            }
        }
        throw null;
    }

    public final void setLayoutDirection(int n3) {
    }
}

