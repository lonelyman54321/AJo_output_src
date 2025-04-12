/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;

final class CollectPreconditions {
    public static void checkEntryNotNull(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("null value in entry: ");
            stringBuilder.append(object);
            stringBuilder.append("=null");
            object = stringBuilder.toString();
            object2 = new NullPointerException((String)object);
            throw object2;
        }
        object2 = jk0_0.a(object2, "null key in entry: null=");
        object = new NullPointerException((String)object2);
        throw object;
    }

    public static int checkNonnegative(int n3, String string2) {
        if (n3 >= 0) {
            return n3;
        }
        String string3 = LO1.a(n3, string2, " cannot be negative but was: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static long checkNonnegative(long l2, String string2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            return l2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(l2);
        String string3 = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static void checkPositive(int n3, String string2) {
        if (n3 > 0) {
            return;
        }
        String string3 = LO1.a(n3, string2, " must be positive but was: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static void checkRemove(boolean bl2) {
        Preconditions.checkState(bl2, "no calls to next() since the last call to remove()");
    }
}

