/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RZ
 */
public final class rz_2
implements Function1 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ rz_2(e00 e002) {
        this.a = e002;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ArrayList arrayList = ((e00)object).g().d;
        ((e00)object).j(arrayList);
        return Unit.a;
    }
}

