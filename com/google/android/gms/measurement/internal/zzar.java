/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Pair
 */
package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfw$zza;
import com.google.android.gms.internal.measurement.zzfw$zza$zza;
import com.google.android.gms.internal.measurement.zzfw$zzb;
import com.google.android.gms.internal.measurement.zzfw$zzb$zza;
import com.google.android.gms.internal.measurement.zzfw$zzc;
import com.google.android.gms.internal.measurement.zzfw$zzc$zza;
import com.google.android.gms.internal.measurement.zzfw$zze;
import com.google.android.gms.internal.measurement.zzfw$zze$zza;
import com.google.android.gms.internal.measurement.zzgf$zzf;
import com.google.android.gms.internal.measurement.zzgf$zzh;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.internal.measurement.zzgf$zzj$zzb;
import com.google.android.gms.internal.measurement.zzgf$zzk;
import com.google.android.gms.internal.measurement.zzgf$zzk$zza;
import com.google.android.gms.internal.measurement.zzgf$zzm;
import com.google.android.gms.internal.measurement.zzgf$zzm$zza;
import com.google.android.gms.internal.measurement.zzgf$zzp;
import com.google.android.gms.internal.measurement.zzio;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkg$zza;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzat;
import com.google.android.gms.measurement.internal.zzav;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzax;
import com.google.android.gms.measurement.internal.zzaz;
import com.google.android.gms.measurement.internal.zzbd;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzbl;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzh;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzog;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzop;
import com.google.android.gms.measurement.internal.zzot;
import com.google.android.gms.measurement.internal.zzou;
import com.google.android.gms.measurement.internal.zzph;
import com.google.android.gms.measurement.internal.zzpi;
import com.google.android.gms.measurement.internal.zzpj;
import com.google.android.gms.measurement.internal.zzpm;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzpo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class zzar
extends zzot {
    static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;
    private static final String[] zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final String[] zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final String[] zzk;
    private static final String[] zzl;
    private final zzaz zzm;
    private final zzoh zzn;

    static {
        zzb = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        zza = new String[]{"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;"};
        zzc = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        zzd = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
        zze = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        zzf = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        String string2 = "session_scoped";
        zzh = new String[]{string2, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzi = new String[]{string2, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        zzj = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
        zzk = new String[]{"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
        zzl = new String[]{"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    }

    public zzar(zzou object) {
        super((zzou)object);
        Clock clock = this.zzb();
        this.zzn = object = new zzoh(clock);
        clock = this.zza();
        object = new zzaz(this, (Context)clock, "google_app_measurement.db");
        this.zzm = object;
    }

    public static /* bridge */ /* synthetic */ long zza(zzar zzar2, String string2, String[] stringArray, long l2) {
        return zzar2.zza(string2, stringArray, (long)-1);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long zza(String string2, String[] stringArray, long l2) {
        Throwable throwable2;
        Cursor cursor;
        block6: {
            SQLiteException sQLiteException2;
            block5: {
                long l3;
                SQLiteDatabase sQLiteDatabase = this.f_();
                cursor = null;
                try {
                    cursor = sQLiteDatabase.rawQuery(string2, stringArray);
                    boolean bl2 = cursor.moveToFirst();
                    if (!bl2) break block5;
                    bl2 = false;
                    stringArray = null;
                    l3 = cursor.getLong(0);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (SQLiteException sQLiteException2) {}
                cursor.close();
                return l3;
            }
            cursor.close();
            return l2;
            {
                Object object = this.zzj();
                object = ((zzgo)object).zzg();
                String string3 = "Database error";
                ((zzgq)object).zza(string3, string2, (Object)sQLiteException2);
                throw sQLiteException2;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    public static /* synthetic */ zzjj zza(Cursor cursor) {
        String string2 = cursor.getString(0);
        int n3 = cursor.getInt(1);
        return zzjj.zza(string2, n3);
    }

    public static /* bridge */ /* synthetic */ zzoh zza(zzar zzar2) {
        return zzar2.zzn;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzpi zza(String string2, long l2, byte[] byArray, String string3, String string4, int n3, int n4, long l3, long l4) {
        IOException iOException2;
        Object object;
        block13: {
            Object object2;
            int n7;
            int n8;
            Object object3;
            Object object4;
            int n10;
            Object object5;
            Object object6;
            block12: {
                object6 = string4;
                int n14 = n4;
                boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
                if (bl2) {
                    this.zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    return null;
                }
                try {
                    int n15;
                    block11: {
                        object5 = zzgf$zzj.zzb();
                        object = byArray;
                        object5 = zzpj.zza((zzlp)object5, byArray);
                        object = zzlu.values();
                        n10 = ((byte[])object).length;
                        object4 = null;
                        for (n15 = 0; n15 < n10; ++n15) {
                            object3 = object[n15];
                            n8 = ((zzlu)((Object)object3)).zza();
                            n7 = n3;
                            if (n8 != n3) {
                                continue;
                            }
                            break block11;
                        }
                        object3 = zzlu.zzf;
                    }
                    object = (Object)zzlu.zzb;
                    if (object3 == object || object3 == (object = (Object)((Object)zzlu.zze)) || n14 <= 0) break block12;
                    object = new ArrayList;
                    ((ArrayList)object)();
                    object2 = ((zzgf$zzj$zzb)object5).zzd();
                    object2 = object2.iterator();
                    while ((n15 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object4 = object2.next();
                        object4 = (zzgf$zzk)object4;
                        object4 = ((zzkg)object4).zzch();
                        object4 = (zzgf$zzk$zza)object4;
                        ((zzgf$zzk$zza)object4).zzi(n14);
                        object4 = ((zzkg$zza)object4).zzaj();
                        object4 = (zzkg)object4;
                        object4 = (zzgf$zzk)object4;
                        ((ArrayList)object).add(object4);
                    }
                }
                catch (IOException iOException2) {
                    break block13;
                }
                ((zzgf$zzj$zzb)object5).zzb();
                ((zzgf$zzj$zzb)object5).zza((Iterable)object);
            }
            HashMap<Object, String[]> hashMap = new HashMap<Object, String[]>();
            if (object6 != null) {
                object = "\r\n";
                object6 = ((String)object6).split((String)object);
                int n16 = ((String[])object6).length;
                object2 = null;
                for (n10 = 0; n10 < n16 && (n8 = (int)(((String)(object4 = object6[n10])).isEmpty() ? 1 : 0)) == 0; ++n10) {
                    Object object7 = "=";
                    n7 = 2;
                    int n17 = ((String[])(object7 = ((String)object4).split((String)object7, n7))).length;
                    if (n17 != n7) {
                        object6 = this.zzj();
                        object6 = ((zzgo)object6).zzg();
                        object = "Invalid upload header: ";
                        ((zzgq)object6).zza((String)object, object4);
                        break;
                    }
                    object4 = object7[0];
                    n7 = 1;
                    object7 = object7[n7];
                    hashMap.put(object4, (String[])object7);
                }
            }
            object6 = new zzph();
            object6 = ((zzph)object6).zzc(l2);
            object5 = ((zzkg$zza)object5).zzaj();
            object5 = (zzkg)object5;
            object5 = (zzgf$zzj)object5;
            object6 = ((zzph)object6).zza((zzgf$zzj)object5);
            object5 = string3;
            object6 = ((zzph)object6).zza(string3);
            object6 = ((zzph)object6).zza(hashMap);
            object6 = ((zzph)object6).zza((zzlu)((Object)object3));
            object6 = ((zzph)object6).zzb(l3);
            object6 = ((zzph)object6).zza(l4);
            return ((zzph)object6).zza();
        }
        zzgq zzgq2 = this.zzj().zzg();
        object = string2;
        zzgq2.zza("Failed to queued MeasurementBatch from upload_queue. appId", string2, iOException2);
        return null;
    }

    private final Object zza(Cursor object, int n3) {
        int n4 = object.getType(n3);
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 != n7) {
                    n7 = 3;
                    if (n4 != n7) {
                        int n8 = 4;
                        if (n4 != n8) {
                            object = this.zzj().zzg();
                            Integer n10 = n4;
                            ((zzgq)object).zza("Loaded invalid unknown value type, ignoring it", n10);
                            return null;
                        }
                        this.zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return object.getString(n3);
                }
                return object.getDouble(n3);
            }
            return object.getLong(n3);
        }
        this.zzj().zzg().zza("Loaded invalid null value from database");
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object zza(String string2, String[] object, zzaw object2) {
        void var2_7;
        String string3;
        block10: {
            block11: {
                Object object3;
                block9: {
                    string3 = null;
                    object3 = this.f_();
                    string2 = object3.rawQuery(string2, (String[])object);
                    boolean bl2 = string2.moveToFirst();
                    if (bl2) break block9;
                    object = this.zzj();
                    object = ((zzgo)object).zzq();
                    object2 = "No data found";
                    ((zzgq)object).zza((String)object2);
                    string2.close();
                    return null;
                }
                try {
                    object = object2.zza((Cursor)string2);
                }
                catch (Throwable throwable) {
                    string3 = string2;
                    break block10;
                }
                catch (SQLiteException sQLiteException) {}
                string2.close();
                return object;
                catch (Throwable throwable) {
                    break block10;
                }
                catch (SQLiteException sQLiteException) {
                    string2 = null;
                }
                {
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzg();
                    object3 = "Error querying database.";
                    ((zzgq)object2).zza((String)object3, object);
                    if (string2 == null) break block11;
                }
                string2.close();
            }
            return null;
        }
        if (string3 != null) {
            string3.close();
        }
        throw var2_7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String zza(String string2, String[] stringArray, String object) {
        Throwable throwable2;
        Cursor cursor;
        block6: {
            SQLiteException sQLiteException2;
            Object object2;
            block5: {
                object2 = this.f_();
                cursor = null;
                try {
                    cursor = object2.rawQuery(string2, stringArray);
                    boolean bl2 = cursor.moveToFirst();
                    if (!bl2) break block5;
                    bl2 = false;
                    stringArray = null;
                    string2 = cursor.getString(0);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                catch (SQLiteException sQLiteException2) {}
                cursor.close();
                return string2;
            }
            cursor.close();
            return object;
            {
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object2 = "Database error";
                ((zzgq)object).zza((String)object2, string2, (Object)sQLiteException2);
                throw sQLiteException2;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    private static void zza(ContentValues object, String string2, Object object2) {
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(object2);
        boolean bl2 = object2 instanceof String;
        if (bl2) {
            object2 = (String)object2;
            object.put(string2, (String)object2);
            return;
        }
        bl2 = object2 instanceof Long;
        if (bl2) {
            object2 = (Long)object2;
            object.put(string2, (Long)object2);
            return;
        }
        bl2 = object2 instanceof Double;
        if (bl2) {
            object2 = (Double)object2;
            object.put(string2, (Double)object2);
            return;
        }
        object = new IllegalArgumentException("Invalid value type");
        throw object;
    }

    private final void zza(String object, zzbh object2) {
        SQLiteException sQLiteException2;
        Object object3;
        block11: {
            block10: {
                int n3;
                boolean bl2;
                Preconditions.checkNotNull(object2);
                this.zzv();
                this.zzam();
                object3 = new ContentValues();
                Object object4 = ((zzbh)object2).zza;
                object3.put("app_id", (String)object4);
                Object object5 = ((zzbh)object2).zzb;
                object3.put("name", (String)object5);
                object4 = ((zzbh)object2).zzc;
                object3.put("lifetime_count", (Long)object4);
                object4 = ((zzbh)object2).zzd;
                object3.put("current_bundle_count", (Long)object4);
                object4 = ((zzbh)object2).zzf;
                object3.put("last_fire_timestamp", (Long)object4);
                object4 = ((zzbh)object2).zzg;
                object3.put("last_bundled_timestamp", (Long)object4);
                object5 = ((zzbh)object2).zzh;
                object3.put("last_bundled_day", (Long)object5);
                object5 = ((zzbh)object2).zzi;
                object3.put("last_sampled_complex_event_id", (Long)object5);
                object5 = ((zzbh)object2).zzj;
                object3.put("last_sampling_rate", (Long)object5);
                long l2 = ((zzbh)object2).zze;
                object4 = l2;
                object3.put("current_session_count", (Long)object4);
                object4 = ((zzbh)object2).zzk;
                object5 = null;
                if (object4 != null && (bl2 = ((Boolean)object4).booleanValue())) {
                    long l3 = 1L;
                    object4 = l3;
                } else {
                    bl2 = false;
                    object4 = null;
                }
                String string2 = "last_exempt_from_sampling";
                object3.put(string2, (Long)object4);
                try {
                    object4 = this.f_();
                    n3 = 5;
                }
                catch (SQLiteException sQLiteException2) {}
                long l4 = object4.insertWithOnConflict((String)object, null, (ContentValues)object3, n3);
                long l7 = -1;
                long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                if (l8 != false) break block10;
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object3 = "Failed to insert/update event aggregates (got -1). appId";
                object4 = ((zzbh)object2).zza;
                object4 = zzgo.zza((String)object4);
                ((zzgq)object).zza((String)object3, object4);
                break block11;
            }
            return;
        }
        object3 = this.zzj().zzg();
        object2 = zzgo.zza(((zzbh)object2).zza);
        ((zzgq)object3).zza("Error storing event aggregates. appId", object2, (Object)sQLiteException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zza(String object, String object2, ContentValues object3) {
        SQLiteException sQLiteException2;
        block4: {
            Object object4;
            Object object5;
            try {
                object5 = this.f_();
                object4 = object3.getAsString((String)object2);
                if (object4 == null) {
                    object3 = this.zzj();
                    object3 = ((zzgo)object3).zzm();
                    object5 = "Value of the primary key is not set.";
                    object4 = zzgo.zza((String)object2);
                    ((zzgq)object3).zza((String)object5, object4);
                    return;
                }
            }
            catch (SQLiteException sQLiteException2) {
                break block4;
            }
            Object object6 = new StringBuilder();
            ((StringBuilder)object6).append((String)object2);
            String string2 = " = ?";
            ((StringBuilder)object6).append(string2);
            object6 = ((StringBuilder)object6).toString();
            object4 = new String[]{object4};
            int n3 = object5.update((String)object, (ContentValues)object3, (String)object6, object4);
            long l2 = n3;
            long l3 = 0L;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 == false) {
                long l7;
                n3 = 0;
                object4 = null;
                int n4 = 5;
                long l8 = object5.insertWithOnConflict((String)object, null, (ContentValues)object3, n4);
                long l12 = l8 - (l7 = (long)-1);
                Object object7 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object7 != false) return;
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzg();
                object5 = "Failed to insert/update table (got -1). key";
                object4 = zzgo.zza((String)object);
                object6 = zzgo.zza((String)object2);
                ((zzgq)object3).zza((String)object5, object4, object6);
            }
            return;
        }
        zzgq zzgq2 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        object2 = zzgo.zza((String)object2);
        zzgq2.zza("Error storing into table. key", object, object2, (Object)sQLiteException2);
    }

    private final boolean zza(long l2, zzbe object, long l3, boolean bl2) {
        SQLiteException sQLiteException2;
        block12: {
            block11: {
                String string2;
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(object);
                Preconditions.checkNotEmpty(((zzbe)object).zza);
                Object object2 = this.h_().zza((zzbe)object).zzce();
                ContentValues contentValues = new ContentValues();
                String string3 = ((zzbe)object).zza;
                contentValues.put("app_id", string3);
                string3 = ((zzbe)object).zzb;
                contentValues.put("name", string3);
                long l4 = ((zzbe)object).zzd;
                Long l7 = l4;
                string3 = "timestamp";
                contentValues.put(string3, l7);
                Number number = l3;
                contentValues.put("metadata_fingerprint", number);
                contentValues.put("data", object2);
                number = (int)(bl2 ? 1 : 0);
                Object object3 = "realtime";
                contentValues.put((String)object3, (Integer)number);
                number = null;
                try {
                    object3 = this.f_();
                    string2 = "raw_events";
                }
                catch (SQLiteException sQLiteException2) {}
                object2 = "rowid = ?";
                Object object4 = String.valueOf(l2);
                object4 = new String[]{object4};
                int n3 = object3.update(string2, contentValues, (String)object2, object4);
                l2 = n3;
                long l8 = 1L;
                long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                if (l12 == false) break block11;
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzg();
                string2 = "Failed to update raw event. appId, updatedRows";
                object2 = ((zzbe)object).zza;
                object2 = zzgo.zza((String)object2);
                object4 = l2;
                ((zzgq)object3).zza(string2, object2, object4);
                return false;
                break block12;
            }
            return true;
        }
        zzgq zzgq2 = this.zzj().zzg();
        object = zzgo.zza(((zzbe)object).zza);
        zzgq2.zza("Error updating raw event. appId", object, (Object)sQLiteException2);
        return false;
    }

    private final boolean zza(String object, int n3, zzfw$zzb object2) {
        SQLiteException sQLiteException2;
        block14: {
            block13: {
                int n4;
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty((String)object);
                Preconditions.checkNotNull(object2);
                Object object3 = ((zzfw$zzb)object2).zzf();
                boolean n42 = ((String)object3).isEmpty();
                Integer n7 = null;
                if (n42) {
                    object3 = this.zzj().zzr();
                    object = zzgo.zza((String)object);
                    Integer sQLiteException2 = n3;
                    boolean bl2 = ((zzfw$zzb)object2).zzl();
                    if (bl2) {
                        int n8 = ((zzfw$zzb)object2).zzb();
                        n7 = n8;
                    }
                    object2 = String.valueOf(n7);
                    ((zzgq)object3).zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", object, sQLiteException2, object2);
                    return false;
                }
                object3 = ((zzio)object2).zzce();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", (String)object);
                Object object4 = n3;
                String string2 = "audience_id";
                contentValues.put(string2, (Integer)object4);
                n3 = (int)(((zzfw$zzb)object2).zzl() ? 1 : 0);
                if (n3 != 0) {
                    n3 = ((zzfw$zzb)object2).zzb();
                    object4 = n3;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                contentValues.put("filter_id", (Integer)object4);
                object4 = "event_name";
                string2 = ((zzfw$zzb)object2).zzf();
                contentValues.put((String)object4, string2);
                n3 = (int)(((zzfw$zzb)object2).zzm() ? 1 : 0);
                if (n3 != 0) {
                    n3 = (int)(((zzfw$zzb)object2).zzj() ? 1 : 0);
                    object4 = n3 != 0;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                object2 = "session_scoped";
                contentValues.put((String)object2, (Boolean)object4);
                object4 = "data";
                contentValues.put((String)object4, (byte[])object3);
                try {
                    object4 = this.f_();
                    object2 = "event_filters";
                    n4 = 5;
                }
                catch (SQLiteException sQLiteException2) {}
                long l2 = object4.insertWithOnConflict((String)object2, null, contentValues, n4);
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 != false) break block13;
                object4 = this.zzj();
                object4 = ((zzgo)object4).zzg();
                object2 = "Failed to insert event filter (got -1). appId";
                object3 = zzgo.zza((String)object);
                ((zzgq)object4).zza((String)object2, object3);
                break block14;
            }
            return true;
        }
        object2 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object2).zza("Error storing event filter. appId", object, (Object)sQLiteException2);
        return false;
    }

    private final boolean zza(String object, int n3, zzfw$zze object2) {
        SQLiteException sQLiteException2;
        block14: {
            block13: {
                int n4;
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty((String)object);
                Preconditions.checkNotNull(object2);
                Object object3 = ((zzfw$zze)object2).zze();
                boolean n42 = ((String)object3).isEmpty();
                Integer n7 = null;
                if (n42) {
                    object3 = this.zzj().zzr();
                    object = zzgo.zza((String)object);
                    Integer sQLiteException2 = n3;
                    boolean bl2 = ((zzfw$zze)object2).zzi();
                    if (bl2) {
                        int n8 = ((zzfw$zze)object2).zza();
                        n7 = n8;
                    }
                    object2 = String.valueOf(n7);
                    ((zzgq)object3).zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", object, sQLiteException2, object2);
                    return false;
                }
                object3 = ((zzio)object2).zzce();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", (String)object);
                Object object4 = n3;
                String string2 = "audience_id";
                contentValues.put(string2, (Integer)object4);
                n3 = (int)(((zzfw$zze)object2).zzi() ? 1 : 0);
                if (n3 != 0) {
                    n3 = ((zzfw$zze)object2).zza();
                    object4 = n3;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                contentValues.put("filter_id", (Integer)object4);
                object4 = "property_name";
                string2 = ((zzfw$zze)object2).zze();
                contentValues.put((String)object4, string2);
                n3 = (int)(((zzfw$zze)object2).zzj() ? 1 : 0);
                if (n3 != 0) {
                    n3 = (int)(((zzfw$zze)object2).zzh() ? 1 : 0);
                    object4 = n3 != 0;
                } else {
                    n3 = 0;
                    object4 = null;
                }
                object2 = "session_scoped";
                contentValues.put((String)object2, (Boolean)object4);
                object4 = "data";
                contentValues.put((String)object4, (byte[])object3);
                try {
                    object4 = this.f_();
                    object2 = "property_filters";
                    n4 = 5;
                }
                catch (SQLiteException sQLiteException2) {}
                long l2 = object4.insertWithOnConflict((String)object2, null, contentValues, n4);
                long l3 = -1;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 != false) break block13;
                object4 = this.zzj();
                object4 = ((zzgo)object4).zzg();
                object2 = "Failed to insert property filter (got -1). appId";
                object3 = zzgo.zza((String)object);
                ((zzgq)object4).zza((String)object2, object3);
                return false;
                break block14;
            }
            return true;
        }
        object2 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object2).zza("Error storing property filter. appId", object, (Object)sQLiteException2);
        return false;
    }

    public static /* bridge */ /* synthetic */ String[] zzac() {
        return zzj;
    }

    public static /* bridge */ /* synthetic */ String[] zzad() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ String[] zzae() {
        return zzk;
    }

    public static /* bridge */ /* synthetic */ String[] zzaf() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String[] zzag() {
        return zzh;
    }

    public static /* bridge */ /* synthetic */ String[] zzah() {
        return zzi;
    }

    public static /* bridge */ /* synthetic */ String[] zzai() {
        return zzf;
    }

    public static /* bridge */ /* synthetic */ String[] zzaj() {
        return zze;
    }

    public static /* bridge */ /* synthetic */ String[] zzak() {
        return zzl;
    }

    public static /* bridge */ /* synthetic */ String[] zzal() {
        return zzc;
    }

    private final String zzap() {
        long l2 = this.zzb().currentTimeMillis();
        Object object = Locale.US;
        object = zzlu.zzb;
        int n3 = ((zzlu)((Object)object)).zza();
        Object object2 = (Long)zzbn.zzan.zza(null);
        ((Long)object2).longValue();
        CharSequence charSequence = new StringBuilder("(upload_type = ");
        charSequence.append(n3);
        String string2 = " AND ABS(creation_timestamp - ";
        charSequence.append(string2);
        charSequence.append(l2);
        String string3 = ") > ";
        charSequence.append(string3);
        charSequence.append(object2);
        object2 = ")";
        charSequence.append((String)object2);
        charSequence = charSequence.toString();
        int n4 = ((zzlu)((Object)object)).zza();
        long l3 = zzai.zzm();
        StringBuilder stringBuilder = new StringBuilder("(upload_type != ");
        stringBuilder.append(n4);
        stringBuilder.append(string2);
        stringBuilder.append(l2);
        stringBuilder.append(string3);
        stringBuilder.append(l3);
        stringBuilder.append((String)object2);
        String string4 = stringBuilder.toString();
        return uc0_0.a("(", (String)charSequence, " OR ", string4, (String)object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final long zzb(String string2, String[] object) {
        Throwable throwable222;
        Cursor cursor;
        block7: {
            Object object2;
            block6: {
                object2 = this.f_();
                cursor = null;
                cursor = object2.rawQuery(string2, object);
                boolean bl2 = cursor.moveToFirst();
                if (!bl2) break block6;
                bl2 = false;
                object = null;
                long l2 = cursor.getLong(0);
                cursor.close();
                return l2;
            }
            try {
                object2 = "Database returned empty set";
                object = new SQLiteException((String)object2);
                throw object;
            }
            catch (Throwable throwable222) {
                break block7;
            }
            catch (SQLiteException sQLiteException) {}
            object2 = this.zzj();
            object2 = ((zzgo)object2).zzg();
            String string3 = "Database error";
            ((zzgq)object2).zza(string3, string2, (Object)sQLiteException);
            throw sQLiteException;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzgf$zzk zzb(String var1_1, long var2_5) {
        block15: {
            block16: {
                var4_6 = false;
                var5_7 = null;
                try {
                    var6_8 = this.f_();
                    var7_9 = "raw_events_metadata";
                    var8_10 /* !! */  = "metadata";
                    var8_10 /* !! */  = new String[]{var8_10 /* !! */ };
                    var9_11 = "app_id = ? and metadata_fingerprint = ?";
                    var10_12 = Long.toString(var2_5);
                    var11_13 = new String[]{var1_1, var10_12};
                    var12_14 = "rowid";
                    var13_15 = "2";
                    var10_12 = var6_8.query((String)var7_9, var8_10 /* !! */ , var9_11, var11_13, null, null, var12_14, var13_15);
                }
                catch (Throwable var1_3) {
                    break block15;
                }
                catch (SQLiteException var15_21) {
                    var10_12 = null;
                    ** GOTO lbl-1000
                }
                var14_16 = var10_12.moveToFirst();
                if (!var14_16) {
                    var15_17 = this.zzj();
                    var15_17 = var15_17.zzg();
                    var6_8 = "Raw event metadata record is missing. appId";
                    var7_9 = zzgo.zza((String)var1_1);
                    var15_17.zza((String)var6_8, var7_9);
                }
                ** GOTO lbl40
                {
                    catch (Throwable var1_2) {
                        var5_7 = var10_12;
                        break block15;
                    }
                    catch (SQLiteException var15_18) {
                        var16_22 = null;
                        var5_7 = var10_12;
                        var10_12 = null;
                        ** GOTO lbl-1000
                    }
                    var10_12.close();
                    return null;
lbl40:
                    // 1 sources

                    var14_16 = false;
                    var15_19 /* !! */  = null;
                    var15_19 /* !! */  = var10_12.getBlob(0);
                    try {
                        var6_8 = zzgf$zzk.zzx();
                        var15_19 /* !! */  = zzpj.zza((zzlp)var6_8, (byte[])var15_19 /* !! */ );
                        var15_19 /* !! */  = (zzgf$zzk$zza)var15_19 /* !! */ ;
                        var15_19 /* !! */  = var15_19 /* !! */ .zzaj();
                        var15_19 /* !! */  = (zzkg)var15_19 /* !! */ ;
                        var15_19 /* !! */  = (zzgf$zzk)var15_19 /* !! */ ;
                    }
                    catch (IOException var15_20) {}
                    {
                        var6_8 = this.zzj();
                        var6_8 = var6_8.zzg();
                        var7_9 = "Data loss. Failed to merge raw event metadata. appId";
                        var8_10 /* !! */  = zzgo.zza((String)var1_1);
                        var6_8.zza((String)var7_9, var8_10 /* !! */ , var15_20);
                    }
                    var10_12.close();
                    return null;
                }
                try {
                    var4_6 = var10_12.moveToNext();
                    if (!var4_6) break block16;
                    var5_7 = this.zzj();
                    var5_7 = var5_7.zzr();
                    var6_8 = "Get multiple raw event metadata records, expected one. appId";
                    var7_9 = zzgo.zza((String)var1_1);
                    var5_7.zza((String)var6_8, var7_9);
                }
                catch (SQLiteException var16_23) {
                    var5_7 = var10_12;
                    var10_12 = var15_19 /* !! */ ;
                    var15_19 /* !! */  = var16_23;
                    ** GOTO lbl-1000
                }
            }
            var10_12.close();
            var10_12.close();
            return var15_19 /* !! */ ;
lbl-1000:
            // 3 sources

            {
                var6_8 = this.zzj();
                var6_8 = var6_8.zzg();
                var7_9 = "Data loss. Error selecting raw event. appId";
                var1_1 = zzgo.zza((String)var1_1);
                var6_8.zza((String)var7_9, var1_1, var15_19 /* !! */ );
                if (var5_7 == null) return var10_12;
            }
            var5_7.close();
            return var10_12;
        }
        if (var5_7 == null) throw var1_4;
        var5_7.close();
        throw var1_4;
    }

    private static String zzb(List object) {
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return "";
        }
        object = TextUtils.join((CharSequence)", ", (Iterable)object);
        return cP.a(" AND (upload_type IN (", (String)object, "))");
    }

    private final boolean zzb(String stringArray, List object) {
        int n3;
        int n4;
        Object object2;
        long l2;
        Preconditions.checkNotEmpty((String)stringArray);
        this.zzam();
        this.zzv();
        Object object3 = this.f_();
        Object object4 = "select count(1) from audience_filter_values where app_id=?";
        Object object5 = new String[]{stringArray};
        try {
            l2 = this.zzb((String)object4, (String[])object5);
            zzai zzai2 = this.zze();
            object2 = zzbn.zzap;
            n4 = zzai2.zzb((String)stringArray, (zzfx)object2);
            n3 = 2000;
        }
        catch (SQLiteException sQLiteException) {
            object3 = this.zzj().zzg();
            stringArray = zzgo.zza((String)stringArray);
            ((zzgq)object3).zza("Database error querying filters. appId", stringArray, (Object)sQLiteException);
            return false;
        }
        n4 = Math.min(n3, n4);
        n4 = Math.max(0, n4);
        long l3 = n4;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 <= 0) {
            return false;
        }
        object4 = new ArrayList();
        object5 = null;
        for (int i3 = 0; i3 < (n3 = object.size()); ++i3) {
            object2 = (Integer)object.get(i3);
            if (object2 == null) {
                return false;
            }
            n3 = (Integer)object2;
            object2 = Integer.toString(n3);
            ((ArrayList)object4).add(object2);
        }
        object = TextUtils.join((CharSequence)",", object4);
        object = cP.a("(", (String)object, ")");
        object5 = " order by rowid desc limit -1 offset ?)";
        object = cP.a("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", (String)object, (String)object5);
        object4 = Integer.toString(n4);
        object4 = "audience_filter_values";
        int n7 = object3.delete((String)object4, (String)object, stringArray = new String[]{stringArray, object4});
        return n7 > 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzbh zzc(String string2, String string3, String string4) {
        void var4_9;
        Object object;
        block20: {
            block21: {
                Object object2;
                String string5;
                String[] stringArray;
                Object object3;
                Object object4;
                Object object5;
                String string6;
                block19: {
                    int n3;
                    Object object6;
                    boolean bl2;
                    block18: {
                        Preconditions.checkNotEmpty(string3);
                        Preconditions.checkNotEmpty(string4);
                        this.zzv();
                        this.zzam();
                        String string7 = "last_exempt_from_sampling";
                        String string8 = "current_session_count";
                        string6 = "current_bundle_count";
                        object5 = "last_fire_timestamp";
                        object4 = "last_bundled_timestamp";
                        object3 = "last_bundled_day";
                        stringArray = "last_sampled_complex_event_id";
                        string5 = "last_sampling_rate";
                        object = Arrays.asList("lifetime_count", string6, object5, object4, object3, stringArray, string5, string7, string8);
                        object2 = new ArrayList(object);
                        object = null;
                        string6 = this.f_();
                        bl2 = false;
                        object5 = new String[]{};
                        object4 = object2 = object2.toArray((T[])object5);
                        object4 = (String[])object2;
                        object3 = "app_id=? and name=?";
                        stringArray = new String[]{string3, string4};
                        string7 = null;
                        object6 = false;
                        string8 = null;
                        string5 = null;
                        object5 = string2;
                        string6 = string6.query(string2, object4, (String)object3, stringArray, null, null, null);
                        n3 = string6.moveToFirst();
                        if (n3 != 0) break block18;
                        string6.close();
                        return null;
                    }
                    try {
                        Object object7;
                        Object object8;
                        Object object9;
                        Object object10;
                        long l2;
                        long l3 = string6.getLong(0);
                        n3 = 1;
                        long l4 = string6.getLong(n3);
                        int n4 = 2;
                        long l7 = string6.getLong(n4);
                        n4 = 3;
                        boolean bl3 = string6.isNull(n4);
                        long l8 = 0L;
                        long l12 = bl3 ? l8 : (l2 = string6.getLong(n4));
                        n4 = 4;
                        bl3 = string6.isNull(n4);
                        if (bl3) {
                            object10 = null;
                        } else {
                            l2 = string6.getLong(n4);
                            object10 = object5 = Long.valueOf(l2);
                        }
                        n4 = 5;
                        bl3 = string6.isNull(n4);
                        if (bl3) {
                            object9 = null;
                        } else {
                            l2 = string6.getLong(n4);
                            object9 = object5 = Long.valueOf(l2);
                        }
                        n4 = 6;
                        bl3 = string6.isNull(n4);
                        if (bl3) {
                            object8 = null;
                        } else {
                            l2 = string6.getLong(n4);
                            object8 = object5 = Long.valueOf(l2);
                        }
                        n4 = 7;
                        bl3 = string6.isNull(n4);
                        if (!bl3) {
                            long l14;
                            l2 = string6.getLong(n4);
                            long l15 = l2 - (l14 = 1L);
                            object6 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                            if (!object6) {
                                bl2 = true;
                            }
                            object7 = object2 = Boolean.valueOf(bl2);
                        } else {
                            object7 = null;
                        }
                        n3 = 8;
                        n4 = (int)(string6.isNull(n3) ? 1 : 0);
                        long l16 = n4 != 0 ? l8 : (l2 = string6.getLong(n3));
                        object2 = new zzbh(string3, string4, l3, l4, l16, l7, l12, (Long)object10, (Long)object9, (Long)object8, (Boolean)object7);
                        n4 = (int)(string6.moveToNext() ? 1 : 0);
                        if (n4 == 0) break block19;
                        object5 = this.zzj();
                        object5 = ((zzgo)object5).zzg();
                        object4 = "Got multiple records for event aggregates, expected one. appId";
                        object3 = zzgo.zza(string3);
                        ((zzgq)object5).zza((String)object4, object3);
                    }
                    catch (Throwable throwable) {
                        object = string6;
                        break block20;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                string6.close();
                return object2;
                catch (Throwable throwable) {
                    break block20;
                }
                catch (SQLiteException sQLiteException) {
                    string6 = null;
                }
                {
                    object5 = this.zzj();
                    object5 = ((zzgo)object5).zzg();
                    object4 = "Error querying events. appId";
                    object3 = zzgo.zza(string3);
                    stringArray = this.zzi();
                    string5 = string4;
                    stringArray = stringArray.zza(string4);
                    ((zzgq)object5).zza((String)object4, object3, stringArray, object2);
                    if (string6 == null) break block21;
                }
                string6.close();
            }
            return null;
        }
        if (object != null) {
            object.close();
        }
        throw var4_9;
    }

    private final void zzj(String string2, String object) {
        String string3;
        Object object2;
        Preconditions.checkNotEmpty((String)object);
        this.zzv();
        this.zzam();
        try {
            object2 = this.f_();
            string3 = "app_id=?";
        }
        catch (SQLiteException sQLiteException) {
            object2 = this.zzj().zzg();
            object = zzgo.zza((String)object);
            ((zzgq)object2).zza("Error deleting snapshot. appId", object, (Object)sQLiteException);
            return;
        }
        String[] stringArray = new String[]{object};
        object2.delete(string2, string3, stringArray);
    }

    private final int zzr(String object) {
        int n3;
        Object object2;
        String[] stringArray;
        block8: {
            Preconditions.checkNotEmpty((String)object);
            this.zzv();
            this.zzam();
            try {
                stringArray = this.zze();
            }
            catch (SQLiteException sQLiteException) {
                object2 = this.zzj().zzg();
                object = zzgo.zza((String)object);
                ((zzgq)object2).zza("Error deleting over the limit queued batches. appId", object, (Object)sQLiteException);
                return 0;
            }
            object2 = zzbn.zzv;
            n3 = stringArray.zzb((String)object, (zzfx)object2);
            if (n3 > 0) break block8;
            return 0;
        }
        object2 = this.f_();
        String string2 = "upload_queue";
        String string3 = "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)";
        stringArray = String.valueOf(n3);
        stringArray = new String[]{object, stringArray};
        return object2.delete(string2, string3, stringArray);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c_() {
        Throwable throwable2222222;
        Cursor cursor;
        block7: {
            boolean bl2;
            SQLiteDatabase sQLiteDatabase;
            long l2;
            block6: {
                l2 = -1;
                cursor = null;
                sQLiteDatabase = this.f_();
                Object object = "select rowid from raw_events order by rowid desc limit 1;";
                cursor = sQLiteDatabase.rawQuery((String)object, null);
                bl2 = cursor.moveToFirst();
                if (bl2) break block6;
                {
                    block8: {
                        catch (Throwable throwable2222222) {
                            break block7;
                        }
                        catch (SQLiteException sQLiteException) {}
                        {
                            object = this.zzj();
                            object = ((zzgo)object).zzg();
                            String string2 = "Error querying raw events";
                            ((zzgq)object).zza(string2, (Object)sQLiteException);
                            if (cursor == null) break block8;
                        }
                        cursor.close();
                    }
                    return l2;
                }
                cursor.close();
                return l2;
            }
            bl2 = false;
            sQLiteDatabase = null;
            {
                l2 = cursor.getLong(0);
            }
            cursor.close();
            return l2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2222222;
    }

    public final long d_() {
        return this.zza("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long e_() {
        return this.zza("select max(timestamp) from raw_events", null, 0L);
    }

    public final SQLiteDatabase f_() {
        zzaz zzaz2;
        this.zzv();
        try {
            zzaz2 = this.zzm;
        }
        catch (SQLiteException sQLiteException) {
            this.zzj().zzr().zza("Error opening database", (Object)sQLiteException);
            throw sQLiteException;
        }
        return zzaz2.getWritableDatabase();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String g_() {
        void var2_5;
        SQLiteDatabase sQLiteDatabase;
        block9: {
            block10: {
                block8: {
                    sQLiteDatabase = this.f_();
                    String string2 = null;
                    String string3 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;";
                    sQLiteDatabase = sQLiteDatabase.rawQuery(string3, null);
                    try {
                        boolean bl2 = sQLiteDatabase.moveToFirst();
                        if (!bl2) break block8;
                        bl2 = false;
                        string3 = null;
                        string2 = sQLiteDatabase.getString(0);
                    }
                    catch (Throwable throwable) {
                        break block9;
                    }
                    catch (SQLiteException sQLiteException) {}
                    sQLiteDatabase.close();
                    return string2;
                }
                sQLiteDatabase.close();
                return null;
                catch (Throwable throwable) {
                    sQLiteDatabase = null;
                    break block9;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase = null;
                }
                {
                    void var3_9;
                    Object object = this.zzj();
                    object = ((zzgo)object).zzg();
                    String string4 = "Database error getting next bundle app id";
                    ((zzgq)object).zza(string4, var3_9);
                    if (sQLiteDatabase == null) break block10;
                }
                sQLiteDatabase.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var2_5;
    }

    public final int zza(String object, String string2) {
        String string3;
        Object object2;
        SQLiteDatabase sQLiteDatabase;
        Preconditions.checkNotEmpty((String)object);
        Preconditions.checkNotEmpty(string2);
        this.zzv();
        this.zzam();
        try {
            sQLiteDatabase = this.f_();
            object2 = "conditional_properties";
            string3 = "app_id=? and name=?";
        }
        catch (SQLiteException sQLiteException) {
            object2 = this.zzj().zzg();
            object = zzgo.zza((String)object);
            string2 = this.zzi().zzc(string2);
            ((zzgq)object2).zza("Error deleting conditional property", object, string2, (Object)sQLiteException);
            return 0;
        }
        String[] stringArray = new String[]{object, string2};
        return sQLiteDatabase.delete((String)object2, string3, stringArray);
    }

    public final long zza(zzgf$zzk object) {
        int n3;
        this.zzv();
        this.zzam();
        Preconditions.checkNotNull(object);
        Preconditions.checkNotEmpty(((zzgf$zzk)object).zzab());
        Object object2 = ((zzio)object).zzce();
        Object object3 = this.h_();
        long l2 = ((zzpj)object3).zza((byte[])object2);
        ContentValues contentValues = new ContentValues();
        String string2 = ((zzgf$zzk)object).zzab();
        contentValues.put("app_id", string2);
        Object object4 = l2;
        string2 = "metadata_fingerprint";
        contentValues.put(string2, (Long)object4);
        object4 = "metadata";
        contentValues.put((String)object4, object2);
        try {
            object2 = this.f_();
            object4 = "raw_events_metadata";
            string2 = null;
            n3 = 4;
        }
        catch (SQLiteException sQLiteException) {
            object3 = this.zzj().zzg();
            object = zzgo.zza(((zzgf$zzk)object).zzab());
            ((zzgq)object3).zza("Error storing raw event metadata. appId", object, (Object)sQLiteException);
            throw sQLiteException;
        }
        object2.insertWithOnConflict((String)object4, null, contentValues, n3);
        return l2;
    }

    public final long zza(String object) {
        String[] stringArray;
        SQLiteDatabase sQLiteDatabase;
        Preconditions.checkNotEmpty((String)object);
        this.zzv();
        this.zzam();
        try {
            sQLiteDatabase = this.f_();
        }
        catch (SQLiteException sQLiteException) {
            stringArray = this.zzj().zzg();
            object = zzgo.zza((String)object);
            stringArray.zza("Error deleting over the limit events. appId", object, (Object)sQLiteException);
            return 0L;
        }
        stringArray = this.zze();
        Object object2 = zzbn.zzp;
        int n3 = stringArray.zzb((String)object, (zzfx)object2);
        int n4 = 1000000;
        n3 = Math.min(n4, n3);
        n4 = 0;
        object2 = null;
        n3 = Math.max(0, n3);
        stringArray = String.valueOf(n3);
        object2 = "raw_events";
        String string2 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)";
        stringArray = new String[]{object, stringArray};
        return sQLiteDatabase.delete((String)object2, string2, stringArray);
    }

    public final long zza(String string2, zzgf$zzj zzgf$zzj, String string3, Map map2, zzlu zzlu2, Long l2) {
        SQLiteException sQLiteException2;
        long l3;
        block16: {
            long l4;
            block15: {
                CharSequence charSequence;
                String string4;
                boolean bl2;
                Object object;
                Object object2;
                long l7;
                Object object3 = l2;
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(zzgf$zzj);
                Preconditions.checkNotEmpty(string2);
                Object object4 = this.zze();
                zzfx zzfx2 = zzbn.zzch;
                Object object5 = ((zzai)object4).zza(zzfx2);
                l3 = -1;
                if (object5 == 0) {
                    return l3;
                }
                this.zzv();
                this.zzam();
                object5 = this.zzab();
                String string5 = "upload_queue";
                String string6 = null;
                if (object5 != 0) {
                    long l8;
                    long l12 = this.zzo().zzb.zza();
                    object4 = this.zzb();
                    l7 = object4.elapsedRealtime();
                    l12 = Math.abs(l7 - l12);
                    long l14 = l12 - (l8 = zzai.zzo());
                    object5 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object5 > 0) {
                        object4 = this.zzo().zzb;
                        ((zzhf)object4).zza(l7);
                        this.zzv();
                        this.zzam();
                        object5 = this.zzab();
                        if (object5 != 0 && (object5 = (object4 = this.f_()).delete(string5, (String)(object2 = this.zzap()), object = new String[0])) > 0) {
                            object2 = this.zzj().zzq();
                            object4 = object5;
                            object = "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted";
                            ((zzgq)object2).zza((String)object, object4);
                        }
                        if ((object5 = (Object)((zzai)(object4 = this.zze())).zza((zzfx)(object2 = zzbn.zzcj))) != 0) {
                            this.zzr(string2);
                        }
                    }
                }
                object4 = new ArrayList();
                object2 = map2.entrySet().iterator();
                while (bl2 = object2.hasNext()) {
                    object = object2.next();
                    string4 = (String)object.getKey();
                    object = (String)object.getValue();
                    charSequence = new StringBuilder();
                    charSequence.append(string4);
                    string4 = "=";
                    charSequence.append(string4);
                    charSequence.append((String)object);
                    object = charSequence.toString();
                    ((ArrayList)object4).add(object);
                }
                object2 = zzgf$zzj.zzce();
                object = new ContentValues();
                object.put("app_id", string2);
                object.put("measurement_batch", (byte[])object2);
                string4 = string3;
                object.put("upload_uri", string3);
                object2 = new StringBuilder();
                int n3 = ((ArrayList)object4).size();
                if (n3 > 0) {
                    charSequence = (CharSequence)((ArrayList)object4).get(0);
                    ((StringBuilder)object2).append(charSequence);
                    for (int i3 = 1; i3 < n3; ++i3) {
                        ((StringBuilder)object2).append((CharSequence)"\r\n");
                        Object object6 = ((ArrayList)object4).get(i3);
                        object6 = (CharSequence)object6;
                        ((StringBuilder)object2).append((CharSequence)object6);
                    }
                }
                object4 = ((StringBuilder)object2).toString();
                object.put("upload_headers", (String)object4);
                object5 = zzlu2.zza();
                object4 = object5;
                object.put("upload_type", (Integer)object4);
                l7 = this.zzb().currentTimeMillis();
                object4 = l7;
                object2 = "creation_timestamp";
                object.put((String)object2, (Long)object4);
                object4 = 0;
                string6 = "retry_count";
                object.put(string6, (Integer)object4);
                if (object3 != null) {
                    object4 = "associated_row_id";
                    object.put((String)object4, (Long)object3);
                }
                try {
                    object3 = this.f_();
                    object5 = 0;
                    object4 = null;
                }
                catch (SQLiteException sQLiteException2) {}
                l4 = object3.insert(string5, null, (ContentValues)object);
                long l15 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                if (l15 != false) break block15;
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzg();
                object4 = "Failed to insert MeasurementBatch (got -1) to upload_queue. appId";
                ((zzgq)object3).zza((String)object4, string2);
                break block16;
            }
            return l4;
        }
        this.zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", string2, (Object)sQLiteException2);
        return l3;
    }

    /*
     * Exception decompiling
     */
    public final Pair zza(String var1_1, Long var2_7) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [17, 16 : 114->120)] java.lang.Throwable
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
    public final zzas zza(long l2, String string2, long l3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        Throwable throwable2;
        Cursor cursor;
        block15: {
            zzas zzas2;
            block16: {
                int n3;
                Object object;
                Object object2;
                Object object3;
                SQLiteDatabase sQLiteDatabase;
                Object object4;
                block14: {
                    Preconditions.checkNotEmpty(string2);
                    this.zzv();
                    this.zzam();
                    object4 = new String[]{string2};
                    zzas2 = new zzas();
                    cursor = null;
                    sQLiteDatabase = this.f_();
                    object3 = "apps";
                    String string3 = "day";
                    String string4 = "daily_events_count";
                    String string5 = "daily_public_events_count";
                    String string6 = "daily_conversions_count";
                    String string7 = "daily_error_events_count";
                    String string8 = "daily_realtime_events_count";
                    String string9 = "daily_realtime_dcu_count";
                    String string10 = "daily_registered_triggers_count";
                    object2 = new String[]{string3, string4, string5, string6, string7, string8, string9, string10};
                    String string11 = "app_id=?";
                    String[] stringArray = new String[]{string2};
                    object = sQLiteDatabase;
                    cursor = sQLiteDatabase.query((String)object3, object2, string11, stringArray, null, null, null);
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) break block14;
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzr();
                    object = "Not updating daily counts, app is not known. appId";
                    object3 = zzgo.zza(string2);
                    ((zzgq)object4).zza((String)object, object3);
                    cursor.close();
                    return zzas2;
                }
                n3 = 0;
                object = null;
                try {
                    long l4 = cursor.getLong(0);
                    long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
                    if (l7 == false) {
                        n3 = 1;
                        zzas2.zzb = l4 = cursor.getLong(n3);
                        n3 = 2;
                        zzas2.zza = l4 = cursor.getLong(n3);
                        n3 = 3;
                        zzas2.zzc = l4 = cursor.getLong(n3);
                        n3 = 4;
                        zzas2.zzd = l4 = cursor.getLong(n3);
                        n3 = 5;
                        zzas2.zze = l4 = cursor.getLong(n3);
                        n3 = 6;
                        zzas2.zzf = l4 = cursor.getLong(n3);
                        n3 = 7;
                        zzas2.zzg = l4 = cursor.getLong(n3);
                    }
                    if (bl2) {
                        zzas2.zzb = l4 = zzas2.zzb + l3;
                    }
                    if (bl3) {
                        zzas2.zza = l4 = zzas2.zza + l3;
                    }
                    if (bl4) {
                        zzas2.zzc = l4 = zzas2.zzc + l3;
                    }
                    if (bl5) {
                        zzas2.zzd = l4 = zzas2.zzd + l3;
                    }
                    if (bl6) {
                        zzas2.zze = l4 = zzas2.zze + l3;
                    }
                    if (bl7) {
                        zzas2.zzf = l4 = zzas2.zzf + l3;
                    }
                    if (bl8) {
                        zzas2.zzg = l4 = zzas2.zzg + l3;
                    }
                    object = new ContentValues();
                    object3 = "day";
                    object2 = l2;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_public_events_count";
                    long l8 = zzas2.zza;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_events_count";
                    l8 = zzas2.zzb;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_conversions_count";
                    l8 = zzas2.zzc;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_error_events_count";
                    l8 = zzas2.zzd;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_realtime_events_count";
                    l8 = zzas2.zze;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_realtime_dcu_count";
                    l8 = zzas2.zzf;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "daily_registered_triggers_count";
                    l8 = zzas2.zzg;
                    object2 = l8;
                    object.put((String)object3, (Long)object2);
                    object3 = "apps";
                    object2 = "app_id=?";
                    sQLiteDatabase.update((String)object3, (ContentValues)object, (String)object2, (String[])object4);
                }
                catch (Throwable throwable2) {
                    break block15;
                }
                catch (SQLiteException sQLiteException) {}
                cursor.close();
                return zzas2;
                {
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    object3 = "Error updating daily counts. appId";
                    object2 = zzgo.zza(string2);
                    ((zzgq)object).zza((String)object3, object2, (Object)sQLiteException);
                    if (cursor == null) break block16;
                }
                cursor.close();
            }
            return zzas2;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    public final zzas zza(long l2, String string2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8) {
        return this.zza(l2, string2, 1L, false, false, bl4, false, bl6, bl7, bl8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzpi zza(long l2) {
        void var3_7;
        zzfx zzfx2;
        block11: {
            block12: {
                String string2;
                String string3;
                Object object;
                Object object2;
                Object object3;
                Object object4;
                SQLiteDatabase sQLiteDatabase;
                int n3;
                Object object5;
                block10: {
                    object5 = this.zze();
                    zzfx2 = zzbn.zzcj;
                    n3 = ((zzai)object5).zza(zzfx2);
                    zzfx2 = null;
                    if (n3 == 0) {
                        return null;
                    }
                    this.zzv();
                    this.zzam();
                    sQLiteDatabase = this.f_();
                    object4 = "upload_queue";
                    object3 = "rowId";
                    object2 = "app_id";
                    String[] stringArray = "measurement_batch";
                    object = "upload_uri";
                    string3 = "upload_headers";
                    string2 = "upload_type";
                    String string4 = "retry_count";
                    String string5 = "creation_timestamp";
                    String string6 = "associated_row_id";
                    object3 = new String[]{object3, object2, stringArray, object, string3, string2, string4, string5, string6};
                    object2 = "rowId=?";
                    object5 = String.valueOf(l2);
                    stringArray = new String[]{object5};
                    string4 = "1";
                    object = null;
                    string3 = null;
                    string2 = null;
                    sQLiteDatabase = sQLiteDatabase.query((String)object4, object3, (String)object2, stringArray, null, null, null, string4);
                    n3 = sQLiteDatabase.moveToFirst();
                    if (n3 != 0) break block10;
                    sQLiteDatabase.close();
                    return null;
                }
                n3 = 1;
                try {
                    object5 = sQLiteDatabase.getString(n3);
                    object5 = Preconditions.checkNotNull(object5);
                    object3 = object5;
                    object3 = (String)object5;
                    n3 = 2;
                    object = sQLiteDatabase.getBlob(n3);
                    n3 = 3;
                    string3 = sQLiteDatabase.getString(n3);
                    n3 = 4;
                    string2 = sQLiteDatabase.getString(n3);
                    n3 = 5;
                    int n4 = sQLiteDatabase.getInt(n3);
                    n3 = 6;
                    int n7 = sQLiteDatabase.getInt(n3);
                    n3 = 7;
                    long l3 = sQLiteDatabase.getLong(n3);
                    n3 = 8;
                    long l4 = sQLiteDatabase.getLong(n3);
                    object4 = this;
                    object5 = this.zza((String)object3, l2, (byte[])object, string3, string2, n4, n7, l3, l4);
                }
                catch (Throwable throwable) {
                    zzfx2 = sQLiteDatabase;
                    break block11;
                }
                catch (SQLiteException sQLiteException) {}
                sQLiteDatabase.close();
                return object5;
                catch (Throwable throwable) {
                    break block11;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase = null;
                }
                {
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzg();
                    object3 = "Error to querying MeasurementBatch from upload_queue. rowId";
                    object2 = l2;
                    ((zzgq)object4).zza((String)object3, object2, object5);
                    if (sQLiteDatabase == null) break block12;
                }
                sQLiteDatabase.close();
            }
            return null;
        }
        if (zzfx2 != null) {
            zzfx2.close();
        }
        throw var3_7;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String string2, int n3, int n4) {
        int n7;
        Object object;
        boolean bl2;
        Object object2;
        boolean bl3;
        String string3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Cursor cursor;
        Object object8;
        int n8;
        int n10;
        int n14;
        block20: {
            Throwable throwable222;
            block21: {
                List list;
                block22: {
                    String string4;
                    Object object9;
                    block19: {
                        n14 = n4;
                        this.zzv();
                        this.zzam();
                        n10 = 1;
                        object9 = null;
                        if (n3 > 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object8 = null;
                        }
                        Preconditions.checkArgument(n8 != 0);
                        if (n14 > 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object8 = null;
                        }
                        Preconditions.checkArgument(n8 != 0);
                        Preconditions.checkNotEmpty(string2);
                        cursor = null;
                        object7 = this.f_();
                        string4 = "queue";
                        object8 = "rowid";
                        object6 = "data";
                        object5 = "retry_count";
                        object6 = new String[]{object8, object6, object5};
                        object5 = "app_id=?";
                        object4 = new String[]{string2};
                        object3 = "rowid";
                        string3 = String.valueOf(n3);
                        bl3 = false;
                        object2 = null;
                        bl2 = false;
                        object = null;
                        cursor = object7.query(string4, object6, (String)object5, (String[])object4, null, null, (String)object3, string3);
                        n8 = cursor.moveToFirst();
                        if (n8 != 0) break block19;
                        object8 = Collections.emptyList();
                        cursor.close();
                        return object8;
                    }
                    try {
                        object7 = new ArrayList();
                        n7 = 0;
                        string4 = null;
                        break block20;
                    }
                    catch (Throwable throwable222) {
                        break block21;
                    }
                    catch (SQLiteException sQLiteException) {}
                    {
                        Object object10 = this.zzj();
                        object10 = ((zzgo)object10).zzg();
                        String string5 = "Error querying bundles. appId";
                        object9 = zzgo.zza(string2);
                        ((zzgq)object10).zza(string5, object9, (Object)sQLiteException);
                        list = Collections.emptyList();
                        if (cursor == null) break block22;
                    }
                    cursor.close();
                }
                return list;
            }
            if (cursor != null) {
                cursor.close();
            }
            throw throwable222;
        }
        while (true) {
            block26: {
                Object object11;
                long l2;
                block23: {
                    long l3;
                    long l4;
                    block24: {
                        boolean bl4;
                        block25: {
                            boolean bl5;
                            l2 = cursor.getLong(0);
                            object8 = cursor.getBlob(n10);
                            object4 = this.h_();
                            object8 = ((zzpj)object4).zzc((byte[])object8);
                            int n15 = ((ArrayList)object7).isEmpty();
                            if (n15 == 0 && (n15 = ((Object)object8).length + n7) > n14) break;
                            try {
                                object4 = zzgf$zzk.zzx();
                                object4 = zzpj.zza((zzlp)object4, (byte[])object8);
                                object4 = (zzgf$zzk$zza)object4;
                                bl3 = ((ArrayList)object7).isEmpty();
                                if (bl3) break block23;
                            }
                            catch (IOException iOException) {
                                object11 = this.zzj();
                                object11 = ((zzgo)object11).zzg();
                                object6 = "Failed to merge queued bundle. appId";
                                object5 = zzgo.zza(string2);
                                ((zzgq)object11).zza((String)object6, object5, iOException);
                            }
                            object2 = ((ArrayList)object7).get(0);
                            object2 = (Pair)object2;
                            object2 = ((Pair)object2).first;
                            object2 = (zzgf$zzk)object2;
                            object = ((zzkg$zza)object4).zzaj();
                            object = (zzkg)object;
                            object = (zzgf$zzk)object;
                            object3 = ((zzgf$zzk)object2).zzag();
                            bl4 = ((String)object3).equals(string3 = ((zzgf$zzk)object).zzag());
                            if (!bl4 || !(bl4 = ((String)(object3 = ((zzgf$zzk)object2).zzaf())).equals(string3 = ((zzgf$zzk)object).zzaf())) || (bl4 = ((zzgf$zzk)object2).zzaw()) != (bl5 = ((zzgf$zzk)object).zzaw()) || !(bl4 = ((String)(object3 = ((zzgf$zzk)object2).zzah())).equals(string3 = ((zzgf$zzk)object).zzah()))) break;
                            break block25;
                            break block26;
                            catch (IOException iOException) {
                                object11 = this.zzj();
                                object11 = ((zzgo)object11).zzg();
                                object6 = "Failed to unzip queued bundle. appId";
                                object5 = zzgo.zza(string2);
                                ((zzgq)object11).zza((String)object6, object5, iOException);
                            }
                            break block26;
                        }
                        object2 = ((zzgf$zzk)object2).zzau();
                        object2 = object2.iterator();
                        while (true) {
                            bl4 = object2.hasNext();
                            string3 = "_npa";
                            l4 = -1;
                            if (!bl4) break;
                            object3 = object2.next();
                            object11 = ((zzgf$zzp)(object3 = (zzgf$zzp)object3)).zzg();
                            n10 = (int)(string3.equals(object11) ? 1 : 0);
                            if (n10 != 0) {
                                l3 = ((zzgf$zzp)object3).zzc();
                                break block24;
                            }
                            n10 = 1;
                        }
                        l3 = l4;
                    }
                    object11 = ((zzgf$zzk)object).zzau();
                    object11 = object11.iterator();
                    while (bl3 = object11.hasNext()) {
                        object2 = object11.next();
                        object = ((zzgf$zzp)(object2 = (zzgf$zzp)object2)).zzg();
                        bl2 = string3.equals(object);
                        if (!bl2) continue;
                        l4 = ((zzgf$zzp)object2).zzc();
                        break;
                    }
                    if ((n10 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1))) != 0) break;
                }
                if (!(bl3 = cursor.isNull(n10 = 2))) {
                    n10 = cursor.getInt(n10);
                    ((zzgf$zzk$zza)object4).zzi(n10);
                }
                n8 = ((Object)object8).length;
                n7 += n8;
                object8 = ((zzkg$zza)object4).zzaj();
                object8 = (zzkg)object8;
                object8 = (zzgf$zzk)object8;
                object11 = l2;
                object8 = Pair.create((Object)object8, (Object)object11);
                ((ArrayList)object7).add(object8);
            }
            n8 = cursor.moveToNext();
            if (n8 == 0 || n7 > n14) break;
            n10 = 1;
        }
        cursor.close();
        return object7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String string2, zzop zzop2, int n3) {
        Throwable throwable2;
        zzfx zzfx2;
        block10: {
            Object object = this.zze();
            boolean bl2 = ((zzai)object).zza(zzfx2 = zzbn.zzcj);
            if (!bl2) {
                return Collections.emptyList();
            }
            Preconditions.checkNotEmpty(string2);
            this.zzv();
            this.zzam();
            zzfx2 = null;
            try {
                int n4;
                int n7;
                Object object2 = this.f_();
                Object object3 = "upload_queue";
                Object object4 = "rowId";
                String string3 = "app_id";
                CharSequence charSequence = "measurement_batch";
                Object object5 = "upload_uri";
                String string4 = "upload_headers";
                String string5 = "upload_type";
                Object object6 = "retry_count";
                String string6 = "creation_timestamp";
                String string7 = "associated_row_id";
                object4 = new String[]{object4, string3, charSequence, object5, string4, string5, object6, string6, string7};
                object = zzop2;
                object = zzop2.zza;
                object = zzar.zzb((List)object);
                string3 = this.zzap();
                object5 = "app_id=?";
                charSequence = new StringBuilder((String)object5);
                ((StringBuilder)charSequence).append((String)object);
                object = " AND NOT ";
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append(string3);
                string3 = ((StringBuilder)charSequence).toString();
                charSequence = new String[]{string2};
                string5 = "creation_timestamp ASC";
                if (n3 > 0) {
                    object = String.valueOf(n3);
                    object6 = object;
                } else {
                    n7 = 0;
                    object6 = null;
                }
                object5 = null;
                string4 = null;
                zzfx2 = object2.query((String)object3, object4, string3, (String[])charSequence, null, null, string5, (String)object6);
                object = new Object();
                while ((n4 = zzfx2.moveToNext()) != 0) {
                    n4 = 0;
                    object2 = null;
                    long l2 = zzfx2.getLong(0);
                    n4 = 2;
                    object5 = zzfx2.getBlob(n4);
                    n4 = 3;
                    string4 = zzfx2.getString(n4);
                    n4 = 4;
                    string5 = zzfx2.getString(n4);
                    n4 = 5;
                    n7 = zzfx2.getInt(n4);
                    n4 = 6;
                    int n8 = zzfx2.getInt(n4);
                    n4 = 7;
                    long l3 = zzfx2.getLong(n4);
                    n4 = 8;
                    long l4 = zzfx2.getLong(n4);
                    object3 = this;
                    object4 = string2;
                    object2 = this.zza(string2, l2, (byte[])object5, string4, string5, n7, n8, l3, l4);
                    if (object2 == null) continue;
                    ((ArrayList)object).add(object2);
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            catch (SQLiteException sQLiteException) {}
            zzfx2.close();
            return object;
            Object object7 = this.zzj();
            object7 = ((zzgo)object7).zzg();
            String string8 = "Error to querying MeasurementBatch from upload_queue. appId";
            String string9 = string2;
            ((zzgq)object7).zza(string8, string2, (Object)sQLiteException);
            List list = Collections.emptyList();
            if (zzfx2 != null) {
                zzfx2.close();
            }
            return list;
        }
        if (zzfx2 != null) {
            zzfx2.close();
        }
        throw throwable2;
    }

    public final List zza(String charSequence, String object, String string2) {
        boolean bl2;
        Preconditions.checkNotEmpty((String)charSequence);
        this.zzv();
        this.zzam();
        ArrayList<Object> arrayList = new ArrayList<Object>(3);
        arrayList.add(charSequence);
        String string3 = "app_id=?";
        charSequence = new StringBuilder(string3);
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (!bl3) {
            arrayList.add(object);
            object = " and origin=?";
            ((StringBuilder)charSequence).append((String)object);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2))) {
            object = new StringBuilder();
            object.append(string2);
            string2 = "*";
            object.append(string2);
            object = object.toString();
            arrayList.add(object);
            object = " and name glob ?";
            ((StringBuilder)charSequence).append((String)object);
        }
        object = new String[arrayList.size()];
        object = arrayList.toArray((T[])object);
        charSequence = ((StringBuilder)charSequence).toString();
        return this.zza((String)charSequence, (String[])object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zza(String string2, String[] stringArray) {
        Throwable throwable2;
        Cursor cursor;
        block10: {
            List list;
            block11: {
                boolean bl2;
                Object object;
                Object object2;
                Object object3;
                String string3;
                Object object4;
                Object object5;
                Object object6;
                String string4;
                Object object7;
                Object object8;
                Object object9;
                Object object10;
                Object object11;
                ArrayList<Object> arrayList;
                block9: {
                    this.zzv();
                    this.zzam();
                    arrayList = new ArrayList<Object>();
                    cursor = null;
                    object11 = this.f_();
                    object10 = "conditional_properties";
                    object9 = "app_id";
                    object8 = "origin";
                    object7 = "name";
                    string4 = "value";
                    String string5 = "active";
                    object6 = "trigger_event_name";
                    object5 = "trigger_timeout";
                    object4 = "timed_out_event";
                    string3 = "creation_timestamp";
                    String string6 = "triggered_event";
                    object3 = "triggered_timestamp";
                    object2 = "time_to_live";
                    object = "expired_event";
                    object9 = new String[]{object9, object8, object7, string4, string5, object6, object5, object4, string3, string6, object3, object2, object};
                    object6 = "rowid";
                    object5 = "1001";
                    string4 = null;
                    string5 = null;
                    object8 = string2;
                    object7 = stringArray;
                    cursor = object11.query((String)object10, object9, string2, stringArray, null, null, (String)object6, (String)object5);
                    bl2 = cursor.moveToFirst();
                    if (bl2) break block9;
                    cursor.close();
                    return arrayList;
                }
                try {
                    do {
                        zzpm zzpm2;
                        boolean bl3;
                        if ((bl2 = arrayList.size()) >= (bl3 = 1000 != 0)) {
                            object11 = this.zzj();
                            object11 = ((zzgo)object11).zzg();
                            object9 = "Read more than the max allowed conditional properties, ignoring extra";
                            object10 = (int)(bl3 ? 1 : 0);
                            ((zzgq)object11).zza((String)object9, object10);
                            break;
                        }
                        bl2 = false;
                        object11 = null;
                        object9 = cursor.getString(0);
                        bl3 = true;
                        object4 = cursor.getString((int)(bl3 ? 1 : 0));
                        int n3 = 2;
                        object7 = cursor.getString(n3);
                        n3 = 3;
                        object2 = this;
                        object6 = this.zza(cursor, n3);
                        n3 = 4;
                        if ((n3 = cursor.getInt(n3)) != 0) {
                            bl2 = true;
                        }
                        bl3 = 5 != 0;
                        string3 = cursor.getString((int)(bl3 ? 1 : 0));
                        bl3 = 6 != 0;
                        long l2 = cursor.getLong((int)(bl3 ? 1 : 0));
                        object10 = this.h_();
                        n3 = 7;
                        object8 = cursor.getBlob(n3);
                        string4 = zzbl.CREATOR;
                        object = object10 = ((zzpj)object10).zza((byte[])object8, (Parcelable.Creator)string4);
                        object = (zzbl)object10;
                        bl3 = 8 != 0;
                        long l3 = cursor.getLong((int)(bl3 ? 1 : 0));
                        object10 = this.h_();
                        n3 = 9;
                        object8 = cursor.getBlob(n3);
                        Object object12 = object10 = ((zzpj)object10).zza((byte[])object8, (Parcelable.Creator)string4);
                        object12 = (zzbl)object10;
                        bl3 = 10 != 0;
                        long l4 = cursor.getLong((int)(bl3 ? 1 : 0));
                        bl3 = 11 != 0;
                        long l7 = cursor.getLong((int)(bl3 ? 1 : 0));
                        object10 = this.h_();
                        n3 = 12;
                        object8 = cursor.getBlob(n3);
                        Object object13 = object10 = ((zzpj)object10).zza((byte[])object8, (Parcelable.Creator)string4);
                        object13 = (zzbl)object10;
                        object8 = zzpm2;
                        object5 = object4;
                        zzpm2 = new zzpm((String)object7, l4, object6, (String)object4);
                        object10 = object5;
                        object8 = object4;
                        object7 = zzpm2;
                        object11 = object5;
                        object5 = string3;
                        object4 = object;
                        object3 = object12;
                        ((zzag)object10)((String)object9, (String)object8, zzpm2, l3, bl2, string3, (zzbl)object, l2, (zzbl)object12, l7, (zzbl)object13);
                        arrayList.add(object10);
                    } while (bl2 = cursor.moveToNext());
                }
                catch (Throwable throwable2) {
                    break block10;
                }
                catch (SQLiteException sQLiteException) {}
                cursor.close();
                return arrayList;
                {
                    object11 = this.zzj();
                    object11 = ((zzgo)object11).zzg();
                    object10 = "Error querying conditional user property value";
                    ((zzgq)object11).zza((String)object10, (Object)sQLiteException);
                    list = Collections.emptyList();
                    if (cursor == null) break block11;
                }
                cursor.close();
            }
            return list;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    public final void zza(zzbh zzbh2) {
        this.zza("events", zzbh2);
    }

    public final void zza(zzh object, boolean bl2, boolean bl3) {
        SQLiteException sQLiteException22;
        Object object2;
        Object object3;
        block21: {
            block20: {
                boolean bl4;
                boolean bl5;
                boolean bl6;
                Object object4;
                boolean bl7;
                Object object5 = "apps";
                Preconditions.checkNotNull(object);
                this.zzv();
                this.zzam();
                object3 = ((zzh)object).zzac();
                Preconditions.checkNotNull(object3);
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", (String)object3);
                String[] stringArray = "app_instance_id";
                if (bl2) {
                    contentValues.put((String)stringArray, null);
                } else {
                    zzjj$zza zzjj$zza;
                    object2 = this.zzg.zzb((String)object3);
                    boolean bl8 = ((zzjj)object2).zza(zzjj$zza = zzjj$zza.zzb);
                    if (bl8) {
                        object2 = ((zzh)object).zzad();
                        contentValues.put((String)stringArray, (String)object2);
                    }
                }
                stringArray = ((zzh)object).zzah();
                contentValues.put("gmp_app_id", (String)stringArray);
                object2 = this.zzg.zzb((String)object3);
                stringArray = zzjj$zza.zza;
                boolean bl9 = ((zzjj)object2).zza((zzjj$zza)stringArray);
                if (bl9) {
                    object2 = "resettable_device_id_hash";
                    stringArray = ((zzh)object).zzaj();
                    contentValues.put((String)object2, (String)stringArray);
                }
                object2 = ((zzh)object).zzt();
                contentValues.put("last_bundle_index", (Long)object2);
                object2 = ((zzh)object).zzu();
                contentValues.put("last_bundle_start_timestamp", (Long)object2);
                object2 = ((zzh)object).zzs();
                contentValues.put("last_bundle_end_timestamp", (Long)object2);
                stringArray = ((zzh)object).zzaf();
                contentValues.put("app_version", (String)stringArray);
                stringArray = ((zzh)object).zzae();
                contentValues.put("app_store", (String)stringArray);
                object2 = ((zzh)object).zzq();
                contentValues.put("gmp_version", (Long)object2);
                object2 = ((zzh)object).zzn();
                contentValues.put("dev_cert_hash", (Long)object2);
                object2 = ((zzh)object).zzar();
                contentValues.put("measurement_enabled", (Boolean)object2);
                object2 = ((zzh)object).zzm();
                contentValues.put("day", (Long)object2);
                object2 = ((zzh)object).zzk();
                contentValues.put("daily_public_events_count", (Long)object2);
                object2 = ((zzh)object).zzj();
                contentValues.put("daily_events_count", (Long)object2);
                object2 = ((zzh)object).zzh();
                contentValues.put("daily_conversions_count", (Long)object2);
                object2 = ((zzh)object).zzg();
                contentValues.put("config_fetched_time", (Long)object2);
                object2 = ((zzh)object).zzp();
                contentValues.put("failed_config_fetch_time", (Long)object2);
                object2 = ((zzh)object).zze();
                contentValues.put("app_version_int", (Long)object2);
                stringArray = ((zzh)object).zzag();
                contentValues.put("firebase_instance_id", (String)stringArray);
                object2 = ((zzh)object).zzi();
                contentValues.put("daily_error_events_count", (Long)object2);
                object2 = ((zzh)object).zzl();
                contentValues.put("daily_realtime_events_count", (Long)object2);
                stringArray = ((zzh)object).zzai();
                contentValues.put("health_monitor_sample", (String)stringArray);
                long l2 = 0L;
                object2 = l2;
                contentValues.put("android_id", (Long)object2);
                object2 = ((zzh)object).zzaq();
                contentValues.put("adid_reporting_enabled", (Boolean)object2);
                stringArray = ((zzh)object).zzaa();
                contentValues.put("admob_app_id", (String)stringArray);
                long l3 = ((zzh)object).zzo();
                object2 = l3;
                contentValues.put("dynamite_version", (Long)object2);
                object2 = this.zzg.zzb((String)object3);
                stringArray = zzjj$zza.zzb;
                boolean bl10 = ((zzjj)object2).zza((zzjj$zza)stringArray);
                if (bl10) {
                    object2 = "session_stitching_token";
                    stringArray = ((zzh)object).zzal();
                    contentValues.put((String)object2, (String)stringArray);
                }
                object2 = ((zzh)object).zzat();
                contentValues.put("sgtm_upload_enabled", (Boolean)object2);
                object2 = ((zzh)object).zzw();
                contentValues.put("target_os_version", (Long)object2);
                l3 = ((zzh)object).zzv();
                object2 = l3;
                stringArray = "session_stitching_token_hash";
                contentValues.put((String)stringArray, (Long)object2);
                boolean bl11 = zzoy.zza();
                if (bl11 && (bl7 = ((zzai)(object2 = this.zze())).zze((String)object3, (zzfx)(stringArray = zzbn.zzcp)))) {
                    int n3 = ((zzh)object).zza();
                    object2 = n3;
                    contentValues.put("ad_services_version", (Integer)object2);
                    l3 = ((zzh)object).zzf();
                    object2 = l3;
                    stringArray = "attribution_eligibility_status";
                    contentValues.put((String)stringArray, (Long)object2);
                }
                object2 = ((zzh)object).zzau();
                contentValues.put("unmatched_first_open_without_ad_id", (Boolean)object2);
                stringArray = ((zzh)object).zzx();
                contentValues.put("npa_metadata_value", (Boolean)stringArray);
                l3 = ((zzh)object).zzr();
                object2 = l3;
                contentValues.put("bundle_delivery_index", (Long)object2);
                stringArray = ((zzh)object).zzam();
                contentValues.put("sgtm_preview_key", (String)stringArray);
                object2 = ((zzh)object).zzd();
                contentValues.put("dma_consent_state", (Integer)object2);
                object2 = ((zzh)object).zzc();
                contentValues.put("daily_realtime_dcu_count", (Integer)object2);
                stringArray = ((zzh)object).zzak();
                contentValues.put("serialized_npa_metadata", (String)stringArray);
                object2 = this.zze();
                stringArray = zzbn.zzcj;
                boolean bl12 = ((zzai)object2).zze((String)object3, (zzfx)stringArray);
                if (bl12) {
                    int n4 = ((zzh)object).zzb();
                    object2 = n4;
                    stringArray = "client_upload_eligibility";
                    contentValues.put((String)stringArray, (Integer)object2);
                }
                object2 = ((zzh)object).zzan();
                stringArray = "safelisted_events";
                if (object2 != null) {
                    boolean bl13 = object2.isEmpty();
                    if (bl13) {
                        object2 = this.zzj().zzr();
                        object4 = "Safelisted events should not be an empty list. appId";
                        ((zzgq)object2).zza((String)object4, object3);
                    } else {
                        object4 = ",";
                        object2 = TextUtils.join((CharSequence)object4, (Iterable)object2);
                        contentValues.put((String)stringArray, (String)object2);
                    }
                }
                if ((bl6 = com.google.android.gms.internal.measurement.zzog.zza()) && (bl5 = ((zzai)(object2 = this.zze())).zza((zzfx)(object4 = zzbn.zzce))) && !(bl4 = contentValues.containsKey((String)stringArray))) {
                    contentValues.put((String)stringArray, null);
                }
                stringArray = ((zzh)object).zzy();
                contentValues.put("unmatched_pfo", (Long)stringArray);
                stringArray = ((zzh)object).zzz();
                contentValues.put("unmatched_uwa", (Long)stringArray);
                object2 = "ad_campaign_info";
                object = ((zzh)object).zzav();
                contentValues.put((String)object2, (byte[])object);
                try {
                    object = this.f_();
                    object2 = "app_id = ?";
                }
                catch (SQLiteException sQLiteException22) {}
                stringArray = new String[]{object3};
                l3 = object.update((String)object5, contentValues, (String)object2, stringArray);
                long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                if (l4 != false) break block20;
                int n7 = 5;
                long l7 = object.insertWithOnConflict((String)object5, null, contentValues, n7);
                long l8 = -1;
                long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                if (l12 != false) break block20;
                object = this.zzj();
                object = ((zzgo)object).zzg();
                object2 = "Failed to insert/update app (got -1). appId";
                object5 = zzgo.zza((String)object3);
                ((zzgq)object).zza((String)object2, object5);
                break block21;
            }
            return;
        }
        object2 = this.zzj().zzg();
        object3 = zzgo.zza((String)object3);
        ((zzgq)object2).zza("Error storing app. appId", object3, (Object)sQLiteException22);
    }

    public final void zza(Long object) {
        SQLiteException sQLiteException22;
        block7: {
            block6: {
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(object);
                Object object2 = this.zze();
                Object object3 = zzbn.zzch;
                boolean n3 = ((zzai)object2).zza((zzfx)object3);
                if (!n3) {
                    return;
                }
                object2 = this.f_();
                object = String.valueOf(object);
                object = new String[]{object};
                object3 = "upload_queue";
                String string2 = "rowid=?";
                try {
                    int n4 = object2.delete((String)object3, string2, (String[])object);
                    int n7 = 1;
                    if (n4 == n7) break block6;
                }
                catch (SQLiteException sQLiteException22) {}
                object = this.zzj();
                object = ((zzgo)object).zzr();
                object2 = "Deleted fewer rows from upload_queue than expected";
                ((zzgq)object).zza((String)object2);
                break block7;
            }
            return;
        }
        this.zzj().zzg().zza("Failed to delete a MeasurementBatch in a upload_queue table", (Object)sQLiteException22);
        throw sQLiteException22;
    }

    public final void zza(String string2, zzbd object) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(object);
        this.zzv();
        this.zzam();
        zzjj zzjj2 = this.zzh(string2);
        Object object2 = zzjj.zza;
        if (zzjj2 == object2) {
            this.zzb(string2, (zzjj)object2);
        }
        zzjj2 = new ContentValues();
        object2 = "app_id";
        zzjj2.put((String)object2, string2);
        object = ((zzbd)object).zzf();
        zzjj2.put("dma_consent_settings", (String)object);
        this.zza("consent_settings", (String)object2, (ContentValues)zzjj2);
    }

    public final void zza(String string2, zzjj object) {
        Preconditions.checkNotNull(string2);
        Preconditions.checkNotNull(object);
        this.zzv();
        this.zzam();
        zzjj zzjj2 = this.zzh(string2);
        this.zzb(string2, zzjj2);
        zzjj2 = new ContentValues();
        String string3 = "app_id";
        zzjj2.put(string3, string2);
        object = ((zzjj)object).zzf();
        zzjj2.put("storage_consent_at_bundling", (String)object);
        this.zza("consent_settings", string3, (ContentValues)zzjj2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(String string2, Long l2, String string3, Bundle bundle) {
        long l3;
        zzar zzar2 = this;
        String string4 = string2;
        Preconditions.checkNotNull(bundle);
        this.zzv();
        this.zzam();
        Object object = this.zze();
        Object object2 = zzbn.zzcz;
        boolean bl2 = ((zzai)object).zza((zzfx)object2);
        if (bl2 && l2 != null) {
            l3 = l2;
            object = new zzax(this, string2, l3);
        } else {
            object = new zzax(zzar2, string4);
        }
        Object object3 = object;
        object = ((zzax)object).zza();
        boolean bl3;
        block0: while (!(bl3 = object.isEmpty())) {
            Iterator iterator = object.iterator();
            block1: while (true) {
                Object object4;
                Object object5;
                boolean bl4;
                Object object6;
                Bundle bundle2;
                Object object7;
                if (bl2 = iterator.hasNext()) {
                    object = (zzav)iterator.next();
                    bl3 = TextUtils.isEmpty((CharSequence)string3);
                    if (!bl3 && (object2 = zzar2.zzb(string4, l3 = ((zzav)object).zzb)) != null) {
                        boolean bl5;
                        object2 = ((zzgf$zzk)object2).zzau().iterator();
                        while (bl5 = object2.hasNext()) {
                            object7 = ((zzgf$zzp)object2.next()).zzg();
                            bl5 = ((String)object7).equals(string3);
                            if (!bl5) continue;
                            continue block1;
                        }
                    }
                    object2 = this.h_();
                    object7 = ((zzav)object).zzd;
                    bundle2 = new Bundle();
                    object6 = ((zzgf$zzf)object7).zzh().iterator();
                } else {
                    object = ((zzax)object3).zza();
                    string4 = string2;
                    continue block0;
                }
                while (bl4 = object6.hasNext()) {
                    zzgf$zzh zzgf$zzh = (zzgf$zzh)object6.next();
                    boolean bl6 = zzgf$zzh.zzj();
                    if (bl6) {
                        object5 = zzgf$zzh.zzg();
                        double d2 = zzgf$zzh.zza();
                        bundle2.putDouble((String)object5, d2);
                        continue;
                    }
                    bl6 = zzgf$zzh.zzk();
                    if (bl6) {
                        object5 = zzgf$zzh.zzg();
                        float f5 = zzgf$zzh.zzb();
                        bundle2.putFloat((String)object5, f5);
                        continue;
                    }
                    bl6 = zzgf$zzh.zzl();
                    if (bl6) {
                        object5 = zzgf$zzh.zzg();
                        long l4 = zzgf$zzh.zzd();
                        bundle2.putLong((String)object5, l4);
                        continue;
                    }
                    bl6 = zzgf$zzh.zzn();
                    if (bl6) {
                        object5 = zzgf$zzh.zzg();
                        String string5 = zzgf$zzh.zzh();
                        bundle2.putString((String)object5, string5);
                        continue;
                    }
                    object5 = zzgf$zzh.zzi();
                    bl6 = object5.isEmpty();
                    if (!bl6) {
                        object5 = zzgf$zzh.zzg();
                        Bundle[] bundleArray = zzpj.zzb(zzgf$zzh.zzi());
                        bundle2.putParcelableArray((String)object5, (Parcelable[])bundleArray);
                        continue;
                    }
                    object5 = ((zzpj)object2).zzj().zzg();
                    object4 = "Unexpected parameter type for parameter";
                    ((zzgq)object5).zza((String)object4, zzgf$zzh);
                }
                object2 = "_o";
                object6 = bundle2.getString((String)object2);
                bundle2.remove((String)object2);
                object4 = ((zzgf$zzf)object7).zzg();
                if (object6 == null) {
                    object6 = "";
                }
                Object object8 = object6;
                long l7 = ((zzgf$zzf)object7).zzd();
                object5 = object2;
                object2 = new zzgs((String)object4, (String)object6, bundle2, l7);
                object7 = this.zzs();
                object6 = ((zzgs)object2).zzc;
                Bundle bundle3 = bundle;
                ((zzpn)object7).zza((Bundle)object6, bundle);
                object4 = zzar2.zzu;
                object8 = ((zzgs)object2).zzb;
                String string6 = ((zzav)object).zzd.zzg();
                long l8 = ((zzav)object).zzd.zzd();
                object7 = ((zzav)object).zzd;
                long l12 = ((zzgf$zzf)object7).zzc();
                object2 = ((zzgs)object2).zzc;
                object5 = object6;
                String string7 = string2;
                object6 = new zzbe((zzic)object4, (String)object8, string2, string6, l8, l12, (Bundle)object2);
                l3 = ((zzav)object).zza;
                long l14 = ((zzav)object).zzb;
                boolean bl7 = ((zzav)object).zzc;
                object = this;
                this.zza(l3, (zzbe)object6, l14, bl7);
                string4 = string2;
            }
            break;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String string2, List list) {
        int n3;
        int n4;
        Object object;
        Object object2;
        Object object3;
        int n7;
        Object object4;
        int n8;
        zzar zzar2 = this;
        String string3 = string2;
        Object object5 = list;
        ArrayList<Object> arrayList = "app_id=? and audience_id=?";
        Object object6 = "event_filters";
        Object object7 = "app_id=?";
        String string4 = "property_filters";
        Preconditions.checkNotNull(list);
        int n10 = 0;
        Object object8 = null;
        while (true) {
            int n14;
            block21: {
                int n15;
                block22: {
                    block20: {
                        if (n10 >= (n8 = list.size())) break block20;
                        object4 = (String[])((zzfw$zza)object5.get(n10)).zzch();
                        n7 = ((zzfw$zza$zza)object4).zza();
                        if (n7 == 0) break block21;
                        object3 = null;
                        break block22;
                    }
                    this.zzam();
                    this.zzv();
                    Preconditions.checkNotEmpty(string2);
                    Preconditions.checkNotNull(list);
                    object2 = this.f_();
                    object2.beginTransaction();
                    try {
                        this.zzam();
                        this.zzv();
                        Preconditions.checkNotEmpty(string2);
                        object8 = this.f_();
                        object4 = new String[]{string2};
                        object8.delete(string4, (String)object7, (String[])object4);
                        object4 = new String[]{string2};
                        object8.delete((String)object6, (String)object7, (String[])object4);
                        object7 = list.iterator();
                        break;
                    }
                    catch (Throwable throwable) {}
                    object2.endTransaction();
                    throw throwable;
                }
                for (n7 = 0; n7 < (n15 = ((zzfw$zza$zza)object4).zza()); ++n7) {
                    boolean bl2;
                    zzfw$zzb$zza zzfw$zzb$zza = (zzfw$zzb$zza)((zzfw$zza$zza)object4).zza(n7).zzch();
                    zzfw$zzb$zza zzfw$zzb$zza2 = (zzfw$zzb$zza)((zzkg$zza)zzfw$zzb$zza.clone());
                    String string5 = zzjp.zzb(zzfw$zzb$zza.zzb());
                    if (string5 != null) {
                        zzfw$zzb$zza2.zza(string5);
                        bl2 = true;
                    } else {
                        bl2 = false;
                        string5 = null;
                    }
                    for (int i3 = 0; i3 < (n14 = zzfw$zzb$zza.zza()); ++i3) {
                        object2 = zzfw$zzb$zza.zza(i3);
                        String string6 = ((zzfw$zzc)object2).zze();
                        object = zzjo.zza(string6);
                        if (object == null) continue;
                        object2 = (zzfw$zzc)((zzkg)((zzfw$zzc$zza)((zzkg)object2).zzch()).zza((String)object).zzaj());
                        zzfw$zzb$zza2.zza(i3, (zzfw$zzc)object2);
                        bl2 = true;
                    }
                    if (!bl2) continue;
                    object2 = ((zzfw$zza$zza)object4).zza(n7, zzfw$zzb$zza2);
                    object4 = (zzfw$zza)((zzkg)((zzkg$zza)object2).zzaj());
                    object5.set(n10, object4);
                    object4 = object2;
                }
            }
            if ((n14 = ((zzfw$zza$zza)object4).zzb()) != 0) {
                object2 = null;
                for (n14 = 0; n14 < (n4 = ((zzfw$zza$zza)object4).zzb()); ++n14) {
                    object = ((zzfw$zza$zza)object4).zzb(n14);
                    object3 = zzjr.zza(object.zze());
                    if (object3 == null) continue;
                    object = ((zzfw$zze$zza)object.zzch()).zza((String)object3);
                    object4 = ((zzfw$zza$zza)object4).zza(n14, (zzfw$zze$zza)object);
                    object = (zzfw$zza)((zzkg)((zzkg$zza)object4).zzaj());
                    object5.set(n10, object);
                }
            }
            ++n10;
        }
        block6: while ((n10 = (int)(object7.hasNext() ? 1 : 0)) != 0) {
            block19: {
                object8 = object7.next();
                object8 = (zzfw$zza)object8;
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty(string2);
                Preconditions.checkNotNull(object8);
                n8 = (int)(((zzfw$zza)object8).zzg() ? 1 : 0);
                if (n8 == 0) {
                    object8 = this.zzj();
                    object8 = ((zzgo)object8).zzr();
                    object4 = "Audience with no ID. appId";
                    object = zzgo.zza(string2);
                    ((zzgq)object8).zza((String)object4, object);
                    continue;
                }
                n8 = ((zzfw$zza)object8).zza();
                object = ((zzfw$zza)object8).zze();
                object = object.iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = object.next();
                    n7 = (int)(((zzfw$zzb)(object3 = (zzfw$zzb)object3)).zzl() ? 1 : 0);
                    if (n7 != 0) continue;
                    object8 = this.zzj();
                    object8 = ((zzgo)object8).zzr();
                    object = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                    object3 = zzgo.zza(string2);
                    object4 = n8;
                    ((zzgq)object8).zza((String)object, object3, object4);
                    continue block6;
                }
                object = ((zzfw$zza)object8).zzf();
                object = object.iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = object.next();
                    n7 = (int)(((zzfw$zze)(object3 = (zzfw$zze)object3)).zzi() ? 1 : 0);
                    if (n7 != 0) continue;
                    object8 = this.zzj();
                    object8 = ((zzgo)object8).zzr();
                    object = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                    object3 = zzgo.zza(string2);
                    object4 = n8;
                    ((zzgq)object8).zza((String)object, object3, object4);
                    continue block6;
                }
                object = ((zzfw$zza)object8).zze();
                object = object.iterator();
                while ((n7 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    object3 = object.next();
                    n7 = (int)(zzar2.zza(string3, n8, (zzfw$zzb)(object3 = (zzfw$zzb)object3)) ? 1 : 0);
                    if (n7 != 0) continue;
                    n4 = 0;
                    object = null;
                    break block19;
                }
                n4 = 1;
            }
            if (n4 != 0) {
                object8 = ((zzfw$zza)object8).zzf();
                object8 = object8.iterator();
                while ((n7 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                    object3 = object8.next();
                    n7 = (int)(zzar2.zza(string3, n8, (zzfw$zze)(object3 = (zzfw$zze)object3)) ? 1 : 0);
                    if (n7 != 0) continue;
                    n4 = 0;
                    object = null;
                    break;
                }
            }
            if (n4 != 0) continue;
            this.zzam();
            this.zzv();
            Preconditions.checkNotEmpty(string2);
            object8 = this.f_();
            object = String.valueOf(n8);
            object = new String[]{string3, object};
            object8.delete(string4, arrayList, object);
            object4 = String.valueOf(n8);
            object4 = new String[]{string3, object4};
            object8.delete((String)object6, arrayList, (String[])object4);
        }
        arrayList = new ArrayList<Object>();
        object5 = list.iterator();
        while ((n3 = object5.hasNext()) != 0) {
            object6 = object5.next();
            boolean bl3 = ((zzfw$zza)(object6 = (zzfw$zza)object6)).zzg();
            if (bl3) {
                n3 = ((zzfw$zza)object6).zza();
                object6 = n3;
            } else {
                n3 = 0;
                object6 = null;
            }
            arrayList.add(object6);
        }
        zzar2.zzb(string3, arrayList);
        object2.setTransactionSuccessful();
        object2.endTransaction();
    }

    public final void zza(List object) {
        String string2;
        long l2;
        this.zzv();
        this.zzam();
        Preconditions.checkNotNull(object);
        Preconditions.checkNotZero(object.size());
        boolean bl2 = this.zzab();
        if (!bl2) {
            return;
        }
        object = TextUtils.join((CharSequence)",", (Iterable)object);
        object = cP.a("(", (String)object, ")");
        Object object2 = cP.a("SELECT COUNT(1) FROM queue WHERE rowid IN ", (String)object, " AND retry_count =  2147483647 LIMIT 1");
        CharSequence charSequence = null;
        long l3 = this.zzb((String)object2, (String[])null);
        long l4 = l3 - (l2 = 0L);
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 > 0) {
            object2 = this.zzj().zzr();
            charSequence = "The number of upload retries exceeds the limit. Will remain unchanged.";
            ((zzgq)object2).zza((String)charSequence);
        }
        try {
            object2 = this.f_();
            string2 = "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ";
        }
        catch (SQLiteException sQLiteException) {
            this.zzj().zzg().zza("Error incrementing retry count. error", (Object)sQLiteException);
            return;
        }
        charSequence = new StringBuilder(string2);
        ((StringBuilder)charSequence).append((String)object);
        object = " AND (retry_count IS NULL OR retry_count < 2147483647)";
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        object2.execSQL((String)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zza(zzgf$zzk object, boolean bl2) {
        String string2;
        Long l2;
        Object object3;
        Object object4;
        long l3;
        this.zzv();
        this.zzam();
        Preconditions.checkNotNull(object);
        Preconditions.checkNotEmpty(((zzgf$zzk)object).zzab());
        boolean bl3 = ((zzgf$zzk)object).zzbm();
        Preconditions.checkState(bl3);
        this.zzw();
        Object object2 = this.zzb();
        long l4 = object2.currentTimeMillis();
        long l7 = ((zzgf$zzk)object).zzn();
        long l8 = zzai.zzm();
        l8 = l4 - l8;
        long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (l12 < 0 || (l12 = (l3 = (l7 = ((zzgf$zzk)object).zzn()) - (l8 = zzai.zzm() + l4)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) > 0) {
            object4 = this.zzj().zzr();
            object3 = zzgo.zza(((zzgf$zzk)object).zzab());
            object2 = l4;
            l8 = ((zzgf$zzk)object).zzn();
            l2 = l8;
            string2 = "Storing bundle outside of the max uploading time span. appId, now, timestamp";
            ((zzgq)object4).zza(string2, object3, object2, l2);
        }
        object2 = ((zzio)object).zzce();
        l2 = null;
        try {
            object4 = this.h_();
            object2 = ((zzpj)object4).zzb((byte[])object2);
            object4 = this.zzj().zzq();
        }
        catch (IOException iOException) {
            object2 = this.zzj().zzg();
            object = zzgo.zza(((zzgf$zzk)object).zzab());
            ((zzgq)object2).zza("Data loss. Failed to serialize bundle. appId", object, iOException);
            return false;
        }
        int n3 = ((Object)object2).length;
        object3 = n3;
        ((zzgq)object4).zza("Saving bundle, size", object3);
        object4 = new ContentValues();
        string2 = ((zzgf$zzk)object).zzab();
        object4.put("app_id", string2);
        long l14 = ((zzgf$zzk)object).zzn();
        object3 = l14;
        string2 = "bundle_end_timestamp";
        object4.put(string2, (Long)object3);
        object3 = "data";
        object4.put((String)object3, (byte[])object2);
        Object object5 = (int)(bl2 ? 1 : 0);
        object2 = "has_realtime";
        object4.put((String)object2, (Integer)object5);
        boolean bl4 = ((zzgf$zzk)object).zzbt();
        if (bl4) {
            int n4 = ((zzgf$zzk)object).zzg();
            object5 = n4;
            object2 = "retry_count";
            object4.put((String)object2, (Integer)object5);
        }
        try {
            object5 = this.f_();
            object2 = "queue";
            n3 = 0;
            object3 = null;
            l7 = object5.insert((String)object2, null, (ContentValues)object4);
            l8 = -1;
            long l15 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (l15 != false) return true;
            object5 = this.zzj();
            object5 = ((zzgo)object5).zzg();
            object2 = "Failed to insert bundle (got -1). appId";
            object4 = ((zzgf$zzk)object).zzab();
            object4 = zzgo.zza((String)object4);
            ((zzgq)object5).zza((String)object2, object4);
            return false;
        }
        catch (SQLiteException sQLiteException2) {}
        object2 = this.zzj().zzg();
        object = zzgo.zza(((zzgf$zzk)object).zzab());
        ((zzgq)object2).zza("Error storing bundle. appId", object, (Object)sQLiteException2);
        return false;
    }

    public final boolean zza(zzag object) {
        block9: {
            long l2;
            long l3;
            Object object2;
            Preconditions.checkNotNull(object);
            this.zzv();
            this.zzam();
            Object object3 = ((zzag)object).zza;
            Preconditions.checkNotNull(object3);
            Object object4 = ((zzag)object).zzc.zza;
            object4 = this.zze((String)object3, (String)object4);
            if (object4 == null) {
                object4 = "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?";
                object2 = new String[]{object3};
                l3 = this.zzb((String)object4, (String[])object2);
                long l4 = l3 - (l2 = 1000L);
                Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (object5 >= 0) {
                    return false;
                }
            }
            object4 = new ContentValues();
            object4.put("app_id", (String)object3);
            String string2 = ((zzag)object).zzb;
            object4.put("origin", string2);
            object2 = ((zzag)object).zzc.zza;
            object4.put("name", (String)object2);
            object2 = Preconditions.checkNotNull(((zzag)object).zzc.zza());
            zzar.zza((ContentValues)object4, "value", object2);
            boolean bl2 = ((zzag)object).zze;
            object2 = bl2;
            object4.put("active", (Boolean)object2);
            string2 = ((zzag)object).zzf;
            object4.put("trigger_event_name", string2);
            object2 = ((zzag)object).zzh;
            object4.put("trigger_timeout", (Long)object2);
            this.zzs();
            object2 = zzpn.zza(((zzag)object).zzg);
            object4.put("timed_out_event", (byte[])object2);
            object2 = ((zzag)object).zzd;
            object4.put("creation_timestamp", (Long)object2);
            this.zzs();
            object2 = zzpn.zza(((zzag)object).zzi);
            object4.put("triggered_event", (byte[])object2);
            object2 = ((zzag)object).zzc.zzb;
            object4.put("triggered_timestamp", (Long)object2);
            long l7 = ((zzag)object).zzj;
            object2 = l7;
            string2 = "time_to_live";
            object4.put(string2, (Long)object2);
            this.zzs();
            object = zzpn.zza(((zzag)object).zzk);
            object2 = "expired_event";
            object4.put((String)object2, (byte[])object);
            object = this.f_();
            object2 = "conditional_properties";
            string2 = null;
            int n3 = 5;
            l3 = object.insertWithOnConflict((String)object2, null, (ContentValues)object4, n3);
            l2 = -1;
            long l8 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l8 != false) break block9;
            object = this.zzj();
            object = ((zzgo)object).zzg();
            object4 = "Failed to insert/update conditional user property (got -1)";
            object2 = zzgo.zza((String)object3);
            try {
                ((zzgq)object).zza((String)object4, object2);
            }
            catch (SQLiteException sQLiteException) {
                object4 = this.zzj().zzg();
                object2 = "Error storing conditional user property";
                object3 = zzgo.zza((String)object3);
                ((zzgq)object4).zza((String)object2, object3, (Object)sQLiteException);
            }
        }
        return true;
    }

    public final boolean zza(zzbe object, long l2, boolean bl2) {
        SQLiteException sQLiteException2;
        Object object2;
        block9: {
            block8: {
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(object);
                Preconditions.checkNotEmpty(((zzbe)object).zza);
                Object object3 = this.h_().zza((zzbe)object).zzce();
                ContentValues contentValues = new ContentValues();
                String string2 = ((zzbe)object).zza;
                contentValues.put("app_id", string2);
                string2 = ((zzbe)object).zzb;
                contentValues.put("name", string2);
                long l3 = ((zzbe)object).zzd;
                Long l4 = l3;
                string2 = "timestamp";
                contentValues.put(string2, l4);
                Number number = l2;
                contentValues.put("metadata_fingerprint", number);
                contentValues.put("data", object3);
                number = (int)(bl2 ? 1 : 0);
                Object object4 = "realtime";
                contentValues.put((String)object4, (Integer)number);
                number = null;
                try {
                    object4 = this.f_();
                    object2 = "raw_events";
                    object3 = null;
                }
                catch (SQLiteException sQLiteException2) {}
                long l7 = object4.insert((String)object2, null, contentValues);
                long l8 = -1;
                long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
                if (l12 != false) break block8;
                object4 = this.zzj();
                object4 = ((zzgo)object4).zzg();
                object2 = "Failed to insert raw event (got -1). appId";
                object3 = ((zzbe)object).zza;
                object3 = zzgo.zza((String)object3);
                ((zzgq)object4).zza((String)object2, object3);
                return false;
                break block9;
            }
            return true;
        }
        object2 = this.zzj().zzg();
        object = zzgo.zza(((zzbe)object).zza);
        ((zzgq)object2).zza("Error storing raw event. appId", object, (Object)sQLiteException2);
        return false;
    }

    public final boolean zza(zzpo object) {
        block14: {
            long l2;
            Object object2;
            Preconditions.checkNotNull(object);
            this.zzv();
            this.zzam();
            Object object3 = ((zzpo)object).zza;
            Object object4 = ((zzpo)object).zzc;
            object3 = this.zze((String)object3, (String)object4);
            if (object3 == null) {
                object3 = ((zzpo)object).zzc;
                Object object5 = zzpn.zzg((String)object3);
                object4 = null;
                if (object5 != 0) {
                    int n3;
                    int n4;
                    zzfx zzfx2;
                    String string2;
                    long l3;
                    object3 = ((zzpo)object).zza;
                    object3 = new String[]{object3};
                    object2 = "select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'";
                    l2 = this.zzb((String)object2, (String[])object3);
                    long l4 = l2 - (l3 = (long)((zzai)(object3 = this.zze())).zza(string2 = ((zzpo)object).zza, zzfx2 = zzbn.zzaq, n4 = 25, n3 = 100));
                    object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object5 >= 0) {
                        return false;
                    }
                } else {
                    object3 = "_npa";
                    object2 = ((zzpo)object).zzc;
                    object5 = ((String)object3).equals(object2);
                    if (object5 == 0) {
                        long l7;
                        object3 = ((zzpo)object).zza;
                        object2 = ((zzpo)object).zzb;
                        object2 = "select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'";
                        l2 = this.zzb((String)object2, (String[])(object3 = new String[]{object3, object2}));
                        long l8 = l2 - (l7 = (long)25);
                        object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object5 >= 0) {
                            return false;
                        }
                    }
                }
            }
            object3 = new ContentValues();
            object2 = ((zzpo)object).zza;
            object3.put("app_id", (String)object2);
            object2 = ((zzpo)object).zzb;
            object3.put("origin", (String)object2);
            object2 = ((zzpo)object).zzc;
            object3.put("name", (String)object2);
            long l12 = ((zzpo)object).zzd;
            object4 = l12;
            object3.put("set_timestamp", (Long)object4);
            object4 = "value";
            object2 = ((zzpo)object).zze;
            zzar.zza((ContentValues)object3, (String)object4, object2);
            object4 = this.f_();
            object2 = "user_attributes";
            int n7 = 5;
            long l14 = object4.insertWithOnConflict((String)object2, null, (ContentValues)object3, n7);
            l2 = -1;
            n7 = (int)(l14 == l2 ? 0 : (l14 < l2 ? -1 : 1));
            if (n7 != 0) break block14;
            object3 = this.zzj();
            object3 = ((zzgo)object3).zzg();
            object4 = "Failed to insert/update user property (got -1). appId";
            object2 = ((zzpo)object).zza;
            object2 = zzgo.zza((String)object2);
            try {
                ((zzgq)object3).zza((String)object4, object2);
            }
            catch (SQLiteException sQLiteException) {
                object4 = this.zzj().zzg();
                object = zzgo.zza(((zzpo)object).zza);
                object2 = "Error storing user property. appId";
                ((zzgq)object4).zza((String)object2, object, (Object)sQLiteException);
            }
        }
        return true;
    }

    public final boolean zza(String stringArray, long l2) {
        String[] stringArray2;
        long l3;
        long l4;
        long l7;
        long l8;
        Object object = this.zze();
        zzfx zzfx2 = zzbn.zzcz;
        boolean n3 = ((zzai)object).zza(zzfx2);
        zzfx2 = null;
        if (!n3 && (l8 = (l7 = (l4 = (object = this.zzb()).currentTimeMillis()) - (l3 = 15000L + l2)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) > 0) {
            return false;
        }
        object = "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;";
        try {
            stringArray2 = String.valueOf(l2);
        }
        catch (SQLiteException sQLiteException) {
            this.zzj().zzg().zza("Error checking backfill conditions", (Object)sQLiteException);
            return false;
        }
        stringArray2 = new String[]{stringArray, stringArray2};
        long l12 = 0L;
        long l14 = this.zza((String)object, stringArray2, l12);
        long l15 = l14 == l12 ? 0 : (l14 < l12 ? -1 : 1);
        if (l15 > 0) {
            return false;
        }
        object = "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;";
        String string2 = String.valueOf(l2);
        stringArray = new String[]{stringArray, string2};
        long l16 = this.zza((String)object, stringArray, l12);
        long l17 = l16 == l12 ? 0 : (l16 < l12 ? -1 : 1);
        return l17 > 0;
    }

    public final boolean zza(String object, Bundle object2) {
        SQLiteException sQLiteException2;
        Object object3;
        block8: {
            block7: {
                int n3;
                zzbe zzbe2;
                this.zzv();
                this.zzam();
                object3 = this.zzu;
                long l2 = 0L;
                long l3 = 0L;
                String string2 = "dep";
                Object object4 = zzbe2;
                String string3 = object;
                zzbe2 = new zzbe((zzic)object3, "", (String)object, string2, l2, l3, (Bundle)object2);
                object2 = this.h_().zza(zzbe2).zzce();
                object4 = this.zzj().zzq();
                object3 = this.zzi().zza((String)object);
                int n4 = ((Bundle)object2).length;
                Object object5 = n4;
                string3 = "Saving default event parameters, appId, data size";
                ((zzgq)object4).zza(string3, object3, object5);
                object4 = new ContentValues();
                object4.put("app_id", (String)object);
                object3 = "parameters";
                object4.put((String)object3, (byte[])object2);
                object2 = null;
                try {
                    object3 = this.f_();
                    object5 = "default_event_params";
                    string3 = null;
                    n3 = 5;
                }
                catch (SQLiteException sQLiteException2) {}
                long l4 = object3.insertWithOnConflict((String)object5, null, (ContentValues)object4, n3);
                long l7 = -1;
                n3 = (int)(l4 == l7 ? 0 : (l4 < l7 ? -1 : 1));
                if (n3 != 0) break block7;
                object4 = this.zzj();
                object4 = ((zzgo)object4).zzg();
                object3 = "Failed to insert default event parameters (got -1). appId";
                object5 = zzgo.zza((String)object);
                ((zzgq)object4).zza((String)object3, object5);
                return false;
                break block8;
            }
            return true;
        }
        object3 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object3).zza("Error storing default event parameters. appId", object, (Object)sQLiteException2);
        return false;
    }

    public final boolean zza(String object, zzog object2) {
        SQLiteException sQLiteException2;
        Object object3;
        block9: {
            block8: {
                Object object4;
                long l2;
                long l3;
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(object2);
                Preconditions.checkNotEmpty((String)object);
                Object object5 = this.zzb();
                long l4 = object5.currentTimeMillis();
                long l7 = ((zzog)object2).zzb;
                Object object6 = zzbn.zzbp;
                Long l8 = (Long)((zzfx)object6).zza(null);
                long l12 = l8;
                l12 = l4 - l12;
                long l14 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
                if (l14 < 0 || (l3 = (l2 = (l7 = ((zzog)object2).zzb) - (l12 = (Long)(object6 = (Long)((zzfx)object6).zza(null)) + l4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                    object4 = this.zzj().zzr();
                    Object object7 = zzgo.zza((String)object);
                    object5 = l4;
                    l12 = ((zzog)object2).zzb;
                    object3 = l12;
                    object6 = "Storing trigger URI outside of the max retention time span. appId, now, timestamp";
                    ((zzgq)object4).zza((String)object6, object7, object5, object3);
                }
                this.zzj().zzq().zza("Saving trigger URI");
                object5 = new ContentValues();
                object5.put("app_id", (String)object);
                object4 = ((zzog)object2).zza;
                object5.put("trigger_uri", (String)object4);
                int n3 = ((zzog)object2).zzc;
                object3 = n3;
                object4 = "source";
                object5.put((String)object4, (Integer)object3);
                long l15 = ((zzog)object2).zzb;
                object2 = l15;
                object3 = "timestamp_millis";
                object5.put((String)object3, (Long)object2);
                object2 = null;
                try {
                    object3 = this.f_();
                    object4 = "trigger_uris";
                }
                catch (SQLiteException sQLiteException2) {}
                l4 = object3.insert((String)object4, null, (ContentValues)object5);
                l7 = -1;
                l3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                if (l3 != false) break block8;
                object5 = this.zzj();
                object5 = ((zzgo)object5).zzg();
                object3 = "Failed to insert trigger URI (got -1). appId";
                object4 = zzgo.zza((String)object);
                ((zzgq)object5).zza((String)object3, object4);
                return false;
                break block9;
            }
            return true;
        }
        object3 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object3).zza("Error storing trigger URI. appId", object, (Object)sQLiteException2);
        return false;
    }

    public final boolean zza(String object, Long l2, long l3, zzgf$zzf object2) {
        SQLiteException sQLiteException2;
        Object object3;
        block8: {
            block7: {
                int n3;
                boolean bl2;
                this.zzv();
                this.zzam();
                Preconditions.checkNotNull(object2);
                Preconditions.checkNotEmpty((String)object);
                Preconditions.checkNotNull(l2);
                object2 = ((zzio)object2).zzce();
                zzgq zzgq2 = this.zzj().zzq();
                String string2 = this.zzi().zza((String)object);
                int n4 = ((Object)object2).length;
                Integer n7 = n4;
                String string3 = "Saving complex main event, appId, data size";
                zzgq2.zza(string3, string2, n7);
                zzgq2 = new ContentValues();
                zzgq2.put("app_id", (String)object);
                string2 = "event_id";
                zzgq2.put(string2, l2);
                l2 = l3;
                Object object4 = "children_to_process";
                zzgq2.put((String)object4, l2);
                zzgq2.put("main_event", (byte[])object2);
                l2 = null;
                try {
                    object4 = this.f_();
                    object3 = "main_event_params";
                    bl2 = false;
                    object2 = null;
                    n3 = 5;
                }
                catch (SQLiteException sQLiteException2) {}
                l3 = object4.insertWithOnConflict((String)object3, null, (ContentValues)zzgq2, n3);
                long l4 = -1;
                bl2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (bl2) break block7;
                object4 = this.zzj();
                object4 = ((zzgo)object4).zzg();
                object3 = "Failed to insert complex main event (got -1). appId";
                object2 = zzgo.zza((String)object);
                ((zzgq)object4).zza((String)object3, object2);
                return false;
                break block8;
            }
            return true;
        }
        object3 = this.zzj().zzg();
        object = zzgo.zza((String)object);
        ((zzgq)object3).zza("Error storing complex main event. appId", object, (Object)sQLiteException2);
        return false;
    }

    public final boolean zzaa() {
        long l2;
        String string2 = "select count(1) > 0 from raw_events where realtime = 1";
        long l3 = this.zzb(string2, (String[])null);
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    public final boolean zzab() {
        return this.zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long zzb(String stringArray) {
        Preconditions.checkNotEmpty((String)stringArray);
        stringArray = new String[]{stringArray};
        return this.zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", stringArray, 0L);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long zzb(String var1_1, String var2_2) {
        block13: {
            block12: {
                var3_3 = var1_1;
                var4_4 = var2_2;
                Preconditions.checkNotEmpty(var1_1);
                Preconditions.checkNotEmpty(var2_2);
                this.zzv();
                this.zzam();
                var5_5 = this.f_();
                var5_5.beginTransaction();
                var6_6 = 0L;
                var9_14 /* !! */  = "select ";
                var8_7 = new StringBuilder((String)var9_14 /* !! */ );
                var8_7.append(var2_2);
                var9_14 /* !! */  = " from app2 where app_id=?";
                var8_7.append((String)var9_14 /* !! */ );
                var8_7 = var8_7.toString();
                var9_14 /* !! */  = new String[]{var1_1};
                var10_15 = -1;
                try {}
                catch (SQLiteException var8_9) {}
                finally {
                    break block12;
                }
                catch (Throwable var8_11) {
                    break block13;
                }
                catch (SQLiteException var8_12) {
                    // empty catch block
                    ** GOTO lbl-1000
                }
            }
            var12_16 = this.zza((String)var8_7, var9_14 /* !! */ , var10_15);
            var8_7 = "app2";
            var9_14 /* !! */  = "app_id";
            var14_17 = var12_16 == var10_15 ? 0 : (var12_16 < var10_15 ? -1 : 1);
            if (var14_17 != false) ** GOTO lbl-1000
            var15_18 /* !! */  = new ContentValues();
            var15_18 /* !! */ .put((String)var9_14 /* !! */ , var1_1);
            var16_19 = "first_open_count";
            var14_17 = 0;
            var17_20 /* !! */  = null;
            var18_21 = Integer.valueOf(0);
            var15_18 /* !! */ .put(var16_19, (Integer)var18_21);
            var16_19 = "previous_install_count";
            var17_20 /* !! */  = Integer.valueOf(0);
            var15_18 /* !! */ .put(var16_19, (Integer)var17_20 /* !! */ );
            var16_19 = null;
            var14_17 = 5;
            var12_16 = var5_5.insertWithOnConflict((String)var8_7, null, var15_18 /* !! */ , (int)var14_17);
            var14_17 = var12_16 == var10_15 ? 0 : (var12_16 < var10_15 ? -1 : 1);
            if (var14_17 == false) {
                var8_7 = this.zzj();
                var8_7 = var8_7.zzg();
                var9_14 /* !! */  = "Failed to insert column (got -1). appId";
                var15_18 /* !! */  = zzgo.zza(var1_1);
                var8_7.zza((String)var9_14 /* !! */ , var15_18 /* !! */ , var2_2);
                var5_5.endTransaction();
                return var10_15;
            }
            var12_16 = var6_6;
lbl-1000:
            // 2 sources

            {
                var17_20 /* !! */  = new ContentValues();
                var17_20 /* !! */ .put((String)var9_14 /* !! */ , (String)var3_3);
                var19_22 = 1L + var12_16;
                var9_14 /* !! */  = var19_22;
                var17_20 /* !! */ .put(var4_4, (Long)var9_14 /* !! */ );
                var9_14 /* !! */  = "app_id = ?";
                var18_21 = new String[]{var1_1};
                var21_23 = var5_5.update((String)var8_7, var17_20 /* !! */ , (String)var9_14 /* !! */ , var18_21);
                var23_24 = var21_23 == var6_6 ? 0 : (var21_23 < var6_6 ? -1 : 1);
                if (var23_24 != false) ** GOTO lbl-1000
                var8_7 = this.zzj();
                var8_7 = var8_7.zzg();
                var24_25 = "Failed to update column (got 0). appId";
                var25_26 = zzgo.zza(var1_1);
                var8_7.zza(var24_25, var25_26, var4_4);
            }
            var5_5.endTransaction();
            return var10_15;
lbl-1000:
            // 1 sources

            {
                var5_5.setTransactionSuccessful();
            }
            var5_5.endTransaction();
            return var12_16;
lbl-1000:
            // 1 sources

            {
                var9_14 /* !! */  = this.zzj();
                var9_14 /* !! */  = var9_14 /* !! */ .zzg();
                var26_27 = "Error inserting column. appId";
                var3_3 = zzgo.zza(var1_1);
                var9_14 /* !! */ .zza(var26_27, var3_3, var4_4, var8_7);
            }
            var5_5.endTransaction();
            return var6_6;
        }
        var5_5.endTransaction();
        throw var8_13;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzb(long l2) {
        void var8_13;
        String[] stringArray;
        block10: {
            block11: {
                boolean bl2;
                String[] stringArray2;
                String string2;
                Object object;
                block9: {
                    this.zzv();
                    this.zzam();
                    stringArray = null;
                    object = this.f_();
                    string2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;";
                    stringArray2 = String.valueOf(l2);
                    stringArray2 = new String[]{stringArray2};
                    stringArray2 = object.rawQuery(string2, stringArray2);
                    bl2 = stringArray2.moveToFirst();
                    if (bl2) break block9;
                    Object object2 = this.zzj();
                    object2 = ((zzgo)object2).zzq();
                    object = "No expired configs for apps with pending events";
                    ((zzgq)object2).zza((String)object);
                    stringArray2.close();
                    return null;
                }
                bl2 = false;
                String string3 = null;
                try {
                    string3 = stringArray2.getString(0);
                }
                catch (Throwable throwable) {
                    stringArray = stringArray2;
                    break block10;
                }
                catch (SQLiteException sQLiteException) {}
                stringArray2.close();
                return string3;
                catch (Throwable throwable) {
                    break block10;
                }
                catch (SQLiteException sQLiteException) {
                    stringArray2 = null;
                }
                {
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    string2 = "Error selecting expired configs";
                    ((zzgq)object).zza(string2, string3);
                    if (stringArray2 == null) break block11;
                }
                stringArray2.close();
            }
            return null;
        }
        if (stringArray != null) {
            stringArray.close();
        }
        throw var8_13;
    }

    /*
     * Exception decompiling
     */
    public final List zzb(String var1_1, String var2_2, String var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [17, 16 : 124->128)] java.lang.Throwable
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

    public final void zzb(Long object) {
        String string2;
        this.zzv();
        this.zzam();
        Preconditions.checkNotNull(object);
        Object object2 = this.zze();
        Object object3 = zzbn.zzch;
        boolean bl2 = ((zzai)object2).zza((zzfx)object3);
        if (!bl2) {
            return;
        }
        bl2 = this.zzab();
        if (!bl2) {
            return;
        }
        object2 = new StringBuilder("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(" AND retry_count =  2147483647 LIMIT 1");
        object2 = ((StringBuilder)object2).toString();
        object3 = null;
        long l2 = this.zzb((String)object2, (String[])null);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            object2 = this.zzj().zzr();
            object3 = "The number of upload retries exceeds the limit. Will remain unchanged.";
            ((zzgq)object2).zza((String)object3);
        }
        try {
            object2 = this.f_();
            string2 = "UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = ";
        }
        catch (SQLiteException sQLiteException) {
            this.zzj().zzg().zza("Error incrementing retry count. error", (Object)sQLiteException);
            return;
        }
        object3 = new StringBuilder(string2);
        ((StringBuilder)object3).append(object);
        object = " AND retry_count < 2147483647";
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        object2.execSQL((String)object);
    }

    public final void zzb(String object, zzjj zzjj2) {
        Preconditions.checkNotNull(object);
        Preconditions.checkNotNull(zzjj2);
        this.zzv();
        this.zzam();
        ContentValues contentValues = new ContentValues();
        String string2 = "app_id";
        contentValues.put(string2, (String)object);
        object = zzjj2.zzf();
        contentValues.put("consent_state", (String)object);
        object = zzjj2.zza();
        contentValues.put("consent_source", (Integer)object);
        this.zza("consent_settings", string2, contentValues);
    }

    /*
     * Exception decompiling
     */
    public final Bundle zzc(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [15, 14 : 98->104)] java.lang.Throwable
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
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzag zzc(String string2, String string3) {
        void var20_25;
        SQLiteDatabase sQLiteDatabase;
        block14: {
            block15: {
                Object object;
                Object object2;
                SQLiteDatabase sQLiteDatabase2;
                String string4;
                block13: {
                    int n3;
                    boolean bl2;
                    Object object3;
                    Object object4;
                    String string5;
                    String string6;
                    Object object5;
                    Object object6;
                    String string7;
                    Object object7;
                    Object object8;
                    block12: {
                        string4 = string3;
                        Preconditions.checkNotEmpty(string2);
                        Preconditions.checkNotEmpty(string3);
                        this.zzv();
                        this.zzam();
                        sQLiteDatabase = null;
                        sQLiteDatabase2 = this.f_();
                        object8 = "conditional_properties";
                        object7 = "origin";
                        string7 = "value";
                        object6 = "active";
                        object5 = "trigger_event_name";
                        String string8 = "trigger_timeout";
                        string6 = "timed_out_event";
                        string5 = "creation_timestamp";
                        object4 = "triggered_event";
                        String string9 = "triggered_timestamp";
                        String string10 = "time_to_live";
                        object3 = "expired_event";
                        object7 = new String[]{object7, string7, object6, object5, string8, string6, string5, object4, string9, string10, object3};
                        string7 = "app_id=? and name=?";
                        object6 = new String[]{string2, string3};
                        string8 = null;
                        bl2 = false;
                        string6 = null;
                        object5 = null;
                        sQLiteDatabase2 = sQLiteDatabase2.query((String)object8, object7, string7, object6, null, null, null);
                        n3 = sQLiteDatabase2.moveToFirst();
                        if (n3 != 0) break block12;
                        sQLiteDatabase2.close();
                        return null;
                    }
                    n3 = 0;
                    object2 = null;
                    try {
                        object = sQLiteDatabase2.getString(0);
                        if (object == null) {
                            object = "";
                        }
                        string7 = object;
                        int n4 = 1;
                        object5 = this;
                        Object object9 = this.zza((Cursor)sQLiteDatabase2, n4);
                        int n7 = 2;
                        if ((n7 = sQLiteDatabase2.getInt(n7)) != 0) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            string6 = null;
                        }
                        n3 = 3;
                        string5 = sQLiteDatabase2.getString(n3);
                        n3 = 4;
                        long l2 = sQLiteDatabase2.getLong(n3);
                        object2 = this.h_();
                        n4 = 5;
                        object = sQLiteDatabase2.getBlob(n4);
                        Object object10 = zzbl.CREATOR;
                        object4 = object2 = ((zzpj)object2).zza((byte[])object, (Parcelable.Creator)object10);
                        object4 = (zzbl)object2;
                        n3 = 6;
                        long l3 = sQLiteDatabase2.getLong(n3);
                        object2 = this.h_();
                        n4 = 7;
                        object = sQLiteDatabase2.getBlob(n4);
                        object2 = ((zzpj)object2).zza((byte[])object, (Parcelable.Creator)object10);
                        object2 = (zzbl)object2;
                        n4 = 8;
                        long l4 = sQLiteDatabase2.getLong(n4);
                        n4 = 9;
                        long l7 = sQLiteDatabase2.getLong(n4);
                        object = this.h_();
                        int n8 = 10;
                        Object object11 = sQLiteDatabase2.getBlob(n8);
                        Object object12 = object = object.zza((byte[])object11, (Parcelable.Creator)object10);
                        object12 = (zzbl)object;
                        object = object6;
                        object10 = string3;
                        object11 = string7;
                        object6 = new zzpm(string3, l4, object9, string7);
                        object8 = object;
                        object7 = string2;
                        object3 = object2;
                        object = new zzag(string2, string7, (zzpm)object6, l3, bl2, string5, (zzbl)object4, l2, (zzbl)object2, l7, (zzbl)object12);
                        n3 = (int)(sQLiteDatabase2.moveToNext() ? 1 : 0);
                        if (n3 == 0) break block13;
                        object2 = this.zzj();
                        object2 = ((zzgo)object2).zzg();
                        object10 = "Got multiple records for conditional property, expected one";
                        Object object13 = zzgo.zza(string2);
                        Object object14 = this.zzi();
                        object14 = ((zzgl)object14).zzc(string4);
                        ((zzgq)object2).zza((String)object10, object13, object14);
                    }
                    catch (Throwable throwable) {
                        sQLiteDatabase = sQLiteDatabase2;
                        break block14;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                sQLiteDatabase2.close();
                return object;
                catch (Throwable throwable) {
                    break block14;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase2 = null;
                }
                {
                    Object object15 = this.zzj();
                    object15 = ((zzgo)object15).zzg();
                    String string11 = "Error querying conditional property";
                    Object object16 = zzgo.zza(string2);
                    Object object17 = this.zzi();
                    object17 = ((zzgl)object17).zzc(string4);
                    ((zzgq)object15).zza(string11, object16, object17, object2);
                    if (sQLiteDatabase2 == null) break block15;
                }
                sQLiteDatabase2.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var20_25;
    }

    public final boolean zzc() {
        return false;
    }

    public final zzbh zzd(String string2, String string3) {
        return this.zzc("events", string2, string3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzh zzd(String string2) {
        void var55_61;
        SQLiteDatabase sQLiteDatabase;
        block34: {
            block35: {
                zzh zzh2;
                Object object;
                Object object2;
                SQLiteDatabase sQLiteDatabase2;
                Object object3;
                block33: {
                    boolean bl2;
                    int n3;
                    Object object4;
                    Object object5;
                    Object object6;
                    zzar zzar2;
                    block32: {
                        zzar2 = this;
                        object3 = string2;
                        Preconditions.checkNotEmpty(string2);
                        this.zzv();
                        this.zzam();
                        sQLiteDatabase = null;
                        sQLiteDatabase2 = this.f_();
                        object2 = "apps";
                        object = "app_instance_id";
                        object6 = "gmp_app_id";
                        object5 = "resettable_device_id_hash";
                        object4 = "last_bundle_index";
                        String string3 = "last_bundle_start_timestamp";
                        String string4 = "last_bundle_end_timestamp";
                        String string5 = "app_version";
                        String string6 = "app_store";
                        String string7 = "gmp_version";
                        String string8 = "dev_cert_hash";
                        String string9 = "measurement_enabled";
                        String string10 = "day";
                        String string11 = "daily_public_events_count";
                        String string12 = "daily_events_count";
                        String string13 = "daily_conversions_count";
                        String string14 = "config_fetched_time";
                        String string15 = "failed_config_fetch_time";
                        String string16 = "app_version_int";
                        String string17 = "firebase_instance_id";
                        String string18 = "daily_error_events_count";
                        String string19 = "daily_realtime_events_count";
                        String string20 = "health_monitor_sample";
                        String string21 = "android_id";
                        String string22 = "adid_reporting_enabled";
                        String string23 = "admob_app_id";
                        String string24 = "dynamite_version";
                        String string25 = "safelisted_events";
                        String string26 = "ga_app_id";
                        String string27 = "session_stitching_token";
                        String string28 = "sgtm_upload_enabled";
                        String string29 = "target_os_version";
                        String string30 = "session_stitching_token_hash";
                        String string31 = "ad_services_version";
                        String string32 = "unmatched_first_open_without_ad_id";
                        String string33 = "npa_metadata_value";
                        String string34 = "attribution_eligibility_status";
                        String string35 = "sgtm_preview_key";
                        String string36 = "dma_consent_state";
                        String string37 = "daily_realtime_dcu_count";
                        String string38 = "bundle_delivery_index";
                        String string39 = "serialized_npa_metadata";
                        String string40 = "unmatched_pfo";
                        String string41 = "unmatched_uwa";
                        String string42 = "ad_campaign_info";
                        String string43 = "client_upload_eligibility";
                        object = new String[]{object, object6, object5, object4, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43};
                        object6 = "app_id=?";
                        object5 = new String[]{string2};
                        n3 = 0;
                        string3 = null;
                        string4 = null;
                        bl2 = false;
                        object4 = null;
                        sQLiteDatabase2 = sQLiteDatabase2.query((String)object2, (String[])object, (String)object6, (String[])object5, null, null, null);
                        boolean bl3 = sQLiteDatabase2.moveToFirst();
                        if (bl3) break block32;
                        sQLiteDatabase2.close();
                        return null;
                    }
                    try {
                        long l2;
                        object2 = this.zzg;
                        object2 = ((zzou)object2).zzk();
                        zzh2 = new zzh((zzic)object2, string2);
                        object2 = this.zzg;
                        object2 = ((zzou)object2).zzb(string2);
                        object = zzjj$zza.zzb;
                        int n4 = ((zzjj)object2).zza((zzjj$zza)((Object)object));
                        boolean bl4 = false;
                        object6 = null;
                        if (n4 != 0) {
                            object2 = sQLiteDatabase2.getString(0);
                            zzh2.zzb((String)object2);
                        }
                        n4 = 1;
                        object5 = sQLiteDatabase2.getString(n4);
                        zzh2.zzf((String)object5);
                        object5 = zzar2.zzg;
                        object5 = ((zzou)object5).zzb((String)object3);
                        object4 = zzjj$zza.zza;
                        int n7 = ((zzjj)object5).zza((zzjj$zza)((Object)object4));
                        if (n7 != 0) {
                            n7 = 2;
                            object5 = sQLiteDatabase2.getString(n7);
                            zzh2.zzh((String)object5);
                        }
                        n7 = 3;
                        long l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzq(l3);
                        n7 = 4;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzr(l3);
                        n7 = 5;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzp(l3);
                        n7 = 6;
                        object5 = sQLiteDatabase2.getString(n7);
                        zzh2.zzd((String)object5);
                        n7 = 7;
                        object5 = sQLiteDatabase2.getString(n7);
                        zzh2.zzc((String)object5);
                        n7 = 8;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzn(l3);
                        n7 = 9;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzk(l3);
                        n7 = 10;
                        bl2 = sQLiteDatabase2.isNull(n7);
                        if (!bl2 && (n7 = sQLiteDatabase2.getInt(n7)) == 0) {
                            n7 = 0;
                            object5 = null;
                        } else {
                            n7 = 1;
                        }
                        zzh2.zzb(n7 != 0);
                        n7 = 11;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzj(l3);
                        n7 = 12;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzh(l3);
                        n7 = 13;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzg(l3);
                        n7 = 14;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zze(l3);
                        n7 = 15;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzd(l3);
                        n7 = 16;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzm(l3);
                        n7 = 17;
                        bl2 = sQLiteDatabase2.isNull(n7);
                        if (bl2) {
                            l3 = 0x80000000L;
                        } else {
                            n7 = sQLiteDatabase2.getInt(n7);
                            l3 = n7;
                        }
                        zzh2.zzb(l3);
                        n7 = 18;
                        object5 = sQLiteDatabase2.getString(n7);
                        zzh2.zze((String)object5);
                        n7 = 19;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzf(l3);
                        n7 = 20;
                        l3 = sQLiteDatabase2.getLong(n7);
                        zzh2.zzi(l3);
                        n7 = 21;
                        object5 = sQLiteDatabase2.getString(n7);
                        zzh2.zzg((String)object5);
                        n7 = 23;
                        bl2 = sQLiteDatabase2.isNull(n7);
                        if (!bl2 && (n7 = sQLiteDatabase2.getInt(n7)) == 0) {
                            n7 = 0;
                            object5 = null;
                        } else {
                            n7 = 1;
                        }
                        zzh2.zza(n7 != 0);
                        n7 = 24;
                        object5 = sQLiteDatabase2.getString(n7);
                        zzh2.zza((String)object5);
                        n7 = 25;
                        bl2 = sQLiteDatabase2.isNull(n7);
                        l3 = bl2 ? 0L : sQLiteDatabase2.getLong(n7);
                        zzh2.zzl(l3);
                        n7 = 26;
                        bl2 = sQLiteDatabase2.isNull(n7);
                        if (!bl2) {
                            object5 = sQLiteDatabase2.getString(n7);
                            object4 = ",";
                            n3 = -1;
                            object5 = ((String)object5).split((String)object4, n3);
                            object5 = Arrays.asList(object5);
                            zzh2.zza((List)object5);
                        }
                        object5 = zzar2.zzg;
                        int n8 = ((zzjj)(object5 = ((zzou)object5).zzb((String)object3))).zza((zzjj$zza)((Object)object));
                        if (n8 != 0) {
                            n8 = 28;
                            object = sQLiteDatabase2.getString(n8);
                            zzh2.zzj((String)object);
                        }
                        if ((n7 = (int)(sQLiteDatabase2.isNull(n8 = 29) ? 1 : 0)) == 0 && (n8 = sQLiteDatabase2.getInt(n8)) != 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        zzh2.zzc(n8 != 0);
                        n8 = 39;
                        l3 = sQLiteDatabase2.getLong(n8);
                        zzh2.zzo(l3);
                        n8 = 36;
                        object = sQLiteDatabase2.getString(n8);
                        zzh2.zzk((String)object);
                        n8 = 30;
                        l3 = sQLiteDatabase2.getLong(n8);
                        zzh2.zzt(l3);
                        n8 = 31;
                        l3 = sQLiteDatabase2.getLong(n8);
                        zzh2.zzs(l3);
                        n8 = (int)(zzoy.zza() ? 1 : 0);
                        if (n8 != 0 && (n8 = (int)(((zzai)(object = this.zze())).zze((String)object3, (zzfx)(object5 = zzbn.zzcp)) ? 1 : 0)) != 0) {
                            n8 = 32;
                            n8 = sQLiteDatabase2.getInt(n8);
                            zzh2.zza(n8);
                            n8 = 35;
                            l3 = sQLiteDatabase2.getLong(n8);
                            zzh2.zzc(l3);
                        }
                        if ((n7 = (int)(sQLiteDatabase2.isNull(n8 = 33) ? 1 : 0)) == 0 && (n8 = sQLiteDatabase2.getInt(n8)) != 0) {
                            n8 = 1;
                        } else {
                            n8 = 0;
                            object = null;
                        }
                        zzh2.zzd(n8 != 0);
                        n8 = 34;
                        n7 = (int)(sQLiteDatabase2.isNull(n8) ? 1 : 0);
                        if (n7 != 0) {
                            n4 = 0;
                            object2 = null;
                        } else {
                            if ((n8 = sQLiteDatabase2.getInt(n8)) != 0) {
                                bl4 = true;
                            }
                            object2 = bl4;
                        }
                        zzh2.zza((Boolean)object2);
                        n4 = 37;
                        n4 = sQLiteDatabase2.getInt(n4);
                        zzh2.zzd(n4);
                        n4 = 38;
                        n4 = sQLiteDatabase2.getInt(n4);
                        zzh2.zzc(n4);
                        n4 = 40;
                        n8 = (int)(sQLiteDatabase2.isNull(n4) ? 1 : 0);
                        if (n8 != 0) {
                            object2 = "";
                        } else {
                            object2 = sQLiteDatabase2.getString(n4);
                            object2 = Preconditions.checkNotNull(object2);
                            object2 = (String)object2;
                        }
                        zzh2.zzi((String)object2);
                        n4 = 41;
                        n8 = (int)(sQLiteDatabase2.isNull(n4) ? 1 : 0);
                        if (n8 == 0) {
                            l2 = sQLiteDatabase2.getLong(n4);
                            object2 = l2;
                            zzh2.zza((Long)object2);
                        }
                        if ((n8 = (int)(sQLiteDatabase2.isNull(n4 = 42) ? 1 : 0)) == 0) {
                            l2 = sQLiteDatabase2.getLong(n4);
                            object2 = l2;
                            zzh2.zzb((Long)object2);
                        }
                        n4 = 43;
                        object2 = sQLiteDatabase2.getBlob(n4);
                        zzh2.zza((byte[])object2);
                        object2 = this.zze();
                        object = zzbn.zzcj;
                        n4 = (int)(((zzai)object2).zze((String)object3, (zzfx)object) ? 1 : 0);
                        if (n4 != 0 && (n8 = (int)(sQLiteDatabase2.isNull(n4 = 44) ? 1 : 0)) == 0) {
                            n4 = sQLiteDatabase2.getInt(n4);
                            zzh2.zzb(n4);
                        }
                        zzh2.zzao();
                        n4 = (int)(sQLiteDatabase2.moveToNext() ? 1 : 0);
                        if (n4 == 0) break block33;
                        object2 = this.zzj();
                        object2 = ((zzgo)object2).zzg();
                        object = "Got multiple records for app, expected one. appId";
                        object6 = zzgo.zza(string2);
                        ((zzgq)object2).zza((String)object, object6);
                    }
                    catch (Throwable throwable) {
                        sQLiteDatabase = sQLiteDatabase2;
                        break block34;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                sQLiteDatabase2.close();
                return zzh2;
                catch (Throwable throwable) {
                    break block34;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase2 = null;
                }
                {
                    void var55_60;
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzg();
                    object = "Error querying app. appId";
                    object3 = zzgo.zza(string2);
                    ((zzgq)object2).zza((String)object, object3, var55_60);
                    if (sQLiteDatabase2 == null) break block35;
                }
                sQLiteDatabase2.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var55_61;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzat zze(String object) {
        void var1_4;
        SQLiteDatabase sQLiteDatabase;
        block13: {
            block14: {
                Object object2;
                String string2;
                Object object3;
                Object object4;
                SQLiteDatabase sQLiteDatabase2;
                block12: {
                    boolean bl2;
                    String string3;
                    Object object5;
                    block11: {
                        Preconditions.checkNotEmpty((String)object);
                        this.zzv();
                        this.zzam();
                        sQLiteDatabase = null;
                        sQLiteDatabase2 = this.f_();
                        object4 = "apps";
                        object3 = "remote_config";
                        string2 = "config_last_modified_time";
                        object2 = "e_tag";
                        object3 = new String[]{object3, string2, object2};
                        string2 = "app_id=?";
                        object2 = new String[]{object};
                        object5 = null;
                        string3 = null;
                        sQLiteDatabase2 = sQLiteDatabase2.query((String)object4, object3, string2, (String[])object2, null, null, null);
                        bl2 = sQLiteDatabase2.moveToFirst();
                        if (bl2) break block11;
                        sQLiteDatabase2.close();
                        return null;
                    }
                    bl2 = false;
                    object4 = null;
                    object4 = sQLiteDatabase2.getBlob(0);
                    int n3 = 1;
                    object3 = sQLiteDatabase2.getString(n3);
                    int n4 = 2;
                    string2 = sQLiteDatabase2.getString(n4);
                    boolean bl3 = sQLiteDatabase2.moveToNext();
                    if (bl3) {
                        object2 = this.zzj();
                        object2 = ((zzgo)object2).zzg();
                        string3 = "Got multiple records for app config, expected one. appId";
                        object5 = zzgo.zza((String)object);
                        ((zzgq)object2).zza(string3, object5);
                    }
                    if (object4 != null) break block12;
                    sQLiteDatabase2.close();
                    return null;
                }
                try {
                    object2 = new zzat((byte[])object4, (String)object3, string2);
                }
                catch (Throwable throwable) {
                    sQLiteDatabase = sQLiteDatabase2;
                    break block13;
                }
                catch (SQLiteException sQLiteException) {}
                sQLiteDatabase2.close();
                return object2;
                catch (Throwable throwable) {
                    break block13;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase2 = null;
                }
                {
                    void var4_10;
                    object3 = this.zzj();
                    object3 = object3.zzg();
                    string2 = "Error querying remote config. appId";
                    object = zzgo.zza((String)object);
                    object3.zza(string2, object, var4_10);
                    if (sQLiteDatabase2 == null) break block14;
                }
                sQLiteDatabase2.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var1_4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzpo zze(String object, String string2) {
        void var1_4;
        SQLiteDatabase sQLiteDatabase;
        block13: {
            block14: {
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                SQLiteDatabase sQLiteDatabase2;
                block12: {
                    Object object6;
                    long l2;
                    int n3;
                    block11: {
                        block10: {
                            Preconditions.checkNotEmpty((String)object);
                            Preconditions.checkNotEmpty(string2);
                            this.zzv();
                            this.zzam();
                            sQLiteDatabase = null;
                            sQLiteDatabase2 = this.f_();
                            object5 = "user_attributes";
                            object4 = "set_timestamp";
                            object3 = "value";
                            object2 = "origin";
                            object4 = new String[]{object4, object3, object2};
                            object3 = "app_id=? and name=?";
                            object2 = new String[]{object, string2};
                            sQLiteDatabase2 = sQLiteDatabase2.query((String)object5, (String[])object4, (String)object3, object2, null, null, null);
                            n3 = sQLiteDatabase2.moveToFirst();
                            if (n3 != 0) break block10;
                            sQLiteDatabase2.close();
                            return null;
                        }
                        n3 = 0;
                        object5 = null;
                        l2 = sQLiteDatabase2.getLong(0);
                        n3 = 1;
                        object6 = this.zza((Cursor)sQLiteDatabase2, n3);
                        if (object6 != null) break block11;
                        sQLiteDatabase2.close();
                        return null;
                    }
                    n3 = 2;
                    try {
                        object2 = sQLiteDatabase2.getString(n3);
                        object4 = object5;
                        object3 = object;
                        object5 = new zzpo((String)object, (String)object2, string2, l2, object6);
                        boolean bl2 = sQLiteDatabase2.moveToNext();
                        if (!bl2) break block12;
                        object4 = this.zzj();
                        object4 = ((zzgo)object4).zzg();
                        object3 = "Got multiple records for user property, expected one. appId";
                        object2 = zzgo.zza((String)object);
                        ((zzgq)object4).zza((String)object3, object2);
                    }
                    catch (Throwable throwable) {
                        sQLiteDatabase = sQLiteDatabase2;
                        break block13;
                    }
                    catch (SQLiteException sQLiteException) {}
                }
                sQLiteDatabase2.close();
                return object5;
                catch (Throwable throwable) {
                    break block13;
                }
                catch (SQLiteException sQLiteException) {
                    sQLiteDatabase2 = null;
                }
                {
                    void var5_11;
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzg();
                    object3 = "Error querying user property. appId";
                    object = zzgo.zza((String)object);
                    object2 = this.zzi();
                    string2 = object2.zzc(string2);
                    ((zzgq)object4).zza((String)object3, object, string2, var5_11);
                    if (sQLiteDatabase2 == null) break block14;
                }
                sQLiteDatabase2.close();
            }
            return null;
        }
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        throw var1_4;
    }

    public final zzbd zzf(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        this.zzv();
        this.zzam();
        stringArray = new String[]{stringArray};
        return zzbd.zza(this.zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", stringArray, ""));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzf(String map2, String object) {
        int n3;
        Object object2;
        ArrayList<Object> arrayList;
        Cursor cursor;
        Object object3;
        Object object4;
        block10: {
            block11: {
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty(map2);
                Preconditions.checkNotEmpty((String)object);
                object4 = new Jp();
                object3 = this.f_();
                cursor = null;
                arrayList = "event_filters";
                object2 = "audience_id";
                String string2 = "data";
                try {
                    object2 = new String[]{object2, string2};
                    string2 = "app_id=? AND event_name=?";
                    String[] stringArray = new String[]{map2, object};
                    cursor = object3.query((String)((Object)arrayList), object2, string2, stringArray, null, null, null);
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) break block10;
                    map2 = Collections.emptyMap();
                }
                catch (Throwable throwable) {}
                cursor.close();
                return map2;
                if (cursor != null) {
                    cursor.close();
                }
                throw throwable;
                catch (SQLiteException sQLiteException) {}
                {
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzg();
                    object3 = "Database error querying filters. appId";
                    map2 = zzgo.zza(map2);
                    ((zzgq)object4).zza((String)object3, map2, (Object)sQLiteException);
                    map2 = Collections.emptyMap();
                    if (cursor == null) break block11;
                }
                cursor.close();
            }
            return map2;
        }
        while (true) {
            n3 = 1;
            {
                int n4;
                object = cursor.getBlob(n3);
                try {
                    object3 = zzfw$zzb.zzc();
                    object = zzpj.zza((zzlp)object3, (byte[])object);
                    object = (zzfw$zzb$zza)object;
                    object = ((zzkg$zza)object).zzaj();
                    object = (zzkg)object;
                    object = (zzfw$zzb)object;
                    n4 = 0;
                    object3 = null;
                }
                catch (IOException iOException) {
                    object3 = this.zzj();
                    object3 = ((zzgo)object3).zzg();
                    arrayList = "Failed to merge filter. appId";
                    object2 = zzgo.zza(map2);
                    ((zzgq)object3).zza((String)((Object)arrayList), object2, iOException);
                }
                n4 = cursor.getInt(0);
                arrayList = n4;
                arrayList = ((a53)object4).get(arrayList);
                arrayList = arrayList;
                if (arrayList == null) {
                    arrayList = new ArrayList<Object>();
                    object3 = n4;
                    ((a53)object4).put(object3, arrayList);
                }
                arrayList.add(object);
                continue;
                if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
            }
            break;
        }
        cursor.close();
        return object4;
    }

    public final zzjj zzg(String stringArray) {
        Preconditions.checkNotNull(stringArray);
        this.zzv();
        this.zzam();
        stringArray = new String[]{stringArray};
        return zzjj.zzb(this.zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", stringArray, ""));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzg(String map2, String object) {
        int n3;
        Object object2;
        ArrayList<Object> arrayList;
        Cursor cursor;
        Object object3;
        Object object4;
        block10: {
            block11: {
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty(map2);
                Preconditions.checkNotEmpty((String)object);
                object4 = new Jp();
                object3 = this.f_();
                cursor = null;
                arrayList = "property_filters";
                object2 = "audience_id";
                String string2 = "data";
                try {
                    object2 = new String[]{object2, string2};
                    string2 = "app_id=? AND property_name=?";
                    String[] stringArray = new String[]{map2, object};
                    cursor = object3.query((String)((Object)arrayList), object2, string2, stringArray, null, null, null);
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) break block10;
                    map2 = Collections.emptyMap();
                }
                catch (Throwable throwable) {}
                cursor.close();
                return map2;
                if (cursor != null) {
                    cursor.close();
                }
                throw throwable;
                catch (SQLiteException sQLiteException) {}
                {
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzg();
                    object3 = "Database error querying filters. appId";
                    map2 = zzgo.zza(map2);
                    ((zzgq)object4).zza((String)object3, map2, (Object)sQLiteException);
                    map2 = Collections.emptyMap();
                    if (cursor == null) break block11;
                }
                cursor.close();
            }
            return map2;
        }
        while (true) {
            n3 = 1;
            {
                int n4;
                object = cursor.getBlob(n3);
                try {
                    object3 = zzfw$zze.zzc();
                    object = zzpj.zza((zzlp)object3, (byte[])object);
                    object = (zzfw$zze$zza)object;
                    object = ((zzkg$zza)object).zzaj();
                    object = (zzkg)object;
                    object = (zzfw$zze)object;
                    n4 = 0;
                    object3 = null;
                }
                catch (IOException iOException) {
                    object3 = this.zzj();
                    object3 = ((zzgo)object3).zzg();
                    arrayList = "Failed to merge filter";
                    object2 = zzgo.zza(map2);
                    ((zzgq)object3).zza((String)((Object)arrayList), object2, iOException);
                }
                n4 = cursor.getInt(0);
                arrayList = n4;
                arrayList = ((a53)object4).get(arrayList);
                arrayList = arrayList;
                if (arrayList == null) {
                    arrayList = new ArrayList<Object>();
                    object3 = n4;
                    ((a53)object4).put(object3, arrayList);
                }
                arrayList.add(object);
                continue;
                if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
            }
            break;
        }
        cursor.close();
        return object4;
    }

    public final zzjj zzh(String object) {
        Preconditions.checkNotNull(object);
        this.zzv();
        this.zzam();
        object = new String[]{object};
        zzaq zzaq2 = new zzaq();
        String string2 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;";
        object = (zzjj)this.zza(string2, (String[])object, zzaq2);
        if (object == null) {
            object = zzjj.zza;
        }
        return object;
    }

    public final void zzh(String object, String string2) {
        String string3;
        Object object2;
        SQLiteDatabase sQLiteDatabase;
        Preconditions.checkNotEmpty((String)object);
        Preconditions.checkNotEmpty(string2);
        this.zzv();
        this.zzam();
        try {
            sQLiteDatabase = this.f_();
            object2 = "user_attributes";
            string3 = "app_id=? and name=?";
        }
        catch (SQLiteException sQLiteException) {
            object2 = this.zzj().zzg();
            object = zzgo.zza((String)object);
            string2 = this.zzi().zzc(string2);
            ((zzgq)object2).zza("Error deleting user property. appId", object, string2, (Object)sQLiteException);
            return;
        }
        String[] stringArray = new String[]{object, string2};
        sQLiteDatabase.delete((String)object2, string3, stringArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzpi zzi(String var1_1) {
        block34: {
            block36: {
                block35: {
                    block33: {
                        var2_2 = var1_1;
                        var3_3 = 1;
                        var4_4 = null;
                        Preconditions.checkNotEmpty(var1_1);
                        this.zzv();
                        this.zzam();
                        var5_5 /* !! */  = this.zze();
                        var6_6 /* !! */  = zzbn.zzch;
                        var7_7 = var5_5 /* !! */ .zza(var6_6 /* !! */ );
                        var8_8 /* !! */  = null;
                        if (!var7_7) {
                            return null;
                        }
                        var5_5 /* !! */  = this.zze();
                        var7_7 = var5_5 /* !! */ .zza(var6_6 /* !! */  = zzbn.zzcj);
                        if (var7_7) {
                            var5_5 /* !! */  = new zzlu[var3_3];
                            var6_6 /* !! */  = zzlu.zzb;
                            var5_5 /* !! */ [0] = var6_6 /* !! */ ;
                            var9_9 = this.zza(var1_1, (zzop)(var5_5 /* !! */  = zzop.zza((zzlu[])var5_5 /* !! */ )), var3_3);
                            var7_7 = var9_9.isEmpty();
                            if (var7_7) {
                                return null;
                            }
                            return (zzpi)var9_9.get(0);
                        }
                        var5_5 /* !! */  = this.f_();
                        var6_6 /* !! */  = "upload_queue";
                        var10_20 = "rowId";
                        var11_21 = "app_id";
                        var12_22 = "measurement_batch";
                        var13_23 = "upload_uri";
                        var14_24 = "upload_headers";
                        var15_25 = "upload_type";
                        var16_26 = "retry_count";
                        var17_27 = "creation_timestamp";
                        var18_28 = "associated_row_id";
                        var19_29 = new String[]{var10_20, var11_21, var12_22, var13_23, var14_24, var15_25, var16_26, var17_27, var18_28};
                        var9_10 = this.zzap();
                        var21_31 /* !! */  = "app_id=? AND NOT ";
                        var20_30 = new StringBuilder((String)var21_31 /* !! */ );
                        var20_30.append((String)var9_10);
                        var20_30 = var20_30.toString();
                        var21_31 /* !! */  = new String[]{var1_1};
                        var22_32 = "creation_timestamp ASC";
                        var23_33 = "1";
                        var24_34 = null;
                        var25_35 = 0;
                        var26_36 /* !! */  = var5_5 /* !! */ .query((String)var6_6 /* !! */ , var19_29, (String)var20_30, var21_31 /* !! */ , null, null, var22_32, var23_33);
                        var3_3 = (int)var26_36 /* !! */ .moveToFirst();
                        if (var3_3 != 0) break block33;
                        var26_36 /* !! */ .close();
                        return null;
                    }
                    var27_37 = var26_36 /* !! */ .getLong(0);
                    var3_3 = 2;
                    var20_30 = var26_36 /* !! */ .getBlob(var3_3);
                    var3_3 = 3;
                    var21_31 /* !! */  = var26_36 /* !! */ .getString(var3_3);
                    var3_3 = 4;
                    var24_34 = var26_36 /* !! */ .getString(var3_3);
                    var3_3 = 5;
                    var25_35 = var26_36 /* !! */ .getInt(var3_3);
                    var3_3 = 6;
                    var29_38 = var26_36 /* !! */ .getInt(var3_3);
                    var3_3 = 7;
                    var30_39 = var26_36 /* !! */ .getLong(var3_3);
                    var3_3 = 8;
                    var32_40 = var26_36 /* !! */ .getLong(var3_3);
                    var4_4 = this;
                    var5_5 /* !! */  = var1_1;
                    var12_22 = var26_36 /* !! */ ;
                    try {
                        var9_10 = this.zza(var1_1, var27_37, (byte[])var20_30, (String)var21_31 /* !! */ , var24_34, var25_35, var29_38, var30_39, var32_40);
                    }
                    catch (Throwable var9_11) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var8_8 /* !! */  = var12_22;
                            break block34;
                            break;
                        }
                    }
                    catch (SQLiteException var9_13) {
                        var26_36 /* !! */  = var12_22;
                        break block35;
                    }
                    var26_36 /* !! */ .close();
                    return var9_10;
                    catch (Throwable var9_14) {
                        var12_22 = var26_36 /* !! */ ;
                        ** continue;
                    }
                    catch (SQLiteException var9_15) {
                        var12_22 = var26_36 /* !! */ ;
                    }
                    break block35;
                    catch (Throwable var9_16) {
                        break block34;
                    }
                    catch (SQLiteException var9_17) {
                        var26_36 /* !! */  = null;
                    }
                }
                var4_4 = this.zzj();
                var4_4 = var4_4.zzg();
                var5_5 /* !! */  = "Error to querying MeasurementBatch from upload_queue. appId";
                try {
                    var4_4.zza((String)var5_5 /* !! */ , var2_2, var9_18);
                    if (var26_36 /* !! */  == null) break block36;
                }
                catch (Throwable var9_19) {
                    var8_8 /* !! */  = var26_36 /* !! */ ;
                }
                var26_36 /* !! */ .close();
            }
            return null;
        }
        if (var8_8 /* !! */  != null) {
            var8_8 /* !! */ .close();
        }
        throw var9_12;
    }

    public final boolean zzi(String stringArray, String string2) {
        long l2;
        String string3 = "select count(1) from raw_events where app_id = ? and name = ?";
        long l3 = this.zzb(string3, stringArray = new String[]{stringArray, string2});
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object > 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzj(String list) {
        Throwable throwable2;
        Cursor cursor;
        block9: {
            block10: {
                SQLiteException sQLiteException2;
                boolean bl2;
                Object object;
                String string2;
                Object object2;
                ArrayList<String[]> arrayList;
                block8: {
                    Preconditions.checkNotEmpty(list);
                    this.zzv();
                    this.zzam();
                    arrayList = new ArrayList<String[]>();
                    cursor = null;
                    try {
                        object2 = this.f_();
                        string2 = "trigger_uris";
                        String[] stringArray = "trigger_uri";
                        String string3 = "timestamp_millis";
                        object = "source";
                        stringArray = new String[]{stringArray, string3, object};
                        string3 = "app_id=?";
                        object = new String[]{list};
                        String string4 = "rowid";
                        cursor = object2.query(string2, stringArray, string3, object, null, null, string4, null);
                        bl2 = cursor.moveToFirst();
                        if (bl2) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    catch (SQLiteException sQLiteException2) {}
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    bl2 = false;
                    object2 = null;
                    object2 = cursor.getString(0);
                    if (object2 == null) {
                        object2 = "";
                    }
                    int n3 = 1;
                    long l2 = cursor.getLong(n3);
                    int n4 = 2;
                    n4 = cursor.getInt(n4);
                    object = new zzog((String)object2, l2, n4);
                    arrayList.add((String[])object);
                    if (bl2 = cursor.moveToNext()) continue;
                    break;
                }
                cursor.close();
                return arrayList;
                {
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzg();
                    string2 = "Error querying trigger uris. appId";
                    list = zzgo.zza(list);
                    ((zzgq)object2).zza(string2, list, (Object)sQLiteException2);
                    list = Collections.emptyList();
                    if (cursor == null) break block10;
                }
                cursor.close();
            }
            return list;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzk(String list) {
        Throwable throwable2;
        Cursor cursor;
        block10: {
            block11: {
                SQLiteException sQLiteException2;
                int n3;
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                ArrayList<Object> arrayList;
                block9: {
                    Preconditions.checkNotEmpty(list);
                    this.zzv();
                    this.zzam();
                    arrayList = new ArrayList<Object>();
                    cursor = null;
                    try {
                        object6 = this.f_();
                        object5 = "user_attributes";
                        object4 = "name";
                        object3 = "origin";
                        object2 = "set_timestamp";
                        String string2 = "value";
                        object4 = new String[]{object4, object3, object2, string2};
                        object3 = "app_id=?";
                        object2 = new String[]{list};
                        object = "rowid";
                        String string3 = "1000";
                        string2 = null;
                        cursor = object6.query((String)object5, object4, (String)object3, object2, null, null, (String)object, string3);
                        n3 = cursor.moveToFirst();
                        if (n3 != 0) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    catch (SQLiteException sQLiteException2) {}
                    cursor.close();
                    return arrayList;
                }
                while (true) {
                    n3 = 0;
                    object6 = null;
                    object2 = cursor.getString(0);
                    n3 = 1;
                    object6 = cursor.getString(n3);
                    if (object6 == null) {
                        object6 = "";
                    }
                    object3 = object6;
                    n3 = 2;
                    long l2 = cursor.getLong(n3);
                    n3 = 3;
                    object = this.zza(cursor, n3);
                    if (object == null) {
                        object6 = this.zzj();
                        object6 = ((zzgo)object6).zzg();
                        object5 = "Read invalid user property value, ignoring it. appId";
                        object4 = zzgo.zza(list);
                        ((zzgq)object6).zza((String)object5, object4);
                        continue;
                    }
                    object5 = object6;
                    object4 = list;
                    object6 = new zzpo((String)((Object)list), (String)object3, (String)object2, l2, object);
                    arrayList.add(object6);
                    if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
                    break;
                }
                cursor.close();
                return arrayList;
                {
                    object6 = this.zzj();
                    object6 = ((zzgo)object6).zzg();
                    object5 = "Error querying user properties. appId";
                    list = zzgo.zza(list);
                    ((zzgq)object6).zza((String)object5, list, (Object)sQLiteException2);
                    list = Collections.emptyList();
                    if (cursor == null) break block11;
                }
                cursor.close();
            }
            return list;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzl(String map2) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Cursor cursor;
        Object object6;
        block10: {
            Throwable throwable2;
            block11: {
                block12: {
                    block9: {
                        this.zzam();
                        this.zzv();
                        Preconditions.checkNotEmpty(map2);
                        object6 = this.f_();
                        cursor = null;
                        object5 = "audience_filter_values";
                        object4 = "audience_id";
                        object3 = "current_results";
                        object4 = new String[]{object4, object3};
                        object3 = "app_id=?";
                        object2 = new String[]{map2};
                        object = null;
                        cursor = object6.query((String)object5, (String[])object4, (String)object3, object2, null, null, null);
                        boolean bl2 = cursor.moveToFirst();
                        if (bl2) break block9;
                        map2 = Collections.emptyMap();
                        cursor.close();
                        return map2;
                    }
                    try {
                        object6 = new Jp();
                        break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    catch (SQLiteException sQLiteException) {}
                    {
                        object5 = this.zzj();
                        object5 = ((zzgo)object5).zzg();
                        object4 = "Database error querying filter results. appId";
                        map2 = zzgo.zza(map2);
                        ((zzgq)object5).zza((String)object4, map2, (Object)sQLiteException);
                        map2 = Collections.emptyMap();
                        if (cursor == null) break block12;
                    }
                    cursor.close();
                }
                return map2;
            }
            if (cursor != null) {
                cursor.close();
            }
            throw throwable2;
        }
        do {
            n3 = 0;
            object5 = null;
            n3 = cursor.getInt(0);
            int n4 = 1;
            object4 = cursor.getBlob(n4);
            try {
                object3 = zzgf$zzm.zze();
                object4 = zzpj.zza((zzlp)object3, (byte[])object4);
                object4 = (zzgf$zzm$zza)object4;
                object4 = ((zzkg$zza)object4).zzaj();
                object4 = (zzkg)object4;
                object4 = (zzgf$zzm)object4;
            }
            catch (IOException iOException) {
                object3 = this.zzj();
                object3 = ((zzgo)object3).zzg();
                object2 = "Failed to merge filter results. appId, audienceId, error";
                object = zzgo.zza(map2);
                object5 = n3;
                ((zzgq)object3).zza((String)object2, object, object5, iOException);
            }
            object5 = n3;
            ((a53)object6).put(object5, object4);
        } while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0);
        cursor.close();
        return object6;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzm(String map2) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Cursor cursor;
        Object object4;
        Jp jp;
        block10: {
            block11: {
                Preconditions.checkNotEmpty(map2);
                jp = new Jp();
                object4 = this.f_();
                cursor = null;
                object3 = "event_filters";
                object2 = "audience_id";
                object = "data";
                try {
                    object2 = new String[]{object2, object};
                    object = "app_id=?";
                    String[] stringArray = new String[]{map2};
                    cursor = object4.query((String)object3, object2, (String)object, stringArray, null, null, null);
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) break block10;
                    map2 = Collections.emptyMap();
                }
                catch (Throwable throwable) {}
                cursor.close();
                return map2;
                if (cursor != null) {
                    cursor.close();
                }
                throw throwable;
                catch (SQLiteException sQLiteException) {}
                {
                    object4 = this.zzj();
                    object4 = ((zzgo)object4).zzg();
                    object3 = "Database error querying filters. appId";
                    map2 = zzgo.zza(map2);
                    ((zzgq)object4).zza((String)object3, map2, (Object)sQLiteException);
                    map2 = Collections.emptyMap();
                    if (cursor == null) break block11;
                }
                cursor.close();
            }
            return map2;
        }
        while (true) {
            n3 = 1;
            {
                int n4;
                object4 = cursor.getBlob(n3);
                try {
                    object3 = zzfw$zzb.zzc();
                    object4 = zzpj.zza((zzlp)object3, (byte[])object4);
                    object4 = (zzfw$zzb$zza)object4;
                    object4 = ((zzkg$zza)object4).zzaj();
                    object4 = (zzkg)object4;
                    object4 = (zzfw$zzb)object4;
                    n4 = ((zzfw$zzb)object4).zzk();
                    if (n4 == 0) continue;
                    n4 = 0;
                    object3 = null;
                }
                catch (IOException iOException) {
                    object3 = this.zzj();
                    object3 = ((zzgo)object3).zzg();
                    object2 = "Failed to merge filter. appId";
                    object = zzgo.zza(map2);
                    ((zzgq)object3).zza((String)object2, object, iOException);
                }
                n4 = cursor.getInt(0);
                object2 = n4;
                object2 = jp.get(object2);
                if ((object2 = (List)object2) == null) {
                    object2 = new ArrayList();
                    object3 = n4;
                    jp.put(object3, object2);
                }
                object2.add(object4);
                continue;
                if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
            }
            break;
        }
        cursor.close();
        return jp;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzn(String map2) {
        int n3;
        ArrayList<Object> arrayList;
        Cursor cursor;
        Object object;
        Jp jp;
        block8: {
            block9: {
                this.zzam();
                this.zzv();
                Preconditions.checkNotEmpty(map2);
                jp = new Jp();
                object = this.f_();
                cursor = null;
                arrayList = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;";
                try {
                    String[] stringArray = new String[]{map2, map2};
                    cursor = object.rawQuery((String)((Object)arrayList), stringArray);
                    n3 = cursor.moveToFirst();
                    if (n3 != 0) break block8;
                    map2 = Collections.emptyMap();
                }
                catch (Throwable throwable) {}
                cursor.close();
                return map2;
                if (cursor != null) {
                    cursor.close();
                }
                throw throwable;
                catch (SQLiteException sQLiteException) {}
                {
                    object = this.zzj();
                    object = ((zzgo)object).zzg();
                    arrayList = "Database error querying scoped filters. appId";
                    map2 = zzgo.zza(map2);
                    ((zzgq)object).zza((String)((Object)arrayList), map2, (Object)sQLiteException);
                    map2 = Collections.emptyMap();
                    if (cursor == null) break block9;
                }
                cursor.close();
            }
            return map2;
        }
        while (true) {
            n3 = 0;
            object = null;
            {
                n3 = cursor.getInt(0);
                arrayList = n3;
                arrayList = jp.get(arrayList);
                if ((arrayList = (List)arrayList) == null) {
                    arrayList = new ArrayList<Object>();
                    object = n3;
                    jp.put(object, arrayList);
                }
                n3 = 1;
                n3 = cursor.getInt(n3);
                object = n3;
                arrayList.add(object);
                if ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) continue;
            }
            break;
        }
        cursor.close();
        return jp;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(String object) {
        Throwable throwable2;
        Cursor cursor;
        block8: {
            block9: {
                boolean bl2;
                Object object2;
                Object object3;
                String string2;
                block7: {
                    string2 = "events_snapshot";
                    this.zzj(string2, (String)object);
                    object3 = Collections.singletonList("name");
                    cursor = null;
                    object2 = this.f_();
                    String string3 = "events";
                    String[] stringArray = new String[]{};
                    object3 = object3.toArray(stringArray);
                    stringArray = object3;
                    stringArray = object3;
                    String string4 = "app_id=?";
                    String[] stringArray2 = new String[]{object};
                    cursor = object2.query(string3, stringArray, string4, stringArray2, null, null, null);
                    bl2 = cursor.moveToFirst();
                    if (bl2) break block7;
                    cursor.close();
                    return;
                }
                try {
                    do {
                        if ((object3 = cursor.getString(0)) == null || (object3 = this.zzd((String)object, (String)object3)) == null) continue;
                        this.zza(string2, (zzbh)object3);
                    } while (bl2 = cursor.moveToNext());
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                catch (SQLiteException sQLiteException) {}
                cursor.close();
                return;
                {
                    object3 = this.zzj();
                    object3 = object3.zzg();
                    object2 = "Error creating snapshot. appId";
                    object = zzgo.zza((String)object);
                    object3.zza((String)object2, object, (Object)sQLiteException);
                    if (cursor == null) break block9;
                }
                cursor.close();
            }
            return;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw throwable2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(String string2) {
        void var5_12;
        boolean bl2;
        Cursor cursor;
        boolean bl3;
        String string3;
        zzbh zzbh2;
        zzbh zzbh3;
        String string4;
        String string5;
        zzar zzar2;
        block24: {
            block27: {
                Object object;
                String string6;
                Object object2;
                block25: {
                    boolean bl4;
                    int n3;
                    String string7;
                    Object object3;
                    block23: {
                        zzar2 = this;
                        string5 = string2;
                        string4 = "events_snapshot";
                        object2 = Arrays.asList("name", "lifetime_count");
                        object3 = new ArrayList(object2);
                        object2 = "_f";
                        zzbh3 = this.zzd(string2, (String)object2);
                        string6 = "_v";
                        zzbh2 = this.zzd(string2, string6);
                        string3 = "events";
                        this.zzj(string3, string2);
                        bl3 = false;
                        cursor = null;
                        try {
                            object = this.f_();
                            string7 = "events_snapshot";
                            String[] stringArray = new String[]{};
                            object3 = object3.toArray(stringArray);
                            stringArray = object3;
                            stringArray = object3;
                            String string8 = "app_id=?";
                            String[] stringArray2 = new String[]{string2};
                            n3 = 0;
                            cursor = object.query(string7, stringArray, string8, stringArray2, null, null, null);
                            bl4 = cursor.moveToFirst();
                            if (bl4) break block23;
                        }
                        catch (Throwable throwable) {
                            bl2 = false;
                            Object var14_22 = null;
                            break block24;
                        }
                        catch (SQLiteException sQLiteException) {
                            bl2 = false;
                            Object var14_23 = null;
                            break block25;
                        }
                        cursor.close();
                        if (zzbh3 != null) {
                            this.zza(string3, zzbh3);
                        } else if (zzbh2 != null) {
                            this.zza(string3, zzbh2);
                        }
                        zzar2.zzj(string4, string5);
                        return;
                    }
                    boolean bl5 = false;
                    object = null;
                    bl2 = false;
                    string7 = null;
                    do {
                        block26: {
                            try {
                                object3 = cursor.getString(0);
                                int n4 = 1;
                                long l2 = cursor.getLong(n4);
                                long l3 = 1L;
                                n3 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                                if (n3 < 0) break block26;
                                boolean bl6 = ((String)object2).equals(object3);
                                if (bl6) {
                                    bl5 = true;
                                    break block26;
                                }
                                bl6 = string6.equals(object3);
                                if (!bl6) break block26;
                                bl2 = true;
                            }
                            catch (Throwable throwable) {
                                bl3 = bl5;
                                break block24;
                            }
                            catch (SQLiteException sQLiteException) {
                                bl3 = bl5;
                                break block25;
                            }
                        }
                        if (object3 == null || (object3 = zzar2.zzc(string4, string5, (String)object3)) == null) continue;
                        zzar2.zza(string3, (zzbh)object3);
                    } while (bl4 = cursor.moveToNext());
                    cursor.close();
                    if (!bl5 && zzbh3 != null) {
                        zzar2.zza(string3, zzbh3);
                    } else if (!bl2 && zzbh2 != null) {
                        zzar2.zza(string3, zzbh2);
                    }
                    zzar2.zzj(string4, string5);
                    return;
                }
                try {
                    void var5_10;
                    object2 = this.zzj();
                    object2 = ((zzgo)object2).zzg();
                    string6 = "Error querying snapshot. appId";
                    object = zzgo.zza(string2);
                    ((zzgq)object2).zza(string6, object, var5_10);
                    if (cursor == null) break block27;
                }
                catch (Throwable throwable) {
                    // empty catch block
                    break block24;
                }
                cursor.close();
            }
            if (!bl3 && zzbh3 != null) {
                zzar2.zza(string3, zzbh3);
            } else if (!bl2 && zzbh2 != null) {
                zzar2.zza(string3, zzbh2);
            }
            zzar2.zzj(string4, string5);
            return;
        }
        if (cursor != null) {
            cursor.close();
        }
        if (!bl3 && zzbh3 != null) {
            zzar2.zza(string3, zzbh3);
        } else if (!bl2 && zzbh2 != null) {
            zzar2.zza(string3, zzbh2);
        }
        zzar2.zzj(string4, string5);
        throw var5_12;
    }

    public final void zzq() {
        this.zzam();
        this.f_().beginTransaction();
    }

    public final boolean zzq(String stringArray) {
        int n3 = 1;
        Object object = this.zze();
        zzfx zzfx2 = zzbn.zzch;
        boolean bl2 = object.zza(zzfx2);
        zzfx2 = null;
        if (!bl2) {
            return false;
        }
        object = this.zze();
        zzfx zzfx3 = zzbn.zzcj;
        bl2 = object.zza(zzfx3);
        long l2 = 0L;
        if (bl2) {
            Object object2;
            object = new zzlu[n3];
            Object object3 = zzlu.zzb;
            object[0] = object3;
            object3 = new ArrayList(n3);
            String string2 = null;
            for (int i3 = 0; i3 <= 0; i3 += n3) {
                int n4 = object[0].zza();
                object2 = n4;
                ((ArrayList)object3).add(object2);
            }
            object = zzar.zzb((List)object3);
            object3 = this.zzap();
            string2 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?";
            object2 = " AND NOT ";
            object = UX.c(string2, (String)object, (String)object2, (String)object3);
            long l3 = this.zzb((String)object, stringArray = new String[]{stringArray});
            long l4 = l3 - l2;
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 != false) {
                return n3 != 0;
            }
            return false;
        }
        object = this.zzap();
        String string3 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ";
        object = kp1_0.c(string3, (String)object);
        long l7 = this.zzb((String)object, stringArray = new String[]{stringArray});
        long l8 = l7 - l2;
        Object object5 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object5 != false) {
            return n3 != 0;
        }
        return false;
    }

    public final void zzr() {
        this.zzam();
        this.f_().endTransaction();
    }

    public final void zzw() {
        long l2;
        this.zzv();
        this.zzam();
        int n3 = this.zzab();
        if (n3 == 0) {
            return;
        }
        Object object = this.zzo().zza;
        long l3 = ((zzhf)object).zza();
        Object object2 = this.zzb();
        long l4 = object2.elapsedRealtime();
        l3 = Math.abs(l4 - l3);
        long l7 = l3 - (l2 = zzai.zzo());
        Object object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 > 0) {
            object = this.zzo().zza;
            ((zzhf)object).zza(l4);
            this.zzv();
            this.zzam();
            n3 = this.zzab();
            if (n3 != 0) {
                object = this.f_();
                long l8 = this.zzb().currentTimeMillis();
                Object object4 = String.valueOf(l8);
                l4 = zzai.zzm();
                object2 = String.valueOf(l4);
                object2 = "queue";
                String string2 = "abs(bundle_end_timestamp - ?) > cast(? as integer)";
                n3 = object.delete((String)object2, string2, (String[])(object4 = new String[]{object4, object2}));
                if (n3 > 0) {
                    object4 = this.zzj().zzq();
                    object = n3;
                    object2 = "Deleted stale rows. rowsDeleted";
                    ((zzgq)object4).zza((String)object2, object);
                }
            }
        }
    }

    public final void zzx() {
        this.zzam();
        this.f_().setTransactionSuccessful();
    }

    public final boolean zzy() {
        long l2;
        String string2 = "select count(1) > 0 from raw_events";
        long l3 = this.zzb(string2, (String[])null);
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }

    public final boolean zzz() {
        long l2;
        String string2 = "select count(1) > 0 from queue where has_realtime = 1";
        long l3 = this.zzb(string2, (String[])null);
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object != false;
    }
}

