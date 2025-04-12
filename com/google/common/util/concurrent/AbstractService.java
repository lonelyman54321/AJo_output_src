/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractService$1;
import com.google.common.util.concurrent.AbstractService$2;
import com.google.common.util.concurrent.AbstractService$3;
import com.google.common.util.concurrent.AbstractService$4;
import com.google.common.util.concurrent.AbstractService$5;
import com.google.common.util.concurrent.AbstractService$6;
import com.google.common.util.concurrent.AbstractService$HasReachedRunningGuard;
import com.google.common.util.concurrent.AbstractService$IsStartableGuard;
import com.google.common.util.concurrent.AbstractService$IsStoppableGuard;
import com.google.common.util.concurrent.AbstractService$IsStoppedGuard;
import com.google.common.util.concurrent.AbstractService$StateSnapshot;
import com.google.common.util.concurrent.ListenerCallQueue;
import com.google.common.util.concurrent.ListenerCallQueue$Event;
import com.google.common.util.concurrent.Monitor;
import com.google.common.util.concurrent.Monitor$Guard;
import com.google.common.util.concurrent.Platform;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.Service$Listener;
import com.google.common.util.concurrent.Service$State;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractService
implements Service {
    private static final ListenerCallQueue$Event RUNNING_EVENT;
    private static final ListenerCallQueue$Event STARTING_EVENT;
    private static final ListenerCallQueue$Event STOPPING_FROM_RUNNING_EVENT;
    private static final ListenerCallQueue$Event STOPPING_FROM_STARTING_EVENT;
    private static final ListenerCallQueue$Event TERMINATED_FROM_NEW_EVENT;
    private static final ListenerCallQueue$Event TERMINATED_FROM_RUNNING_EVENT;
    private static final ListenerCallQueue$Event TERMINATED_FROM_STARTING_EVENT;
    private static final ListenerCallQueue$Event TERMINATED_FROM_STOPPING_EVENT;
    private final Monitor$Guard hasReachedRunning;
    private final Monitor$Guard isStartable;
    private final Monitor$Guard isStoppable;
    private final Monitor$Guard isStopped;
    private final ListenerCallQueue listeners;
    private final Monitor monitor;
    private volatile AbstractService$StateSnapshot snapshot;

    static {
        Object object = new AbstractService$1();
        STARTING_EVENT = object;
        object = new AbstractService$2();
        RUNNING_EVENT = object;
        object = Service$State.STARTING;
        STOPPING_FROM_STARTING_EVENT = AbstractService.stoppingEvent((Service$State)((Object)object));
        Service$State service$State = Service$State.RUNNING;
        STOPPING_FROM_RUNNING_EVENT = AbstractService.stoppingEvent(service$State);
        TERMINATED_FROM_NEW_EVENT = AbstractService.terminatedEvent(Service$State.NEW);
        TERMINATED_FROM_STARTING_EVENT = AbstractService.terminatedEvent((Service$State)((Object)object));
        TERMINATED_FROM_RUNNING_EVENT = AbstractService.terminatedEvent(service$State);
        TERMINATED_FROM_STOPPING_EVENT = AbstractService.terminatedEvent(Service$State.STOPPING);
    }

    public AbstractService() {
        Object object = new Monitor();
        this.monitor = object;
        this.isStartable = object = new AbstractService$IsStartableGuard(this);
        this.isStoppable = object = new AbstractService$IsStoppableGuard(this);
        this.hasReachedRunning = object = new AbstractService$HasReachedRunningGuard(this);
        this.isStopped = object = new AbstractService$IsStoppedGuard(this);
        this.listeners = object = new ListenerCallQueue();
        Service$State service$State = Service$State.NEW;
        this.snapshot = object = new AbstractService$StateSnapshot(service$State);
    }

    public static /* synthetic */ Monitor access$000(AbstractService abstractService) {
        return abstractService.monitor;
    }

    private void checkCurrentState(Service$State object) {
        Object object2 = this.state();
        if (object2 != object) {
            Object object3 = Service$State.FAILED;
            String string2 = " to be ";
            String string3 = "Expected the service ";
            if (object2 == object3) {
                object3 = new StringBuilder(string3);
                ((StringBuilder)object3).append(this);
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(object);
                ((StringBuilder)object3).append(", but the service has FAILED");
                object = ((StringBuilder)object3).toString();
                object3 = this.failureCause();
                object2 = new IllegalStateException((String)object, (Throwable)object3);
                throw object2;
            }
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(this);
            stringBuilder.append(string2);
            stringBuilder.append(object);
            stringBuilder.append(", but was ");
            stringBuilder.append(object2);
            object = stringBuilder.toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
    }

    private void dispatchListenerEvents() {
        Object object = this.monitor;
        boolean bl2 = ((Monitor)object).isOccupiedByCurrentThread();
        if (!bl2) {
            object = this.listeners;
            ((ListenerCallQueue)object).dispatch();
        }
    }

    private void enqueueFailedEvent(Service$State service$State, Throwable throwable) {
        ListenerCallQueue listenerCallQueue = this.listeners;
        AbstractService$5 abstractService$5 = new AbstractService$5(this, service$State, throwable);
        listenerCallQueue.enqueue(abstractService$5);
    }

    private void enqueueRunningEvent() {
        ListenerCallQueue listenerCallQueue = this.listeners;
        ListenerCallQueue$Event listenerCallQueue$Event = RUNNING_EVENT;
        listenerCallQueue.enqueue(listenerCallQueue$Event);
    }

    private void enqueueStartingEvent() {
        ListenerCallQueue listenerCallQueue = this.listeners;
        ListenerCallQueue$Event listenerCallQueue$Event = STARTING_EVENT;
        listenerCallQueue.enqueue(listenerCallQueue$Event);
    }

    private void enqueueStoppingEvent(Service$State object) {
        block4: {
            block3: {
                Object object2;
                block2: {
                    object2 = Service$State.STARTING;
                    if (object != object2) break block2;
                    object = this.listeners;
                    object2 = STOPPING_FROM_STARTING_EVENT;
                    ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
                    break block3;
                }
                object2 = Service$State.RUNNING;
                if (object != object2) break block4;
                object = this.listeners;
                object2 = STOPPING_FROM_RUNNING_EVENT;
                ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
            }
            return;
        }
        object = new AssertionError();
        throw object;
    }

    private void enqueueTerminatedEvent(Service$State object) {
        Object object2 = AbstractService$6.$SwitchMap$com$google$common$util$concurrent$Service$State;
        int n3 = ((Enum)object).ordinal();
        n3 = object2[n3];
        switch (n3) {
            default: {
                break;
            }
            case 5: 
            case 6: {
                object = new AssertionError();
                throw object;
            }
            case 4: {
                object = this.listeners;
                object2 = TERMINATED_FROM_STOPPING_EVENT;
                ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
                break;
            }
            case 3: {
                object = this.listeners;
                object2 = TERMINATED_FROM_RUNNING_EVENT;
                ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
                break;
            }
            case 2: {
                object = this.listeners;
                object2 = TERMINATED_FROM_STARTING_EVENT;
                ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
                break;
            }
            case 1: {
                object = this.listeners;
                object2 = TERMINATED_FROM_NEW_EVENT;
                ((ListenerCallQueue)object).enqueue((ListenerCallQueue$Event)object2);
            }
        }
    }

    private static ListenerCallQueue$Event stoppingEvent(Service$State service$State) {
        AbstractService$4 abstractService$4 = new AbstractService$4(service$State);
        return abstractService$4;
    }

    private static ListenerCallQueue$Event terminatedEvent(Service$State service$State) {
        AbstractService$3 abstractService$3 = new AbstractService$3(service$State);
        return abstractService$3;
    }

    public final void addListener(Service$Listener service$Listener, Executor executor) {
        this.listeners.addListener(service$Listener, executor);
    }

    public final void awaitRunning() {
        Object object = this.monitor;
        Monitor$Guard monitor$Guard = this.hasReachedRunning;
        object.enterWhenUninterruptibly(monitor$Guard);
        try {
            object = Service$State.RUNNING;
            this.checkCurrentState((Service$State)((Object)object));
            return;
        }
        finally {
            this.monitor.leave();
        }
    }

    public final void awaitRunning(long l2, TimeUnit timeUnit) {
        Monitor monitor = this.monitor;
        Monitor$Guard monitor$Guard = this.hasReachedRunning;
        boolean bl2 = monitor.enterWhenUninterruptibly(monitor$Guard, l2, timeUnit);
        if (bl2) {
            try {
                Service$State service$State = Service$State.RUNNING;
                this.checkCurrentState(service$State);
                return;
            }
            finally {
                this.monitor.leave();
            }
        }
        CharSequence charSequence = new StringBuilder("Timed out waiting for ");
        charSequence.append(this);
        charSequence.append(" to reach the RUNNING state.");
        charSequence = charSequence.toString();
        TimeoutException timeoutException = new TimeoutException((String)charSequence);
        throw timeoutException;
    }

    public final void awaitTerminated() {
        Object object = this.monitor;
        Monitor$Guard monitor$Guard = this.isStopped;
        object.enterWhenUninterruptibly(monitor$Guard);
        try {
            object = Service$State.TERMINATED;
            this.checkCurrentState((Service$State)((Object)object));
            return;
        }
        finally {
            this.monitor.leave();
        }
    }

    public final void awaitTerminated(long l2, TimeUnit enum_) {
        Monitor monitor = this.monitor;
        Monitor$Guard monitor$Guard = this.isStopped;
        boolean bl2 = monitor.enterWhenUninterruptibly(monitor$Guard, l2, (TimeUnit)enum_);
        if (bl2) {
            try {
                Service$State service$State = Service$State.TERMINATED;
                this.checkCurrentState(service$State);
                return;
            }
            finally {
                this.monitor.leave();
            }
        }
        CharSequence charSequence = new StringBuilder("Timed out waiting for ");
        charSequence.append(this);
        charSequence.append(" to reach a terminal state. Current state: ");
        enum_ = this.state();
        charSequence.append(enum_);
        charSequence = charSequence.toString();
        TimeoutException timeoutException = new TimeoutException((String)charSequence);
        throw timeoutException;
    }

    public void doCancelStart() {
    }

    public abstract void doStart();

    public abstract void doStop();

    public final Throwable failureCause() {
        return this.snapshot.failureCause();
    }

    public final boolean isRunning() {
        boolean bl2;
        Service$State service$State;
        Service$State service$State2 = this.state();
        if (service$State2 == (service$State = Service$State.RUNNING)) {
            bl2 = true;
        } else {
            bl2 = false;
            service$State2 = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void notifyFailed(Throwable throwable) {
        Object object = "Failed while in state:";
        Preconditions.checkNotNull(throwable);
        Object object2 = this.monitor;
        ((Monitor)object2).enter();
        try {
            Object object3;
            block3: {
                block5: {
                    int n3;
                    block4: {
                        object2 = this.state();
                        object3 = AbstractService$6.$SwitchMap$com$google$common$util$concurrent$Service$State;
                        n3 = ((Enum)object2).ordinal();
                        int n4 = object3[n3];
                        n3 = 1;
                        if (n4 == n3) break block3;
                        n3 = 2;
                        if (n4 == n3 || n4 == (n3 = 3) || n4 == (n3 = 4)) break block4;
                        n3 = 5;
                        if (n4 == n3) break block3;
                        break block5;
                    }
                    object3 = (Object)Service$State.FAILED;
                    n3 = 0;
                    Object var7_8 = null;
                    this.snapshot = object = new AbstractService$StateSnapshot((Service$State)((Object)object3), false, throwable);
                    this.enqueueFailedEvent((Service$State)((Object)object2), throwable);
                }
                this.monitor.leave();
                this.dispatchListenerEvents();
                return;
            }
            object3 = new IllegalStateException;
            StringBuilder stringBuilder = new StringBuilder((String)object);
            stringBuilder.append(object2);
            object = stringBuilder.toString();
            object3((String)object, throwable);
            throw object3;
        }
        catch (Throwable throwable2) {}
        this.monitor.leave();
        this.dispatchListenerEvents();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void notifyStarted() {
        Object object = "Cannot notifyStarted() when the service is ";
        Object object2 = this.monitor;
        ((Monitor)object2).enter();
        try {
            object2 = this.snapshot;
            object2 = ((AbstractService$StateSnapshot)object2).state;
            Object object3 = Service$State.STARTING;
            if (object2 == object3) {
                object = this.snapshot;
                boolean bl2 = ((AbstractService$StateSnapshot)object).shutdownWhenStartupFinishes;
                if (bl2) {
                    object2 = Service$State.STOPPING;
                    object = new AbstractService$StateSnapshot((Service$State)((Object)object2));
                    this.snapshot = object;
                    this.doStop();
                } else {
                    object2 = Service$State.RUNNING;
                    object = new AbstractService$StateSnapshot((Service$State)((Object)object2));
                    this.snapshot = object;
                    this.enqueueRunningEvent();
                }
                this.monitor.leave();
                this.dispatchListenerEvents();
                return;
            }
            object3 = new StringBuilder((String)object);
            object = this.snapshot;
            object = ((AbstractService$StateSnapshot)object).state;
            ((StringBuilder)object3).append(object);
            object = ((StringBuilder)object3).toString();
            object2 = new IllegalStateException((String)object);
            this.notifyFailed((Throwable)object2);
            throw object2;
        }
        catch (Throwable throwable) {}
        this.monitor.leave();
        this.dispatchListenerEvents();
        throw throwable;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void notifyStopped() {
        var1_1 = "Cannot notifyStopped() when the service is ";
        var2_3 = this.monitor;
        var2_3.enter();
        try {
            var2_3 = this.state();
            var3_4 /* !! */  = AbstractService$6.$SwitchMap$com$google$common$util$concurrent$Service$State;
            var4_5 = var2_3.ordinal();
            var5_6 = var3_4 /* !! */ [var4_5];
        }
        catch (Throwable var1_2) {}
        switch (var5_6) {
            default: {
                ** GOTO lbl18
            }
            case 2: 
            case 3: 
            case 4: {
                var3_4 /* !! */  = (int[])Service$State.TERMINATED;
                this.snapshot = var1_1 = new AbstractService$StateSnapshot((Service$State)var3_4 /* !! */ );
                this.enqueueTerminatedEvent((Service$State)var2_3);
lbl18:
                // 2 sources

                this.monitor.leave();
                this.dispatchListenerEvents();
                return;
            }
            case 1: 
            case 5: 
            case 6: 
        }
        var3_4 /* !! */  = (int[])new IllegalStateException;
        var6_7 = new StringBuilder((String)var1_1);
        var6_7.append(var2_3);
        var1_1 = var6_7.toString();
        var3_4 /* !! */ ((String)var1_1);
        throw var3_4 /* !! */ ;
        this.monitor.leave();
        this.dispatchListenerEvents();
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Service startAsync() {
        Object object = this.monitor;
        Object object2 = this.isStartable;
        boolean bl2 = ((Monitor)object).enterIf((Monitor$Guard)object2);
        if (!bl2) {
            object2 = new StringBuilder("Service ");
            ((StringBuilder)object2).append(this);
            ((StringBuilder)object2).append(" has already been started");
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        try {
            object2 = Service$State.STARTING;
            this.snapshot = object = new AbstractService$StateSnapshot((Service$State)((Object)object2));
            this.enqueueStartingEvent();
            this.doStart();
        }
        catch (Throwable throwable) {
            try {
                Platform.restoreInterruptIfIsInterruptedException(throwable);
                this.notifyFailed(throwable);
            }
            catch (Throwable throwable2) {
                this.monitor.leave();
                this.dispatchListenerEvents();
                throw throwable2;
            }
        }
        object = this.monitor;
        ((Monitor)object).leave();
        this.dispatchListenerEvents();
        return this;
    }

    public final Service$State state() {
        return this.snapshot.externalState();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Service stopAsync() {
        block12: {
            block11: {
                var1_1 /* !! */  = "isStoppable is incorrectly implemented, saw: ";
                var2_4 /* !! */  = this.monitor;
                var3_5 = this.isStoppable;
                var4_6 = var2_4 /* !! */ .enterIf((Monitor$Guard)var3_5);
                if (var4_6 == false) return this;
                try {
                    var2_4 /* !! */  = this.state();
                    var3_5 = AbstractService$6.$SwitchMap$com$google$common$util$concurrent$Service$State;
                    var5_7 = var2_4 /* !! */ .ordinal();
                    var6_8 /* !! */  = var3_5[var5_7];
                }
                catch (Throwable var1_2) {
                    break block11;
                }
                switch (var6_8 /* !! */ ) {
                    default: {
                        ** break;
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        var7_9 = new StringBuilder((String)var1_1 /* !! */ );
                        var7_9.append(var2_4 /* !! */ );
                        var1_1 /* !! */  = var7_9.toString();
                        var3_5 = new AssertionError(var1_1 /* !! */ );
                        throw var3_5;
                    }
                    case 3: {
                        var2_4 /* !! */  = Service$State.STOPPING;
                        this.snapshot = var1_1 /* !! */  = new AbstractService$StateSnapshot((Service$State)var2_4 /* !! */ );
                        var1_1 /* !! */  = Service$State.RUNNING;
                        this.enqueueStoppingEvent((Service$State)var1_1 /* !! */ );
                        this.doStop();
                        ** break;
                    }
                    case 2: {
                        var2_4 /* !! */  = Service$State.STARTING;
                        var6_8 /* !! */  = true;
                        var5_7 = 0;
                        var7_10 = null;
                        var1_1 /* !! */  = new AbstractService$StateSnapshot((Service$State)var2_4 /* !! */ , (boolean)var6_8 /* !! */ , null);
                        this.snapshot = var1_1 /* !! */ ;
                        this.enqueueStoppingEvent((Service$State)var2_4 /* !! */ );
                        this.doCancelStart();
                        ** break;
                    }
                    case 1: 
                }
                var2_4 /* !! */  = Service$State.TERMINATED;
                this.snapshot = var1_1 /* !! */  = new AbstractService$StateSnapshot((Service$State)var2_4 /* !! */ );
                var1_1 /* !! */  = Service$State.NEW;
                this.enqueueTerminatedEvent((Service$State)var1_1 /* !! */ );
                break block12;
            }
            try {
                Platform.restoreInterruptIfIsInterruptedException(var1_2);
                this.notifyFailed(var1_2);
            }
            catch (Throwable var1_3) {
                this.monitor.leave();
                this.dispatchListenerEvents();
                throw var1_3;
            }
        }
        var1_1 /* !! */  = this.monitor;
        var1_1 /* !! */ .leave();
        this.dispatchListenerEvents();
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append(" [");
        object = this.state();
        stringBuilder.append(object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

