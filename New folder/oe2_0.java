/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oE2
 */
public final class oe2_0
implements bx0_2 {
    public static String a(int n3, int n4, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append(string2);
        stringBuilder.append(n4);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Intrinsics.checkNotNullParameter(object2, "throwable");
        object = yn3_0.a;
        String string2 = ((Throwable)object2).getLocalizedMessage();
        if (string2 == null) {
            string2 = "";
        }
        string2 = "error is :".concat(string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).f(string2, objectArray);
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "deleteReviewImage", true, "", "Forward");
    }
}

