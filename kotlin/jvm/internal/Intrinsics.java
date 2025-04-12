/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

public class Intrinsics {
    private Intrinsics() {
    }

    public static boolean areEqual(double d2, Double d5) {
        double d7;
        double d9;
        double d12;
        boolean bl2 = d5 != null && (d12 = (d9 = d2 - (d7 = d5.doubleValue())) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) == false;
        return bl2;
    }

    public static boolean areEqual(float f5, Float f6) {
        float f7;
        float f8;
        boolean bl2;
        if (f6 != null && !(bl2 = (f8 = f5 - (f7 = f6.floatValue())) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f5 = 0.0f;
        }
        return bl2;
    }

    public static boolean areEqual(Double d2, double d5) {
        double d7;
        double d9;
        boolean bl2;
        if (d2 != null && !(bl2 = (d9 = (d7 = d2.doubleValue()) - d5) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1))) {
            bl2 = true;
        } else {
            bl2 = false;
            d2 = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean areEqual(Double d2, Double d5) {
        double d7;
        boolean bl2 = false;
        if (d2 == null) {
            if (d5 != null) return bl2;
            return true;
        }
        if (d5 == null) return bl2;
        double d9 = d2;
        double d12 = d9 - (d7 = d5.doubleValue());
        Object object = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
        if (object != false) return bl2;
        return true;
    }

    public static boolean areEqual(Float f5, float f6) {
        float f7;
        float f8;
        boolean bl2;
        if (f5 != null && !(bl2 = (f8 = (f7 = f5.floatValue()) - f6) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) {
            bl2 = true;
            f7 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            f7 = 0.0f;
            f5 = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean areEqual(Float f5, Float f6) {
        float f7;
        boolean bl2 = false;
        if (f5 == null) {
            if (f6 != null) return bl2;
            return true;
        }
        if (f6 == null) return bl2;
        float f8 = f5.floatValue();
        float f11 = f8 - (f7 = f6.floatValue());
        Object object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
        if (object != false) return bl2;
        return true;
    }

    public static boolean areEqual(Object object, Object object2) {
        boolean bl2;
        if (object == null) {
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
        } else {
            bl2 = object.equals(object2);
        }
        return bl2;
    }

    public static void checkExpressionValueIsNotNull(Object object, String string2) {
        if (object != null) {
            return;
        }
        string2 = Ft2.a(string2, " must not be null");
        object = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static void checkFieldIsNotNull(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static void checkFieldIsNotNull(Object object, String string2, String string3) {
        if (object != null) {
            return;
        }
        string2 = UX.c("Field specified as non-null is null: ", string2, ".", string3);
        object = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static void checkHasClass(String string2) {
        char c2 = '/';
        char c3 = '.';
        string2 = string2.replace(c2, c3);
        try {
            Class.forName(string2);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            string2 = cP.a("Class ", string2, " is not found. Please update the Kotlin runtime to the latest version");
            ClassNotFoundException classNotFoundException2 = new ClassNotFoundException(string2, classNotFoundException);
            throw (ClassNotFoundException)Intrinsics.sanitizeStackTrace(classNotFoundException2);
        }
    }

    public static void checkHasClass(String string2, String string3) {
        char c2 = '/';
        char c3 = '.';
        string2 = string2.replace(c2, c3);
        try {
            Class.forName(string2);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            string2 = UX.c("Class ", string2, " is not found: this code requires the Kotlin runtime of version at least ", string3);
            ClassNotFoundException classNotFoundException2 = new ClassNotFoundException(string2, classNotFoundException);
            throw (ClassNotFoundException)Intrinsics.sanitizeStackTrace(classNotFoundException2);
        }
    }

    public static void checkNotNull(Object object) {
        if (object == null) {
            Intrinsics.throwJavaNpe();
        }
    }

    public static void checkNotNull(Object object, String string2) {
        if (object == null) {
            Intrinsics.throwJavaNpe(string2);
        }
    }

    public static void checkNotNullExpressionValue(Object object, String string2) {
        if (object != null) {
            return;
        }
        string2 = Ft2.a(string2, " must not be null");
        object = new NullPointerException(string2);
        throw (NullPointerException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static void checkNotNullParameter(Object object, String string2) {
        if (object == null) {
            Intrinsics.throwParameterIsNullNPE(string2);
        }
    }

    public static void checkParameterIsNotNull(Object object, String string2) {
        if (object == null) {
            Intrinsics.throwParameterIsNullIAE(string2);
        }
    }

    public static void checkReturnedValueIsNotNull(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static void checkReturnedValueIsNotNull(Object object, String string2, String string3) {
        if (object != null) {
            return;
        }
        string2 = UX.c("Method specified as non-null returned null: ", string2, ".", string3);
        object = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace((Throwable)object);
    }

    public static int compare(int n3, int n4) {
        n3 = n3 < n4 ? -1 : (n3 == n4 ? 0 : 1);
        return n3;
    }

    public static int compare(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        int n3 = object < 0 ? -1 : (object == false ? 0 : 1);
        return n3;
    }

    private static String createParameterIsNullExceptionMessage(String string2) {
        String string3;
        boolean bl2;
        Object object = Thread.currentThread().getStackTrace();
        String string4 = Intrinsics.class.getName();
        int n3 = 0;
        while (!(bl2 = (string3 = object[n3].getClassName()).equals(string4))) {
            ++n3;
        }
        while (bl2 = (string3 = object[n3].getClassName()).equals(string4)) {
            ++n3;
        }
        object = object[n3];
        string4 = ((StackTraceElement)object).getClassName();
        object = ((StackTraceElement)object).getMethodName();
        object = og_1.a("Parameter specified as non-null is null: method ", string4, ".", (String)object, ", parameter ");
        ((StringBuilder)object).append(string2);
        return ((StringBuilder)object).toString();
    }

    public static void needClassReification() {
        Intrinsics.throwUndefinedForReified();
    }

    public static void needClassReification(String string2) {
        Intrinsics.throwUndefinedForReified(string2);
    }

    public static void reifiedOperationMarker(int n3, String string2) {
        Intrinsics.throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int n3, String string2, String string3) {
        Intrinsics.throwUndefinedForReified(string3);
    }

    private static Throwable sanitizeStackTrace(Throwable throwable) {
        String string2 = Intrinsics.class.getName();
        return Intrinsics.sanitizeStackTrace(throwable, string2);
    }

    public static Throwable sanitizeStackTrace(Throwable throwable, String stackTraceElementArray) {
        StackTraceElement[] stackTraceElementArray2 = throwable.getStackTrace();
        int n3 = stackTraceElementArray2.length;
        int n4 = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = stackTraceElementArray2[i3].getClassName();
            boolean bl2 = stackTraceElementArray.equals(string2);
            if (!bl2) continue;
            n4 = i3;
        }
        stackTraceElementArray = Arrays.copyOfRange(stackTraceElementArray2, ++n4, n3);
        throwable.setStackTrace(stackTraceElementArray);
        return throwable;
    }

    public static String stringPlus(String string2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(object);
        return stringBuilder.toString();
    }

    public static void throwAssert() {
        AssertionError assertionError = new AssertionError();
        throw (AssertionError)((Object)Intrinsics.sanitizeStackTrace((Throwable)((Object)assertionError)));
    }

    public static void throwAssert(String string2) {
        AssertionError assertionError = new AssertionError((Object)string2);
        throw (AssertionError)((Object)Intrinsics.sanitizeStackTrace((Throwable)((Object)assertionError)));
    }

    public static void throwIllegalArgument() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw (IllegalArgumentException)Intrinsics.sanitizeStackTrace(illegalArgumentException);
    }

    public static void throwIllegalArgument(String string2) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw (IllegalArgumentException)Intrinsics.sanitizeStackTrace(illegalArgumentException);
    }

    public static void throwIllegalState() {
        IllegalStateException illegalStateException = new IllegalStateException();
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace(illegalStateException);
    }

    public static void throwIllegalState(String string2) {
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw (IllegalStateException)Intrinsics.sanitizeStackTrace(illegalStateException);
    }

    public static void throwJavaNpe() {
        NullPointerException nullPointerException = new NullPointerException();
        throw (NullPointerException)Intrinsics.sanitizeStackTrace(nullPointerException);
    }

    public static void throwJavaNpe(String string2) {
        NullPointerException nullPointerException = new NullPointerException(string2);
        throw (NullPointerException)Intrinsics.sanitizeStackTrace(nullPointerException);
    }

    public static void throwNpe() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        throw (KotlinNullPointerException)Intrinsics.sanitizeStackTrace(kotlinNullPointerException);
    }

    public static void throwNpe(String string2) {
        KotlinNullPointerException kotlinNullPointerException = new NullPointerException(string2);
        throw (KotlinNullPointerException)Intrinsics.sanitizeStackTrace(kotlinNullPointerException);
    }

    private static void throwParameterIsNullIAE(String string2) {
        string2 = Intrinsics.createParameterIsNullExceptionMessage(string2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw (IllegalArgumentException)Intrinsics.sanitizeStackTrace(illegalArgumentException);
    }

    private static void throwParameterIsNullNPE(String string2) {
        string2 = Intrinsics.createParameterIsNullExceptionMessage(string2);
        NullPointerException nullPointerException = new NullPointerException(string2);
        throw (NullPointerException)Intrinsics.sanitizeStackTrace(nullPointerException);
    }

    public static void throwUndefinedForReified() {
        Intrinsics.throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUndefinedForReified(String string2) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
        throw unsupportedOperationException;
    }

    public static void throwUninitializedProperty(String string2) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new RuntimeException(string2);
        throw (UninitializedPropertyAccessException)Intrinsics.sanitizeStackTrace(uninitializedPropertyAccessException);
    }

    public static void throwUninitializedPropertyAccessException(String string2) {
        StringBuilder stringBuilder = new StringBuilder("lateinit property ");
        stringBuilder.append(string2);
        stringBuilder.append(" has not been initialized");
        Intrinsics.throwUninitializedProperty(stringBuilder.toString());
    }
}

