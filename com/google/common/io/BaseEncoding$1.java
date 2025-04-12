/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.BaseEncoding;
import com.google.common.io.ByteSink;
import com.google.common.io.CharSink;
import java.io.OutputStream;
import java.io.Writer;

class BaseEncoding$1
extends ByteSink {
    final /* synthetic */ BaseEncoding this$0;
    final /* synthetic */ CharSink val$encodedSink;

    public BaseEncoding$1(BaseEncoding baseEncoding, CharSink charSink) {
        this.this$0 = baseEncoding;
        this.val$encodedSink = charSink;
    }

    public OutputStream openStream() {
        BaseEncoding baseEncoding = this.this$0;
        Writer writer = this.val$encodedSink.openStream();
        return baseEncoding.encodingStream(writer);
    }
}

