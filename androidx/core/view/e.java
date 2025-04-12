/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.core.view;

import android.view.View;
import androidx.core.view.ViewCompat$a;
import androidx.core.view.ViewCompat$g;

public final class e
extends ViewCompat$a {
    public final Object a(View view) {
        return ViewCompat$g.b(view);
    }

    public final void b(View view, Object object) {
        boolean bl2 = (Boolean)object;
        ViewCompat$g.d(view, bl2);
    }

    public final boolean e(Object object, Object object2) {
        boolean bl2;
        boolean bl3;
        object = (Boolean)object;
        object2 = (Boolean)object2;
        boolean bl4 = false;
        if (object != null && (bl3 = ((Boolean)object).booleanValue())) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        if (object2 != null && (bl2 = ((Boolean)object2).booleanValue())) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (bl3 == bl2) {
            bl4 = true;
        }
        return bl4 ^ true;
    }
}

