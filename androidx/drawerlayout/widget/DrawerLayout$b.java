/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 */
package androidx.drawerlayout.widget;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

public final class DrawerLayout$b
implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View object, WindowInsets windowInsets) {
        object = (DrawerLayout)((Object)object);
        int n3 = windowInsets.getSystemWindowInsetTop();
        n3 = n3 > 0 ? 1 : 0;
        ((DrawerLayout)((Object)object)).setChildInsets(windowInsets, n3 != 0);
        return windowInsets.consumeSystemWindowInsets();
    }
}

