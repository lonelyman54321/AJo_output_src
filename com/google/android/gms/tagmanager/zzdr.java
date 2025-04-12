/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 */
package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tagmanager.zzbf;
import com.google.android.gms.tagmanager.zzby;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdp;
import com.google.android.gms.tagmanager.zzdq;
import com.google.android.gms.tagmanager.zzeu;
import com.google.android.gms.tagmanager.zzfc;
import com.google.android.gms.tagmanager.zzfd;
import java.util.ArrayList;
import java.util.Collections;

final class zzdr
implements zzby {
    private static final String zza = "CREATE TABLE IF NOT EXISTS gtm_hits ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL,'hit_first_send_time' INTEGER NOT NULL);";
    private final zzdq zzb;
    private volatile zzbf zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final Clock zzg;
    private final int zzh;
    private final zzeu zzi;

    public zzdr(zzeu object, Context context) {
        this.zzd = context = context.getApplicationContext();
        Object object2 = "gtm_urls.db";
        this.zze = object2;
        this.zzi = object;
        this.zzg = object = DefaultClock.getInstance();
        object = new zzdq(this, context, (String)object2);
        this.zzb = object;
        object2 = new zzdp(this);
        object = new zzfd(context, (zzfc)object2);
        this.zzc = object;
        this.zzf = 0L;
        this.zzh = 2000;
    }

    public static /* bridge */ /* synthetic */ Context zzd(zzdr zzdr2) {
        return zzdr2.zzd;
    }

    public static /* bridge */ /* synthetic */ Clock zze(zzdr zzdr2) {
        return zzdr2.zzg;
    }

    public static /* bridge */ /* synthetic */ String zzf(zzdr zzdr2) {
        return zzdr2.zze;
    }

    public static /* bridge */ /* synthetic */ String zzg() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzdr zzdr2, long l2) {
        zzdr2.zzl(l2);
    }

    public static /* synthetic */ void zzi(zzdr zzdr2, long l2, long l3) {
        String[] stringArray;
        SQLiteDatabase sQLiteDatabase = zzdr2.zzk("Error opening database for getNumStoredHits.");
        if (sQLiteDatabase == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        Object object = l3;
        contentValues.put("hit_first_send_time", (Long)object);
        object = "gtm_hits";
        String string2 = "hit_id=?";
        try {
            stringArray = String.valueOf(l2);
        }
        catch (SQLiteException sQLiteException) {
            zzdr2.zzl(l2);
            return;
        }
        stringArray = new String[]{stringArray};
        sQLiteDatabase.update((String)object, contentValues, string2, stringArray);
    }

    private final SQLiteDatabase zzk(String object) {
        try {
            object = this.zzb;
        }
        catch (SQLiteException sQLiteException) {
            return null;
        }
        return ((zzdq)((Object)object)).getWritableDatabase();
    }

    private final void zzl(long l2) {
        String[] stringArray = String.valueOf(l2);
        stringArray = new String[]{stringArray};
        this.zzj(stringArray);
    }

    /*
     * Exception decompiling
     */
    public final void zza() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 36[TRYBLOCK] [74 : 653->662)] java.lang.Throwable
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(long var1_1, String var3_2) {
        block23: {
            block22: {
                block21: {
                    var4_3 = this;
                    var5_4 = this.zzg;
                    var6_10 = var5_4.currentTimeMillis();
                    var8_11 = this.zzf;
                    var10_12 = 86400000L;
                    var12_13 = 1;
                    var13_14 = "gtm_hits";
                    cfr_temp_0 = var6_10 - (var8_11 += var10_12);
                    var14_15 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var14_15 /* !! */  > 0) {
                        this.zzf = var6_10;
                        var15_16 = this.zzk("Error opening database for deleteStaleHits.");
                        if (var15_16 != null) {
                            var16_17 = this.zzg.currentTimeMillis();
                            var18_18 = -2592000000L;
                            var20_19 /* !! */  = Long.toString(var16_17 += var18_18);
                            var20_19 /* !! */  = new String[]{var20_19 /* !! */ };
                            var21_20 = "HIT_TIME < ?";
                            var15_16.delete(var13_14, (String)var21_20, var20_19 /* !! */ );
                            var15_16 = this.zzi;
                            var22_21 = this.zzc();
                            if (var22_21 == 0) {
                                var22_21 = 1;
                            } else {
                                var22_21 = 0;
                                var20_19 /* !! */  = null;
                            }
                            var15_16.zza((boolean)var22_21);
                        }
                    }
                    var23_22 = this.zzc();
                    var22_21 = var4_3.zzh;
                    var23_22 = var23_22 - var22_21 + var12_13;
                    var22_21 = 0;
                    var20_19 /* !! */  = null;
                    if (var23_22 <= 0) ** GOTO lbl56
                    var21_20 = new ArrayList();
                    var5_4 = "Error opening database for peekHitIds.";
                    var24_23 = var4_3.zzk((String)var5_4);
                    if (var24_23 != null) {
                        var25_24 = "gtm_hits";
                        var5_4 = "hit_id";
                        var26_25 = new String[]{var5_4};
                        var27_26 = "hit_id ASC";
                        var28_27 = Integer.toString(var23_22);
                        var15_16 = var24_23.query(var25_24, var26_25, null, null, null, null, var27_26, var28_27);
                    } else lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var12_13 = var21_20.size();
                            var29_28 = " hits to make room.";
                            var5_4 = Gj0.b(var12_13, "Store full, deleting ", var29_28);
                            var15_16 = zzdc.zzb;
                            var15_16.zzd((String)var5_4);
                            var5_4 = new String[]{};
                            var5_4 = var21_20.toArray((T[])var5_4);
                            var4_3.zzj((String[])var5_4);
lbl56:
                            // 2 sources

                            if ((var5_4 = var4_3.zzk("Error opening database for putHit")) == null) {
                                return;
                            }
                            var15_16 = new ContentValues();
                            var21_20 = var1_1;
                            var15_16.put("hit_time", (Long)var21_20);
                            var29_28 = var3_2;
                            var15_16.put("hit_url", var3_2);
                            var21_20 = 0;
                            var29_28 = "hit_first_send_time";
                            var15_16.put(var29_28, (Integer)var21_20);
                            try {
                                var5_4.insert(var13_14, null, (ContentValues)var15_16);
                                var5_4 = var4_3.zzi;
                                var5_4.zza(false);
                                return;
                            }
                            catch (SQLiteException v0) {
                                return;
                            }
                            break;
                        }
                    }
                    try {}
                    catch (SQLiteException var5_6) {}
                    finally {
                        break block21;
                    }
                    catch (SQLiteException var5_7) {
                        break block22;
                    }
                    catch (Throwable var5_8) {
                        break block23;
                    }
                }
                var12_13 = (int)var15_16.moveToFirst();
                if (var12_13 != 0) {
                    do {
                        var18_18 = var15_16.getLong(0);
                        var5_4 = String.valueOf(var18_18);
                        var21_20.add(var5_4);
                    } while ((var12_13 = (int)var15_16.moveToNext()) != 0);
                }
lbl91:
                // 4 sources

                while (true) {
                    var15_16.close();
                    ** GOTO lbl-1000
                    break;
                }
            }
            var23_22 = 0;
            var15_16 = null;
            {
                var5_4.getMessage();
                if (var15_16 != null) ** break;
                ** continue;
                ** continue;
            }
        }
        if (var20_19 /* !! */  == null) throw var5_9;
        var20_19 /* !! */ .close();
        throw var5_9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzc() {
        int n3;
        block7: {
            Cursor cursor;
            block5: {
                Throwable throwable2;
                block6: {
                    long l2;
                    SQLiteDatabase sQLiteDatabase = this.zzk("Error opening database for getNumStoredHits.");
                    n3 = 0;
                    if (sQLiteDatabase == null) break block7;
                    cursor = null;
                    String string2 = "SELECT COUNT(*) from gtm_hits";
                    try {
                        cursor = sQLiteDatabase.rawQuery(string2, null);
                        boolean bl2 = cursor.moveToFirst();
                        if (!bl2) break block5;
                        l2 = cursor.getLong(0);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (SQLiteException sQLiteException) {
                        break block5;
                    }
                    n3 = (int)l2;
                    break block5;
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw throwable2;
            }
            if (cursor != null) {
                cursor.close();
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(String[] object) {
        if (object == null) return;
        boolean bl2 = ((Object)object).length;
        if (!bl2) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.zzk("Error opening database for deleteHits.");
        if (sQLiteDatabase == null) return;
        Object object2 = Collections.nCopies((int)(bl2 ? 1 : 0), "?");
        object2 = TextUtils.join((CharSequence)",", object2);
        String string2 = ")";
        object2 = cP.a("HIT_ID in (", (String)object2, string2);
        String string3 = "gtm_hits";
        try {
            sQLiteDatabase.delete(string3, (String)object2, (String[])object);
            object = this.zzi;
            bl2 = this.zzc();
            if (!bl2) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            ((zzeu)object).zza(bl2);
            return;
        }
        catch (SQLiteException sQLiteException) {
            return;
        }
    }
}

