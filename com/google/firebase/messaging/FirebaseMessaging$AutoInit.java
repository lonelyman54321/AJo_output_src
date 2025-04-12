/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.g;

class FirebaseMessaging$AutoInit {
    private static final String AUTO_INIT_PREF = "auto_init";
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
    private static final String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
    private Boolean autoInitEnabled;
    private EventHandler dataCollectionDefaultChangeEventHandler;
    private boolean initialized;
    private final Subscriber subscriber;
    final /* synthetic */ FirebaseMessaging this$0;

    public FirebaseMessaging$AutoInit(FirebaseMessaging firebaseMessaging, Subscriber subscriber) {
        this.this$0 = firebaseMessaging;
        this.subscriber = subscriber;
    }

    public static /* synthetic */ void a(FirebaseMessaging$AutoInit firebaseMessaging$AutoInit, Event event) {
        firebaseMessaging$AutoInit.lambda$initialize$0(event);
    }

    private /* synthetic */ void lambda$initialize$0(Event object) {
        boolean bl2 = this.isEnabled();
        if (bl2) {
            object = this.this$0;
            FirebaseMessaging.access$100((FirebaseMessaging)object);
        }
    }

    private Boolean readEnabled() {
        block10: {
            String string2;
            String string3 = MANIFEST_METADATA_AUTO_INIT_ENABLED;
            Object object = FirebaseMessaging.access$000(this.this$0).getApplicationContext();
            int n3 = 0;
            SharedPreferences sharedPreferences2 = object.getSharedPreferences(FCM_PREFERENCES, 0);
            boolean bl2 = sharedPreferences2.contains(string2 = AUTO_INIT_PREF);
            if (bl2) {
                return sharedPreferences2.getBoolean(string2, false);
            }
            try {
                sharedPreferences2 = object.getPackageManager();
                if (sharedPreferences2 == null) break block10;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            object = object.getPackageName();
            n3 = 128;
            object = sharedPreferences2.getApplicationInfo((String)object, n3);
            if (object == null) break block10;
            sharedPreferences2 = object.metaData;
            if (sharedPreferences2 == null) break block10;
            boolean bl3 = sharedPreferences2.containsKey(string3);
            if (!bl3) break block10;
            object = object.metaData;
            boolean bl4 = object.getBoolean(string3);
            return bl4;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void initialize() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    try {
                        bl2 = this.initialized;
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                Object object = this.readEnabled();
                this.autoInitEnabled = object;
                if (object == null) {
                    this.dataCollectionDefaultChangeEventHandler = object = new g(this);
                    Subscriber subscriber = this.subscriber;
                    Class<DataCollectionDefaultChange> clazz = DataCollectionDefaultChange.class;
                    subscriber.subscribe(clazz, (EventHandler)object);
                }
                this.initialized = bl2 = true;
                return;
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
    public boolean isEnabled() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    this.initialize();
                    object = this.autoInitEnabled;
                    if (object != null) {
                        return (Boolean)object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = this.this$0;
                object = FirebaseMessaging.access$000((FirebaseMessaging)object);
                return ((FirebaseApp)object).isDataCollectionDefaultEnabled();
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setEnabled(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Boolean bl3;
                Class<DataCollectionDefaultChange> clazz;
                Object object;
                Object object2;
                block4: {
                    try {
                        this.initialize();
                        object2 = this.dataCollectionDefaultChangeEventHandler;
                        if (object2 == null) break block4;
                        object = this.subscriber;
                        clazz = DataCollectionDefaultChange.class;
                        object.unsubscribe(clazz, (EventHandler)object2);
                        object2 = null;
                        this.dataCollectionDefaultChangeEventHandler = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = this.this$0;
                object2 = FirebaseMessaging.access$000((FirebaseMessaging)object2);
                object2 = ((FirebaseApp)object2).getApplicationContext();
                object = FCM_PREFERENCES;
                clazz = null;
                object2 = object2.getSharedPreferences((String)object, 0);
                object2 = object2.edit();
                object = AUTO_INIT_PREF;
                object2.putBoolean((String)object, bl2);
                object2.apply();
                if (bl2) {
                    object2 = this.this$0;
                    FirebaseMessaging.access$100((FirebaseMessaging)object2);
                }
                this.autoInitEnabled = bl3 = Boolean.valueOf(bl2);
                return;
            }
            throw throwable2;
        }
    }
}

