/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.insets;

import com.google.accompanist.insets.Insets;
import com.google.accompanist.insets.MutableInsets;
import kotlin.jvm.internal.Intrinsics;

public final class InsetsKt {
    public static final Insets coerceEachDimensionAtLeast(Insets insets, Insets insets2) {
        Intrinsics.checkNotNullParameter(insets, "<this>");
        Object object = "minimumValue";
        Intrinsics.checkNotNullParameter(insets2, (String)object);
        int n3 = insets.getLeft();
        int n4 = insets2.getLeft();
        if (n3 >= n4 && (n3 = insets.getTop()) >= (n4 = insets2.getTop()) && (n3 = insets.getRight()) >= (n4 = insets2.getRight()) && (n3 = insets.getBottom()) >= (n4 = insets2.getBottom())) {
            object = insets;
        } else {
            n3 = 0;
            object = null;
        }
        if (object == null) {
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            n4 = insets.getLeft();
            if (n4 < (n15 = insets2.getLeft())) {
                n4 = n15;
            }
            if ((n15 = insets.getTop()) < (n14 = insets2.getTop())) {
                n15 = n14;
            }
            if ((n14 = insets.getRight()) < (n10 = insets2.getRight())) {
                n14 = n10;
            }
            if ((n8 = insets.getBottom()) < (n7 = insets2.getBottom())) {
                n8 = n7;
            }
            object = new MutableInsets(n4, n15, n14, n8);
        }
        return object;
    }

    public static final void updateFrom(MutableInsets mutableInsets, ei1 ei12) {
        Intrinsics.checkNotNullParameter(mutableInsets, "<this>");
        Intrinsics.checkNotNullParameter(ei12, "insets");
        int n3 = ei12.a;
        mutableInsets.setLeft(n3);
        n3 = ei12.b;
        mutableInsets.setTop(n3);
        n3 = ei12.c;
        mutableInsets.setRight(n3);
        int n4 = ei12.d;
        mutableInsets.setBottom(n4);
    }
}

