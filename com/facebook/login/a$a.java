/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.RemoteException
 */
package com.facebook.login;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import com.facebook.login.a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

public final class a$a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "url");
        Object object = a.c;
        ((ReentrantLock)object).lock();
        Object object2 = a.b;
        if (object2 == null && (object2 = a.a) != null) {
            a.b = object2 = ((Wf0)object2).b(null);
        }
        ((ReentrantLock)object).unlock();
        ((ReentrantLock)object).lock();
        object = a.b;
        if (object != null) {
            object2 = new Bundle();
            Object object3 = ((bg0)object).e;
            if (object3 != null) {
                String string2 = "android.support.customtabs.extra.SESSION_ID";
                object2.putParcelable(string2, (Parcelable)object3);
            }
            try {
                object3 = ((bg0)object).b;
                object = ((bg0)object).c;
                object3.mayLaunchUrl((ICustomTabsCallback)object, uri, (Bundle)object2, null);
            }
            catch (RemoteException remoteException) {}
        }
        a.c.unlock();
    }
}

