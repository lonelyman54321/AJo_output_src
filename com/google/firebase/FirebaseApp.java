/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseApp$BackgroundStateChangeListener;
import com.google.firebase.FirebaseApp$GlobalBackgroundStateListener;
import com.google.firebase.FirebaseApp$UserUnlockReceiver;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.StartupTime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.ComponentRuntime$Builder;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseApp {
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    static final Map INSTANCES;
    private static final Object LOCK;
    private static final String LOG_TAG = "FirebaseApp";
    private final Context applicationContext;
    private final AtomicBoolean automaticResourceManagementEnabled;
    private final List backgroundStateChangeListeners;
    private final ComponentRuntime componentRuntime;
    private final Lazy dataCollectionConfigStorage;
    private final Provider defaultHeartBeatController;
    private final AtomicBoolean deleted;
    private final List lifecycleListeners;
    private final String name;
    private final FirebaseOptions options;

    static {
        Object object;
        LOCK = object = new Object();
        INSTANCES = object = new Jp();
    }

    public FirebaseApp(Context object, String object2, FirebaseOptions object3) {
        Class[] classArray = null;
        Object object4 = new AtomicBoolean(false);
        this.automaticResourceManagementEnabled = object4;
        object4 = new AtomicBoolean();
        this.deleted = object4;
        this.backgroundStateChangeListeners = object4;
        super();
        this.lifecycleListeners = object4;
        object4 = (Context)Preconditions.checkNotNull(object);
        this.applicationContext = object4;
        object2 = Preconditions.checkNotEmpty((String)object2);
        this.name = object2;
        this.options = object2 = (FirebaseOptions)Preconditions.checkNotNull(object3);
        object2 = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        object4 = ComponentDiscovery.forContext(object, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        object4 = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars((Collection)object4);
        Class<FirebaseOptions> clazz = new Class<FirebaseOptions>();
        object4 = ((ComponentRuntime$Builder)object4).addComponentRegistrar((ComponentRegistrar)((Object)clazz));
        super();
        object4 = ((ComponentRuntime$Builder)object4).addComponentRegistrar((ComponentRegistrar)((Object)clazz));
        Class[] classArray2 = new Class[]{};
        clazz = Component.of(object, Context.class, classArray2);
        object4 = ((ComponentRuntime$Builder)object4).addComponent((Component)((Object)clazz));
        classArray2 = new Class[]{};
        clazz = Component.of((Object)this, FirebaseApp.class, classArray2);
        object4 = ((ComponentRuntime$Builder)object4).addComponent((Component)((Object)clazz));
        clazz = FirebaseOptions.class;
        classArray2 = new Class[]{};
        object3 = Component.of(object3, clazz, classArray2);
        object3 = ((ComponentRuntime$Builder)object4).addComponent((Component)object3);
        object4 = new ComponentMonitor();
        object3 = ((ComponentRuntime$Builder)object3).setProcessor((ComponentRegistrarProcessor)object4);
        boolean bl2 = Bx3.a(object);
        if (bl2 && (bl2 = FirebaseInitProvider.isCurrentlyInitializing())) {
            object4 = StartupTime.class;
            classArray = new Class[]{};
            object2 = Component.of(object2, object4, classArray);
            ((ComponentRuntime$Builder)object3).addComponent((Component)object2);
        }
        this.componentRuntime = object2 = ((ComponentRuntime$Builder)object3).build();
        FirebaseTrace.popTrace();
        object4 = new wn0_1(this, (Context)object);
        this.dataCollectionConfigStorage = object3 = new Lazy((Provider)object4);
        object2.getClass();
        object = g10.d((ComponentContainer)object2, DefaultHeartBeatController.class);
        this.defaultHeartBeatController = object;
        super(this);
        this.addBackgroundStateChangeListener((FirebaseApp$BackgroundStateChangeListener)object);
        FirebaseTrace.popTrace();
    }

    public static /* synthetic */ void a(FirebaseApp firebaseApp, boolean bl2) {
        firebaseApp.lambda$new$1(bl2);
    }

    public static /* synthetic */ Object access$200() {
        return LOCK;
    }

    public static /* synthetic */ void access$300(FirebaseApp firebaseApp) {
        firebaseApp.initializeAllApis();
    }

    public static /* synthetic */ AtomicBoolean access$400(FirebaseApp firebaseApp) {
        return firebaseApp.automaticResourceManagementEnabled;
    }

    public static /* synthetic */ void access$500(FirebaseApp firebaseApp, boolean bl2) {
        firebaseApp.notifyBackgroundStateChangeListeners(bl2);
    }

    public static /* synthetic */ DataCollectionConfigStorage b(FirebaseApp firebaseApp, Context context) {
        return firebaseApp.lambda$new$0(context);
    }

    private void checkNotDeleted() {
        Preconditions.checkState(this.deleted.get() ^ true, "FirebaseApp was deleted");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void clearInstancesForTest() {
        Object object = LOCK;
        synchronized (object) {
            Map map2 = INSTANCES;
            map2.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static List getAllAppNames() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = LOCK;
        // MONITORENTER : object
        Iterator iterator = INSTANCES;
        iterator = iterator.values();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2 = iterator.next();
            object2 = (FirebaseApp)object2;
            object2 = ((FirebaseApp)object2).getName();
            arrayList.add(object2);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List getApps(Context object) {
        object = LOCK;
        synchronized (object) {
            Object object2 = INSTANCES;
            object2 = object2.values();
            return new ArrayList(object2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseApp getInstance() {
        Object object = "Default FirebaseApp is not initialized in this process ";
        Object object2 = LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                CharSequence charSequence;
                Object object3;
                try {
                    object3 = INSTANCES;
                    charSequence = DEFAULT_APP_NAME;
                    object3 = object3.get(charSequence);
                    object3 = (FirebaseApp)object3;
                    if (object3 != null) {
                        object = ((FirebaseApp)object3).defaultHeartBeatController;
                        object = object.get();
                        object = (DefaultHeartBeatController)object;
                        ((DefaultHeartBeatController)object).registerHeartBeat();
                        return object3;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                charSequence = new StringBuilder((String)object);
                object = ProcessUtils.getMyProcessName();
                ((StringBuilder)charSequence).append((String)object);
                object = ". Make sure to call FirebaseApp.initializeApp(Context) first.";
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                object3 = new IllegalStateException((String)object);
                throw object3;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseApp getInstance(String object) {
        Object object2 = "FirebaseApp with name ";
        String string2 = "Available app names: ";
        Object object3 = LOCK;
        synchronized (object3) {
            Throwable throwable2;
            block6: {
                CharSequence charSequence;
                Object object4;
                try {
                    object4 = INSTANCES;
                    charSequence = FirebaseApp.normalize((String)object);
                    object4 = object4.get(charSequence);
                    object4 = (FirebaseApp)object4;
                    if (object4 != null) {
                        object = ((FirebaseApp)object4).defaultHeartBeatController;
                        object = object.get();
                        object = (DefaultHeartBeatController)object;
                        ((DefaultHeartBeatController)object).registerHeartBeat();
                        return object4;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                object4 = FirebaseApp.getAllAppNames();
                boolean bl2 = object4.isEmpty();
                if (bl2) {
                    string2 = "";
                } else {
                    charSequence = new StringBuilder(string2);
                    string2 = ", ";
                    string2 = TextUtils.join((CharSequence)string2, (Iterable)object4);
                    ((StringBuilder)charSequence).append(string2);
                    string2 = ((StringBuilder)charSequence).toString();
                }
                object4 = new StringBuilder((String)object2);
                ((StringBuilder)object4).append((String)object);
                object = " doesn't exist. ";
                ((StringBuilder)object4).append((String)object);
                ((StringBuilder)object4).append(string2);
                object = ((StringBuilder)object4).toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            throw throwable2;
        }
    }

    public static String getPersistenceKey(String string2, FirebaseOptions object) {
        StringBuilder stringBuilder = new StringBuilder();
        Charset charset = Charset.defaultCharset();
        string2 = Base64Utils.encodeUrlSafeNoPadding(string2.getBytes(charset));
        stringBuilder.append(string2);
        stringBuilder.append("+");
        string2 = ((FirebaseOptions)object).getApplicationId();
        object = Charset.defaultCharset();
        string2 = Base64Utils.encodeUrlSafeNoPadding(string2.getBytes((Charset)object));
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private void initializeAllApis() {
        Object object = this.applicationContext;
        boolean bl2 = Bx3.a((Context)object) ^ true;
        if (bl2) {
            this.getName();
            object = this.applicationContext;
            FirebaseApp$UserUnlockReceiver.access$100((Context)object);
        } else {
            this.getName();
            object = this.componentRuntime;
            boolean bl3 = this.isDefaultApp();
            ((ComponentRuntime)object).initializeEagerComponents(bl3);
            object = (DefaultHeartBeatController)this.defaultHeartBeatController.get();
            ((DefaultHeartBeatController)object).registerHeartBeat();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseApp initializeApp(Context object) {
        Object object2 = LOCK;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                Object object3;
                try {
                    object3 = INSTANCES;
                    String string2 = DEFAULT_APP_NAME;
                    boolean bl2 = object3.containsKey(string2);
                    if (bl2) {
                        return FirebaseApp.getInstance();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object3 = FirebaseOptions.fromResource(object);
                if (object3 != null) return FirebaseApp.initializeApp(object, (FirebaseOptions)object3);
                return null;
            }
            throw throwable2;
        }
    }

    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions) {
        return FirebaseApp.initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseApp initializeApp(Context context, FirebaseOptions firebaseOptions, String string2) {
        Object object = "FirebaseApp name ";
        FirebaseApp$GlobalBackgroundStateListener.access$000(context);
        string2 = FirebaseApp.normalize(string2);
        Object object2 = context.getApplicationContext();
        if (object2 != null) {
            context = context.getApplicationContext();
        }
        object2 = LOCK;
        synchronized (object2) {
            Map map2 = INSTANCES;
            boolean bl2 = map2.containsKey(string2) ^ true;
            StringBuilder stringBuilder = new StringBuilder((String)object);
            stringBuilder.append(string2);
            object = " already exists!";
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            Preconditions.checkState(bl2, object);
            object = "Application context cannot be null.";
            Preconditions.checkNotNull(context, object);
            object = new FirebaseApp(context, string2, firebaseOptions);
            map2.put(string2, object);
        }
        super.initializeAllApis();
        return object;
    }

    private /* synthetic */ DataCollectionConfigStorage lambda$new$0(Context context) {
        String string2 = this.getPersistenceKey();
        Object object = this.componentRuntime;
        object.getClass();
        object = (Publisher)g10.b((ComponentContainer)object, Publisher.class);
        DataCollectionConfigStorage dataCollectionConfigStorage = new DataCollectionConfigStorage(context, string2, (Publisher)object);
        return dataCollectionConfigStorage;
    }

    private /* synthetic */ void lambda$new$1(boolean bl2) {
        if (!bl2) {
            DefaultHeartBeatController defaultHeartBeatController = (DefaultHeartBeatController)this.defaultHeartBeatController.get();
            defaultHeartBeatController.registerHeartBeat();
        }
    }

    private static String normalize(String string2) {
        return string2.trim();
    }

    private void notifyBackgroundStateChangeListeners(boolean bl2) {
        boolean bl3;
        Iterator iterator = this.backgroundStateChangeListeners.iterator();
        while (bl3 = iterator.hasNext()) {
            FirebaseApp$BackgroundStateChangeListener firebaseApp$BackgroundStateChangeListener = (FirebaseApp$BackgroundStateChangeListener)iterator.next();
            firebaseApp$BackgroundStateChangeListener.onBackgroundStateChanged(bl2);
        }
    }

    private void notifyOnAppDeleted() {
        boolean bl2;
        Iterator iterator = this.lifecycleListeners.iterator();
        while (bl2 = iterator.hasNext()) {
            FirebaseAppLifecycleListener firebaseAppLifecycleListener = (FirebaseAppLifecycleListener)iterator.next();
            String string2 = this.name;
            FirebaseOptions firebaseOptions = this.options;
            firebaseAppLifecycleListener.onDeleted(string2, firebaseOptions);
        }
    }

    public void addBackgroundStateChangeListener(FirebaseApp$BackgroundStateChangeListener firebaseApp$BackgroundStateChangeListener) {
        this.checkNotDeleted();
        Object object = this.automaticResourceManagementEnabled;
        boolean bl2 = ((AtomicBoolean)object).get();
        if (bl2 && (bl2 = ((BackgroundDetector)(object = BackgroundDetector.getInstance())).isInBackground())) {
            bl2 = true;
            firebaseApp$BackgroundStateChangeListener.onBackgroundStateChanged(bl2);
        }
        this.backgroundStateChangeListeners.add(firebaseApp$BackgroundStateChangeListener);
    }

    public void addLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.add(firebaseAppLifecycleListener);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void delete() {
        Object object = this.deleted;
        Map map2 = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        object = LOCK;
        synchronized (object) {
            map2 = INSTANCES;
            String string2 = this.name;
            map2.remove(string2);
        }
        this.notifyOnAppDeleted();
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof FirebaseApp;
        if (!bl2) {
            return false;
        }
        String string2 = this.name;
        object = ((FirebaseApp)object).getName();
        return string2.equals(object);
    }

    public Object get(Class clazz) {
        this.checkNotDeleted();
        ComponentRuntime componentRuntime = this.componentRuntime;
        componentRuntime.getClass();
        return g10.b(componentRuntime, clazz);
    }

    public Context getApplicationContext() {
        this.checkNotDeleted();
        return this.applicationContext;
    }

    public String getName() {
        this.checkNotDeleted();
        return this.name;
    }

    public FirebaseOptions getOptions() {
        this.checkNotDeleted();
        return this.options;
    }

    public String getPersistenceKey() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getName();
        Charset charset = Charset.defaultCharset();
        string2 = Base64Utils.encodeUrlSafeNoPadding(string2.getBytes(charset));
        stringBuilder.append(string2);
        stringBuilder.append("+");
        string2 = this.getOptions().getApplicationId();
        charset = Charset.defaultCharset();
        string2 = Base64Utils.encodeUrlSafeNoPadding(string2.getBytes(charset));
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void initializeAllComponents() {
        this.componentRuntime.initializeAllComponentsForTests();
    }

    public boolean isDataCollectionDefaultEnabled() {
        this.checkNotDeleted();
        return ((DataCollectionConfigStorage)this.dataCollectionConfigStorage.get()).isEnabled();
    }

    public boolean isDefaultApp() {
        String string2 = this.getName();
        return DEFAULT_APP_NAME.equals(string2);
    }

    public void removeBackgroundStateChangeListener(FirebaseApp$BackgroundStateChangeListener firebaseApp$BackgroundStateChangeListener) {
        this.checkNotDeleted();
        this.backgroundStateChangeListeners.remove(firebaseApp$BackgroundStateChangeListener);
    }

    public void removeLifecycleEventListener(FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        this.checkNotDeleted();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.lifecycleListeners.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean bl2) {
        this.checkNotDeleted();
        Object object = this.automaticResourceManagementEnabled;
        boolean bl3 = bl2 ^ true;
        boolean bl4 = ((AtomicBoolean)object).compareAndSet(bl3, bl2);
        if (bl4) {
            object = BackgroundDetector.getInstance();
            bl4 = ((BackgroundDetector)object).isInBackground();
            if (bl2 && bl4) {
                bl2 = true;
                this.notifyBackgroundStateChangeListeners(bl2);
            } else if (!bl2 && bl4) {
                bl2 = false;
                this.notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public void setDataCollectionDefaultEnabled(Boolean bl2) {
        this.checkNotDeleted();
        ((DataCollectionConfigStorage)this.dataCollectionConfigStorage.get()).setEnabled(bl2);
    }

    public void setDataCollectionDefaultEnabled(boolean bl2) {
        Boolean bl3 = bl2;
        this.setDataCollectionDefaultEnabled(bl3);
    }

    public String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        Object object = this.name;
        objects$ToStringHelper = objects$ToStringHelper.add("name", object);
        object = this.options;
        return objects$ToStringHelper.add("options", object).toString();
    }
}

