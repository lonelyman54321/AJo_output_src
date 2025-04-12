/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace$1;
import com.google.firebase.perf.metrics.Trace$2;
import com.google.firebase.perf.metrics.TraceMetricBuilder;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Trace
extends AppStateUpdateHandler
implements Parcelable,
FirebasePerformanceAttributable,
SessionAwareObject {
    public static final Parcelable.Creator CREATOR;
    static final Parcelable.Creator CREATOR_DATAONLY;
    private static final AndroidLogger logger;
    private static final Map traceNameToTraceMap;
    private final Clock clock;
    private final Map counterNameToCounterMap;
    private final Map customAttributesMap;
    private Timer endTime;
    private final GaugeManager gaugeManager;
    private final String name;
    private final Trace parent;
    private final WeakReference sessionAwareObject;
    private final List sessions;
    private Timer startTime;
    private final List subtraces;
    private final TransportManager transportManager;

    static {
        logger = AndroidLogger.getInstance();
        Object object = new ConcurrentHashMap();
        traceNameToTraceMap = object;
        object = new Trace$1();
        CREATOR = object;
        object = new Trace$2();
        CREATOR_DATAONLY = object;
    }

    private Trace(Parcel object, boolean bl2) {
        Object object2 = bl2 ? null : AppStateMonitor.getInstance();
        super((AppStateMonitor)object2);
        object2 = new Object(this);
        this.sessionAwareObject = object2;
        object2 = Trace.class;
        Object object3 = ((Class)object2).getClassLoader();
        this.parent = object3 = (Trace)object.readParcelable((ClassLoader)object3);
        this.name = object3 = object.readString();
        object3 = new ArrayList();
        this.subtraces = object3;
        object2 = ((Class)object2).getClassLoader();
        object.readList(object3, (ClassLoader)object2);
        object2 = new Object();
        this.counterNameToCounterMap = object2;
        super();
        this.customAttributesMap = object3;
        object3 = Counter.class.getClassLoader();
        object.readMap(object2, (ClassLoader)object3);
        object2 = Timer.class;
        object3 = ((Class)object2).getClassLoader();
        this.startTime = object3 = (Timer)object.readParcelable((ClassLoader)object3);
        object2 = ((Class)object2).getClassLoader();
        object2 = (Timer)object.readParcelable((ClassLoader)object2);
        this.endTime = object2;
        object2 = new Object();
        this.sessions = object2 = Collections.synchronizedList(object2);
        object3 = PerfSession.class.getClassLoader();
        object.readList(object2, (ClassLoader)object3);
        if (bl2) {
            this.transportManager = null;
            this.clock = null;
            this.gaugeManager = null;
        } else {
            object = TransportManager.getInstance();
            this.transportManager = object;
            super();
            this.clock = object;
            object = GaugeManager.getInstance();
            this.gaugeManager = object;
        }
    }

    public /* synthetic */ Trace(Parcel parcel, boolean bl2, Trace$1 trace$1) {
        this(parcel, bl2);
    }

    private Trace(Trace object, String list, Timer timer, Timer timer2, List list2, Map map2, Map map3) {
        WeakReference<Trace> weakReference;
        this.sessionAwareObject = weakReference = new WeakReference<Trace>(this);
        this.parent = object;
        list = ((String)((Object)list)).trim();
        this.name = list;
        this.startTime = timer;
        this.endTime = timer2;
        if (list2 == null) {
        }
        this.subtraces = list2;
        if (map2 == null) {
            super();
        }
        this.counterNameToCounterMap = map2;
        if (map3 == null) {
            super();
        }
        this.customAttributesMap = map3;
        list = ((Trace)object).clock;
        this.clock = list;
        list = ((Trace)object).transportManager;
        this.transportManager = list;
        list = new List();
        this.sessions = list = Collections.synchronizedList(list);
        this.gaugeManager = object = ((Trace)object).gaugeManager;
    }

    private Trace(String string2) {
        TransportManager transportManager = TransportManager.getInstance();
        Clock clock = new Clock();
        AppStateMonitor appStateMonitor = AppStateMonitor.getInstance();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this(string2, transportManager, clock, appStateMonitor, gaugeManager);
    }

    public Trace(String string2, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this(string2, transportManager, clock, appStateMonitor, gaugeManager);
    }

    public Trace(String list, TransportManager transportManager, Clock clock, AppStateMonitor weakReference, GaugeManager gaugeManager) {
        super((AppStateMonitor)((Object)weakReference));
        this.sessionAwareObject = weakReference = new WeakReference<Trace>(this);
        this.parent = null;
        list = ((String)((Object)list)).trim();
        this.name = list;
        list = new List();
        this.subtraces = list;
        super();
        this.counterNameToCounterMap = list;
        super();
        this.customAttributesMap = list;
        this.clock = clock;
        this.transportManager = transportManager;
        list = new List();
        this.sessions = list = Collections.synchronizedList(list);
        this.gaugeManager = gaugeManager;
    }

    private void checkAttribute(String object, String object2) {
        int n3 = this.isStopped();
        if (n3 == 0) {
            int n4;
            Map map2 = this.customAttributesMap;
            n3 = map2.containsKey(object);
            if (n3 == 0 && (n3 = (map2 = this.customAttributesMap).size()) >= (n4 = 5)) {
                object2 = Locale.ENGLISH;
                object = new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                throw object;
            }
            PerfMetricValidator.validateAttribute((String)object, (String)object2);
            return;
        }
        object2 = Locale.ENGLISH;
        object2 = this.name;
        object2 = cP.a("Trace '", (String)object2, "' has been stopped");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static Trace create(String string2) {
        Trace trace = new Trace(string2);
        return trace;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Trace getTrace(String string2) {
        Class<Trace> clazz = Trace.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        Map map2 = traceNameToTraceMap;
                        object = map2.get(string2);
                        object = (Trace)object;
                        if (object != null) break block4;
                        object = new Object(string2);
                        map2.put(string2, object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Trace getTrace(String string2, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
        Class<Trace> clazz = Trace.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        Map map2 = traceNameToTraceMap;
                        object = map2.get(string2);
                        object = (Trace)object;
                        if (object != null) break block4;
                        GaugeManager gaugeManager = GaugeManager.getInstance();
                        object = new Object(string2, transportManager, clock, appStateMonitor, gaugeManager);
                        map2.put(string2, object);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    private Counter obtainOrCreateCounterByName(String string2) {
        Counter counter = (Counter)this.counterNameToCounterMap.get(string2);
        if (counter == null) {
            counter = new Counter(string2);
            Map map2 = this.counterNameToCounterMap;
            map2.put(string2, counter);
        }
        return counter;
    }

    private void setEndTimeOfLastStage(Timer timer) {
        Object object = this.subtraces;
        int n3 = object.isEmpty();
        if (n3 != 0) {
            return;
        }
        n3 = this.subtraces.size() + -1;
        object = (Trace)this.subtraces.get(n3);
        Timer timer2 = ((Trace)object).endTime;
        if (timer2 == null) {
            ((Trace)object).endTime = timer;
        }
    }

    public static Trace startTrace(String object) {
        Map map2 = traceNameToTraceMap;
        if ((object = (Trace)map2.get(object)) != null) {
            ((Trace)object).start();
        }
        return object;
    }

    public static Trace stopTrace(String string2) {
        Map map2 = traceNameToTraceMap;
        Trace trace = (Trace)map2.get(string2);
        if (trace != null) {
            trace.stop();
            map2.remove(string2);
        }
        return trace;
    }

    public int describeContents() {
        return 0;
    }

    public void finalize() {
        Throwable throwable2;
        block9: {
            block8: {
                int n3 = 1;
                try {
                    boolean bl2 = this.isActive();
                    if (!bl2) break block8;
                }
                catch (Throwable throwable2) {}
                AndroidLogger androidLogger = logger;
                String string2 = "Trace '%s' is started but not stopped when it is destructed!";
                String string3 = this.name;
                Object[] objectArray = new Object[n3];
                objectArray[0] = string3;
                androidLogger.warn(string2, objectArray);
                this.incrementTsnsCount(n3);
                break block9;
            }
            super.finalize();
            return;
        }
        super.finalize();
        throw throwable2;
    }

    public String getAttribute(String string2) {
        return (String)this.customAttributesMap.get(string2);
    }

    public Map getAttributes() {
        Map map2 = this.customAttributesMap;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public Map getCounters() {
        return this.counterNameToCounterMap;
    }

    public Timer getEndTime() {
        return this.endTime;
    }

    public long getLongMetric(String object) {
        if (object != null) {
            Map map2 = this.counterNameToCounterMap;
            object = ((String)object).trim();
            object = (Counter)map2.get(object);
        } else {
            object = null;
        }
        if (object == null) {
            return 0L;
        }
        return ((Counter)object).getCount();
    }

    public String getName() {
        return this.name;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List getSessions() {
        List list = this.sessions;
        synchronized (list) {
            try {
                List list2 = new List();
                Object object = this.sessions;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        return Collections.unmodifiableList(list2);
                    }
                    Object object2 = object.next();
                    if ((object2 = (PerfSession)object2) == null) continue;
                    ((ArrayList)list2).add(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public Timer getStartTime() {
        return this.startTime;
    }

    public List getSubtraces() {
        return this.subtraces;
    }

    public boolean hasStarted() {
        boolean bl2;
        Timer timer = this.startTime;
        if (timer != null) {
            bl2 = true;
        } else {
            bl2 = false;
            timer = null;
        }
        return bl2;
    }

    public void incrementMetric(String string2, long l2) {
        int n3 = 1;
        int n4 = 2;
        Object object = PerfMetricValidator.validateMetricName(string2);
        if (object != null) {
            AndroidLogger androidLogger = logger;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = object;
            androidLogger.error("Cannot increment metric '%s'. Metric name is invalid.(%s)", objectArray);
            return;
        }
        boolean bl2 = this.hasStarted();
        if (!bl2) {
            AndroidLogger androidLogger = logger;
            String string3 = this.name;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = string3;
            androidLogger.warn("Cannot increment metric '%s' for trace '%s' because it's not started", objectArray);
            return;
        }
        bl2 = this.isStopped();
        if (bl2) {
            AndroidLogger androidLogger = logger;
            String string4 = this.name;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = string4;
            androidLogger.warn("Cannot increment metric '%s' for trace '%s' because it's been stopped", objectArray);
            return;
        }
        object = string2.trim();
        object = this.obtainOrCreateCounterByName((String)object);
        ((Counter)object).increment(l2);
        AndroidLogger androidLogger = logger;
        Long l3 = ((Counter)object).getCount();
        object = this.name;
        Object[] objectArray = new Object[3];
        objectArray[0] = string2;
        objectArray[n3] = l3;
        objectArray[n4] = object;
        androidLogger.debug("Incrementing metric '%s' to %d on trace '%s'", objectArray);
    }

    public boolean isActive() {
        boolean bl2 = this.hasStarted();
        bl2 = bl2 && !(bl2 = this.isStopped());
        return bl2;
    }

    public boolean isStopped() {
        boolean bl2;
        Timer timer = this.endTime;
        if (timer != null) {
            bl2 = true;
        } else {
            bl2 = false;
            timer = null;
        }
        return bl2;
    }

    public void putAttribute(String string2, String string3) {
        Object object;
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        string2 = string2.trim();
        string3 = string3.trim();
        this.checkAttribute(string2, string3);
        AndroidLogger androidLogger = logger;
        Object object2 = "Setting attribute '%s' to '%s' on trace '%s'";
        String string4 = this.name;
        Object[] objectArray = new Object[n4];
        objectArray[0] = string2;
        objectArray[n7] = string3;
        objectArray[n3] = string4;
        try {
            androidLogger.debug((String)object2, objectArray);
        }
        catch (Exception exception) {
            object2 = logger;
            String string5 = exception.getMessage();
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = string2;
            objectArray2[n7] = string3;
            objectArray2[n3] = string5;
            object = "Can not set attribute '%s' with value '%s' (%s)";
            ((AndroidLogger)object2).error((String)object, objectArray2);
            n7 = 0;
        }
        if (n7 != 0) {
            object = this.customAttributesMap;
            object.put(string2, string3);
        }
    }

    public void putMetric(String string2, long l2) {
        int n3 = 1;
        int n4 = 2;
        Object object = PerfMetricValidator.validateMetricName(string2);
        if (object != null) {
            AndroidLogger androidLogger = logger;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = object;
            androidLogger.error("Cannot set value for metric '%s'. Metric name is invalid.(%s)", objectArray);
            return;
        }
        boolean bl2 = this.hasStarted();
        if (!bl2) {
            AndroidLogger androidLogger = logger;
            String string3 = this.name;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = string3;
            androidLogger.warn("Cannot set value for metric '%s' for trace '%s' because it's not started", objectArray);
            return;
        }
        bl2 = this.isStopped();
        if (bl2) {
            AndroidLogger androidLogger = logger;
            String string4 = this.name;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = string4;
            androidLogger.warn("Cannot set value for metric '%s' for trace '%s' because it's been stopped", objectArray);
            return;
        }
        object = string2.trim();
        this.obtainOrCreateCounterByName((String)object).setCount(l2);
        object = logger;
        Long l3 = l2;
        String string5 = this.name;
        Object[] objectArray = new Object[3];
        objectArray[0] = string2;
        objectArray[n3] = l3;
        objectArray[n4] = string5;
        ((AndroidLogger)object).debug("Setting metric '%s' to '%s' on trace '%s'", objectArray);
    }

    public void removeAttribute(String string2) {
        boolean bl2 = this.isStopped();
        if (bl2) {
            logger.error("Can't remove a attribute from a Trace that's stopped.");
            return;
        }
        this.customAttributesMap.remove(string2);
    }

    public void start() {
        int n3 = 1;
        boolean bl2 = false;
        Object object = null;
        Object object2 = ConfigResolver.getInstance();
        boolean bl3 = ((ConfigResolver)object2).isPerformanceMonitoringEnabled();
        if (!bl3) {
            logger.debug("Trace feature is disabled.");
            return;
        }
        object2 = PerfMetricValidator.validateTraceName(this.name);
        if (object2 != null) {
            AndroidLogger androidLogger = logger;
            String string2 = this.name;
            Object[] objectArray = new Object[2];
            objectArray[0] = string2;
            objectArray[n3] = object2;
            androidLogger.error("Cannot start trace '%s'. Trace name is invalid.(%s)", objectArray);
            return;
        }
        object2 = this.startTime;
        if (object2 != null) {
            object2 = logger;
            String string3 = this.name;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            ((AndroidLogger)object2).error("Trace '%s' has already started, should not start again!", objectArray);
            return;
        }
        Object object3 = this.clock.getTime();
        this.startTime = object3;
        this.registerForAppState();
        object3 = SessionManager.getInstance().perfSession();
        object = SessionManager.getInstance();
        object2 = this.sessionAwareObject;
        ((SessionManager)object).registerForSessionUpdates((WeakReference)object2);
        this.updateSession((PerfSession)object3);
        bl2 = ((PerfSession)object3).isGaugeAndEventCollectionEnabled();
        if (bl2) {
            object = this.gaugeManager;
            object3 = ((PerfSession)object3).getTimer();
            ((GaugeManager)object).collectGaugeMetricOnce((Timer)object3);
        }
    }

    public void startStage(String string2) {
        Timer timer = this.clock.getTime();
        this.setEndTimeOfLastStage(timer);
        List list = this.subtraces;
        Trace trace = new Trace(this, string2, timer, null, null, null, null);
        list.add(trace);
    }

    public void stop() {
        boolean bl2 = false;
        Object object = null;
        int n3 = 1;
        boolean bl3 = this.hasStarted();
        if (!bl3) {
            AndroidLogger androidLogger = logger;
            String string2 = this.name;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            androidLogger.error("Trace '%s' has not been started so unable to stop!", objectArray);
            return;
        }
        bl3 = this.isStopped();
        if (bl3) {
            AndroidLogger androidLogger = logger;
            String string3 = this.name;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            androidLogger.error("Trace '%s' has already stopped, should not stop again!", objectArray);
            return;
        }
        object = SessionManager.getInstance();
        Object object2 = this.sessionAwareObject;
        ((SessionManager)object).unregisterForSessionUpdates((WeakReference)object2);
        this.unregisterForAppState();
        this.endTime = object = this.clock.getTime();
        object2 = this.parent;
        if (object2 == null) {
            this.setEndTimeOfLastStage((Timer)object);
            object = this.name;
            bl2 = ((String)object).isEmpty();
            if (!bl2) {
                object = this.transportManager;
                object2 = new TraceMetricBuilder(this);
                object2 = ((TraceMetricBuilder)object2).build();
                ApplicationProcessState applicationProcessState = this.getAppState();
                ((TransportManager)object).log((TraceMetric)object2, applicationProcessState);
                object = SessionManager.getInstance().perfSession();
                bl2 = ((PerfSession)object).isGaugeAndEventCollectionEnabled();
                if (bl2) {
                    object = this.gaugeManager;
                    object2 = SessionManager.getInstance().perfSession().getTimer();
                    ((GaugeManager)object).collectGaugeMetricOnce((Timer)object2);
                }
            } else {
                object = logger;
                object2 = "Trace name is empty, no log is sent to server";
                ((AndroidLogger)object).error((String)object2);
            }
        }
    }

    public void stopStage() {
        Timer timer = this.clock.getTime();
        this.setEndTimeOfLastStage(timer);
    }

    public void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            logger.warn("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        boolean bl2 = this.hasStarted();
        if (bl2 && !(bl2 = this.isStopped())) {
            List list = this.sessions;
            list.add(perfSession);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.parent;
        List list = null;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.name;
        parcel.writeString((String)object);
        object = this.subtraces;
        parcel.writeList((List)object);
        object = this.counterNameToCounterMap;
        parcel.writeMap((Map)object);
        object = this.startTime;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.endTime;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.sessions;
        synchronized (object) {
            list = this.sessions;
            parcel.writeList(list);
            return;
        }
    }
}

