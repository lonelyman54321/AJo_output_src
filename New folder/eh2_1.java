/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eh2
 */
public final class eh2_1
implements Function1 {
    public final /* synthetic */ ih2_1 a;
    public final /* synthetic */ List b;

    public /* synthetic */ eh2_1(ih2_1 ih2_12, List list) {
        this.a = ih2_12;
        this.b = list;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        ih2_1 ih2_12 = this.a;
        Intrinsics.checkNotNullParameter(ih2_12, "this$0");
        List list = this.b;
        ih2_12.x(n3, list);
        return Unit.a;
    }
}

