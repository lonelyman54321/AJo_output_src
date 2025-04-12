/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

public final class zzf {
    private Context zza;
    private long zzb = 0L;

    public static final /* synthetic */ ListenableFuture zzd(Long object, zzdvc zzdvc2, zzfmq zzfmq2, zzfmc zzfmc2, JSONObject object2) {
        String string2 = "isSuccessful";
        zzg zzg2 = null;
        boolean bl2 = object2.optBoolean(string2, false);
        if (bl2) {
            object2 = object2.getString("appSettingsJson");
            zzg2 = zzu.zzo().zzi();
            zzg2.zzv((String)object2);
            if (object != null) {
                object2 = zzu.zzB();
                long l2 = object2.elapsedRealtime();
                long l3 = (Long)object;
                object = "cld_s";
                zzf.zzf(zzdvc2, (String)object, l2 -= l3);
            }
        }
        zzfmc2.zzh(bl2);
        object = zzfmc2.zzn();
        zzfmq2.zzb((zzfmg)object);
        return zzgft.zzh(null);
    }

    public static final /* synthetic */ void zze(zzdvc zzdvc2, Long l2) {
        long l3 = zzu.zzB().elapsedRealtime();
        long l4 = l2;
        zzf.zzf(zzdvc2, "cld_r", l3 -= l4);
    }

    private static final void zzf(zzdvc object, String string2, long l2) {
        if (object != null) {
            Object object2 = zzbep.zzmD;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            boolean bl2 = (Boolean)object2;
            if (bl2) {
                object = ((zzdvc)object).zza();
                object2 = "action";
                object3 = "lat_init";
                ((zzdvb)object).zzb((String)object2, (String)object3);
                String string3 = Long.toString(l2);
                ((zzdvb)object).zzb(string2, string3);
                ((zzdvb)object).zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String string2, Runnable runnable2, zzfmq zzfmq2, zzdvc zzdvc2, Long l2) {
        this.zzb(context, versionInfoParcel, true, null, string2, null, runnable2, zzfmq2, zzdvc2, l2);
    }

    /*
     * Exception decompiling
     */
    public final void zzb(Context var1_1, VersionInfoParcel var2_2, boolean var3_3, zzcbs var4_4, String var5_5, String var6_6, Runnable var7_7, zzfmq var8_8, zzdvc var9_9, Long var10_10) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 376->381)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String string2, zzcbs zzcbs2, zzfmq zzfmq2) {
        Object object = zzcbs2 != null ? zzcbs2.zzb() : null;
        String string3 = object;
        object = this;
        this.zzb(context, versionInfoParcel, false, zzcbs2, string3, string2, null, zzfmq2, null, null);
    }
}

