/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DO
 */
public final class do_0
implements bx0_2 {
    public static yn1_2 a(Class object, String string2, Class clazz, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, string2);
        object = rn1_2.c(clazz);
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(object, string4);
        return object;
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "PAYMENT_DeletePaymentInstrument";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }
}

