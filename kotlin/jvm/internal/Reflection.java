/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KTypeProjection;

public class Reflection {
    private static final yn1_2[] EMPTY_K_CLASS_ARRAY;
    static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final ReflectionFactory factory;

    static {
        Object object = null;
        Object object2 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl";
        object2 = Class.forName((String)object2);
        object2 = ((Class)object2).newInstance();
        try {
            object = object2 = (ReflectionFactory)object2;
        }
        catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException exception) {}
        if (object == null) {
            object = new ReflectionFactory();
        }
        factory = object;
        EMPTY_K_CLASS_ARRAY = new yn1_2[0];
    }

    public static yn1_2 createKotlinClass(Class clazz) {
        return factory.createKotlinClass(clazz);
    }

    public static yn1_2 createKotlinClass(Class clazz, String string2) {
        return factory.createKotlinClass(clazz, string2);
    }

    public static bn1_2 function(FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static yn1_2 getOrCreateKotlinClass(Class clazz) {
        return factory.getOrCreateKotlinClass(clazz);
    }

    public static yn1_2 getOrCreateKotlinClass(Class clazz, String string2) {
        return factory.getOrCreateKotlinClass(clazz, string2);
    }

    public static yn1_2[] getOrCreateKotlinClasses(Class[] classArray) {
        int n3 = classArray.length;
        if (n3 == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        yn1_2[] yn1_2Array = new yn1_2[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            yn1_2 yn1_22;
            yn1_2Array[i3] = yn1_22 = Reflection.getOrCreateKotlinClass(classArray[i3]);
        }
        return yn1_2Array;
    }

    public static an1_2 getOrCreateKotlinPackage(Class clazz) {
        return factory.getOrCreateKotlinPackage(clazz, "");
    }

    public static an1_2 getOrCreateKotlinPackage(Class clazz, String string2) {
        return factory.getOrCreateKotlinPackage(clazz, string2);
    }

    public static kn1_1 mutableCollectionType(kn1_1 kn1_12) {
        return factory.mutableCollectionType(kn1_12);
    }

    public static dn1_2 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static en1_2 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static fn1_2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static kn1_1 nothingType(kn1_1 kn1_12) {
        return factory.nothingType(kn1_12);
    }

    public static kn1_1 nullableTypeOf(Class object) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        List list = Collections.emptyList();
        return reflectionFactory.typeOf((zn1_2)object, list, true);
    }

    public static kn1_1 nullableTypeOf(Class object, KTypeProjection object2) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        object2 = Collections.singletonList(object2);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, true);
    }

    public static kn1_1 nullableTypeOf(Class object, KTypeProjection kTypeProjection, KTypeProjection object2) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        KTypeProjection[] kTypeProjectionArray = new KTypeProjection[2];
        kTypeProjectionArray[0] = kTypeProjection;
        boolean bl2 = true;
        kTypeProjectionArray[bl2] = object2;
        object2 = Arrays.asList(kTypeProjectionArray);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, bl2);
    }

    public static kn1_1 nullableTypeOf(Class object, KTypeProjection ... object2) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        object2 = tp_2.M(object2);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, true);
    }

    public static kn1_1 nullableTypeOf(zn1_2 zn1_22) {
        ReflectionFactory reflectionFactory = factory;
        List list = Collections.emptyList();
        return reflectionFactory.typeOf(zn1_22, list, true);
    }

    public static kn1_1 platformType(kn1_1 kn1_12, kn1_1 kn1_13) {
        return factory.platformType(kn1_12, kn1_13);
    }

    public static hn1_2 property0(PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static in1_2 property1(PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static jn1_2 property2(PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static String renderLambdaToString(FunctionBase functionBase) {
        return factory.renderLambdaToString(functionBase);
    }

    public static String renderLambdaToString(Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static void setUpperBounds(ln1_2 ln1_22, kn1_1 object) {
        ReflectionFactory reflectionFactory = factory;
        object = Collections.singletonList(object);
        reflectionFactory.setUpperBounds(ln1_22, (List)object);
    }

    public static void setUpperBounds(ln1_2 ln1_22, kn1_1 ... object) {
        ReflectionFactory reflectionFactory = factory;
        object = tp_2.M(object);
        reflectionFactory.setUpperBounds(ln1_22, (List)object);
    }

    public static kn1_1 typeOf(Class object) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        List list = Collections.emptyList();
        return reflectionFactory.typeOf((zn1_2)object, list, false);
    }

    public static kn1_1 typeOf(Class object, KTypeProjection object2) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        object2 = Collections.singletonList(object2);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, false);
    }

    public static kn1_1 typeOf(Class object, KTypeProjection object2, KTypeProjection kTypeProjection) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        KTypeProjection[] kTypeProjectionArray = new KTypeProjection[]{object2, kTypeProjection};
        object2 = Arrays.asList(kTypeProjectionArray);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, false);
    }

    public static kn1_1 typeOf(Class object, KTypeProjection ... object2) {
        ReflectionFactory reflectionFactory = factory;
        object = Reflection.getOrCreateKotlinClass((Class)object);
        object2 = tp_2.M(object2);
        return reflectionFactory.typeOf((zn1_2)object, (List)object2, false);
    }

    public static kn1_1 typeOf(zn1_2 zn1_22) {
        ReflectionFactory reflectionFactory = factory;
        List list = Collections.emptyList();
        return reflectionFactory.typeOf(zn1_22, list, false);
    }

    public static ln1_2 typeParameter(Object object, String string2, nn1_1 nn1_12, boolean bl2) {
        return factory.typeParameter(object, string2, nn1_12, bl2);
    }
}

