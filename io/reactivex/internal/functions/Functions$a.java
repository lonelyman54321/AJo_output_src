/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.internal.functions;

public final class Functions$a
implements bx0_2 {
    public final dx_0 a;

    public Functions$a(dx_0 dx_02) {
        this.a = dx_02;
    }

    public final Object apply(Object object) {
        int n3 = ((Object[])(object = (Object[])object)).length;
        int n4 = 2;
        if (n3 == n4) {
            Object object2 = object[0];
            object = object[1];
            return this.a.apply(object2, object);
        }
        StringBuilder stringBuilder = new StringBuilder("Array of size 2 expected but got ");
        int n7 = ((Object[])object).length;
        stringBuilder.append(n7);
        object = stringBuilder.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }
}

