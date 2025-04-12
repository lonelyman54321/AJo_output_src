/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.c$a;

public final class c$a$b
extends c$a {
    public final boolean equals(Object clazz) {
        Class<c$a$b> clazz2;
        boolean bl2 = true;
        if (this == clazz) {
            return bl2;
        }
        if (clazz == null || (clazz2 = c$a$b.class) != (clazz = clazz.getClass())) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return c$a$b.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}

