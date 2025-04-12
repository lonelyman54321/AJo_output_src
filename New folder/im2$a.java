/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class im2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ im2 c;

    public im2$a(im2 im22) {
        this.c = im22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Kt0)object;
        this.c.onDraw((Kt0)object);
        return Unit.a;
    }
}

