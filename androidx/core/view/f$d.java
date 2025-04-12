/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Insets
 *  android.view.WindowInsets$Builder
 */
package androidx.core.view;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$c;
import androidx.core.view.f$l;

public final class f$d
extends f$c {
    public f$d() {
    }

    public f$d(f f5) {
        super(f5);
    }

    public void c(int n3, ei1 ei12) {
        WindowInsets.Builder builder = this.c;
        n3 = f$l.a(n3);
        ei12 = ei12.d();
        EG3.a(builder, n3, (Insets)ei12);
    }
}

