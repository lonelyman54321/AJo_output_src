/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d;

public final class d$a
extends ur3 {
    public boolean a = false;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    public d$a(d d2, int n3) {
        this.c = d2;
        this.b = n3;
    }

    public final void a() {
        this.c.a.setVisibility(0);
    }

    public final void onAnimationCancel() {
        this.a = true;
    }

    public final void onAnimationEnd() {
        boolean bl2 = this.a;
        if (!bl2) {
            Toolbar toolbar = this.c.a;
            int n3 = this.b;
            toolbar.setVisibility(n3);
        }
    }
}

