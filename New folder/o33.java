/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

public final class o33
implements bx0_2 {
    public final /* synthetic */ String a;

    public /* synthetic */ o33() {
        this.a = "single page checkout";
    }

    public final Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$screenName");
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "PlaceOrderRequest", true, string2, "Forward");
    }
}

