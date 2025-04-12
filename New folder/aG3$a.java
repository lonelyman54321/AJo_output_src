/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
import android.view.View;
import android.view.Window;

public final class aG3$a {
    public static void a(Window window, boolean bl2) {
        View view = window.getDecorView();
        int n3 = view.getSystemUiVisibility();
        n3 = bl2 ? (n3 &= 0xFFFFFEFF) : (n3 |= 0x100);
        view.setSystemUiVisibility(n3);
        window.setDecorFitsSystemWindows(bl2);
    }
}

