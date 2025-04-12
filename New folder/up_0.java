/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.RtbRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.network.api.PlpApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UP
 */
public final class up_0
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ vp_1 b;

    public /* synthetic */ up_0(Application application, vp_1 vp_12) {
        this.a = application;
        this.b = vp_12;
    }

    public final Object invoke() {
        F12 f12;
        vp_1 vp_12 = this.b;
        Intrinsics.checkNotNullParameter(vp_12, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object);
        vp_12 = vp_12.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(vp_12, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)vp_12);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

