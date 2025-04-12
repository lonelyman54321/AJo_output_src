/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.SetMultimap;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Monitor$Guard;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service$State;
import com.google.common.util.concurrent.ServiceManager;
import com.google.common.util.concurrent.ServiceManager$Listener;
import com.google.common.util.concurrent.ServiceManager$NoOpService;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState$1;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState$2;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState$AwaitHealthGuard;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState$StoppedGuard;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

final class ServiceManager$ServiceManagerState {
    final Monitor$Guard awaitHealthGuard;
    final ListenerCallQueue listeners;
    final Monitor monitor;
    final int numberOfServices;
    boolean ready;
    final SetMultimap servicesByState;
    final Map startupTimers;
    final Multiset states;
    final Monitor$Guard stoppedGuard;
    boolean transitioned;

    public ServiceManager$ServiceManagerState(ImmutableCollection immutableCollection) {
        int n3;
        Object object = new Monitor();
        this.monitor = object;
        this.servicesByState = object = MultimapBuilder.enumKeys(Service$State.class).linkedHashSetValues().build();
        Object object2 = object.keys();
        this.states = object2;
        this.startupTimers = object2 = Maps.newIdentityHashMap();
        this.awaitHealthGuard = object2 = new ServiceManager$ServiceManagerState$AwaitHealthGuard(this);
        this.stoppedGuard = object2 = new ServiceManager$ServiceManagerState$StoppedGuard(this);
        this.listeners = object2 = new ListenerCallQueue();
        this.numberOfServices = n3 = immutableCollection.size();
        object2 = Service$State.NEW;
        object.putAll(object2, immutableCollection);
    }

    public void addListener(ServiceManager$Listener serviceManager$Listener, Executor executor) {
        this.listeners.addListener(serviceManager$Listener, executor);
    }

    public void awaitHealthy() {
        Monitor monitor = this.monitor;
        Monitor$Guard monitor$Guard = this.awaitHealthGuard;
        monitor.enterWhenUninterruptibly(monitor$Guard);
        try {
            this.checkHealthy();
            return;
        }
        finally {
            this.monitor.leave();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void awaitHealthy(long l2, TimeUnit object) {
        Throwable throwable2;
        block4: {
            Object object2 = "Timeout waiting for the services to become healthy. The following services have not started: ";
            Object object3 = this.monitor;
            object3.enter();
            try {
                object3 = this.monitor;
                Monitor$Guard monitor$Guard = this.awaitHealthGuard;
                boolean bl2 = object3.waitForUninterruptibly(monitor$Guard, l2, (TimeUnit)((Object)object));
                if (bl2) {
                    this.checkHealthy();
                    this.monitor.leave();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            {
                CharSequence charSequence = new StringBuilder((String)object2);
                object = this.servicesByState;
                object2 = Service$State.NEW;
                object3 = Service$State.STARTING;
                object2 = ImmutableSet.of(object2, object3);
                object2 = Predicates.in((Collection)object2);
                object = Multimaps.filterKeys((SetMultimap)object, (Predicate)object2);
                charSequence.append(object);
                charSequence = charSequence.toString();
                TimeoutException timeoutException = new TimeoutException((String)charSequence);
                throw timeoutException;
            }
        }
        this.monitor.leave();
        throw throwable2;
    }

    public void awaitStopped() {
        Monitor monitor = this.monitor;
        Monitor$Guard monitor$Guard = this.stoppedGuard;
        monitor.enterWhenUninterruptibly(monitor$Guard);
        this.monitor.leave();
    }

    public void awaitStopped(long l2, TimeUnit object) {
        Object object2;
        Object object3;
        block15: {
            object3 = "Timeout waiting for the services to stop. The following services have not stopped: ";
            object2 = this.monitor;
            object2.enter();
            try {
                object2 = this.monitor;
            }
            catch (Throwable throwable) {
                this.monitor.leave();
                throw throwable;
            }
            Monitor$Guard monitor$Guard = this.stoppedGuard;
            boolean bl2 = object2.waitForUninterruptibly(monitor$Guard, l2, (TimeUnit)((Object)object));
            if (!bl2) break block15;
            this.monitor.leave();
            return;
        }
        CharSequence charSequence = new StringBuilder((String)object3);
        object = this.servicesByState;
        object3 = Service$State.TERMINATED;
        object2 = Service$State.FAILED;
        object3 = EnumSet.of(object3, object2);
        object3 = Predicates.in((Collection)object3);
        object3 = Predicates.not((Predicate)object3);
        object = Multimaps.filterKeys((SetMultimap)object, (Predicate)object3);
        charSequence.append(object);
        charSequence = charSequence.toString();
        TimeoutException timeoutException = new TimeoutException((String)charSequence);
        throw timeoutException;
    }

    public void checkHealthy() {
        int n3;
        Object object = this.states;
        Object object2 = Service$State.RUNNING;
        int n4 = object.count(object2);
        if (n4 == (n3 = this.numberOfServices)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected to be healthy after starting. The following services are not running: ");
        SetMultimap setMultimap = this.servicesByState;
        object2 = Predicates.not(Predicates.equalTo(object2));
        object2 = Multimaps.filterKeys(setMultimap, (Predicate)object2);
        stringBuilder.append(object2);
        object2 = stringBuilder.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public void dispatchListenerEvents() {
        Preconditions.checkState(this.monitor.isOccupiedByCurrentThread() ^ true, "It is incorrect to execute listeners with the monitor held.");
        this.listeners.dispatch();
    }

    public void enqueueFailedEvent(Service service) {
        ListenerCallQueue listenerCallQueue = this.listeners;
        ServiceManager$ServiceManagerState$2 serviceManager$ServiceManagerState$2 = new ServiceManager$ServiceManagerState$2(this, service);
        listenerCallQueue.enqueue(serviceManager$ServiceManagerState$2);
    }

    public void enqueueHealthyEvent() {
        ListenerCallQueue listenerCallQueue = this.listeners;
        ListenerCallQueue$Event listenerCallQueue$Event = ServiceManager.access$400();
        listenerCallQueue.enqueue(listenerCallQueue$Event);
    }

    public void enqueueStoppedEvent() {
        ListenerCallQueue listenerCallQueue = this.listeners;
        ListenerCallQueue$Event listenerCallQueue$Event = ServiceManager.access$300();
        listenerCallQueue.enqueue(listenerCallQueue$Event);
    }

    /*
     * Exception decompiling
     */
    public void markReady() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 37->40)] java.lang.Throwable
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
     * Unable to fully structure code
     */
    public ImmutableSetMultimap servicesByState() {
        block11: {
            block10: {
                var1_1 = ImmutableSetMultimap.builder();
                var2_3 = this.monitor;
                var2_3.enter();
                var2_3 = this.servicesByState;
                var2_3 = var2_3.entries();
                try {
                    var2_3 = var2_3.iterator();
                }
lbl14:
                // 8 sources

                catch (Throwable var1_2) {
                    break block11;
                }
                while (true) {
                    var3_4 = var2_3.hasNext();
                    if (!var3_4) break block10;
                    break;
                }
                {
                    var4_5 = var2_3.next();
                    var4_5 = (Map.Entry)var4_5;
                    ** try [egrp 6[TRYBLOCK] [6 : 58->65)] { 
lbl21:
                    // 1 sources

                    var5_6 = var4_5.getValue();
                    var6_7 = var5_6 instanceof ServiceManager.NoOpService;
                    if (var6_7) continue;
                    var1_1.put((Map.Entry)var4_5);
                    continue;
                }
            }
            this.monitor.leave();
            return var1_1.build();
        }
        this.monitor.leave();
        throw var1_2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public ImmutableMap startupTimes() {
        block22: {
            block21: {
                var1_1 = this.monitor;
                var1_1.enter();
                var1_1 = this.startupTimers;
                var2_3 = var1_1.size();
                var1_1 = Lists.newArrayListWithCapacity(var2_3);
                var3_4 = this.startupTimers;
                var3_4 = var3_4.entrySet();
                try {
                    var3_4 = var3_4.iterator();
                }
lbl19:
                // 19 sources

                catch (Throwable var1_2) {
                    break block22;
                }
                while (true) {
                    var4_5 = var3_4.hasNext();
                    if (!var4_5) break block21;
                    break;
                }
                {
                    var5_6 = var3_4.next();
                    var5_6 = (Map.Entry)var5_6;
                    var6_7 /* !! */  = var5_6.getKey();
                    var6_7 /* !! */  = (Service)var6_7 /* !! */ ;
                    var5_6 = var5_6.getValue();
                    var5_6 = (Stopwatch)var5_6;
                    ** try [egrp 13[TRYBLOCK] [13 : 105->110)] { 
lbl34:
                    // 1 sources

                    var7_8 = var5_6.isRunning();
                    if (var7_8 || (var7_8 = var6_7 /* !! */  instanceof ServiceManager.NoOpService)) continue;
                    var8_9 = TimeUnit.MILLISECONDS;
                    var9_10 = var5_6.elapsed(var8_9);
                    var5_6 = var9_10;
                    var5_6 = Maps.immutableEntry(var6_7 /* !! */ , var5_6);
                    var1_1.add(var5_6);
                    continue;
                }
            }
            this.monitor.leave();
            var3_4 = Ordering.natural();
            var5_6 = new ServiceManager$ServiceManagerState$1(this);
            var3_4 = var3_4.onResultOf((Function)var5_6);
            Collections.sort(var1_1, var3_4);
            return ImmutableMap.copyOf((Iterable)var1_1);
        }
        this.monitor.leave();
        throw var1_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void transitionService(Service var1_1, Service$State var2_3, Service$State var3_4) {
        block12: {
            Preconditions.checkNotNull(var1_1);
            var4_5 = 1;
            if (var2_3 != var3_4) {
                var5_6 = true;
            } else {
                var5_6 = false;
                var6_7 = null;
            }
            Preconditions.checkArgument(var5_6);
            var6_7 = this.monitor;
            var6_7.enter();
            try {
                this.transitioned = var4_5;
                var5_6 = this.ready;
                if (!var5_6) {
                    this.monitor.leave();
                    this.dispatchListenerEvents();
                    return;
                }
            }
            catch (Throwable var1_2) {
                break block12;
            }
            var6_7 = this.servicesByState;
            var5_6 = var6_7.remove(var2_3, var1_1);
            var7_8 = "Service %s not at the expected location in the state map %s";
            Preconditions.checkState(var5_6, (String)var7_8, var1_1, var2_3);
            var2_3 = this.servicesByState;
            var8_9 = var2_3.put(var3_4, var1_1);
            var6_7 = "Service %s in the state map unexpectedly at %s";
            Preconditions.checkState((boolean)var8_9, (String)var6_7, var1_1, var3_4);
            var2_3 = this.startupTimers;
            var2_3 = var2_3.get(var1_1);
            var2_3 = (Stopwatch)var2_3;
            if (var2_3 == null) {
                var2_3 = Stopwatch.createStarted();
                var6_7 = this.startupTimers;
                var6_7.put(var1_1, var2_3);
            }
            if ((var9_10 = var3_4.compareTo(var6_7 = Service$State.RUNNING)) < 0 || (var9_10 = (int)var2_3.isRunning()) == 0) ** GOTO lbl51
            var2_3.stop();
            var9_10 = var1_1 instanceof ServiceManager.NoOpService;
            if (var9_10 != 0) ** GOTO lbl51
            {
                var7_8 = ServiceManager.access$200();
                var10_11 = Level.FINE;
                var11_12 = "Started {0} in {1}.";
                var12_13 = 2;
                var13_14 = new Object[var12_13];
                var13_14[0] = var1_1;
                var13_14[var4_5] = var2_3;
                var7_8.log(var10_11, var11_12, var13_14);
lbl51:
                // 3 sources

                if (var3_4 != (var2_3 = Service$State.FAILED)) ** GOTO lbl53
            }
            {
                this.enqueueFailedEvent((Service)var1_1);
lbl53:
                // 2 sources

                if ((var14_15 = (var1_1 = this.states).count(var6_7)) == (var15_16 = this.numberOfServices)) {
                    this.enqueueHealthyEvent();
                } else {
                    var1_1 = this.states;
                    var3_4 = Service$State.TERMINATED;
                    var14_15 = var1_1.count(var3_4);
                    var3_4 = this.states;
                    var8_9 = var3_4.count(var2_3);
                    if ((var14_15 += var8_9) == (var8_9 = this.numberOfServices)) {
                        this.enqueueStoppedEvent();
                    }
                }
                this.monitor.leave();
                this.dispatchListenerEvents();
                return;
            }
        }
        this.monitor.leave();
        this.dispatchListenerEvents();
        throw var1_2;
    }

    public void tryStartTiming(Service service) {
        Throwable throwable2;
        block8: {
            block7: {
                Object object = this.monitor;
                ((Monitor)object).enter();
                try {
                    object = this.startupTimers;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = object.get(service);
                object = (Stopwatch)object;
                if (object != null) break block7;
                object = this.startupTimers;
                Stopwatch stopwatch = Stopwatch.createStarted();
                object.put(service, stopwatch);
            }
            this.monitor.leave();
            return;
        }
        this.monitor.leave();
        throw throwable2;
    }
}

