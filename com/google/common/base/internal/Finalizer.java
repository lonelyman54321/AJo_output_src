/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer
implements Runnable {
    private static final String FINALIZABLE_REFERENCE = "com.google.common.base.FinalizableReference";
    public static final /* synthetic */ int a;
    private static final Constructor bigThreadConstructor;
    private static final Field inheritableThreadLocals;
    private static final Logger logger;
    private final WeakReference finalizableReferenceClassReference;
    private final PhantomReference frqReference;
    private final ReferenceQueue queue;

    static {
        AccessibleObject accessibleObject;
        logger = Logger.getLogger(Finalizer.class.getName());
        bigThreadConstructor = accessibleObject = Finalizer.getBigThreadConstructor();
        accessibleObject = accessibleObject == null ? Finalizer.getInheritableThreadLocalsField() : null;
        inheritableThreadLocals = accessibleObject;
    }

    private Finalizer(Class clazz, ReferenceQueue weakReference, PhantomReference phantomReference) {
        this.queue = weakReference;
        this.finalizableReferenceClassReference = weakReference = new WeakReference<Class>(clazz);
        this.frqReference = phantomReference;
    }

    private boolean cleanUp(Reference reference) {
        Method method = this.getFinalizeReferentMethod();
        if (method == null) {
            return false;
        }
        boolean bl2 = this.finalizeReference(reference, method);
        if (!bl2) {
            return false;
        }
        do {
            if ((reference = this.queue.poll()) != null) continue;
            return true;
        } while (bl2 = this.finalizeReference(reference, method));
        return false;
    }

    private boolean finalizeReference(Reference reference, Method object) {
        reference.clear();
        Object object2 = this.frqReference;
        if (reference == object2) {
            return false;
        }
        object2 = null;
        try {
            ((Method)object).invoke((Object)reference, null);
        }
        catch (Throwable throwable) {
            object = logger;
            object2 = Level.SEVERE;
            String string2 = "Error cleaning up after reference.";
            ((Logger)object).log((Level)object2, string2, throwable);
        }
        return true;
    }

    private static Constructor getBigThreadConstructor() {
        int n3;
        Class clazz;
        Class[] classArray;
        Class<Thread> clazz2 = Thread.class;
        int n4 = 5;
        try {
            classArray = new Class[n4];
            clazz = ThreadGroup.class;
            n3 = 0;
        }
        catch (Throwable throwable) {
            return null;
        }
        classArray[0] = clazz;
        clazz = Runnable.class;
        n3 = 1;
        classArray[n3] = clazz;
        clazz = String.class;
        n3 = 2;
        classArray[n3] = clazz;
        clazz = Long.TYPE;
        n3 = 3;
        classArray[n3] = clazz;
        clazz = Boolean.TYPE;
        n3 = 4;
        classArray[n3] = clazz;
        return clazz2.getConstructor(classArray);
    }

    private Method getFinalizeReferentMethod() {
        Class clazz = (Class)this.finalizableReferenceClassReference.get();
        AssertionError assertionError = null;
        if (clazz == null) {
            return null;
        }
        String string2 = "finalizeReferent";
        try {
            return clazz.getMethod(string2, null);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            assertionError = new AssertionError((Object)noSuchMethodException);
            throw assertionError;
        }
    }

    private static Field getInheritableThreadLocalsField() {
        boolean bl2;
        Object object = Thread.class;
        Object object2 = "inheritableThreadLocals";
        try {
            object = ((Class)object).getDeclaredField((String)object2);
            bl2 = true;
        }
        catch (Throwable throwable) {
            object = logger;
            object2 = Level.INFO;
            ((Logger)object).log((Level)object2, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
        ((AccessibleObject)object).setAccessible(bl2);
        return object;
    }

    public static void startFinalizer(Class object, ReferenceQueue object2, PhantomReference object3) {
        Object object4;
        int n3 = 1;
        Object object5 = ((Class)object).getName();
        boolean bl2 = ((String)object5).equals(object4 = FINALIZABLE_REFERENCE);
        if (bl2) {
            block17: {
                block16: {
                    object5 = new Finalizer((Class)object, (ReferenceQueue)object2, (PhantomReference)object3);
                    object = Finalizer.class.getName();
                    object2 = bigThreadConstructor;
                    object3 = null;
                    if (object2 != null) {
                        long l2 = 0L;
                        object4 = l2;
                        int n4 = 5;
                        Object[] objectArray = new Object[n4];
                        int n7 = 0;
                        String string2 = null;
                        objectArray[0] = null;
                        objectArray[n3] = object5;
                        n7 = 2;
                        objectArray[n7] = object;
                        n7 = 3;
                        objectArray[n7] = object4;
                        object4 = Boolean.FALSE;
                        n7 = 4;
                        objectArray[n7] = object4;
                        object2 = ((Constructor)object2).newInstance(objectArray);
                        try {
                            object2 = (Thread)object2;
                            break block16;
                        }
                        catch (Throwable throwable) {
                            object4 = logger;
                            objectArray = Level.INFO;
                            string2 = "Failed to create a thread without inherited thread-local values";
                            ((Logger)object4).log((Level)objectArray, string2, throwable);
                        }
                    }
                    object2 = null;
                }
                if (object2 == null) {
                    object2 = new Thread(null, (Runnable)object5, (String)object);
                }
                ((Thread)object2).setDaemon(n3 != 0);
                object = inheritableThreadLocals;
                if (object == null) break block17;
                try {
                    ((Field)object).set(object2, null);
                }
                catch (Throwable throwable) {
                    object3 = logger;
                    Level level = Level.INFO;
                    object5 = "Failed to clear thread local values inherited by reference finalizer thread.";
                    ((Logger)object3).log(level, (String)object5, throwable);
                }
            }
            ((Thread)object2).start();
            return;
        }
        object = new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        throw object;
    }

    public void run() {
        while (true) {
            Object object;
            try {
                object = this.queue;
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            object = ((ReferenceQueue)object).remove();
            boolean bl2 = this.cleanUp((Reference)object);
            if (bl2) continue;
            return;
            break;
        }
    }
}

