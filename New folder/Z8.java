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

public final class Z8
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ q9_0 b;

    public /* synthetic */ Z8(Application application, q9_0 q9_02) {
        this.a = application;
        this.b = q9_02;
    }

    public final Object invoke() {
        Object object = q9_0.Companion;
        q9_0 q9_02 = this.b;
        Intrinsics.checkNotNullParameter(q9_02, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object2 = AjioApiConnector.INSTANCE.getPlpApi();
        NewPlpRepo newPlpRepo = new NewPlpRepo(application, (PlpApi)object2);
        q9_02 = q9_02.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(q9_02, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)q9_02);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object2 = object;
        object = new F12(application, newPlpRepo, userRepo, wishListRepo, rtbRepo);
        return object;
    }
}

