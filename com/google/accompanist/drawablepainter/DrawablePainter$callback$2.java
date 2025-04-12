/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.drawablepainter;

import com.google.accompanist.drawablepainter.DrawablePainter;
import com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class DrawablePainter$callback$2
extends Lambda
implements Function0 {
    final /* synthetic */ DrawablePainter this$0;

    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        this.this$0 = drawablePainter;
        super(0);
    }

    public final DrawablePainter$callback$2$1 invoke() {
        DrawablePainter drawablePainter = this.this$0;
        DrawablePainter$callback$2$1 drawablePainter$callback$2$1 = new DrawablePainter$callback$2$1(drawablePainter);
        return drawablePainter$callback$2$1;
    }
}

