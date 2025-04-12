/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class XF2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ XF2 c;

    public XF2$a(XF2 xF2) {
        this.c = xF2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mx0)object;
        this.c.b((mx0)object);
        return Unit.a;
    }
}

