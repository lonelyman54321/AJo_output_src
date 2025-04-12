/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.layout;

import androidx.compose.ui.layout.LayoutIdElement;

public final class a {
    public static final Object a(xk1_0 object) {
        object = object.B();
        boolean bl2 = object instanceof Ep1;
        Object object2 = null;
        object = bl2 ? (Ep1)object : null;
        if (object != null) {
            object2 = object.r0();
        }
        return object2;
    }

    public static final LP1 b(Object object) {
        LayoutIdElement layoutIdElement = new LayoutIdElement(object);
        return layoutIdElement;
    }
}

