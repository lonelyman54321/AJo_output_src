/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.api.CustomerReviewsApi;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class Ch0 {
    public final CustomerReviewsApi a;

    public Ch0(CustomerReviewsApi customerReviewsApi) {
        Intrinsics.checkNotNullParameter(customerReviewsApi, "reviewService");
        this.a = customerReviewsApi;
    }

    public final Object a(String string2, HashMap hashMap, f80_0 f80_02) {
        return this.a.getReviews("ajio_b2c", string2, hashMap, f80_02);
    }

    public final Object b(String string2, Integer n3, String string3, String string4, f80_0 f80_02) {
        return this.a.updateLikesReviews(string2, "ajio_b2c", string4, string3, n3, f80_02);
    }
}

