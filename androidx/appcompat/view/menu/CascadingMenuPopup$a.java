/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.view.menu.CascadingMenuPopup;

public final class CascadingMenuPopup$a
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ CascadingMenuPopup a;

    public CascadingMenuPopup$a(CascadingMenuPopup cascadingMenuPopup) {
        this.a = cascadingMenuPopup;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        CascadingMenuPopup cascadingMenuPopup = this.a;
        ViewTreeObserver viewTreeObserver = cascadingMenuPopup.y;
        if (viewTreeObserver != null) {
            boolean bl2 = viewTreeObserver.isAlive();
            if (!bl2) {
                cascadingMenuPopup.y = viewTreeObserver = view.getViewTreeObserver();
            }
            viewTreeObserver = cascadingMenuPopup.y;
            cascadingMenuPopup = cascadingMenuPopup.j;
            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)cascadingMenuPopup);
        }
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }
}

