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

public final class q12
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ s12 b;

    public /* synthetic */ q12(Application application, s12 s122) {
        this.a = application;
        this.b = s122;
    }

    public final Object invoke() {
        F12 f12;
        s12 s122 = this.b;
        Intrinsics.checkNotNullParameter(s122, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object);
        s122 = s122.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(s122, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)s122);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

