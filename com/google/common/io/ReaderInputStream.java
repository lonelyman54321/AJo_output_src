/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.Java8Compatibility;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

final class ReaderInputStream
extends InputStream {
    private ByteBuffer byteBuffer;
    private CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final CharsetEncoder encoder;
    private boolean endOfInput;
    private final Reader reader;
    private final byte[] singleByte;

    public ReaderInputStream(Reader reader, Charset object, int n3) {
        object = ((Charset)object).newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        object = ((CharsetEncoder)object).onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this(reader, (CharsetEncoder)object, n3);
    }

    public ReaderInputStream(Reader object, CharsetEncoder charsetEncoder, int n3) {
        boolean bl2 = true;
        byte[] byArray = new byte[bl2];
        this.singleByte = byArray;
        object = (Reader)Preconditions.checkNotNull(object);
        this.reader = object;
        this.encoder = object = (CharsetEncoder)Preconditions.checkNotNull(charsetEncoder);
        if (n3 <= 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2, "bufferSize must be positive: %s", n3);
        charsetEncoder.reset();
        this.charBuffer = object = CharBuffer.allocate(n3);
        Java8Compatibility.flip((Buffer)object);
        this.byteBuffer = object = ByteBuffer.allocate(n3);
    }

    private static int availableCapacity(Buffer buffer) {
        int n3 = buffer.capacity();
        int n4 = buffer.limit();
        return n3 - n4;
    }

    private int drain(byte[] byArray, int n3, int n4) {
        int n7 = this.byteBuffer.remaining();
        n4 = Math.min(n4, n7);
        this.byteBuffer.get(byArray, n3, n4);
        return n4;
    }

    private static CharBuffer grow(CharBuffer charBuffer) {
        Object object = charBuffer.array();
        int n3 = charBuffer.capacity() * 2;
        object = CharBuffer.wrap(Arrays.copyOf(object, n3));
        n3 = charBuffer.position();
        Java8Compatibility.position((Buffer)object, n3);
        int n4 = charBuffer.limit();
        Java8Compatibility.limit((Buffer)object, n4);
        return object;
    }

    private void readMoreChars() {
        int n3;
        CharBuffer charBuffer;
        int n4;
        CharBuffer charBuffer2 = this.charBuffer;
        int n7 = ReaderInputStream.availableCapacity(charBuffer2);
        if (n7 == 0) {
            charBuffer2 = this.charBuffer;
            n7 = charBuffer2.position();
            if (n7 > 0) {
                charBuffer2 = this.charBuffer.compact();
                Java8Compatibility.flip(charBuffer2);
            } else {
                this.charBuffer = charBuffer2 = ReaderInputStream.grow(this.charBuffer);
            }
        }
        charBuffer2 = this.charBuffer;
        n7 = charBuffer2.limit();
        Reader reader = this.reader;
        Object object = this.charBuffer.array();
        int n8 = reader.read((char[])object, n7, n4 = ReaderInputStream.availableCapacity(charBuffer = this.charBuffer));
        if (n8 == (n3 = -1)) {
            n7 = 1;
            this.endOfInput = n7;
        } else {
            object = this.charBuffer;
            Java8Compatibility.limit((Buffer)object, n7 += n8);
        }
    }

    private void startDraining(boolean bl2) {
        ByteBuffer byteBuffer;
        int n3;
        ByteBuffer byteBuffer2 = this.byteBuffer;
        Java8Compatibility.flip(byteBuffer2);
        if (bl2 && (n3 = (byteBuffer = this.byteBuffer).remaining()) == 0) {
            int n4 = this.byteBuffer.capacity() * 2;
            this.byteBuffer = byteBuffer = ByteBuffer.allocate(n4);
        } else {
            boolean bl3;
            this.draining = bl3 = true;
        }
    }

    public void close() {
        this.reader.close();
    }

    public int read() {
        int n3;
        byte[] byArray = this.singleByte;
        int n4 = this.read(byArray);
        if (n4 == (n3 = 1)) {
            byArray = this.singleByte;
            n3 = 0;
            n4 = UnsignedBytes.toInt(byArray[0]);
        } else {
            n4 = -1;
        }
        return n4;
    }

    public int read(byte[] byArray, int n3, int n4) {
        Object object;
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        n7 = 0;
        if (n4 == 0) {
            return 0;
        }
        n8 = (int)(this.endOfInput ? 1 : 0);
        int n10 = 0;
        block0: while (true) {
            int n14;
            int n15;
            if ((n15 = this.draining) != 0) {
                n15 = n3 + n10;
                if ((n10 += (n15 = this.drain(byArray, n15, n14 = n4 - n10))) != n4 && (n15 = (int)(this.doneFlushing ? 1 : 0)) == 0) {
                    this.draining = false;
                    object = this.byteBuffer;
                    Java8Compatibility.clear((Buffer)object);
                } else {
                    if (n10 <= 0) {
                        n10 = -1;
                    }
                    return n10;
                }
            }
            while (true) {
                Buffer buffer;
                if ((n15 = this.doneFlushing) != 0) {
                    object = CoderResult.UNDERFLOW;
                } else if (n8 != 0) {
                    object = this.encoder;
                    buffer = this.byteBuffer;
                    object = ((CharsetEncoder)object).flush((ByteBuffer)buffer);
                } else {
                    object = this.encoder;
                    buffer = this.charBuffer;
                    ByteBuffer byteBuffer = this.byteBuffer;
                    boolean bl2 = this.endOfInput;
                    object = ((CharsetEncoder)object).encode((CharBuffer)buffer, byteBuffer, bl2);
                }
                n14 = (int)(((CoderResult)object).isOverflow() ? 1 : 0);
                boolean bl3 = true;
                if (n14 != 0) {
                    this.startDraining(bl3);
                    continue block0;
                }
                n14 = (int)(((CoderResult)object).isUnderflow() ? 1 : 0);
                if (n14 != 0) {
                    if (n8 != 0) {
                        this.doneFlushing = bl3;
                        this.startDraining(false);
                        continue block0;
                    }
                    n15 = (int)(this.endOfInput ? 1 : 0);
                    if (n15 != 0) {
                        n8 = 1;
                        continue;
                    }
                    this.readMoreChars();
                    continue;
                }
                n14 = (int)(((CoderResult)object).isError() ? 1 : 0);
                if (n14 != 0) break block0;
            }
            break;
        }
        ((CoderResult)object).throwException();
        return 0;
    }
}

