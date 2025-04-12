/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import kotlin.jvm.internal.Intrinsics;

final class LayoutIdElement
extends up1_0 {
    public final Object b;

    public LayoutIdElement(Object object) {
        this.b = object;
    }

    public final LP1$c b() {
        Object object;
        dp1_1 dp1_12 = new LP1$c();
        dp1_12.n = object = this.b;
        return dp1_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LayoutIdElement;
        if (!bl3) {
            return false;
        }
        object = (LayoutIdElement)object;
        Object object2 = this.b;
        object = ((LayoutIdElement)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        Object object;
        lP1$c = (dp1_1)lP1$c;
        ((dp1_1)lP1$c).n = object = this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LayoutIdElement(layoutId=");
        Object object = this.b;
        return gl1_0.a(stringBuilder, object, ')');
    }
}

