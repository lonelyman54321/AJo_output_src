/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  android.os.Bundle
 *  android.os.HandlerThread
 *  android.os.Looper
 */
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class Pq
implements FL1 {
    public static final ArrayDeque g;
    public static final Object h;
    public final MediaCodec a;
    public final HandlerThread b;
    public Pq$a c;
    public final AtomicReference d;
    public final f40 e;
    public boolean f;

    static {
        Object object = new ArrayDeque();
        g = object;
        h = object = new Object();
    }

    public Pq(MediaCodec object, HandlerThread handlerThread) {
        f40 f402 = new f40();
        this.a = object;
        this.b = handlerThread;
        this.e = f402;
        this.d = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Pq$b e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = arrayDeque.isEmpty();
                    if (bl2) {
                        return new Pq$b();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Object object = arrayDeque.removeFirst();
                return (Pq$b)object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Pq$b pq$b) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(pq$b);
            return;
        }
    }

    public final void a(int n3, Fe0 fe0, long l2, int n4) {
        int n7;
        int n8;
        this.d();
        Pq$b pq$b = Pq.e();
        pq$b.a = n3;
        n3 = 0;
        MediaCodec.CryptoInfo.Pattern pattern = null;
        pq$b.b = 0;
        pq$b.c = 0;
        pq$b.e = l2;
        pq$b.f = n4;
        int n10 = fe0.f;
        MediaCodec.CryptoInfo cryptoInfo = pq$b.d;
        cryptoInfo.numSubSamples = n10;
        Object[] objectArray = fe0.d;
        Object[] objectArray2 = cryptoInfo.numBytesOfClearData;
        if (objectArray != null) {
            if (objectArray2 != null && (n8 = objectArray2.length) >= (n7 = objectArray.length)) {
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            } else {
                n4 = objectArray.length;
                objectArray2 = Arrays.copyOf(objectArray, n4);
            }
        }
        cryptoInfo.numBytesOfClearData = objectArray2;
        objectArray = fe0.e;
        objectArray2 = cryptoInfo.numBytesOfEncryptedData;
        if (objectArray != null) {
            if (objectArray2 != null && (n8 = objectArray2.length) >= (n7 = objectArray.length)) {
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            } else {
                n4 = objectArray.length;
                objectArray2 = Arrays.copyOf(objectArray, n4);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = objectArray2;
        objectArray = fe0.b;
        objectArray2 = cryptoInfo.key;
        if (objectArray != null) {
            if (objectArray2 != null && (n8 = objectArray2.length) >= (n7 = objectArray.length)) {
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            } else {
                n4 = objectArray.length;
                objectArray2 = Arrays.copyOf((byte[])objectArray, n4);
            }
        }
        objectArray2.getClass();
        cryptoInfo.key = (byte[])objectArray2;
        objectArray = fe0.a;
        objectArray2 = cryptoInfo.iv;
        if (objectArray != null) {
            if (objectArray2 != null && (n8 = objectArray2.length) >= (n7 = objectArray.length)) {
                n8 = objectArray.length;
                System.arraycopy(objectArray, 0, objectArray2, 0, n8);
            } else {
                n3 = objectArray.length;
                objectArray2 = Arrays.copyOf((byte[])objectArray, n3);
            }
        }
        objectArray2.getClass();
        cryptoInfo.iv = (byte[])objectArray2;
        cryptoInfo.mode = n3 = fe0.c;
        n3 = gz3.a;
        n10 = 24;
        if (n3 >= n10) {
            Oq.a();
            n3 = fe0.g;
            int n14 = fe0.h;
            pattern = Nq.a(n3, n14);
            Ee0.a(cryptoInfo, pattern);
        }
        this.c.obtainMessage(2, pq$b).sendToTarget();
    }

    public final void b(Bundle bundle) {
        this.d();
        Pq$a pq$a = this.c;
        pq$a.obtainMessage(4, bundle).sendToTarget();
    }

    public final void c(int n3, int n4, int n7, long l2) {
        this.d();
        Pq$b pq$b = Pq.e();
        pq$b.a = n3;
        pq$b.b = 0;
        pq$b.c = n4;
        pq$b.e = l2;
        pq$b.f = n7;
        Pq$a pq$a = this.c;
        n4 = gz3.a;
        pq$a.obtainMessage(1, pq$b).sendToTarget();
    }

    public final void d() {
        RuntimeException runtimeException = this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void flush() {
        Object object;
        Object object2;
        boolean bl2 = this.f;
        if (!bl2) return;
        try {
            object2 = this.c;
            object2.getClass();
            object = null;
            object2.removeCallbacksAndMessages(null);
            object2 = this.e;
            synchronized (object2) {
                object = null;
                ((f40)object2).a = false;
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            object = new IllegalStateException(interruptedException);
            throw object;
        }
        {
            object = this.c;
            object.getClass();
            int n3 = 3;
            object = object.obtainMessage(n3);
            object.sendToTarget();
            ((f40)object2).a();
            return;
        }
    }

    public final void shutdown() {
        boolean bl2 = this.f;
        if (bl2) {
            this.flush();
            HandlerThread handlerThread = this.b;
            handlerThread.quit();
        }
        this.f = false;
    }

    public final void start() {
        boolean bl2 = this.f;
        if (!bl2) {
            Pq$a pq$a;
            HandlerThread handlerThread = this.b;
            handlerThread.start();
            handlerThread = handlerThread.getLooper();
            this.c = pq$a = new Pq$a(this, (Looper)handlerThread);
            this.f = bl2 = true;
        }
    }
}

