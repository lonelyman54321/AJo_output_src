/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$BoundedByteString;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.Utf8;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

class ByteString$LiteralByteString
extends ByteString$LeafByteString {
    private static final long serialVersionUID = 1L;
    protected final byte[] bytes;

    public ByteString$LiteralByteString(byte[] byArray) {
        byArray.getClass();
        this.bytes = byArray;
    }

    public final ByteBuffer asReadOnlyByteBuffer() {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        return ByteBuffer.wrap(byArray, n3, n4).asReadOnlyBuffer();
    }

    public final List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.asReadOnlyByteBuffer());
    }

    public byte byteAt(int n3) {
        return this.bytes[n3];
    }

    public final void copyTo(ByteBuffer byteBuffer) {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        byteBuffer.put(byArray, n3, n4);
    }

    public void copyToInternal(byte[] byArray, int n3, int n4, int n7) {
        System.arraycopy(this.bytes, n3, byArray, n4, n7);
    }

    public final boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof ByteString;
        if (n4 == 0) {
            return false;
        }
        n4 = this.size();
        Object object2 = object;
        object2 = (ByteString)object;
        int n7 = ((ByteString)object2).size();
        if (n4 != n7) {
            return false;
        }
        n4 = this.size();
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = object instanceof ByteString$LiteralByteString;
        if (n3 != 0) {
            object = (ByteString$LiteralByteString)object;
            n3 = this.peekCachedHashCode();
            n4 = ((ByteString)object).peekCachedHashCode();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.size();
            return this.equalsRange((ByteString)object, 0, n3);
        }
        return object.equals(this);
    }

    public final boolean equalsRange(ByteString object, int n3, int n4) {
        int n7 = ((ByteString)object).size();
        if (n4 <= n7) {
            n7 = n3 + n4;
            int n8 = ((ByteString)object).size();
            if (n7 <= n8) {
                n8 = object instanceof ByteString$LiteralByteString;
                Object var6_6 = null;
                if (n8 != 0) {
                    object = (ByteString$LiteralByteString)object;
                    byte[] byArray = this.bytes;
                    byte[] byArray2 = ((ByteString$LiteralByteString)object).bytes;
                    int n10 = this.getOffsetIntoBytes() + n4;
                    n4 = this.getOffsetIntoBytes();
                    int n14 = ((ByteString$LiteralByteString)object).getOffsetIntoBytes() + n3;
                    while (n4 < n10) {
                        n3 = byArray[n4];
                        byte by2 = byArray2[n14];
                        if (n3 != by2) {
                            return false;
                        }
                        ++n4;
                        ++n14;
                    }
                    return true;
                }
                object = ((ByteString)object).substring(n3, n7);
                ByteString byteString = this.substring(0, n4);
                return ((ByteString)object).equals(byteString);
            }
            String string2 = ", ";
            StringBuilder stringBuilder = fQ2.a("Ran off end of other: ", string2, string2, n3, n4);
            int n15 = ((ByteString)object).size();
            stringBuilder.append(n15);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        CharSequence charSequence = new StringBuilder("Length too large: ");
        charSequence.append(n4);
        n4 = this.size();
        charSequence.append(n4);
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public int getOffsetIntoBytes() {
        return 0;
    }

    public byte internalByteAt(int n3) {
        return this.bytes[n3];
    }

    public final boolean isValidUtf8() {
        int n3 = this.getOffsetIntoBytes();
        byte[] byArray = this.bytes;
        int n4 = this.size() + n3;
        return Utf8.isValidUtf8(byArray, n3, n4);
    }

    public final CodedInputStream newCodedInput() {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        return CodedInputStream.newInstance(byArray, n3, n4, true);
    }

    public final InputStream newInput() {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray, n3, n4);
        return byteArrayInputStream;
    }

    public final int partialHash(int n3, int n4, int n7) {
        byte[] byArray = this.bytes;
        int n8 = this.getOffsetIntoBytes() + n4;
        return Internal.partialHash(n3, byArray, n8, n7);
    }

    public final int partialIsValidUtf8(int n3, int n4, int n7) {
        int n8 = this.getOffsetIntoBytes() + n4;
        byte[] byArray = this.bytes;
        return Utf8.partialIsValidUtf8(n3, byArray, n8, n7 += n8);
    }

    public int size() {
        return this.bytes.length;
    }

    public final ByteString substring(int n3, int n4) {
        int n7 = this.size();
        if ((n4 = ByteString.checkRange(n3, n4, n7)) == 0) {
            return ByteString.EMPTY;
        }
        byte[] byArray = this.bytes;
        int n8 = this.getOffsetIntoBytes() + n3;
        ByteString$BoundedByteString byteString$BoundedByteString = new ByteString$BoundedByteString(byArray, n8, n4);
        return byteString$BoundedByteString;
    }

    public final String toStringInternal(Charset charset) {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public final void writeTo(ByteOutput byteOutput) {
        byte[] byArray = this.bytes;
        int n3 = this.getOffsetIntoBytes();
        int n4 = this.size();
        byteOutput.writeLazy(byArray, n3, n4);
    }

    public final void writeTo(OutputStream outputStream) {
        byte[] byArray = this.toByteArray();
        outputStream.write(byArray);
    }

    public final void writeToInternal(OutputStream outputStream, int n3, int n4) {
        byte[] byArray = this.bytes;
        int n7 = this.getOffsetIntoBytes() + n3;
        outputStream.write(byArray, n7, n4);
    }
}

