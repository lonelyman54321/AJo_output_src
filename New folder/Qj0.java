/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.c;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

public final class Qj0
implements vv1$b,
bx0_2 {
    public static String b(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)string2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public void a(Object object, c c2) {
        object = (oe)object;
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "PAYMENT_StoredPaymentInstrument";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }
}

