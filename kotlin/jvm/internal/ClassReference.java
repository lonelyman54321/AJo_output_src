/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.ClassReference$Companion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class ClassReference
implements yn1_2,
ClassBasedDeclarationContainer {
    public static final ClassReference$Companion Companion;
    private static final Map FUNCTION_CLASSES;
    private static final HashMap classFqNames;
    private static final HashMap primitiveFqNames;
    private static final HashMap primitiveWrapperFqNames;
    private static final Map simpleNames;
    private final Class jClass;

    static {
        boolean bl2;
        Object object;
        Object object2;
        int n3 = 0;
        Object object3 = null;
        Object object4 = new ClassReference$Companion(null);
        Companion = object4;
        int n4 = 23;
        object4 = new Class[n4];
        char c2 = '\u0000';
        Object object5 = null;
        object4[0] = Function0.class;
        int n7 = 1;
        object4[n7] = Function1.class;
        object4[2] = Function2.class;
        object4[3] = gx0_2.class;
        object4[4] = hx0_2.class;
        object4[5] = ix0_2.class;
        object4[6] = jx0_2.class;
        object4[7] = kx0_2.class;
        object4[8] = lx0_2.class;
        object4[9] = mx0_2.class;
        int n8 = 10;
        object4[n8] = rx0_2.class;
        object4[11] = sx0_2.class;
        object4[12] = tx0_2.class;
        object4[13] = ux0_2.class;
        object4[14] = vx0_2.class;
        object4[15] = wx0_2.class;
        object4[16] = xx0_2.class;
        object4[17] = yx0_2.class;
        object4[18] = zx0_2.class;
        object4[19] = ax0_2.class;
        object4[20] = cx0_2.class;
        object4[21] = dx0_2.class;
        char c3 = '\u0016';
        object4[c3] = ex0_2.class;
        object4 = xx_2.i((Object[])object4);
        n8 = yx_2.o((Iterable)object4, n8);
        Object object6 = new ArrayList(n8);
        object4 = object4.iterator();
        while ((n8 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
            object2 = object4.next();
            c3 = c2 + 1;
            if (c2 >= '\u0000') {
                object2 = (Class)object2;
                object5 = (int)c2;
                object = new Pair(object2, object5);
                ((ArrayList)object6).add(object);
                c2 = c3;
                continue;
            }
            xx_2.n();
            throw null;
        }
        FUNCTION_CLASSES = fh1_2.n(object6);
        object4 = new HashMap();
        object6 = "kotlin.Boolean";
        ((HashMap)object4).put("boolean", object6);
        object5 = "kotlin.Char";
        ((HashMap)object4).put("char", object5);
        Object object7 = "kotlin.Byte";
        ((HashMap)object4).put("byte", object7);
        object2 = "kotlin.Short";
        ((HashMap)object4).put("short", object2);
        String string2 = "kotlin.Int";
        ((HashMap)object4).put("int", string2);
        object = "kotlin.Float";
        ((HashMap)object4).put("float", object);
        String string3 = "kotlin.Long";
        ((HashMap)object4).put("long", string3);
        String string4 = "kotlin.Double";
        ((HashMap)object4).put("double", string4);
        primitiveFqNames = object4;
        object3 = new HashMap();
        String string5 = "java.lang.Boolean";
        ((HashMap)object3).put(string5, object6);
        ((HashMap)object3).put("java.lang.Character", object5);
        ((HashMap)object3).put("java.lang.Byte", object7);
        ((HashMap)object3).put("java.lang.Short", object2);
        ((HashMap)object3).put("java.lang.Integer", string2);
        ((HashMap)object3).put("java.lang.Float", object);
        ((HashMap)object3).put("java.lang.Long", string3);
        ((HashMap)object3).put("java.lang.Double", string4);
        primitiveWrapperFqNames = object3;
        object6 = new HashMap();
        ((HashMap)object6).put("java.lang.Object", "kotlin.Any");
        ((HashMap)object6).put("java.lang.String", "kotlin.String");
        ((HashMap)object6).put("java.lang.CharSequence", "kotlin.CharSequence");
        ((HashMap)object6).put("java.lang.Throwable", "kotlin.Throwable");
        ((HashMap)object6).put("java.lang.Cloneable", "kotlin.Cloneable");
        ((HashMap)object6).put("java.lang.Number", "kotlin.Number");
        ((HashMap)object6).put("java.lang.Comparable", "kotlin.Comparable");
        ((HashMap)object6).put("java.lang.Enum", "kotlin.Enum");
        ((HashMap)object6).put("java.lang.annotation.Annotation", "kotlin.Annotation");
        ((HashMap)object6).put("java.lang.Iterable", "kotlin.collections.Iterable");
        ((HashMap)object6).put("java.util.Iterator", "kotlin.collections.Iterator");
        ((HashMap)object6).put("java.util.Collection", "kotlin.collections.Collection");
        ((HashMap)object6).put("java.util.List", "kotlin.collections.List");
        ((HashMap)object6).put("java.util.Set", "kotlin.collections.Set");
        ((HashMap)object6).put("java.util.ListIterator", "kotlin.collections.ListIterator");
        ((HashMap)object6).put("java.util.Map", "kotlin.collections.Map");
        ((HashMap)object6).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        ((HashMap)object6).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        object5 = "kotlin.jvm.internal.EnumCompanionObject";
        object7 = "kotlin.Enum.Companion";
        ((HashMap)object6).put(object5, object7);
        ((HashMap)object6).putAll(object4);
        ((HashMap)object6).putAll(object3);
        object4 = ((HashMap)object4).values();
        object3 = "<get-values>(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = ((Iterable)object4).iterator();
        while (true) {
            n3 = object4.hasNext();
            c2 = '.';
            if (n3 == 0) break;
            object3 = (String)object4.next();
            object2 = "kotlin.jvm.internal.";
            object7 = new StringBuilder((String)object2);
            Intrinsics.checkNotNull(object3);
            object5 = StringsKt.g0(c2, (String)object3, (String)object3);
            ((StringBuilder)object7).append((String)object5);
            ((StringBuilder)object7).append("CompanionObject");
            object5 = ((StringBuilder)object7).toString();
            object7 = ".Companion";
            object3 = ((String)object3).concat((String)object7);
            ((HashMap)object6).put(object5, object3);
        }
        object4 = FUNCTION_CLASSES.entrySet().iterator();
        while ((n3 = object4.hasNext()) != 0) {
            object3 = (Map.Entry)object4.next();
            object7 = (Class)object3.getKey();
            n3 = ((Number)object3.getValue()).intValue();
            object7 = ((Class)object7).getName();
            string2 = "kotlin.Function";
            object2 = new StringBuilder(string2);
            ((StringBuilder)object2).append(n3);
            object3 = ((StringBuilder)object2).toString();
            ((HashMap)object6).put(object7, object3);
        }
        classFqNames = object6;
        n3 = eh1_2.c(((HashMap)object6).size());
        object4 = new LinkedHashMap(n3);
        object3 = ((Iterable)((HashMap)object6).entrySet()).iterator();
        while (bl2 = object3.hasNext()) {
            object6 = (Map.Entry)object3.next();
            object7 = object6.getKey();
            object6 = (String)object6.getValue();
            object6 = StringsKt.g0(c2, (String)object6, (String)object6);
            object4.put(object7, object6);
        }
        simpleNames = object4;
    }

    public ClassReference(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "jClass");
        this.jClass = clazz;
    }

    public static final /* synthetic */ HashMap access$getClassFqNames$cp() {
        return classFqNames;
    }

    public static final /* synthetic */ Map access$getFUNCTION_CLASSES$cp() {
        return FUNCTION_CLASSES;
    }

    public static final /* synthetic */ Map access$getSimpleNames$cp() {
        return simpleNames;
    }

    private final Void error() {
        lo1_2 lo1_22 = new lo1_2();
        throw lo1_22;
    }

    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    public static /* synthetic */ void getSupertypes$annotations() {
    }

    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    public static /* synthetic */ void getVisibility$annotations() {
    }

    public static /* synthetic */ void isAbstract$annotations() {
    }

    public static /* synthetic */ void isCompanion$annotations() {
    }

    public static /* synthetic */ void isData$annotations() {
    }

    public static /* synthetic */ void isFinal$annotations() {
    }

    public static /* synthetic */ void isFun$annotations() {
    }

    public static /* synthetic */ void isInner$annotations() {
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isSealed$annotations() {
    }

    public static /* synthetic */ void isValue$annotations() {
    }

    public boolean equals(Object object) {
        Class clazz;
        boolean bl2;
        boolean bl3 = object instanceof ClassReference;
        if (bl3 && (bl2 = Intrinsics.areEqual(clazz = rn1_2.b(this), object = rn1_2.b((yn1_2)object)))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public List getAnnotations() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public Collection getConstructors() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public Class getJClass() {
        return this.jClass;
    }

    public Collection getMembers() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public Collection getNestedClasses() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public Object getObjectInstance() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public String getQualifiedName() {
        ClassReference$Companion classReference$Companion = Companion;
        Class clazz = this.getJClass();
        return classReference$Companion.getClassQualifiedName(clazz);
    }

    public List getSealedSubclasses() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public String getSimpleName() {
        ClassReference$Companion classReference$Companion = Companion;
        Class clazz = this.getJClass();
        return classReference$Companion.getClassSimpleName(clazz);
    }

    public List getSupertypes() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public List getTypeParameters() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public on1_1 getVisibility() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public int hashCode() {
        return rn1_2.b(this).hashCode();
    }

    public boolean isAbstract() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isCompanion() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isData() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isFinal() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isFun() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isInner() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isInstance(Object object) {
        ClassReference$Companion classReference$Companion = Companion;
        Class clazz = this.getJClass();
        return classReference$Companion.isInstance(object, clazz);
    }

    public boolean isOpen() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isSealed() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public boolean isValue() {
        this.error();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getJClass().toString();
        stringBuilder.append(string2);
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

