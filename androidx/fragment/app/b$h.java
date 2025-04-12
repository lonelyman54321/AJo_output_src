/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.transition.Transition
 */
package androidx.fragment.app;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b$f;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import kotlin.jvm.internal.Intrinsics;

public final class b$h
extends b$f {
    public final Object b;
    public final boolean c;
    public final Object d;

    public b$h(n$c object, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(object, "operation");
        super((n$c)object);
        Object object2 = object.a;
        n$c$b n$c$b = n$c$b.VISIBLE;
        Fragment fragment = object.c;
        object2 = object2 == n$c$b ? (bl2 ? fragment.getReenterTransition() : fragment.getEnterTransition()) : (bl2 ? fragment.getReturnTransition() : fragment.getExitTransition());
        this.b = object2;
        object = object.a;
        boolean bl4 = object == n$c$b ? (bl2 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap()) : true;
        this.c = bl4;
        if (bl3) {
            object = bl2 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition();
        } else {
            bl4 = false;
            object = null;
        }
        this.d = object;
    }

    public final GW0 b() {
        Object object = this.b;
        Object object2 = this.c(object);
        Object object3 = this.d;
        Object object4 = this.c(object3);
        if (object2 != null && object4 != null && object2 != object4) {
            object2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            object4 = this.a.c;
            ((StringBuilder)object2).append(object4);
            ((StringBuilder)object2).append(" returned Transition ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" which uses a different Transition  type than its shared element transition ");
            ((StringBuilder)object2).append(object3);
            object = ((StringBuilder)object2).toString();
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        if (object2 == null) {
            object2 = object4;
        }
        return object2;
    }

    public final GW0 c(Object object) {
        boolean bl2;
        if (object == null) {
            return null;
        }
        Object object2 = CW0.a;
        if (object2 != null && (bl2 = object instanceof Transition)) {
            return object2;
        }
        object2 = CW0.b;
        if (object2 != null && (bl2 = ((GW0)object2).g(object))) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Transition ");
        stringBuilder.append(object);
        stringBuilder.append(" for fragment ");
        object = this.a.c;
        stringBuilder.append(object);
        stringBuilder.append(" is not a valid framework Transition or AndroidX Transition");
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

