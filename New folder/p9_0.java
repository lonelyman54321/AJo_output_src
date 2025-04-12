/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.os.Handler
 *  android.os.Looper
 */
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p9
 */
public final class p9_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = SplashScreenActivity.Companion;
                object2 = (SplashScreenActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object2 = object2.getApplication();
                Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
                object3 = new SU2();
                mw0_1 mw0_12 = new mw0_1();
                object = new pa3_1((Application)object2, (SU2)object3, mw0_12);
                return object;
            }
            case 2: {
                object2 = (qz1_2)object2;
                Intrinsics.checkNotNullParameter(object2, "$viewModel");
                object = Boolean.FALSE;
                ((qz1_2)object2).T.setValue(object);
                ((qz1_2)object2).F("Okay, Got it");
                return Unit.a;
            }
            case 1: {
                object2 = (HomeCuratedWidgetVH)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                Object object4 = Looper.getMainLooper();
                object = new Handler(object4);
                object4 = new l71((HomeCuratedWidgetVH)object2);
                object.postDelayed((Runnable)object4, (long)100);
                return Unit.a;
            }
            case 0: 
        }
        q9$a q9$a = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        return ((Fragment)object2).requireActivity().getApplication();
    }
}

