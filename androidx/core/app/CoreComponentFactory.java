/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AppComponentFactory
 *  android.app.Application
 *  android.app.Service
 *  android.content.BroadcastReceiver
 *  android.content.ContentProvider
 *  android.content.Intent
 */
package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory$a;

public class CoreComponentFactory
extends AppComponentFactory {
    public static Object a(Object object) {
        boolean bl2 = object instanceof CoreComponentFactory$a;
        if (bl2) {
            Object object2 = object;
            object2 = ((CoreComponentFactory$a)object).a();
            if (object2 != null) {
                return object2;
            }
        }
        return object;
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String string2, Intent intent) {
        return (Activity)CoreComponentFactory.a(super.instantiateActivity(classLoader, string2, intent));
    }

    public final Application instantiateApplication(ClassLoader classLoader, String string2) {
        return (Application)CoreComponentFactory.a(super.instantiateApplication(classLoader, string2));
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String string2) {
        return (ContentProvider)CoreComponentFactory.a(super.instantiateProvider(classLoader, string2));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String string2, Intent intent) {
        return (BroadcastReceiver)CoreComponentFactory.a(super.instantiateReceiver(classLoader, string2, intent));
    }

    public final Service instantiateService(ClassLoader classLoader, String string2, Intent intent) {
        return (Service)CoreComponentFactory.a(super.instantiateService(classLoader, string2, intent));
    }
}

