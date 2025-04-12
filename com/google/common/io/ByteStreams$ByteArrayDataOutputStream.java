/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.io.ByteArrayDataOutput;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;

class ByteStreams$ByteArrayDataOutputStream
implements ByteArrayDataOutput {
    final ByteArrayOutputStream byteArrayOutputStream;
    final DataOutput output;

    public ByteStreams$ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
        this.byteArrayOutputStream = byteArrayOutputStream;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        this.output = dataOutputStream;
    }

    public byte[] toByteArray() {
        return this.byteArrayOutputStream.toByteArray();
    }

    public void write(int n3) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.write(n3);
    }

    public void write(byte[] byArray) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.write(byArray);
    }

    public void write(byte[] byArray, int n3, int n4) {
        DataOutput dataOutput;
        try {
            dataOutput = this.output;
        }
        catch (IOException iOException) {
            AssertionError assertionError = new AssertionError((Object)iOException);
            throw assertionError;
        }
        dataOutput.write(byArray, n3, n4);
    }

    public void writeBoolean(boolean bl2) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeBoolean(bl2);
    }

    public void writeByte(int n3) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeByte(n3);
    }

    public void writeBytes(String string2) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeBytes(string2);
    }

    public void writeChar(int n3) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeChar(n3);
    }

    public void writeChars(String string2) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeChars(string2);
    }

    public void writeDouble(double d2) {
        DataOutput dataOutput;
        try {
            dataOutput = this.output;
        }
        catch (IOException iOException) {
            AssertionError assertionError = new AssertionError((Object)iOException);
            throw assertionError;
        }
        dataOutput.writeDouble(d2);
    }

    public void writeFloat(float f5) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeFloat(f5);
    }

    public void writeInt(int n3) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeInt(n3);
    }

    public void writeLong(long l2) {
        DataOutput dataOutput;
        try {
            dataOutput = this.output;
        }
        catch (IOException iOException) {
            AssertionError assertionError = new AssertionError((Object)iOException);
            throw assertionError;
        }
        dataOutput.writeLong(l2);
    }

    public void writeShort(int n3) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeShort(n3);
    }

    public void writeUTF(String string2) {
        Object object;
        try {
            object = this.output;
        }
        catch (IOException iOException) {
            object = new AssertionError((Object)iOException);
            throw object;
        }
        object.writeUTF(string2);
    }
}

