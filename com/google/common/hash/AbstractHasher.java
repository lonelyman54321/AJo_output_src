/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import com.google.common.hash.Hasher;
import com.google.common.hash.Java8Compatibility;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

abstract class AbstractHasher
implements Hasher {
    public final Hasher putBoolean(boolean bl2) {
        return this.putByte((byte)(bl2 ? 1 : 0));
    }

    public Hasher putBytes(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.hasArray();
        if (n3 != 0) {
            byte[] byArray = byteBuffer.array();
            int n4 = byteBuffer.arrayOffset();
            int n7 = byteBuffer.position() + n4;
            n4 = byteBuffer.remaining();
            this.putBytes(byArray, n7, n4);
            n3 = byteBuffer.limit();
            Java8Compatibility.position(byteBuffer, n3);
        } else {
            for (n3 = byteBuffer.remaining(); n3 > 0; n3 += -1) {
                byte by2 = byteBuffer.get();
                this.putByte(by2);
            }
        }
        return this;
    }

    public Hasher putBytes(byte[] byArray) {
        int n3 = byArray.length;
        return this.putBytes(byArray, 0, n3);
    }

    public Hasher putBytes(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        byte by2 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, by2);
        for (n7 = 0; n7 < n4; ++n7) {
            by2 = n3 + n7;
            by2 = byArray[by2];
            this.putByte(by2);
        }
        return this;
    }

    public Hasher putChar(char c2) {
        byte by2 = (byte)c2;
        this.putByte(by2);
        c2 = (char)(c2 >>> 8);
        this.putByte((byte)c2);
        return this;
    }

    public final Hasher putDouble(double d2) {
        long l2 = Double.doubleToRawLongBits(d2);
        return this.putLong(l2);
    }

    public final Hasher putFloat(float f5) {
        int n3 = Float.floatToRawIntBits(f5);
        return this.putInt(n3);
    }

    public Hasher putInt(int n3) {
        byte by2 = (byte)n3;
        this.putByte(by2);
        by2 = (byte)(n3 >>> 8);
        this.putByte(by2);
        by2 = (byte)(n3 >>> 16);
        this.putByte(by2);
        n3 = (byte)(n3 >>> 24);
        this.putByte((byte)n3);
        return this;
    }

    public Hasher putLong(long l2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = 64); i3 += 8) {
            long l3 = l2 >>> i3;
            int n4 = (int)l3;
            n3 = (byte)n4;
            this.putByte((byte)n3);
        }
        return this;
    }

    public Hasher putObject(Object object, Funnel funnel) {
        funnel.funnel(object, this);
        return this;
    }

    public Hasher putShort(short s7) {
        byte by2 = (byte)s7;
        this.putByte(by2);
        s7 = (byte)(s7 >>> 8);
        this.putByte((byte)s7);
        return this;
    }

    public Hasher putString(CharSequence object, Charset charset) {
        object = object.toString().getBytes(charset);
        return this.putBytes((byte[])object);
    }

    public Hasher putUnencodedChars(CharSequence charSequence) {
        int n3 = charSequence.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = charSequence.charAt(i3);
            this.putChar(c2);
        }
        return this;
    }
}

