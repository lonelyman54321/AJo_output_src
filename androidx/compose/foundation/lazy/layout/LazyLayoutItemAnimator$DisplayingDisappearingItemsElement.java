/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$a;
import kotlin.jvm.internal.Intrinsics;

final class LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
extends up1_0 {
    public final LazyLayoutItemAnimator b;

    public LazyLayoutItemAnimator$DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        this.b = lazyLayoutItemAnimator;
    }

    public final LP1$c b() {
        LazyLayoutItemAnimator lazyLayoutItemAnimator;
        LazyLayoutItemAnimator$a lazyLayoutItemAnimator$a = new LP1$c();
        lazyLayoutItemAnimator$a.n = lazyLayoutItemAnimator = this.b;
        return lazyLayoutItemAnimator$a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;
        if (!bl3) {
            return false;
        }
        object = (LazyLayoutItemAnimator$DisplayingDisappearingItemsElement)object;
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.b;
        object = ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement)object).b;
        boolean bl4 = Intrinsics.areEqual(lazyLayoutItemAnimator, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        lP1$c = (LazyLayoutItemAnimator$a)lP1$c;
        Object object = ((LazyLayoutItemAnimator$a)lP1$c).n;
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.b;
        boolean bl2 = Intrinsics.areEqual(object, lazyLayoutItemAnimator);
        if (!bl2) {
            object = lP1$c.a;
            bl2 = ((LP1$c)object).m;
            if (bl2) {
                object = ((LazyLayoutItemAnimator$a)lP1$c).n;
                ((LazyLayoutItemAnimator)object).f();
                lazyLayoutItemAnimator.j = lP1$c;
                ((LazyLayoutItemAnimator$a)lP1$c).n = lazyLayoutItemAnimator;
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DisplayingDisappearingItemsElement(animator=");
        LazyLayoutItemAnimator lazyLayoutItemAnimator = this.b;
        stringBuilder.append(lazyLayoutItemAnimator);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

