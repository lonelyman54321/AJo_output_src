/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

/*
 * Renamed from xm0
 */
public final class xm0_2 {
    public static Constructor a;

    public static Object a(Class clazz, Object object, Method method, Object[] objectArray) {
        Class[] classArray;
        int n3 = 2;
        boolean bl2 = true;
        GenericDeclaration genericDeclaration = a;
        if (genericDeclaration == null) {
            Class<Integer> clazz2;
            genericDeclaration = tm0_2.a();
            classArray = new Class[n3];
            classArray[0] = Class.class;
            classArray[bl2] = clazz2 = Integer.TYPE;
            genericDeclaration = ((Class)genericDeclaration).getDeclaredConstructor(classArray);
            ((AccessibleObject)((Object)genericDeclaration)).setAccessible(bl2);
            a = genericDeclaration;
        }
        classArray = Integer.valueOf(-1);
        Object[] objectArray2 = new Object[n3];
        objectArray2[0] = clazz;
        objectArray2[bl2] = classArray;
        return wm0_1.a(lm_0.a(vm0_2.a(um0_1.a(((Constructor)genericDeclaration).newInstance(objectArray2)), method, clazz), object), objectArray);
    }
}

