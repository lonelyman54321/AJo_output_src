/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import com.google.common.base.Strings;

public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int n3, int n4, String string2) {
        int n7 = 1;
        int n8 = 2;
        if (n3 < 0) {
            Integer n10 = n3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n7] = n10;
            return Strings.lenientFormat("%s (%s) must not be negative", objectArray);
        }
        if (n4 >= 0) {
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[3];
            objectArray[0] = string2;
            objectArray[n7] = n14;
            objectArray[n8] = n15;
            return Strings.lenientFormat("%s (%s) must be less than size (%s)", objectArray);
        }
        String string3 = hj0_0.a(n4, "negative size: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    private static String badPositionIndex(int n3, int n4, String string2) {
        int n7 = 1;
        int n8 = 2;
        if (n3 < 0) {
            Integer n10 = n3;
            Object[] objectArray = new Object[n8];
            objectArray[0] = string2;
            objectArray[n7] = n10;
            return Strings.lenientFormat("%s (%s) must not be negative", objectArray);
        }
        if (n4 >= 0) {
            Integer n14 = n3;
            Integer n15 = n4;
            Object[] objectArray = new Object[3];
            objectArray[0] = string2;
            objectArray[n7] = n14;
            objectArray[n8] = n15;
            return Strings.lenientFormat("%s (%s) must not be greater than size (%s)", objectArray);
        }
        String string3 = hj0_0.a(n4, "negative size: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    private static String badPositionIndexes(int n3, int n4, int n7) {
        if (n3 >= 0 && n3 <= n7) {
            if (n4 >= 0 && n4 <= n7) {
                Integer n8 = n4;
                Integer n10 = n3;
                Object[] objectArray = new Object[]{n8, n10};
                return Strings.lenientFormat("end index (%s) must not be less than start index (%s)", objectArray);
            }
            return Preconditions.badPositionIndex(n4, n7, "end index");
        }
        return Preconditions.badPositionIndex(n3, n7, "start index");
    }

    public static void checkArgument(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, char c2, char c3) {
        if (bl2) {
            return;
        }
        Character c5 = Character.valueOf(c2);
        Character c6 = Character.valueOf(c3);
        Object[] objectArray = new Object[]{c5, c6};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, char c2, int n3) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Integer n4 = n3;
        Object[] objectArray = new Object[]{c3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, char c2, long l2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Long l3 = l2;
        Object[] objectArray = new Object[]{c3, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, char c2, Object object) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, int n3, char c2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{n4, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, int n3, int n4) {
        if (bl2) {
            return;
        }
        Integer n7 = n3;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{n7, n8};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, int n3, long l2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Long l3 = l2;
        Object[] objectArray = new Object[]{n4, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, int n3, Object object) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, long l2, char c2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{l3, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, long l2, int n3) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{l3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, long l2, long l3) {
        if (bl2) {
            return;
        }
        Long l4 = l2;
        Long l7 = l3;
        Object[] objectArray = new Object[]{l4, l7};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, long l2, Object object) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{object, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{object, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{object, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, Object object2) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, Object object2, Object object3) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object object, Object object2, Object object3, Object object4) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3, object4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static void checkArgument(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static int checkElementIndex(int n3, int n4) {
        return Preconditions.checkElementIndex(n3, n4, "index");
    }

    public static int checkElementIndex(int n3, int n4, String string2) {
        if (n3 >= 0 && n3 < n4) {
            return n3;
        }
        String string3 = Preconditions.badElementIndex(n3, n4, string2);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
        throw indexOutOfBoundsException;
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    public static Object checkNotNull(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        object2 = String.valueOf(object2);
        object = new NullPointerException((String)object2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, char c2) {
        if (object != null) {
            return object;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, char c2, char c3) {
        if (object != null) {
            return object;
        }
        Character c5 = Character.valueOf(c2);
        Character c6 = Character.valueOf(c3);
        Object[] objectArray = new Object[]{c5, c6};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, char c2, int n3) {
        if (object != null) {
            return object;
        }
        Character c3 = Character.valueOf(c2);
        Integer n4 = n3;
        Object[] objectArray = new Object[]{c3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, char c2, long l2) {
        if (object != null) {
            return object;
        }
        Character c3 = Character.valueOf(c2);
        Long l3 = l2;
        Object[] objectArray = new Object[]{c3, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, char c2, Object object2) {
        if (object != null) {
            return object;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, int n3) {
        if (object != null) {
            return object;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, int n3, char c2) {
        if (object != null) {
            return object;
        }
        Integer n4 = n3;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{n4, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, int n3, int n4) {
        if (object != null) {
            return object;
        }
        Integer n7 = n3;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{n7, n8};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, int n3, long l2) {
        if (object != null) {
            return object;
        }
        Integer n4 = n3;
        Long l3 = l2;
        Object[] objectArray = new Object[]{n4, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, int n3, Object object2) {
        if (object != null) {
            return object;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, long l2) {
        if (object != null) {
            return object;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, long l2, char c2) {
        if (object != null) {
            return object;
        }
        Long l3 = l2;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{l3, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, long l2, int n3) {
        if (object != null) {
            return object;
        }
        Long l3 = l2;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{l3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, long l2, long l3) {
        if (object != null) {
            return object;
        }
        Long l4 = l2;
        Long l7 = l3;
        Object[] objectArray = new Object[]{l4, l7};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, long l2, Object object2) {
        if (object != null) {
            return object;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2) {
        if (object != null) {
            return object;
        }
        Object[] objectArray = new Object[]{object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, char c2) {
        if (object != null) {
            return object;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{object2, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, int n3) {
        if (object != null) {
            return object;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{object2, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, long l2) {
        if (object != null) {
            return object;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{object2, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, Object object3) {
        if (object != null) {
            return object;
        }
        Object[] objectArray = new Object[]{object2, object3};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, Object object3, Object object4) {
        if (object != null) {
            return object;
        }
        Object[] objectArray = new Object[]{object2, object3, object4};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object object2, Object object3, Object object4, Object object5) {
        if (object != null) {
            return object;
        }
        Object[] objectArray = new Object[]{object2, object3, object4, object5};
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object checkNotNull(Object object, String string2, Object ... objectArray) {
        if (object != null) {
            return object;
        }
        string2 = Strings.lenientFormat(string2, objectArray);
        object = new NullPointerException(string2);
        throw object;
    }

    public static int checkPositionIndex(int n3, int n4) {
        return Preconditions.checkPositionIndex(n3, n4, "index");
    }

    public static int checkPositionIndex(int n3, int n4, String string2) {
        if (n3 >= 0 && n3 <= n4) {
            return n3;
        }
        String string3 = Preconditions.badPositionIndex(n3, n4, string2);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string3);
        throw indexOutOfBoundsException;
    }

    public static void checkPositionIndexes(int n3, int n4, int n7) {
        if (n3 >= 0 && n4 >= n3 && n4 <= n7) {
            return;
        }
        String string2 = Preconditions.badPositionIndexes(n3, n4, n7);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }

    public static void checkState(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, char c2, char c3) {
        if (bl2) {
            return;
        }
        Character c5 = Character.valueOf(c2);
        Character c6 = Character.valueOf(c3);
        Object[] objectArray = new Object[]{c5, c6};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, char c2, int n3) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Integer n4 = n3;
        Object[] objectArray = new Object[]{c3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, char c2, long l2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Long l3 = l2;
        Object[] objectArray = new Object[]{c3, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, char c2, Object object) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{c3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, int n3, char c2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{n4, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, int n3, int n4) {
        if (bl2) {
            return;
        }
        Integer n7 = n3;
        Integer n8 = n4;
        Object[] objectArray = new Object[]{n7, n8};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, int n3, long l2) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Long l3 = l2;
        Object[] objectArray = new Object[]{n4, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, int n3, Object object) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{n4, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, long l2, char c2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{l3, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, long l2, int n3) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Integer n4 = n3;
        Object[] objectArray = new Object[]{l3, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, long l2, long l3) {
        if (bl2) {
            return;
        }
        Long l4 = l2;
        Long l7 = l3;
        Object[] objectArray = new Object[]{l4, l7};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, long l2, Object object) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{l3, object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, char c2) {
        if (bl2) {
            return;
        }
        Character c3 = Character.valueOf(c2);
        Object[] objectArray = new Object[]{object, c3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, int n3) {
        if (bl2) {
            return;
        }
        Integer n4 = n3;
        Object[] objectArray = new Object[]{object, n4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, long l2) {
        if (bl2) {
            return;
        }
        Long l3 = l2;
        Object[] objectArray = new Object[]{object, l3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, Object object2) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, Object object2, Object object3) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object object, Object object2, Object object3, Object object4) {
        if (bl2) {
            return;
        }
        Object[] objectArray = new Object[]{object, object2, object3, object4};
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, String string2, Object ... objectArray) {
        if (bl2) {
            return;
        }
        string2 = Strings.lenientFormat(string2, objectArray);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

