/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder;

import androidx.media3.decoder.SimpleDecoder;

class SimpleDecoder$1
extends Thread {
    public final /* synthetic */ SimpleDecoder a;

    public SimpleDecoder$1(SimpleDecoder simpleDecoder) {
        this.a = simpleDecoder;
        super("ExoPlayer:SimpleDecoder");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        SimpleDecoder simpleDecoder = this.a;
        simpleDecoder.getClass();
        try {
            boolean bl2;
            while (bl2 = simpleDecoder.k()) {
            }
            return;
        }
        catch (InterruptedException interruptedException) {
            IllegalStateException illegalStateException = new IllegalStateException(interruptedException);
            throw illegalStateException;
        }
    }
}

