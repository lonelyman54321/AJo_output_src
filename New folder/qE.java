/*
 * Decompiled with CFR 0.152.
 */
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class qE
extends OutputStream {
    public final OutputStream a;
    public byte[] b;
    public final Kp c;
    public int d;

    public qE(FileOutputStream object, Kp kp) {
        this.a = object;
        this.c = kp;
        object = (byte[])kp.c(byte[].class, 65536);
        this.b = (byte[])object;
    }

    public final void close() {
        Object object = this.a;
        try {
            this.flush();
            object = this.b;
            if (object != null) {
                Kp kp = this.c;
                kp.put(object);
                object = null;
                this.b = null;
            }
            return;
        }
        finally {
            ((OutputStream)object).close();
        }
    }

    public final void flush() {
        int n3 = this.d;
        OutputStream outputStream = this.a;
        if (n3 > 0) {
            byte[] byArray = this.b;
            outputStream.write(byArray, 0, n3);
            this.d = 0;
        }
        outputStream.flush();
    }

    public final void write(int n3) {
        int n4;
        byte[] byArray = this.b;
        int n7 = this.d;
        this.d = n4 = n7 + 1;
        byArray[n7] = n3 = (int)((byte)n3);
        n3 = byArray.length;
        if (n4 == n3 && n4 > 0) {
            OutputStream outputStream = this.a;
            n7 = 0;
            outputStream.write(byArray, 0, n4);
            this.d = 0;
        }
    }

    public final void write(byte[] byArray) {
        int n3 = byArray.length;
        this.write(byArray, 0, n3);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        int n7 = 0;
        do {
            byte[] byArray2;
            int n8;
            int n10 = n4 - n7;
            int n14 = n3 + n7;
            int n15 = this.d;
            OutputStream outputStream = this.a;
            if (n15 == 0 && n10 >= (n8 = (byArray2 = this.b).length)) {
                outputStream.write(byArray, n14, n10);
                return;
            }
            byArray2 = this.b;
            n8 = byArray2.length - n15;
            n10 = Math.min(n10, n8);
            byte[] byArray3 = this.b;
            n8 = this.d;
            System.arraycopy(byArray, n14, byArray3, n8, n10);
            this.d = n14 = this.d + n10;
            n7 += n10;
            byte[] byArray4 = this.b;
            n15 = byArray4.length;
            if (n14 != n15 || n14 <= 0) continue;
            outputStream.write(byArray4, 0, n14);
            this.d = 0;
        } while (n7 < n4);
    }
}

