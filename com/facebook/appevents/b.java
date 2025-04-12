/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.preference.PreferenceManager
 */
package com.facebook.appevents;

import android.content.Context;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class b {
    public static final b a;
    public static final ReentrantReadWriteLock b;
    public static String c;
    public static volatile boolean d;

    static {
        Object object = new Object();
        a = object;
        b = object = new ReentrantReadWriteLock();
    }

    public static void a() {
        boolean bl2;
        Object object;
        ReentrantReadWriteLock reentrantReadWriteLock;
        block8: {
            boolean bl3 = d;
            if (bl3) {
                return;
            }
            reentrantReadWriteLock = b;
            object = reentrantReadWriteLock.writeLock();
            ((ReentrantReadWriteLock.WriteLock)object).lock();
            try {
                bl2 = d;
                if (!bl2) break block8;
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            catch (Throwable throwable) {
                b.writeLock().unlock();
                throw throwable;
            }
        }
        object = FacebookSdk.a();
        object = PreferenceManager.getDefaultSharedPreferences((Context)object);
        String string2 = "com.facebook.appevents.AnalyticsUserIDStore.userID";
        object = object.getString(string2, null);
        c = object;
        bl2 = true;
        d = bl2;
        reentrantReadWriteLock.writeLock().unlock();
    }
}

