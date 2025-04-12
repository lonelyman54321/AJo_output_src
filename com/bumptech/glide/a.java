/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.View
 */
package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.GeneratedAppGlideModuleImpl;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.b$a;
import com.bumptech.glide.c;
import com.bumptech.glide.d$a;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultPriorityThreadFactory;
import com.bumptech.glide.load.engine.executor.GlideExecutor$DefaultThreadFactory;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
implements ComponentCallbacks2 {
    public static volatile a i;
    public static volatile boolean j;
    public final f a;
    public final ny_0 b;
    public final ON1 c;
    public final c d;
    public final Kp e;
    public final dK2 f;
    public final b g;
    public final ArrayList h;

    public a(Context context, f f5, ad1_1 ad1_12, ny_0 ny_02, SC1 sC1, dK2 dK22, d d2, int n3, b$a a2, Jp jp, List list, List list2, yo yo2, com.bumptech.glide.d d5) {
        c c2;
        f00 f002;
        Object object;
        this.h = object = new Object();
        object = QN1.LOW;
        object = f5;
        this.a = f5;
        this.b = ny_02;
        this.e = sC1;
        this.c = ad1_12;
        this.f = dK22;
        this.g = d2;
        cI2 cI22 = new cI2(this, list2, yo2);
        this.d = c2 = new c(context, sC1, cI22, f002, a2, jp, list, f5, d5, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context object) {
        Object[] objectArray;
        Object object2;
        Object object3;
        int n3;
        Object object4;
        block13: {
            InstantiationException instantiationException2;
            block16: {
                IllegalAccessException illegalAccessException2;
                block15: {
                    NoSuchMethodException noSuchMethodException2;
                    block14: {
                        object4 = null;
                        n3 = 1;
                        object3 = i;
                        if (object3 != null) return i;
                        object3 = object.getApplicationContext();
                        object2 = GeneratedAppGlideModuleImpl.class;
                        try {
                            Class<Context> clazz;
                            objectArray = new Class[n3];
                            objectArray[0] = clazz = Context.class;
                            object2 = ((Class)object2).getDeclaredConstructor((Class<?>[])objectArray);
                            object3 = object3.getApplicationContext();
                            objectArray = new Object[n3];
                            objectArray[0] = object3;
                            object3 = ((Constructor)object2).newInstance(objectArray);
                            object3 = (GeneratedAppGlideModule)object3;
                            break block13;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block14;
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block15;
                        }
                        catch (InstantiationException instantiationException2) {
                            break block16;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            int n4 = 5;
                            Log.isLoggable((String)"Glide", (int)n4);
                            object3 = null;
                            break block13;
                        }
                        object4 = new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", invocationTargetException);
                        throw object4;
                    }
                    object4 = new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", noSuchMethodException2);
                    throw object4;
                }
                object4 = new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", illegalAccessException2);
                throw object4;
            }
            object4 = new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", instantiationException2);
            throw object4;
        }
        object2 = a.class;
        synchronized (object2) {
            objectArray = i;
            if (objectArray != null) return i;
            boolean bl2 = j;
            if (bl2) {
                object4 = "Glide has been called recursively, this is probably an internal library error!";
                object = new IllegalStateException((String)object4);
                throw object;
            }
            j = n3;
            try {
                com.bumptech.glide.a.b(object, (GeneratedAppGlideModule)object3);
            }
            finally {
                j = false;
            }
            return i;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n3;
        Object object6;
        long l2;
        TimeUnit timeUnit;
        int n4;
        Object object7;
        int n7;
        int n8;
        boolean bl2;
        Class clazz;
        Object object8;
        int n10;
        int n14;
        Object object9;
        Object object10;
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        Object object11 = new com.bumptech.glide.b();
        Context context2 = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.c();
        }
        Object object12 = "ManifestParser";
        int n15 = 3;
        Log.isLoggable((String)object12, (int)n15);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n16 = 2;
        try {
            object10 = context2.getPackageManager();
            object9 = context2.getPackageName();
            n14 = 128;
            object10 = object10.getApplicationInfo((String)object9, n14);
            if (object10 != null && (object9 = ((ApplicationInfo)object10).metaData) != null) {
                n10 = Log.isLoggable((String)object12, (int)n16);
                if (n10) {
                    object9 = ((ApplicationInfo)object10).metaData;
                    Objects.toString(object9);
                }
                object9 = ((ApplicationInfo)object10).metaData;
                object9 = object9.keySet();
                object9 = object9.iterator();
                while ((n14 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                    object8 = object9.next();
                    clazz = "GlideModule";
                    Bundle bundle = ((ApplicationInfo)object10).metaData;
                    Object object13 = bundle.get((String)(object8 = (String)object8));
                    bl2 = ((String)((Object)clazz)).equals(object13);
                    if (!bl2) continue;
                    object8 = IG1.a((String)object8);
                    arrayList.add(object8);
                    Log.isLoggable((String)object12, (int)n15);
                }
                Log.isLoggable((String)object12, (int)n15);
            } else {
                Log.isLoggable((String)object12, (int)n15);
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            n8 = 6;
            Log.isLoggable((String)object12, (int)n8);
        }
        object12 = "Glide";
        if (generatedAppGlideModule2 != null && (n8 = (int)((object10 = generatedAppGlideModule.d()).isEmpty() ? 1 : 0)) == 0) {
            object10 = generatedAppGlideModule.d();
            object9 = arrayList.iterator();
            while ((n14 = (int)(object9.hasNext() ? 1 : 0)) != 0) {
                object8 = (SZ0)object9.next();
                clazz = object8.getClass();
                bl2 = object10.contains(clazz);
                if (!bl2) continue;
                bl2 = Log.isLoggable((String)object12, (int)n15);
                if (bl2) {
                    object8.toString();
                }
                object9.remove();
            }
        }
        if ((n7 = Log.isLoggable((String)object12, (int)n15)) != 0) {
            object12 = arrayList.iterator();
            while ((n15 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
                object7 = ((SZ0)object12.next()).getClass();
                object7.toString();
            }
        }
        if (generatedAppGlideModule2 != null) {
            object12 = generatedAppGlideModule.e();
        } else {
            n7 = 0;
            object12 = null;
        }
        ((com.bumptech.glide.b)object11).n = object12;
        object12 = arrayList.iterator();
        while ((n15 = (int)(object12.hasNext() ? 1 : 0)) != 0) {
            object7 = (SZ0)object12.next();
            object7.getClass();
        }
        if (generatedAppGlideModule2 != null) {
            generatedAppGlideModule2.b(context2, (com.bumptech.glide.b)object11);
        }
        object12 = ((com.bumptech.glide.b)object11).g;
        n15 = 4;
        n8 = 0;
        object10 = null;
        if (object12 == null) {
            object12 = new Object();
            n10 = GlideExecutor.c;
            if (!n10) {
                object9 = Runtime.getRuntime();
                n10 = ((Runtime)object9).availableProcessors();
                n10 = Math.min(n15, n10);
                GlideExecutor.c = n10;
            }
            n4 = GlideExecutor.c;
            object9 = "source";
            n14 = (int)(TextUtils.isEmpty((CharSequence)object9) ? 1 : 0);
            if (n14 != 0) {
                object11 = new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                throw object11;
            }
            timeUnit = TimeUnit.MILLISECONDS;
            PriorityBlockingQueue<Runnable> priorityBlockingQueue = new PriorityBlockingQueue<Runnable>();
            clazz = new GlideExecutor$DefaultThreadFactory((GlideExecutor$DefaultPriorityThreadFactory)object12, (String)object9, false);
            l2 = 0L;
            object6 = object8;
            object8 = new ThreadPoolExecutor(n4, n4, l2, timeUnit, priorityBlockingQueue, (ThreadFactory)((Object)clazz));
            ((com.bumptech.glide.b)object11).g = object12 = new GlideExecutor((ThreadPoolExecutor)object8);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).h) == null) {
            n7 = GlideExecutor.c;
            object12 = new Object();
            object9 = "disk-cache";
            n14 = (int)(TextUtils.isEmpty((CharSequence)object9) ? 1 : 0);
            if (n14 != 0) {
                object11 = new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                throw object11;
            }
            timeUnit = TimeUnit.MILLISECONDS;
            PriorityBlockingQueue<Runnable> priorityBlockingQueue = new PriorityBlockingQueue<Runnable>();
            n3 = 1;
            float f5 = Float.MIN_VALUE;
            clazz = new GlideExecutor$DefaultThreadFactory((GlideExecutor$DefaultPriorityThreadFactory)object12, (String)object9, n3 != 0);
            l2 = 0L;
            object6 = object8;
            n4 = n3;
            object8 = new ThreadPoolExecutor(n3, n3, l2, timeUnit, priorityBlockingQueue, (ThreadFactory)((Object)clazz));
            ((com.bumptech.glide.b)object11).h = object12 = new GlideExecutor((ThreadPoolExecutor)object8);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).o) == null) {
            n7 = GlideExecutor.c;
            if (n7 == 0) {
                object12 = Runtime.getRuntime();
                n7 = ((Runtime)object12).availableProcessors();
                GlideExecutor.c = n7 = Math.min(n15, n7);
            }
            n7 = GlideExecutor.c;
            n10 = 1;
            n4 = n7 >= n15 ? 2 : 1;
            object12 = new Object();
            object7 = "animation";
            n16 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
            if (n16 != 0) {
                object11 = new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                throw object11;
            }
            timeUnit = TimeUnit.MILLISECONDS;
            PriorityBlockingQueue<Runnable> priorityBlockingQueue = new PriorityBlockingQueue<Runnable>();
            object8 = new GlideExecutor$DefaultThreadFactory((GlideExecutor$DefaultPriorityThreadFactory)object12, (String)object7, n10 != 0);
            l2 = 0L;
            object6 = object5;
            object5 = new ThreadPoolExecutor(n4, n4, l2, timeUnit, priorityBlockingQueue, (ThreadFactory)object8);
            ((com.bumptech.glide.b)object11).o = object12 = new GlideExecutor((ThreadPoolExecutor)object5);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).j) == null) {
            object12 = new VN1$a(context2);
            ((com.bumptech.glide.b)object11).j = object7 = new VN1((VN1$a)object12);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).k) == null) {
            ((com.bumptech.glide.b)object11).k = object12 = new Object();
        }
        if ((object12 = ((com.bumptech.glide.b)object11).d) == null) {
            object12 = ((com.bumptech.glide.b)object11).j;
            n7 = ((VN1)object12).a;
            if (n7 > 0) {
                long l3 = n7;
                ((com.bumptech.glide.b)object11).d = object7 = new tc1_0(l3);
            } else {
                ((com.bumptech.glide.b)object11).d = object12 = new Object();
            }
        }
        if ((object12 = ((com.bumptech.glide.b)object11).e) == null) {
            object7 = ((com.bumptech.glide.b)object11).j;
            n15 = ((VN1)object7).c;
            ((com.bumptech.glide.b)object11).e = object12 = new SC1(n15);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).f) == null) {
            object7 = ((com.bumptech.glide.b)object11).j;
            n15 = ((VN1)object7).b;
            long l4 = n15;
            ((com.bumptech.glide.b)object11).f = object12 = new VC1(l4);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).i) == null) {
            object7 = "image_manager_disk_cache";
            ((com.bumptech.glide.b)object11).i = object12 = new uj1_0(context2, (String)object7);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).c) == null) {
            object7 = ((com.bumptech.glide.b)object11).f;
            object5 = ((com.bumptech.glide.b)object11).i;
            GlideExecutor glideExecutor = ((com.bumptech.glide.b)object11).h;
            object4 = ((com.bumptech.glide.b)object11).g;
            timeUnit = TimeUnit.MILLISECONDS;
            SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<Runnable>();
            clazz = new Object();
            object8 = new GlideExecutor$DefaultThreadFactory((GlideExecutor$DefaultPriorityThreadFactory)((Object)clazz), "source-unlimited", false);
            l2 = GlideExecutor.b;
            object3 = null;
            n4 = -1 >>> 1;
            object6 = object9;
            object9 = new ThreadPoolExecutor(0, n4, l2, timeUnit, synchronousQueue, (ThreadFactory)object8);
            object2 = new GlideExecutor((ThreadPoolExecutor)object9);
            object = ((com.bumptech.glide.b)object11).o;
            object8 = object7;
            object8 = (ad1_1)object7;
            clazz = object5;
            clazz = (uj1_0)object5;
            object9 = object12;
            ((com.bumptech.glide.b)object11).c = object12 = new f((ad1_1)object8, (uj1_0)((Object)clazz), glideExecutor, (GlideExecutor)object4, (GlideExecutor)object2, (GlideExecutor)object);
        }
        if ((object12 = ((com.bumptech.glide.b)object11).p) == null) {
            object12 = Collections.emptyList();
            ((com.bumptech.glide.b)object11).p = object12;
        } else {
            object12 = Collections.unmodifiableList(object12);
            ((com.bumptech.glide.b)object11).p = object12;
        }
        object12 = ((com.bumptech.glide.b)object11).b;
        object12.getClass();
        com.bumptech.glide.d d2 = new com.bumptech.glide.d((d$a)object12);
        object12 = ((com.bumptech.glide.b)object11).n;
        object8 = new dK2((dK2$b)object12);
        object7 = ((com.bumptech.glide.b)object11).c;
        object12 = ((com.bumptech.glide.b)object11).f;
        object10 = ((com.bumptech.glide.b)object11).d;
        object9 = ((com.bumptech.glide.b)object11).e;
        clazz = ((com.bumptech.glide.b)object11).k;
        n3 = ((com.bumptech.glide.b)object11).l;
        object4 = ((com.bumptech.glide.b)object11).m;
        object2 = ((com.bumptech.glide.b)object11).a;
        object5 = ((com.bumptech.glide.b)object11).p;
        object6 = object12;
        object6 = (ad1_1)object12;
        object11 = object;
        object12 = context2;
        object3 = object5;
        object5 = object6;
        object = object3;
        generatedAppGlideModule2 = generatedAppGlideModule;
        object11 = new a(context2, (f)object7, (ad1_1)object6, (ny_0)object10, (SC1)object9, (dK2)object8, (d)((Object)clazz), n3, (b$a)object4, (Jp)object2, (List)object3, arrayList, generatedAppGlideModule, d2);
        context2.registerComponentCallbacks((ComponentCallbacks)object11);
        i = object11;
    }

    public static RequestManager e(Context context) {
        dV0.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return com.bumptech.glide.a.a((Context)context).f.c(context);
    }

    public static RequestManager f(View object) {
        boolean bl2;
        Object object2 = object.getContext();
        dV0.c(object2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        object2 = com.bumptech.glide.a.a((Context)object2).f;
        object2.getClass();
        Object object3 = dz3.a;
        object3 = Looper.myLooper();
        Object object4 = Looper.getMainLooper();
        boolean bl3 = false;
        boolean bl4 = true;
        if (object3 == object4) {
            bl2 = true;
        } else {
            bl2 = false;
            object3 = null;
        }
        if (bl2 ^= bl4) {
            object = object.getContext().getApplicationContext();
            object = ((dK2)object2).c((Context)object);
        } else {
            object3 = object.getContext();
            object4 = "Unable to obtain a request manager for a view without a Context";
            dV0.c(object3, (String)object4);
            object3 = dK2.a(object.getContext());
            if (object3 == null) {
                object = object.getContext().getApplicationContext();
                object = ((dK2)object2).c((Context)object);
            } else {
                boolean bl5 = object3 instanceof FragmentActivity;
                if (bl5) {
                    Object object5;
                    boolean bl6;
                    object3 = (FragmentActivity)object3;
                    object4 = ((dK2)object2).c;
                    ((a53)object4).clear();
                    dK2.b(((FragmentActivity)object3).getSupportFragmentManager().c.f(), (Jp)object4);
                    int n3 = 0x1020002;
                    View view = object3.findViewById(n3);
                    Fragment fragment = null;
                    while (!(bl6 = object.equals(view)) && (fragment = (Fragment)((a53)object4).get(object)) == null && (bl6 = (object5 = object.getParent()) instanceof View)) {
                        object = (View)object.getParent();
                    }
                    ((a53)object4).clear();
                    if (fragment != null) {
                        boolean bl7;
                        dV0.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                        object = Looper.myLooper();
                        object3 = Looper.getMainLooper();
                        if (object == object3) {
                            bl3 = true;
                        }
                        if (bl7 = bl3 ^ true) {
                            object = fragment.getContext().getApplicationContext();
                            object = ((dK2)object2).c((Context)object);
                        } else {
                            object = fragment.getActivity();
                            if (object != null) {
                                object = ((dK2)object2).d;
                                object3 = fragment.getActivity();
                                object.b((Activity)object3);
                            }
                            FragmentManager fragmentManager = fragment.getChildFragmentManager();
                            Context context = fragment.getContext();
                            a a2 = com.bumptech.glide.a.a(context.getApplicationContext());
                            i i3 = fragment.getLifecycle();
                            boolean bl8 = fragment.isVisible();
                            object5 = ((dK2)object2).e;
                            object = ((pu1_0)object5).a(context, a2, i3, fragmentManager, bl8);
                        }
                    } else {
                        object = ((dK2)object2).d((FragmentActivity)object3);
                    }
                } else {
                    object = object.getContext().getApplicationContext();
                    object = ((dK2)object2).c((Context)object);
                }
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(int n3) {
        dz3.a();
        ArrayList arrayList = this.h;
        synchronized (arrayList) {
            try {
                Object object = this.h;
                object = ((ArrayList)object).iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 5] lbl9 : MonitorExitStatement: MONITOREXIT : var2_2
                        this.c.a(n3);
                        this.b.a(n3);
                        this.e.a(n3);
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (RequestManager)object2;
                    object2.getClass();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(RequestManager object) {
        ArrayList arrayList = this.h;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                Object object2;
                try {
                    object2 = this.h;
                    boolean bl2 = ((ArrayList)object2).contains(object);
                    if (bl2) {
                        object2 = this.h;
                        ((ArrayList)object2).remove(object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object2 = "Cannot unregister not yet registered manager";
                object = new IllegalStateException((String)object2);
                throw object;
            }
            throw throwable2;
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        dz3.a();
        this.c.b();
        this.b.b();
        this.e.b();
    }

    public final void onTrimMemory(int n3) {
        this.c(n3);
    }
}

