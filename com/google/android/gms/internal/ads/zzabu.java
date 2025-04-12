/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.display.DisplayManager
 *  android.view.Display
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabm;
import com.google.android.gms.internal.ads.zzabr;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzabt;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;

public final class zzabu {
    private final zzabe zza;
    private final zzabs zzb;
    private final zzabt zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    /*
     * Enabled aggressive block sorting
     */
    public zzabu(Context context) {
        long l2;
        Object object;
        Object object2 = new zzabe();
        this.zza = object2;
        object2 = null;
        object = context != null && (context = (DisplayManager)context.getSystemService((String)(object = "display"))) != null ? new zzabs(this, (DisplayManager)context) : null;
        this.zzb = object;
        if (object != null) {
            object2 = zzabt.zza();
        }
        this.zzc = object2;
        this.zzk = l2 = -9223372036854775807L;
        this.zzl = l2;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzabu zzabu2, Display display) {
        long l2;
        if (display != null) {
            long l3;
            double d2 = display.getRefreshRate();
            zzabu2.zzk = l3 = (long)(1.0E9 / d2);
            zzabu2.zzl = l3 = l3 * (long)80 / (long)100;
            return;
        }
        zzfk.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzabu2.zzk = l2 = -9223372036854775807L;
        zzabu2.zzl = l2;
    }

    private final void zzk() {
        int n3;
        Surface surface;
        int n4 = zzgd.zza;
        int n7 = 30;
        float f5 = 4.2E-44f;
        if (n4 >= n7 && (surface = this.zze) != null && (n7 = this.zzj) != (n3 = -1 << -1)) {
            f5 = this.zzh;
            n3 = 0;
            float f6 = f5 - 0.0f;
            n7 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
            if (n7 != 0) {
                this.zzh = 0.0f;
                zzabr.zza(surface, 0.0f);
            }
        }
    }

    private final void zzl() {
        long l2;
        this.zzm = 0L;
        this.zzp = l2 = (long)-1;
        this.zzn = l2;
    }

    private final void zzm() {
        block6: {
            float f5;
            Object object;
            int n3;
            block8: {
                zzabe zzabe2;
                float f6;
                Object object2;
                int n4;
                block7: {
                    long l2;
                    long l3;
                    long l4;
                    n3 = zzgd.zza;
                    n4 = 30;
                    float f7 = 4.2E-44f;
                    if (n3 < n4 || (object = this.zze) == null) break block6;
                    object = this.zza;
                    n3 = (int)(((zzabe)object).zzg() ? 1 : 0);
                    if (n3 != 0) {
                        object = this.zza;
                        f5 = ((zzabe)object).zza();
                    } else {
                        f5 = this.zzf;
                    }
                    float f8 = this.zzg;
                    float f11 = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
                    if (f11 == false) break block6;
                    f11 = -1082130432;
                    float f12 = -1.0f;
                    float f14 = f5 - f12;
                    object2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (object2 == false || (f6 = f8 == f12 ? 0 : (f8 > f12 ? 1 : -1)) == false) break block7;
                    zzabe zzabe3 = this.zza;
                    n4 = (int)(zzabe3.zzg() ? 1 : 0);
                    f6 = 1065353216;
                    f8 = 1.0f;
                    if (n4 != 0 && (n4 = (int)((l4 = (l3 = (zzabe3 = this.zza).zzd()) - (l2 = 5000000000L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) >= 0) {
                        f6 = 1017370378;
                        f8 = 0.02f;
                    }
                    f7 = this.zzg;
                    float f15 = (f7 = Math.abs(f5 - f7)) - f8;
                    n4 = (int)(f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1));
                    if (n4 < 0) break block6;
                    break block8;
                }
                if (object2 == false && (f6 = (float)(zzabe2 = this.zza).zzb()) < n4) break block6;
            }
            this.zzg = f5;
            n3 = 0;
            f5 = 0.0f;
            object = null;
            this.zzn(false);
        }
    }

    private final void zzn(boolean bl2) {
        Surface surface;
        int n3 = zzgd.zza;
        int n4 = 30;
        float f5 = 4.2E-44f;
        if (n3 >= n4 && (surface = this.zze) != null) {
            n4 = this.zzj;
            int n7 = -1 << -1;
            float f6 = -0.0f;
            if (n4 != n7) {
                float f7;
                float f8;
                float f11;
                float f12;
                float f14;
                n4 = (int)(this.zzd ? 1 : 0);
                n7 = 0;
                f6 = 0.0f;
                if (n4 != 0 && (f14 = (f12 = (f5 = this.zzg) - (f11 = -1.0f)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) != false) {
                    f6 = this.zzi * f5;
                }
                if (bl2 || (bl2 = (f8 = (f7 = this.zzh) - f6) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) {
                    this.zzh = f6;
                    zzabr.zza(surface, f6);
                }
            }
        }
    }

    public final long zza(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        long l12;
        long l14;
        long l15;
        long l16;
        Object object;
        Object object2;
        long l17 = this.zzp;
        long l18 = -1;
        long l19 = l17 - l18;
        Object object3 = l19 == 0L ? 0 : (l19 < 0L ? -1 : 1);
        if (object3 != false && (object2 = ((zzabe)(object = this.zza)).zzg()) != 0) {
            object = this.zza;
            l17 = ((zzabe)object).zzc();
            l18 = this.zzq;
            l16 = this.zzm;
            l15 = this.zzp;
            l16 = (l16 - l15) * l17;
            float f5 = this.zzi;
            float f6 = (float)l16 / f5;
            l17 = (long)f6;
            long l20 = (l17 = Math.abs(l2 - (l18 += l17))) - (l16 = 20000000L);
            Object object4 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
            if (object4 > 0) {
                this.zzl();
            } else {
                l2 = l18;
            }
        }
        this.zzn = l17 = this.zzm;
        this.zzo = l2;
        object = this.zzc;
        if (object != null && (l14 = (l12 = (l8 = this.zzk) - (l7 = -9223372036854775807L)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false && (l4 = (l3 = (l17 = ((zzabt)object).zza) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
            l18 = this.zzk;
            l16 = (l2 - l17) / l18 * l18 + l17;
            long l21 = l2 - l16;
            object2 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
            if (object2 <= 0) {
                l17 = l16 - l18;
            } else {
                l18 += l16;
                l17 = l16;
                l16 = l18;
            }
            l18 = this.zzl;
            l15 = l16 - l2;
            long l22 = l15 - (l2 -= l17);
            long l23 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
            if (l23 >= 0) {
                l16 = l17;
            }
            return l16 - l18;
        }
        return l2;
    }

    public final void zzc(float f5) {
        this.zzf = f5;
        this.zza.zzf();
        this.zzm();
    }

    public final void zzd(long l2) {
        long l3 = this.zzn;
        long l4 = -1;
        long l7 = l3 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            this.zzp = l3;
            this.zzq = l3 = this.zzo;
        }
        this.zzm = l3 = this.zzm + 1L;
        zzabe zzabe2 = this.zza;
        zzabe2.zze(l2 *= 1000L);
        this.zzm();
    }

    public final void zze(float f5) {
        this.zzi = f5;
        this.zzl();
        this.zzn(false);
    }

    public final void zzf() {
        this.zzl();
    }

    public final void zzg() {
        boolean bl2;
        this.zzd = bl2 = true;
        this.zzl();
        Object object = this.zzb;
        if (object != null) {
            object = this.zzc;
            object.getClass();
            ((zzabt)object).zzb();
            object = this.zzb;
            ((zzabs)object).zza();
        }
        this.zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        Object object = this.zzb;
        if (object != null) {
            ((zzabs)object).zzb();
            object = this.zzc;
            object.getClass();
            ((zzabt)object).zzc();
        }
        this.zzk();
    }

    public final void zzi(Surface surface) {
        Surface surface2;
        boolean bl2 = true;
        boolean bl3 = surface instanceof zzabm;
        if (bl2 == bl3) {
            surface = null;
        }
        if ((surface2 = this.zze) == surface) {
            return;
        }
        this.zzk();
        this.zze = surface;
        this.zzn(bl2);
    }

    public final void zzj(int n3) {
        int n4 = this.zzj;
        if (n4 == n3) {
            return;
        }
        this.zzj = n3;
        this.zzn(true);
    }
}

