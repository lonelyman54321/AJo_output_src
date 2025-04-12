/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpo;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzccu;

public final class zzbps
extends zzccu {
    private final Object zza;
    private final zzbd zzb;
    private boolean zzc;
    private int zzd;

    public zzbps(zzbd zzbd2) {
        Object object;
        this.zza = object = new Object();
        this.zzb = zzbd2;
        this.zzc = false;
        this.zzd = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbpn zza() {
        zzbpn zzbpn2 = new zzbpn(this);
        zze.zza("createNewReference: Trying to acquire lock");
        Object object = this.zza;
        synchronized (object) {
            Object object2 = "createNewReference: Lock acquired";
            zze.zza((String)object2);
            object2 = new zzbpo(this, zzbpn2);
            zzbpp zzbpp2 = new zzbpp(this, zzbpn2);
            this.zzj((zzccr)object2, zzbpp2);
            int n3 = this.zzd;
            int n4 = 1;
            if (n3 >= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object2 = null;
            }
            Preconditions.checkState(n3 != 0);
            this.zzd = n3 = this.zzd + n4;
        }
        zze.zza("createNewReference: Lock released");
        return zzbpn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        Object object = this.zza;
        synchronized (object) {
            String string2 = "markAsDestroyable: Lock acquired";
            zze.zza(string2);
            boolean bl2 = this.zzd;
            boolean bl3 = true;
            if (bl2 >= false) {
                bl2 = true;
            } else {
                bl2 = false;
                string2 = null;
            }
            Preconditions.checkState(bl2);
            string2 = "Releasing root reference. JS Engine will be destroyed once other references are released.";
            zze.zza(string2);
            this.zzc = bl3;
            this.zzc();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzc() {
        block7: {
            Object object2;
            block6: {
                zze.zza("maybeDestroy: Trying to acquire lock");
                Object object = this.zza;
                // MONITORENTER : object
                object2 = "maybeDestroy: Lock acquired";
                zze.zza((String)object2);
                int n3 = this.zzd;
                if (n3 >= 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                Preconditions.checkState(n3 != 0);
                n3 = this.zzc;
                if (n3 == 0 || (n3 = this.zzd) != 0) break block6;
                object2 = "No reference is left (including root). Cleaning up engine.";
                zze.zza((String)object2);
                object2 = new zzbpr(this);
                zzccq zzccq2 = new zzccq();
                this.zzj((zzccr)object2, zzccq2);
                break block7;
            }
            object2 = "There are still references to the engine. Not destroying.";
            zze.zza((String)object2);
        }
        // MONITOREXIT : object
        zze.zza("maybeDestroy: Lock released");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        Object object = this.zza;
        synchronized (object) {
            String string2 = "releaseOneReference: Lock acquired";
            zze.zza(string2);
            int n3 = this.zzd;
            if (n3 > 0) {
                n3 = 1;
            } else {
                n3 = 0;
                string2 = null;
            }
            Preconditions.checkState(n3 != 0);
            string2 = "Releasing 1 reference for JS Engine";
            zze.zza(string2);
            this.zzd = n3 = this.zzd + -1;
            this.zzc();
        }
        zze.zza("releaseOneReference: Lock released");
    }
}

