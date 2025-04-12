/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicReference;

public final class Pq$a
extends Handler {
    public final /* synthetic */ Pq a;

    public Pq$a(Pq pq, Looper looper) {
        this.a = pq;
        super(looper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        Object object2;
        block20: {
            IllegalStateException illegalStateException;
            int n3;
            AtomicReference atomicReference;
            block19: {
                int n4;
                Object object3;
                block15: {
                    Object object4;
                    block14: {
                        block16: {
                            block17: {
                                block18: {
                                    object3 = this.a;
                                    object3.getClass();
                                    int n7 = object.what;
                                    n4 = 1;
                                    object2 = null;
                                    if (n7 == n4) break block15;
                                    n4 = 2;
                                    if (n7 == n4) break block16;
                                    n4 = 3;
                                    if (n7 == n4) break block17;
                                    n4 = 4;
                                    if (n7 == n4) break block18;
                                    atomicReference = ((Pq)object3).d;
                                    n3 = object.what;
                                    object = String.valueOf(n3);
                                    illegalStateException = new IllegalStateException((String)object);
                                    break block19;
                                }
                                object = (Bundle)object.obj;
                                try {
                                    MediaCodec mediaCodec = ((Pq)object3).a;
                                    mediaCodec.setParameters((Bundle)object);
                                }
                                catch (RuntimeException runtimeException) {
                                    boolean bl2;
                                    AtomicReference atomicReference2 = ((Pq)object3).d;
                                    while (!(bl2 = atomicReference2.compareAndSet(null, runtimeException)) && (object3 = atomicReference2.get()) == null) {
                                    }
                                }
                                break block20;
                            }
                            object = ((Pq)object3).e;
                            object.e();
                            break block20;
                        }
                        object4 = object = object.obj;
                        object4 = (Pq$b)object;
                        int n8 = object4.a;
                        int n10 = object4.b;
                        MediaCodec.CryptoInfo cryptoInfo = object4.d;
                        long l2 = object4.e;
                        int n14 = object4.f;
                        try {
                            object = Pq.h;
                            synchronized (object) {
                            }
                        }
                        catch (RuntimeException runtimeException) {
                            Object v4;
                            boolean bl3;
                            RuntimeException runtimeException2 = runtimeException;
                            AtomicReference atomicReference3 = ((Pq)object3).d;
                            while (!(bl3 = atomicReference3.compareAndSet(null, runtimeException2)) && (v4 = atomicReference3.get()) == null) {
                            }
                            break block14;
                        }
                        {
                            MediaCodec mediaCodec = ((Pq)object3).a;
                            mediaCodec.queueSecureInputBuffer(n8, n10, cryptoInfo, l2, n14);
                        }
                    }
                    object2 = object4;
                    break block20;
                }
                object = (Pq$b)object.obj;
                int n15 = object.a;
                int n16 = object.b;
                int n17 = object.c;
                long l3 = object.e;
                int n18 = object.f;
                try {
                    MediaCodec mediaCodec = ((Pq)object3).a;
                    mediaCodec.queueInputBuffer(n15, n16, n17, l3, n18);
                }
                catch (RuntimeException runtimeException) {
                    object3 = ((Pq)object3).d;
                    while ((n4 = (int)(((AtomicReference)object3).compareAndSet(null, runtimeException) ? 1 : 0)) == 0) {
                        Object v5 = ((AtomicReference)object3).get();
                        if (v5 == null) continue;
                    }
                }
                {
                    break;
                }
            }
            while ((n3 = (int)(atomicReference.compareAndSet(null, illegalStateException) ? 1 : 0)) == 0 && (object = atomicReference.get()) == null) {
            }
            break block20;
            object2 = object;
        }
        if (object2 != null) {
            Pq.f(object2);
        }
    }
}

