/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

public final class ClassReference$Companion {
    private ClassReference$Companion() {
    }

    public /* synthetic */ ClassReference$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getClassQualifiedName(Class object) {
        Object object2 = "jClass";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = ((Class)object).isAnonymousClass();
        Object object3 = null;
        if (!bl2 && !(bl2 = ((Class)object).isLocalClass())) {
            bl2 = ((Class)object).isArray();
            if (bl2) {
                bl2 = ((Class)(object = ((Class)object).getComponentType())).isPrimitive();
                if (bl2) {
                    object2 = ClassReference.access$getClassFqNames$cp();
                    object = ((Class)object).getName();
                    if ((object = (String)((HashMap)object2).get(object)) != null) {
                        object2 = "Array";
                        object3 = ((String)object).concat((String)object2);
                    }
                }
                if (object3 == null) {
                    object3 = "kotlin.Array";
                }
            } else {
                object2 = ClassReference.access$getClassFqNames$cp();
                object3 = ((Class)object).getName();
                object3 = object2 = ((HashMap)object2).get(object3);
                object3 = (String)object2;
                if (object3 == null) {
                    object3 = ((Class)object).getCanonicalName();
                }
            }
        }
        return object3;
    }

    public final String getClassSimpleName(Class object) {
        Object object2;
        block10: {
            boolean bl2;
            Object object3;
            block11: {
                char c2;
                block12: {
                    object3 = "jClass";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    bl2 = ((Class)object).isAnonymousClass();
                    object2 = null;
                    if (bl2) break block10;
                    bl2 = ((Class)object).isLocalClass();
                    if (!bl2) break block11;
                    object3 = ((Class)object).getSimpleName();
                    object2 = ((Class)object).getEnclosingMethod();
                    c2 = '$';
                    if (object2 == null) break block12;
                    Intrinsics.checkNotNull(object3);
                    StringBuilder stringBuilder = new StringBuilder();
                    object2 = ((Method)object2).getName();
                    stringBuilder.append((String)object2);
                    stringBuilder.append(c2);
                    object2 = stringBuilder.toString();
                    object2 = StringsKt.f0((String)object3, (String)object2);
                    if (object2 != null) break block10;
                }
                if ((object = ((Class)object).getEnclosingConstructor()) != null) {
                    Intrinsics.checkNotNull(object3);
                    object2 = new StringBuilder();
                    object = ((Constructor)object).getName();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(c2);
                    object = ((StringBuilder)object2).toString();
                    object2 = StringsKt.f0((String)object3, (String)object);
                } else {
                    Intrinsics.checkNotNull(object3);
                    object2 = StringsKt.e0(c2, (String)object3, (String)object3);
                }
                break block10;
            }
            bl2 = ((Class)object).isArray();
            if (bl2) {
                object = ((Class)object).getComponentType();
                bl2 = ((Class)object).isPrimitive();
                String string2 = "Array";
                if (bl2) {
                    object3 = ClassReference.access$getSimpleNames$cp();
                    object = ((Class)object).getName();
                    if ((object = (String)object3.get(object)) != null) {
                        object2 = ((String)object).concat(string2);
                    }
                }
                if (object2 == null) {
                    object2 = string2;
                }
            } else {
                object3 = ClassReference.access$getSimpleNames$cp();
                object2 = ((Class)object).getName();
                object2 = object3 = object3.get(object2);
                object2 = (String)object3;
                if (object2 == null) {
                    object2 = ((Class)object).getSimpleName();
                }
            }
        }
        return object2;
    }

    public final boolean isInstance(Object object, Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "jClass");
        Object object2 = ClassReference.access$getFUNCTION_CLASSES$cp();
        String string2 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>";
        Intrinsics.checkNotNull(object2, string2);
        object2 = (Integer)object2.get(clazz);
        if (object2 != null) {
            int n3 = ((Number)object2).intValue();
            return TypeIntrinsics.isFunctionOfArity(object, n3);
        }
        boolean bl2 = clazz.isPrimitive();
        if (bl2) {
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(clazz, (String)object2);
            clazz = rn1_2.b(Reflection.getOrCreateKotlinClass(clazz));
        }
        return clazz.isInstance(object);
    }
}

