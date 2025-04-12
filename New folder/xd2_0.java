/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XD2
 */
public final class xd2_0
implements Function1 {
    public final /* synthetic */ gE2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ xd2_0(gE2 gE22, int n3) {
        this.a = gE22;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        zr1_1 zr1_12 = ((gE2)object2).h;
        Integer n3 = this.b;
        object2 = new Pair(n3, object);
        zr1_12.k(object2);
        return Unit.a;
    }
}

