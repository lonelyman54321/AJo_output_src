/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ha3
 */
public final class ha3_2
implements Function1 {
    public final /* synthetic */ SplashScreenActivity a;

    public /* synthetic */ ha3_2(SplashScreenActivity splashScreenActivity) {
        this.a = splashScreenActivity;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = SplashScreenActivity.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "bottomNavigationDataDataCallback");
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2) {
            ((SplashScreenActivity)object2).D2();
        }
        return Unit.a;
    }
}

