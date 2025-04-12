/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.c$c;
import androidx.room.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class d
extends c$c {
    public final /* synthetic */ e b;

    public d(String[] stringArray, e e2) {
        this.b = e2;
        super(stringArray);
    }

    public final void a(Set object) {
        Intrinsics.checkNotNullParameter(object, "tables");
        object = xp_0.Q();
        M7 m7 = this.b.u;
        boolean bl2 = ((xp_0)object).R();
        if (bl2) {
            m7.run();
        } else {
            ((xp_0)object).S(m7);
        }
    }
}

