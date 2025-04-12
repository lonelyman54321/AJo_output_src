/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.OnFailureListener;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ga3
 */
public final class ga3_1
implements OnFailureListener {
    public final /* synthetic */ SplashScreenActivity a;
    public final /* synthetic */ long b;

    public /* synthetic */ ga3_1(SplashScreenActivity splashScreenActivity, long l2) {
        this.a = splashScreenActivity;
        this.b = l2;
    }

    public final void onFailure(Exception exception) {
        Object object = SplashScreenActivity.Companion;
        SplashScreenActivity splashScreenActivity = this.a;
        Intrinsics.checkNotNullParameter(splashScreenActivity, "this$0");
        Intrinsics.checkNotNullParameter(exception, "e");
        long l2 = System.currentTimeMillis();
        object = splashScreenActivity.z2();
        long l3 = this.b;
        float f5 = l2 - l3;
        qu3 qu32 = new qu3(null, null, false, "failed", f5);
        String string2 = "remarketing";
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        qu32.f = string2;
        ((pa3_1)object).c(qu32);
        splashScreenActivity.A2();
        splashScreenActivity.E2(null, null);
        exception.getClass();
        yn3_0.a.e(exception);
    }
}

