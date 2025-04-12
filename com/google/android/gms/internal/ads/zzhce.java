/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhfa;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzhce
extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzhce(Iterable object) {
        int n3;
        Iterator iterator;
        this.zza = iterator = object.iterator();
        iterator = null;
        this.zzc = 0;
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            ByteBuffer cfr_ignored_0 = (ByteBuffer)object.next();
            this.zzc = n3 = this.zzc + 1;
        }
        this.zzd = -1;
        boolean bl2 = this.zzb();
        if (!bl2) {
            long l2;
            this.zzb = object = zzhcb.zze;
            this.zzd = 0;
            this.zze = 0;
            this.zzi = l2 = 0L;
        }
    }

    private final void zza(int n3) {
        int n4;
        this.zze = n4 = this.zze + n3;
        ByteBuffer byteBuffer = this.zzb;
        n3 = byteBuffer.limit();
        if (n4 == n3) {
            this.zzb();
        }
    }

    private final boolean zzb() {
        int n3 = this.zzd;
        int n4 = 1;
        this.zzd = n3 += n4;
        Object object = this.zza;
        n3 = (int)(object.hasNext() ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        this.zzb = object = (ByteBuffer)this.zza.next();
        this.zze = n3 = ((Buffer)object).position();
        object = this.zzb;
        n3 = (int)(((ByteBuffer)object).hasArray() ? 1 : 0);
        if (n3 != 0) {
            this.zzf = n4;
            object = this.zzb.array();
            this.zzg = (byte[])object;
            object = this.zzb;
            this.zzh = n3 = ((ByteBuffer)object).arrayOffset();
        } else {
            long l2;
            this.zzf = false;
            this.zzi = l2 = zzhfa.zze(this.zzb);
            n3 = 0;
            object = null;
            this.zzg = null;
        }
        return n4 != 0;
    }

    public final int read() {
        int n3 = this.zzd;
        int n4 = this.zzc;
        if (n3 == n4) {
            return -1;
        }
        n3 = (int)(this.zzf ? 1 : 0);
        n4 = 1;
        if (n3 != 0) {
            byte[] byArray = this.zzg;
            int n7 = this.zze;
            int n8 = this.zzh;
            n3 = byArray[n7 += n8] & 0xFF;
            this.zza(n4);
            return n3;
        }
        long l2 = this.zze;
        long l3 = this.zzi;
        n3 = zzhfa.zza(l2 + l3) & 0xFF;
        this.zza(n4);
        return n3;
    }

    public final int read(byte[] object, int n3, int n4) {
        int n7 = this.zzd;
        int n8 = this.zzc;
        if (n7 == n8) {
            return -1;
        }
        Object object2 = this.zzb;
        n7 = ((Buffer)object2).limit();
        n8 = this.zze;
        if (n4 > (n7 -= n8)) {
            n4 = n7;
        }
        if ((n7 = (int)(this.zzf ? 1 : 0)) != 0) {
            object2 = this.zzg;
            int n10 = this.zzh;
            System.arraycopy(object2, n8 += n10, object, n3, n4);
            this.zza(n4);
        } else {
            object2 = this.zzb;
            n7 = ((Buffer)object2).position();
            ByteBuffer byteBuffer = this.zzb;
            int n14 = this.zze;
            ((Buffer)byteBuffer).position(n14);
            byteBuffer = this.zzb;
            byteBuffer.get((byte[])object, n3, n4);
            object = this.zzb;
            ((Buffer)object).position(n7);
            this.zza(n4);
        }
        return n4;
    }
}

