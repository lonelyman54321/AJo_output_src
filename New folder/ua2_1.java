/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uA2
 */
public final class ua2_1
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Resource b;

    public /* synthetic */ ua2_1(Function1 function1, Resource resource) {
        this.a = function1;
        this.b = resource;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onItemClick");
        Resource resource = this.b;
        function1.invoke(resource);
        return Unit.a;
    }
}

