/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import org.jsoup.helper.ValidationException;

public final class Validate {
    private Validate() {
    }

    public static boolean assertFail(String string2) {
        Validate.fail(string2);
        return false;
    }

    public static Object ensureNotNull(Object object) {
        if (object != null) {
            return object;
        }
        object = new ValidationException("Object must not be null");
        throw object;
    }

    public static Object ensureNotNull(Object object, String string2, Object ... objectArray) {
        if (object != null) {
            return object;
        }
        string2 = String.format(string2, objectArray);
        object = new ValidationException(string2);
        throw object;
    }

    public static void fail(String string2) {
        ValidationException validationException = new ValidationException(string2);
        throw validationException;
    }

    public static void fail(String string2, Object ... objectArray) {
        string2 = String.format(string2, objectArray);
        ValidationException validationException = new ValidationException(string2);
        throw validationException;
    }

    public static void isFalse(boolean bl2) {
        if (!bl2) {
            return;
        }
        ValidationException validationException = new ValidationException("Must be false");
        throw validationException;
    }

    public static void isFalse(boolean bl2, String string2) {
        if (!bl2) {
            return;
        }
        ValidationException validationException = new ValidationException(string2);
        throw validationException;
    }

    public static void isTrue(boolean bl2) {
        if (bl2) {
            return;
        }
        ValidationException validationException = new ValidationException("Must be true");
        throw validationException;
    }

    public static void isTrue(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        ValidationException validationException = new ValidationException(string2);
        throw validationException;
    }

    public static void noNullElements(Object[] objectArray) {
        Validate.noNullElements(objectArray, "Array must not contain any null objects");
    }

    public static void noNullElements(Object[] object, String string2) {
        int n3 = ((Object[])object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            if (object2 != null) {
                continue;
            }
            object = new ValidationException(string2);
            throw object;
        }
    }

    public static void notEmpty(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            return;
        }
        object = new ValidationException("String must not be empty");
        throw object;
    }

    public static void notEmpty(String object, String string2) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            return;
        }
        object = new ValidationException(string2);
        throw object;
    }

    public static void notEmptyParam(String object, String string2) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            return;
        }
        string2 = cP.a("The '", string2, "' parameter must not be empty.");
        object = new ValidationException(string2);
        throw object;
    }

    public static void notNull(Object object) {
        if (object != null) {
            return;
        }
        object = new ValidationException("Object must not be null");
        throw object;
    }

    public static void notNull(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new ValidationException(string2);
        throw object;
    }

    public static void notNullParam(Object object, String string2) {
        if (object != null) {
            return;
        }
        string2 = cP.a("The parameter '", string2, "' must not be null.");
        object = new ValidationException(string2);
        throw object;
    }

    public static void wtf(String string2) {
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

