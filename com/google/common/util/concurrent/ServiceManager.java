/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;
import com.google.common.util.concurrent.ServiceManager$1;
import com.google.common.util.concurrent.ServiceManager$2;
import com.google.common.util.concurrent.ServiceManager$Listener;
import com.google.common.util.concurrent.ServiceManager$NoOpService;
import com.google.common.util.concurrent.ServiceManager$ServiceListener;
import com.google.common.util.concurrent.ServiceManager$ServiceManagerState;
import com.google.common.util.concurrent.ServiceManagerBridge;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ServiceManager
implements ServiceManagerBridge {
    private static final ListenerCallQueue$Event HEALTHY_EVENT;
    private static final ListenerCallQueue$Event STOPPED_EVENT;
    private static final Logger logger;
    private final ImmutableList services;
    private final ServiceManager$ServiceManagerState state;

    static {
        logger = Logger.getLogger(ServiceManager.class.getName());
        ListenerCallQueue$Event listenerCallQueue$Event = new ServiceManager$1();
        HEALTHY_EVENT = listenerCallQueue$Event;
        listenerCallQueue$Event = new ServiceManager$2();
        STOPPED_EVENT = listenerCallQueue$Event;
    }

    public ServiceManager(Iterable object) {
        Object object2;
        WeakReference<Object> weakReference;
        Object object3;
        boolean bl2;
        Object object4;
        object = ImmutableList.copyOf((Iterable)object);
        boolean bl3 = ((AbstractCollection)object).isEmpty();
        if (bl3) {
            object = logger;
            object4 = Level.WARNING;
            bl2 = false;
            object3 = null;
            weakReference = new WeakReference<Object>(null);
            object2 = "ServiceManager configured with no services.  Is your application configured properly?";
            ((Logger)object).log((Level)object4, (String)object2, (Throwable)((Object)weakReference));
            object = new ServiceManager$NoOpService(null);
            object = ImmutableList.of(object);
        }
        this.state = object4 = new ServiceManager$ServiceManagerState((ImmutableCollection)object);
        this.services = object;
        weakReference = new WeakReference<Object>(object4);
        object = ((ImmutableList)object).iterator();
        while (bl3 = object.hasNext()) {
            object4 = (Service)object.next();
            object3 = new ServiceManager$ServiceListener((Service)object4, weakReference);
            object2 = MoreExecutors.directExecutor();
            object4.addListener((Service$Listener)object3, (Executor)object2);
            object3 = object4.state();
            object2 = Service$State.NEW;
            if (object3 == object2) {
                bl2 = true;
            } else {
                bl2 = false;
                object3 = null;
            }
            object2 = "Can only manage NEW services, %s";
            Preconditions.checkArgument(bl2, (String)object2, object4);
        }
        this.state.markReady();
    }

    public static /* synthetic */ Logger access$200() {
        return logger;
    }

    public static /* synthetic */ ListenerCallQueue$Event access$300() {
        return STOPPED_EVENT;
    }

    public static /* synthetic */ ListenerCallQueue$Event access$400() {
        return HEALTHY_EVENT;
    }

    public void addListener(ServiceManager$Listener serviceManager$Listener, Executor executor) {
        this.state.addListener(serviceManager$Listener, executor);
    }

    public void awaitHealthy() {
        this.state.awaitHealthy();
    }

    public void awaitHealthy(long l2, TimeUnit timeUnit) {
        this.state.awaitHealthy(l2, timeUnit);
    }

    public void awaitStopped() {
        this.state.awaitStopped();
    }

    public void awaitStopped(long l2, TimeUnit timeUnit) {
        this.state.awaitStopped(l2, timeUnit);
    }

    public boolean isHealthy() {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.services.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Service service = (Service)unmodifiableIterator.next();
            bl2 = service.isRunning();
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public ImmutableSetMultimap servicesByState() {
        return this.state.servicesByState();
    }

    public ServiceManager startAsync() {
        Object object;
        Object object2;
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.services.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            object2 = ((Service)unmodifiableIterator.next()).state();
            if (object2 == (object = Service$State.NEW)) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            object = "Not all services are NEW, cannot start %s";
            Preconditions.checkState(bl2, (String)object, (Object)this);
        }
        unmodifiableIterator = this.services.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            object2 = (Service)unmodifiableIterator.next();
            object = this.state;
            try {
                ((ServiceManager$ServiceManagerState)object).tryStartTiming((Service)object2);
                object2.startAsync();
            }
            catch (IllegalStateException illegalStateException) {
                Logger logger = ServiceManager.logger;
                Level level = Level.WARNING;
                String string2 = "Unable to start Service ";
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(object2);
                object2 = stringBuilder.toString();
                logger.log(level, (String)object2, illegalStateException);
            }
        }
        return this;
    }

    public ImmutableMap startupTimes() {
        return this.state.startupTimes();
    }

    public ServiceManager stopAsync() {
        boolean bl2;
        UnmodifiableIterator unmodifiableIterator = this.services.iterator();
        while (bl2 = unmodifiableIterator.hasNext()) {
            Service service = (Service)unmodifiableIterator.next();
            service.stopAsync();
        }
        return this;
    }

    public String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(ServiceManager.class);
        Collection collection = this.services;
        Predicate predicate = Predicates.not(Predicates.instanceOf(ServiceManager$NoOpService.class));
        collection = Collections2.filter(collection, predicate);
        return moreObjects$ToStringHelper.add("services", collection).toString();
    }
}

