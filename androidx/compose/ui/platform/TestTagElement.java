/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;

final class TestTagElement
extends up1_0 {
    public final String b;

    public TestTagElement(String string2) {
        this.b = string2;
    }

    public final LP1$c b() {
        String string2;
        Aj3 aj3 = new LP1$c();
        aj3.n = string2 = this.b;
        return aj3;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof TestTagElement;
        if (!bl2) {
            return false;
        }
        object = ((TestTagElement)object).b;
        return Intrinsics.areEqual(this.b, object);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c lP1$c) {
        String string2;
        lP1$c = (Aj3)lP1$c;
        ((Aj3)lP1$c).n = string2 = this.b;
    }
}

