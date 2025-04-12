/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.view;

import android.view.View;

public final class ViewCompat$g {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, boolean bl2) {
        view.setAccessibilityHeading(bl2);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void f(View view, boolean bl2) {
        view.setScreenReaderFocusable(bl2);
    }
}

