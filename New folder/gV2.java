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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class gV2
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ vv2_2 b;

    public /* synthetic */ gV2(Application application, vv2_2 vv2_22) {
        this.a = application;
        this.b = vv2_22;
    }

    public final Object invoke() {
        F12 f12;
        Object object;
        vv2_2 vv2_22 = this.b;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object2 = object = vv2_22.K0.getValue();
        object2 = (NewPlpRepo)object;
        vv2_22 = vv2_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(vv2_22, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)vv2_22);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, (NewPlpRepo)object2, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

