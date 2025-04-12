/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.zzceh;

public final class zzcei
implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzceh zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcei(Context context, zzceh zzceh2) {
        context = (AudioManager)context.getSystemService("audio");
        this.zza = context;
        this.zzb = zzceh2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void zzf() {
        boolean bl2;
        boolean bl3;
        boolean bl4 = this.zzd;
        boolean bl5 = false;
        int n3 = 1;
        if (bl4 && !(bl3 = this.zze)) {
            float f5 = this.zzf;
            int n4 = 0;
            float f6 = f5 - 0.0f;
            Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            if (object > 0) {
                boolean bl6 = this.zzc;
                if (bl6) return;
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    n4 = 3;
                    int n7 = 2;
                    int n8 = audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener)this, n4, n7);
                    if (n8 == n3) {
                        bl5 = true;
                    }
                    this.zzc = bl5;
                }
                this.zzb.zzn();
                return;
            }
        }
        if (!(bl2 = this.zzc)) return;
        Object object = this.zza;
        if (object != null) {
            int n10 = object.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)this);
            if (n10 == 0) {
                bl5 = true;
            }
            this.zzc = bl5;
        }
        object = this.zzb;
        object.zzn();
    }

    public final void onAudioFocusChange(int n3) {
        n3 = n3 > 0 ? 1 : 0;
        this.zzc = n3;
        this.zzb.zzn();
    }

    public final float zza() {
        float f5;
        boolean bl2 = this.zze;
        if (bl2) {
            bl2 = false;
            f5 = 0.0f;
        } else {
            f5 = this.zzf;
        }
        boolean bl3 = this.zzc;
        if (bl3) {
            return f5;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        this.zzf();
    }

    public final void zzc() {
        this.zzd = false;
        this.zzf();
    }

    public final void zzd(boolean bl2) {
        this.zze = bl2;
        this.zzf();
    }

    public final void zze(float f5) {
        this.zzf = f5;
        this.zzf();
    }
}

