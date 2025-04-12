/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.data.repo.WishListRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rv2
 */
public final class rv2_2
extends Hj {
    public final BH3 a;

    public rv2_2(Application application) {
        BH3 bH3;
        Intrinsics.checkNotNullParameter(application, "application");
        super(application);
        WishListRepo wishListRepo = new WishListRepo((Context)application);
        this.a = bH3 = new BH3(wishListRepo);
    }
}

