/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class G70$a
extends Lambda
implements Function1 {
    public final /* synthetic */ P70 c;

    public G70$a(P70 p70) {
        this.c = p70;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((e72)object).a;
        object = new P70$a$b(l2);
        this.c.a.setValue(object);
        return Unit.a;
    }
}

