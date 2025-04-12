/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzf$zza;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzav;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzpj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzax {
    private final String zza;
    private long zzb;
    private final /* synthetic */ zzar zzc;

    public zzax(zzar zzar2, String string2) {
        this.zzc = zzar2;
        Preconditions.checkNotEmpty(string2);
        this.zza = string2;
        this.zzb = -1;
    }

    public zzax(zzar zzar2, String stringArray, long l2) {
        long l3;
        this.zzc = zzar2;
        Preconditions.checkNotEmpty((String)stringArray);
        this.zza = stringArray;
        String string2 = String.valueOf(l2);
        stringArray = new String[]{stringArray, string2};
        this.zzb = l3 = zzar.zza(zzar2, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", stringArray, -1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza() {
        int n3;
        Object object;
        int n4;
        boolean bl2;
        Object object2;
        Object object3;
        String string2;
        Cursor cursor;
        Object object4;
        Object object5;
        ArrayList<Object> arrayList;
        zzax zzax2;
        block10: {
            zzax2 = this;
            arrayList = new ArrayList<Object>();
            String string3 = "app_id = ? and rowid > ?";
            object5 = this.zza;
            long l2 = this.zzb;
            object4 = String.valueOf(l2);
            String[] stringArray = new String[]{object5, object4};
            cursor = null;
            try {
                object5 = this.zzc;
                object4 = ((zzar)object5).f_();
                string2 = "raw_events";
                String string4 = "rowid";
                String string5 = "name";
                String string6 = "timestamp";
                String string7 = "metadata_fingerprint";
                String string8 = "data";
                String string9 = "realtime";
                object3 = new String[]{string4, string5, string6, string7, string8, string9};
                object2 = "rowid";
                String string10 = "1000";
                bl2 = false;
                n4 = 0;
                object = null;
                cursor = object4.query(string2, object3, string3, stringArray, null, null, (String)object2, string10);
                n3 = cursor.moveToFirst();
                if (n3 != 0) break block10;
                object5 = Collections.emptyList();
            }
            catch (Throwable throwable) {}
            cursor.close();
            return object5;
            if (cursor == null) throw throwable;
            cursor.close();
            throw throwable;
            catch (SQLiteException sQLiteException) {}
            {
                object4 = zzax2.zzc;
                object4 = ((zzjf)object4).zzj();
                object4 = ((zzgo)object4).zzg();
                string2 = "Data loss. Error querying raw events batch. appId";
                object3 = zzax2.zza;
                object3 = zzgo.zza((String)object3);
                ((zzgq)object4).zza(string2, object3, (Object)sQLiteException);
                if (cursor == null) return arrayList;
            }
            cursor.close();
            return arrayList;
        }
        while (true) {
            n3 = 0;
            object5 = null;
            {
                long l3 = cursor.getLong(0);
                int n7 = 3;
                long l4 = cursor.getLong(n7);
                n7 = 5;
                long l7 = cursor.getLong(n7);
                long l8 = 1L;
                n7 = 1;
                Object object6 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                bl2 = object6 == false;
                n3 = 4;
                object5 = cursor.getBlob(n3);
                long l12 = zzax2.zzb;
                long l14 = l3 - l12;
                Object object7 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object7 > 0) {
                    zzax2.zzb = l3;
                }
                try {
                    object = zzgf$zzf.zze();
                    object5 = zzpj.zza((zzlp)object, (byte[])object5);
                    object5 = (zzgf$zzf$zza)object5;
                }
                catch (IOException iOException) {
                    object4 = zzax2.zzc;
                    object4 = ((zzjf)object4).zzj();
                    object4 = ((zzgo)object4).zzg();
                    string2 = "Data loss. Failed to merge raw event. appId";
                    object3 = zzax2.zza;
                    object3 = zzgo.zza((String)object3);
                    ((zzgq)object4).zza(string2, object3, iOException);
                }
                object4 = cursor.getString(n7);
                if (object4 == null) {
                    object4 = "";
                }
                object4 = ((zzgf$zzf$zza)object5).zza((String)object4);
                n4 = 2;
                l12 = cursor.getLong(n4);
                ((zzgf$zzf$zza)object4).zzb(l12);
                object5 = ((zzkg$zza)object5).zzaj();
                object = object5 = (zzkg)object5;
                object = (zzgf$zzf)object5;
                object4 = object2;
                object2 = new zzav(l3, l4, bl2, (zzgf$zzf)object);
                arrayList.add(object2);
                continue;
                if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
            }
            break;
        }
        cursor.close();
        return arrayList;
    }
}

