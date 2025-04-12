/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class nn3$b
extends Lambda
implements Function0 {
    public final /* synthetic */ Function0 c;

    public nn3$b(nn3$a nn3$a) {
        this.c = nn3$a;
        super(0);
    }

    public final Object invoke() {
        rd3_0 rd3_02 = ((sD3)this.c.invoke()).getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(rd3_02, "ownerProducer().viewModelStore");
        return rd3_02;
    }
}

