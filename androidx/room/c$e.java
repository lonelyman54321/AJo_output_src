/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.c;
import androidx.room.c$c;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class c$e
extends c$c {
    public final c b;
    public final WeakReference c;

    public c$e(c weakReference, c$c c$c) {
        Intrinsics.checkNotNullParameter(weakReference, "tracker");
        Intrinsics.checkNotNullParameter(c$c, "delegate");
        String[] stringArray = c$c.a;
        super(stringArray);
        this.b = weakReference;
        this.c = weakReference = new WeakReference<c$c>(c$c);
    }

    public final void a(Set object) {
        Intrinsics.checkNotNullParameter(object, "tables");
        c$c c$c = (c$c)this.c.get();
        if (c$c == null) {
            object = this.b;
            ((c)object).d(this);
        } else {
            c$c.a((Set)object);
        }
    }
}

