/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.clearcut;

import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.ClearcutLogger$zzb;
import com.google.android.gms.clearcut.zza;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.clearcut.zzaa;
import com.google.android.gms.internal.clearcut.zzge$zzv$zzb;
import com.google.android.gms.internal.clearcut.zzha;
import com.google.android.gms.internal.clearcut.zzr;
import java.util.ArrayList;
import java.util.TimeZone;

public class ClearcutLogger$LogEventBuilder {
    private final zzha zzaa;
    private boolean zzab;
    private final /* synthetic */ ClearcutLogger zzac;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private zzge$zzv$zzb zzo;
    private final ClearcutLogger$zzb zzt;
    private ArrayList zzu;
    private ArrayList zzv;
    private ArrayList zzw;
    private ArrayList zzx;
    private ArrayList zzy;
    private boolean zzz;

    private ClearcutLogger$LogEventBuilder(ClearcutLogger clearcutLogger, byte[] byArray) {
        this(clearcutLogger, byArray, (ClearcutLogger$zzb)null);
    }

    private ClearcutLogger$LogEventBuilder(ClearcutLogger object, byte[] byArray, ClearcutLogger$zzb object2) {
        long l2;
        boolean bl2;
        boolean bl3;
        int n3;
        this.zzac = object;
        this.zzk = n3 = ClearcutLogger.zza((ClearcutLogger)object);
        this.zzj = object2 = ClearcutLogger.zzb((ClearcutLogger)object);
        this.zzl = object2 = ClearcutLogger.zzc((ClearcutLogger)object);
        n3 = 0;
        object2 = null;
        this.zzm = null;
        Object object3 = ClearcutLogger.zzd((ClearcutLogger)object);
        this.zzo = object3;
        this.zzu = null;
        this.zzv = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = bl3 = true;
        this.zzaa = object3 = new zzha();
        this.zzab = false;
        Object object4 = ClearcutLogger.zzc((ClearcutLogger)object);
        this.zzl = object4;
        this.zzm = null;
        ((zzha)object3).zzbkc = bl2 = com.google.android.gms.internal.clearcut.zzaa.zze(ClearcutLogger.zze((ClearcutLogger)object));
        ((zzha)object3).zzbjf = l2 = ClearcutLogger.zzf((ClearcutLogger)object).currentTimeMillis();
        object4 = ClearcutLogger.zzf((ClearcutLogger)object);
        ((zzha)object3).zzbjg = l2 = object4.elapsedRealtime();
        ClearcutLogger.zzg((ClearcutLogger)object);
        l2 = ((zzha)object3).zzbjf;
        object = TimeZone.getDefault();
        int n4 = ((TimeZone)object).getOffset(l2) / 1000;
        ((zzha)object3).zzbju = l2 = (long)n4;
        if (byArray != null) {
            ((zzha)object3).zzbjp = byArray;
        }
        this.zzt = null;
    }

    public /* synthetic */ ClearcutLogger$LogEventBuilder(ClearcutLogger clearcutLogger, byte[] byArray, zza zza2) {
        this(clearcutLogger, byArray);
    }

    public void log() {
        boolean bl2 = this.zzab;
        if (!bl2) {
            zze zze2;
            zzr zzr2;
            this.zzab = bl2 = true;
            Object object = ClearcutLogger.zzi(this.zzac);
            int n3 = ClearcutLogger.zzj(this.zzac);
            int n4 = this.zzk;
            String string2 = this.zzj;
            Object object2 = this.zzl;
            String string3 = this.zzm;
            boolean bl3 = ClearcutLogger.zzh(this.zzac);
            zzge$zzv$zzb zzge$zzv$zzb = this.zzo;
            Object object3 = zzr2;
            zzr2 = new zzr((String)object, n3, n4, string2, (String)object2, string3, bl3, zzge$zzv$zzb);
            zzha zzha2 = this.zzaa;
            object2 = ClearcutLogger.zzb(null);
            int[] nArray = ClearcutLogger.zzb(null);
            boolean bl4 = this.zzz;
            n4 = 0;
            string2 = null;
            string3 = null;
            zzge$zzv$zzb = null;
            object3 = zze2;
            object = zzr2;
            zzr2 = null;
            zze2 = new zze((zzr)object, zzha2, null, null, (int[])object2, null, nArray, null, null, bl4);
            object3 = ClearcutLogger.zzk(this.zzac);
            boolean bl5 = object3.zza(zze2);
            if (bl5) {
                ClearcutLogger.zzl(this.zzac).zzb(zze2);
                return;
            }
            PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, null);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("do not reuse LogEventBuilder");
        throw illegalStateException;
    }

    public ClearcutLogger$LogEventBuilder setEventCode(int n3) {
        this.zzaa.zzbji = n3;
        return this;
    }
}

