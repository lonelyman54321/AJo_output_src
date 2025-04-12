/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.List;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PackageReference;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.jvm.internal.TypeReference;

public class ReflectionFactory {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public yn1_2 createKotlinClass(Class clazz) {
        ClassReference classReference = new ClassReference(clazz);
        return classReference;
    }

    public yn1_2 createKotlinClass(Class clazz, String object) {
        object = new ClassReference(clazz);
        return object;
    }

    public bn1_2 function(FunctionReference functionReference) {
        return functionReference;
    }

    public yn1_2 getOrCreateKotlinClass(Class clazz) {
        ClassReference classReference = new ClassReference(clazz);
        return classReference;
    }

    public yn1_2 getOrCreateKotlinClass(Class clazz, String object) {
        object = new ClassReference(clazz);
        return object;
    }

    public an1_2 getOrCreateKotlinPackage(Class clazz, String string2) {
        PackageReference packageReference = new PackageReference(clazz, string2);
        return packageReference;
    }

    public kn1_1 mutableCollectionType(kn1_1 object) {
        kn1_1 kn1_12 = object;
        kn1_12 = (TypeReference)object;
        zn1_2 zn1_22 = object.getClassifier();
        object = object.getArguments();
        kn1_1 kn1_13 = ((TypeReference)kn1_12).getPlatformTypeUpperBound$kotlin_stdlib();
        int n3 = ((TypeReference)kn1_12).getFlags$kotlin_stdlib() | 2;
        TypeReference typeReference = new TypeReference(zn1_22, (List)object, kn1_13, n3);
        return typeReference;
    }

    public dn1_2 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public en1_2 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public fn1_2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public kn1_1 nothingType(kn1_1 object) {
        kn1_1 kn1_12 = object;
        kn1_12 = (TypeReference)object;
        zn1_2 zn1_22 = object.getClassifier();
        object = object.getArguments();
        kn1_1 kn1_13 = ((TypeReference)kn1_12).getPlatformTypeUpperBound$kotlin_stdlib();
        int n3 = ((TypeReference)kn1_12).getFlags$kotlin_stdlib() | 4;
        TypeReference typeReference = new TypeReference(zn1_22, (List)object, kn1_13, n3);
        return typeReference;
    }

    public kn1_1 platformType(kn1_1 kn1_12, kn1_1 kn1_13) {
        zn1_2 zn1_22 = kn1_12.getClassifier();
        List list = kn1_12.getArguments();
        int n3 = ((TypeReference)kn1_12).getFlags$kotlin_stdlib();
        TypeReference typeReference = new TypeReference(zn1_22, list, kn1_13, n3);
        return typeReference;
    }

    public hn1_2 property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public in1_2 property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public jn1_2 property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public String renderLambdaToString(FunctionBase object) {
        String string2;
        boolean n3 = ((String)(object = object.getClass().getGenericInterfaces()[0].toString())).startsWith(string2 = KOTLIN_JVM_FUNCTIONS);
        if (n3) {
            int n4 = 21;
            object = ((String)object).substring(n4);
        }
        return object;
    }

    public String renderLambdaToString(Lambda lambda) {
        return this.renderLambdaToString((FunctionBase)lambda);
    }

    public void setUpperBounds(ln1_2 ln1_22, List list) {
        ((TypeParameterReference)ln1_22).setUpperBounds(list);
    }

    public kn1_1 typeOf(zn1_2 zn1_22, List list, boolean bl2) {
        TypeReference typeReference = new TypeReference(zn1_22, list, bl2);
        return typeReference;
    }

    public ln1_2 typeParameter(Object object, String string2, nn1_1 nn1_12, boolean bl2) {
        TypeParameterReference typeParameterReference = new TypeParameterReference(object, string2, nn1_12, bl2);
        return typeParameterReference;
    }
}

