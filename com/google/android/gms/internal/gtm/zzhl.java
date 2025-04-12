/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.gtm.zzfp;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhm;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

final class zzhl
extends zzfp {
    final /* synthetic */ zzhm zza;
    private boolean zzb;
    private long zzc;

    public zzhl(zzhm zzhm2, Context context, String string2) {
        this.zza = zzhm2;
        super(context, "gtm_urls.db", null, 1);
        this.zzc = 0L;
    }

    private static final boolean zza(String string2, SQLiteDatabase sQLiteDatabase) {
        boolean bl2;
        Cursor cursor = null;
        String string3 = "SQLITE_MASTER";
        String string4 = "name";
        String[] stringArray = new String[]{string4};
        String string5 = "name=?";
        String[] stringArray2 = new String[]{string2};
        string4 = sQLiteDatabase;
        cursor = sQLiteDatabase.query(string3, stringArray, string5, stringArray2, null, null, null);
        try {
            bl2 = cursor.moveToFirst();
        }
        catch (Throwable throwable) {
            if (cursor != null) {
                cursor.close();
            }
            throw throwable;
        }
        catch (SQLiteException sQLiteException) {
            bl2 = false;
            string2 = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        return bl2;
    }

    private static final void zzb(SQLiteDatabase object, String string2, List object2) {
        Throwable throwable2;
        block10: {
            Object object3;
            HashSet<String> hashSet;
            block9: {
                int n3;
                block8: {
                    hashSet = new HashSet<String>("SELECT * FROM ");
                    ((StringBuilder)((Object)hashSet)).append(string2);
                    ((StringBuilder)((Object)hashSet)).append(" WHERE 0");
                    hashSet = ((StringBuilder)((Object)hashSet)).toString();
                    object3 = null;
                    object = object.rawQuery((String)((Object)hashSet), null);
                    hashSet = new HashSet<String>();
                    try {
                        object3 = object.getColumnNames();
                        n3 = 0;
                    }
                    catch (Throwable throwable2) {}
                    while (true) {
                        int n4 = ((String[])object3).length;
                        if (n3 >= n4) break block8;
                        break;
                    }
                    {
                        String string3 = object3[n3];
                        hashSet.add(string3);
                        ++n3;
                        continue;
                    }
                    break block10;
                }
                object.close();
                object = object2.iterator();
                do {
                    boolean bl2 = object.hasNext();
                    object3 = ".";
                    if (!bl2) break block9;
                } while ((n3 = (int)(hashSet.remove(object2 = (String)object.next()) ? 1 : 0)) != 0);
                string2 = uc0_0.a("Database column ", (String)object2, " missing in table ", string2, (String)object3);
                object = new SQLiteException(string2);
                throw object;
            }
            boolean bl3 = hashSet.isEmpty();
            if (bl3) {
                return;
            }
            string2 = cP.a("Database has extra columns in table ", string2, (String)object3);
            object = new SQLiteException(string2);
            throw object;
        }
        object.close();
        throw throwable2;
    }

    public final SQLiteDatabase getWritableDatabase() {
        Clock clock;
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2 = this.zzb;
        if (bl2 && (l7 = (l4 = (l3 = this.zzc + 3600000L) - (l2 = (clock = zzhm.zze(this.zza)).currentTimeMillis())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) > 0) {
            SQLiteException sQLiteException = new SQLiteException("Database creation failed");
            throw sQLiteException;
        }
        this.zzb = bl2 = true;
        Object object = zzhm.zze(this.zza);
        this.zzc = l3 = object.currentTimeMillis();
        try {
            object = super.getWritableDatabase();
        }
        catch (SQLiteException sQLiteException) {
            object = this.zza;
            Context context = zzhm.zzd((zzhm)object);
            object = zzhm.zzf((zzhm)object);
            context.getDatabasePath((String)object).delete();
            bl2 = false;
            object = null;
        }
        if (object == null) {
            object = super.getWritableDatabase();
        }
        this.zzb = false;
        return object;
    }

    public final void onCreate(SQLiteDatabase object) {
        Object object2;
        block3: {
            object = object.getPath();
            try {
                object2 = Build.VERSION.SDK;
            }
            catch (NumberFormatException numberFormatException) {
                object = String.valueOf(Build.VERSION.SDK);
                zzhi.zza("Invalid version number: ".concat((String)object));
                return;
            }
            int n3 = Integer.parseInt((String)object2);
            int n4 = 9;
            if (n3 >= n4) break block3;
            return;
        }
        object2 = new File((String)object);
        ((File)object2).setReadable(false, false);
        ((File)object2).setWritable(false, false);
        boolean bl2 = true;
        ((File)object2).setReadable(bl2, bl2);
        ((File)object2).setWritable(bl2, bl2);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        List<String> list;
        String string2 = "gtm_hit_unique_ids";
        boolean bl2 = zzhl.zza(string2, sQLiteDatabase);
        if (!bl2) {
            string2 = zzhm.zzi();
            sQLiteDatabase.execSQL(string2);
        } else {
            list = Arrays.asList("hit_unique_id");
            zzhl.zzb(sQLiteDatabase, string2, list);
        }
        string2 = "gtm_hits";
        bl2 = zzhl.zza(string2, sQLiteDatabase);
        if (!bl2) {
            string2 = zzhm.zzh();
            sQLiteDatabase.execSQL(string2);
        } else {
            String string3 = "hit_headers";
            String string4 = "hit_body";
            String string5 = "hit_url";
            String string6 = "hit_time";
            String string7 = "hit_first_send_time";
            String string8 = "hit_method";
            String string9 = "hit_unique_id";
            list = Arrays.asList("hit_id", string5, string6, string7, string8, string9, string3, string4);
            zzhl.zzb(sQLiteDatabase, string2, list);
        }
        string2 = zzhm.zzj();
        sQLiteDatabase.execSQL(string2);
        string2 = zzhm.zzg();
        sQLiteDatabase.execSQL(string2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

