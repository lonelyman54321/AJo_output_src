/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.appevents.suggestedevents.ViewObserver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class ViewObserver$a {
    public static void a(Activity object) {
        block18: {
            Object object2 = "activity";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n3 = object.hashCode();
            Object object3 = ViewObserver.d;
            object3 = ViewObserver.class;
            boolean bl2 = td0.b(object3);
            HashMap hashMap = null;
            if (!bl2) {
                try {
                    hashMap = ViewObserver.d;
                }
                catch (Throwable throwable) {
                    td0.a(object3, throwable);
                }
            }
            object2 = n3;
            Object object4 = hashMap.get(object2);
            if (object4 == null) {
                object4 = new ViewObserver((Activity)object);
                hashMap.put(object2, object4);
            }
            object4 = (ViewObserver)object4;
            boolean bl3 = td0.b(object3);
            if (!bl3) {
                bl3 = td0.b(object4);
                if (bl3) break block18;
                AtomicBoolean atomicBoolean = ((ViewObserver)object4).c;
                boolean bl4 = true;
                bl3 = atomicBoolean.getAndSet(bl4);
                if (bl3) break block18;
                WeakReference weakReference = ((ViewObserver)object4).a;
                Object t3 = weakReference.get();
                Activity activity = (Activity)t3;
                View view = tn_0.b(activity);
                if (view == null) break block18;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                boolean bl5 = viewTreeObserver.isAlive();
                if (!bl5) break block18;
                try {
                    viewTreeObserver.addOnGlobalLayoutListener(object4);
                    ((ViewObserver)object4).a();
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(object4, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(object3, throwable2);
                    }
                }
            }
        }
    }

    public static void b(Activity object) {
        block17: {
            Intrinsics.checkNotNullParameter(object, "activity");
            int n3 = object.hashCode();
            Object object2 = ViewObserver.d;
            object2 = ViewObserver.class;
            boolean bl2 = td0.b(object2);
            boolean bl3 = false;
            HashMap hashMap = null;
            if (!bl2) {
                try {
                    hashMap = ViewObserver.d;
                }
                catch (Throwable throwable) {
                    td0.a(object2, throwable);
                }
            }
            object = n3;
            object = (ViewObserver)hashMap.remove(object);
            if (object != null && !(bl2 = td0.b(object2))) {
                bl2 = td0.b(object);
                if (bl2) break block17;
                Object object3 = object.c;
                bl3 = false;
                hashMap = null;
                bl2 = ((AtomicBoolean)object3).getAndSet(false);
                if (!bl2) break block17;
                object3 = object.a;
                object3 = ((Reference)object3).get();
                object3 = (Activity)object3;
                object3 = tn_0.b((Activity)object3);
                if (object3 == null) break block17;
                object3 = object3.getViewTreeObserver();
                bl3 = object3.isAlive();
                if (!bl3) break block17;
                try {
                    object3.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a(object, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(object2, throwable2);
                    }
                }
            }
        }
    }
}

