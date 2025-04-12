/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Message
 */
package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzex;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfk;

final class zzabk
extends HandlerThread
implements Handler.Callback {
    private zzex zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzabm zze;

    public zzabk() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        Throwable throwable322222;
        block30: {
            RuntimeException runtimeException222222;
            Object object2;
            boolean bl2;
            String string2;
            block33: {
                zzey zzey2222222;
                block32: {
                    Error error222222;
                    block31: {
                        block29: {
                            boolean bl3 = ((Message)object).what;
                            string2 = null;
                            bl2 = true;
                            if (bl3 != bl2) {
                                boolean bl4 = 2 != 0;
                                if (bl3 != bl4) {
                                    return bl2;
                                }
                                try {
                                    object = this.zza;
                                    if (object == null) throw null;
                                    ((zzex)object).zzc();
                                    return bl2;
                                }
                                catch (Throwable throwable2) {}
                                String string3 = "PlaceholderSurface";
                                string2 = "Failed to release placeholder surface";
                                try {
                                    zzfk.zzd(string3, string2, throwable2);
                                    return bl2;
                                }
                                finally {
                                    this.quit();
                                }
                            }
                            boolean bl5 = ((Message)object).arg1;
                            object2 = this.zza;
                            if (object2 == null) break block29;
                            ((zzex)object2).zzb((int)(bl5 ? 1 : 0));
                            zzex zzex2 = this.zza;
                            zzex2 = zzex2.zza();
                            if (bl5) {
                                bl5 = true;
                            } else {
                                bl5 = false;
                                object = null;
                            }
                            object2 = new zzabm(this, (SurfaceTexture)zzex2, bl5, null);
                            this.zze = object2;
                            synchronized (this) {
                                ((Object)((Object)this)).notify();
                                return bl2;
                            }
                        }
                        try {
                            throw null;
                        }
                        catch (Throwable throwable322222) {
                            break block30;
                        }
                        catch (Error error222222) {
                            break block31;
                        }
                        catch (zzey zzey2222222) {
                            break block32;
                        }
                        catch (RuntimeException runtimeException222222) {
                            break block33;
                        }
                    }
                    object2 = "PlaceholderSurface";
                    string2 = "Failed to initialize placeholder surface";
                    zzfk.zzd((String)object2, string2, error222222);
                    this.zzc = error222222;
                    synchronized (this) {
                        ((Object)((Object)this)).notify();
                        return bl2;
                    }
                }
                object2 = "PlaceholderSurface";
                string2 = "Failed to initialize placeholder surface";
                {
                    zzfk.zzd((String)object2, string2, zzey2222222);
                    object2 = new IllegalStateException(zzey2222222);
                    this.zzd = object2;
                }
                synchronized (this) {
                    ((Object)((Object)this)).notify();
                    return bl2;
                }
            }
            object2 = "PlaceholderSurface";
            string2 = "Failed to initialize placeholder surface";
            {
                zzfk.zzd((String)object2, string2, runtimeException222222);
                this.zzd = runtimeException222222;
            }
            synchronized (this) {
                ((Object)((Object)this)).notify();
                return bl2;
            }
        }
        synchronized (this) {
            ((Object)((Object)this)).notify();
            throw throwable322222;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzabm zza(int n3) {
        Object object;
        block10: {
            Handler handler;
            ((Thread)((Object)this)).start();
            Object object2 = this.getLooper();
            this.zzb = handler = new Handler(object2, (Handler.Callback)this);
            int n4 = 0;
            object2 = new zzex(handler, null);
            this.zza = object2;
            synchronized (this) {
                handler = this.zzb;
                boolean bl2 = false;
                object2 = null;
                n4 = 1;
                object = handler.obtainMessage(n4, n3, 0);
                object.sendToTarget();
                while ((object = this.zze) == null && (object = this.zzd) == null && (object = this.zzc) == null) {
                    try {
                        ((Object)((Object)this)).wait();
                    }
                    catch (InterruptedException interruptedException) {
                        bl2 = true;
                    }
                }
                // MONITOREXIT @DISABLED, blocks:[0, 4] lbl22 : MonitorExitStatement: MONITOREXIT : this
                if (!bl2) break block10;
            }
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
        if ((object = this.zzd) != null) {
            throw object;
        }
        object = this.zzc;
        if (object == null) {
            object = this.zze;
            object.getClass();
            return object;
        }
        throw object;
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}

