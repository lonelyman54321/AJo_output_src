/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ex
extends Lambda
implements Function1 {
    public final /* synthetic */ Yl3 c;
    public final /* synthetic */ Function1 d;

    public ex(Yl3 yl3, Function1 function1) {
        this.c = yl3;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Tl3)object;
        Object object2 = this.c;
        if (object2 != null) {
            object2 = ((Yl3)object2).b;
            ((h83_0)object2).setValue(object);
        }
        object2 = this.d;
        if (object2 != null) {
            object2.invoke(object);
        }
        return Unit.a;
    }
}

