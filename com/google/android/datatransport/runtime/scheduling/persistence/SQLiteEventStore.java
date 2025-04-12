/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabaseLockedException
 *  android.os.SystemClock
 *  android.util.Base64
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.EventInternal$Builder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportContext$Builder;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Builder;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics$Builder;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.B;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Metadata;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Producer;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;
import com.google.android.datatransport.runtime.scheduling.persistence.a_0;
import com.google.android.datatransport.runtime.scheduling.persistence.b_0;
import com.google.android.datatransport.runtime.scheduling.persistence.d_0;
import com.google.android.datatransport.runtime.scheduling.persistence.e_0;
import com.google.android.datatransport.runtime.scheduling.persistence.f_0;
import com.google.android.datatransport.runtime.scheduling.persistence.g_0;
import com.google.android.datatransport.runtime.scheduling.persistence.h_0;
import com.google.android.datatransport.runtime.scheduling.persistence.i_0;
import com.google.android.datatransport.runtime.scheduling.persistence.j;
import com.google.android.datatransport.runtime.scheduling.persistence.k;
import com.google.android.datatransport.runtime.scheduling.persistence.l;
import com.google.android.datatransport.runtime.scheduling.persistence.m;
import com.google.android.datatransport.runtime.scheduling.persistence.o;
import com.google.android.datatransport.runtime.scheduling.persistence.p;
import com.google.android.datatransport.runtime.scheduling.persistence.q;
import com.google.android.datatransport.runtime.scheduling.persistence.s;
import com.google.android.datatransport.runtime.scheduling.persistence.t;
import com.google.android.datatransport.runtime.scheduling.persistence.u;
import com.google.android.datatransport.runtime.scheduling.persistence.x;
import com.google.android.datatransport.runtime.scheduling.persistence.y;
import com.google.android.datatransport.runtime.scheduling.persistence.z;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

public class SQLiteEventStore
implements EventStore,
SynchronizationGuard,
ClientHealthMetricsStore {
    private static final int LOCK_RETRY_BACK_OFF_MILLIS = 50;
    private static final String LOG_TAG = "SQLiteEventStore";
    static final int MAX_RETRIES = 16;
    private static final Encoding PROTOBUF_ENCODING = Encoding.of("proto");
    private final EventStoreConfig config;
    private final Clock monotonicClock;
    private final Provider packageName;
    private final SchemaManager schemaManager;
    private final Clock wallClock;

    public SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, Provider provider) {
        this.schemaManager = schemaManager;
        this.wallClock = clock;
        this.monotonicClock = clock2;
        this.config = eventStoreConfig;
        this.packageName = provider;
    }

    public static /* synthetic */ ClientMetrics A(SQLiteEventStore sQLiteEventStore, Map map2, ClientMetrics$Builder clientMetrics$Builder, Cursor cursor) {
        return sQLiteEventStore.lambda$loadClientMetrics$19(map2, clientMetrics$Builder, cursor);
    }

    public static /* synthetic */ Boolean C(Cursor cursor) {
        return SQLiteEventStore.lambda$recordLogEventDropped$17(cursor);
    }

    public static /* synthetic */ Object G(SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$clearDb$13(sQLiteDatabase);
    }

    public static /* synthetic */ Long H(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$persist$1(eventInternal, transportContext, sQLiteDatabase);
    }

    public static /* synthetic */ Object I(SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$ensureBeginTransaction$24(sQLiteDatabase);
    }

    public static /* synthetic */ Long K(Cursor cursor) {
        return SQLiteEventStore.lambda$getTransportContextId$2(cursor);
    }

    public static /* synthetic */ Object M(Throwable throwable) {
        return SQLiteEventStore.lambda$ensureBeginTransaction$25(throwable);
    }

    public static /* synthetic */ Object O(String string2, LogEventDropped$Reason logEventDropped$Reason, long l2, SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$recordLogEventDropped$18(string2, logEventDropped$Reason, l2, sQLiteDatabase);
    }

    public static /* synthetic */ Object P(HashMap hashMap, Cursor cursor) {
        return SQLiteEventStore.lambda$loadMetadata$16(hashMap, cursor);
    }

    public static /* synthetic */ Integer Q(SQLiteEventStore sQLiteEventStore, long l2, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$cleanUp$12(l2, sQLiteDatabase);
    }

    public static /* synthetic */ Object R(SQLiteEventStore sQLiteEventStore, ArrayList arrayList, TransportContext transportContext, Cursor cursor) {
        return sQLiteEventStore.lambda$loadEvents$14(arrayList, transportContext, cursor);
    }

    public static /* synthetic */ Object U(SQLiteEventStore sQLiteEventStore, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$resetClientMetrics$23(sQLiteDatabase);
    }

    public static /* synthetic */ ClientMetrics W(SQLiteEventStore sQLiteEventStore, HashMap hashMap, ClientMetrics$Builder clientMetrics$Builder, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$loadClientMetrics$20("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", hashMap, clientMetrics$Builder, sQLiteDatabase);
    }

    public static /* synthetic */ TimeWindow a(long l2, Cursor cursor) {
        return SQLiteEventStore.lambda$getTimeWindow$21(l2, cursor);
    }

    public static /* synthetic */ List b(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$loadBatch$8(transportContext, sQLiteDatabase);
    }

    public static /* synthetic */ List c(Cursor cursor) {
        return SQLiteEventStore.lambda$loadActiveContexts$9(cursor);
    }

    private LogEventDropped$Reason convertToReason(int n3) {
        LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.REASON_UNKNOWN;
        int n4 = logEventDropped$Reason.getNumber();
        if (n3 == n4) {
            return logEventDropped$Reason;
        }
        LogEventDropped$Reason logEventDropped$Reason2 = LogEventDropped$Reason.MESSAGE_TOO_OLD;
        int n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        logEventDropped$Reason2 = LogEventDropped$Reason.CACHE_FULL;
        n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        logEventDropped$Reason2 = LogEventDropped$Reason.PAYLOAD_TOO_BIG;
        n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        logEventDropped$Reason2 = LogEventDropped$Reason.MAX_RETRIES_REACHED;
        n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        logEventDropped$Reason2 = LogEventDropped$Reason.INVALID_PAYLOD;
        n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        logEventDropped$Reason2 = LogEventDropped$Reason.SERVER_ERROR;
        n7 = logEventDropped$Reason2.getNumber();
        if (n3 == n7) {
            return logEventDropped$Reason2;
        }
        Integer n8 = n3;
        Logging.d(LOG_TAG, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", (Object)n8);
        return logEventDropped$Reason;
    }

    public static /* synthetic */ Object d(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        return sQLiteEventStore.lambda$recordFailure$3(cursor);
    }

    private void ensureBeginTransaction(SQLiteDatabase object) {
        u u3 = new u((SQLiteDatabase)object);
        object = new Object();
        this.retryIfDbLocked(u3, (SQLiteEventStore$Function)object);
    }

    private long ensureTransportContext(SQLiteDatabase sQLiteDatabase, TransportContext object) {
        Long l2 = this.getTransportContextId(sQLiteDatabase, (TransportContext)object);
        if (l2 != null) {
            return l2;
        }
        l2 = new ContentValues();
        Object object2 = ((TransportContext)object).getBackendName();
        l2.put("backend_name", (String)object2);
        object2 = PriorityMapping.toInt(((TransportContext)object).getPriority());
        l2.put("priority", (Integer)object2);
        object2 = null;
        Object object3 = 0;
        String string2 = "next_request_ms";
        l2.put(string2, (Integer)object3);
        object3 = ((TransportContext)object).getExtras();
        if (object3 != null) {
            object = Base64.encodeToString((byte[])((TransportContext)object).getExtras(), (int)0);
            object2 = "extras";
            l2.put((String)object2, (String)object);
        }
        return sQLiteDatabase.insert("transport_contexts", null, (ContentValues)l2);
    }

    private GlobalMetrics getGlobalMetrics() {
        GlobalMetrics$Builder globalMetrics$Builder = GlobalMetrics.newBuilder();
        Object object = StorageMetrics.newBuilder();
        long l2 = this.getByteSize();
        object = ((StorageMetrics$Builder)object).setCurrentCacheSizeBytes(l2);
        l2 = EventStoreConfig.DEFAULT.getMaxStorageSizeInBytes();
        object = ((StorageMetrics$Builder)object).setMaxCacheSizeBytes(l2).build();
        return globalMetrics$Builder.setStorageMetrics((StorageMetrics)object).build();
    }

    private long getPageCount() {
        return this.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long getPageSize() {
        return this.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private TimeWindow getTimeWindow() {
        long l2 = this.wallClock.getTime();
        q q2 = new q(l2);
        return (TimeWindow)this.inTransaction(q2);
    }

    private Long getTransportContextId(SQLiteDatabase sQLiteDatabase, TransportContext object) {
        StringBuilder stringBuilder = new StringBuilder("backend_name = ? and priority = ?");
        Object object2 = object.getBackendName();
        String string2 = String.valueOf(PriorityMapping.toInt(object.getPriority()));
        object2 = Arrays.asList(object2, string2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>((Collection<String[]>)object2);
        object2 = object.getExtras();
        string2 = null;
        if (object2 != null) {
            object2 = " and extras = ?";
            stringBuilder.append((String)object2);
            object = Base64.encodeToString((byte[])object.getExtras(), (int)0);
            arrayList.add((String[])object);
        } else {
            object = " and extras is null";
            stringBuilder.append((String)object);
        }
        String[] stringArray = new String[]{"_id"};
        String string3 = stringBuilder.toString();
        object = new String[]{};
        String[] stringArray2 = object = arrayList.toArray((T[])object);
        stringArray2 = object;
        sQLiteDatabase = sQLiteDatabase.query("transport_contexts", stringArray, string3, stringArray2, null, null, null);
        object = new Object();
        return (Long)SQLiteEventStore.tryWithCursor((Cursor)sQLiteDatabase, (SQLiteEventStore$Function)object);
    }

    public static /* synthetic */ SQLiteDatabase h(Throwable throwable) {
        return SQLiteEventStore.lambda$getDb$0(throwable);
    }

    private boolean isStorageAtLimit() {
        long l2 = this.getPageCount();
        long l3 = this.getPageSize();
        EventStoreConfig eventStoreConfig = this.config;
        long l4 = (l2 *= l3) - (l3 = eventStoreConfig.getMaxStorageSizeInBytes());
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        return bl2;
    }

    private List join(List list, Map map2) {
        boolean bl2;
        ListIterator<Object> listIterator = list.listIterator();
        while (bl2 = listIterator.hasNext()) {
            boolean bl3;
            Object object = (PersistedEvent)listIterator.next();
            long l2 = ((PersistedEvent)object).getId();
            Object object2 = l2;
            boolean bl4 = map2.containsKey(object2);
            if (!bl4) continue;
            object2 = ((PersistedEvent)object).getEvent().toBuilder();
            long l3 = ((PersistedEvent)object).getId();
            Object object3 = l3;
            object3 = ((Set)map2.get(object3)).iterator();
            while (bl3 = object3.hasNext()) {
                Object object4 = (SQLiteEventStore$Metadata)object3.next();
                String string2 = ((SQLiteEventStore$Metadata)object4).key;
                object4 = ((SQLiteEventStore$Metadata)object4).value;
                ((EventInternal$Builder)object2).addMetadata(string2, (String)object4);
            }
            l3 = ((PersistedEvent)object).getId();
            object = ((PersistedEvent)object).getTransportContext();
            object2 = ((EventInternal$Builder)object2).build();
            object = PersistedEvent.create(l3, (TransportContext)object, (EventInternal)object2);
            listIterator.set(object);
        }
        return list;
    }

    public static /* synthetic */ Object k(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        return sQLiteEventStore.lambda$cleanUp$11(cursor);
    }

    public static /* synthetic */ Long l0(Cursor cursor) {
        return SQLiteEventStore.lambda$getNextCallTime$5(cursor);
    }

    private /* synthetic */ Object lambda$cleanUp$11(Cursor cursor) {
        int n3;
        while ((n3 = cursor.moveToNext()) != 0) {
            n3 = cursor.getInt(0);
            int n4 = 1;
            String string2 = cursor.getString(n4);
            long l2 = n3;
            LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.MESSAGE_TOO_OLD;
            this.recordLogEventDropped(l2, logEventDropped$Reason, string2);
        }
        return null;
    }

    private /* synthetic */ Integer lambda$cleanUp$12(long l2, SQLiteDatabase sQLiteDatabase) {
        String[] stringArray = String.valueOf(l2);
        stringArray = new String[]{stringArray};
        Cursor cursor = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", stringArray);
        t t3 = new t(this);
        SQLiteEventStore.tryWithCursor(cursor, t3);
        return sQLiteDatabase.delete("events", "timestamp_ms < ?", stringArray);
    }

    private static /* synthetic */ Object lambda$clearDb$13(SQLiteDatabase sQLiteDatabase) {
        String[] stringArray = new String[]{};
        sQLiteDatabase.delete("events", null, stringArray);
        String[] stringArray2 = new String[]{};
        sQLiteDatabase.delete("transport_contexts", null, stringArray2);
        return null;
    }

    private static /* synthetic */ Object lambda$ensureBeginTransaction$24(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private static /* synthetic */ Object lambda$ensureBeginTransaction$25(Throwable throwable) {
        SynchronizationException synchronizationException = new SynchronizationException("Timed out while trying to acquire the lock.", throwable);
        throw synchronizationException;
    }

    private static /* synthetic */ SQLiteDatabase lambda$getDb$0(Throwable throwable) {
        SynchronizationException synchronizationException = new SynchronizationException("Timed out while trying to open db.", throwable);
        throw synchronizationException;
    }

    private static /* synthetic */ Long lambda$getNextCallTime$5(Cursor cursor) {
        boolean bl2 = cursor.moveToNext();
        if (bl2) {
            return cursor.getLong(0);
        }
        return 0L;
    }

    private static /* synthetic */ TimeWindow lambda$getTimeWindow$21(long l2, Cursor cursor) {
        cursor.moveToNext();
        long l3 = cursor.getLong(0);
        return TimeWindow.newBuilder().setStartMs(l3).setEndMs(l2).build();
    }

    private static /* synthetic */ TimeWindow lambda$getTimeWindow$22(long l2, SQLiteDatabase sQLiteDatabase) {
        Object object = new String[]{};
        sQLiteDatabase = sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", object);
        object = new s(l2);
        return (TimeWindow)SQLiteEventStore.tryWithCursor((Cursor)sQLiteDatabase, (SQLiteEventStore$Function)object);
    }

    private static /* synthetic */ Long lambda$getTransportContextId$2(Cursor cursor) {
        boolean bl2 = cursor.moveToNext();
        if (!bl2) {
            return null;
        }
        return cursor.getLong(0);
    }

    private /* synthetic */ Boolean lambda$hasPendingEventsFor$6(TransportContext stringArray, SQLiteDatabase object) {
        if ((stringArray = this.getTransportContextId((SQLiteDatabase)object, (TransportContext)stringArray)) == null) {
            return Boolean.FALSE;
        }
        object = this.getDb();
        stringArray = stringArray.toString();
        stringArray = new String[]{stringArray};
        stringArray = object.rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", stringArray);
        object = new Object();
        return (Boolean)SQLiteEventStore.tryWithCursor((Cursor)stringArray, (SQLiteEventStore$Function)object);
    }

    private static /* synthetic */ List lambda$loadActiveContexts$10(SQLiteDatabase sQLiteDatabase) {
        Object object = new String[]{};
        sQLiteDatabase = sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", object);
        object = new Object();
        return (List)SQLiteEventStore.tryWithCursor((Cursor)sQLiteDatabase, (SQLiteEventStore$Function)object);
    }

    private static /* synthetic */ List lambda$loadActiveContexts$9(Cursor cursor) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        while (bl2 = cursor.moveToNext()) {
            Object object = TransportContext.builder();
            Object object2 = cursor.getString(1);
            object = ((TransportContext$Builder)object).setBackendName((String)object2);
            object2 = PriorityMapping.valueOf(cursor.getInt(2));
            object = ((TransportContext$Builder)object).setPriority((Priority)((Object)object2));
            int n3 = 3;
            object2 = SQLiteEventStore.maybeBase64Decode(cursor.getString(n3));
            object = ((TransportContext$Builder)object).setExtras((byte[])object2).build();
            arrayList.add(object);
        }
        return arrayList;
    }

    private /* synthetic */ List lambda$loadBatch$8(TransportContext object, SQLiteDatabase sQLiteDatabase) {
        int n3 = this.config.getLoadBatchSize();
        List list = this.loadEvents(sQLiteDatabase, (TransportContext)object, n3);
        for (Object object2 : Priority.values()) {
            Object object3 = ((TransportContext)object).getPriority();
            if (object2 == object3) continue;
            object3 = this.config;
            int n4 = ((EventStoreConfig)object3).getLoadBatchSize();
            int n7 = list.size();
            if ((n4 -= n7) <= 0) break;
            object2 = ((TransportContext)object).withPriority((Priority)((Object)object2));
            object2 = this.loadEvents(sQLiteDatabase, (TransportContext)object2, n4);
            list.addAll(object2);
        }
        object = this.loadMetadata(sQLiteDatabase, list);
        return this.join(list, (Map)object);
    }

    private /* synthetic */ ClientMetrics lambda$loadClientMetrics$19(Map object, ClientMetrics$Builder object2, Cursor cursor) {
        boolean bl2;
        while (bl2 = cursor.moveToNext()) {
            Object object3;
            bl2 = false;
            Object object4 = cursor.getString(0);
            int n3 = cursor.getInt(1);
            Object object5 = this.convertToReason(n3);
            int n4 = 2;
            long l2 = cursor.getLong(n4);
            boolean bl3 = object.containsKey(object4);
            if (!bl3) {
                object3 = new ArrayList();
                object.put(object4, object3);
            }
            object4 = (List)object.get(object4);
            object3 = LogEventDropped.newBuilder();
            object5 = ((LogEventDropped$Builder)object3).setReason((LogEventDropped$Reason)object5).setEventsDroppedCount(l2).build();
            object4.add(object5);
        }
        this.populateLogSourcesMetrics((ClientMetrics$Builder)object2, (Map)object);
        object = this.getTimeWindow();
        object = ((ClientMetrics$Builder)object2).setWindow((TimeWindow)object);
        object2 = this.getGlobalMetrics();
        object = ((ClientMetrics$Builder)object).setGlobalMetrics((GlobalMetrics)object2);
        object2 = (String)this.packageName.get();
        return ((ClientMetrics$Builder)object).setAppNamespace((String)object2).build();
    }

    private /* synthetic */ ClientMetrics lambda$loadClientMetrics$20(String string2, Map map2, ClientMetrics$Builder clientMetrics$Builder, SQLiteDatabase object) {
        String[] stringArray = new String[]{};
        string2 = object.rawQuery(string2, stringArray);
        object = new g_0(this, map2, clientMetrics$Builder);
        return (ClientMetrics)SQLiteEventStore.tryWithCursor((Cursor)string2, (SQLiteEventStore$Function)object);
    }

    private /* synthetic */ Object lambda$loadEvents$14(List list, TransportContext transportContext, Cursor cursor) {
        int n3;
        while ((n3 = cursor.moveToNext()) != 0) {
            byte[] byArray;
            n3 = 0;
            Object object = null;
            long l2 = cursor.getLong(0);
            int n4 = cursor.getInt(7);
            int n7 = 1;
            if (n4 != 0) {
                n3 = 1;
            }
            EventInternal$Builder eventInternal$Builder = EventInternal.builder();
            Object object2 = cursor.getString(n7);
            eventInternal$Builder = eventInternal$Builder.setTransportName((String)object2);
            long l3 = cursor.getLong(2);
            eventInternal$Builder = eventInternal$Builder.setEventMillis(l3);
            l3 = cursor.getLong(3);
            eventInternal$Builder = eventInternal$Builder.setUptimeMillis(l3);
            n7 = 4;
            if (n3 != 0) {
                object2 = SQLiteEventStore.toEncoding(cursor.getString(n7));
                int n8 = 5;
                byArray = cursor.getBlob(n8);
                object = new EncodedPayload((Encoding)object2, byArray);
                eventInternal$Builder.setEncodedPayload((EncodedPayload)object);
            } else {
                object2 = SQLiteEventStore.toEncoding(cursor.getString(n7));
                byArray = this.readPayload(l2);
                object = new EncodedPayload((Encoding)object2, byArray);
                eventInternal$Builder.setEncodedPayload((EncodedPayload)object);
            }
            n3 = 6;
            n7 = (int)(cursor.isNull(n3) ? 1 : 0);
            if (n7 == 0) {
                n3 = cursor.getInt(n3);
                object = n3;
                eventInternal$Builder.setCode((Integer)object);
            }
            if ((n7 = (int)(cursor.isNull(n3 = 8) ? 1 : 0)) == 0) {
                n3 = cursor.getInt(n3);
                object = n3;
                eventInternal$Builder.setProductId((Integer)object);
            }
            if ((n7 = (int)(cursor.isNull(n3 = 9) ? 1 : 0)) == 0) {
                object = cursor.getString(n3);
                eventInternal$Builder.setPseudonymousId((String)object);
            }
            if ((n7 = (int)(cursor.isNull(n3 = 10) ? 1 : 0)) == 0) {
                object = cursor.getBlob(n3);
                eventInternal$Builder.setExperimentIdsClear((byte[])object);
            }
            if ((n7 = (int)(cursor.isNull(n3 = 11) ? 1 : 0)) == 0) {
                object = cursor.getBlob(n3);
                eventInternal$Builder.setExperimentIdsEncrypted((byte[])object);
            }
            object = eventInternal$Builder.build();
            object = PersistedEvent.create(l2, transportContext, (EventInternal)object);
            list.add(object);
        }
        return null;
    }

    private static /* synthetic */ Object lambda$loadMetadata$16(Map map2, Cursor cursor) {
        boolean bl2;
        while (bl2 = cursor.moveToNext()) {
            Object object;
            bl2 = false;
            long l2 = cursor.getLong(0);
            HashSet<Object> hashSet = l2;
            if ((hashSet = (Set)map2.get(hashSet)) == null) {
                hashSet = new HashSet<Object>();
                object = l2;
                map2.put(object, hashSet);
            }
            int n3 = 1;
            String string2 = cursor.getString(n3);
            int n4 = 2;
            String string3 = cursor.getString(n4);
            object = new SQLiteEventStore$Metadata(string2, string3, null);
            hashSet.add(object);
        }
        return null;
    }

    private /* synthetic */ Long lambda$persist$1(EventInternal iterator, TransportContext object, SQLiteDatabase sQLiteDatabase) {
        Object object2;
        boolean bl2 = this.isStorageAtLimit();
        if (bl2) {
            object = LogEventDropped$Reason.CACHE_FULL;
            iterator = ((EventInternal)((Object)iterator)).getTransportName();
            this.recordLogEventDropped(1L, (LogEventDropped$Reason)object, (String)((Object)iterator));
            return -1;
        }
        long l2 = this.ensureTransportContext(sQLiteDatabase, (TransportContext)object);
        object = this.config;
        int n3 = ((EventStoreConfig)object).getMaxBlobByteSizePerRow();
        Object object3 = ((EventInternal)((Object)iterator)).getEncodedPayload().getBytes();
        int n4 = ((byte[])object3).length;
        int n7 = 0;
        Object object4 = null;
        int n8 = 1;
        if (n4 <= n3) {
            n4 = 1;
        } else {
            n4 = 0;
            object2 = null;
        }
        ContentValues contentValues = new ContentValues();
        Object object5 = l2;
        contentValues.put("context_id", (Long)object5);
        Object object6 = ((EventInternal)((Object)iterator)).getTransportName();
        contentValues.put("transport_name", (String)object6);
        object5 = ((EventInternal)((Object)iterator)).getEventMillis();
        contentValues.put("timestamp_ms", (Long)object5);
        l2 = ((EventInternal)((Object)iterator)).getUptimeMillis();
        object5 = l2;
        contentValues.put("uptime_ms", (Long)object5);
        object5 = ((EventInternal)((Object)iterator)).getEncodedPayload().getEncoding().getName();
        contentValues.put("payload_encoding", (String)object5);
        object6 = ((EventInternal)((Object)iterator)).getCode();
        contentValues.put("code", (Integer)object6);
        object5 = 0;
        contentValues.put("num_attempts", (Integer)object5);
        object5 = n4 != 0;
        object6 = "inline";
        contentValues.put((String)object6, (Boolean)object5);
        object5 = n4 != 0 ? (Object)object3 : (Object)new byte[0];
        contentValues.put("payload", (byte[])object5);
        object6 = ((EventInternal)((Object)iterator)).getProductId();
        contentValues.put("product_id", (Integer)object6);
        object6 = ((EventInternal)((Object)iterator)).getPseudonymousId();
        contentValues.put("pseudonymous_id", (String)object6);
        object6 = ((EventInternal)((Object)iterator)).getExperimentIdsClear();
        contentValues.put("experiment_ids_clear_blob", (byte[])object6);
        object6 = ((EventInternal)((Object)iterator)).getExperimentIdsEncrypted();
        contentValues.put("experiment_ids_encrypted_blob", (byte[])object6);
        object6 = null;
        long l3 = sQLiteDatabase.insert("events", null, contentValues);
        object5 = "event_id";
        if (n4 == 0) {
            double d2 = ((byte[])object3).length;
            double d5 = n3;
            d2 = Math.ceil(d2 / d5);
            n4 = (int)d2;
            while (n8 <= n4) {
                n7 = (n8 + -1) * n3;
                int n10 = n8 * n3;
                int n14 = ((byte[])object3).length;
                n10 = Math.min(n10, n14);
                object4 = Arrays.copyOfRange(object3, n7, n10);
                ContentValues contentValues2 = new ContentValues();
                Object object7 = l3;
                contentValues2.put((String)object5, (Long)object7);
                object7 = n8;
                String string2 = "sequence_num";
                contentValues2.put(string2, (Integer)object7);
                object7 = "bytes";
                contentValues2.put((String)object7, (byte[])object4);
                object4 = "event_payloads";
                sQLiteDatabase.insert((String)object4, null, contentValues2);
                ++n8;
            }
        }
        iterator = ((EventInternal)((Object)iterator)).getMetadata().entrySet().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = iterator.next();
            object3 = new ContentValues;
            object3();
            object2 = l3;
            object3.put((String)object5, (Long)object2);
            object2 = (String)object.getKey();
            object4 = "name";
            object3.put((String)object4, (String)object2);
            object = (String)object.getValue();
            object2 = "value";
            object3.put((String)object2, (String)object);
            object = "event_metadata";
            sQLiteDatabase.insert((String)object, null, (ContentValues)object3);
        }
        return l3;
    }

    private static /* synthetic */ byte[] lambda$readPayload$15(Cursor object) {
        int n3;
        byte[] byArray;
        int n4;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n7 = 0;
        while ((n4 = object.moveToNext()) != 0) {
            byArray = object.getBlob(0);
            arrayList.add(byArray);
            n4 = byArray.length;
            n7 += n4;
        }
        object = new byte[n7];
        n4 = 0;
        byArray = null;
        for (n7 = 0; n7 < (n3 = arrayList.size()); ++n7) {
            byte[] byArray2 = (byte[])arrayList.get(n7);
            int n8 = byArray2.length;
            System.arraycopy(byArray2, 0, object, n4, n8);
            n3 = byArray2.length;
            n4 += n3;
        }
        return object;
    }

    private /* synthetic */ Object lambda$recordFailure$3(Cursor cursor) {
        int n3;
        while ((n3 = cursor.moveToNext()) != 0) {
            n3 = cursor.getInt(0);
            int n4 = 1;
            String string2 = cursor.getString(n4);
            long l2 = n3;
            LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.MAX_RETRIES_REACHED;
            this.recordLogEventDropped(l2, logEventDropped$Reason, string2);
        }
        return null;
    }

    private /* synthetic */ Object lambda$recordFailure$4(String string2, String string3, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(string2).execute();
        string3 = sQLiteDatabase.rawQuery(string3, null);
        B b2 = new B(this);
        SQLiteEventStore.tryWithCursor((Cursor)string3, b2);
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    private static /* synthetic */ Boolean lambda$recordLogEventDropped$17(Cursor cursor) {
        int n3 = cursor.getCount();
        if (n3 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            cursor = null;
        }
        return n3 != 0;
    }

    private static /* synthetic */ Object lambda$recordLogEventDropped$18(String object, LogEventDropped$Reason object2, long l2, SQLiteDatabase sQLiteDatabase) {
        Object object3 = Integer.toString(((LogEventDropped$Reason)object2).getNumber());
        object3 = new String[]{object, object3};
        object3 = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", (String[])object3);
        d_0 d_02 = new Object();
        object3 = (Boolean)SQLiteEventStore.tryWithCursor((Cursor)object3, d_02);
        boolean bl2 = (Boolean)object3;
        d_02 = null;
        if (!bl2) {
            object3 = new ContentValues();
            String string2 = "log_source";
            object3.put(string2, (String)object);
            int n3 = ((LogEventDropped$Reason)object2).getNumber();
            object = n3;
            object3.put("reason", (Integer)object);
            object = l2;
            object2 = "events_dropped_count";
            object3.put((String)object2, (Long)object);
            object = "log_event_dropped";
            sQLiteDatabase.insert((String)object, null, (ContentValues)object3);
        } else {
            object3 = "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ";
            String string3 = " WHERE log_source = ? AND reason = ?";
            String string4 = Ov2.a(l2, (String)object3, string3);
            int n4 = ((LogEventDropped$Reason)object2).getNumber();
            object2 = Integer.toString(n4);
            object = new String[]{object, object2};
            sQLiteDatabase.execSQL(string4, object);
        }
        return null;
    }

    private static /* synthetic */ Object lambda$recordNextCallTime$7(long l2, TransportContext object, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        Object object2 = l2;
        contentValues.put("next_request_ms", (Long)object2);
        object2 = ((TransportContext)object).getBackendName();
        int n3 = PriorityMapping.toInt(((TransportContext)object).getPriority());
        String string2 = String.valueOf(n3);
        object2 = new String[]{object2, string2};
        string2 = "transport_contexts";
        String string3 = "backend_name = ? and priority = ?";
        int n4 = sQLiteDatabase.update(string2, contentValues, string3, object2);
        int n7 = 1;
        if (n4 < n7) {
            string3 = ((TransportContext)object).getBackendName();
            contentValues.put("backend_name", string3);
            n4 = PriorityMapping.toInt(((TransportContext)object).getPriority());
            object2 = n4;
            object = "priority";
            contentValues.put((String)object, (Integer)object2);
            sQLiteDatabase.insert(string2, null, contentValues);
        }
        return null;
    }

    private /* synthetic */ Object lambda$resetClientMetrics$23(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        CharSequence charSequence = new StringBuilder("UPDATE global_log_event_state SET last_metrics_upload_ms=");
        long l2 = this.wallClock.getTime();
        charSequence.append(l2);
        charSequence = charSequence.toString();
        sQLiteDatabase.compileStatement((String)charSequence).execute();
        return null;
    }

    private List loadEvents(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int n3) {
        ArrayList arrayList = new ArrayList();
        Object object = this.getTransportContextId(sQLiteDatabase, transportContext);
        if (object == null) {
            return arrayList;
        }
        String[] stringArray = new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"};
        object = ((Long)object).toString();
        String[] stringArray2 = new String[]{object};
        String string2 = String.valueOf(n3);
        object = sQLiteDatabase.query("events", stringArray, "context_id = ?", stringArray2, null, null, null, string2);
        b_0 b_02 = new b_0(this, arrayList, transportContext);
        SQLiteEventStore.tryWithCursor((Cursor)object, b_02);
        return arrayList;
    }

    private Map loadMetadata(SQLiteDatabase sQLiteDatabase, List object) {
        char c2;
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder("event_id IN (");
        for (char c3 = '\u0000'; c3 < (c2 = object.size()); ++c3) {
            PersistedEvent persistedEvent = (PersistedEvent)object.get(c3);
            long l2 = persistedEvent.getId();
            stringBuilder.append(l2);
            c2 = object.size() + -1;
            if (c3 >= c2) continue;
            c2 = ',';
            stringBuilder.append(c2);
        }
        stringBuilder.append(')');
        String[] stringArray = new String[]{"event_id", "name", "value"};
        String string2 = stringBuilder.toString();
        sQLiteDatabase = sQLiteDatabase.query("event_metadata", stringArray, string2, null, null, null, null);
        object = new j(hashMap);
        SQLiteEventStore.tryWithCursor((Cursor)sQLiteDatabase, (SQLiteEventStore$Function)object);
        return hashMap;
    }

    private static byte[] maybeBase64Decode(String string2) {
        if (string2 == null) {
            return null;
        }
        return Base64.decode((String)string2, (int)0);
    }

    public static /* synthetic */ Object n(SQLiteEventStore sQLiteEventStore, String string2, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$recordFailure$4(string2, "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", sQLiteDatabase);
    }

    public static /* synthetic */ Boolean p(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.lambda$hasPendingEventsFor$6(transportContext, sQLiteDatabase);
    }

    private void populateLogSourcesMetrics(ClientMetrics$Builder clientMetrics$Builder, Map object) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            LogSourceMetrics$Builder logSourceMetrics$Builder = LogSourceMetrics.newBuilder();
            String string2 = (String)object2.getKey();
            logSourceMetrics$Builder = logSourceMetrics$Builder.setLogSource(string2);
            object2 = (List)object2.getValue();
            object2 = logSourceMetrics$Builder.setLogEventDroppedList((List)object2).build();
            clientMetrics$Builder.addLogSourceMetrics((LogSourceMetrics)object2);
        }
    }

    private byte[] readPayload(long l2) {
        SQLiteDatabase sQLiteDatabase = this.getDb();
        String[] stringArray = new String[]{"bytes"};
        String string2 = String.valueOf(l2);
        String[] stringArray2 = new String[]{string2};
        string2 = sQLiteDatabase.query("event_payloads", stringArray, "event_id = ?", stringArray2, null, null, "sequence_num");
        o o3 = new Object();
        return (byte[])SQLiteEventStore.tryWithCursor((Cursor)string2, o3);
    }

    private Object retryIfDbLocked(SQLiteEventStore$Producer sQLiteEventStore$Producer, SQLiteEventStore$Function sQLiteEventStore$Function) {
        Clock clock = this.monotonicClock;
        long l2 = clock.getTime();
        while (true) {
            try {
                return sQLiteEventStore$Producer.produce();
            }
            catch (SQLiteDatabaseLockedException sQLiteDatabaseLockedException) {
                Clock clock2 = this.monotonicClock;
                long l3 = clock2.getTime();
                EventStoreConfig eventStoreConfig = this.config;
                int n3 = eventStoreConfig.getCriticalSectionEnterTimeoutMs();
                long l4 = (long)n3 + l2;
                long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l7 >= 0) {
                    return sQLiteEventStore$Function.apply((Object)sQLiteDatabaseLockedException);
                }
                long l8 = 50;
                SystemClock.sleep((long)l8);
                continue;
            }
            break;
        }
    }

    private static Encoding toEncoding(String string2) {
        if (string2 == null) {
            return PROTOBUF_ENCODING;
        }
        return Encoding.of(string2);
    }

    private static String toIdList(Iterable object) {
        char c2;
        Object object2 = "(";
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        object = object.iterator();
        while ((c2 = object.hasNext()) != '\u0000') {
            object2 = (PersistedEvent)object.next();
            long l2 = ((PersistedEvent)object2).getId();
            stringBuilder.append(l2);
            c2 = object.hasNext();
            if (c2 == '\u0000') continue;
            c2 = ',';
            stringBuilder.append(c2);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static Object tryWithCursor(Cursor cursor, SQLiteEventStore$Function object) {
        try {
            object = object.apply(cursor);
            return object;
        }
        finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object u(long l2, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$recordNextCallTime$7(l2, transportContext, sQLiteDatabase);
    }

    public static /* synthetic */ TimeWindow v0(long l2, SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$getTimeWindow$22(l2, sQLiteDatabase);
    }

    public static /* synthetic */ byte[] w(Cursor cursor) {
        return SQLiteEventStore.lambda$readPayload$15(cursor);
    }

    public static /* synthetic */ List z(SQLiteDatabase sQLiteDatabase) {
        return SQLiteEventStore.lambda$loadActiveContexts$10(sQLiteDatabase);
    }

    public int cleanUp() {
        long l2 = this.wallClock.getTime();
        long l3 = this.config.getEventCleanUpAge();
        k k2 = new k(this, l2 -= l3);
        return (Integer)this.inTransaction(k2);
    }

    public void clearDb() {
        x x5 = new Object();
        this.inTransaction(x5);
    }

    public void close() {
        this.schemaManager.close();
    }

    public long getByteSize() {
        long l2 = this.getPageCount();
        long l3 = this.getPageSize();
        return l2 * l3;
    }

    public SQLiteDatabase getDb() {
        Object object = this.schemaManager;
        Objects.requireNonNull(object);
        z z5 = new z((SchemaManager)((Object)object));
        object = new Object();
        return (SQLiteDatabase)this.retryIfDbLocked(z5, (SQLiteEventStore$Function)object);
    }

    public long getNextCallTime(TransportContext stringArray) {
        Object object = this.getDb();
        String string2 = stringArray.getBackendName();
        stringArray = String.valueOf(PriorityMapping.toInt(stringArray.getPriority()));
        stringArray = new String[]{string2, stringArray};
        stringArray = object.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", stringArray);
        object = new Object();
        return (Long)SQLiteEventStore.tryWithCursor((Cursor)stringArray, (SQLiteEventStore$Function)object);
    }

    public boolean hasPendingEventsFor(TransportContext transportContext) {
        f_0 f_02 = new f_0(this, transportContext);
        return (Boolean)this.inTransaction(f_02);
    }

    public Object inTransaction(SQLiteEventStore$Function object) {
        SQLiteDatabase sQLiteDatabase = this.getDb();
        sQLiteDatabase.beginTransaction();
        try {
            object = object.apply(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return object;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public Iterable loadActiveContexts() {
        p p2 = new Object();
        return (Iterable)this.inTransaction(p2);
    }

    public Iterable loadBatch(TransportContext transportContext) {
        y y5 = new y(this, transportContext);
        return (Iterable)this.inTransaction(y5);
    }

    public ClientMetrics loadClientMetrics() {
        ClientMetrics$Builder clientMetrics$Builder = ClientMetrics.newBuilder();
        HashMap hashMap = new HashMap();
        a_0 a_02 = new a_0(this, hashMap, clientMetrics$Builder);
        return (ClientMetrics)this.inTransaction(a_02);
    }

    public PersistedEvent persist(TransportContext transportContext, EventInternal eventInternal) {
        Object object = transportContext.getPriority();
        String string2 = eventInternal.getTransportName();
        String string3 = transportContext.getBackendName();
        int n3 = 3;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = string2;
        int n4 = 2;
        objectArray[n4] = string3;
        string2 = "Storing event with priority=%s, name=%s for destination %s";
        Logging.d(LOG_TAG, string2, objectArray);
        object = new e_0(this, eventInternal, transportContext);
        object = (Long)this.inTransaction((SQLiteEventStore$Function)object);
        long l2 = (Long)object;
        long l3 = 1L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 < 0) {
            return null;
        }
        return PersistedEvent.create(l2, transportContext, eventInternal);
    }

    public void recordFailure(Iterable object) {
        Iterator iterator = object.iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return;
        }
        iterator = new StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        object = SQLiteEventStore.toIdList((Iterable)object);
        ((StringBuilder)((Object)iterator)).append((String)object);
        object = ((StringBuilder)((Object)iterator)).toString();
        iterator = new l(this, (String)object);
        this.inTransaction((SQLiteEventStore$Function)((Object)iterator));
    }

    public void recordLogEventDropped(long l2, LogEventDropped$Reason logEventDropped$Reason, String string2) {
        m m2 = new m(l2, logEventDropped$Reason, string2);
        this.inTransaction(m2);
    }

    public void recordNextCallTime(TransportContext transportContext, long l2) {
        h_0 h_02 = new h_0(transportContext, l2);
        this.inTransaction(h_02);
    }

    public void recordSuccess(Iterable object) {
        Iterator iterator = object.iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            return;
        }
        iterator = new StringBuilder("DELETE FROM events WHERE _id in ");
        object = SQLiteEventStore.toIdList((Iterable)object);
        ((StringBuilder)((Object)iterator)).append((String)object);
        object = ((StringBuilder)((Object)iterator)).toString();
        this.getDb().compileStatement((String)object).execute();
    }

    public void resetClientMetrics() {
        i_0 i_02 = new i_0(this);
        this.inTransaction(i_02);
    }

    public Object runCriticalSection(SynchronizationGuard$CriticalSection object) {
        SQLiteDatabase sQLiteDatabase = this.getDb();
        this.ensureBeginTransaction(sQLiteDatabase);
        try {
            object = object.execute();
            sQLiteDatabase.setTransactionSuccessful();
            return object;
        }
        finally {
            sQLiteDatabase.endTransaction();
        }
    }
}

