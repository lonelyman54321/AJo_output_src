/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$BufferInfo
 *  android.media.MediaCodec$Callback
 *  android.media.MediaCodec$CodecException
 *  android.media.MediaCodec$CryptoException
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zztg;
import java.util.ArrayDeque;

final class zzth
extends MediaCodec.Callback {
    private final Object zza;
    private final HandlerThread zzb;
    private Handler zzc;
    private final NU zzd;
    private final NU zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;

    public zzth(HandlerThread object) {
        Object object2;
        this.zza = object2 = new Object();
        this.zzb = object;
        this.zzd = object;
        super();
        this.zze = object;
        super();
        this.zzf = object;
        super();
        this.zzg = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zzd(zzth zzth2) {
        Object object = zzth2.zza;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                try {
                    boolean bl2 = zzth2.zzm;
                    if (bl2) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                long l2 = zzth2.zzl;
                long l3 = -1;
                zzth2.zzl = l2 += l3;
                l3 = 0L;
                long l4 = l2 - l3;
                Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object2 > 0) {
                    return;
                }
                if (object2 < 0) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    Object object3 = zzth2.zza;
                    synchronized (object3) {
                        zzth2.zzn = illegalStateException;
                        return;
                    }
                }
                zzth2.zzi();
                return;
            }
            throw throwable2;
        }
    }

    private final void zzh(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzi() {
        int n3;
        Object object = this.zzg;
        boolean bl2 = ((ArrayDeque)object).isEmpty();
        if (!bl2) {
            object = (MediaFormat)this.zzg.getLast();
            this.zzi = object;
        }
        object = this.zzd;
        ((NU)object).c = n3 = ((NU)object).b;
        object = this.zze;
        ((NU)object).c = n3 = ((NU)object).b;
        this.zzf.clear();
        this.zzg.clear();
    }

    private final void zzj() {
        Throwable throwable = this.zzn;
        if (throwable == null) {
            throwable = this.zzj;
            if (throwable == null) {
                throwable = this.zzk;
                if (throwable == null) {
                    return;
                }
                this.zzk = null;
                throw throwable;
            }
            this.zzj = null;
            throw throwable;
        }
        this.zzn = null;
        throw throwable;
    }

    private final boolean zzk() {
        boolean bl2;
        long l2 = this.zzl;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0 || (bl2 = this.zzm);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCryptoError(MediaCodec object, MediaCodec.CryptoException cryptoException) {
        object = this.zza;
        synchronized (object) {
            this.zzk = cryptoException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onError(MediaCodec object, MediaCodec.CodecException codecException) {
        object = this.zza;
        synchronized (object) {
            this.zzj = codecException;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onInputBufferAvailable(MediaCodec object, int n3) {
        object = this.zza;
        synchronized (object) {
            NU nU = this.zzd;
            nU.a(n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputBufferAvailable(MediaCodec object, int n3, MediaCodec.BufferInfo bufferInfo) {
        object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                block3: {
                    try {
                        object2 = this.zzi;
                        if (object2 == null) break block3;
                        this.zzh((MediaFormat)object2);
                        object2 = null;
                        this.zzi = null;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object2 = this.zze;
                ((NU)object2).a(n3);
                ArrayDeque arrayDeque = this.zzf;
                arrayDeque.add(bufferInfo);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOutputFormatChanged(MediaCodec object, MediaFormat mediaFormat) {
        object = this.zza;
        synchronized (object) {
            this.zzh(mediaFormat);
            mediaFormat = null;
            this.zzi = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zza() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                int n3;
                try {
                    this.zzj();
                    boolean bl2 = this.zzk();
                    n3 = -1;
                    if (bl2) {
                        return n3;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                NU nU = this.zzd;
                int n4 = nU.b;
                int n7 = nU.c;
                n4 = n4 == n7 ? 1 : 0;
                if (n4 == 0) return nU.b();
                return n3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                int n3;
                int n4;
                try {
                    this.zzj();
                    n4 = this.zzk();
                    n3 = -1;
                    if (n4 != 0) {
                        return n3;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                Object object2 = this.zze;
                int n7 = ((NU)object2).b;
                int n8 = ((NU)object2).c;
                n7 = n7 == n8 ? 1 : 0;
                if (n7 != 0) {
                    return n3;
                }
                n4 = ((NU)object2).b();
                if (n4 < 0) {
                    int n10 = -2;
                    if (n4 != n10) return n4;
                    object2 = this.zzg;
                    object2 = ((ArrayDeque)object2).remove();
                    object2 = (MediaFormat)object2;
                    this.zzh = object2;
                    return -2;
                }
                Object object3 = this.zzh;
                zzeq.zzb(object3);
                object3 = this.zzf;
                object3 = object3.remove();
                object3 = (MediaCodec.BufferInfo)object3;
                n8 = object3.offset;
                int n14 = object3.size;
                long l2 = object3.presentationTimeUs;
                int n15 = object3.flags;
                bufferInfo.set(n8, n14, l2, n15);
                return n4;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MediaFormat zzc() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = this.zzh;
                    if (object2 != null) {
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = new IllegalStateException();
                throw object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        Object object = this.zza;
        synchronized (object) {
            long l2 = this.zzl;
            long l3 = 1L;
            this.zzl = l2 += l3;
            Handler handler = this.zzc;
            zztg zztg2 = new zztg(this);
            handler.post((Runnable)zztg2);
            return;
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean bl2;
        Handler handler = this.zzc;
        if (handler == null) {
            bl2 = true;
        } else {
            bl2 = false;
            handler = null;
        }
        zzeq.zzf(bl2);
        this.zzb.start();
        handler = this.zzb;
        handler = handler.getLooper();
        Handler handler2 = new Handler((Looper)handler);
        Qq.a(mediaCodec, this, handler2);
        this.zzc = handler2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        Object object = this.zza;
        synchronized (object) {
            boolean bl2;
            this.zzm = bl2 = true;
            HandlerThread handlerThread = this.zzb;
            handlerThread.quit();
            this.zzi();
            return;
        }
    }
}

