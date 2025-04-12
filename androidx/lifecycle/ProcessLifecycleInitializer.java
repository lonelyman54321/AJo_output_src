/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Handler
 */
package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.i$a;
import androidx.lifecycle.m;
import androidx.lifecycle.m$a;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class ProcessLifecycleInitializer
implements wh1_0 {
    public final Object a(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = Bo.c(object);
        Intrinsics.checkNotNullExpressionValue(object3, "getInstance(context)");
        object3 = ((Bo)object3).b;
        Object object4 = ProcessLifecycleInitializer.class;
        boolean bl2 = ((HashSet)object3).contains(object4);
        if (bl2) {
            Object object5;
            object3 = m.a;
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = m.a;
            boolean bl3 = true;
            bl2 = ((AtomicBoolean)object3).getAndSet(bl3);
            object4 = "null cannot be cast to non-null type android.app.Application";
            if (!bl2) {
                object3 = object.getApplicationContext();
                Intrinsics.checkNotNull(object3, (String)object4);
                object3 = (Application)object3;
                object5 = new m$a();
                object3.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object5);
            }
            object3 = r.i;
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = r.i;
            object3.getClass();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = new Handler();
            ((r)object3).e = object2;
            object2 = ((r)object3).f;
            object5 = i$a.ON_CREATE;
            ((o)object2).f((i$a)((Object)object5));
            object = object.getApplicationContext();
            Intrinsics.checkNotNull(object, (String)object4);
            object = (Application)object;
            object2 = new s((r)object3);
            object.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
            return object3;
        }
        object2 = "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final List dependencies() {
        return mz0_2.a;
    }
}

