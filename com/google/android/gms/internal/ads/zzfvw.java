/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 */
package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.internal.ads.zzfvv;
import com.google.android.gms.internal.ads.zzfwp;

final class zzfvw
extends zzfwp {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfvw(IBinder iBinder, String string2, int n3, float f5, int n4, int n7, String string3, int n8, String string4, String string5, String string6, zzfvv zzfvv2) {
        this.zza = iBinder;
        this.zzb = string2;
        this.zzc = n3;
        this.zzd = f5;
        this.zze = n8;
        this.zzf = string5;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                Object object2;
                Object object3;
                int n3;
                block5: {
                    float f5;
                    float f6;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    n3 = object instanceof zzfwp;
                    if (n3 == 0 || (n3 = (object3 = this.zza).equals(object2 = ((zzfwp)(object = (zzfwp)object)).zzf())) == 0 || !((object3 = this.zzb) == null ? (object3 = ((zzfwp)object).zzh()) == null : (n3 = ((String)object3).equals(object2 = ((zzfwp)object).zzh())) != 0)) break block4;
                    n3 = this.zzc;
                    int n4 = ((zzfwp)object).zzc();
                    if (n3 != n4 || (n3 = Float.floatToIntBits(f6 = this.zzd)) != (n4 = Float.floatToIntBits(f5 = ((zzfwp)object).zza()))) break block4;
                    ((zzfwp)object).zzb();
                    ((zzfwp)object).zzd();
                    ((zzfwp)object).zzj();
                    n3 = this.zze;
                    n4 = ((zzfwp)object).zze();
                    if (n3 != n4) break block4;
                    ((zzfwp)object).zzi();
                    object3 = this.zzf;
                    if (object3 != null) break block5;
                    object3 = ((zzfwp)object).zzg();
                    if (object3 != null) break block4;
                    break block6;
                }
                object2 = ((zzfwp)object).zzg();
                n3 = (int)(((String)object3).equals(object2) ? 1 : 0);
                if (n3 == 0) break block4;
            }
            ((zzfwp)object).zzk();
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        float f5;
        int n3;
        IBinder iBinder = this.zza;
        int n4 = iBinder.hashCode();
        int n7 = 1000003;
        n4 ^= n7;
        String string2 = this.zzb;
        int n8 = 0;
        if (string2 == null) {
            n3 = 0;
            f5 = 0.0f;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 * n7 ^ n3) * n7;
        n3 = this.zzc;
        n4 = (n4 ^ n3) * n7;
        f5 = this.zzd;
        n3 = Float.floatToIntBits(f5);
        n4 ^= n3;
        n3 = this.zze;
        String string3 = this.zzf;
        if (string3 != null) {
            n8 = string3.hashCode();
        }
        return ((n4 * 1525764945 ^ n3) * -721379959 ^ n8) * n7;
    }

    public final String toString() {
        CharSequence charSequence = this.zza.toString();
        charSequence = Gn.a("OverlayDisplayShowRequest{windowToken=", (String)charSequence, ", appId=");
        String string2 = this.zzb;
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", layoutGravity=");
        int n3 = this.zzc;
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", layoutVerticalMargin=");
        float f5 = this.zzd;
        ((StringBuilder)charSequence).append(f5);
        ((StringBuilder)charSequence).append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        n3 = this.zze;
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", deeplinkUrl=null, adFieldEnifd=");
        string2 = this.zzf;
        return h30_0.a((StringBuilder)charSequence, string2, ", thirdPartyAuthCallerId=null}");
    }

    public final float zza() {
        return this.zzd;
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return 0;
    }

    public final int zze() {
        return this.zze;
    }

    public final IBinder zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return null;
    }

    public final String zzj() {
        return null;
    }

    public final String zzk() {
        return null;
    }
}

