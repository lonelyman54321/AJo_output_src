/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.drawerlayout.widget;

import android.view.View;
import androidx.core.view.a;
import androidx.drawerlayout.widget.DrawerLayout;

public final class DrawerLayout$d
extends a {
    public final void onInitializeAccessibilityNodeInfo(View view, C2 c2) {
        super.onInitializeAccessibilityNodeInfo(view, c2);
        int n3 = DrawerLayout.includeChildForAccessibility(view);
        if (n3 == 0) {
            c2.b = n3 = -1;
            view = c2.a;
            c2 = null;
            view.setParent(null);
        }
    }
}

