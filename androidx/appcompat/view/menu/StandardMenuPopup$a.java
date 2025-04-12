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
import androidx.appcompat.view.menu.StandardMenuPopup;

public final class StandardMenuPopup$a
implements View.OnAttachStateChangeListener {
    public final /* synthetic */ StandardMenuPopup a;

    public StandardMenuPopup$a(StandardMenuPopup standardMenuPopup) {
        this.a = standardMenuPopup;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        StandardMenuPopup standardMenuPopup = this.a;
        ViewTreeObserver viewTreeObserver = standardMenuPopup.p;
        if (viewTreeObserver != null) {
            boolean bl2 = viewTreeObserver.isAlive();
            if (!bl2) {
                standardMenuPopup.p = viewTreeObserver = view.getViewTreeObserver();
            }
            viewTreeObserver = standardMenuPopup.p;
            standardMenuPopup = standardMenuPopup.j;
            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)standardMenuPopup);
        }
        view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }
}

