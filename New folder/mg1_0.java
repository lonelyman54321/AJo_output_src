/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mg1
 */
public final class mg1_0 {
    public static final mg1$a g;
    public static mg1_0 h;
    public final Class a;
    public final Class b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;

    static {
        mg1$a mg1$a;
        g = mg1$a = new Object();
    }

    public mg1_0(Class clazz, Class clazz2, Method method, Method method2, Method method3, Method method4) {
        Intrinsics.checkNotNullParameter(clazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(clazz2, "builderClazz");
        Intrinsics.checkNotNullParameter(method, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(method2, "setTypeMethod");
        Intrinsics.checkNotNullParameter(method3, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(method4, "buildMethod");
        this.a = clazz;
        this.b = clazz2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public final Object a(ng1$b object, ArrayList object2) {
        Object object3;
        block20: {
            Object object4;
            Class clazz;
            int n3;
            block19: {
                Object[] objectArray;
                Method method;
                block18: {
                    n3 = 1;
                    clazz = this.b;
                    boolean bl2 = td0.b(this);
                    object3 = null;
                    if (bl2) {
                        return null;
                    }
                    object4 = "productType";
                    try {
                        Intrinsics.checkNotNullParameter(object, (String)object4);
                        object4 = this.a;
                    }
                    catch (Throwable throwable) {
                        td0.a(this, throwable);
                        return null;
                    }
                    method = this.c;
                    objectArray = new Object[]{};
                    object4 = ng1_1.d((Class)object4, null, method, objectArray);
                    if (object4 != null) break block18;
                    return null;
                }
                method = this.d;
                object = object.getType();
                objectArray = new Object[n3];
                objectArray[0] = object;
                object = ng1_1.d(clazz, object4, method, objectArray);
                if (object != null) break block19;
                return null;
            }
            object4 = this.e;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            object = ng1_1.d(clazz, object, (Method)object4, objectArray);
            if (object == null) break block20;
            object2 = this.f;
            objectArray = new Object[]{};
            object3 = ng1_1.d(clazz, object, (Method)object2, objectArray);
        }
        return object3;
    }
}

