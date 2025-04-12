/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

final class CharSequenceReader
extends Reader {
    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence charSequence) {
        this.seq = charSequence = (CharSequence)Preconditions.checkNotNull(charSequence);
    }

    private void checkOpen() {
        Object object = this.seq;
        if (object != null) {
            return;
        }
        object = new IOException("reader closed");
        throw object;
    }

    private boolean hasRemaining() {
        int n3 = this.remaining();
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }

    private int remaining() {
        Objects.requireNonNull(this.seq);
        int n3 = this.seq.length();
        int n4 = this.pos;
        return n3 - n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        synchronized (this) {
            Object var1_1 = null;
            this.seq = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void mark(int n3) {
        synchronized (this) {
            boolean bl2 = n3 >= 0;
            String string2 = "readAheadLimit (%s) may not be negative";
            Preconditions.checkArgument(bl2, string2, n3);
            this.checkOpen();
            this.mark = n3 = this.pos;
            return;
        }
    }

    public boolean markSupported() {
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read() {
        synchronized (this) {
            try {
                int n3;
                this.checkOpen();
                CharSequence charSequence = this.seq;
                Objects.requireNonNull(charSequence);
                int n4 = this.hasRemaining();
                if (n4 == 0) return -1;
                charSequence = this.seq;
                int n7 = this.pos;
                this.pos = n3 = n7 + 1;
                return charSequence.charAt(n7);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(CharBuffer charBuffer) {
        synchronized (this) {
            int n3;
            block6: {
                Preconditions.checkNotNull(charBuffer);
                this.checkOpen();
                CharSequence charSequence = this.seq;
                Objects.requireNonNull(charSequence);
                n3 = this.hasRemaining();
                if (n3 != 0) break block6;
                return -1;
            }
            try {
                n3 = charBuffer.remaining();
                int n4 = this.remaining();
                n3 = Math.min(n3, n4);
                for (n4 = 0; n4 < n3; ++n4) {
                    int n7;
                    CharSequence charSequence = this.seq;
                    int n8 = this.pos;
                    this.pos = n7 = n8 + 1;
                    char c2 = charSequence.charAt(n8);
                    charBuffer.put(c2);
                }
            }
            catch (Throwable throwable) {}
            return n3;
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int read(char[] cArray, int n3, int n4) {
        synchronized (this) {
            CharSequence charSequence;
            int n7;
            int n8;
            block6: {
                n8 = n3 + n4;
                n7 = cArray.length;
                Preconditions.checkPositionIndexes(n3, n8, n7);
                this.checkOpen();
                charSequence = this.seq;
                Objects.requireNonNull(charSequence);
                n8 = (int)(this.hasRemaining() ? 1 : 0);
                if (n8 != 0) break block6;
                return -1;
            }
            try {
                n8 = this.remaining();
                n4 = Math.min(n4, n8);
                charSequence = null;
                for (n8 = 0; n8 < n4; ++n8) {
                    char c2;
                    int n10;
                    n7 = n3 + n8;
                    CharSequence charSequence2 = this.seq;
                    int n14 = this.pos;
                    this.pos = n10 = n14 + 1;
                    cArray[n7] = c2 = charSequence2.charAt(n14);
                }
            }
            catch (Throwable throwable) {}
            return n4;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean ready() {
        synchronized (this) {
            this.checkOpen();
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        synchronized (this) {
            int n3;
            this.checkOpen();
            this.pos = n3 = this.mark;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long skip(long l2) {
        synchronized (this) {
            int n3;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            int n4 = l4 >= 0 ? 1 : 0;
            String string2 = "n (%s) may not be negative";
            Preconditions.checkArgument(n4 != 0, string2, l2);
            this.checkOpen();
            n4 = this.remaining();
            l3 = n4;
            l2 = Math.min(l3, l2);
            int n7 = (int)l2;
            this.pos = n3 = this.pos + n7;
            return n7;
        }
    }
}

