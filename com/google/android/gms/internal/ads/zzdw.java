/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgbc;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.List;

public final class zzdw {
    private final zzgbc zza;
    private final List zzb;
    private ByteBuffer[] zzc;
    private zzdx zzd;
    private zzdx zze;
    private boolean zzf;

    public zzdw(zzgbc abstractCollection) {
        this.zza = abstractCollection;
        this.zzb = abstractCollection;
        Object object = new ByteBuffer[]{};
        this.zzc = object;
        this.zzd = object = zzdx.zza;
        this.zze = object;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length + -1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean bl2;
        do {
            int n3;
            bl2 = false;
            for (int i3 = 0; i3 <= (n3 = this.zzi()); ++i3) {
                int n4;
                Object object;
                Object object2 = this.zzc[i3];
                n3 = (int)(((Buffer)object2).hasRemaining() ? 1 : 0);
                if (n3 != 0) continue;
                object2 = (zzdz)this.zzb.get(i3);
                int n7 = object2.zzh();
                if (n7 != 0) {
                    object2 = this.zzc[i3];
                    n3 = (int)(((Buffer)object2).hasRemaining() ? 1 : 0);
                    if (n3 != 0 || i3 >= (n3 = this.zzi())) continue;
                    object2 = this.zzb;
                    n7 = i3 + 1;
                    object2 = (zzdz)object2.get(n7);
                    object2.zzd();
                    continue;
                }
                if (i3 > 0) {
                    object = this.zzc;
                    n4 = i3 + -1;
                    object = object[n4];
                } else {
                    n7 = byteBuffer.hasRemaining();
                    object = n7 != 0 ? byteBuffer : zzdz.zza;
                }
                n4 = ((Buffer)object).remaining();
                long l2 = n4;
                object2.zze((ByteBuffer)object);
                ByteBuffer[] byteBufferArray = this.zzc;
                byteBufferArray[i3] = object2 = object2.zzb();
                n3 = ((Buffer)object).remaining();
                long l3 = n3;
                l2 -= l3;
                l3 = 0L;
                boolean bl3 = true;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0 && (n3 = (int)(((Buffer)(object2 = this.zzc[i3])).hasRemaining() ? 1 : 0)) == 0) {
                    bl3 = false;
                    byteBufferArray = null;
                }
                bl2 |= bl3;
            }
        } while (bl2);
    }

    public final boolean equals(Object object) {
        zzgbc zzgbc2;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof zzdw;
        if (n4 == 0) {
            return false;
        }
        object = (zzdw)object;
        zzgbc zzgbc3 = this.zza;
        n4 = zzgbc3.size();
        if (n4 == (n3 = (zzgbc2 = ((zzdw)object).zza).size())) {
            zzgbc3 = null;
            for (n4 = 0; n4 < (n3 = (zzgbc2 = this.zza).size()); ++n4) {
                Object e2;
                zzgbc2 = this.zza.get(n4);
                if (zzgbc2 == (e2 = ((zzdw)object).zza.get(n4))) continue;
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdx zza(zzdx zzdx2) {
        Object object = zzdx.zza;
        int n3 = zzdx2.equals(object);
        if (n3 == 0) {
            Object object2;
            int n4;
            object = null;
            for (n3 = 0; n3 < (n4 = ((AbstractCollection)(object2 = this.zza)).size()); ++n3) {
                object2 = (zzdz)this.zza.get(n3);
                zzdx zzdx3 = object2.zza(zzdx2);
                n4 = (int)(object2.zzg() ? 1 : 0);
                if (n4 == 0) continue;
                zzdx2 = zzdx.zza;
                boolean bl2 = zzdx3.equals(zzdx2) ^ true;
                zzeq.zzf(bl2);
                zzdx2 = zzdx3;
            }
            this.zze = zzdx2;
            return zzdx2;
        }
        object = new zzdy("Unhandled input format:", zzdx2);
        throw object;
    }

    public final ByteBuffer zzb() {
        boolean bl2 = this.zzh();
        if (!bl2) {
            return zzdz.zza;
        }
        Object object = this.zzc;
        int n3 = this.zzi();
        if ((n3 = (int)(((Buffer)(object = object[n3])).hasRemaining() ? 1 : 0)) != 0) {
            return object;
        }
        object = zzdz.zza;
        this.zzj((ByteBuffer)object);
        object = this.zzc;
        n3 = this.zzi();
        return object[n3];
    }

    public final void zzc() {
        Object object;
        int n3;
        int n4;
        zzdx zzdx2;
        this.zzb.clear();
        this.zzd = zzdx2 = this.zze;
        int n7 = 0;
        zzdx2 = null;
        this.zzf = false;
        ByteBuffer[] byteBufferArray = null;
        for (n4 = 0; n4 < (n3 = ((AbstractCollection)(object = this.zza)).size()); ++n4) {
            object = (zzdz)this.zza.get(n4);
            object.zzc();
            boolean bl2 = object.zzg();
            if (!bl2) continue;
            List list = this.zzb;
            list.add(object);
        }
        n4 = this.zzb.size();
        byteBufferArray = new ByteBuffer[n4];
        this.zzc = byteBufferArray;
        while (n7 <= (n4 = this.zzi())) {
            byteBufferArray = this.zzc;
            byteBufferArray[n7] = object = ((zzdz)this.zzb.get(n7)).zzb();
            ++n7;
        }
    }

    public final void zzd() {
        boolean bl2 = this.zzh();
        if (bl2 && !(bl2 = this.zzf)) {
            this.zzf = bl2 = true;
            zzdz zzdz2 = (zzdz)this.zzb.get(0);
            zzdz2.zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        boolean bl2 = this.zzh();
        if (bl2 && !(bl2 = this.zzf)) {
            this.zzj(byteBuffer);
        }
    }

    public final void zzf() {
        Object object;
        int n3;
        Object object2 = null;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.zza)).size()); ++i3) {
            object = (zzdz)this.zza.get(i3);
            object.zzc();
            object.zzf();
        }
        object2 = new ByteBuffer[]{};
        this.zzc = object2;
        this.zzd = object2 = zzdx.zza;
        this.zze = object2;
        this.zzf = false;
    }

    public final boolean zzg() {
        boolean bl2 = this.zzf;
        if (bl2) {
            Object object = this.zzb;
            int n3 = this.zzi();
            bl2 = (object = (zzdz)object.get(n3)).zzh();
            if (bl2) {
                object = this.zzc;
                n3 = this.zzi();
                bl2 = ((Buffer)(object = object[n3])).hasRemaining();
                if (!bl2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zzh() {
        List list = this.zzb;
        boolean bl2 = list.isEmpty();
        return !bl2;
    }
}

