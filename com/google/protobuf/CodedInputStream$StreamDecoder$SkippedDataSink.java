/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.CodedInputStream$StreamDecoder;
import com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

class CodedInputStream$StreamDecoder$SkippedDataSink
implements CodedInputStream$StreamDecoder$RefillCallback {
    private ByteArrayOutputStream byteArrayStream;
    private int lastPos;
    final /* synthetic */ CodedInputStream$StreamDecoder this$0;

    private CodedInputStream$StreamDecoder$SkippedDataSink(CodedInputStream$StreamDecoder codedInputStream$StreamDecoder) {
        int n3;
        this.this$0 = codedInputStream$StreamDecoder;
        this.lastPos = n3 = CodedInputStream$StreamDecoder.access$500(codedInputStream$StreamDecoder);
    }

    public ByteBuffer getSkippedData() {
        Object object = this.byteArrayStream;
        if (object == null) {
            object = CodedInputStream$StreamDecoder.access$600(this.this$0);
            int n3 = this.lastPos;
            int n4 = CodedInputStream$StreamDecoder.access$500(this.this$0);
            int n7 = this.lastPos;
            return ByteBuffer.wrap((byte[])object, n3, n4 -= n7);
        }
        byte[] byArray = CodedInputStream$StreamDecoder.access$600(this.this$0);
        int n8 = this.lastPos;
        int n10 = CodedInputStream$StreamDecoder.access$500(this.this$0);
        ((ByteArrayOutputStream)object).write(byArray, n8, n10);
        return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
    }

    public void onRefill() {
        ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
        if (byteArrayOutputStream == null) {
            this.byteArrayStream = byteArrayOutputStream = new ByteArrayOutputStream();
        }
        byteArrayOutputStream = this.byteArrayStream;
        byte[] byArray = CodedInputStream$StreamDecoder.access$600(this.this$0);
        int n3 = this.lastPos;
        int n4 = CodedInputStream$StreamDecoder.access$500(this.this$0);
        int n7 = this.lastPos;
        byteArrayOutputStream.write(byArray, n3, n4 -= n7);
        this.lastPos = 0;
    }
}

