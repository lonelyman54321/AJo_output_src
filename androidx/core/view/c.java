/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 */
package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat$a;
import androidx.core.view.ViewCompat$g;

public final class c
extends ViewCompat$a {
    public final Object a(View view) {
        return ViewCompat$g.a(view);
    }

    public final void b(View view, Object object) {
        object = (CharSequence)object;
        ViewCompat$g.e(view, (CharSequence)object);
    }

    public final boolean e(Object object, Object object2) {
        object = (CharSequence)object;
        object2 = (CharSequence)object2;
        return TextUtils.equals((CharSequence)object, (CharSequence)object2) ^ true;
    }
}

