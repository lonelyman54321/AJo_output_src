/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FU0
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ gu0_1 d;

    public FU0(Ref$ObjectRef ref$ObjectRef, gu0_1 gu0_12) {
        this.c = ref$ObjectRef;
        this.d = gu0_12;
        super(0);
    }

    public final Object invoke() {
        Object object = Ds2.a;
        this.c.element = object = K30.a(this.d, (H30)object);
        return Unit.a;
    }
}

