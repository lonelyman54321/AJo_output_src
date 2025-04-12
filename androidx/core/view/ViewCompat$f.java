/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.view;

import android.view.View;

public final class ViewCompat$f {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int n3) {
        view.setImportantForAutofill(n3);
    }
}

