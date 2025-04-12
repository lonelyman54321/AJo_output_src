/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import com.google.gson.internal.reflect.ReflectionHelper$RecordHelper;
import com.google.gson.internal.reflect.ReflectionHelper$RecordNotSupportedHelper;
import com.google.gson.internal.reflect.ReflectionHelper$RecordSupportedHelper;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionHelper {
    private static final ReflectionHelper$RecordHelper RECORD_HELPER;

    static {
        ReflectionHelper$RecordHelper reflectionHelper$RecordHelper;
        try {
            reflectionHelper$RecordHelper = new ReflectionHelper$RecordSupportedHelper(null);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            reflectionHelper$RecordHelper = new ReflectionHelper$RecordNotSupportedHelper(null);
        }
        RECORD_HELPER = reflectionHelper$RecordHelper;
    }

    private ReflectionHelper() {
    }

    public static /* synthetic */ RuntimeException access$300(ReflectiveOperationException reflectiveOperationException) {
        return ReflectionHelper.createExceptionForRecordReflectionException(reflectiveOperationException);
    }

    private static void appendExecutableParameters(AccessibleObject classArray, StringBuilder stringBuilder) {
        int n3;
        stringBuilder.append('(');
        int n4 = classArray instanceof Method;
        classArray = n4 != 0 ? ((Method)classArray).getParameterTypes() : ((Constructor)classArray).getParameterTypes();
        for (n4 = 0; n4 < (n3 = classArray.length); ++n4) {
            String string2;
            if (n4 > 0) {
                string2 = ", ";
                stringBuilder.append(string2);
            }
            string2 = classArray[n4].getSimpleName();
            stringBuilder.append(string2);
        }
        stringBuilder.append(')');
    }

    public static String constructorToString(Constructor constructor) {
        String string2 = constructor.getDeclaringClass().getName();
        StringBuilder stringBuilder = new StringBuilder(string2);
        ReflectionHelper.appendExecutableParameters(constructor, stringBuilder);
        return stringBuilder.toString();
    }

    private static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException reflectiveOperationException) {
        RuntimeException runtimeException = new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
        throw runtimeException;
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        RuntimeException runtimeException = new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
        throw runtimeException;
    }

    public static String fieldToString(Field object) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = ((Field)object).getDeclaringClass().getName();
        stringBuilder.append(string2);
        stringBuilder.append("#");
        object = ((Field)object).getName();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public static String getAccessibleObjectDescription(AccessibleObject object, boolean bl2) {
        CharSequence charSequence;
        boolean bl3 = object instanceof Field;
        String string2 = "'";
        if (bl3) {
            String string3 = "field '";
            charSequence = new StringBuilder(string3);
            object = ReflectionHelper.fieldToString((Field)object);
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(string2);
            object = ((StringBuilder)charSequence).toString();
        } else {
            bl3 = object instanceof Method;
            if (bl3) {
                object = (Method)object;
                CharSequence charSequence2 = ((Method)object).getName();
                charSequence = new StringBuilder((String)charSequence2);
                ReflectionHelper.appendExecutableParameters((AccessibleObject)object, (StringBuilder)charSequence);
                charSequence = ((StringBuilder)charSequence).toString();
                String string4 = "method '";
                charSequence2 = new StringBuilder(string4);
                object = ((Method)object).getDeclaringClass().getName();
                ((StringBuilder)charSequence2).append((String)object);
                ((StringBuilder)charSequence2).append("#");
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append(string2);
                object = ((StringBuilder)charSequence2).toString();
            } else {
                bl3 = object instanceof Constructor;
                if (bl3) {
                    String string5 = "constructor '";
                    charSequence = new StringBuilder(string5);
                    object = ReflectionHelper.constructorToString((Constructor)object);
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append(string2);
                    object = ((StringBuilder)charSequence).toString();
                } else {
                    string2 = "<unknown AccessibleObject> ";
                    charSequence = new StringBuilder(string2);
                    object = object.toString();
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                }
            }
        }
        if (bl2) {
            boolean bl4 = false;
            bl3 = Character.isLowerCase(((String)object).charAt(0));
            if (bl3) {
                charSequence = new StringBuilder();
                char c2 = Character.toUpperCase(((String)object).charAt(0));
                ((StringBuilder)charSequence).append(c2);
                int n3 = 1;
                object = ((String)object).substring(n3);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
            }
        }
        return object;
    }

    public static Method getAccessor(Class clazz, Field field) {
        return RECORD_HELPER.getAccessor(clazz, field);
    }

    public static Constructor getCanonicalRecordConstructor(Class clazz) {
        return RECORD_HELPER.getCanonicalRecordConstructor(clazz);
    }

    public static String[] getRecordComponentNames(Class clazz) {
        return RECORD_HELPER.getRecordComponentNames(clazz);
    }

    public static boolean isRecord(Class clazz) {
        return RECORD_HELPER.isRecord(clazz);
    }

    public static void makeAccessible(AccessibleObject object) {
        boolean bl2 = true;
        try {
            ((AccessibleObject)object).setAccessible(bl2);
            return;
        }
        catch (Exception exception) {
            object = ReflectionHelper.getAccessibleObjectDescription((AccessibleObject)object, false);
            object = cP.a("Failed making ", (String)object, " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            JsonIOException jsonIOException = new JsonIOException((String)object, exception);
            throw jsonIOException;
        }
    }

    public static String tryMakeAccessible(Constructor object) {
        boolean bl2 = true;
        try {
            ((AccessibleObject)object).setAccessible(bl2);
            return null;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Failed making constructor '");
            object = ReflectionHelper.constructorToString((Constructor)object);
            stringBuilder.append((String)object);
            stringBuilder.append("' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
            object = exception.getMessage();
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
    }
}

