/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeviceCacheManager {
    private static final String PREFS_NAME = "FirebasePerfSharedPrefs";
    private static DeviceCacheManager instance;
    private static final AndroidLogger logger;
    private final ExecutorService serialExecutor;
    private volatile SharedPreferences sharedPref;

    static {
        logger = AndroidLogger.getInstance();
    }

    public DeviceCacheManager(ExecutorService executorService) {
        this.serialExecutor = executorService;
    }

    public static /* synthetic */ void a(DeviceCacheManager deviceCacheManager, Context context) {
        deviceCacheManager.lambda$setContext$0(context);
    }

    public static void clearInstance() {
        instance = null;
    }

    private Context getFirebaseApplicationContext() {
        try {
            FirebaseApp.getInstance();
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
        return FirebaseApp.getInstance().getApplicationContext();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static DeviceCacheManager getInstance() {
        Class<DeviceCacheManager> clazz = DeviceCacheManager.class;
        synchronized (clazz) {
            try {
                DeviceCacheManager deviceCacheManager = instance;
                if (deviceCacheManager != null) return instance;
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                instance = deviceCacheManager = new DeviceCacheManager(executorService);
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private /* synthetic */ void lambda$setContext$0(Context context) {
        Object object = this.sharedPref;
        if (object == null && context != null) {
            object = PREFS_NAME;
            context = context.getSharedPreferences((String)object, 0);
            this.sharedPref = context;
        }
    }

    public void clear(String string2) {
        if (string2 == null) {
            logger.debug("Key is null. Cannot clear nullable key");
            return;
        }
        this.sharedPref.edit().remove(string2).apply();
    }

    public boolean containsKey(String string2) {
        boolean bl2;
        SharedPreferences sharedPreferences2 = this.sharedPref;
        if (sharedPreferences2 != null && string2 != null && (bl2 = (sharedPreferences2 = this.sharedPref).contains(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public Optional getBoolean(String string2) {
        boolean bl2;
        if (string2 == null) {
            logger.debug("Key is null when getting boolean value on device cache.");
            return Optional.absent();
        }
        Object object = this.sharedPref;
        if (object == null) {
            object = this.getFirebaseApplicationContext();
            this.setContext((Context)object);
            object = this.sharedPref;
            if (object == null) {
                return Optional.absent();
            }
        }
        if (!(bl2 = (object = this.sharedPref).contains(string2))) {
            return Optional.absent();
        }
        try {
            object = this.sharedPref;
        }
        catch (ClassCastException classCastException) {
            AndroidLogger androidLogger = logger;
            String string3 = classCastException.getMessage();
            Object[] objectArray = new Object[]{string2, string3};
            androidLogger.debug("Key %s from sharedPreferences has type other than long: %s", objectArray);
            return Optional.absent();
        }
        bl2 = object.getBoolean(string2, false);
        object = bl2;
        return Optional.of(object);
    }

    public Optional getDouble(String string2) {
        double d2;
        long l2;
        boolean bl2;
        if (string2 == null) {
            logger.debug("Key is null when getting double value on device cache.");
            return Optional.absent();
        }
        Object object = this.sharedPref;
        if (object == null) {
            object = this.getFirebaseApplicationContext();
            this.setContext((Context)object);
            object = this.sharedPref;
            if (object == null) {
                return Optional.absent();
            }
        }
        if (!(bl2 = (object = this.sharedPref).contains(string2))) {
            return Optional.absent();
        }
        try {
            object = this.sharedPref;
            l2 = 0L;
        }
        catch (ClassCastException classCastException) {
            AndroidLogger androidLogger;
            try {
                object = this.sharedPref;
                androidLogger = null;
            }
            catch (ClassCastException classCastException2) {
                androidLogger = logger;
                String string3 = classCastException2.getMessage();
                Object[] objectArray = new Object[]{string2, string3};
                androidLogger.debug("Key %s from sharedPreferences has type other than double: %s", objectArray);
                return Optional.absent();
            }
            float f5 = object.getFloat(string2, 0.0f);
            object = Float.valueOf(f5);
            d2 = ((Float)object).doubleValue();
            object = d2;
            return Optional.of(object);
        }
        long l3 = object.getLong(string2, l2);
        d2 = Double.longBitsToDouble(l3);
        object = d2;
        return Optional.of(object);
    }

    public Optional getLong(String string2) {
        long l2;
        boolean bl2;
        if (string2 == null) {
            logger.debug("Key is null when getting long value on device cache.");
            return Optional.absent();
        }
        Object object = this.sharedPref;
        if (object == null) {
            object = this.getFirebaseApplicationContext();
            this.setContext((Context)object);
            object = this.sharedPref;
            if (object == null) {
                return Optional.absent();
            }
        }
        if (!(bl2 = (object = this.sharedPref).contains(string2))) {
            return Optional.absent();
        }
        try {
            object = this.sharedPref;
            l2 = 0L;
        }
        catch (ClassCastException classCastException) {
            AndroidLogger androidLogger = logger;
            String string3 = classCastException.getMessage();
            Object[] objectArray = new Object[]{string2, string3};
            androidLogger.debug("Key %s from sharedPreferences has type other than long: %s", objectArray);
            return Optional.absent();
        }
        long l3 = object.getLong(string2, l2);
        object = l3;
        return Optional.of(object);
    }

    public Optional getString(String string2) {
        Object object;
        boolean bl2;
        if (string2 == null) {
            logger.debug("Key is null when getting String value on device cache.");
            return Optional.absent();
        }
        Object object2 = this.sharedPref;
        if (object2 == null) {
            object2 = this.getFirebaseApplicationContext();
            this.setContext((Context)object2);
            object2 = this.sharedPref;
            if (object2 == null) {
                return Optional.absent();
            }
        }
        if (!(bl2 = (object2 = this.sharedPref).contains(string2))) {
            return Optional.absent();
        }
        try {
            object2 = this.sharedPref;
            object = "";
        }
        catch (ClassCastException classCastException) {
            object = logger;
            String string3 = classCastException.getMessage();
            Object[] objectArray = new Object[]{string2, string3};
            ((AndroidLogger)object).debug("Key %s from sharedPreferences has type other than String: %s", objectArray);
            return Optional.absent();
        }
        object2 = object2.getString(string2, (String)object);
        return Optional.of(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setContext(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object = this.sharedPref;
                        if (object != null || context == null) break block4;
                        object = this.serialExecutor;
                        Ep0 ep0 = new Ep0(this, context);
                        object.execute(ep0);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public boolean setValue(String string2, double d2) {
        SharedPreferences.Editor editor = null;
        if (string2 == null) {
            logger.debug("Key is null when setting double value on device cache.");
            return false;
        }
        SharedPreferences sharedPreferences2 = this.sharedPref;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = this.getFirebaseApplicationContext();
            this.setContext((Context)sharedPreferences2);
            sharedPreferences2 = this.sharedPref;
            if (sharedPreferences2 == null) {
                return false;
            }
        }
        editor = this.sharedPref.edit();
        long l2 = Double.doubleToRawLongBits(d2);
        editor.putLong(string2, l2).apply();
        return true;
    }

    public boolean setValue(String string2, long l2) {
        if (string2 == null) {
            logger.debug("Key is null when setting long value on device cache.");
            return false;
        }
        SharedPreferences sharedPreferences2 = this.sharedPref;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = this.getFirebaseApplicationContext();
            this.setContext((Context)sharedPreferences2);
            sharedPreferences2 = this.sharedPref;
            if (sharedPreferences2 == null) {
                return false;
            }
        }
        this.sharedPref.edit().putLong(string2, l2).apply();
        return true;
    }

    public boolean setValue(String string2, String string3) {
        boolean bl2 = false;
        if (string2 == null) {
            logger.debug("Key is null when setting String value on device cache.");
            return false;
        }
        SharedPreferences sharedPreferences2 = this.sharedPref;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = this.getFirebaseApplicationContext();
            this.setContext((Context)sharedPreferences2);
            sharedPreferences2 = this.sharedPref;
            if (sharedPreferences2 == null) {
                return false;
            }
        }
        bl2 = true;
        if (string3 == null) {
            this.sharedPref.edit().remove(string2).apply();
            return bl2;
        }
        this.sharedPref.edit().putString(string2, string3).apply();
        return bl2;
    }

    public boolean setValue(String string2, boolean bl2) {
        if (string2 == null) {
            logger.debug("Key is null when setting boolean value on device cache.");
            return false;
        }
        SharedPreferences sharedPreferences2 = this.sharedPref;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = this.getFirebaseApplicationContext();
            this.setContext((Context)sharedPreferences2);
            sharedPreferences2 = this.sharedPref;
            if (sharedPreferences2 == null) {
                return false;
            }
        }
        this.sharedPref.edit().putBoolean(string2, bl2).apply();
        return true;
    }
}

