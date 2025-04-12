/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class b$b {
    public final int a;
    public final Method b;

    public b$b(Method method, int n3) {
        this.a = n3;
        this.b = method;
        ((AccessibleObject)method).setAccessible(true);
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n3 = object instanceof b$b;
        if (n3 == 0) {
            return false;
        }
        object = (b$b)object;
        int n4 = this.a;
        n3 = ((b$b)object).a;
        if (n4 != n3 || !(bl2 = (string2 = this.b.getName()).equals(object = ((b$b)object).b.getName()))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        return this.b.getName().hashCode() + n3;
    }
}

