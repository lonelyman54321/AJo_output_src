/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeReference$Companion;
import kotlin.jvm.internal.TypeReference$WhenMappings;
import kotlin.jvm.internal.TypeReference$asString$args$1;
import kotlin.reflect.KTypeProjection;

public final class TypeReference
implements kn1_1 {
    public static final TypeReference$Companion Companion;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List arguments;
    private final zn1_2 classifier;
    private final int flags;
    private final kn1_1 platformTypeUpperBound;

    static {
        TypeReference$Companion typeReference$Companion;
        Companion = typeReference$Companion = new TypeReference$Companion(null);
    }

    public TypeReference(zn1_2 zn1_22, List list, kn1_1 kn1_12, int n3) {
        Intrinsics.checkNotNullParameter(zn1_22, "classifier");
        Intrinsics.checkNotNullParameter(list, "arguments");
        this.classifier = zn1_22;
        this.arguments = list;
        this.platformTypeUpperBound = kn1_12;
        this.flags = n3;
    }

    public TypeReference(zn1_2 zn1_22, List list, boolean bl2) {
        Intrinsics.checkNotNullParameter(zn1_22, "classifier");
        Intrinsics.checkNotNullParameter(list, "arguments");
        this(zn1_22, list, null, (int)(bl2 ? 1 : 0));
    }

    public static final /* synthetic */ String access$asString(TypeReference typeReference, KTypeProjection kTypeProjection) {
        return typeReference.asString(kTypeProjection);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String asString(KTypeProjection object) {
        int n3;
        int[] nArray;
        int n4;
        Object object2;
        nn1_1 nn1_12 = ((KTypeProjection)object).a;
        if (nn1_12 == null) {
            return "*";
        }
        kn1_1 kn1_12 = ((KTypeProjection)object).b;
        boolean bl2 = kn1_12 instanceof TypeReference;
        if (bl2) {
            object2 = kn1_12;
            object2 = (TypeReference)kn1_12;
        } else {
            bl2 = false;
            object2 = null;
        }
        int n7 = 1;
        if (object2 == null || (object2 = super.asString(n7 != 0)) == null) {
            object2 = String.valueOf(kn1_12);
        }
        if ((n4 = (nArray = TypeReference$WhenMappings.$EnumSwitchMapping$0)[n3 = ((Enum)(object = ((KTypeProjection)object).a)).ordinal()]) == n7) return object2;
        int n8 = 2;
        if (n4 != n8) {
            n8 = 3;
            if (n4 == n8) {
                object = "out ";
                return ((String)object).concat((String)object2);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = "in ";
        return ((String)object).concat((String)object2);
    }

    private final String asString(boolean bl2) {
        Object object;
        int n3;
        Object object2 = this.getClassifier();
        boolean bl3 = object2 instanceof yn1_2;
        char c2 = '\u0000';
        Object object3 = null;
        if (bl3) {
            object2 = (yn1_2)object2;
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object3 = rn1_2.a((yn1_2)object2);
        }
        if (object3 == null) {
            object = this.getClassifier().toString();
        } else {
            n3 = this.flags & 4;
            if (n3 != 0) {
                object = "kotlin.Nothing";
            } else {
                boolean bl4;
                n3 = (int)(((Class)object3).isArray() ? 1 : 0);
                if (n3 != 0) {
                    object = this.getArrayClassName((Class)object3);
                } else if (bl2 && (bl4 = ((Class)object3).isPrimitive())) {
                    object = this.getClassifier();
                    object2 = "null cannot be cast to non-null type kotlin.reflect.KClass<*>";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = rn1_2.b((yn1_2)object).getName();
                } else {
                    object = ((Class)object3).getName();
                }
            }
        }
        object2 = this.getArguments();
        n3 = (int)(object2.isEmpty() ? 1 : 0);
        CharSequence charSequence = "";
        if (n3 != 0) {
            object2 = charSequence;
        } else {
            object3 = object2 = this.getArguments();
            object3 = (Iterable)object2;
            TypeReference$asString$args$1 typeReference$asString$args$1 = new TypeReference$asString$args$1(this);
            String string2 = "<";
            String string3 = ">";
            String string4 = ", ";
            int n4 = 24;
            object2 = CollectionsKt.R((Iterable)object3, string4, string2, string3, typeReference$asString$args$1, n4);
        }
        c2 = this.isMarkedNullable();
        if (c2 != '\u0000') {
            charSequence = "?";
        }
        object = n1.a((String)object, (String)object2, (String)charSequence);
        object2 = this.platformTypeUpperBound;
        bl3 = object2 instanceof TypeReference;
        if (bl3 && !(bl3 = Intrinsics.areEqual(object2 = ((TypeReference)object2).asString(true), object))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            c2 = '?';
            ((StringBuilder)charSequence).append(c2);
            charSequence = ((StringBuilder)charSequence).toString();
            bl3 = Intrinsics.areEqual(object2, charSequence);
            if (bl3) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)object);
                char c3 = '!';
                ((StringBuilder)object2).append(c3);
                object = ((StringBuilder)object2).toString();
            } else {
                object3 = "(";
                charSequence = new StringBuilder((String)object3);
                ((StringBuilder)charSequence).append((String)object);
                ((StringBuilder)charSequence).append("..");
                ((StringBuilder)charSequence).append((String)object2);
                char c5 = ')';
                ((StringBuilder)charSequence).append(c5);
                object = ((StringBuilder)charSequence).toString();
            }
        }
        return object;
    }

    private final String getArrayClassName(Class object) {
        boolean bl2;
        Class clazz = boolean[].class;
        boolean bl3 = Intrinsics.areEqual(object, clazz);
        object = bl3 ? "kotlin.BooleanArray" : ((bl3 = Intrinsics.areEqual(object, clazz = char[].class)) ? "kotlin.CharArray" : ((bl3 = Intrinsics.areEqual(object, clazz = byte[].class)) ? "kotlin.ByteArray" : ((bl3 = Intrinsics.areEqual(object, clazz = short[].class)) ? "kotlin.ShortArray" : ((bl3 = Intrinsics.areEqual(object, clazz = int[].class)) ? "kotlin.IntArray" : ((bl3 = Intrinsics.areEqual(object, clazz = float[].class)) ? "kotlin.FloatArray" : ((bl3 = Intrinsics.areEqual(object, clazz = long[].class)) ? "kotlin.LongArray" : ((bl2 = Intrinsics.areEqual(object, clazz = double[].class)) ? "kotlin.DoubleArray" : "kotlin.Array")))))));
        return object;
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public boolean equals(Object object) {
        int n3;
        Object object2;
        Object object3;
        int n4 = object instanceof TypeReference;
        if (n4 != 0 && (n4 = Intrinsics.areEqual(object3 = this.getClassifier(), object2 = ((TypeReference)(object = (TypeReference)object)).getClassifier())) != 0 && (n4 = Intrinsics.areEqual(object3 = this.getArguments(), object2 = ((TypeReference)object).getArguments())) != 0 && (n4 = Intrinsics.areEqual(object3 = this.platformTypeUpperBound, object2 = ((TypeReference)object).platformTypeUpperBound)) != 0 && (n4 = this.flags) == (n3 = ((TypeReference)object).flags)) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public List getAnnotations() {
        return mz0_2.a;
    }

    public List getArguments() {
        return this.arguments;
    }

    public zn1_2 getClassifier() {
        return this.classifier;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    public final kn1_1 getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public int hashCode() {
        int n3 = this.getClassifier().hashCode() * 31;
        int n4 = (((Object)this.getArguments()).hashCode() + n3) * 31;
        n3 = this.flags;
        return n4 + n3;
    }

    public boolean isMarkedNullable() {
        int n3 = this.flags;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.asString(false);
        return h30_0.a(stringBuilder, string2, " (Kotlin reflection is not available)");
    }
}

