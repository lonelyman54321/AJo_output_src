/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Build
 */
package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbdv$zzaf;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zza;
import com.google.android.gms.internal.ads.zzbdv$zzaf$zzc;
import com.google.android.gms.internal.ads.zzbdv$zzar;
import com.google.android.gms.internal.ads.zzbdv$zzar$zza;
import com.google.android.gms.internal.ads.zzbdv$zzq;
import com.google.android.gms.internal.ads.zzeer;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzefj;
import com.google.android.gms.internal.ads.zzefk;
import com.google.android.gms.internal.ads.zzefl;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhcd;
import java.util.ArrayList;

public final class zzefm {
    private final zzbdm zza;
    private final Context zzb;
    private final zzeer zzc;
    private final VersionInfoParcel zzd;

    public zzefm(Context context, VersionInfoParcel versionInfoParcel, zzbdm zzbdm2, zzeer zzeer2) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbdm2;
        this.zzc = zzeer2;
    }

    public final /* synthetic */ Void zza(boolean bl2, SQLiteDatabase sQLiteDatabase) {
        zzefm zzefm2 = this;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (bl2) {
            Context context = this.zzb;
            String string2 = "OfflineUpload.db";
            context.deleteDatabase(string2);
        } else {
            long l2;
            Object object;
            int n3;
            ArrayList<Context> arrayList = new ArrayList<Context>();
            String string3 = "serialized_proto_data";
            Object object2 = new String[]{string3};
            int n4 = 0;
            zzbdv$zzaf$zza zzbdv$zzaf$zza = null;
            Object object3 = "offline_signal_contents";
            int n7 = 0;
            Object object4 = null;
            String string4 = null;
            Object object5 = sQLiteDatabase;
            object5 = sQLiteDatabase.query((String)object3, (String[])object2, null, null, null, null, null);
            while ((n3 = object5.moveToNext()) != 0) {
                n3 = object5.getColumnIndexOrThrow(string3);
                object = object5.getBlob(n3);
                object = zzbdv$zzaf$zza.zzx((byte[])object);
                try {
                    arrayList.add((Context)object);
                }
                catch (zzhcd zzhcd2) {
                    object3 = "Unable to deserialize proto from offline signals database:";
                    zzm.zzg((String)object3);
                    object = zzhcd2.getMessage();
                    zzm.zzg((String)object);
                }
            }
            object5.close();
            object = zzefm2.zzb;
            object5 = zzbdv$zzaf.zzi();
            object = object.getPackageName();
            ((zzbdv$zzaf$zzc)object5).zzv((String)object);
            object = Build.MODEL;
            ((zzbdv$zzaf$zzc)object5).zzy((String)object);
            n3 = 0;
            object = null;
            int n8 = zzefg.zza(sQLiteDatabase2, 0);
            ((zzbdv$zzaf$zzc)object5).zzA(n8);
            ((zzbdv$zzaf$zzc)object5).zzh(arrayList);
            n8 = 1;
            int n10 = zzefg.zza(sQLiteDatabase2, n8);
            ((zzbdv$zzaf$zzc)object5).zzE(n10);
            n10 = zzefg.zza(sQLiteDatabase2, 3);
            ((zzbdv$zzaf$zzc)object5).zzx(n10);
            object2 = zzu.zzB();
            long l3 = object2.currentTimeMillis();
            ((zzbdv$zzaf$zzc)object5).zzF(l3);
            n10 = 2;
            long l4 = zzefg.zzb(sQLiteDatabase2, n10);
            ((zzbdv$zzaf$zzc)object5).zzB(l4);
            object5 = (zzbdv$zzaf)((zzhbi)object5).zzbn();
            n7 = arrayList.size();
            long l7 = l2 = 0L;
            for (n4 = 0; n4 < n7; ++n4) {
                long l8;
                long l12;
                zzbdv$zzaf$zza = (zzbdv$zzaf$zza)arrayList.get(n4);
                zzbdv$zzq zzbdv$zzq = zzbdv$zzaf$zza.zzk();
                if (zzbdv$zzq == (object = zzbdv$zzq.zzb) && (n3 = (int)((l12 = (l8 = zzbdv$zzaf$zza.zze()) - l7) == 0L ? 0 : (l12 < 0L ? -1 : 1))) > 0) {
                    l7 = zzbdv$zzaf$zza.zze();
                }
                n3 = 0;
                object = null;
            }
            n3 = (int)(l7 == l2 ? 0 : (l7 < l2 ? -1 : 1));
            if (n3 != 0) {
                object = new ContentValues();
                object4 = l7;
                object.put("value", (Long)object4);
                object4 = "statistic_name = 'last_successful_request_time'";
                string4 = "offline_signal_statistics";
                sQLiteDatabase2.update(string4, (ContentValues)object, (String)object4, null);
            }
            object = zzefm2.zza;
            object4 = new zzefk((zzbdv$zzaf)object5);
            ((zzbdm)object).zzc((zzbdl)object4);
            object = zzefm2.zzd;
            object5 = zzbdv$zzar.zzd();
            n3 = ((VersionInfoParcel)object).buddyApkVersion;
            ((zzbdv$zzar$zza)object5).zzg(n3);
            n3 = zzefm2.zzd.clientJarVersion;
            ((zzbdv$zzar$zza)object5).zzi(n3);
            object = zzefm2.zzd;
            n3 = (int)(((VersionInfoParcel)object).isClientJar ? 1 : 0);
            if (n8 != n3) {
                n3 = 2;
            } else {
                n3 = 0;
                object = null;
            }
            ((zzbdv$zzar$zza)object5).zzh(n3);
            object = (zzbdv$zzar)((zzhbi)object5).zzbn();
            object5 = zzefm2.zza;
            object3 = new zzefl((zzbdv$zzar)object);
            ((zzbdm)object5).zzc((zzbdl)object3);
            object = zzefm2.zza;
            object5 = zzbdo.zzU;
            ((zzbdm)object).zzb((zzbdo)object5);
            zzefg.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(boolean bl2) {
        zzeer zzeer2;
        try {
            zzeer2 = this.zzc;
        }
        catch (Exception exception) {
            String string2 = String.valueOf(exception.getMessage());
            zzm.zzg("Error in offline signals database startup: ".concat(string2));
            return;
        }
        zzefj zzefj2 = new zzefj(this, bl2);
        zzeer2.zza(zzefj2);
    }
}

