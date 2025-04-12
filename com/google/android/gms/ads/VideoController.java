/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController$VideoLifecycleCallbacks;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.client.zzfj;
import com.google.android.gms.ads.internal.util.client.zzm;

public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN;
    private final Object zza;
    private zzdq zzb;
    private VideoController$VideoLifecycleCallbacks zzc;

    public VideoController() {
        Object object;
        this.zza = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getPlaybackState() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return 0;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzdq2.zzh();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call getPlaybackState on video controller.";
                    zzm.zzh(string2, remoteException);
                    return 0;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VideoController$VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean hasVideoContent() {
        Object object = this.zza;
        synchronized (object) {
            zzdq zzdq2 = this.zzb;
            if (zzdq2 == null) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isClickToExpandEnabled() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzdq2.zzo();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call isClickToExpandEnabled.";
                    zzm.zzh(string2, remoteException);
                    return false;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isCustomControlsEnabled() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return false;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzdq2.zzp();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call isUsingCustomPlayerControls.";
                    zzm.zzh(string2, remoteException);
                    return false;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isMuted() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    bl2 = true;
                    if (zzdq2 == null) {
                        return bl2;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    return zzdq2.zzq();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call isMuted on video controller.";
                    zzm.zzh(string2, remoteException);
                    return bl2;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void mute(boolean bl2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                try {
                    object2 = this.zzb;
                    if (object2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    object2.zzj(bl2);
                }
                catch (RemoteException remoteException) {
                    object2 = "Unable to call mute on video controller.";
                    zzm.zzh((String)object2, remoteException);
                }
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
    public void pause() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    zzdq2.zzk();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call pause on video controller.";
                    zzm.zzh(string2, remoteException);
                }
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
    public void play() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    zzdq2.zzl();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call play on video controller.";
                    zzm.zzh(string2, remoteException);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setVideoLifecycleCallbacks(VideoController$VideoLifecycleCallbacks var1_1) {
        var2_4 = this.zza;
        synchronized (var2_4) {
            block6: {
                block7: {
                    try {
                        this.zzc = var1_1;
                        var3_5 = this.zzb;
                        if (var3_5 == null) {
                            return;
                        }
                    }
                    catch (Throwable var1_2) {
                        break block6;
                    }
                    if (var1_1 != null) break block7;
                    var1_1 = null;
                    ** GOTO lbl18
                }
                try {
                    var4_6 = new zzfj((VideoController$VideoLifecycleCallbacks)var1_1);
                    var1_1 = var4_6;
lbl18:
                    // 2 sources

                    var3_5.zzm((zzdt)var1_1);
                }
                catch (RemoteException var1_3) {
                    var3_5 = "Unable to call setVideoLifecycleCallbacks on video controller.";
                    zzm.zzh((String)var3_5, var1_3);
                }
                return;
            }
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void stop() {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                zzdq zzdq2;
                try {
                    zzdq2 = this.zzb;
                    if (zzdq2 == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                try {
                    zzdq2.zzn();
                }
                catch (RemoteException remoteException) {
                    String string2 = "Unable to call stop on video controller.";
                    zzm.zzh(string2, remoteException);
                }
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
    public final zzdq zza() {
        Object object = this.zza;
        synchronized (object) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzdq object) {
        Object object2 = this.zza;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        this.zzb = object;
                        object = this.zzc;
                        if (object == null) break block3;
                        this.setVideoLifecycleCallbacks((VideoController$VideoLifecycleCallbacks)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

