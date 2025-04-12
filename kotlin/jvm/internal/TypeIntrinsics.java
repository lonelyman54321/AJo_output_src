/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.jvm.internal.markers.KMutableMap$Entry;
import kotlin.jvm.internal.markers.KMutableSet;

public class TypeIntrinsics {
    public static Collection asMutableCollection(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableCollection)) {
            String string2 = "kotlin.collections.MutableCollection";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToCollection(object);
    }

    public static Collection asMutableCollection(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableCollection)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToCollection(object);
    }

    public static Iterable asMutableIterable(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableIterable)) {
            String string2 = "kotlin.collections.MutableIterable";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToIterable(object);
    }

    public static Iterable asMutableIterable(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableIterable)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToIterable(object);
    }

    public static Iterator asMutableIterator(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableIterator)) {
            String string2 = "kotlin.collections.MutableIterator";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToIterator(object);
    }

    public static Iterator asMutableIterator(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableIterator)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToIterator(object);
    }

    public static List asMutableList(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableList)) {
            String string2 = "kotlin.collections.MutableList";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToList(object);
    }

    public static List asMutableList(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableList)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToList(object);
    }

    public static ListIterator asMutableListIterator(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableListIterator)) {
            String string2 = "kotlin.collections.MutableListIterator";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToListIterator(object);
    }

    public static ListIterator asMutableListIterator(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableListIterator)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToListIterator(object);
    }

    public static Map asMutableMap(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableMap)) {
            String string2 = "kotlin.collections.MutableMap";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToMap(object);
    }

    public static Map asMutableMap(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableMap)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToMap(object);
    }

    public static Map.Entry asMutableMapEntry(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableMap$Entry)) {
            String string2 = "kotlin.collections.MutableMap.MutableEntry";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToMapEntry(object);
    }

    public static Map.Entry asMutableMapEntry(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableMap$Entry)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToMapEntry(object);
    }

    public static Set asMutableSet(Object object) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableSet)) {
            String string2 = "kotlin.collections.MutableSet";
            TypeIntrinsics.throwCce(object, string2);
        }
        return TypeIntrinsics.castToSet(object);
    }

    public static Set asMutableSet(Object object, String string2) {
        boolean bl2 = object instanceof KMappedMarker;
        if (bl2 && !(bl2 = object instanceof KMutableSet)) {
            TypeIntrinsics.throwCce(string2);
        }
        return TypeIntrinsics.castToSet(object);
    }

    public static Object beforeCheckcastToFunctionOfArity(Object object, int n3) {
        boolean bl2;
        if (object != null && !(bl2 = TypeIntrinsics.isFunctionOfArity(object, n3))) {
            String string2 = "kotlin.jvm.functions.Function";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            String string3 = stringBuilder.toString();
            TypeIntrinsics.throwCce(object, string3);
        }
        return object;
    }

    public static Object beforeCheckcastToFunctionOfArity(Object object, int n3, String string2) {
        if (object != null && (n3 = (int)(TypeIntrinsics.isFunctionOfArity(object, n3) ? 1 : 0)) == 0) {
            TypeIntrinsics.throwCce(string2);
        }
        return object;
    }

    public static Collection castToCollection(Object object) {
        try {
            return (Collection)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static Iterable castToIterable(Object object) {
        try {
            return (Iterable)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static Iterator castToIterator(Object object) {
        try {
            return (Iterator)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static List castToList(Object object) {
        try {
            return (List)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static ListIterator castToListIterator(Object object) {
        try {
            return (ListIterator)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static Map castToMap(Object object) {
        try {
            return (Map)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static Map.Entry castToMapEntry(Object object) {
        try {
            return (Map.Entry)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static Set castToSet(Object object) {
        try {
            return (Set)object;
        }
        catch (ClassCastException classCastException) {
            throw TypeIntrinsics.throwCce(classCastException);
        }
    }

    public static int getFunctionArity(Object object) {
        boolean bl2 = object instanceof FunctionBase;
        if (bl2) {
            return ((FunctionBase)object).getArity();
        }
        bl2 = object instanceof Function0;
        if (bl2) {
            return 0;
        }
        bl2 = object instanceof Function1;
        if (bl2) {
            return 1;
        }
        bl2 = object instanceof Function2;
        if (bl2) {
            return 2;
        }
        bl2 = object instanceof gx0_2;
        if (bl2) {
            return 3;
        }
        bl2 = object instanceof hx0_2;
        if (bl2) {
            return 4;
        }
        bl2 = object instanceof ix0_2;
        if (bl2) {
            return 5;
        }
        bl2 = object instanceof jx0_2;
        if (bl2) {
            return 6;
        }
        bl2 = object instanceof kx0_2;
        if (bl2) {
            return 7;
        }
        bl2 = object instanceof lx0_2;
        if (bl2) {
            return 8;
        }
        bl2 = object instanceof mx0_2;
        if (bl2) {
            return 9;
        }
        bl2 = object instanceof rx0_2;
        if (bl2) {
            return 10;
        }
        bl2 = object instanceof sx0_2;
        if (bl2) {
            return 11;
        }
        bl2 = object instanceof tx0_2;
        if (bl2) {
            return 12;
        }
        bl2 = object instanceof ux0_2;
        if (bl2) {
            return 13;
        }
        bl2 = object instanceof vx0_2;
        if (bl2) {
            return 14;
        }
        bl2 = object instanceof wx0_2;
        if (bl2) {
            return 15;
        }
        bl2 = object instanceof xx0_2;
        if (bl2) {
            return 16;
        }
        bl2 = object instanceof yx0_2;
        if (bl2) {
            return 17;
        }
        bl2 = object instanceof zx0_2;
        if (bl2) {
            return 18;
        }
        bl2 = object instanceof ax0_2;
        if (bl2) {
            return 19;
        }
        bl2 = object instanceof cx0_2;
        if (bl2) {
            return 20;
        }
        bl2 = object instanceof dx0_2;
        if (bl2) {
            return 21;
        }
        boolean bl3 = object instanceof ex0_2;
        if (bl3) {
            return 22;
        }
        return -1;
    }

    public static boolean isFunctionOfArity(Object object, int n3) {
        int n4;
        boolean bl2 = object instanceof fx0_2;
        if (bl2 && (n4 = TypeIntrinsics.getFunctionArity(object)) == n3) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        return n4;
    }

    public static boolean isMutableCollection(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Collection;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableCollection))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableIterable(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Iterable;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableIterable))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableIterator(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Iterator;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableIterator))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableList(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof List;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableList))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableListIterator(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof ListIterator;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableListIterator))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableMap(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableMap))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableMapEntry(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Map.Entry;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableMap$Entry))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isMutableSet(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof Set;
        if (bl3 && (!(bl3 = object instanceof KMappedMarker) || (bl2 = object instanceof KMutableSet))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static Throwable sanitizeStackTrace(Throwable throwable) {
        String string2 = TypeIntrinsics.class.getName();
        return Intrinsics.sanitizeStackTrace(throwable, string2);
    }

    public static ClassCastException throwCce(ClassCastException classCastException) {
        throw (ClassCastException)TypeIntrinsics.sanitizeStackTrace(classCastException);
    }

    public static void throwCce(Object object, String string2) {
        object = object == null ? "null" : object.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(" cannot be cast to ");
        stringBuilder.append(string2);
        TypeIntrinsics.throwCce(stringBuilder.toString());
    }

    public static void throwCce(String string2) {
        ClassCastException classCastException = new ClassCastException(string2);
        throw TypeIntrinsics.throwCce(classCastException);
    }
}

