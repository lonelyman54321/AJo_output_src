/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;

class ScrollingTabContainerView$1
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ ScrollingTabContainerView b;

    public ScrollingTabContainerView$1(ScrollingTabContainerView scrollingTabContainerView, View view) {
        this.b = scrollingTabContainerView;
        this.a = view;
    }

    public final void run() {
        View view = this.a;
        int n3 = view.getLeft();
        ScrollingTabContainerView scrollingTabContainerView = this.b;
        int n4 = scrollingTabContainerView.getWidth();
        int n7 = view.getWidth();
        n4 = (n4 - n7) / 2;
        scrollingTabContainerView.smoothScrollTo(n3 -= n4, 0);
        scrollingTabContainerView.a = null;
    }
}

