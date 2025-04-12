/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.datatransport.runtime.scheduling.persistence.C;
import com.google.android.datatransport.runtime.scheduling.persistence.D;
import com.google.android.datatransport.runtime.scheduling.persistence.E;
import com.google.android.datatransport.runtime.scheduling.persistence.F;
import com.google.android.datatransport.runtime.scheduling.persistence.G;
import com.google.android.datatransport.runtime.scheduling.persistence.H;
import com.google.android.datatransport.runtime.scheduling.persistence.I;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration;
import java.util.Arrays;
import java.util.List;

final class SchemaManager
extends SQLiteOpenHelper {
    private static final String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    private static final String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    private static final String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    private static final String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
    private static final String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    private static final String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    private static final String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL;
    private static final String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    private static final String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    static final String DB_NAME = "com.google.android.datatransport.events";
    private static final String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
    private static final String DROP_EVENTS_SQL = "DROP TABLE events";
    private static final String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
    private static final String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
    private static final String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
    private static final String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
    private static final List INCREMENTAL_MIGRATIONS;
    private static final SchemaManager$Migration MIGRATE_TO_V1;
    private static final SchemaManager$Migration MIGRATE_TO_V2;
    private static final SchemaManager$Migration MIGRATE_TO_V3;
    private static final SchemaManager$Migration MIGRATE_TO_V4;
    private static final SchemaManager$Migration MIGRATE_TO_V6;
    private static final SchemaManager$Migration MIGRATE_TO_V7;
    private static final SchemaManager$Migration MIGRATION_TO_V5;
    static int SCHEMA_VERSION;
    private boolean configured = false;
    private final int schemaVersion;

    static {
        int n3;
        SchemaManager$Migration[] schemaManager$MigrationArray = new StringBuilder("INSERT INTO global_log_event_state VALUES (");
        long l2 = System.currentTimeMillis();
        schemaManager$MigrationArray.append(l2);
        schemaManager$MigrationArray.append(")");
        CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = schemaManager$MigrationArray.toString();
        SCHEMA_VERSION = n3 = 7;
        C c2 = new Object();
        MIGRATE_TO_V1 = c2;
        D d2 = new Object();
        MIGRATE_TO_V2 = d2;
        E e2 = new Object();
        MIGRATE_TO_V3 = e2;
        F f5 = new Object();
        MIGRATE_TO_V4 = f5;
        G g3 = new Object();
        MIGRATION_TO_V5 = g3;
        H h3 = new Object();
        MIGRATE_TO_V6 = h3;
        I i3 = new Object();
        MIGRATE_TO_V7 = i3;
        schemaManager$MigrationArray = new SchemaManager$Migration[n3];
        schemaManager$MigrationArray[0] = c2;
        schemaManager$MigrationArray[1] = d2;
        schemaManager$MigrationArray[2] = e2;
        schemaManager$MigrationArray[3] = f5;
        schemaManager$MigrationArray[4] = g3;
        schemaManager$MigrationArray[5] = h3;
        schemaManager$MigrationArray[6] = i3;
        INCREMENTAL_MIGRATIONS = Arrays.asList(schemaManager$MigrationArray);
    }

    public SchemaManager(Context context, String string2, int n3) {
        super(context, string2, null, n3);
        this.schemaVersion = n3;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$0(sQLiteDatabase);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$6(sQLiteDatabase);
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$4(sQLiteDatabase);
    }

    private void ensureConfigured(SQLiteDatabase sQLiteDatabase) {
        boolean bl2 = this.configured;
        if (!bl2) {
            this.onConfigure(sQLiteDatabase);
        }
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
    }

    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$1(sQLiteDatabase);
    }

    private static /* synthetic */ void lambda$static$0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(CREATE_EVENTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_METADATA_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXTS_SQL_V1);
        sQLiteDatabase.execSQL(CREATE_EVENT_BACKEND_INDEX_V1);
        sQLiteDatabase.execSQL(CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1);
    }

    private static /* synthetic */ void lambda$static$1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    private static /* synthetic */ void lambda$static$3(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(CREATE_PAYLOADS_TABLE_V4);
    }

    private static /* synthetic */ void lambda$static$4(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        sQLiteDatabase.execSQL(CREATE_LOG_EVENT_DROPPED_TABLE);
        sQLiteDatabase.execSQL(CREATE_GLOBAL_LOG_EVENT_STATE_TABLE);
        String string2 = CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL;
        sQLiteDatabase.execSQL(string2);
    }

    private static /* synthetic */ void lambda$static$6(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$3(sQLiteDatabase);
    }

    private void onCreate(SQLiteDatabase sQLiteDatabase, int n3) {
        this.ensureConfigured(sQLiteDatabase);
        this.upgrade(sQLiteDatabase, 0, n3);
    }

    private void upgrade(SQLiteDatabase object, int n3, int n4) {
        Object object2 = INCREMENTAL_MIGRATIONS;
        int n7 = object2.size();
        if (n4 <= n7) {
            while (n3 < n4) {
                object2 = (SchemaManager$Migration)INCREMENTAL_MIGRATIONS.get(n3);
                object2.upgrade((SQLiteDatabase)object);
                ++n3;
            }
            return;
        }
        CharSequence charSequence = fQ2.a("Migration from ", " to ", " was requested, but cannot be performed. Only ", n3, n4);
        n4 = object2.size();
        charSequence.append(n4);
        charSequence.append(" migrations are provided");
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean bl2;
        this.configured = bl2 = true;
        String[] stringArray = new String[]{};
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", stringArray).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(bl2);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int n3 = this.schemaVersion;
        this.onCreate(sQLiteDatabase, n3);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        sQLiteDatabase.execSQL(DROP_EVENTS_SQL);
        sQLiteDatabase.execSQL(DROP_EVENT_METADATA_SQL);
        sQLiteDatabase.execSQL(DROP_CONTEXTS_SQL);
        sQLiteDatabase.execSQL(DROP_PAYLOADS_SQL);
        sQLiteDatabase.execSQL(DROP_LOG_EVENT_DROPPED_SQL);
        sQLiteDatabase.execSQL(DROP_GLOBAL_LOG_EVENT_STATE_SQL);
        this.onCreate(sQLiteDatabase, n4);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.ensureConfigured(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n3, int n4) {
        this.ensureConfigured(sQLiteDatabase);
        this.upgrade(sQLiteDatabase, n3, n4);
    }
}

