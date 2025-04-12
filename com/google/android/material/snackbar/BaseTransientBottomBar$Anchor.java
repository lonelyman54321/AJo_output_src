/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.google.android.material.snackbar;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

class BaseTransientBottomBar$Anchor
implements View.OnAttachStateChangeListener,
ViewTreeObserver.OnGlobalLayoutListener {
    private final WeakReference anchorView;
    private final WeakReference transientBottomBar;

    private BaseTransientBottomBar$Anchor(BaseTransientBottomBar weakReference, View view) {
        WeakReference<BaseTransientBottomBar> weakReference2;
        this.transientBottomBar = weakReference2 = new WeakReference<BaseTransientBottomBar>((BaseTransientBottomBar)((Object)weakReference));
        this.anchorView = weakReference = new WeakReference<View>(view);
    }

    public static BaseTransientBottomBar$Anchor anchor(BaseTransientBottomBar object, View view) {
        BaseTransientBottomBar$Anchor baseTransientBottomBar$Anchor = new BaseTransientBottomBar$Anchor((BaseTransientBottomBar)object, view);
        object = ViewCompat.a;
        boolean bl2 = view.isAttachedToWindow();
        if (bl2) {
            ViewUtils.addOnGlobalLayoutListener(view, baseTransientBottomBar$Anchor);
        }
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)baseTransientBottomBar$Anchor);
        return baseTransientBottomBar$Anchor;
    }

    private boolean unanchorIfNoTransientBottomBar() {
        Object t3 = this.transientBottomBar.get();
        if (t3 == null) {
            this.unanchor();
            return true;
        }
        return false;
    }

    public View getAnchorView() {
        return (View)this.anchorView.get();
    }

    public void onGlobalLayout() {
        BaseTransientBottomBar baseTransientBottomBar;
        boolean bl2 = this.unanchorIfNoTransientBottomBar();
        if (!bl2 && (bl2 = BaseTransientBottomBar.access$2100(baseTransientBottomBar = (BaseTransientBottomBar)this.transientBottomBar.get()))) {
            baseTransientBottomBar = (BaseTransientBottomBar)this.transientBottomBar.get();
            BaseTransientBottomBar.access$2200(baseTransientBottomBar);
        }
    }

    public void onViewAttachedToWindow(View view) {
        boolean bl2 = this.unanchorIfNoTransientBottomBar();
        if (bl2) {
            return;
        }
        ViewUtils.addOnGlobalLayoutListener(view, this);
    }

    public void onViewDetachedFromWindow(View view) {
        boolean bl2 = this.unanchorIfNoTransientBottomBar();
        if (bl2) {
            return;
        }
        ViewUtils.removeOnGlobalLayoutListener(view, (ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public void unanchor() {
        Object object = this.anchorView.get();
        if (object != null) {
            ((View)this.anchorView.get()).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            object = (View)this.anchorView.get();
            ViewUtils.removeOnGlobalLayoutListener(object, (ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        this.anchorView.clear();
        this.transientBottomBar.clear();
    }
}

