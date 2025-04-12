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

/*
 * Renamed from Sp2
 */
public final class sp2_1
implements Function0 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ xp2_2 b;

    public /* synthetic */ sp2_1(Application application, xp2_2 xp2_22) {
        this.a = application;
        this.b = xp2_22;
    }

    public final Object invoke() {
        F12 f12;
        Object object;
        xp2_2 xp2_22 = this.b;
        Intrinsics.checkNotNullParameter(xp2_22, "this$0");
        Application application = this.a;
        Intrinsics.checkNotNull(application);
        Object object2 = object = xp2_22.G.getValue();
        object2 = (NewPlpRepo)object;
        xp2_22 = xp2_22.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(xp2_22, "getApplication(...)");
        UserRepo userRepo = new UserRepo((Application)xp2_22);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        RtbRepo rtbRepo = new RtbRepo((Context)application);
        object = f12;
        f12 = new F12(application, (NewPlpRepo)object2, userRepo, wishListRepo, rtbRepo);
        return f12;
    }
}

