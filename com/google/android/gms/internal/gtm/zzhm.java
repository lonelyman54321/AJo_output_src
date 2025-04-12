/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteConstraintException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgs;
import com.google.android.gms.internal.gtm.zzha;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhk;
import com.google.android.gms.internal.gtm.zzhl;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzia;
import com.google.android.gms.internal.gtm.zzih;
import com.google.android.gms.internal.gtm.zzii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

final class zzhm
implements zzha {
    private static final String zza = "CREATE TABLE IF NOT EXISTS gtm_hit_unique_ids ('hit_unique_id' TEXT UNIQUE);";
    private static final String zzb = "CREATE TABLE IF NOT EXISTS gtm_hits ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_first_send_time' INTEGER NOT NULL, 'hit_method' TEXT NOT NULL, 'hit_unique_id' TEXT UNIQUE, 'hit_headers' TEXT, 'hit_body' TEXT);";
    private static final String zzc = "CREATE TRIGGER IF NOT EXISTS save_unique_on_delete DELETE ON gtm_hits FOR EACH ROW WHEN OLD.hit_unique_id NOTNULL BEGIN     INSERT OR IGNORE INTO gtm_hit_unique_ids (hit_unique_id) VALUES (OLD.hit_unique_id); END;";
    private static final String zzd = "CREATE TRIGGER IF NOT EXISTS check_unique_on_insert BEFORE INSERT ON gtm_hits FOR EACH ROW WHEN NEW.hit_unique_id NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM gtm_hit_unique_ids WHERE hit_unique_id = NEW.hit_unique_id); END;";
    private final zzhl zze;
    private volatile zzgs zzf;
    private final Context zzg;
    private final String zzh;
    private long zzi;
    private final Clock zzj;
    private final int zzk;
    private final zzia zzl;

    public zzhm(zzia object, Context context) {
        this.zzg = context = context.getApplicationContext();
        Object object2 = "gtm_urls.db";
        this.zzh = object2;
        this.zzl = object;
        this.zzj = object = DefaultClock.getInstance();
        object = new zzhl(this, context, (String)object2);
        this.zze = object;
        object2 = new zzhk(this);
        object = new zzii(context, (zzih)object2);
        this.zzf = object;
        this.zzi = 0L;
        this.zzk = 2000;
    }

    public static /* bridge */ /* synthetic */ Context zzd(zzhm zzhm2) {
        return zzhm2.zzg;
    }

    public static /* bridge */ /* synthetic */ Clock zze(zzhm zzhm2) {
        return zzhm2.zzj;
    }

    public static /* bridge */ /* synthetic */ String zzf(zzhm zzhm2) {
        return zzhm2.zzh;
    }

    public static /* bridge */ /* synthetic */ String zzg() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ String zzh() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzi() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ String zzj() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzhm zzhm2, long l2) {
        zzhm2.zzo(l2);
    }

    public static /* bridge */ /* synthetic */ void zzl(zzhm zzhm2, long l2, long l3) {
        String[] stringArray;
        SQLiteDatabase sQLiteDatabase = zzhm2.zzn("Error opening database for getNumStoredHits.");
        if (sQLiteDatabase == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        Object object = l3;
        contentValues.put("hit_first_send_time", (Long)object);
        object = "gtm_hits";
        CharSequence charSequence = "hit_id=?";
        try {
            stringArray = String.valueOf(l2);
        }
        catch (SQLiteException sQLiteException) {
            object = sQLiteException.getMessage();
            charSequence = new StringBuilder("Error setting HIT_FIRST_DISPATCH_TIME for hitId ");
            ((StringBuilder)charSequence).append(l2);
            ((StringBuilder)charSequence).append(": ");
            ((StringBuilder)charSequence).append((String)object);
            zzhi.zze(((StringBuilder)charSequence).toString());
            zzhm2.zzo(l2);
            return;
        }
        stringArray = new String[]{stringArray};
        sQLiteDatabase.update((String)object, contentValues, (String)charSequence, stringArray);
    }

    private final SQLiteDatabase zzn(String string2) {
        zzhl zzhl2;
        try {
            zzhl2 = this.zze;
        }
        catch (SQLiteException sQLiteException) {
            Context context = this.zzg;
            zzhi.zzf(string2, sQLiteException);
            boolean bl2 = CrashUtils.addDynamiteErrorToDropBox(context, sQLiteException);
            if (bl2) {
                string2 = "Crash reported successfully.";
                zzhi.zzd(string2);
            } else {
                string2 = "Failed to report crash";
                zzhi.zzd(string2);
            }
            return null;
        }
        return zzhl2.getWritableDatabase();
    }

    private final void zzo(long l2) {
        String[] stringArray = String.valueOf(l2);
        stringArray = new String[]{stringArray};
        this.zzm(stringArray);
    }

    private final void zzp(long l2, String string2, String string3, String string4, Map map2, String string5) {
        String string6 = "Hit stored (url = ";
        SQLiteDatabase sQLiteDatabase = this.zzn("Error opening database for putHit");
        if (sQLiteDatabase == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        Object object = l2;
        contentValues.put("hit_time", (Long)object);
        contentValues.put("hit_url", string2);
        object = null;
        Object object2 = 0;
        String string7 = "hit_first_send_time";
        contentValues.put(string7, (Integer)object2);
        if (string3 == null) {
            string3 = "GET";
        }
        contentValues.put("hit_method", string3);
        contentValues.put("hit_unique_id", string4);
        object2 = null;
        if (map2 == null) {
            string3 = null;
        } else {
            string3 = new JSONObject(map2);
            string3 = string3.toString();
        }
        string4 = "hit_headers";
        contentValues.put(string4, string3);
        contentValues.put("hit_body", string5);
        string3 = "gtm_hits";
        sQLiteDatabase.insertOrThrow(string3, null, contentValues);
        object2 = new StringBuilder(string6);
        ((StringBuilder)object2).append(string2);
        string3 = ")";
        ((StringBuilder)object2).append(string3);
        object2 = ((StringBuilder)object2).toString();
        zzhi.zzd((String)object2);
        object2 = this.zzl;
        try {
            ((zzia)object2).zza(false);
            return;
        }
        catch (SQLiteException sQLiteException) {
            object = String.valueOf(sQLiteException.getMessage());
            zzhi.zze("Error storing hit: ".concat((String)object));
            return;
        }
        catch (SQLiteConstraintException sQLiteConstraintException) {
            object = String.valueOf(string2);
            zzhi.zzd("Hit has already been sent: ".concat((String)object));
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void zza() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 59[TRYBLOCK] [134, 133 : 880->885)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(long l2, String string2, String string3, String string4, Map map2, String string5) {
        int n3;
        Object object;
        block17: {
            int n4;
            String string6;
            int n7;
            Object object2;
            Object object3;
            zzhm zzhm2 = this;
            object = this.zzj;
            long l3 = object.currentTimeMillis();
            long l4 = this.zzi;
            long l7 = 86400000L;
            n3 = 1;
            String string7 = "gtm_hits";
            long l8 = l3 - (l4 += l7);
            Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object4 > 0) {
                this.zzi = l3;
                object3 = this.zzn("Error opening database for deleteStaleHits.");
                if (object3 != null) {
                    long l12 = this.zzj.currentTimeMillis();
                    long l14 = -2592000000L;
                    object2 = Long.toString(l12 += l14);
                    object2 = new String[]{object2};
                    n7 = object3.delete(string7, "HIT_TIME < ?", (String[])object2);
                    string6 = "Removed ";
                    object2 = new StringBuilder(string6);
                    ((StringBuilder)object2).append(n7);
                    ((StringBuilder)object2).append(" stale hits.");
                    zzhi.zzd(((StringBuilder)object2).toString());
                    object3 = this.zzl;
                    n4 = this.zzc(string7);
                    if (n4 == 0) {
                        n4 = 1;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                    ((zzia)object3).zza(n4 != 0);
                }
            }
            n7 = zzhm2.zzc(string7);
            n4 = zzhm2.zzk;
            n7 = n7 - n4 + n3;
            if (n7 > 0) {
                Throwable throwable2;
                block15: {
                    block16: {
                        object2 = new ArrayList();
                        object = "Error opening database for peekHitIds.";
                        string7 = zzhm2.zzn((String)object);
                        if (string7 != null) {
                            block14: {
                                string6 = null;
                                String string8 = "gtm_hits";
                                object = "hit_id";
                                try {
                                    String[] stringArray = new String[]{object};
                                    String string9 = "hit_id ASC";
                                    String string10 = Integer.toString(n7);
                                    string6 = string7.query(string8, stringArray, null, null, null, null, string9, string10);
                                    n3 = (int)(string6.moveToFirst() ? 1 : 0);
                                    if (n3 != 0) {
                                        do {
                                            long l15 = string6.getLong(0);
                                            object = String.valueOf(l15);
                                            ((ArrayList)object2).add(object);
                                        } while ((n3 = (int)(string6.moveToNext() ? 1 : 0)) != 0);
                                    }
                                    break block14;
                                }
                                catch (Throwable throwable2) {
                                    break block15;
                                }
                                catch (SQLiteException sQLiteException) {}
                                {
                                    object = sQLiteException.getMessage();
                                    object3 = new StringBuilder();
                                    String string11 = "Error in peekHits fetching hitIds: ";
                                    ((StringBuilder)object3).append(string11);
                                    ((StringBuilder)object3).append((String)object);
                                    object = ((StringBuilder)object3).toString();
                                    zzhi.zze((String)object);
                                    if (string6 == null) break block16;
                                }
                            }
                            string6.close();
                        }
                    }
                    n3 = ((ArrayList)object2).size();
                    string6 = "Store full, deleting ";
                    object3 = new StringBuilder(string6);
                    ((StringBuilder)object3).append(n3);
                    ((StringBuilder)object3).append(" hits to make room.");
                    zzhi.zzd(((StringBuilder)object3).toString());
                    object = new String[]{};
                    object = ((ArrayList)object2).toArray((T[])object);
                    zzhm2.zzm((String[])object);
                    break block17;
                }
                if (string6 != null) {
                    string6.close();
                }
                throw throwable2;
            }
        }
        this.zzp(l2, string2, string3, string4, map2, string5);
        object = zzhp.zza();
        n3 = (int)(object.zzd() ? 1 : 0);
        if (n3 != 0) {
            object = "Sending hits immediately under preview.";
            zzhi.zzd((String)object);
            this.zza();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzc(String string2) {
        Throwable throwable2;
        Cursor cursor;
        block7: {
            int n3;
            block6: {
                string2 = "Error getting numStoredRecords: ";
                SQLiteDatabase sQLiteDatabase = this.zzn("Error opening database for getNumRecords.");
                n3 = 0;
                if (sQLiteDatabase == null) return 0;
                cursor = null;
                CharSequence charSequence = "SELECT COUNT(*) from gtm_hits";
                try {
                    long l2;
                    try {
                        cursor = sQLiteDatabase.rawQuery((String)charSequence, null);
                        boolean bl2 = cursor.moveToFirst();
                        if (!bl2) break block6;
                        l2 = cursor.getLong(0);
                    }
                    catch (SQLiteException sQLiteException) {
                        String string3 = sQLiteException.getMessage();
                        charSequence = new StringBuilder(string2);
                        ((StringBuilder)charSequence).append(string3);
                        string2 = ((StringBuilder)charSequence).toString();
                        zzhi.zze(string2);
                        break block6;
                    }
                    n3 = (int)l2;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return n3;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - void declaration
     */
    public final void zzm(String[] object) {
        SQLiteDatabase sQLiteDatabase;
        int n3;
        String string2 = "gtm_hits";
        if (object != null && (n3 = ((Object)object).length) != 0 && (sQLiteDatabase = this.zzn("Error opening database for deleteHits.")) != null) {
            block6: {
                Object object2 = Collections.nCopies(n3, "?");
                object2 = TextUtils.join((CharSequence)",", object2);
                String string3 = "HIT_ID in (";
                String string4 = ")";
                object2 = cP.a(string3, (String)object2, string4);
                sQLiteDatabase.delete(string2, (String)object2, (String[])object);
                object = this.zzl;
                int bl2 = this.zzc(string2);
                if (bl2 == 0) {
                    boolean bl3 = true;
                    break block6;
                }
                boolean bl4 = false;
                string2 = null;
            }
            try {
                void var8_11;
                ((zzia)object).zza((boolean)var8_11);
                return;
            }
            catch (SQLiteException sQLiteException) {
                object = String.valueOf(sQLiteException.getMessage());
                string2 = "Error deleting hits: ";
                object = string2.concat((String)object);
                zzhi.zze((String)object);
            }
        }
    }
}

