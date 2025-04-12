/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.view.ViewCompat$c;
import java.util.Comparator;

public final class CoordinatorLayout$g
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        float f5;
        object = (View)object;
        object2 = (View)object2;
        float f6 = ViewCompat$c.i((View)object);
        float f7 = f6 - (f5 = ViewCompat$c.i((View)object2));
        Object object3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object3 > 0) {
            n3 = -1;
            f6 = 0.0f / 0.0f;
        } else {
            n3 = (int)(f6 == f5 ? 0 : (f6 < f5 ? -1 : 1));
            if (n3 < 0) {
                n3 = 1;
                f6 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f6 = 0.0f;
                object = null;
            }
        }
        return n3;
    }
}

