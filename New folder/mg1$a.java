/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.List;

public final class mg1$a {
    public static mg1_0 a() {
        int n3 = 1;
        Object object = null;
        Class clazz = ng1_1.a("com.android.billingclient.api.SkuDetailsParams");
        Class clazz2 = ng1_1.a("com.android.billingclient.api.SkuDetailsParams$Builder");
        mg1_0 mg1_02 = null;
        if (clazz != null && clazz2 != null) {
            Object object2 = new Class[]{};
            Method method = ng1_1.c(clazz, "newBuilder", object2);
            object2 = new Class[n3];
            object2[0] = String.class;
            Method method2 = ng1_1.c(clazz2, "setType", object2);
            Object object3 = new Class[n3];
            object3[0] = List.class;
            object2 = "setSkusList";
            Method method3 = ng1_1.c(clazz2, (String)object2, object3);
            object3 = "build";
            object = new Class[]{};
            Method method4 = ng1_1.c(clazz2, (String)object3, object);
            if (method != null && method2 != null && method3 != null && method4 != null) {
                object2 = object3;
                object3 = new mg1_0(clazz, clazz2, method, method2, method3, method4);
                object = mg1_0.class;
                boolean bl2 = td0.b(object);
                if (!bl2) {
                    try {
                        mg1_0.h = object3;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                n3 = (int)(td0.b(object) ? 1 : 0);
                if (n3 == 0) {
                    try {
                        mg1_02 = mg1_0.h;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
            }
        }
        return mg1_02;
    }
}

