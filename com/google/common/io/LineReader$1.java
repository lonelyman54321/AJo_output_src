/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.LineBuffer;
import com.google.common.io.LineReader;

class LineReader$1
extends LineBuffer {
    final /* synthetic */ LineReader this$0;

    public LineReader$1(LineReader lineReader) {
        this.this$0 = lineReader;
    }

    public void handleLine(String string2, String string3) {
        LineReader.access$000(this.this$0).add(string2);
    }
}

