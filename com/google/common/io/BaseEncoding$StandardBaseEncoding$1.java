/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.BaseEncoding$Alphabet;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.io.OutputStream;
import java.io.Writer;

class BaseEncoding$StandardBaseEncoding$1
extends OutputStream {
    int bitBuffer = 0;
    int bitBufferLength = 0;
    final /* synthetic */ BaseEncoding$StandardBaseEncoding this$0;
    final /* synthetic */ Writer val$out;
    int writtenChars = 0;

    public BaseEncoding$StandardBaseEncoding$1(BaseEncoding$StandardBaseEncoding standardBaseEncoding, Writer writer) {
        this.this$0 = standardBaseEncoding;
        this.val$out = writer;
    }

    public void close() {
        int n3 = this.bitBufferLength;
        if (n3 > 0) {
            int n4 = this.bitBuffer;
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.this$0.alphabet;
            int n7 = baseEncoding$Alphabet.bitsPerChar - n3;
            n3 = n4 << n7;
            n4 = baseEncoding$Alphabet.mask;
            n3 &= n4;
            Object object = this.val$out;
            n3 = baseEncoding$Alphabet.encode(n3);
            ((Writer)object).write(n3);
            this.writtenChars = n3 = this.writtenChars + 1;
            Object object2 = this.this$0.paddingChar;
            if (object2 != null) {
                while (true) {
                    n3 = this.writtenChars;
                    object = this.this$0;
                    baseEncoding$Alphabet = ((BaseEncoding$StandardBaseEncoding)object).alphabet;
                    int n8 = baseEncoding$Alphabet.charsPerChunk;
                    if ((n3 %= n8) == 0) break;
                    object2 = this.val$out;
                    object = ((BaseEncoding$StandardBaseEncoding)object).paddingChar;
                    n4 = ((Character)object).charValue();
                    ((Writer)object2).write(n4);
                    this.writtenChars = n3 = this.writtenChars + 1;
                }
            }
        }
        this.val$out.close();
    }

    public void flush() {
        this.val$out.flush();
    }

    public void write(int n3) {
        int n4 = this.bitBuffer << 8;
        this.bitBuffer = n3 = n3 & 0xFF | n4;
        this.bitBufferLength = n3 = this.bitBufferLength + 8;
        while (true) {
            n3 = this.bitBufferLength;
            BaseEncoding$Alphabet baseEncoding$Alphabet = this.this$0.alphabet;
            int n7 = baseEncoding$Alphabet.bitsPerChar;
            if (n3 < n7) break;
            int n8 = this.bitBuffer;
            n3 -= n7;
            n3 = n8 >> n3;
            n7 = baseEncoding$Alphabet.mask;
            n3 &= n7;
            Writer writer = this.val$out;
            n3 = baseEncoding$Alphabet.encode(n3);
            writer.write(n3);
            this.writtenChars = n3 = this.writtenChars + 1;
            n3 = this.bitBufferLength;
            baseEncoding$Alphabet = this.this$0.alphabet;
            n4 = baseEncoding$Alphabet.bitsPerChar;
            this.bitBufferLength = n3 -= n4;
        }
    }
}

