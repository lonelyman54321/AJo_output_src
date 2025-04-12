/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZV1
 */
public final class zv1_0
implements Runnable {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ zv1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = h40_0.a;
        object2 = xv$a_0.Cart;
        boolean bl2 = h40_0.S0((xv$a_0)((Object)object2));
        if (bl2) {
            boolean bl3;
            BannerAdViewModel bannerAdViewModel = (BannerAdViewModel)((ex1_0)object).b1.getValue();
            wx1_1 wx1_12 = ((ex1_0)object).t;
            if (wx1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartViewModel");
                bl3 = false;
                wx1_12 = null;
            }
            bl3 = wx1_12.c();
            object = ((ew_2)object).a.f();
            if (object == null) {
                object = "";
            }
            bannerAdViewModel.getAdsBannerDataMiscPages((xv$a_0)((Object)object2), bl3, (String)object);
        }
    }
}

