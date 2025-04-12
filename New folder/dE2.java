/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class dE2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (DataCallback)object;
        object2 = (DataCallback)object2;
        String string2 = "subRatingResponse";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "reviewsResponse";
        Intrinsics.checkNotNullParameter(object2, string3);
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string3);
        qf3 qf32 = new Object();
        qf32.a = object;
        qf32.b = object2;
        return dataCallback$Companion.onSuccess(qf32);
    }
}

