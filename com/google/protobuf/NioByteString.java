/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteBufferWriter;
import com.google.protobuf.ByteOutput;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Internal;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.NioByteString$1;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.Utf8;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

final class NioByteString
extends ByteString$LeafByteString {
    private final ByteBuffer buffer;

    public NioByteString(ByteBuffer byteBuffer) {
        Internal.checkNotNull(byteBuffer, "buffer");
        byteBuffer = byteBuffer.slice();
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        this.buffer = byteBuffer = byteBuffer.order(byteOrder);
    }

    public static /* synthetic */ ByteBuffer access$000(NioByteString nioByteString) {
        return nioByteString.buffer;
    }

    private void readObject(ObjectInputStream object) {
        object = new InvalidObjectException("NioByteString instances are not to be serialized directly");
        throw object;
    }

    private ByteBuffer slice(int n3, int n4) {
        Object object = this.buffer;
        int n7 = ((Buffer)object).position();
        if (n3 >= n7 && n4 <= (n7 = ((Buffer)(object = this.buffer)).limit()) && n3 <= n4) {
            object = this.buffer.slice();
            int n8 = this.buffer.position();
            Java8Compatibility.position((Buffer)object, n3 -= n8);
            n3 = this.buffer.position();
            Java8Compatibility.limit((Buffer)object, n4 -= n3);
            return object;
        }
        Object object2 = n3;
        Integer n10 = n4;
        Object[] objectArray = new Object[]{object2, n10};
        object2 = String.format("Invalid indices [%d, %d]", objectArray);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private Object writeReplace() {
        return ByteString.copyFrom(this.buffer.slice());
    }

    public ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    public List asReadOnlyByteBufferList() {
        return Collections.singletonList(this.asReadOnlyByteBuffer());
    }

    public byte byteAt(int n3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
        block5: {
            Object object = this.buffer;
            try {
                return ((ByteBuffer)object).get(n3);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                break block5;
            }
            String string2 = indexOutOfBoundsException.getMessage();
            object = new ArrayIndexOutOfBoundsException(string2);
            throw object;
        }
        throw arrayIndexOutOfBoundsException2;
    }

    public void copyTo(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.buffer.slice();
        byteBuffer.put(byteBuffer2);
    }

    public void copyToInternal(byte[] byArray, int n3, int n4, int n7) {
        ByteBuffer byteBuffer = this.buffer.slice();
        Java8Compatibility.position(byteBuffer, n3);
        byteBuffer.get(byArray, n4, n7);
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof ByteString;
        int n4 = 0;
        if (!bl3) {
            return false;
        }
        Object object2 = object;
        object2 = (ByteString)object;
        int n7 = this.size();
        if (n7 != (n3 = ((ByteString)object2).size())) {
            return false;
        }
        n4 = this.size();
        if (n4 == 0) {
            return bl2;
        }
        bl2 = object instanceof NioByteString;
        if (bl2) {
            ByteBuffer byteBuffer = this.buffer;
            object = ((NioByteString)object).buffer;
            return byteBuffer.equals(object);
        }
        bl2 = object instanceof RopeByteString;
        if (bl2) {
            return object.equals(this);
        }
        object = this.buffer;
        ByteBuffer byteBuffer = ((ByteString)object2).asReadOnlyByteBuffer();
        return ((ByteBuffer)object).equals(byteBuffer);
    }

    public boolean equalsRange(ByteString byteString, int n3, int n4) {
        ByteString byteString2 = this.substring(0, n4);
        byteString = byteString.substring(n3, n4 += n3);
        return byteString2.equals(byteString);
    }

    public byte internalByteAt(int n3) {
        return this.byteAt(n3);
    }

    public boolean isValidUtf8() {
        return Utf8.isValidUtf8(this.buffer);
    }

    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(this.buffer, true);
    }

    public InputStream newInput() {
        NioByteString$1 nioByteString$1 = new NioByteString$1(this);
        return nioByteString$1;
    }

    public int partialHash(int n3, int n4, int n7) {
        int n8;
        for (int i3 = n4; i3 < (n8 = n4 + n7); ++i3) {
            n3 *= 31;
            ByteBuffer byteBuffer = this.buffer;
            n8 = byteBuffer.get(i3);
            n3 += n8;
        }
        return n3;
    }

    public int partialIsValidUtf8(int n3, int n4, int n7) {
        ByteBuffer byteBuffer = this.buffer;
        return Utf8.partialIsValidUtf8(n3, byteBuffer, n4, n7 += n4);
    }

    public int size() {
        return this.buffer.remaining();
    }

    public ByteString substring(int n3, int n4) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
        block6: {
            Serializable serializable;
            ByteBuffer byteBuffer = this.slice(n3, n4);
            try {
                serializable = new NioByteString(byteBuffer);
                return serializable;
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                break block6;
            }
            String string2 = indexOutOfBoundsException.getMessage();
            serializable = new ArrayIndexOutOfBoundsException(string2);
            throw serializable;
        }
        throw arrayIndexOutOfBoundsException2;
    }

    public String toStringInternal(Charset charset) {
        int n3;
        int n4;
        Object object = this.buffer;
        boolean bl2 = ((ByteBuffer)object).hasArray();
        if (bl2) {
            object = this.buffer.array();
            n4 = this.buffer.arrayOffset();
            ByteBuffer byteBuffer = this.buffer;
            n3 = byteBuffer.position() + n4;
            ByteBuffer byteBuffer2 = this.buffer;
            n4 = byteBuffer2.remaining();
        } else {
            object = this.toByteArray();
            n4 = ((Object)object).length;
            n3 = 0;
            Object var5_6 = null;
        }
        String string2 = new String((byte[])object, n3, n4, charset);
        return string2;
    }

    public void writeTo(ByteOutput byteOutput) {
        ByteBuffer byteBuffer = this.buffer.slice();
        byteOutput.writeLazy(byteBuffer);
    }

    public void writeTo(OutputStream outputStream) {
        byte[] byArray = this.toByteArray();
        outputStream.write(byArray);
    }

    public void writeToInternal(OutputStream outputStream, int n3, int n4) {
        ByteBuffer byteBuffer = this.buffer;
        int n7 = byteBuffer.hasArray();
        if (n7 != 0) {
            n7 = this.buffer.arrayOffset();
            int n8 = this.buffer.position() + n7 + n3;
            byte[] byArray = this.buffer.array();
            outputStream.write(byArray, n8, n4);
            return;
        }
        ByteBufferWriter.write(this.slice(n3, n4 += n3), outputStream);
    }
}

