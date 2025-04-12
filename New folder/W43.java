/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class W43
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Y43 d;
    public final /* synthetic */ Function2 e;

    public W43(Y53 y53, Y43 y43, Function2 function2) {
        this.c = y53;
        this.d = y43;
        this.e = function2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.c.invoke(object);
        Y43 y43 = this.d;
        Object object2 = y43.c;
        Function2 function2 = null;
        ((le_2)object2).k((Throwable)object, false);
        do {
            if ((object2 = vr_2.a(y43.c.m())) == null) {
                object2 = null;
                continue;
            }
            function2 = this.e;
            function2.invoke(object2, object);
            object2 = Unit.a;
        } while (object2 != null);
        return Unit.a;
    }
}

