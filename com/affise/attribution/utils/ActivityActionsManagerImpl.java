/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
package com.affise.attribution.utils;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import com.affise.attribution.init.AffiseInitProperties;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.utils.ActivityActionsManager;
import com.affise.attribution.utils.ActivityActionsManagerImpl$Companion;
import com.affise.attribution.utils.ActivityActionsManagerImpl$addListener$3$1;
import com.affise.attribution.utils.ActivityActionsManagerImpl$callback$1;
import com.affise.attribution.utils.ActivityClickCallback;
import com.affise.attribution.utils.ActivityLifecycleCallback;
import com.affise.attribution.utils.AutoCatchingOnClickListener;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class ActivityActionsManagerImpl
implements ActivityActionsManager {
    public static final ActivityActionsManagerImpl$Companion Companion;
    private static final String GET_LISTENER_INFO_DECLARED_METHOD_NAME = "getListenerInfo";
    private static final String LISTENER_INFO_CLASS_NAME = "android.view.View$ListenerInfo";
    private static final String ON_CLICK_LISTENER_DECLARED_FIELD_NAME = "mOnClickListener";
    private final Application app;
    private final ActivityActionsManagerImpl$callback$1 callback;
    private final AffiseInitProperties initProperties;
    private final LogsManager logsManager;
    private final List onActivityClickListeners;
    private final List onActivityResumedListeners;
    private final List onActivityStartedListeners;
    private final List onActivityStoppedListeners;

    static {
        ActivityActionsManagerImpl$Companion activityActionsManagerImpl$Companion;
        Companion = activityActionsManagerImpl$Companion = new ActivityActionsManagerImpl$Companion(null);
    }

    public ActivityActionsManagerImpl(Application application, LogsManager object, AffiseInitProperties affiseInitProperties) {
        Intrinsics.checkNotNullParameter(application, "app");
        Intrinsics.checkNotNullParameter(object, "logsManager");
        Intrinsics.checkNotNullParameter(affiseInitProperties, "initProperties");
        this.app = application;
        this.logsManager = object;
        this.initProperties = affiseInitProperties;
        object = new ArrayList();
        this.onActivityStartedListeners = object;
        object = new ArrayList();
        this.onActivityResumedListeners = object;
        object = new ArrayList();
        this.onActivityStoppedListeners = object;
        object = new ArrayList();
        this.onActivityClickListeners = object;
        this.callback = object = new ActivityActionsManagerImpl$callback$1(this);
        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
    }

    public static final /* synthetic */ List access$getOnActivityClickListeners$p(ActivityActionsManagerImpl activityActionsManagerImpl) {
        return activityActionsManagerImpl.onActivityClickListeners;
    }

    public static final /* synthetic */ List access$getOnActivityResumedListeners$p(ActivityActionsManagerImpl activityActionsManagerImpl) {
        return activityActionsManagerImpl.onActivityResumedListeners;
    }

    public static final /* synthetic */ List access$getOnActivityStartedListeners$p(ActivityActionsManagerImpl activityActionsManagerImpl) {
        return activityActionsManagerImpl.onActivityStartedListeners;
    }

    public static final /* synthetic */ List access$getOnActivityStoppedListeners$p(ActivityActionsManagerImpl activityActionsManagerImpl) {
        return activityActionsManagerImpl.onActivityStoppedListeners;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void addListener(Activity activity, View object) {
        Throwable throwable2;
        block5: {
            Object object2;
            Object object3;
            Object object4;
            AnnotatedElement annotatedElement;
            block4: {
                boolean bl2;
                annotatedElement = View.class;
                object4 = GET_LISTENER_INFO_DECLARED_METHOD_NAME;
                object3 = null;
                try {
                    annotatedElement = ((Class)annotatedElement).getDeclaredMethod((String)object4, null);
                    bl2 = true;
                    ((AccessibleObject)annotatedElement).setAccessible(bl2);
                    object = ((Method)annotatedElement).invoke(object, null);
                    annotatedElement = LISTENER_INFO_CLASS_NAME;
                    annotatedElement = Class.forName((String)((Object)annotatedElement));
                    object2 = ON_CLICK_LISTENER_DECLARED_FIELD_NAME;
                    annotatedElement = ((Class)annotatedElement).getDeclaredField((String)object2);
                    ((AccessibleObject)annotatedElement).setAccessible(bl2);
                    object4 = ((Field)annotatedElement).get(object);
                    if (object4 == null) return;
                }
                catch (Throwable throwable2) {}
                boolean bl3 = object4 instanceof View.OnClickListener;
                if (!bl3 || (bl3 = object4 instanceof AutoCatchingOnClickListener)) {
                    bl2 = false;
                    object4 = null;
                }
                if (object4 == null) return;
                bl3 = object4 instanceof View.OnClickListener;
                if (!bl3) break block4;
                object3 = object4;
                object3 = (View.OnClickListener)object4;
                break block5;
            }
            if (object3 == null) return;
            object2 = new ActivityActionsManagerImpl$addListener$3$1(this, activity);
            object4 = new AutoCatchingOnClickListener((View.OnClickListener)object3, (Function1)object2);
            ((Field)annotatedElement).set(object, object4);
            return;
        }
        object = this.logsManager;
        object.addSdkError(throwable2);
    }

    private final void addListeners(Activity activity, ViewGroup viewGroup) {
        int n3 = viewGroup.getChildCount();
        int n4 = 0;
        View view = null;
        View view2 = f.m(0, n3).iterator();
        while ((n4 = view2.hasNext()) != 0) {
            view = view2;
            n4 = ((mi1_2)view2).nextInt();
            View view3 = viewGroup.getChildAt(n4);
            String string2 = "viewGroup.getChildAt(it)";
            Intrinsics.checkNotNullExpressionValue(view3, string2);
            this.addListener(activity, view3);
            view = viewGroup.getChildAt(n4);
            boolean bl2 = view instanceof ViewGroup;
            if (bl2) {
                view = (ViewGroup)view;
            } else {
                n4 = 0;
                view = null;
            }
            if (view == null) continue;
            this.addListeners(activity, (ViewGroup)view);
        }
    }

    public void addOnActivityClickListener(ActivityClickCallback activityClickCallback) {
        Intrinsics.checkNotNullParameter(activityClickCallback, "listener");
        this.onActivityClickListeners.add(activityClickCallback);
    }

    public void addOnActivityResumedListener(ActivityLifecycleCallback activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "listener");
        this.onActivityResumedListeners.add(activityLifecycleCallback);
    }

    public void addOnActivityStartedListener(ActivityLifecycleCallback activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "listener");
        this.onActivityStartedListeners.add(activityLifecycleCallback);
    }

    public void addOnActivityStoppedListener(ActivityLifecycleCallback activityLifecycleCallback) {
        Intrinsics.checkNotNullParameter(activityLifecycleCallback, "listener");
        this.onActivityStoppedListeners.add(activityLifecycleCallback);
    }
}

