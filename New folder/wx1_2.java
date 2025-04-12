/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from wx1
 */
public final class wx1_2 {
    public static volatile int a;
    public static final kf3_2 b;
    public static final ys1_2 c;
    public static final boolean d;
    public static volatile mr2_2 e;
    public static final String[] f;

    static {
        boolean bl2;
        Object object = new kf3_2();
        b = object;
        object = new ys1_2();
        c = object;
        object = "slf4j.detectLoggerNameMismatch";
        try {
            object = System.getProperty((String)object);
        }
        catch (SecurityException securityException) {
            bl2 = false;
            object = null;
        }
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            String string2 = "true";
            bl2 = ((String)object).equalsIgnoreCase(string2);
        }
        d = bl2;
        f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        boolean bl2;
        Object object;
        String string2;
        Object object2;
        Object object3;
        Iterator iterator;
        ArrayList<Object> arrayList;
        block32: {
            boolean bl3;
            arrayList = new ArrayList<Object>();
            iterator = wx1_2.class.getClassLoader();
            object3 = "\" specified via \"slf4j.provider\" system property";
            object2 = "Attempting to load provider \"";
            string2 = System.getProperty("slf4j.provider");
            object = null;
            if (string2 != null && !(bl3 = string2.isEmpty())) {
                CharSequence charSequence;
                block34: {
                    block31: {
                        charSequence = new StringBuilder((String)object2);
                        ((StringBuilder)charSequence).append(string2);
                        ((StringBuilder)charSequence).append((String)object3);
                        object3 = ((StringBuilder)charSequence).toString();
                        object2 = hj2_2.a;
                        object2 = hj2$a_0.INFO;
                        boolean bl4 = hj2_2.d((hj2$a_0)((Object)object2));
                        if (!bl4) break block31;
                        object2 = hj2_2.c();
                        String string3 = "SLF4J(I): ";
                        charSequence = new StringBuilder(string3);
                        ((StringBuilder)charSequence).append((String)object3);
                        object3 = ((StringBuilder)charSequence).toString();
                        ((PrintStream)object2).println((String)object3);
                    }
                    object3 = ((ClassLoader)((Object)iterator)).loadClass(string2);
                    object3 = ((Class)object3).getConstructor(null);
                    object3 = ((Constructor)object3).newInstance(null);
                    try {
                        object = object3 = (mr2_2)object3;
                        break block32;
                    }
                    catch (ClassCastException classCastException) {
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        break block34;
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        break block34;
                    }
                    catch (InstantiationException instantiationException) {
                        break block34;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        break block34;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        break block34;
                    }
                    charSequence = "Specified SLF4JServiceProvider (";
                    object2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)object2).append(string2);
                    string2 = ") does not implement SLF4JServiceProvider interface";
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    hj2_2.b((String)object2, classCastException);
                    break block32;
                }
                charSequence = "Failed to instantiate the specified SLF4JServiceProvider (";
                object2 = new StringBuilder((String)charSequence);
                ((StringBuilder)object2).append(string2);
                string2 = ")";
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                hj2_2.b((String)object2, (Throwable)object3);
            }
        }
        if (object != null) {
            arrayList.add(object);
            return arrayList;
        }
        object3 = System.getSecurityManager();
        if (object3 == null) {
            object3 = mr2_2.class;
            iterator = ServiceLoader.load(object3, (ClassLoader)((Object)iterator));
        } else {
            object3 = new vx1_2((ClassLoader)((Object)iterator));
            iterator = (ServiceLoader)AccessController.doPrivileged(object3);
        }
        iterator = ((ServiceLoader)((Object)iterator)).iterator();
        while (bl2 = iterator.hasNext()) {
            object3 = iterator.next();
            object3 = (mr2_2)object3;
            try {
                arrayList.add(object3);
            }
            catch (ServiceConfigurationError serviceConfigurationError) {
                string2 = "A service provider failed to instantiate:\n";
                object2 = new StringBuilder(string2);
                object3 = serviceConfigurationError.getMessage();
                ((StringBuilder)object2).append((String)object3);
                object3 = ((StringBuilder)object2).toString();
                hj2_2.a(object3);
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static mr2_2 b() {
        Object object;
        int n3;
        int n4;
        block10: {
            n4 = a;
            n3 = 1;
            if (n4 == 0) {
                object = wx1_2.class;
                synchronized (object) {
                    Throwable throwable2;
                    block9: {
                        block8: {
                            try {
                                int n7 = a;
                                if (n7 != 0) break block8;
                                a = n3;
                                wx1_2.c();
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        break block10;
                    }
                    throw throwable2;
                }
            }
        }
        if ((n4 = a) == n3) {
            return b;
        }
        n3 = 2;
        if (n4 == n3) {
            object = new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            throw object;
        }
        n3 = 3;
        if (n4 == n3) {
            return e;
        }
        n3 = 4;
        if (n4 == n3) {
            return c;
        }
        object = new IllegalStateException("Unreachable code");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void c() {
        Exception exception2;
        block12: {
            boolean bl2;
            Object object;
            int n3;
            Object object2;
            int n4;
            int n7;
            Object object3;
            block11: {
                block14: {
                    IOException iOException2;
                    block13: {
                        block10: {
                            try {
                                object3 = wx1_2.a();
                                wx1_2.g((ArrayList)object3);
                                boolean bl3 = ((ArrayList)object3).isEmpty();
                                n7 = 3;
                                n4 = 0;
                                if (bl3) break block10;
                                object2 = ((ArrayList)object3).get(0);
                                object2 = (mr2_2)object2;
                                e = object2;
                                object2 = e;
                                object2.getClass();
                                a = n7;
                                wx1_2.e((ArrayList)object3);
                                break block11;
                            }
                            catch (Exception exception2) {
                                break block12;
                            }
                        }
                        a = n3 = 4;
                        object3 = "No SLF4J providers were found.";
                        hj2_2.e((String)object3);
                        object3 = "Defaulting to no-operation (NOP) logger implementation";
                        hj2_2.e((String)object3);
                        object3 = "See https://www.slf4j.org/codes.html#noProviders for further details.";
                        hj2_2.e((String)object3);
                        object3 = new LinkedHashSet();
                        object2 = wx1_2.class;
                        try {
                            object2 = ((Class)object2).getClassLoader();
                            object = "org/slf4j/impl/StaticLoggerBinder.class";
                            object2 = object2 == null ? ClassLoader.getSystemResources((String)object) : ((ClassLoader)object2).getResources((String)object);
                        }
                        catch (IOException iOException2) {
                            break block13;
                        }
                        while (bl2 = object2.hasMoreElements()) {
                            object = object2.nextElement();
                            object = (URL)object;
                            object3.add(object);
                        }
                        break block14;
                    }
                    object = "Error getting resources from path";
                    hj2_2.b((String)object, iOException2);
                }
                wx1_2.f((LinkedHashSet)object3);
            }
            wx1_2.d();
            n3 = a;
            if (n3 != n7) return;
            try {
                object3 = e;
                object3 = object3.b();
                object2 = f;
                n7 = ((Object)object2).length;
                bl2 = false;
                object = null;
                while (true) {
                    if (n4 >= n7) {
                        if (bl2) return;
                        object2 = new StringBuilder();
                        String string2 = "The requested version ";
                        ((StringBuilder)object2).append(string2);
                        ((StringBuilder)object2).append((String)object3);
                        object3 = " by your slf4j provider is not compatible with ";
                        ((StringBuilder)object2).append((String)object3);
                        object3 = f;
                        object3 = Arrays.asList(object3);
                        object3 = object3.toString();
                        ((StringBuilder)object2).append((String)object3);
                        object3 = ((StringBuilder)object2).toString();
                        hj2_2.e((String)object3);
                        object3 = "See https://www.slf4j.org/codes.html#version_mismatch for further details.";
                        hj2_2.e((String)object3);
                        return;
                    }
                    Object object4 = object2[n4];
                    boolean bl4 = ((String)object3).startsWith((String)object4);
                    if (bl4) {
                        bl2 = true;
                    }
                    ++n4;
                }
            }
            catch (Throwable throwable) {}
            object2 = "Unexpected problem occurred during version sanity check";
            hj2_2.b((String)object2, throwable);
            return;
        }
        a = 2;
        hj2_2.b("Failed to instantiate SLF4J LoggerFactory", exception2);
        IllegalStateException illegalStateException = new IllegalStateException("Unexpected initialization failure", exception2);
        throw illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        int n3;
        int n4;
        Object object;
        int n7;
        Object object2;
        Object object3 = null;
        int n8 = 1;
        Object object4 = b;
        synchronized (object4) {
            try {
                object2 = ((kf3_2)object4).a;
                ((if3_2)object2).a = n8;
                object2 = ((kf3_2)object4).a;
                object2.getClass();
                object2 = ((if3_2)object2).b;
                object2 = ((ConcurrentHashMap)object2).values();
                Object object5 = new ArrayList(object2);
                object2 = ((ArrayList)object5).iterator();
                while ((n7 = object2.hasNext()) != 0) {
                    object5 = object2.next();
                    object5 = (hf3_2)object5;
                    object = ((hf3_2)object5).a;
                    Object object6 = wx1_2.b();
                    object6 = object6.a();
                    ((hf3_2)object5).b = object = object6.a((String)object);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 3] lbl23 : MonitorExitStatement: MONITOREXIT : var2_3
                object2 = wx1_2.b.a.c;
                n7 = ((LinkedBlockingQueue)object2).size();
                n4 = 128;
                object = new ArrayList(n4);
                n3 = 0;
                object4 = null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        while (true) {
            boolean bl2;
            int n10;
            if ((n10 = ((LinkedBlockingQueue)object2).drainTo(object, n4)) == 0) {
                object3 = wx1_2.b.a;
                ((if3_2)object3).b.clear();
                ((if3_2)object3).c.clear();
                return;
            }
            Iterator iterator = ((ArrayList)object).iterator();
            while (bl2 = iterator.hasNext()) {
                Object object7 = (jf3_2)iterator.next();
                if (object7 != null) {
                    ux1_2 ux1_22 = ((jf3_2)object7).b;
                    Object object8 = ux1_22.a;
                    Object object9 = ux1_22.b;
                    if (object9 == null) {
                        object3 = new IllegalStateException("Delegate logger cannot be null at this state.");
                        throw object3;
                    }
                    object9 = ux1_22.b;
                    boolean bl3 = object9 instanceof ws1_2;
                    if (!bl3) {
                        bl3 = ux1_22.i();
                        if (bl3) {
                            object8 = ((jf3_2)object7).a;
                            boolean bl4 = ux1_22.f((cu1_2)((Object)object8));
                            if (bl4 && (bl4 = ux1_22.i())) {
                                try {
                                    object8 = ux1_22.d;
                                    ux1_22 = ux1_22.b;
                                    object9 = new Object[n8];
                                    object9[0] = object7;
                                    ((Method)object8).invoke((Object)ux1_22, object9);
                                }
                                catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException exception) {}
                            }
                        } else {
                            hj2_2.e(object8);
                        }
                    }
                }
                int n14 = n3 + 1;
                if (n3 == 0) {
                    object4 = ((jf3_2)object7).b;
                    n3 = (int)(((hf3_2)object4).i() ? 1 : 0);
                    if (n3 != 0) {
                        object4 = new StringBuilder("A number (");
                        ((StringBuilder)object4).append(n7);
                        object7 = ") of logging calls during the initialization phase have been intercepted and are";
                        ((StringBuilder)object4).append((String)object7);
                        hj2_2.e(((StringBuilder)object4).toString());
                        hj2_2.e("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        object4 = "See also https://www.slf4j.org/codes.html#replay";
                        hj2_2.e((String)object4);
                    } else {
                        object4 = ((jf3_2)object7).b.b;
                        n3 = object4 instanceof ws1_2;
                        if (n3 == 0) {
                            hj2_2.e("The following set of substitute loggers may have been accessed");
                            hj2_2.e("during the initialization phase. Logging calls during this");
                            hj2_2.e("phase were not honored. However, subsequent logging calls to these");
                            hj2_2.e("loggers will work as normally expected.");
                            object4 = "See also https://www.slf4j.org/codes.html#substituteLogger";
                            hj2_2.e((String)object4);
                        }
                    }
                }
                n3 = n14;
            }
            ((ArrayList)object).clear();
        }
    }

    public static void e(ArrayList object) {
        boolean n3 = ((ArrayList)object).isEmpty();
        if (!n3) {
            int n4 = ((ArrayList)object).size();
            int n7 = 1;
            String string2 = "]";
            if (n4 > n7) {
                CharSequence charSequence = "Actual provider is of type [";
                Object object2 = new StringBuilder((String)charSequence);
                object = ((ArrayList)object).get(0);
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(string2);
                object = ((StringBuilder)object2).toString();
                object2 = hj2_2.a;
                object2 = hj2$a_0.INFO;
                boolean bl2 = hj2_2.d((hj2$a_0)((Object)object2));
                if (bl2) {
                    object2 = hj2_2.c();
                    string2 = "SLF4J(I): ";
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    ((PrintStream)object2).println((String)object);
                }
            } else {
                object = (mr2_2)((ArrayList)object).get(0);
                CharSequence charSequence = "Connected with provider of type [";
                Object object3 = new StringBuilder((String)charSequence);
                object = object.getClass().getName();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(string2);
                object = ((StringBuilder)object3).toString();
                object3 = hj2_2.a;
                object3 = hj2$a_0.DEBUG;
                boolean bl3 = hj2_2.d((hj2$a_0)((Object)object3));
                if (bl3) {
                    object3 = hj2_2.c();
                    string2 = "SLF4J(D): ";
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    ((PrintStream)object3).println((String)object);
                }
            }
            return;
        }
        object = new IllegalStateException("No providers were found which is impossible after successful initialization.");
        throw object;
    }

    public static void f(LinkedHashSet object) {
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return;
        }
        Object object2 = "Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.";
        hj2_2.e((String)object2);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (URL)object.next();
            String string2 = "Ignoring binding found at [";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object2);
            stringBuilder.append("]");
            object2 = stringBuilder.toString();
            hj2_2.e((String)object2);
        }
        hj2_2.e("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList object) {
        int n3;
        int n4 = ((ArrayList)object).size();
        if (n4 > (n3 = 1)) {
            Object object2 = "Class path contains multiple SLF4J providers.";
            hj2_2.e((String)object2);
            object = ((ArrayList)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (mr2_2)object.next();
                String string2 = "Found provider [";
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(object2);
                stringBuilder.append("]");
                object2 = stringBuilder.toString();
                hj2_2.e((String)object2);
            }
            object = "See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.";
            hj2_2.e((String)object);
        }
    }
}

