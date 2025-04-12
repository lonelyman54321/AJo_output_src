/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzcj;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.zzar;
import com.google.android.gms.measurement.internal.zzay;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzoh;
import java.io.File;

final class zzaz
extends zzcj {
    private final /* synthetic */ zzar zza;

    public zzaz(zzar zzar2, Context context, String string2) {
        this.zza = zzar2;
        super(context, string2, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        long l2;
        Object object = zzar.zza(this.zza);
        boolean bl2 = ((zzoh)object).zza(l2 = 3600000L);
        if (bl2) {
            try {
                return super.getWritableDatabase();
            }
            catch (SQLiteException sQLiteException) {
                zzar.zza(this.zza).zzb();
                this.zza.zzj().zzg().zza("Opening the database failed, dropping and recreating it");
                object = this.zza.zza();
                Object object2 = "google_app_measurement.db";
                object = object.getDatabasePath((String)object2);
                bl2 = ((File)object).delete();
                if (!bl2) {
                    object = this.zza.zzj().zzg();
                    String string2 = "Failed to delete corrupted db file";
                    ((zzgq)object).zza(string2, object2);
                }
                try {
                    object = super.getWritableDatabase();
                }
                catch (SQLiteException sQLiteException2) {
                    this.zza.zzj().zzg().zza("Failed to open freshly created database", (Object)sQLiteException2);
                    throw sQLiteException2;
                }
                object2 = this.zza;
                object2 = zzar.zza((zzar)object2);
                ((zzoh)object2).zza();
                return object;
            }
        }
        object = new SQLiteException("Database open failed");
        throw object;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzay.zza(this.zza.zzj(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzgo zzgo2 = this.zza.zzj();
        String[] stringArray = zzar.zzaf();
        zzay.zza(zzgo2, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", stringArray);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzal();
        zzay.zza(zzgo2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", stringArray);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzad();
        zzay.zza(zzgo2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", stringArray);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzai();
        zzay.zza(zzgo2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", stringArray);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzaj();
        zzay.zza(zzgo2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", stringArray);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzag();
        zzay.zza(zzgo2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", stringArray);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzah();
        zzay.zza(zzgo2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", stringArray);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zzac();
        zzay.zza(zzgo2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", stringArray);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzay.zza(this.zza.zzj(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzar zzar2 = this.zza;
        zzgo2 = zzar2.zzj();
        String string2 = "app_id,consent_state";
        stringArray = zzar.zzae();
        String string3 = "consent_settings";
        String string4 = "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));";
        zzay.zza(zzgo2, sQLiteDatabase, string3, string4, string2, stringArray);
        boolean bl2 = zzoy.zza();
        if (bl2) {
            zzar2 = this.zza;
            zzgo2 = zzar2.zzj();
            string2 = "app_id,trigger_uri,source,timestamp_millis";
            stringArray = zzar.zzak();
            string3 = "trigger_uris";
            string4 = "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);";
            zzay.zza(zzgo2, sQLiteDatabase, string3, string4, string2, stringArray);
        }
        zzgo2 = this.zza.zzj();
        stringArray = zzar.zza;
        zzay.zza(zzgo2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", stringArray);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
    }
}

