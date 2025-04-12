/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Im0
 */
public final class im0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ List c;

    public im0_0(List list) {
        this.c = list;
        super(0);
    }

    public final Object invoke() {
        Object e2 = this.c.get(2);
        Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type kotlin.Int");
        return (Integer)e2;
    }
}

