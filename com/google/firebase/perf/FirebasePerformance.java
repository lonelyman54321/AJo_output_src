/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Timer;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FirebasePerformance
implements FirebasePerformanceAttributable {
    private static final int MAX_ATTRIBUTE_KEY_LENGTH = 40;
    private static final int MAX_ATTRIBUTE_VALUE_LENGTH = 100;
    private static final int MAX_TRACE_CUSTOM_ATTRIBUTES = 5;
    public static final int MAX_TRACE_NAME_LENGTH = 100;
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ConfigResolver configResolver;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final Provider firebaseRemoteConfigProvider;
    private final Map mCustomAttributes;
    private final ImmutableBundle mMetadataBundle;
    private Boolean mPerformanceCollectionForceEnabledState;
    private final Provider transportFactoryProvider;

    public FirebasePerformance(FirebaseApp object, Provider object2, FirebaseInstallationsApi object3, Provider object4, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager2) {
        Object object5 = new ConcurrentHashMap();
        this.mCustomAttributes = object5;
        object5 = null;
        this.mPerformanceCollectionForceEnabledState = null;
        this.firebaseApp = object;
        this.firebaseRemoteConfigProvider = object2;
        this.firebaseInstallationsApi = object3;
        this.transportFactoryProvider = object4;
        if (object == null) {
            this.mPerformanceCollectionForceEnabledState = object = Boolean.FALSE;
            this.configResolver = configResolver;
            this.mMetadataBundle = object = new ImmutableBundle((Bundle)object2);
            return;
        }
        object5 = TransportManager.getInstance();
        ((TransportManager)object5).initialize((FirebaseApp)object, (FirebaseInstallationsApi)object3, (Provider)object4);
        object3 = ((FirebaseApp)object).getApplicationContext();
        this.mMetadataBundle = object4 = FirebasePerformance.extractMetadata((Context)object3);
        remoteConfigManager.setFirebaseRemoteConfigProvider((Provider)object2);
        this.configResolver = configResolver;
        configResolver.setMetadataBundle((ImmutableBundle)object4);
        configResolver.setApplicationContext((Context)object3);
        sessionManager2.setApplicationContext((Context)object3);
        this.mPerformanceCollectionForceEnabledState = object2 = configResolver.getIsPerformanceCollectionEnabled();
        object2 = logger;
        boolean bl2 = ((AndroidLogger)object2).isLogcatEnabled();
        if (bl2 && (bl2 = this.isPerformanceCollectionEnabled())) {
            object = ((FirebaseApp)object).getOptions().getProjectId();
            object3 = object3.getPackageName();
            object = ConsoleUrlGenerator.generateDashboardUrl((String)object, (String)object3);
            object4 = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ";
            object3 = new StringBuilder((String)object4);
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            ((AndroidLogger)object2).info((String)object);
        }
    }

    private void checkAttribute(String object, String object2) {
        if (object != null && object2 != null) {
            int n3;
            Map map2 = this.mCustomAttributes;
            int n4 = map2.containsKey(object);
            if (n4 == 0 && (n4 = (map2 = this.mCustomAttributes).size()) >= (n3 = 5)) {
                object2 = Locale.US;
                object = new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
                throw object;
            }
            PerfMetricValidator.validateAttribute((String)object, (String)object2);
            return;
        }
        object = new IllegalArgumentException("Attribute must not have null key or value.");
        throw object;
    }

    private static ImmutableBundle extractMetadata(Context object) {
        Object object2;
        block6: {
            object2 = object.getPackageManager();
            object = object.getPackageName();
            int n3 = 128;
            object = object2.getApplicationInfo((String)object, n3);
            try {
                object = object.metaData;
                break block6;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                // empty catch block
            }
            object.getMessage();
            object = null;
        }
        object2 = object != null ? new ImmutableBundle((Bundle)object) : new ImmutableBundle();
        return object2;
    }

    public static FirebasePerformance getInstance() {
        return (FirebasePerformance)FirebaseApp.getInstance().get(FirebasePerformance.class);
    }

    public static Trace startTrace(String object) {
        object = Trace.create((String)object);
        ((Trace)object).start();
        return object;
    }

    public String getAttribute(String string2) {
        return (String)this.mCustomAttributes.get(string2);
    }

    public Map getAttributes() {
        Map map2 = this.mCustomAttributes;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public Boolean getPerformanceCollectionForceEnabledState() {
        return this.mPerformanceCollectionForceEnabledState;
    }

    public boolean isPerformanceCollectionEnabled() {
        boolean bl2;
        Object object = this.mPerformanceCollectionForceEnabledState;
        if (object != null) {
            bl2 = (Boolean)object;
        } else {
            object = FirebaseApp.getInstance();
            bl2 = ((FirebaseApp)object).isDataCollectionDefaultEnabled();
        }
        return bl2;
    }

    public HttpMetric newHttpMetric(String string2, String string3) {
        TransportManager transportManager = TransportManager.getInstance();
        Timer timer = new Timer();
        HttpMetric httpMetric = new HttpMetric(string2, string3, transportManager, timer);
        return httpMetric;
    }

    public HttpMetric newHttpMetric(URL uRL, String string2) {
        TransportManager transportManager = TransportManager.getInstance();
        Timer timer = new Timer();
        HttpMetric httpMetric = new HttpMetric(uRL, string2, transportManager, timer);
        return httpMetric;
    }

    public Trace newTrace(String string2) {
        return Trace.create(string2);
    }

    public void putAttribute(String string2, String string3) {
        boolean bl2 = false;
        Map map2 = null;
        int n3 = 1;
        string2 = string2.trim();
        string3 = string3.trim();
        try {
            this.checkAttribute(string2, string3);
            bl2 = true;
        }
        catch (Exception exception) {
            AndroidLogger androidLogger = logger;
            String string4 = exception.getMessage();
            int n4 = 3;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string2;
            objectArray[n3] = string3;
            n3 = 2;
            objectArray[n3] = string4;
            String string5 = "Can not set attribute %s with value %s (%s)";
            androidLogger.error(string5, objectArray);
        }
        if (bl2) {
            map2 = this.mCustomAttributes;
            map2.put(string2, string3);
        }
    }

    public void removeAttribute(String string2) {
        this.mCustomAttributes.remove(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setPerformanceCollectionEnabled(Boolean object) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                Object object2;
                try {
                    try {
                        FirebaseApp.getInstance();
                        object2 = this.configResolver;
                    }
                    catch (IllegalStateException illegalStateException) {
                        return;
                    }
                    object2 = ((ConfigResolver)object2).getIsPerformanceCollectionDeactivated();
                    boolean bl2 = (Boolean)object2;
                    if (bl2) {
                        object = logger;
                        object2 = "Firebase Performance is permanently disabled";
                        ((AndroidLogger)object).info((String)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block11;
                }
                object2 = this.configResolver;
                ((ConfigResolver)object2).setIsPerformanceCollectionEnabled((Boolean)object);
                if (object != null) {
                    this.mPerformanceCollectionForceEnabledState = object;
                } else {
                    object = this.configResolver;
                    this.mPerformanceCollectionForceEnabledState = object = ((ConfigResolver)object).getIsPerformanceCollectionEnabled();
                }
                object = Boolean.TRUE;
                object2 = this.mPerformanceCollectionForceEnabledState;
                boolean bl3 = ((Boolean)object).equals(object2);
                if (bl3) {
                    object = logger;
                    object2 = "Firebase Performance is Enabled";
                    ((AndroidLogger)object).info((String)object2);
                } else {
                    object = Boolean.FALSE;
                    object2 = this.mPerformanceCollectionForceEnabledState;
                    bl3 = ((Boolean)object).equals(object2);
                    if (bl3) {
                        object = logger;
                        object2 = "Firebase Performance is Disabled";
                        ((AndroidLogger)object).info((String)object2);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void setPerformanceCollectionEnabled(boolean bl2) {
        Boolean bl3 = bl2;
        this.setPerformanceCollectionEnabled(bl3);
    }
}

