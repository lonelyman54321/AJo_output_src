/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;

final class TraversablePrefetchStateModifierElement
extends up1_0 {
    public final xs1 b;

    public TraversablePrefetchStateModifierElement(xs1 xs12) {
        this.b = xs12;
    }

    public final LP1$c b() {
        xs1 xs12 = this.b;
        as3 as32 = new as3(xs12);
        return as32;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TraversablePrefetchStateModifierElement;
        if (!bl3) {
            return false;
        }
        object = (TraversablePrefetchStateModifierElement)object;
        xs1 xs12 = this.b;
        object = ((TraversablePrefetchStateModifierElement)object).b;
        boolean bl4 = Intrinsics.areEqual(xs12, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        xs1 xs12;
        lP1$c = (as3)lP1$c;
        ((as3)lP1$c).n = xs12 = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TraversablePrefetchStateModifierElement(prefetchState=");
        xs1 xs12 = this.b;
        stringBuilder.append(xs12);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

