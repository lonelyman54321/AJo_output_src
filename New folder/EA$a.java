/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class EA$a
implements InvocationHandler {
    public final Object a;

    public EA$a(vf3_1 vf3_12) {
        this.a = vf3_12;
    }

    public final Object invoke(Object object, Method object2, Object[] objectArray) {
        InvocationTargetException invocationTargetException2;
        block10: {
            object = this.a;
            GenericDeclaration genericDeclaration = object.getClass().getClassLoader();
            Class<?>[] classArray = ((Method)object2).getDeclaringClass();
            classArray = classArray.getName();
            boolean bl2 = true;
            genericDeclaration = Class.forName((String)classArray, bl2, (ClassLoader)((Object)genericDeclaration));
            classArray = ((Method)object2).getParameterTypes();
            String string2 = ((Method)object2).getName();
            genericDeclaration = ((Class)genericDeclaration).getDeclaredMethod(string2, classArray);
            try {
                return ((Method)genericDeclaration).invoke(object, objectArray);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block10;
            }
            genericDeclaration = new StringBuilder("Reflection failed for method ");
            ((StringBuilder)((Object)genericDeclaration)).append(object2);
            object2 = ((StringBuilder)((Object)genericDeclaration)).toString();
            objectArray = new RuntimeException((String)object2, reflectiveOperationException);
            throw objectArray;
        }
        throw invocationTargetException2.getTargetException();
    }
}

