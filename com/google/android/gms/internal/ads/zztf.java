/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zztc;
import com.google.android.gms.internal.ads.zztd;
import com.google.android.gms.internal.ads.zzte;
import com.google.android.gms.internal.ads.zztn;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

final class zztf
implements zztn {
    private static final ArrayDeque zza;
    private static final Object zzb;
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeu zzg;
    private boolean zzh;

    static {
        Object object = new ArrayDeque();
        zza = object;
        zzb = object = new Object();
    }

    public zztf(MediaCodec object, HandlerThread handlerThread) {
        zzer zzer2 = zzer.zza;
        zzeu zzeu2 = new zzeu(zzer2);
        this.zzc = object;
        this.zzd = handlerThread;
        this.zzg = zzeu2;
        this.zzf = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static /* bridge */ /* synthetic */ void zza(zztf object, Message object2) {
        Object object3;
        block15: {
            block18: {
                block16: {
                    block17: {
                        int n3 = object2.what;
                        object3 = null;
                        if (n3 == 0) break block16;
                        int n4 = 1;
                        if (n3 == n4) break block17;
                        n4 = 2;
                        if (n3 != n4) {
                            n4 = 3;
                            if (n3 != n4) {
                                object = ((zztf)object).zzf;
                                int n7 = object2.what;
                                object2 = String.valueOf(n7);
                                IllegalStateException illegalStateException = new IllegalStateException((String)object2);
                                zztc.zza((AtomicReference)object, null, illegalStateException);
                                break block15;
                            } else {
                                object2 = (Bundle)object2.obj;
                                try {
                                    MediaCodec mediaCodec = ((zztf)object).zzc;
                                    mediaCodec.setParameters((Bundle)object2);
                                }
                                catch (RuntimeException runtimeException) {
                                    object = ((zztf)object).zzf;
                                    zztc.zza((AtomicReference)object, null, runtimeException);
                                }
                            }
                            break block15;
                        } else {
                            object = ((zztf)object).zzg;
                            ((zzeu)object).zze();
                        }
                        break block15;
                    }
                    object2 = (zzte)object2.obj;
                    int n8 = object2.zza;
                    MediaCodec.CryptoInfo cryptoInfo = object2.zzd;
                    long l2 = object2.zze;
                    int n10 = object2.zzf;
                    try {
                        Object object4 = zzb;
                        // MONITORENTER : object4
                    }
                    catch (RuntimeException runtimeException) {
                        object = ((zztf)object).zzf;
                        zztc.zza((AtomicReference)object, null, runtimeException);
                    }
                    MediaCodec mediaCodec = ((zztf)object).zzc;
                    mediaCodec.queueSecureInputBuffer(n8, 0, cryptoInfo, l2, n10);
                    // MONITOREXIT : object4
                    break block18;
                    break block18;
                }
                object2 = (zzte)object2.obj;
                int n14 = object2.zza;
                int n15 = object2.zzc;
                long l3 = object2.zze;
                int n16 = object2.zzf;
                try {
                    MediaCodec mediaCodec = ((zztf)object).zzc;
                    mediaCodec.queueInputBuffer(n14, 0, n15, l3, n16);
                }
                catch (RuntimeException runtimeException) {
                    object = ((zztf)object).zzf;
                    zztc.zza((AtomicReference)object, null, runtimeException);
                }
            }
            object3 = object2;
        }
        if (object3 == null) return;
        object = zza;
        // MONITORENTER : object
        ((ArrayDeque)object).add(object3);
        // MONITOREXIT : object
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static zzte zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = arrayDeque.isEmpty();
                    if (bl2) {
                        return new zzte();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Object object = arrayDeque.removeFirst();
                return (zzte)object;
            }
            throw throwable2;
        }
    }

    private static byte[] zzj(byte[] byArray, byte[] byArray2) {
        int n3;
        int n4;
        if (byArray == null) {
            return byArray2;
        }
        if (byArray2 != null && (n4 = byArray2.length) >= (n3 = byArray.length)) {
            System.arraycopy(byArray, 0, byArray2, 0, n3);
            return byArray2;
        }
        int n7 = byArray.length;
        return Arrays.copyOf(byArray, n7);
    }

    private static int[] zzk(int[] nArray, int[] nArray2) {
        int n3;
        int n4;
        if (nArray == null) {
            return nArray2;
        }
        if (nArray2 != null && (n4 = nArray2.length) >= (n3 = nArray.length)) {
            System.arraycopy(nArray, 0, nArray2, 0, n3);
            return nArray2;
        }
        int n7 = nArray.length;
        return Arrays.copyOf(nArray, n7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        boolean bl2 = this.zzh;
        if (!bl2) {
            return;
        }
        try {
            Object object = this.zze;
            int n3 = 0;
            Object var4_5 = null;
            if (object == null) {
                throw null;
            }
            object.removeCallbacksAndMessages(null);
            object = this.zzg;
            ((zzeu)object).zzc();
            object = this.zze;
            if (object == null) throw null;
            n3 = 2;
            object = object.obtainMessage(n3);
            object.sendToTarget();
            object = this.zzg;
            ((zzeu)object).zza();
            return;
        }
        catch (InterruptedException interruptedException) {}
        Thread.currentThread().interrupt();
        IllegalStateException illegalStateException = new IllegalStateException(interruptedException);
        throw illegalStateException;
    }

    public final void zzc() {
        RuntimeException runtimeException = this.zzf.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    public final void zzd(int n3, int n4, int n7, long l2, int n8) {
        this.zzc();
        zzte zzte2 = zztf.zzi();
        zzte2.zza(n3, 0, n7, l2, n8);
        Handler handler = this.zze;
        n7 = zzgd.zza;
        handler.obtainMessage(0, (Object)zzte2).sendToTarget();
    }

    public final void zze(int n3, int n4, zzik zzik2, long l2, int n7) {
        int n8;
        this.zzc();
        zzte zzte2 = zztf.zzi();
        zzte2.zza(n3, 0, 0, l2, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzte2.zzd;
        cryptoInfo.numSubSamples = n8 = zzik2.zzf;
        Object[] objectArray = zzik2.zzd;
        Object[] objectArray2 = cryptoInfo.numBytesOfClearData;
        objectArray = zztf.zzk((int[])objectArray, objectArray2);
        cryptoInfo.numBytesOfClearData = objectArray;
        objectArray = zzik2.zze;
        objectArray2 = cryptoInfo.numBytesOfEncryptedData;
        objectArray = zztf.zzk((int[])objectArray, objectArray2);
        cryptoInfo.numBytesOfEncryptedData = objectArray;
        objectArray = zzik2.zzb;
        objectArray2 = cryptoInfo.key;
        objectArray = zztf.zzj((byte[])objectArray, (byte[])objectArray2);
        objectArray.getClass();
        cryptoInfo.key = (byte[])objectArray;
        objectArray = zzik2.zza;
        objectArray2 = cryptoInfo.iv;
        objectArray = zztf.zzj((byte[])objectArray, (byte[])objectArray2);
        objectArray.getClass();
        cryptoInfo.iv = (byte[])objectArray;
        cryptoInfo.mode = n8 = zzik2.zzc;
        n8 = zzgd.zza;
        int n10 = 24;
        if (n8 >= n10) {
            Oq.a();
            n8 = zzik2.zzg;
            int n14 = zzik2.zzh;
            zzik2 = Nq.a(n8, n14);
            Ee0.a(cryptoInfo, (MediaCodec.CryptoInfo.Pattern)zzik2);
        }
        this.zze.obtainMessage(1, (Object)zzte2).sendToTarget();
    }

    public final void zzf(Bundle bundle) {
        this.zzc();
        Handler handler = this.zze;
        handler.obtainMessage(3, (Object)bundle).sendToTarget();
    }

    public final void zzg() {
        boolean bl2 = this.zzh;
        if (bl2) {
            this.zzb();
            HandlerThread handlerThread = this.zzd;
            handlerThread.quit();
        }
        this.zzh = false;
    }

    public final void zzh() {
        boolean bl2 = this.zzh;
        if (!bl2) {
            this.zzd.start();
            HandlerThread handlerThread = this.zzd;
            handlerThread = handlerThread.getLooper();
            zztd zztd2 = new zztd(this, (Looper)handlerThread);
            this.zze = zztd2;
            this.zzh = bl2 = true;
        }
    }
}

