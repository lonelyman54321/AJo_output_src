/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ng1
 */
public final class ng1_1 {
    public static final /* synthetic */ int a;

    static {
        new ng1_1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Class a(String string2) {
        Class<ng1_1> clazz2 = ng1_1.class;
        boolean bl2 = td0.b(clazz2);
        Class<?> clazz = null;
        if (bl2) {
            return null;
        }
        String string3 = "className";
        try {
            Intrinsics.checkNotNullParameter(string2, string3);
            try {
                clazz = Class.forName(string2);
                return clazz;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            return clazz;
        }
        finally {
            return clazz;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Method b(Class clazz, String string2, Class ... classArray) {
        Class<ng1_1> clazz2 = ng1_1.class;
        int n3 = td0.b(clazz2);
        Method method = null;
        if (n3 != 0) {
            return null;
        }
        String string3 = "clazz";
        try {
            Intrinsics.checkNotNullParameter(clazz, string3);
            string3 = "methodName";
            Intrinsics.checkNotNullParameter(string2, string3);
            string3 = "args";
            Intrinsics.checkNotNullParameter(classArray, string3);
            try {
                n3 = classArray.length;
                classArray = Arrays.copyOf(classArray, n3);
                method = clazz.getDeclaredMethod(string2, classArray);
                return method;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            return method;
        }
        finally {
            return method;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Method c(Class clazz, String string2, Class ... classArray) {
        Class<ng1_1> clazz2 = ng1_1.class;
        int n3 = td0.b(clazz2);
        Method method = null;
        if (n3 != 0) {
            return null;
        }
        String string3 = "clazz";
        try {
            Intrinsics.checkNotNullParameter(clazz, string3);
            string3 = "methodName";
            Intrinsics.checkNotNullParameter(string2, string3);
            string3 = "args";
            Intrinsics.checkNotNullParameter(classArray, string3);
            try {
                n3 = classArray.length;
                classArray = Arrays.copyOf(classArray, n3);
                method = clazz.getMethod(string2, classArray);
                return method;
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            return method;
        }
        finally {
            return method;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object d(Class objectArray, Object object, Method method, Object ... objectArray2) {
        Throwable throwable2;
        Class<ng1_1> clazz;
        block6: {
            block5: {
                clazz = ng1_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                String string2 = "clazz";
                try {
                    Intrinsics.checkNotNullParameter(objectArray, string2);
                    string2 = "method";
                    Intrinsics.checkNotNullParameter(method, string2);
                    string2 = "args";
                    Intrinsics.checkNotNullParameter(objectArray2, string2);
                    if (object == null) break block5;
                    object = objectArray.cast(object);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            try {
                int n3 = objectArray2.length;
                objectArray = Arrays.copyOf(objectArray2, n3);
                return method.invoke(object, objectArray);
            }
            catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
                return null;
            }
        }
        td0.a(clazz, throwable2);
        return null;
    }
}

