/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzefp;
import com.google.android.gms.internal.ads.zzegm;

final class zzefq
extends zzegm {
    private final Activity zza;
    private final zzm zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzefq(Activity activity, zzm zzm2, String string2, String string3, zzefp zzefp2) {
        this.zza = activity;
        this.zzb = zzm2;
        this.zzc = string2;
        this.zzd = string3;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                Object object2;
                block5: {
                    Object object3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl3 = object instanceof zzegm;
                    if (!bl3 || !(bl3 = (object2 = this.zza).equals(object3 = ((zzegm)(object = (zzegm)object)).zza())) || !((object2 = this.zzb) == null ? (object2 = ((zzegm)object).zzb()) == null : (bl3 = object2.equals(object3 = ((zzegm)object).zzb()))) || !((object2 = this.zzc) == null ? (object2 = ((zzegm)object).zzc()) == null : (bl3 = ((String)object2).equals(object3 = ((zzegm)object).zzc())))) break block4;
                    object2 = this.zzd;
                    if (object2 != null) break block5;
                    if ((object = ((zzegm)object).zzd()) != null) break block4;
                    break block6;
                }
                boolean bl4 = ((String)object2).equals(object = ((zzegm)object).zzd());
                if (!bl4) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        Activity activity = this.zza;
        int n4 = activity.hashCode();
        int n7 = 1000003;
        n4 ^= n7;
        Object object = this.zzb;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 * n7 ^ n3) * n7;
        object = this.zzc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 ^ n3) * n7;
        String string2 = this.zzd;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 ^ n8;
    }

    public final String toString() {
        Object object = this.zzb;
        String string2 = this.zza.toString();
        object = String.valueOf(object);
        object = og_1.a("OfflineUtilsParams{activity=", string2, ", adOverlay=", (String)object, ", gwsQueryId=");
        string2 = this.zzc;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", uri=");
        string2 = this.zzd;
        return h30_0.a((StringBuilder)object, string2, "}");
    }

    public final Activity zza() {
        return this.zza;
    }

    public final zzm zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}

