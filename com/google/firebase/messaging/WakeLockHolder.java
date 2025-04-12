/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;
import com.google.firebase.messaging.n;
import java.util.concurrent.TimeUnit;

final class WakeLockHolder {
    private static final String EXTRA_WAKEFUL_INTENT = "com.google.firebase.iid.WakeLockHolder.wakefulintent";
    static final long WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS;
    private static final Object syncObject;
    private static WakeLock wakeLock;

    static {
        Object object;
        WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS = TimeUnit.MINUTES.toMillis(1L);
        syncObject = object = new Object();
    }

    public static /* synthetic */ void a(Intent intent, Task task2) {
        WakeLockHolder.completeWakefulIntent(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void acquireWakeLock(Intent object, long l2) {
        Object object2 = syncObject;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        WakeLock wakeLock = WakeLockHolder.wakeLock;
                        if (wakeLock == null) break block3;
                        boolean bl2 = true;
                        WakeLockHolder.setAsWakefulIntent((Intent)object, bl2);
                        object = WakeLockHolder.wakeLock;
                        ((WakeLock)object).acquire(l2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private static void checkAndInitWakeLock(Context context) {
        WakeLock wakeLock = WakeLockHolder.wakeLock;
        if (wakeLock == null) {
            String string2 = "wake:com.google.firebase.iid.WakeLockHolder";
            boolean bl2 = true;
            WakeLockHolder.wakeLock = wakeLock = new WakeLock(context, (int)(bl2 ? 1 : 0), string2);
            wakeLock.setReferenceCounted(bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void completeWakefulIntent(Intent object) {
        Object object2 = syncObject;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2;
                        WakeLock wakeLock = WakeLockHolder.wakeLock;
                        if (wakeLock == null || !(bl2 = WakeLockHolder.isWakefulIntent((Intent)object))) break block3;
                        bl2 = false;
                        wakeLock = null;
                        WakeLockHolder.setAsWakefulIntent((Intent)object, false);
                        object = WakeLockHolder.wakeLock;
                        ((WakeLock)object).release();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void initWakeLock(Context context) {
        Object object = syncObject;
        synchronized (object) {
            WakeLockHolder.checkAndInitWakeLock(context);
            return;
        }
    }

    public static boolean isWakefulIntent(Intent intent) {
        return intent.getBooleanExtra(EXTRA_WAKEFUL_INTENT, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void reset() {
        Object object = syncObject;
        synchronized (object) {
            Object var1_1 = null;
            wakeLock = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void sendWakefulServiceIntent(Context object, WithinAppServiceConnection object2, Intent intent) {
        Object object3 = syncObject;
        synchronized (object3) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        WakeLockHolder.checkAndInitWakeLock((Context)object);
                        boolean bl2 = WakeLockHolder.isWakefulIntent(intent);
                        boolean bl3 = true;
                        WakeLockHolder.setAsWakefulIntent(intent, bl3);
                        if (bl2) break block3;
                        object = wakeLock;
                        long l2 = WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS;
                        ((WakeLock)object).acquire(l2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = ((WithinAppServiceConnection)object2).sendIntent(intent);
                object2 = new n(intent);
                ((Task)object).addOnCompleteListener((OnCompleteListener)object2);
                return;
            }
            throw throwable2;
        }
    }

    private static void setAsWakefulIntent(Intent intent, boolean bl2) {
        intent.putExtra(EXTRA_WAKEFUL_INTENT, bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName startWakefulService(Context context, Intent object) {
        Object object2 = syncObject;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    WakeLockHolder.checkAndInitWakeLock(context);
                    bl2 = WakeLockHolder.isWakefulIntent((Intent)object);
                    boolean bl3 = true;
                    WakeLockHolder.setAsWakefulIntent((Intent)object, bl3);
                    context = context.startService((Intent)object);
                    if (context == null) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (!bl2) {
                    object = wakeLock;
                    long l2 = WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS;
                    ((WakeLock)object).acquire(l2);
                }
                return context;
            }
            throw throwable2;
        }
    }
}

