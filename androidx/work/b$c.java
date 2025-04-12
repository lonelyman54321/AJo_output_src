/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b$c
extends Lambda
implements Function1 {
    public final /* synthetic */ Object c;

    public b$c(Object object) {
        this.c = object;
        super(1);
    }

    public final Object invoke(Object object) {
        Object[] objectArray = (Object[])this.c;
        int n3 = ((Number)object).intValue();
        if ((object = objectArray[n3]) != null) {
            return (String)object;
        }
        object = new NullPointerException("null cannot be cast to non-null type kotlin.String");
        throw object;
    }
}

