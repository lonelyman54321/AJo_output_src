/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable
 */
package androidx.appcompat.graphics.drawable;

import android.graphics.drawable.Animatable;
import androidx.appcompat.graphics.drawable.a$f;

public final class a$a
extends a$f {
    public final Animatable a;

    public a$a(Animatable animatable) {
        this.a = animatable;
    }

    public final void c() {
        this.a.start();
    }

    public final void d() {
        this.a.stop();
    }
}

