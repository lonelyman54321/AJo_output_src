/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class LittleEndianDataOutputStream
extends FilterOutputStream
implements DataOutput {
    public LittleEndianDataOutputStream(OutputStream outputStream) {
        outputStream = (OutputStream)Preconditions.checkNotNull(outputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        super(dataOutputStream);
    }

    public void close() {
        this.out.close();
    }

    public void write(byte[] byArray, int n3, int n4) {
        this.out.write(byArray, n3, n4);
    }

    public void writeBoolean(boolean bl2) {
        ((DataOutputStream)this.out).writeBoolean(bl2);
    }

    public void writeByte(int n3) {
        ((DataOutputStream)this.out).writeByte(n3);
    }

    public void writeBytes(String string2) {
        ((DataOutputStream)this.out).writeBytes(string2);
    }

    public void writeChar(int n3) {
        this.writeShort(n3);
    }

    public void writeChars(String string2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            n3 = string2.charAt(i3);
            this.writeChar(n3);
        }
    }

    public void writeDouble(double d2) {
        long l2 = Double.doubleToLongBits(d2);
        this.writeLong(l2);
    }

    public void writeFloat(float f5) {
        int n3 = Float.floatToIntBits(f5);
        this.writeInt(n3);
    }

    public void writeInt(int n3) {
        OutputStream outputStream = this.out;
        int n4 = n3 & 0xFF;
        outputStream.write(n4);
        outputStream = this.out;
        n4 = n3 >> 8 & 0xFF;
        outputStream.write(n4);
        outputStream = this.out;
        n4 = n3 >> 16 & 0xFF;
        outputStream.write(n4);
        outputStream = this.out;
        n3 = n3 >> 24 & 0xFF;
        outputStream.write(n3);
    }

    public void writeLong(long l2) {
        byte[] byArray = Longs.toByteArray(Long.reverseBytes(l2));
        int n3 = byArray.length;
        this.write(byArray, 0, n3);
    }

    public void writeShort(int n3) {
        OutputStream outputStream = this.out;
        int n4 = n3 & 0xFF;
        outputStream.write(n4);
        outputStream = this.out;
        n3 = n3 >> 8 & 0xFF;
        outputStream.write(n3);
    }

    public void writeUTF(String string2) {
        ((DataOutputStream)this.out).writeUTF(string2);
    }
}

