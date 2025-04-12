/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.drawablepainter;

import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class EmptyPainter
extends im2 {
    public static final EmptyPainter INSTANCE;

    static {
        EmptyPainter emptyPainter;
        INSTANCE = emptyPainter = new EmptyPainter();
    }

    private EmptyPainter() {
    }

    public long getIntrinsicSize-NH-jbRc() {
        return 9205357640488583168L;
    }

    public void onDraw(Kt0 kt0) {
        Intrinsics.checkNotNullParameter(kt0, "<this>");
    }
}

