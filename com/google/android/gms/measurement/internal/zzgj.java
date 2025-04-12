/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.database.sqlite.SQLiteException
 *  android.database.sqlite.SQLiteFullException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.SystemClock
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzf;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import java.util.List;

public final class zzgj
extends zzf {
    private final zzgi zza;
    private boolean zzb;

    public zzgj(zzic object) {
        super((zzic)object);
        Context context = this.zza();
        super(this, context, "google_app_measurement_local.db");
        this.zza = object;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        Cursor cursor;
        block8: {
            block7: {
                String string2;
                String[] stringArray;
                cursor = null;
                String string3 = "messages";
                String string4 = "rowid";
                try {
                    stringArray = new String[]{string4};
                    string2 = "type=?";
                    string4 = "3";
                }
                catch (Throwable throwable2) {}
                String[] stringArray2 = new String[]{string4};
                String string5 = "rowid desc";
                String string6 = "1";
                string4 = sQLiteDatabase;
                cursor = sQLiteDatabase.query(string3, stringArray, string2, stringArray2, null, null, string5, string6);
                boolean bl2 = cursor.moveToFirst();
                if (!bl2) break block7;
                bl2 = false;
                sQLiteDatabase = null;
                long l2 = cursor.getLong(0);
                cursor.close();
                return l2;
                break block8;
            }
            cursor.close();
            return -1;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zza(int var1_1, byte[] var2_2) {
        var3_3 = this;
        this.zzv();
        var4_4 = this.zzb;
        var5_5 = false;
        var6_6 = null;
        if (var4_4) {
            return false;
        }
        var7_7 = new ContentValues();
        var8_8 = var1_1;
        var7_7.put("type", (Integer)var8_8);
        var8_8 = "entry";
        var9_20 /* !! */  = var2_2;
        var7_7.put((String)var8_8, var2_2);
        var10_21 = 5;
        var11_22 = 0;
        var12_23 = 5;
        while (true) {
            block44: {
                block43: {
                    block38: {
                        block39: {
                            block42: {
                                block41: {
                                    block40: {
                                        block37: {
                                            block35: {
                                                block36: {
                                                    if (var11_22 >= var10_21) {
                                                        this.zzj().zzq().zza("Failed to write entry to local database");
                                                        return false;
                                                    }
                                                    var13_24 = null;
                                                    var14_25 = true;
                                                    var15_26 = this.zzaf();
                                                    if (var15_26 != null) break block35;
                                                    var3_3.zzb = var14_25;
                                                    if (var15_26 == null) break block36;
                                                    var15_26.close();
                                                }
                                                return false;
                                            }
                                            var15_26.beginTransaction();
                                            var8_8 = "select count(1) from messages";
                                            var16_27 = var15_26.rawQuery((String)var8_8, null);
                                            if (var16_27 == null) ** GOTO lbl-1000
                                            try {
                                                var4_4 = var16_27.moveToFirst();
                                                if (var4_4) {
                                                    var17_28 = var16_27.getLong(0);
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var17_28 = 0L;
                                                }
                                                var19_29 = 100000L;
                                                var8_8 = "messages";
                                                var21_30 = var17_28 == var19_29 ? 0 : (var17_28 < var19_29 ? -1 : 1);
                                                if (var21_30 < 0) break block37;
                                                var22_31 = this.zzj();
                                                var22_31 = var22_31.zzg();
                                                var23_32 = "Data loss, local db full";
                                                var22_31.zza(var23_32);
                                                var19_29 = 100001L - var17_28;
                                                var24_33 = "rowid in (select rowid from messages order by rowid asc limit ?)";
                                                var25_34 = Long.toString(var19_29);
                                                var25_34 = new String[]{var25_34};
                                                var26_35 = var15_26.delete((String)var8_8, (String)var24_33, var25_34);
                                                var17_28 = var26_35;
                                                var21_30 = var17_28 == var19_29 ? 0 : (var17_28 < var19_29 ? -1 : 1);
                                                if (var21_30 == false) break block37;
                                                var27_36 = this.zzj();
                                                var27_36 = var27_36.zzg();
                                                var9_20 /* !! */  = (byte[])"Different delete count than expected in local db. expected, received, difference";
                                                var6_6 = var19_29;
                                                var28_37 = var17_28;
                                                var24_33 = var19_29 -= var17_28;
                                                var27_36.zza((String)var9_20 /* !! */ , var6_6, var28_37, var24_33);
                                            }
                                            catch (Throwable var8_12) {}
                                            ** GOTO lbl-1000
                                            catch (SQLiteException var8_14) {
                                                ** GOTO lbl103
                                            }
                                            catch (SQLiteFullException var8_15) {
                                                var13_24 = var16_27;
                                                ** GOTO lbl-1000
                                            }
                                        }
                                        var15_26.insertOrThrow((String)var8_8, null, var7_7);
                                        var15_26.setTransactionSuccessful();
                                        var15_26.endTransaction();
                                        if (var16_27 != null) {
                                            var16_27.close();
                                        }
                                        var15_26.close();
                                        return true;
                                        catch (SQLiteDatabaseLockedException v0) {
                                            var13_24 = var16_27;
                                            break block38;
                                        }
                                        catch (Throwable var8_16) {
                                            var15_26 = null;
                                            break block39;
                                        }
                                        catch (SQLiteException var8_17) {
                                            var16_27 = null;
                                            break block40;
                                        }
                                        catch (SQLiteDatabaseLockedException v1) {
                                            var15_26 = null;
                                            break block38;
                                        }
                                        catch (SQLiteFullException var8_19) {
                                            var15_26 = null;
                                            ** GOTO lbl-1000
                                        }
                                        catch (Throwable var8_9) {
                                            break block39;
                                        }
                                        catch (SQLiteException var8_10) {
                                            var16_27 = null;
lbl103:
                                            // 2 sources

                                            var13_24 = var15_26;
                                            break block40;
                                        }
                                        catch (SQLiteFullException var8_11) {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                    if (var13_24 == null) break block41;
                                    try {
                                        var5_5 = var13_24.inTransaction();
                                        if (!var5_5) break block41;
                                        var13_24.endTransaction();
                                        break block41;
                                    }
                                    catch (Throwable var8_18) {
                                        var15_26 = var13_24;
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        var13_24 = var16_27;
                                        break block39;
                                    }
                                }
                                var6_6 = this.zzj();
                                var6_6 = var6_6.zzg();
                                var9_20 /* !! */  = (byte[])"Error writing entry to local database";
                                var6_6.zza((String)var9_20 /* !! */ , var8_8);
                                var3_3.zzb = var5_5 = true;
                                if (var16_27 != null) {
                                    var16_27.close();
                                }
                                if (var13_24 != null) {
                                    var13_24.close();
                                }
                                break block44;
lbl-1000:
                                // 3 sources

                                {
                                    var6_6 = this.zzj();
                                    var6_6 = var6_6.zzg();
                                    var9_20 /* !! */  = (byte[])"Error writing entry; local database full";
                                    var6_6.zza((String)var9_20 /* !! */ , var8_8);
                                    var3_3.zzb = var5_5 = true;
                                    if (var13_24 == null) break block42;
                                }
                                var13_24.close();
                            }
                            if (var15_26 != null) {
                                var15_26.close();
                            }
                            break block44;
                        }
                        if (var13_24 != null) {
                            var13_24.close();
                        }
                        if (var15_26 != null) {
                            var15_26.close();
                        }
                        throw var8_13;
                        catch (SQLiteDatabaseLockedException v2) {}
                    }
                    var29_38 = var12_23;
                    {
                        SystemClock.sleep((long)var29_38);
                        var12_23 += 20;
                        if (var13_24 == null) break block43;
                    }
                    var13_24.close();
                }
                if (var15_26 != null) {
                    var15_26.close();
                }
            }
            ++var11_22;
            var5_5 = false;
            var6_6 = null;
            var10_21 = 5;
        }
    }

    private final SQLiteDatabase zzaf() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase = this.zza.getWritableDatabase();
        if (sQLiteDatabase == null) {
            this.zzb = true;
            return null;
        }
        return sQLiteDatabase;
    }

    private final boolean zzag() {
        return this.zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /*
     * Exception decompiling
     */
    public final List zza(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [11, 9, 10, 8 : 130->140)] java.lang.Throwable
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

    public final boolean zza(zzag object) {
        this.zzs();
        object = zzpn.zza((Parcelable)object);
        int n3 = ((Object)object).length;
        int n4 = 131072;
        if (n3 > n4) {
            this.zzj().zzo().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.zza(2, (byte[])object);
    }

    public final boolean zza(zzbl object) {
        Parcel parcel = Parcel.obtain();
        ((zzbl)object).writeToParcel(parcel, 0);
        object = parcel.marshall();
        parcel.recycle();
        int n3 = ((Object)object).length;
        int n4 = 131072;
        if (n3 > n4) {
            this.zzj().zzo().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.zza(0, (byte[])object);
    }

    public final boolean zza(zzpm object) {
        Parcel parcel = Parcel.obtain();
        ((zzpm)object).writeToParcel(parcel, 0);
        object = parcel.marshall();
        parcel.recycle();
        int n3 = ((Object)object).length;
        int n4 = 131072;
        if (n3 > n4) {
            this.zzj().zzo().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.zza(1, (byte[])object);
    }

    public final boolean zzab() {
        return false;
    }

    public final void zzac() {
        SQLiteException sQLiteException2;
        block8: {
            block7: {
                String string2;
                Object object;
                Object object2;
                this.zzv();
                try {
                    object2 = this.zzaf();
                    if (object2 == null) break block7;
                    object = "messages";
                    string2 = null;
                }
                catch (SQLiteException sQLiteException2) {}
                int n3 = object2.delete((String)object, null, null);
                if (n3 <= 0) break block7;
                object = this.zzj();
                object = ((zzgo)object).zzq();
                string2 = "Reset local analytics data. records";
                object2 = n3;
                ((zzgq)object).zza(string2, object2);
                break block8;
            }
            return;
        }
        this.zzj().zzg().zza("Error resetting local analytics data. error", (Object)sQLiteException2);
    }

    public final boolean zzad() {
        byte[] byArray = new byte[]{};
        return this.zza(3, byArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzae() {
        var1_1 = "Error deleting app launch break from local database";
        this.zzv();
        var2_3 = this.zzb;
        if (var2_3 != 0) {
            return false;
        }
        var2_3 = this.zzag();
        if (var2_3 == 0) {
            return false;
        }
        var2_3 = 5;
        var3_4 = 0;
        var4_5 = 5;
        while (true) {
            block19: {
                block18: {
                    if (var3_4 >= var2_3) {
                        this.zzj().zzr().zza("Error deleting app launch break from local database in reasonable time");
                        return false;
                    }
                    var5_6 = true;
                    var6_7 = null;
                    var6_7 = this.zzaf();
                    if (var6_7 == null) {
                        this.zzb = var5_6;
                        if (var6_7 == null) break block18;
                    }
                    ** GOTO lbl-1000
                    {
                        catch (Throwable var1_2) {
                            break;
                        }
                        catch (SQLiteException var7_9) {
                            ** GOTO lbl-1000
                        }
                        catch (SQLiteFullException var7_10) {
                            ** GOTO lbl-1000
                        }
                        catch (SQLiteDatabaseLockedException v0) {}
                        var12_13 = var4_5;
                        {
                            SystemClock.sleep((long)var12_13);
                            var4_5 += 20;
                            ** if (var6_7 == null) goto lbl-1000
                        }
lbl-1000:
                        // 1 sources

                        {
                            var6_7.close();
                        }
lbl-1000:
                        // 2 sources

                        {
                            break block19;
                        }
                    }
                    var6_7.close();
                }
                return false;
lbl-1000:
                // 1 sources

                {
                    var6_7.beginTransaction();
                    var7_8 = "messages";
                    var8_11 = "type == ?";
                    var9_14 = 3;
                    var10_15 = Integer.toString(var9_14);
                    var10_15 = new String[]{var10_15};
                    var6_7.delete(var7_8, (String)var8_11, var10_15);
                    var6_7.setTransactionSuccessful();
                    var6_7.endTransaction();
                }
                var6_7.close();
                return var5_6;
lbl-1000:
                // 1 sources

                {
                    if (var6_7 != null && (var11_12 = var6_7.inTransaction())) {
                        var6_7.endTransaction();
                    }
                    var8_11 = this.zzj();
                    var8_11 = var8_11.zzg();
                    var8_11.zza(var1_1, (Object)var7_9);
                    this.zzb = var5_6;
                    ** if (var6_7 == null) goto lbl-1000
                }
lbl-1000:
                // 1 sources

                {
                    var6_7.close();
                }
lbl-1000:
                // 2 sources

                {
                    break block19;
                }
lbl-1000:
                // 1 sources

                {
                    var8_11 = this.zzj();
                    var8_11 = var8_11.zzg();
                    var8_11.zza(var1_1, (Object)var7_10);
                    this.zzb = var5_6;
                    if (var6_7 == null) break block19;
                }
                var6_7.close();
            }
            ++var3_4;
        }
        if (var6_7 != null) {
            var6_7.close();
        }
        throw var1_2;
    }
}

