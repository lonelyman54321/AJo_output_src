/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.jvm.internal.Intrinsics;

public final class C12
implements bx0_2 {
    public final /* synthetic */ int a;

    public /* synthetic */ C12(int n3) {
        this.a = n3;
    }

    public static String a(int n3, int n4, int n7, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append(string2);
        stringBuilder.append(n4);
        stringBuilder.append(string3);
        stringBuilder.append(n7);
        return stringBuilder.toString();
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
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
            case 0: 
        }
        return NewPlpRepo.f((Throwable)object);
    }
}

