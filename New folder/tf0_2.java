/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TF0
 */
public final class tf0_2
implements Function0 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ ResourceOwner b;

    public /* synthetic */ tf0_2(of0_2 of0_22, ResourceOwner resourceOwner) {
        this.a = of0_22;
        this.b = resourceOwner;
    }

    public final Object invoke() {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$brandClick");
        ResourceOwner resourceOwner = this.b;
        Intrinsics.checkNotNullParameter(resourceOwner, "$brand");
        function1.invoke(resourceOwner);
        return Unit.a;
    }
}

