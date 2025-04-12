/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.affise.attribution.session;

import android.app.Activity;
import com.affise.attribution.session.CurrentActiveActivityCountProvider;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.utils.ActivityLifecycleCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class CurrentActiveActivityCountProviderImpl
implements CurrentActiveActivityCountProvider {
    private final ActivityActionsManager activityActionsManager;
    private long activityCount;
    private List activityCountListener;
    private List activityStopListener;
    private ActivityLifecycleCallback onStartedSubscription;
    private ActivityLifecycleCallback onStoppedSubscription;

    public CurrentActiveActivityCountProviderImpl(ActivityActionsManager arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "activityActionsManager");
        this.activityActionsManager = arrayList;
        this.activityCountListener = arrayList = new ArrayList();
        this.activityStopListener = arrayList = new ArrayList();
    }

    public static /* synthetic */ void a(CurrentActiveActivityCountProviderImpl currentActiveActivityCountProviderImpl, Activity activity) {
        CurrentActiveActivityCountProviderImpl.init$lambda$5(currentActiveActivityCountProviderImpl, activity);
    }

    public static /* synthetic */ void b(CurrentActiveActivityCountProviderImpl currentActiveActivityCountProviderImpl, Activity activity) {
        CurrentActiveActivityCountProviderImpl.init$lambda$1(currentActiveActivityCountProviderImpl, activity);
    }

    private static final void init$lambda$1(CurrentActiveActivityCountProviderImpl currentActiveActivityCountProviderImpl, Activity object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(currentActiveActivityCountProviderImpl, "this$0");
        Object object2 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        long l2 = currentActiveActivityCountProviderImpl.activityCount;
        long l3 = 1L;
        currentActiveActivityCountProviderImpl.activityCount = l2 += l3;
        object = ((Iterable)currentActiveActivityCountProviderImpl.activityCountListener).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Function1)object.next();
            long l4 = currentActiveActivityCountProviderImpl.activityCount;
            Long l7 = l4;
            object2.invoke(l7);
        }
    }

    private static final void init$lambda$5(CurrentActiveActivityCountProviderImpl object, Activity object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object3 = "<anonymous parameter 0>";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        long l2 = ((CurrentActiveActivityCountProviderImpl)object).activityCount;
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 > 0) {
            l3 = 1L;
            ((CurrentActiveActivityCountProviderImpl)object).activityCount = l2 -= l3;
        }
        object2 = ((Iterable)((CurrentActiveActivityCountProviderImpl)object).activityCountListener).iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (Function1)object2.next();
            long l7 = ((CurrentActiveActivityCountProviderImpl)object).activityCount;
            Long l8 = l7;
            object3.invoke(l8);
        }
        object = ((Iterable)((CurrentActiveActivityCountProviderImpl)object).activityStopListener).iterator();
        while ((l4 = (long)object.hasNext()) != false) {
            object2 = (Function0)object.next();
            object2.invoke();
        }
    }

    public void addActivityCountListener(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "listener");
        this.activityCountListener.add(function1);
    }

    public void addActivityStopListener(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "listener");
        this.activityStopListener.add(function0);
    }

    public long getActivityCount() {
        return this.activityCount;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                ActivityActionsManager activityActionsManager2;
                ActivityLifecycleCallback activityLifecycleCallback;
                block4: {
                    try {
                        activityLifecycleCallback = this.onStartedSubscription;
                        if (activityLifecycleCallback != null) break block4;
                        activityLifecycleCallback = new af0_2(this);
                        activityActionsManager2 = this.activityActionsManager;
                        activityActionsManager2.addOnActivityStartedListener(activityLifecycleCallback);
                        this.onStartedSubscription = activityLifecycleCallback;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((activityLifecycleCallback = this.onStoppedSubscription) == null) {
                    activityLifecycleCallback = new bf0_2(this);
                    activityActionsManager2 = this.activityActionsManager;
                    activityActionsManager2.addOnActivityStoppedListener(activityLifecycleCallback);
                    this.onStoppedSubscription = activityLifecycleCallback;
                }
                return;
            }
            throw throwable2;
        }
    }
}

