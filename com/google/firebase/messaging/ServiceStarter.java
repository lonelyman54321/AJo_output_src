/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.WakeLockHolder;
import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStarter {
    static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;
    public static final int ERROR_UNKNOWN = 500;
    private static final String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = 255;
    private static ServiceStarter instance;
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private Boolean hasWakeLockPermission = null;
    private final Queue messagingEvents;

    private ServiceStarter() {
        ArrayDeque arrayDeque;
        this.messagingEvents = arrayDeque = new ArrayDeque();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int doStartService(Context context, Intent intent) {
        String string2 = this.resolveServiceClassName(context, intent);
        if (string2 != null) {
            int n3 = 3;
            Log.isLoggable((String)"FirebaseMessaging", (int)n3);
            String string3 = context.getPackageName();
            intent.setClassName(string3, string2);
        }
        try {
            boolean bl2 = this.hasWakeLockPermission(context);
            context = bl2 ? WakeLockHolder.startWakefulService(context, intent) : context.startService(intent);
        }
        catch (IllegalStateException illegalStateException2222) {
        }
        if (context == null) {
            return 404;
        }
        return -1;
        catch (SecurityException securityException) {
            return 401;
        }
        ((Object)illegalStateException2222).toString();
        return 402;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ServiceStarter getInstance() {
        Class<ServiceStarter> clazz = ServiceStarter.class;
        synchronized (clazz) {
            try {
                ServiceStarter serviceStarter = instance;
                if (serviceStarter != null) return instance;
                instance = serviceStarter = new ServiceStarter();
                return instance;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String resolveServiceClassName(Context object, Intent intent) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                String string2;
                CharSequence charSequence;
                block9: {
                    try {
                        charSequence = this.firebaseMessagingServiceClassName;
                        if (charSequence == null) break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                    return charSequence;
                }
                charSequence = object.getPackageManager();
                boolean bl2 = false;
                String string3 = null;
                intent = charSequence.resolveService(intent, 0);
                boolean bl3 = false;
                charSequence = null;
                if (intent == null) return null;
                intent = intent.serviceInfo;
                if (intent == null) return null;
                string3 = object.getPackageName();
                bl2 = string3.equals(string2 = intent.packageName);
                if (!bl2) return null;
                string3 = intent.name;
                if (string3 == null) return null;
                charSequence = ".";
                bl3 = string3.startsWith((String)charSequence);
                if (bl3) {
                    charSequence = new StringBuilder();
                    object = object.getPackageName();
                    ((StringBuilder)charSequence).append((String)object);
                    object = intent.name;
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    this.firebaseMessagingServiceClassName = object;
                    return this.firebaseMessagingServiceClassName;
                } else {
                    object = intent.name;
                    this.firebaseMessagingServiceClassName = object;
                }
                return this.firebaseMessagingServiceClassName;
            }
            throw throwable2;
        }
    }

    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }

    public Intent getMessagingEvent() {
        return (Intent)this.messagingEvents.poll();
    }

    public boolean hasAccessNetworkStatePermission(Context object) {
        int n3;
        Object object2 = this.hasAccessNetworkStatePermission;
        if (object2 == null) {
            object2 = "android.permission.ACCESS_NETWORK_STATE";
            n3 = object.checkCallingOrSelfPermission((String)object2);
            if (!n3) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            this.hasAccessNetworkStatePermission = object = Boolean.valueOf(n3 != 0);
        }
        if (!(n3 = (int)(((Boolean)(object = this.hasWakeLockPermission)).booleanValue() ? 1 : 0))) {
            object = "FirebaseMessaging";
            int n4 = 3;
            Log.isLoggable((String)object, (int)n4);
        }
        return this.hasAccessNetworkStatePermission;
    }

    public boolean hasWakeLockPermission(Context object) {
        int n3;
        Object object2 = this.hasWakeLockPermission;
        if (object2 == null) {
            object2 = "android.permission.WAKE_LOCK";
            n3 = object.checkCallingOrSelfPermission((String)object2);
            if (!n3) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            this.hasWakeLockPermission = object = Boolean.valueOf(n3 != 0);
        }
        if (!(n3 = (int)(((Boolean)(object = this.hasWakeLockPermission)).booleanValue() ? 1 : 0))) {
            object = "FirebaseMessaging";
            int n4 = 3;
            Log.isLoggable((String)object, (int)n4);
        }
        return this.hasWakeLockPermission;
    }

    public int startMessagingService(Context context, Intent intent) {
        Log.isLoggable((String)"FirebaseMessaging", (int)3);
        this.messagingEvents.offer(intent);
        intent = new Intent(ACTION_MESSAGING_EVENT);
        String string2 = context.getPackageName();
        intent.setPackage(string2);
        return this.doStartService(context, intent);
    }
}

