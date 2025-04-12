/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ca3
 */
public final class ca3_1
implements Function0 {
    public final /* synthetic */ SplashScreenActivity a;

    public /* synthetic */ ca3_1(SplashScreenActivity splashScreenActivity) {
        this.a = splashScreenActivity;
    }

    public final Object invoke() {
        SplashScreenActivity splashScreenActivity = this.a;
        Intrinsics.checkNotNullParameter(splashScreenActivity, "this$0");
        return UserInformation.getInstance(splashScreenActivity.getApplicationContext());
    }
}

