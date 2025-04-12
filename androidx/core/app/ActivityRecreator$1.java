/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.app;

import androidx.core.app.c$a;

class ActivityRecreator$1
implements Runnable {
    public final /* synthetic */ c$a a;
    public final /* synthetic */ Object b;

    public ActivityRecreator$1(c$a a2, Object object) {
        this.a = a2;
        this.b = object;
    }

    public final void run() {
        Object object;
        c$a c$a = this.a;
        c$a.a = object = this.b;
    }
}

