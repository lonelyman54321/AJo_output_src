/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from xu
 */
public final class xu_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ yu_0 d;
    public final /* synthetic */ E60 e;

    public xu_0(Ref$ObjectRef ref$ObjectRef, yu_0 yu_02, E60 e60) {
        this.c = ref$ObjectRef;
        this.d = yu_02;
        this.e = e60;
        super(0);
    }

    public final Object invoke() {
        Object object = this.d.q;
        E60 e60 = this.e;
        long l2 = e60.l();
        bp1_0 bp1_02 = e60.getLayoutDirection();
        this.c.element = object = object.a(l2, bp1_02, e60);
        return Unit.a;
    }
}

