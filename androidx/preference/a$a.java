/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Window
 *  android.view.WindowInsets$Type
 */
package androidx.preference;

import android.view.Window;
import android.view.WindowInsets;

public final class a$a {
    public static void a(Window window) {
        window = window.getDecorView().getWindowInsetsController();
        int n3 = WindowInsets.Type.ime();
        window.show(n3);
    }
}

