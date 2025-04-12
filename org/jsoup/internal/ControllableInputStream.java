/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.Validate;

public class ControllableInputStream
extends FilterInputStream {
    private final BufferedInputStream buff;
    private final boolean capped;
    private boolean interrupted;
    private int markPos;
    private final int maxSize;
    private int remaining;
    private long startTime;
    private long timeout;

    private ControllableInputStream(BufferedInputStream bufferedInputStream, int n3) {
        super(bufferedInputStream);
        long l2;
        long l3;
        this.timeout = l3 = 0L;
        boolean bl2 = false;
        boolean bl3 = n3 >= 0;
        Validate.isTrue(bl3);
        this.buff = bufferedInputStream;
        if (n3 != 0) {
            bl2 = true;
        }
        this.capped = bl2;
        this.maxSize = n3;
        this.remaining = n3;
        this.markPos = -1;
        this.startTime = l2 = System.nanoTime();
    }

    private boolean expired() {
        long l2 = this.timeout;
        long l3 = 0L;
        boolean bl2 = false;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false) {
            return false;
        }
        l2 = System.nanoTime();
        l3 = this.startTime;
        long l4 = (l2 -= l3) - (l3 = this.timeout);
        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int n3) {
        boolean bl2 = true;
        int n4 = n3 >= 0 ? 1 : 0;
        Object object = "maxSize must be 0 (unlimited) or larger";
        Validate.isTrue(n4 != 0, (String)object);
        Validate.notNull(inputStream);
        if (n3 <= 0) {
            bl2 = false;
        }
        n4 = 32768;
        if (bl2 && n3 < n4) {
            n4 = n3;
        }
        object = new byte[n4];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n4);
        while (true) {
            int n7;
            block7: {
                block8: {
                    block6: {
                        int n8;
                        n7 = bl2 ? Math.min(n3, n4) : n4;
                        if ((n7 = inputStream.read((byte[])object, 0, n7)) == (n8 = -1)) break block6;
                        if (!bl2) break block7;
                        if (n7 < n3) break block8;
                        byteArrayOutputStream.write((byte[])object, 0, n3);
                    }
                    return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                }
                n3 -= n7;
            }
            byteArrayOutputStream.write((byte[])object, 0, n7);
        }
    }

    public static ControllableInputStream wrap(InputStream inputStream, int n3, int n4) {
        boolean bl2 = inputStream instanceof ControllableInputStream;
        if (bl2) {
            return (ControllableInputStream)inputStream;
        }
        bl2 = inputStream instanceof BufferedInputStream;
        if (bl2) {
            inputStream = (BufferedInputStream)inputStream;
            ControllableInputStream controllableInputStream = new ControllableInputStream((BufferedInputStream)inputStream, n4);
            return controllableInputStream;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, n3);
        ControllableInputStream controllableInputStream = new ControllableInputStream(bufferedInputStream, n4);
        return controllableInputStream;
    }

    public BufferedInputStream inputStream() {
        return this.buff;
    }

    public void mark(int n3) {
        super.mark(n3);
        n3 = this.maxSize;
        int n4 = this.remaining;
        this.markPos = n3 -= n4;
    }

    public int read(byte[] object, int n3, int n4) {
        int n7 = this.interrupted;
        int n8 = -1;
        if (n7 == 0 && ((n7 = this.capped) == 0 || (n7 = this.remaining) > 0)) {
            Thread thread2 = Thread.currentThread();
            n7 = (int)(thread2.isInterrupted() ? 1 : 0);
            if (n7 != 0) {
                this.interrupted = true;
                return n8;
            }
            n7 = (int)(this.expired() ? 1 : 0);
            if (n7 == 0) {
                int n10;
                n7 = (int)(this.capped ? 1 : 0);
                if (n7 != 0 && n4 > (n7 = this.remaining)) {
                    n4 = n7;
                }
                try {
                    n10 = super.read((byte[])object, n3, n4);
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    return 0;
                }
                n3 = this.remaining - n10;
                this.remaining = n3;
                return n10;
            }
            object = new SocketTimeoutException;
            object("Read timeout");
            throw object;
        }
        return n8;
    }

    public void reset() {
        super.reset();
        int n3 = this.maxSize;
        int n4 = this.markPos;
        this.remaining = n3 -= n4;
    }

    public ControllableInputStream timeout(long l2, long l3) {
        this.startTime = l2;
        this.timeout = l3 *= 1000000L;
        return this;
    }
}

