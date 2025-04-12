/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.os.CancellationSignal
 *  android.os.Looper
 */
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.room.c;
import java.lang.constant.Constable;
import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public abstract class FP2 {
    public static final FP2$c Companion;
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private Yr autoCloser;
    private Map autoMigrationSpecs;
    private final Map backingFieldMap;
    private yg3_1 internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;
    private final c invalidationTracker;
    protected List mCallbacks;
    protected volatile xg3_1 mDatabase;
    private final ReentrantReadWriteLock readWriteLock;
    private final ThreadLocal suspendingTransactionId;
    private final Map typeConverters;
    private boolean writeAheadLoggingEnabled;

    static {
        FP2$c fP2$c;
        Companion = fP2$c = new Object();
    }

    public FP2() {
        LinkedHashMap linkedHashMap = this.createInvalidationTracker();
        this.invalidationTracker = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        this.autoMigrationSpecs = linkedHashMap;
        this.readWriteLock = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        this.suspendingTransactionId = linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        linkedHashMap = Collections.synchronizedMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(linkedHashMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = linkedHashMap;
        this.typeConverters = linkedHashMap = new LinkedHashMap();
    }

    public static final /* synthetic */ void access$internalBeginTransaction(FP2 fP2) {
        fP2.internalBeginTransaction();
    }

    public static final /* synthetic */ void access$internalEndTransaction(FP2 fP2) {
        fP2.internalEndTransaction();
    }

    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    public static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        this.assertNotMainThread();
        xg3_1 xg3_12 = this.getOpenHelper().getWritableDatabase();
        c c2 = this.getInvalidationTracker();
        c2.g(xg3_12);
        boolean bl2 = xg3_12.B0();
        if (bl2) {
            xg3_12.B();
        } else {
            xg3_12.i();
        }
    }

    private final void internalEndTransaction() {
        Object object = this.getOpenHelper().getWritableDatabase();
        object.F();
        boolean bl2 = this.inTransaction();
        if (!bl2) {
            object = this.getInvalidationTracker();
            Object object2 = ((c)object).f;
            boolean bl3 = true;
            boolean bl4 = ((AtomicBoolean)object2).compareAndSet(false, bl3);
            if (bl4) {
                object2 = ((c)object).a.getQueryExecutor();
                object = ((c)object).n;
                object2.execute((Runnable)object);
            }
        }
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(FP2 object, ag3_0 ag3_02, CancellationSignal cancellationSignal, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 2) != 0) {
                cancellationSignal = null;
            }
            return ((FP2)object).query(ag3_02, cancellationSignal);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        throw object;
    }

    private final Object unwrapOpenHelper(Class object, yg3_1 yg3_12) {
        boolean bl2 = ((Class)object).isInstance(yg3_12);
        if (bl2) {
            return yg3_12;
        }
        bl2 = yg3_12 instanceof no0;
        if (bl2) {
            yg3_12 = ((no0)((Object)yg3_12)).getDelegate();
            object = this.unwrapOpenHelper((Class)object, yg3_12);
        } else {
            object = null;
        }
        return object;
    }

    public void assertNotMainThread() {
        boolean bl2 = this.allowMainThreadQueries;
        if (bl2) {
            return;
        }
        bl2 = this.isMainThread$room_runtime_release() ^ true;
        if (bl2) {
            return;
        }
        String string2 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public void assertNotSuspendingTransaction() {
        Object object;
        boolean bl2 = this.inTransaction();
        if (!bl2 && (object = this.suspendingTransactionId.get()) != null) {
            String string2 = "Cannot access database on a different coroutine context inherited from a suspending transaction.".toString();
            object = new Object(string2);
            throw object;
        }
    }

    public void beginTransaction() {
        this.assertNotMainThread();
        this.internalBeginTransaction();
    }

    public abstract void clearAllTables();

    public void close() {
        boolean bl2 = this.isOpen();
        if (bl2) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            Object object = "readWriteLock.writeLock()";
            Intrinsics.checkNotNullExpressionValue(writeLock, (String)object);
            writeLock.lock();
            try {
                object = this.getInvalidationTracker();
                object.getClass();
                object.getClass();
                object = this.getOpenHelper();
                object.close();
            }
            finally {
                writeLock.unlock();
            }
        }
    }

    public bg3_0 compileStatement(String string2) {
        Intrinsics.checkNotNullParameter(string2, "sql");
        this.assertNotMainThread();
        this.assertNotSuspendingTransaction();
        return this.getOpenHelper().getWritableDatabase().e0(string2);
    }

    public abstract c createInvalidationTracker();

    public abstract yg3_1 createOpenHelper(yi0_0 var1);

    public void endTransaction() {
        this.internalEndTransaction();
    }

    public final Map getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public List getAutoMigrations(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "autoMigrationSpecs");
        return mz0_2.a;
    }

    public final Map getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    public c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public yg3_1 getOpenHelper() {
        yg3_1 yg3_12 = this.internalOpenHelper;
        if (yg3_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalOpenHelper");
            yg3_12 = null;
        }
        return yg3_12;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
            executor = null;
        }
        return executor;
    }

    public Set getRequiredAutoMigrationSpecs() {
        return vz0_2.a;
    }

    public Map getRequiredTypeConverters() {
        return fh1_2.f();
    }

    public final ThreadLocal getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
            executor = null;
        }
        return executor;
    }

    public Object getTypeConverter(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "klass");
        return this.typeConverters.get(clazz);
    }

    public boolean inTransaction() {
        return this.getOpenHelper().getWritableDatabase().z0();
    }

    /*
     * WARNING - void declaration
     */
    public void init(yi0_0 object) {
        boolean bl2;
        Object object2;
        Constable constable;
        int n3;
        Object object3;
        int n4;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n8;
        StringBuilder stringBuilder;
        boolean bl5;
        int n10;
        block27: {
            boolean bl4;
            n10 = 1;
            bl5 = false;
            stringBuilder = null;
            n8 = -1;
            Intrinsics.checkNotNullParameter(object, "configuration");
            object7 = this.createOpenHelper((yi0_0)object);
            this.internalOpenHelper = object7;
            object7 = this.getRequiredAutoMigrationSpecs();
            object6 = new BitSet();
            object7 = object7.iterator();
            while (bl4 = object7.hasNext()) {
                block26: {
                    object5 = (Class)object7.next();
                    object4 = ((yi0_0)object).n;
                    n4 = object4.size() + n8;
                    object3 = ((yi0_0)object).n;
                    if (n4 >= 0) {
                        while (true) {
                            n3 = n4 + -1;
                            constable = object3.get(n4).getClass();
                            boolean bl3 = ((Class)object5).isAssignableFrom((Class<?>)constable);
                            if (bl3) {
                                ((BitSet)object6).set(n4);
                                break block26;
                            }
                            if (n3 < 0) break;
                            n4 = n3;
                        }
                    }
                    n4 = -1;
                }
                if (n4 >= 0) {
                    object2 = this.autoMigrationSpecs;
                    object4 = object3.get(n4);
                    object2.put(object5, object4);
                    continue;
                }
                object = new StringBuilder("A required auto migration spec (");
                Object object8 = ((Class)object5).getCanonicalName();
                ((StringBuilder)object).append((String)object8);
                ((StringBuilder)object).append(") is missing in the database configuration.");
                object = ((StringBuilder)object).toString();
                object = object.toString();
                object8 = new IllegalArgumentException((String)object);
                throw object8;
            }
            object7 = ((yi0_0)object).n;
            int n7 = object7.size() + n8;
            if (n7 >= 0) {
                while (true) {
                    boolean bl6;
                    void var8_9 = bl6 + -1;
                    if (!(bl6 = ((BitSet)object6).get(bl6 ? 1 : 0))) break;
                    if (var8_9 >= 0) {
                        bl6 = var8_9;
                        continue;
                    }
                    break block27;
                    break;
                }
                String string2 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString();
                object = new IllegalArgumentException(string2);
                throw object;
            }
        }
        object7 = this.autoMigrationSpecs;
        object7 = this.getAutoMigrations((Map)object7).iterator();
        while (bl2 = object7.hasNext()) {
            object6 = (XO1)object7.next();
            int n14 = ((XO1)object6).startVersion;
            n4 = ((XO1)object6).endVersion;
            object3 = ((yi0_0)object).d;
            object2 = ((FP2$e)object3).a;
            constable = n14;
            boolean bl7 = object2.containsKey(constable);
            if (bl7) {
                object5 = n14;
                if ((object5 = (Map)((LinkedHashMap)object2).get(object5)) == null) {
                    object5 = fh1_2.f();
                }
                object4 = n4;
                n14 = object5.containsKey(object4) ? 1 : 0;
            } else {
                n14 = 0;
                object5 = null;
            }
            if (n14 != 0) continue;
            object5 = new XO1[n10];
            object5[0] = object6;
            ((FP2$e)object3).a((XO1[])object5);
        }
        object6 = this.getOpenHelper();
        object7 = (pR2)this.unwrapOpenHelper(pR2.class, (yg3_1)object6);
        if (object7 != null) {
            object7 = "databaseConfiguration";
            Intrinsics.checkNotNullParameter(object, (String)object7);
        }
        if ((object7 = (zr_0)this.unwrapOpenHelper(zr_0.class, (yg3_1)(object6 = this.getOpenHelper()))) == null) {
            block30: {
                block28: {
                    void var18_30;
                    object6 = ((yi0_0)object).g;
                    object7 = FP2$d.WRITE_AHEAD_LOGGING;
                    if (object6 == object7) {
                        boolean bl8 = true;
                    } else {
                        boolean bl9 = false;
                        object7 = null;
                    }
                    this.getOpenHelper().setWriteAheadLoggingEnabled((boolean)var18_30);
                    object6 = ((yi0_0)object).e;
                    this.mCallbacks = object6;
                    object6 = ((yi0_0)object).h;
                    this.internalQueryExecutor = object6;
                    object5 = ((yi0_0)object).i;
                    object6 = new mq3((Executor)object5);
                    this.internalTransactionExecutor = object6;
                    this.allowMainThreadQueries = bl2 = ((yi0_0)object).f;
                    this.writeAheadLoggingEnabled = var18_30;
                    object7 = this.getRequiredTypeConverters();
                    object6 = new BitSet();
                    object7 = object7.entrySet().iterator();
                    block4: while (true) {
                        boolean bl10 = object7.hasNext();
                        object4 = ((yi0_0)object).m;
                        if (!bl10) break block28;
                        object5 = (Map.Entry)object7.next();
                        object3 = (Class)object5.getKey();
                        object5 = ((List)object5.getValue()).iterator();
                        while (true) {
                            Map map2;
                            int n15;
                            int n16;
                            block29: {
                                if ((n3 = (int)(object5.hasNext() ? 1 : 0)) == 0) continue block4;
                                object2 = (Class)object5.next();
                                n16 = object4.size() + n8;
                                if (n16 >= 0) {
                                    while (true) {
                                        n15 = n16 + -1;
                                        Class<?> clazz = object4.get(n16).getClass();
                                        boolean bl11 = ((Class)object2).isAssignableFrom(clazz);
                                        if (bl11) {
                                            ((BitSet)object6).set(n16);
                                            break block29;
                                        }
                                        if (n15 < 0) break;
                                        n16 = n15;
                                    }
                                }
                                n16 = -1;
                            }
                            if (n16 >= 0) {
                                n15 = 1;
                            } else {
                                n15 = 0;
                                map2 = null;
                            }
                            if (n15 == 0) break block4;
                            map2 = this.typeConverters;
                            constable = object4.get(n16);
                            map2.put(object2, constable);
                        }
                        break;
                    }
                    object = new StringBuilder("A required type converter (");
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append(") for ");
                    Object object9 = ((Class)object3).getCanonicalName();
                    ((StringBuilder)object).append((String)object9);
                    ((StringBuilder)object).append(" is missing in the database configuration.");
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object9 = new IllegalArgumentException((String)object);
                    throw object9;
                }
                int n17 = object4.size() + n8;
                if (n17 >= 0) {
                    while (true) {
                        n10 = n17 + -1;
                        bl5 = ((BitSet)object6).get(n17);
                        if (!bl5) break;
                        if (n10 >= 0) {
                            n17 = n10;
                            continue;
                        }
                        break block30;
                        break;
                    }
                    object = object4.get(n17);
                    stringBuilder = new StringBuilder("Unexpected type converter ");
                    stringBuilder.append(object);
                    stringBuilder.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    object = stringBuilder.toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                    throw illegalArgumentException;
                }
            }
            return;
        }
        this.getInvalidationTracker().getClass();
        Intrinsics.checkNotNullParameter(null, "autoCloser");
        throw null;
    }

    public void internalInitInvalidationTracker(xg3_1 object) {
        Intrinsics.checkNotNullParameter(object, "db");
        c c2 = this.getInvalidationTracker();
        c2.getClass();
        Intrinsics.checkNotNullParameter(object, "database");
        Object object2 = c2.m;
        synchronized (object2) {
            block12: {
                boolean bl2;
                block11: {
                    boolean bl3 = c2.g;
                    if (!bl3) break block11;
                    break block12;
                }
                String string2 = "PRAGMA temp_store = MEMORY;";
                object.o(string2);
                string2 = "PRAGMA recursive_triggers='ON';";
                object.o(string2);
                string2 = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
                object.o(string2);
                c2.g((xg3_1)object);
                string2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
                object = object.e0(string2);
                c2.h = object;
                c2.g = bl2 = true;
                object = Unit.a;
            }
            return;
            finally {
            }
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        boolean bl2;
        Thread thread2;
        Thread thread3 = Looper.getMainLooper().getThread();
        if (thread3 == (thread2 = Thread.currentThread())) {
            bl2 = true;
        } else {
            bl2 = false;
            thread3 = null;
        }
        return bl2;
    }

    public boolean isOpen() {
        Object object = this.mDatabase;
        if (object != null) {
            boolean bl2 = object.isOpen();
            object = bl2;
        } else {
            boolean bl3 = false;
            object = null;
        }
        Boolean bl4 = Boolean.TRUE;
        return Intrinsics.areEqual(object, bl4);
    }

    public final boolean isOpenInternal() {
        boolean bl2;
        boolean bl3;
        xg3_1 xg3_12 = this.mDatabase;
        boolean bl4 = false;
        if (xg3_12 != null && (bl3 = xg3_12.isOpen()) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public final Cursor query(ag3_0 ag3_02) {
        Intrinsics.checkNotNullParameter(ag3_02, "query");
        return FP2.query$default(this, ag3_02, null, 2, null);
    }

    public Cursor query(ag3_0 ag3_02, CancellationSignal object) {
        Object object2 = "query";
        Intrinsics.checkNotNullParameter(ag3_02, (String)object2);
        this.assertNotMainThread();
        this.assertNotSuspendingTransaction();
        if (object != null) {
            object2 = this.getOpenHelper().getWritableDatabase();
            ag3_02 = object2.o0(ag3_02, (CancellationSignal)object);
        } else {
            object = this.getOpenHelper().getWritableDatabase();
            ag3_02 = object.j(ag3_02);
        }
        return ag3_02;
    }

    public Cursor query(String string2, Object[] objectArray) {
        Intrinsics.checkNotNullParameter(string2, "query");
        xg3_1 xg3_12 = this.getOpenHelper().getWritableDatabase();
        C53 c53 = new C53(string2, objectArray);
        return xg3_12.j(c53);
    }

    public Object runInTransaction(Callable callable) {
        String string2 = "body";
        Intrinsics.checkNotNullParameter(callable, string2);
        this.beginTransaction();
        try {
            callable = callable.call();
            this.setTransactionSuccessful();
            return callable;
        }
        finally {
            this.endTransaction();
        }
    }

    public void runInTransaction(Runnable runnable2) {
        String string2 = "body";
        Intrinsics.checkNotNullParameter(runnable2, string2);
        this.beginTransaction();
        try {
            runnable2.run();
            this.setTransactionSuccessful();
            return;
        }
        finally {
            this.endTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "<set-?>");
        this.autoMigrationSpecs = map2;
    }

    public void setTransactionSuccessful() {
        this.getOpenHelper().getWritableDatabase().y();
    }
}

