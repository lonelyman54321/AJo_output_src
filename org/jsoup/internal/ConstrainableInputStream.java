/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;

public final class ConstrainableInputStream
extends BufferedInputStream {
    private final boolean capped;
    private boolean interrupted;
    private final int maxSize;
    private int remaining;
    private long startTime;
    private long timeout;

    private ConstrainableInputStream(InputStream inputStream, int n3, int n4) {
        super(inputStream, n3);
        long l2;
        this.timeout = l2 = 0L;
        boolean bl2 = false;
        inputStream = null;
        n3 = 1;
        boolean bl3 = n4 >= 0;
        Validate.isTrue(bl3);
        this.maxSize = n4;
        this.remaining = n4;
        if (n4 != 0) {
            bl2 = true;
        }
        this.capped = bl2;
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

    public static ConstrainableInputStream wrap(InputStream inputStream, int n3, int n4) {
        boolean bl2 = inputStream instanceof ConstrainableInputStream;
        if (bl2) {
            inputStream = (ConstrainableInputStream)inputStream;
        } else {
            ConstrainableInputStream constrainableInputStream = new ConstrainableInputStream(inputStream, n3, n4);
            inputStream = constrainableInputStream;
        }
        return inputStream;
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

    public ByteBuffer readToByteBuffer(int n3) {
        return DataUtil.readToByteBuffer(this, n3);
    }

    public void reset() {
        super.reset();
        int n3 = this.maxSize;
        int n4 = this.markpos;
        this.remaining = n3 -= n4;
    }

    public ConstrainableInputStream timeout(long l2, long l3) {
        this.startTime = l2;
        this.timeout = l3 *= 1000000L;
        return this;
    }
}

