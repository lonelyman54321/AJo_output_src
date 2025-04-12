/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/*
 * Renamed from BG1
 */
public final class bg1_1 {
    public static final d21_0 a;

    static {
        Object object;
        Object object2;
        block14: {
            boolean bl2;
            object2 = "kotlinx.coroutines.fast.service.loader";
            object = null;
            try {
                object2 = System.getProperty((String)object2);
            }
            catch (SecurityException securityException) {
                object2 = null;
            }
            if (object2 != null) {
                Boolean.parseBoolean((String)object2);
            }
            object2 = new Object();
            int n3 = 1;
            Object object3 = new zg1_1[n3];
            int n4 = 0;
            Object object4 = null;
            object3[0] = object2;
            object2 = Arrays.asList(object3);
            try {
                object3 = object2 = kz2_1.l(ez2_1.b(object2.iterator()));
                object3 = ((Iterable)object2).iterator();
                n4 = object3.hasNext();
                if (n4 == 0) break block14;
                object = object3.next();
                n4 = object3.hasNext();
                if (n4 == 0) break block14;
                object4 = object;
            }
            catch (Throwable throwable) {
                object3 = throwable.getMessage();
                object = new ServiceConfigurationError((String)object3, throwable);
                throw object;
            }
            object4 = (zg1_1)object;
            n4 = object4.c();
            do {
                Object e2 = object3.next();
                Object object5 = e2;
                object5 = (zg1_1)e2;
                int n7 = object5.c();
                if (n4 >= n7) continue;
                object = e2;
                n4 = n7;
            } while (bl2 = object3.hasNext());
        }
        object = (zg1_1)object;
        if (object != null) {
            try {
                object2 = object.b((List)object2);
                if (object2 != null) {
                    a = object2;
                    return;
                }
            }
            catch (Throwable throwable) {
                object.a();
                throw throwable;
            }
        }
        object2 = new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        throw object2;
    }
}

