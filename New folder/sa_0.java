/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SA
 */
public final class sa_0
implements Function1 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ sa_0(gc_2 gc_22) {
        this.a = gc_22;
    }

    public final Object invoke(Object object) {
        object = (Subcomponent)object;
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        Intrinsics.checkNotNullParameter(object, "it");
        function1.invoke(object);
        return Unit.a;
    }
}

