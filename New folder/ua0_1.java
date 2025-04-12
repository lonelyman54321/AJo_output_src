/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.navigation.e;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.payment.activity.PeWebViewActivity;
import com.ril.ajio.payment.activity.PeWebViewActivity$a;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ua0
 */
public final class ua0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = "getApplication(...)";
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                PeWebViewActivity$a peWebViewActivity$a = PeWebViewActivity.Companion;
                object3 = (PeWebViewActivity)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object3 = object3.getApplication();
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                object2 = new op2_2((Application)object3);
                return object2;
            }
            case 1: {
                object3 = (NewProductDetailsFragment)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Application application = ((Fragment)object3).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(application, (String)object);
                object3 = ((Fragment)object3).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object3, (String)object);
                object = AjioApiConnector.INSTANCE.getPlpApi();
                NewPlpRepo newPlpRepo = new NewPlpRepo((Application)object3, (PlpApi)object);
                object2 = new e12_0(application, newPlpRepo);
                return object2;
            }
            case 0: 
        }
        object3 = (yT1)object3;
        Intrinsics.checkNotNullParameter(object3, "$navController");
        e.p((e)object3, "finish/coupon bonanza - how it works screen", null, 6);
        return Unit.a;
    }
}

