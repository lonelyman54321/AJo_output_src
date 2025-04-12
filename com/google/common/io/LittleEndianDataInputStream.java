/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class LittleEndianDataInputStream
extends FilterInputStream
implements DataInput {
    public LittleEndianDataInputStream(InputStream inputStream) {
        inputStream = (InputStream)Preconditions.checkNotNull(inputStream);
        super(inputStream);
    }

    private byte readAndCheckByte() {
        int n3 = -1;
        Object object = this.in;
        int n4 = ((InputStream)object).read();
        if (n3 != n4) {
            return (byte)n4;
        }
        object = new EOFException();
        throw object;
    }

    public boolean readBoolean() {
        int n3 = this.readUnsignedByte();
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public byte readByte() {
        return (byte)this.readUnsignedByte();
    }

    public char readChar() {
        return (char)this.readUnsignedShort();
    }

    public double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    public void readFully(byte[] byArray) {
        ByteStreams.readFully(this, byArray);
    }

    public void readFully(byte[] byArray, int n3, int n4) {
        ByteStreams.readFully(this, byArray, n3, n4);
    }

    public int readInt() {
        byte by2 = this.readAndCheckByte();
        byte by4 = this.readAndCheckByte();
        byte by5 = this.readAndCheckByte();
        return Ints.fromBytes(this.readAndCheckByte(), by5, by4, by2);
    }

    public String readLine() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("readLine is not supported");
        throw unsupportedOperationException;
    }

    public long readLong() {
        byte by2 = this.readAndCheckByte();
        byte by4 = this.readAndCheckByte();
        byte by5 = this.readAndCheckByte();
        byte by6 = this.readAndCheckByte();
        byte by7 = this.readAndCheckByte();
        byte by8 = this.readAndCheckByte();
        byte by9 = this.readAndCheckByte();
        return Longs.fromBytes(this.readAndCheckByte(), by9, by8, by7, by6, by5, by4, by2);
    }

    public short readShort() {
        return (short)this.readUnsignedShort();
    }

    public String readUTF() {
        InputStream inputStream = this.in;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        return dataInputStream.readUTF();
    }

    public int readUnsignedByte() {
        Object object = this.in;
        int n3 = ((InputStream)object).read();
        if (n3 >= 0) {
            return n3;
        }
        object = new EOFException();
        throw object;
    }

    public int readUnsignedShort() {
        byte by2 = this.readAndCheckByte();
        byte by4 = this.readAndCheckByte();
        return Ints.fromBytes((byte)0, (byte)0, by4, by2);
    }

    public int skipBytes(int n3) {
        InputStream inputStream = this.in;
        long l2 = n3;
        return (int)inputStream.skip(l2);
    }
}

