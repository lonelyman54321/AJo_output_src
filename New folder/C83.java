/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class C83
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public C83(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (y83)object;
        object = (v83_0)this.c.invoke(object);
        Object object2 = A83.c;
        synchronized (object2) {
            Object object3 = A83.d;
            int n3 = ((v83_0)object).d();
            object3 = ((y83)object3).f(n3);
            A83.d = object3;
            object3 = Unit.a;
            return object;
        }
    }
}

