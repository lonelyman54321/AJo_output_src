/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G9
 */
public final class g9_0
implements bx0_2 {
    public static String a(float f5, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(f5);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        object = "throwable";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        n9_0.a.getClass();
        Intrinsics.checkNotNullParameter(object2, (String)object);
        String string2 = "BackGround_AllCMSCategories";
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, string2, false, null, null, 28, null);
    }
}

