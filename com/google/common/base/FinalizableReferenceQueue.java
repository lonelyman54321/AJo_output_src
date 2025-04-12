/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.FinalizableReference;
import com.google.common.base.FinalizableReferenceQueue$DecoupledLoader;
import com.google.common.base.FinalizableReferenceQueue$DirectLoader;
import com.google.common.base.FinalizableReferenceQueue$FinalizerLoader;
import com.google.common.base.FinalizableReferenceQueue$SystemLoader;
import java.io.Closeable;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalizableReferenceQueue
implements Closeable {
    private static final String FINALIZER_CLASS_NAME = "com.google.common.base.internal.Finalizer";
    private static final Logger logger = Logger.getLogger(FinalizableReferenceQueue.class.getName());
    private static final Method startFinalizer;
    final PhantomReference frqRef;
    final ReferenceQueue queue;
    final boolean threadStarted;

    static {
        FinalizableReferenceQueue$SystemLoader finalizableReferenceQueue$SystemLoader = new FinalizableReferenceQueue$SystemLoader();
        FinalizableReferenceQueue$DecoupledLoader finalizableReferenceQueue$DecoupledLoader = new FinalizableReferenceQueue$DecoupledLoader();
        FinalizableReferenceQueue$DirectLoader finalizableReferenceQueue$DirectLoader = new FinalizableReferenceQueue$DirectLoader();
        FinalizableReferenceQueue$FinalizerLoader[] finalizableReferenceQueue$FinalizerLoaderArray = new FinalizableReferenceQueue$FinalizerLoader[]{finalizableReferenceQueue$SystemLoader, finalizableReferenceQueue$DecoupledLoader, finalizableReferenceQueue$DirectLoader};
        startFinalizer = FinalizableReferenceQueue.getStartFinalizer(FinalizableReferenceQueue.loadFinalizer(finalizableReferenceQueue$FinalizerLoaderArray));
    }

    public FinalizableReferenceQueue() {
        IllegalAccessException illegalAccessException2;
        AssertionError assertionError;
        block10: {
            int n3;
            block8: {
                n3 = 1;
                assertionError = null;
                Object object = new ReferenceQueue();
                this.queue = object;
                Object object2 = new PhantomReference(this, object);
                this.frqRef = object2;
                Object object3 = startFinalizer;
                int n4 = 3;
                Object[] objectArray = new Object[n4];
                Class<FinalizableReference> clazz = FinalizableReference.class;
                objectArray[0] = clazz;
                objectArray[n3] = object;
                int n7 = 2;
                objectArray[n7] = object2;
                n7 = 0;
                object = null;
                try {
                    ((Method)object3).invoke(null, objectArray);
                    break block8;
                }
                catch (Throwable throwable) {
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block10;
                }
                object = logger;
                object2 = Level.INFO;
                object3 = "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.";
                ((Logger)object).log((Level)object2, (String)object3, throwable);
                n3 = 0;
                Object var10_12 = null;
            }
            this.threadStarted = n3;
            return;
        }
        assertionError = new AssertionError((Object)illegalAccessException2);
        throw assertionError;
    }

    public static /* synthetic */ Logger access$000() {
        return logger;
    }

    public static Method getStartFinalizer(Class clazz) {
        int n3;
        Class clazz2;
        Class[] classArray;
        Object object = "startFinalizer";
        int n4 = 3;
        try {
            classArray = new Class[n4];
            clazz2 = Class.class;
            n3 = 0;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = new AssertionError((Object)noSuchMethodException);
            throw object;
        }
        classArray[0] = clazz2;
        clazz2 = ReferenceQueue.class;
        n3 = 1;
        classArray[n3] = clazz2;
        clazz2 = PhantomReference.class;
        n3 = 2;
        classArray[n3] = clazz2;
        return clazz.getMethod((String)object, classArray);
    }

    private static Class loadFinalizer(FinalizableReferenceQueue$FinalizerLoader ... object) {
        int n3 = ((FinalizableReferenceQueue$FinalizerLoader[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Class clazz = object[i3].loadFinalizer();
            if (clazz == null) continue;
            return clazz;
        }
        object = new AssertionError();
        throw object;
    }

    public void cleanUp() {
        Object object;
        boolean bl2 = this.threadStarted;
        if (bl2) {
            return;
        }
        while ((object = this.queue.poll()) != null) {
            ((Reference)object).clear();
            object = (FinalizableReference)object;
            try {
                object.finalizeReferent();
            }
            catch (Throwable throwable) {
                Logger logger = FinalizableReferenceQueue.logger;
                Level level = Level.SEVERE;
                String string2 = "Error cleaning up after reference.";
                logger.log(level, string2, throwable);
            }
        }
    }

    public void close() {
        this.frqRef.enqueue();
        this.cleanUp();
    }
}

