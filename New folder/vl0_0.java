/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.b;
import com.google.accompanist.insets.WindowInsetsKt;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VL0
 */
public final class vl0_0 {
    public static boolean a;
    public static LoginSignupBenefitsBannerData b;

    public static final void a(int n3, b30_0 object, qz1_2 qz1_22, String object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        int n4 = -1786308285;
        object = object.g(n4);
        String string2 = "home_route";
        object2 = new qb2_0(string2, qz1_22, bl2);
        u10 u102 = v10.c(-727967319, (fx0_2)object2, (b30_0)object);
        int n7 = 384;
        int n8 = 3;
        WindowInsetsKt.ProvideWindowInsets(false, false, u102, (b30_0)object, n7, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new lb2_1(n3, qz1_22, string2, bl2);
        }
    }

    public static final wl0_1 b(Context object, b b2, kd3_0 kd3_02) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(b2, "logger");
        Intrinsics.checkNotNullParameter(kd3_02, "storeRegistry");
        yf1_2 yf1_22 = kd3_02.d;
        ol0_1 ol0_12 = new ol0_1((Context)object, b2);
        jl0_1 jl0_12 = new jl0_1(ol0_12);
        ml0_2 ml0_22 = new ml0_2(ol0_12, b2);
        fm0_0 fm0_02 = kd3_02.e;
        pt1_2 pt1_22 = kd3_02.c;
        object = new wl0_1(jl0_12, ml0_22, yf1_22, fm0_02, pt1_22);
        return object;
    }
}

