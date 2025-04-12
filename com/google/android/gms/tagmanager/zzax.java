/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.gtm.zzfp;
import com.google.android.gms.tagmanager.zzaz;
import com.google.android.gms.tagmanager.zzbq;
import java.util.HashSet;

final class zzax
extends zzfp {
    final /* synthetic */ zzaz zza;

    public zzax(zzaz zzaz2, Context context, String string2) {
        this.zza = zzaz2;
        super(context, "google_tagmanager.db", null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        }
        catch (SQLiteException sQLiteException) {
            sQLiteDatabase = zzaz.zzd(this.zza);
            String string2 = "google_tagmanager.db";
            sQLiteDatabase.getDatabasePath(string2).delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        return sQLiteDatabase;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbq.zza(sQLiteDatabase.getPath());
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOpen(SQLiteDatabase object) {
        HashSet<String> hashSet;
        block17: {
            String[] stringArray;
            block15: {
                void var1_4;
                block14: {
                    int n3;
                    hashSet = "datalayer";
                    stringArray = null;
                    String string2 = "SQLITE_MASTER";
                    Object string3 = "name";
                    try {
                        String[] stringArray2 = new String[]{string3};
                        String string4 = "name=?";
                        String[] stringArray3 = new String[]{hashSet};
                        string3 = object;
                        hashSet = object.query(string2, stringArray2, string4, stringArray3, null, null, null);
                    }
                    catch (Throwable throwable4) {
                        break block14;
                    }
                    catch (SQLiteException sQLiteException) {
                        break block15;
                    }
                    try {
                        n3 = hashSet.moveToFirst();
                    }
                    catch (Throwable throwable3) {
                        stringArray = hashSet;
                        break block14;
                    }
                    catch (SQLiteException sQLiteException) {
                        stringArray = hashSet;
                        break block15;
                    }
                    hashSet.close();
                    if (n3 != 0) {
                        Throwable throwable2222;
                        block16: {
                            object = object.rawQuery("SELECT * FROM datalayer WHERE 0", null);
                            hashSet = new HashSet<String>();
                            try {
                                int n4;
                                stringArray = object.getColumnNames();
                                string3 = null;
                                for (n3 = 0; n3 < (n4 = stringArray.length); ++n3) {
                                    string2 = stringArray[n3];
                                    hashSet.add(string2);
                                }
                            }
                            catch (Throwable throwable2222) {
                                break block16;
                            }
                            object.close();
                            object = "key";
                            boolean bl2 = hashSet.remove(object);
                            if (bl2 && (bl2 = hashSet.remove(object = "value")) && (bl2 = hashSet.remove(object = "ID")) && (bl2 = hashSet.remove(object = "expires"))) {
                                bl2 = hashSet.isEmpty();
                                if (bl2) {
                                    return;
                                }
                                object = new SQLiteException("Database has extra columns");
                                throw object;
                            }
                            object = new SQLiteException("Database column missing");
                            throw object;
                        }
                        object.close();
                        throw throwable2222;
                    }
                    break block17;
                }
                if (stringArray != null) {
                    stringArray.close();
                }
                throw var1_4;
            }
            if (stringArray != null) {
                stringArray.close();
            }
        }
        hashSet = zzaz.zze();
        object.execSQL((String)((Object)hashSet));
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

