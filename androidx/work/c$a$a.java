/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.b;
import androidx.work.c$a;

public final class c$a$a
extends c$a {
    public final b a;

    public c$a$a() {
        b b2 = b.b;
        this.a = b2;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<c$a$a> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = c$a$a.class) == (object2 = object.getClass())) {
            object = (c$a$a)object;
            object2 = this.a;
            object = ((c$a$a)object).a;
            return ((b)object2).equals(object);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = c$a$a.class.getName().hashCode() * 31;
        return this.a.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Failure {mOutputData=");
        b b2 = this.a;
        stringBuilder.append(b2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

