/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.SparseArray
 */
package androidx.legacy.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver
extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final SparseArray sActiveWakeLocks;

    static {
        SparseArray sparseArray;
        sActiveWakeLocks = sparseArray = new SparseArray();
        mNextId = 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean completeWakefulIntent(Intent intent) {
        String string2 = EXTRA_WAKE_LOCK_ID;
        Object object = null;
        int n3 = intent.getIntExtra(string2, 0);
        if (n3 == 0) {
            return false;
        }
        string2 = sActiveWakeLocks;
        synchronized (string2) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    object = string2.get(n3);
                    object = (PowerManager.WakeLock)object;
                    bl2 = true;
                    if (object != null) {
                        object.release();
                        string2.remove(n3);
                        return bl2;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName startWakefulService(Context object, Intent intent) {
        String string2 = "androidx.core:wake:";
        SparseArray sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            Throwable throwable2;
            block5: {
                int n3;
                int n4;
                block4: {
                    try {
                        int n7;
                        n4 = mNextId;
                        mNextId = n7 = n4 + 1;
                        n3 = 1;
                        if (n7 > 0) break block4;
                        mNextId = n3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                CharSequence charSequence = EXTRA_WAKE_LOCK_ID;
                intent.putExtra((String)charSequence, n4);
                intent = object.startService(intent);
                if (intent == null) {
                    return null;
                }
                charSequence = "power";
                object = object.getSystemService((String)charSequence);
                object = (PowerManager)object;
                charSequence = new StringBuilder(string2);
                string2 = intent.flattenToShortString();
                ((StringBuilder)charSequence).append(string2);
                string2 = ((StringBuilder)charSequence).toString();
                object = object.newWakeLock(n3, string2);
                string2 = null;
                object.setReferenceCounted(false);
                long l2 = 60000L;
                object.acquire(l2);
                sparseArray.put(n4, object);
                return intent;
            }
            throw throwable2;
        }
    }
}

