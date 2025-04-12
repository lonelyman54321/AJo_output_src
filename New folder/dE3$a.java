/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 */
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

public final class dE3$a {
    public static void a(View view, Rect rect, Rect rect2) {
        WindowInsets.Builder builder = new WindowInsets.Builder();
        Insets insets = Insets.of((Rect)rect);
        builder = builder.setSystemWindowInsets(insets).build();
        view = view.computeSystemWindowInsets((WindowInsets)builder, rect2).getSystemWindowInsets();
        int n3 = view.left;
        int n4 = view.top;
        int n7 = view.right;
        int n8 = view.bottom;
        rect.set(n3, n4, n7, n8);
    }
}

