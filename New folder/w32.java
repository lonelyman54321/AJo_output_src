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

public final class w32
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ x32_0 b;

    public /* synthetic */ w32(Application application, x32_0 x32_02) {
        this.a = application;
        this.b = x32_02;
    }

    public final Object invoke() {
        F12 f12;
        x32_0 x32_02 = this.b;
        Intrinsics.checkNotNullParameter(x32_02, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object);
        x32_02 = x32_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(x32_02, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)x32_02);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

