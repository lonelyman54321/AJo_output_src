/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.graphics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class BlockGraphicsLayerElement
extends up1_0 {
    public final Function1 b;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.b = function1;
    }

    public final LP1$c b() {
        Function1 function1 = this.b;
        jy_1 jy_12 = new jy_1(function1);
        return jy_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BlockGraphicsLayerElement;
        if (!bl3) {
            return false;
        }
        object = (BlockGraphicsLayerElement)object;
        Function1 function1 = this.b;
        object = ((BlockGraphicsLayerElement)object).b;
        boolean bl4 = Intrinsics.areEqual(function1, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void j(LP1$c object) {
        object = (jy_1)object;
        Object object2 = this.b;
        ((jy_1)object).n = object2;
        int n3 = 2;
        object2 = go0.d((fo0)object, (int)n3).p;
        if (object2 != null) {
            object = ((jy_1)object).n;
            boolean bl2 = true;
            ((w32_0)object2).E1((Function1)object, bl2);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BlockGraphicsLayerElement(block=");
        Function1 function1 = this.b;
        stringBuilder.append(function1);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

