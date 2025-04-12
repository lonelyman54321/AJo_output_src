/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.app.h;
import androidx.appcompat.app.h$d;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;

public final class h$a
extends ur3 {
    public final /* synthetic */ h a;

    public h$a(h h3) {
        this.a = h3;
    }

    public final void onAnimationEnd() {
        P2$a p2$a;
        Object object;
        Object object2 = this.a;
        boolean bl2 = ((h)object2).o;
        if (bl2 && (object = ((h)object2).g) != null) {
            p2$a = null;
            object.setTranslationY(0.0f);
            object = ((h)object2).d;
            object.setTranslationY(0.0f);
        }
        ((h)object2).d.setVisibility(8);
        ((h)object2).d.setTransitioning(false);
        bl2 = false;
        object = null;
        ((h)object2).t = null;
        p2$a = ((h)object2).k;
        if (p2$a != null) {
            h$d h$d = ((h)object2).j;
            p2$a.b(h$d);
            ((h)object2).j = null;
            ((h)object2).k = null;
        }
        if ((object2 = ((h)object2).c) != null) {
            object = ViewCompat.a;
            ViewCompat$b.c((View)object2);
        }
    }
}

