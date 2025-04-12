/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.a$a;
import androidx.appcompat.widget.Toolbar;

public final class a$b
implements a$a {
    public final Toolbar a;
    public final Drawable b;
    public final CharSequence c;

    public a$b(Toolbar object) {
        Drawable drawable2;
        this.a = object;
        this.b = drawable2 = ((Toolbar)object).getNavigationIcon();
        this.c = object = ((Toolbar)object).getNavigationContentDescription();
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final boolean b() {
        return true;
    }

    public final void c(Drawable drawable2, int n3) {
        this.a.setNavigationIcon(drawable2);
        this.e(n3);
    }

    public final Drawable d() {
        return this.b;
    }

    public final void e(int n3) {
        Toolbar toolbar = this.a;
        if (n3 == 0) {
            CharSequence charSequence = this.c;
            toolbar.setNavigationContentDescription(charSequence);
        } else {
            toolbar.setNavigationContentDescription(n3);
        }
    }
}

