/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Fu3
implements Function1 {
    public final /* synthetic */ mu1_1 a;
    public final /* synthetic */ tr1_0 b;

    public /* synthetic */ Fu3(mu1_1 mu1_12, tr1_0 tr1_02) {
        this.a = mu1_12;
        this.b = tr1_02;
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$state$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new Iu3((tr1_0)object2);
        object2 = this.a;
        object2.getLifecycle().a((lu1)object);
        xv3_0 xv3_02 = new xv3_0((mu1_1)object2, (Iu3)object);
        return xv3_02;
    }
}

