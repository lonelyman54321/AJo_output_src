/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.WindowInsetsController
 */
package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsController;

public final class ViewCompat$i {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    public static UG3 b(View view) {
        UG3 uG3 = (view = view.getWindowInsetsController()) != null ? new UG3((WindowInsetsController)view) : null;
        return uG3;
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}

