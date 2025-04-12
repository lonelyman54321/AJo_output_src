/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class vC0
extends InputStream {
    public static final ArrayDeque c;
    public InputStream a;
    public IOException b;

    static {
        Object object = dz3.a;
        object = new ArrayDeque;
        object(0);
        c = object;
    }

    public final int available() {
        return this.a.available();
    }

    public final void close() {
        this.a.close();
    }

    public final void mark(int n3) {
        this.a.mark(n3);
    }

    public final boolean markSupported() {
        return this.a.markSupported();
    }

    public final int read() {
        InputStream inputStream;
        try {
            inputStream = this.a;
        }
        catch (IOException iOException) {
            this.b = iOException;
            throw iOException;
        }
        return inputStream.read();
    }

    public final int read(byte[] byArray) {
        InputStream inputStream;
        try {
            inputStream = this.a;
        }
        catch (IOException iOException) {
            this.b = iOException;
            throw iOException;
        }
        return inputStream.read(byArray);
    }

    public final int read(byte[] byArray, int n3, int n4) {
        InputStream inputStream;
        try {
            inputStream = this.a;
        }
        catch (IOException iOException) {
            this.b = iOException;
            throw iOException;
        }
        return inputStream.read(byArray, n3, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        this.b = null;
        this.a = null;
        ArrayDeque arrayDeque = c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void reset() {
        synchronized (this) {
            InputStream inputStream = this.a;
            inputStream.reset();
            return;
        }
    }

    public final long skip(long l2) {
        InputStream inputStream;
        try {
            inputStream = this.a;
        }
        catch (IOException iOException) {
            this.b = iOException;
            throw iOException;
        }
        return inputStream.skip(l2);
    }
}

