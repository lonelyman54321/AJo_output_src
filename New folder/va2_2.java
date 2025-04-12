/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vA2
 */
public final class va2_2
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ Resource b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ va2_2(Function2 function2, Resource resource, boolean bl2) {
        this.a = function2;
        this.b = resource;
        this.c = bl2;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onItemWishlist");
        Boolean bl2 = this.c;
        Resource resource = this.b;
        function2.invoke(resource, bl2);
        return Unit.a;
    }
}

