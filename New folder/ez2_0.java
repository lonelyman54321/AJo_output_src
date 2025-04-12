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
 * Renamed from ez2
 */
public final class ez2_0
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ mz2_0 b;

    public /* synthetic */ ez2_0(Application application, mz2_0 mz2_02) {
        this.a = application;
        this.b = mz2_02;
    }

    public final Object invoke() {
        F12 f12;
        mz2_0 mz2_02 = this.b;
        Intrinsics.checkNotNullParameter(mz2_02, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object);
        mz2_02 = mz2_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(mz2_02, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)mz2_02);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

