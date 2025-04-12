/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.lifecycle.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class AS2 {
    public static final List a;
    public static final List b;

    static {
        Class<x> clazz = x.class;
        Object[] objectArray = new Class[]{Application.class, clazz};
        a = xx_2.i(objectArray);
        b = kotlin.collections.a.b(clazz);
    }

    public static final Constructor a(List object, Class object2) {
        Intrinsics.checkNotNullParameter(object2, "modelClass");
        Intrinsics.checkNotNullParameter(object, "signature");
        Object object3 = ((Class)object2).getConstructors();
        CharSequence charSequence = "modelClass.constructors";
        Intrinsics.checkNotNullExpressionValue(object3, (String)charSequence);
        int n3 = ((Constructor<?>[])object3).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object4 = object3[i3];
            Object object5 = ((Constructor)object4).getParameterTypes();
            String string2 = "constructor.parameterTypes";
            Intrinsics.checkNotNullExpressionValue(object5, string2);
            object5 = tp_2.M((Object[])object5);
            int n4 = Intrinsics.areEqual(object, object5);
            if (n4 != 0) {
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return object4;
            }
            int n7 = object.size();
            if (n7 != (n4 = object5.size())) continue;
            object4 = object;
            object4 = (Collection)object;
            n7 = object5.containsAll((Collection<?>)object4) ? 1 : 0;
            if (n7 == 0) continue;
            charSequence = new StringBuilder("Class ");
            object2 = ((Class)object2).getSimpleName();
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append(" must have parameters in the proper order: ");
            ((StringBuilder)charSequence).append(object);
            object = ((StringBuilder)charSequence).toString();
            object3 = new UnsupportedOperationException((String)object);
            throw object3;
        }
        return null;
    }

    public static final jD3 b(Class object, Constructor constructor, Object ... objectArray) {
        IllegalAccessException illegalAccessException2;
        CharSequence charSequence;
        block9: {
            InstantiationException instantiationException2;
            block8: {
                Intrinsics.checkNotNullParameter(object, "modelClass");
                Intrinsics.checkNotNullParameter(constructor, "constructor");
                charSequence = "params";
                Intrinsics.checkNotNullParameter(objectArray, (String)charSequence);
                int n3 = objectArray.length;
                objectArray = Arrays.copyOf(objectArray, n3);
                constructor = constructor.newInstance(objectArray);
                try {
                    return (jD3)((Object)constructor);
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block8;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block9;
                }
                charSequence = new StringBuilder("An exception happened in constructor of ");
                ((StringBuilder)charSequence).append(object);
                object = ((StringBuilder)charSequence).toString();
                Throwable throwable = invocationTargetException.getCause();
                objectArray = new RuntimeException((String)object, throwable);
                throw objectArray;
            }
            charSequence = new StringBuilder("A ");
            ((StringBuilder)charSequence).append(object);
            ((StringBuilder)charSequence).append(" cannot be instantiated.");
            object = ((StringBuilder)charSequence).toString();
            objectArray = new RuntimeException((String)object, instantiationException2);
            throw objectArray;
        }
        charSequence = new StringBuilder("Failed to access ");
        ((StringBuilder)charSequence).append(object);
        object = ((StringBuilder)charSequence).toString();
        objectArray = new RuntimeException((String)object, illegalAccessException2);
        throw objectArray;
    }
}

