/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzit;
import com.google.android.gms.internal.ads.zziu;
import com.google.android.gms.internal.ads.zzks;
import com.google.android.gms.internal.ads.zzkw;

final class zziv {
    private final AudioManager zza;
    private final zzit zzb;
    private zziu zzc;
    private int zzd;
    private float zze = 1.0f;

    public zziv(Context object, Handler handler, zziu zziu2) {
        object = (AudioManager)object.getApplicationContext().getSystemService("audio");
        object.getClass();
        this.zza = object;
        this.zzc = zziu2;
        super(this, handler);
        this.zzb = object;
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zziv zziv2, int n3) {
        int n4 = -3;
        int n7 = -2;
        if (n3 != n4 && n3 != n7) {
            n4 = -1;
            if (n3 != n4) {
                n4 = 1;
                if (n3 != n4) {
                    w12_0.a(n3, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                zziv2.zzg(n4);
                zziv2.zzf(n4);
                return;
            }
            zziv2.zzf(n4);
            zziv2.zze();
            return;
        }
        if (n3 != n7) {
            zziv2.zzg(3);
            return;
        }
        zziv2.zzf(0);
        zziv2.zzg(2);
    }

    private final void zze() {
        int n3 = this.zzd;
        if (n3 == 0) {
            return;
        }
        n3 = zzgd.zza;
        int n4 = 26;
        if (n3 < n4) {
            AudioManager audioManager = this.zza;
            zzit zzit2 = this.zzb;
            audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)zzit2);
        }
        this.zzg(0);
    }

    private final void zzf(int n3) {
        Object object = this.zzc;
        if (object != null) {
            object = (zzks)object;
            zzkw zzkw2 = ((zzks)object).zza;
            boolean bl2 = zzkw2.zzv();
            int n4 = zzkw.zzC(bl2, n3);
            object = ((zzks)object).zza;
            zzkw.zzR((zzkw)object, bl2, n3, n4);
        }
    }

    private final void zzg(int n3) {
        int n4 = this.zzd;
        if (n4 != n3) {
            float f5;
            this.zzd = n3;
            n4 = 3;
            float f6 = 4.2E-45f;
            if (n3 == n4) {
                n3 = 1045220557;
                f5 = 0.2f;
            } else {
                n3 = 1065353216;
                f5 = 1.0f;
            }
            f6 = this.zze;
            n4 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
            if (n4 != 0) {
                this.zze = f5;
                Object object = this.zzc;
                if (object != null) {
                    object = ((zzks)object).zza;
                    zzkw.zzO((zzkw)object);
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean bl2, int n3) {
        this.zze();
        if (bl2) {
            return 1;
        }
        return -1;
    }

    public final void zzd() {
        this.zzc = null;
        this.zze();
    }
}

