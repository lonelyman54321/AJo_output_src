/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.HttpUtils;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcc;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzfb;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class zzcd
extends zzbr
implements Closeable {
    private static final String zza = "CREATE TABLE IF NOT EXISTS hits2 ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_string' TEXT NOT NULL, 'hit_app_id' INTEGER);";
    private static final String zzb = "SELECT MAX(hit_time) FROM hits2 WHERE 1;";
    private final zzcc zzc;
    private final zzfb zzd;
    private final zzfb zze;

    public zzcd(zzbu zzbu2) {
        super(zzbu2);
        Object object = this.zzC();
        Object object2 = new zzfb((Clock)object);
        this.zzd = object2;
        object = this.zzC();
        object2 = new zzfb((Clock)object);
        this.zze = object2;
        object2 = this.zzad();
        zzbu2 = zzbu2.zza();
        super(this, (Context)zzbu2, (String)object2);
        this.zzc = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long zzac(String string2, String[] stringArray, long l2) {
        Throwable throwable2;
        Cursor cursor;
        block7: {
            SQLiteException sQLiteException2;
            Object object;
            block8: {
                long l3;
                block6: {
                    block5: {
                        object = this.zzf();
                        cursor = null;
                        try {
                            cursor = object.rawQuery(string2, stringArray);
                            boolean bl2 = cursor.moveToFirst();
                            if (!bl2) break block5;
                            bl2 = false;
                            stringArray = null;
                            l3 = cursor.getLong(0);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        catch (SQLiteException sQLiteException2) {
                            break block8;
                        }
                    }
                    l3 = 0L;
                }
                cursor.close();
                return l3;
            }
            object = "Database error";
            {
                this.zzK((String)object, string2, (Object)sQLiteException2);
                throw sQLiteException2;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    private final String zzad() {
        this.zzw();
        this.zzw();
        return "google_analytics_v4.db";
    }

    public static /* bridge */ /* synthetic */ zzfb zzg(zzcd zzcd2) {
        return zzcd2.zze;
    }

    public static /* bridge */ /* synthetic */ String zzh(zzcd zzcd2) {
        return zzcd2.zzad();
    }

    public static /* bridge */ /* synthetic */ String zzi() {
        return zza;
    }

    public final void close() {
        SQLiteException sQLiteException2;
        block5: {
            zzcc zzcc2 = this.zzc;
            try {
                zzcc2.close();
                return;
            }
            catch (IllegalStateException illegalStateException) {
            }
            catch (SQLiteException sQLiteException2) {
                break block5;
            }
            this.zzJ("Error closing database", illegalStateException);
            return;
        }
        this.zzJ("Sql error closing database", (Object)sQLiteException2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzY(List object) {
        Object object2;
        Object object3;
        int n3;
        int n4;
        Preconditions.checkNotNull(object);
        zzr.zzh();
        this.zzV();
        boolean bl2 = object.isEmpty();
        if (bl2) return;
        CharSequence charSequence = new StringBuilder("hit_id in (");
        Object object4 = null;
        for (n4 = 0; n4 < (n3 = object.size()); ++n4) {
            long l2;
            long l3;
            long l4;
            long l7;
            object3 = (Long)object.get(n4);
            if (object3 != null && (l7 = (l4 = (l3 = ((Long)object3).longValue()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
                if (n4 > 0) {
                    object2 = ",";
                    ((StringBuilder)charSequence).append((String)object2);
                }
                ((StringBuilder)charSequence).append(object3);
                continue;
            }
            object = new SQLiteException("Invalid hit id");
            throw object;
        }
        object4 = ")";
        ((StringBuilder)charSequence).append((String)object4);
        charSequence = ((StringBuilder)charSequence).toString();
        try {
            object4 = this.zzf();
            object3 = "Deleting dispatched hits. count";
        }
        catch (SQLiteException sQLiteException) {}
        int n7 = object.size();
        object2 = n7;
        this.zzO((String)object3, object2);
        object3 = "hits2";
        n7 = 0;
        object2 = null;
        n4 = object4.delete((String)object3, (String)charSequence, null);
        n3 = object.size();
        if (n4 == n3) return;
        object3 = "Deleted fewer hits then expected";
        int n8 = object.size();
        object = n8;
        object4 = n4;
        this.zzT((String)object3, object, object4, charSequence);
        return;
        this.zzJ("Error deleting hits", (Object)sQLiteException);
        throw sQLiteException;
    }

    public final void zzZ() {
        this.zzV();
        this.zzf().endTransaction();
    }

    public final int zza() {
        zzr.zzh();
        this.zzV();
        zzfb zzfb2 = this.zzd;
        long l2 = 86400000L;
        int n3 = zzfb2.zzc(l2);
        if (n3 == 0) {
            return 0;
        }
        this.zzd.zzb();
        this.zzN("Deleting stale hits (if any)");
        zzfb2 = this.zzf();
        Object object = Long.toString(this.zzC().currentTimeMillis() + -2592000000L);
        object = new String[]{object};
        n3 = zzfb2.delete("hits2", "hit_time < ?", (String[])object);
        object = n3;
        this.zzO("Deleted stale hits, count", object);
        return n3;
    }

    public final void zzaa() {
        this.zzV();
        this.zzf().setTransactionSuccessful();
    }

    public final boolean zzab() {
        long l2;
        long l3 = this.zzb();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object == false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb() {
        Throwable throwable222;
        Cursor cursor;
        block7: {
            String string2;
            Object object;
            block6: {
                zzr.zzh();
                this.zzV();
                object = this.zzf();
                string2 = "SELECT COUNT(*) FROM hits2";
                cursor = null;
                cursor = object.rawQuery(string2, null);
                boolean bl2 = cursor.moveToFirst();
                if (!bl2) break block6;
                bl2 = false;
                object = null;
                long l2 = cursor.getLong(0);
                cursor.close();
                return l2;
            }
            try {
                String string3 = "Database returned empty set";
                object = new SQLiteException(string3);
                throw object;
            }
            catch (Throwable throwable222) {
                break block7;
            }
            catch (SQLiteException sQLiteException) {}
            String string4 = "Database error";
            this.zzK(string4, string2, (Object)sQLiteException);
            throw sQLiteException;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable222;
    }

    public final long zzc() {
        zzr.zzh();
        this.zzV();
        String string2 = zzb;
        return this.zzac(string2, null, 0L);
    }

    public final void zzd() {
    }

    public final long zze(long l2, String string2, String string3) {
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotEmpty(string3);
        this.zzV();
        zzr.zzh();
        String[] stringArray = new String[]{"0", string2, string3};
        return this.zzac("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", stringArray, 0L);
    }

    public final SQLiteDatabase zzf() {
        zzcc zzcc2;
        try {
            zzcc2 = this.zzc;
        }
        catch (SQLiteException sQLiteException) {
            this.zzR("Error opening database", (Object)sQLiteException);
            throw sQLiteException;
        }
        return zzcc2.getWritableDatabase();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzj(long l2) {
        void var9_12;
        Cursor cursor;
        block16: {
            Object object;
            ArrayList<zzek> arrayList;
            zzcd zzcd2;
            block17: {
                Cursor cursor2;
                block15: {
                    block14: {
                        block13: {
                            boolean bl2;
                            zzcd2 = this;
                            long l3 = 0L;
                            int n3 = 1;
                            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (object2 >= 0) {
                                bl2 = true;
                            } else {
                                bl2 = false;
                                arrayList = null;
                            }
                            Preconditions.checkArgument(bl2);
                            zzr.zzh();
                            this.zzV();
                            object = this.zzf();
                            cursor = null;
                            Object object3 = "hits2";
                            arrayList = "hit_id";
                            Object object4 = "hit_time";
                            String string2 = "hit_string";
                            String string3 = "hit_url";
                            String string4 = "hit_app_id";
                            object4 = new String[]{arrayList, object4, string2, string3, string4};
                            String string5 = "hit_id ASC";
                            String string6 = Long.toString(l2);
                            string2 = null;
                            string3 = null;
                            boolean bl3 = false;
                            string4 = null;
                            cursor2 = object.query((String)object3, object4, null, null, null, null, string5, string6);
                            try {
                                arrayList = new ArrayList<zzek>();
                                int n4 = cursor2.moveToFirst();
                                if (n4 == 0) break block13;
                                do {
                                    zzek zzek2;
                                    long l4 = cursor2.getLong(0);
                                    long l7 = cursor2.getLong(n3);
                                    n4 = 2;
                                    object = cursor2.getString(n4);
                                    object2 = 3;
                                    object3 = cursor2.getString((int)object2);
                                    int n7 = 4;
                                    int n8 = cursor2.getInt(n7);
                                    object4 = zzcd2.zzk((String)object);
                                    n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                                    if (n4 != 0 || (n4 = (int)(((String)object3).startsWith((String)(object = "http:")) ? 1 : 0)) == 0) {
                                        bl3 = true;
                                    } else {
                                        bl3 = false;
                                        string4 = null;
                                    }
                                    cursor = null;
                                    object = zzek2;
                                    object3 = this;
                                    zzek2 = new zzek(this, (Map)object4, l7, bl3, l4, n8, null);
                                    arrayList.add(zzek2);
                                } while ((n4 = (int)(cursor2.moveToNext() ? 1 : 0)) != 0);
                            }
                            catch (Throwable throwable) {
                                break block14;
                            }
                            catch (SQLiteException sQLiteException) {
                                break block15;
                            }
                        }
                        cursor2.close();
                        return arrayList;
                    }
                    cursor = cursor2;
                    break block16;
                }
                cursor = cursor2;
                break block17;
                catch (Throwable throwable) {
                    break block16;
                }
                catch (SQLiteException sQLiteException) {
                    // empty catch block
                }
            }
            object = "Error loading hits from the database";
            {
                zzcd2.zzJ((String)object, arrayList);
                throw arrayList;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw var9_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzk(String object) {
        URISyntaxException uRISyntaxException2;
        block4: {
            Object object2;
            block3: {
                object2 = "?";
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                if (bl2) {
                    return new HashMap(0);
                }
                try {
                    bl2 = ((String)object).startsWith((String)object2);
                    if (bl2) break block3;
                    object = ((String)object2).concat((String)object);
                }
                catch (URISyntaxException uRISyntaxException2) {
                    break block4;
                }
            }
            object2 = new URI((String)object);
            object = "UTF-8";
            return HttpUtils.parse((URI)object2, (String)object);
        }
        this.zzJ("Error parsing hit parameters", uRISyntaxException2);
        return new HashMap(0);
    }

    public final Map zzl(String object) {
        StringBuilder stringBuilder;
        Object object2 = "?";
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            object = new HashMap(0);
            return object;
        }
        try {
            stringBuilder = new StringBuilder((String)object2);
        }
        catch (URISyntaxException uRISyntaxException) {
            this.zzJ("Error parsing property parameters", uRISyntaxException);
            HashMap hashMap = new HashMap(0);
            return hashMap;
        }
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        object2 = new URI((String)object);
        object = "UTF-8";
        return HttpUtils.parse((URI)object2, (String)object);
    }

    public final void zzm() {
        this.zzV();
        this.zzf().beginTransaction();
    }

    public final void zzn(long l2) {
        zzr.zzh();
        this.zzV();
        ArrayList<Long> arrayList = new ArrayList<Long>(1);
        Long l3 = l2;
        arrayList.add(l3);
        this.zzO("Deleting hit, id", l3);
        this.zzY(arrayList);
    }
}

