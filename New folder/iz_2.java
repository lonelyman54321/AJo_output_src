/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IZ
 */
public final class iz_2
implements Function1 {
    public final /* synthetic */ oz_2 a;
    public final /* synthetic */ int b;

    public /* synthetic */ iz_2(oz_2 oz_22, int n3) {
        this.a = oz_22;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        oz_2 oz_22 = this.a;
        Intrinsics.checkNotNullParameter(oz_22, "this$0");
        int n3 = this.b;
        oz_22.f((DataCallback)object, n3);
        return Unit.a;
    }
}

