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
 * Renamed from Xc3
 */
public final class xc3_2
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ ed3_2 b;

    public /* synthetic */ xc3_2(Application application, ed3_2 ed3_22) {
        this.a = application;
        this.b = ed3_22;
    }

    public final Object invoke() {
        F12 f12;
        ed3_2 ed3_22 = this.b;
        Intrinsics.checkNotNullParameter(ed3_22, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object);
        ed3_22 = ed3_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(ed3_22, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)ed3_22);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

