/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hj0
 */
public final class hj0_0
implements vv1$a,
bx0_2 {
    public static String a(int n3, String string2) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "PAYMENT_BinInfo";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

