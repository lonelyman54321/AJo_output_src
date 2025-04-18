/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.ByteArrayDataInput;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

class ByteStreams$ByteArrayDataInputStream
implements ByteArrayDataInput {
    final DataInput input;

    public ByteStreams$ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        this.input = dataInputStream;
    }

    public boolean readBoolean() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readBoolean();
    }

    public byte readByte() {
        EOFException eOFException2;
        block5: {
            DataInput dataInput = this.input;
            try {
                return dataInput.readByte();
            }
            catch (IOException iOException) {
            }
            catch (EOFException eOFException2) {
                break block5;
            }
            AssertionError assertionError = new AssertionError((Object)iOException);
            throw assertionError;
        }
        IllegalStateException illegalStateException = new IllegalStateException(eOFException2);
        throw illegalStateException;
    }

    public char readChar() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readChar();
    }

    public double readDouble() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readDouble();
    }

    public float readFloat() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readFloat();
    }

    public void readFully(byte[] byArray) {
        Object object;
        try {
            object = this.input;
        }
        catch (IOException iOException) {
            object = new IllegalStateException(iOException);
            throw object;
        }
        object.readFully(byArray);
    }

    public void readFully(byte[] byArray, int n3, int n4) {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        dataInput.readFully(byArray, n3, n4);
    }

    public int readInt() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readInt();
    }

    public String readLine() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readLine();
    }

    public long readLong() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readLong();
    }

    public short readShort() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readShort();
    }

    public String readUTF() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readUTF();
    }

    public int readUnsignedByte() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readUnsignedByte();
    }

    public int readUnsignedShort() {
        DataInput dataInput;
        try {
            dataInput = this.input;
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return dataInput.readUnsignedShort();
    }

    public int skipBytes(int n3) {
        Object object;
        try {
            object = this.input;
        }
        catch (IOException iOException) {
            object = new IllegalStateException(iOException);
            throw object;
        }
        return object.skipBytes(n3);
    }
}

