/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class rq3$d
extends Lambda
implements Function0 {
    public final /* synthetic */ Function0 c;

    public rq3$d(rq3$c rq3$c) {
        this.c = rq3$c;
        super(0);
    }

    public final Object invoke() {
        rd3_0 rd3_02 = ((sD3)this.c.invoke()).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(rd3_02, "ownerProducer().viewModelStore");
        return rd3_02;
    }
}

