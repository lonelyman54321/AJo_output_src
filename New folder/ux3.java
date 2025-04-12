/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ux3
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (DataCallback)object;
        object2 = (DataCallback)object2;
        Intrinsics.checkNotNullParameter(object, "newUserResponse");
        Intrinsics.checkNotNullParameter(object2, "userType");
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Intrinsics.checkNotNullParameter(object, "newUserBanner");
        Intrinsics.checkNotNullParameter(object2, "customerType");
        D32 d32 = new Object();
        d32.a = object;
        d32.b = object2;
        return dataCallback$Companion.onSuccess(d32);
    }
}

