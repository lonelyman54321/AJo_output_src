/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.view.MenuItem
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/*
 * Renamed from aO1
 */
public final class ao1_1 {
    public static void a(MenuItem menuItem, char c2, int n3) {
        menuItem.setAlphabeticShortcut(c2, n3);
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void c(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void d(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void e(MenuItem menuItem, char c2, int n3) {
        menuItem.setNumericShortcut(c2, n3);
    }

    public static void f(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}

