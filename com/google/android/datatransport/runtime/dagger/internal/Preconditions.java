/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.dagger.internal;

public final class Preconditions {
    private Preconditions() {
    }

    public static void checkBuilderRequirement(Object object, Class object2) {
        if (object != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        object2 = ((Class)object2).getCanonicalName();
        stringBuilder.append((String)object2);
        stringBuilder.append(" must be set");
        object2 = stringBuilder.toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    public static Object checkNotNull(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2) {
        if (object == null) {
            object = "%s";
            int n3 = string2.contains((CharSequence)object);
            if (n3 != 0) {
                int n4;
                n3 = string2.indexOf((String)object);
                if (n3 == (n4 = string2.lastIndexOf((String)object))) {
                    n3 = object2 instanceof Class;
                    object2 = n3 != 0 ? ((Class)object2).getCanonicalName() : String.valueOf(object2);
                    object = string2.replace((CharSequence)object, (CharSequence)object2);
                    NullPointerException nullPointerException = new NullPointerException((String)object);
                    throw nullPointerException;
                }
                object = new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
                throw object;
            }
            object = new IllegalArgumentException("errorMessageTemplate has no format specifiers");
            throw object;
        }
        return object;
    }

    public static Object checkNotNullFromComponent(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable component method");
        throw object;
    }

    public static Object checkNotNullFromProvides(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }
}

