/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeft;
import com.google.android.gms.internal.ads.zzefu;
import com.google.android.gms.internal.ads.zzefv;
import com.google.android.gms.internal.ads.zzefw;
import com.google.android.gms.internal.ads.zzefx;
import com.google.android.gms.internal.ads.zzefy;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzefz
extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgge zzb;

    public zzefz(Context context, zzgge zzgge2) {
        zzbeg zzbeg2 = zzbep.zziv;
        int n3 = (Integer)zzba.zzc().zza(zzbeg2);
        super(context, "AdMobOfflineBufferedPings.db", null, n3);
        this.zza = context;
        this.zzb = zzgge2;
    }

    public static /* synthetic */ Void zzb(zzr zzr2, SQLiteDatabase sQLiteDatabase) {
        zzefz.zzj(sQLiteDatabase, zzr2);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String stringArray, zzr zzr2) {
        ContentValues contentValues = new ContentValues();
        Integer n3 = 1;
        contentValues.put("event_state", n3);
        stringArray = new String[]{stringArray};
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", stringArray);
        zzefz.zzj(sQLiteDatabase, zzr2);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String stringArray) {
        String string2 = Integer.toString(0);
        stringArray = new String[]{stringArray, string2};
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", stringArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzj(SQLiteDatabase object, zzr zzr2) {
        int n3;
        int n4;
        String[] stringArray;
        String string2;
        int n7;
        String string3;
        int n8;
        int n10;
        String[] stringArray2;
        String string4;
        block6: {
            string4 = "url";
            object.beginTransaction();
            try {
                stringArray2 = new String[]{string4};
                String string5 = "event_state = 1";
                String string6 = "timestamp ASC";
                String string7 = "offline_buffered_pings";
                n10 = 0;
                n8 = 0;
                string3 = null;
                n7 = 0;
                string2 = null;
                stringArray = object;
                stringArray = object.query(string7, stringArray2, string5, null, null, null, string6, null);
                n4 = stringArray.getCount();
                stringArray2 = new String[n4];
                n3 = 0;
                string5 = null;
                n8 = 0;
                string3 = null;
                break block6;
            }
            catch (Throwable throwable) {}
            object.endTransaction();
            throw throwable;
        }
        while ((n7 = stringArray.moveToNext()) != 0) {
            n7 = stringArray.getColumnIndex(string4);
            if (n7 != (n10 = -1)) {
                stringArray2[n8] = string2 = stringArray.getString(n7);
            }
            ++n8;
        }
        stringArray.close();
        string4 = "event_state = ?";
        int n14 = 1;
        stringArray = Integer.toString(n14);
        stringArray = new String[]{stringArray};
        string3 = "offline_buffered_pings";
        object.delete(string3, string4, stringArray);
        object.setTransactionSuccessful();
        object.endTransaction();
        while (n3 < n4) {
            object = stringArray2[n3];
            zzr2.zza((String)object);
            ++n3;
        }
        return;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzegb object, SQLiteDatabase object2) {
        ContentValues contentValues = new ContentValues();
        long l2 = ((zzegb)object).zza;
        Long l3 = l2;
        contentValues.put("timestamp", l3);
        String string2 = ((zzegb)object).zzb;
        contentValues.put("gws_query_id", string2);
        string2 = ((zzegb)object).zzc;
        contentValues.put("url", string2);
        int n3 = ((zzegb)object).zzd + -1;
        object = n3;
        contentValues.put("event_state", (Integer)object);
        l3 = null;
        object2.insert("offline_buffered_pings", null, contentValues);
        zzu.zzp();
        object = zzt.zzz(this.zza);
        if (object != null) {
            object2 = this.zza;
            object2 = ObjectWrapper.wrap(object2);
            try {
                object.zze((IObjectWrapper)object2);
            }
            catch (RemoteException remoteException) {
                object2 = "Failed to schedule offline ping sender.";
                zze.zzb((String)object2, remoteException);
            }
        }
        return null;
    }

    public final void zzc(String string2) {
        zzefx zzefx2 = new zzefx(this, string2);
        this.zze(zzefx2);
    }

    public final void zzd(zzegb zzegb2) {
        zzeft zzeft2 = new zzeft(this, zzegb2);
        this.zze(zzeft2);
    }

    public final void zze(zzfkw object) {
        Object object2 = new zzefv(this);
        object2 = this.zzb.zzb((Callable)object2);
        zzefy zzefy2 = new zzefy(this, (zzfkw)object);
        object = this.zzb;
        zzgft.zzr((ListenableFuture)object2, zzefy2, (Executor)object);
    }

    public final void zzg(SQLiteDatabase sQLiteDatabase, zzr zzr2, String string2) {
        zzefw zzefw2 = new zzefw(sQLiteDatabase, string2, zzr2);
        this.zzb.execute(zzefw2);
    }

    public final void zzh(zzr zzr2, String string2) {
        zzefu zzefu2 = new zzefu(this, zzr2, string2);
        this.zze(zzefu2);
    }
}

