/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

class ViewCompat$AccessibilityPaneVisibilityManager
implements ViewTreeObserver.OnGlobalLayoutListener,
View.OnAttachStateChangeListener {
    public final WeakHashMap a;

    public ViewCompat$AccessibilityPaneVisibilityManager() {
        WeakHashMap weakHashMap;
        this.a = weakHashMap = new WeakHashMap();
    }

    public final void onGlobalLayout() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 < n4) {
            Iterator iterator = this.a.entrySet().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                boolean bl2;
                Map.Entry entry = iterator.next();
                Object object = (View)entry.getKey();
                Boolean bl3 = (Boolean)entry.getValue();
                boolean bl4 = bl3;
                if (bl4 == (bl2 = (bl2 = object.isShown()) && !(bl2 = object.getWindowVisibility()))) continue;
                bl4 = bl2 ? 16 != 0 : 32 != 0;
                ViewCompat.k((int)(bl4 ? 1 : 0), object);
                object = bl2;
                entry.setValue((View)object);
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}

