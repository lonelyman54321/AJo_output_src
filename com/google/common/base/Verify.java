/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Strings;
import com.google.common.base.VerifyException;

public final class Verify {
    private Verify() {
    }

    public static void verify(boolean bl2) {
        if (bl2) {
            return;
        }
        VerifyException verifyException = new VerifyException();
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, char c2, char c3) {
        if (bl2) {
            return;
        }
        Character c5 = Character.valueOf(c2);
        Character c6 = Character.valueOf(c3);
        Object[] objectArray = new Object[]{c5, c6};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, char c2, int n3) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Integer n4 = n3;
        Object[] objectArray = new Object[]{c3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, char c2, long l2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Long l3 = l2;
        Object[] objectArray = new Object[]{c3, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, char c2, Object object) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, int n3, char c2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{n4, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, int n3, int n4) {
        if (bl2) {
            return;
        }
        Integer n7 = n3;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{n7, n8};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, int n3, long l2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Long l3 = l2;
        Object[] objectArray = new Object[]{n4, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, int n3, Object object) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, long l2, char c2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{l3, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, long l2, int n3) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{l3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, long l2, long l3) {
        if (bl2) {
            return;
        }
        Long l4 = l2;
        Long l7 = l3;
        Object[] objectArray = new Object[]{l4, l7};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, long l2, Object object) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{object, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{object, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{object, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, Object object2) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, Object object2, Object object3) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object object, Object object2, Object object3, Object object4) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3, object4};
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static void verify(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = Strings.lenientFormat(string2, objectArray);
        VerifyException verifyException = new VerifyException(string2);
        throw verifyException;
    }

    public static Object verifyNotNull(Object object) {
        Object[] objectArray = new Object[]{};
        return Verify.verifyNotNull(object, "expected a non-null reference", objectArray);
    }

    public static Object verifyNotNull(Object object, String string2, Object ... objectArray) {
        if (object != null) {
            return object;
        }
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new VerifyException(string2);
        throw object;
    }
}

