/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.StateSet
 */
package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$b;
import androidx.appcompat.graphics.drawable.b$a;

public class b
extends DrawableContainerCompat {
    public b$a n;
    public boolean o;

    public b(b$a object, Resources resources) {
        b$a b$a = new b$a((b$a)((Object)object), this, resources);
        this.e(b$a);
        object = this.getState();
        this.onStateChange((int[])object);
    }

    public final void applyTheme(Resources.Theme object) {
        super.applyTheme((Resources.Theme)object);
        object = this.getState();
        this.onStateChange((int[])object);
    }

    public void e(DrawableContainerCompat$b drawableContainerCompat$b) {
        Drawable drawable2;
        this.a = drawableContainerCompat$b;
        int n3 = this.g;
        if (n3 >= 0) {
            this.c = drawable2 = drawableContainerCompat$b.d(n3);
            if (drawable2 != null) {
                this.c(drawable2);
            }
        }
        drawable2 = null;
        this.d = null;
        n3 = drawableContainerCompat$b instanceof b$a;
        if (n3 != 0) {
            drawableContainerCompat$b = (b$a)drawableContainerCompat$b;
            this.n = drawableContainerCompat$b;
        }
    }

    public b$a f() {
        b$a b$a = this.n;
        b$a b$a2 = new b$a(b$a, this, null);
        return b$a2;
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        boolean bl2 = this.o;
        if (!bl2) {
            super.mutate();
            b$a b$a = this.n;
            b$a.e();
            this.o = bl2 = true;
        }
        return this;
    }

    public boolean onStateChange(int[] object) {
        boolean bl2 = super.onStateChange((int[])object);
        Object object2 = this.n;
        int n3 = object2.f((int[])object);
        if (n3 < 0) {
            object = (Object)this.n;
            object2 = StateSet.WILD_CARD;
            n3 = ((b$a)((Object)object)).f((int[])object2);
        }
        if (!(n3 = (int)(this.d(n3) ? 1 : 0)) && !bl2) {
            n3 = 0;
            object = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }
}

