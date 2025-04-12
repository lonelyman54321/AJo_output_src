/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 */
package androidx.dynamicanimation.animation;

import android.view.Choreographer;
import androidx.dynamicanimation.animation.a$a;
import androidx.dynamicanimation.animation.a$c;
import androidx.dynamicanimation.animation.a$d$a;

public final class a$d
extends a$c {
    public final Choreographer b;
    public final a$d$a c;

    public a$d(a$a object) {
        super((a$a)object);
        object = Choreographer.getInstance();
        this.b = object;
        this.c = object = new a$d$a(this);
    }
}

