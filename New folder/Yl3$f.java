/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Yl3$f
extends Lambda
implements Function1 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Function1 d;

    public Yl3$f(Yl3 yl3, Function1 function1) {
        this.c = yl3;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((Yl3)object).d;
        Function1 function1 = this.d;
        ((p83_0)object2).add(function1);
        object2 = new Zl3((Yl3)object, function1);
        return object2;
    }
}

