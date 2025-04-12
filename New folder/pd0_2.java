/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PD0
 */
public final class pd0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = fq0_2.Companion;
                object = (fq0_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Application application = ((Fragment)object).requireActivity().getApplication();
                object3 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(application, (String)object3);
                Object object4 = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                Object object5 = AjioApiConnector.INSTANCE.getPlpApi();
                NewPlpRepo newPlpRepo = new NewPlpRepo((Application)object4, (PlpApi)object5);
                object5 = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
                object4 = new UserRepo((Application)object5);
                Object object6 = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                object5 = new WishListRepo((Context)object6);
                object = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object6 = new RtbRepo((Context)object);
                object3 = object2;
                object2 = new F12(application, newPlpRepo, (UserRepo)object4, (WishListRepo)object5, (RtbRepo)object6);
                return object2;
            }
            case 0: 
        }
        n3 = ExchangeReturnVerifyActivity.Y0;
        object = (ExchangeReturnVerifyActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        return UserInformation.getInstance(object.getApplicationContext());
    }
}

