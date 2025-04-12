/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.StrictMode$ThreadPolicy
 *  android.os.StrictMode$ThreadPolicy$Builder
 */
package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$Builder;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.CustomThreadFactory;
import com.google.firebase.concurrent.DelegatingScheduledExecutorService;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public class ExecutorsRegistrar
implements ComponentRegistrar {
    static final Lazy BG_EXECUTOR;
    static final Lazy BLOCKING_EXECUTOR;
    static final Lazy LITE_EXECUTOR;
    static final Lazy SCHEDULER;

    static {
        Lazy lazy;
        Provider provider = new Object();
        BG_EXECUTOR = lazy = new Lazy(provider);
        provider = new Object();
        LITE_EXECUTOR = lazy = new Lazy(provider);
        provider = new Object();
        BLOCKING_EXECUTOR = lazy = new Lazy(provider);
        provider = new Object();
        SCHEDULER = lazy = new Lazy(provider);
    }

    public static /* synthetic */ ScheduledExecutorService a(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
    }

    public static /* synthetic */ ScheduledExecutorService b() {
        return ExecutorsRegistrar.lambda$static$3();
    }

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
        builder = builder.detectNetwork();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            je0_2.b(builder);
            n4 = 26;
            if (n3 >= n4) {
                ke0_1.a(builder);
            }
        }
        return builder.penaltyLog().build();
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        return ExecutorsRegistrar.lambda$static$1();
    }

    public static /* synthetic */ Executor d(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.lambda$getComponents$7(componentContainer);
    }

    public static /* synthetic */ ScheduledExecutorService e(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.lambda$getComponents$5(componentContainer);
    }

    public static /* synthetic */ ScheduledExecutorService f() {
        return ExecutorsRegistrar.lambda$static$0();
    }

    private static ThreadFactory factory(String string2, int n3) {
        CustomThreadFactory customThreadFactory = new CustomThreadFactory(string2, n3, null);
        return customThreadFactory;
    }

    private static ThreadFactory factory(String string2, int n3, StrictMode.ThreadPolicy threadPolicy) {
        CustomThreadFactory customThreadFactory = new CustomThreadFactory(string2, n3, threadPolicy);
        return customThreadFactory;
    }

    public static /* synthetic */ ScheduledExecutorService g(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.lambda$getComponents$4(componentContainer);
    }

    public static /* synthetic */ ScheduledExecutorService h() {
        return ExecutorsRegistrar.scheduled(Executors.newCachedThreadPool(ExecutorsRegistrar.factory("Firebase Blocking", 11)));
    }

    private static /* synthetic */ ScheduledExecutorService lambda$getComponents$4(ComponentContainer componentContainer) {
        return (ScheduledExecutorService)BG_EXECUTOR.get();
    }

    private static /* synthetic */ ScheduledExecutorService lambda$getComponents$5(ComponentContainer componentContainer) {
        return (ScheduledExecutorService)BLOCKING_EXECUTOR.get();
    }

    private static /* synthetic */ ScheduledExecutorService lambda$getComponents$6(ComponentContainer componentContainer) {
        return (ScheduledExecutorService)LITE_EXECUTOR.get();
    }

    private static /* synthetic */ Executor lambda$getComponents$7(ComponentContainer componentContainer) {
        return UiExecutor.INSTANCE;
    }

    private static /* synthetic */ ScheduledExecutorService lambda$static$0() {
        StrictMode.ThreadPolicy threadPolicy = ExecutorsRegistrar.bgPolicy();
        ThreadFactory threadFactory = ExecutorsRegistrar.factory("Firebase Background", 10, threadPolicy);
        return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(4, threadFactory));
    }

    private static /* synthetic */ ScheduledExecutorService lambda$static$1() {
        int n3 = Runtime.getRuntime().availableProcessors();
        n3 = Math.max(2, n3);
        StrictMode.ThreadPolicy threadPolicy = ExecutorsRegistrar.litePolicy();
        ThreadFactory threadFactory = ExecutorsRegistrar.factory("Firebase Lite", 0, threadPolicy);
        return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(n3, threadFactory));
    }

    private static /* synthetic */ ScheduledExecutorService lambda$static$3() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.factory("Firebase Scheduler", 0));
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
        return builder.detectAll().penaltyLog().build();
    }

    private static ScheduledExecutorService scheduled(ExecutorService executorService) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)SCHEDULER.get();
        DelegatingScheduledExecutorService delegatingScheduledExecutorService = new DelegatingScheduledExecutorService(executorService, scheduledExecutorService);
        return delegatingScheduledExecutorService;
    }

    public List getComponents() {
        Object object = Background.class;
        Object object2 = ScheduledExecutorService.class;
        Object object3 = Qualified.qualified(object, object2);
        Object object4 = ExecutorService.class;
        Qualified qualified = Qualified.qualified(object, object4);
        Component[] componentArray = Executor.class;
        object = Qualified.qualified(object, componentArray);
        int n3 = 2;
        Object object5 = new Qualified[n3];
        object5[0] = qualified;
        int n4 = 1;
        object5[n4] = object;
        object = Component.builder((Qualified)object3, object5);
        object3 = new Object();
        object = ((Component$Builder)object).factory((ComponentFactory)object3).build();
        object3 = Blocking.class;
        object5 = Qualified.qualified(object3, object2);
        Qualified[] qualifiedArray = Qualified.qualified(object3, object4);
        object3 = Qualified.qualified(object3, componentArray);
        Qualified[] qualifiedArray2 = new Qualified[n3];
        qualifiedArray2[0] = qualifiedArray;
        qualifiedArray2[n4] = object3;
        object3 = Component.builder((Qualified)object5, qualifiedArray2);
        object5 = new Object();
        object3 = ((Component$Builder)object3).factory((ComponentFactory)object5).build();
        object5 = Lightweight.class;
        object2 = Qualified.qualified((Class)object5, object2);
        object4 = Qualified.qualified((Class)object5, object4);
        object5 = Qualified.qualified((Class)object5, componentArray);
        qualifiedArray = new Qualified[n3];
        qualifiedArray[0] = object4;
        qualifiedArray[n4] = object5;
        object2 = Component.builder((Qualified)object2, qualifiedArray);
        object4 = new Object();
        object2 = ((Component$Builder)object2).factory((ComponentFactory)object4).build();
        object4 = Component.builder(Qualified.qualified(UiThread.class, componentArray));
        componentArray = new Object();
        object4 = ((Component$Builder)object4).factory((ComponentFactory)componentArray).build();
        componentArray = new Component[4];
        componentArray[0] = object;
        componentArray[n4] = object3;
        componentArray[n3] = object2;
        componentArray[3] = object4;
        return Arrays.asList(componentArray);
    }
}

