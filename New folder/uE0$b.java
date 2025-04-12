/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class uE0$b
extends InputStream
implements DataInput {
    public final DataInputStream a;
    public int b;
    public ByteOrder c;
    public byte[] d;
    public final int e;

    public uE0$b(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(inputStream, byteOrder);
    }

    public uE0$b(InputStream inputStream, ByteOrder byteOrder) {
        int n3;
        DataInputStream dataInputStream;
        this.a = dataInputStream = new DataInputStream(inputStream);
        ((InputStream)dataInputStream).mark(0);
        this.b = 0;
        this.c = byteOrder;
        boolean bl2 = inputStream instanceof uE0$b;
        if (bl2) {
            inputStream = (uE0$b)inputStream;
            n3 = ((uE0$b)inputStream).e;
        } else {
            n3 = -1;
        }
        this.e = n3;
    }

    public uE0$b(byte[] byArray) {
        int n3;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, byteOrder);
        this.e = n3 = byArray.length;
    }

    public final void a(int n3) {
        int n4;
        int n7;
        EOFException eOFException = null;
        for (n4 = 0; n4 < n3; n4 += n7) {
            int n8;
            DataInputStream dataInputStream = this.a;
            int n10 = n3 - n4;
            long l2 = n10;
            n7 = (int)(l2 = ((InputStream)dataInputStream).skip(l2));
            if (n7 > 0) continue;
            byte[] byArray = this.d;
            n7 = 8192;
            if (byArray == null) {
                this.d = byArray = new byte[n7];
            }
            if ((n7 = dataInputStream.read(byArray = this.d, 0, n10 = Math.min(n7, n10))) != (n8 = -1)) continue;
            String string2 = Gj0.b(n3, "Reached EOF while skipping ", " bytes.");
            eOFException = new EOFException(string2);
            throw eOFException;
        }
        this.b = n3 = this.b + n4;
    }

    public final int available() {
        return ((InputStream)this.a).available();
    }

    public final void mark(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Mark is currently unsupported");
        throw unsupportedOperationException;
    }

    public final int read() {
        int n3;
        this.b = n3 = this.b + 1;
        return ((InputStream)this.a).read();
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7 = this.a.read(byArray, n3, n4);
        this.b = n3 = this.b + n7;
        return n7;
    }

    public final boolean readBoolean() {
        int n3;
        this.b = n3 = this.b + 1;
        return this.a.readBoolean();
    }

    public final byte readByte() {
        int n3;
        this.b = n3 = this.b + 1;
        Object object = this.a;
        n3 = ((InputStream)object).read();
        if (n3 >= 0) {
            return (byte)n3;
        }
        object = new EOFException();
        throw object;
    }

    public final char readChar() {
        int n3;
        this.b = n3 = this.b + 2;
        return this.a.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }

    public final void readFully(byte[] byArray) {
        int n3 = this.b;
        int n4 = byArray.length;
        this.b = n3 += n4;
        this.a.readFully(byArray);
    }

    public final void readFully(byte[] byArray, int n3, int n4) {
        int n7;
        this.b = n7 = this.b + n4;
        this.a.readFully(byArray, n3, n4);
    }

    public final int readInt() {
        int n3;
        int n4;
        int n7;
        this.b = n7 = this.b + 4;
        Object object = this.a;
        int n8 = ((InputStream)object).read();
        int n10 = n8 | (n4 = ((InputStream)object).read()) | (n3 = ((InputStream)object).read()) | (n7 = ((InputStream)object).read());
        if (n10 >= 0) {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            if (byteOrder == byteOrder2) {
                n7 <<= 24;
                return (n7 += (n3 <<= 16)) + (n4 <<= 8) + n8;
            }
            byteOrder2 = ByteOrder.BIG_ENDIAN;
            if (byteOrder == byteOrder2) {
                n8 <<= 24;
                n4 = n3 << 8;
                return (n8 += (n4 <<= 16)) + n4 + n7;
            }
            CharSequence charSequence = new StringBuilder("Invalid byte order: ");
            ByteOrder byteOrder3 = this.c;
            charSequence.append(byteOrder3);
            charSequence = charSequence.toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        object = new EOFException();
        throw object;
    }

    public final String readLine() {
        return null;
    }

    public final long readLong() {
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15 = this.b;
        int n16 = 8;
        this.b = n15 += n16;
        Object object = this.a;
        int n17 = ((InputStream)object).read();
        int n18 = n17 | (n14 = ((InputStream)object).read()) | (n10 = ((InputStream)object).read()) | (n8 = ((InputStream)object).read()) | (n7 = ((InputStream)object).read()) | (n4 = ((InputStream)object).read()) | (n3 = ((InputStream)object).read()) | (n15 = ((InputStream)object).read());
        if (n18 >= 0) {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            int n19 = 16;
            int n20 = 24;
            int n21 = 32;
            int n22 = 40;
            int n24 = 48;
            int n25 = 56;
            if (byteOrder == byteOrder2) {
                long l2 = (long)n15 << n25;
                long l3 = (long)n3 << n24;
                l2 += l3;
                l3 = (long)n4 << n22;
                l2 += l3;
                l3 = (long)n7 << n21;
                l2 += l3;
                l3 = (long)n8 << n20;
                l2 += l3;
                l3 = (long)n10 << n19;
                l2 += l3;
                l3 = (long)n14 << 8;
                l2 += l3;
                n16 = n17;
                l3 = n17;
                return l2 + l3;
            }
            n16 = n17;
            ByteOrder byteOrder3 = ByteOrder.BIG_ENDIAN;
            if (byteOrder == byteOrder3) {
                long l4 = (long)n17 << n25;
                long l7 = (long)n14 << n24;
                l4 += l7;
                long l8 = (long)n10 << n22;
                l4 += l8;
                l8 = (long)n8 << n21;
                l4 += l8;
                l8 = (long)n7 << n20;
                l4 += l8;
                l8 = (long)n4 << n19;
                l4 += l8;
                l8 = (long)n3 << 8;
                l4 += l8;
                l8 = n15;
                return l4 + l8;
            }
            CharSequence charSequence = new StringBuilder("Invalid byte order: ");
            byteOrder3 = this.c;
            charSequence.append(byteOrder3);
            charSequence = charSequence.toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        object = new EOFException();
        throw object;
    }

    public final short readShort() {
        int n3;
        this.b = n3 = this.b + 2;
        Object object = this.a;
        int n4 = ((InputStream)object).read();
        int n7 = n4 | (n3 = ((InputStream)object).read());
        if (n7 >= 0) {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            if (byteOrder == byteOrder2) {
                return (short)((n3 << 8) + n4);
            }
            byteOrder2 = ByteOrder.BIG_ENDIAN;
            if (byteOrder == byteOrder2) {
                return (short)((n4 << 8) + n3);
            }
            CharSequence charSequence = new StringBuilder("Invalid byte order: ");
            byteOrder = this.c;
            charSequence.append(byteOrder);
            charSequence = charSequence.toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        object = new EOFException();
        throw object;
    }

    public final String readUTF() {
        int n3;
        this.b = n3 = this.b + 2;
        return this.a.readUTF();
    }

    public final int readUnsignedByte() {
        int n3;
        this.b = n3 = this.b + 1;
        return this.a.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        int n3;
        this.b = n3 = this.b + 2;
        Object object = this.a;
        int n4 = ((InputStream)object).read();
        int n7 = n4 | (n3 = ((InputStream)object).read());
        if (n7 >= 0) {
            ByteOrder byteOrder = this.c;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            if (byteOrder == byteOrder2) {
                return (n3 << 8) + n4;
            }
            byteOrder2 = ByteOrder.BIG_ENDIAN;
            if (byteOrder == byteOrder2) {
                return (n4 << 8) + n3;
            }
            CharSequence charSequence = new StringBuilder("Invalid byte order: ");
            byteOrder = this.c;
            charSequence.append(byteOrder);
            charSequence = charSequence.toString();
            object = new IOException((String)charSequence);
            throw object;
        }
        object = new EOFException();
        throw object;
    }

    public final void reset() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Reset is currently unsupported");
        throw unsupportedOperationException;
    }

    public final int skipBytes(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("skipBytes is currently unsupported");
        throw unsupportedOperationException;
    }
}

