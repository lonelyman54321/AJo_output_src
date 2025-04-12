/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 */
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ril.ajio.data.repo.ApiErrorRepo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oN
 */
public final class on_2
implements vv1$a,
bx0_2,
ul3_0 {
    public static int b(float f5, int n3) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return ok1_1.b(TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)displayMetrics));
    }

    public static pD3 c(rd3_0 rd3_02, pw_2 pw_22, Wd0 wd0, Class clazz, String string2) {
        pD3 pD32 = new pD3(rd3_02, pw_22, wd0);
        Intrinsics.checkNotNullParameter(clazz, string2);
        return pD32;
    }

    public static Object d(int n3, List list) {
        int n4 = list.size() - n3;
        return list.get(n4);
    }

    public boolean a(aG2 aG22, aG2 aG23) {
        return aG22.g(aG23);
    }

    public Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "LP_RESEND_OTP";
        Intrinsics.checkNotNullParameter(string2, "$requestId");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

