/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdViewModel;
import com.ril.ajio.services.data.Order.ShipmentInvoice;
import com.ril.ajio.services.entity.BannerAd;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import io.reactivex.internal.operators.completable.CompletableObserveOn;
import io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class I22
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ I22(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (DataCallback)object;
                object3 = (bg2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "shipmentInvoiceDataCallback");
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    n7 = ((DataCallback)object).getStatus();
                    if (n7 == 0) {
                        object = (ShipmentInvoice)((DataCallback)object).getData();
                        Object object4 = new wh2_2((ShipmentInvoice)object, (f82_0)object3);
                        object = ((bg2_1)object3).l;
                        object3 = ((wh2_2)object4).c;
                        object2 = new v00_0((i00_0)object3);
                        object3 = qt2_2.c;
                        x03_0.b(object3, "scheduler is null");
                        Object object5 = new CompletableSubscribeOn((u00_0)object2, (Scheduler)object3);
                        object2 = ti_2.a();
                        object3 = new CompletableObserveOn((u00_0)object5, (HandlerScheduler)object2);
                        object2 = new uh2_2((wh2_2)object4);
                        object5 = new vh2_2(object4);
                        object4 = new xj_2((vh2_2)object5, (uh2_2)object2);
                        ((u00_0)object3).a((h00_0)object4);
                        ((t30_0)object).b((yr0_2)object4);
                    } else {
                        n7 = ((DataCallback)object).getStatus();
                        if (n7 == n3) {
                            if ((object = ((DataCallback)object).getError()) == null || (object = ((DataError)object).getErrorMessage()) == null || (object = ((DataError$ErrorMessage)object).getMessage()) == null) {
                                object = "";
                            }
                            object2 = StringCompanionObject.INSTANCE;
                            n7 = R$string.acc_error_message;
                            object2 = hv3_0.K(n7);
                            object3 = new Object[n3];
                            n4 = 0;
                            object3[0] = object;
                            String string2 = "format(...)";
                            ZK1.e((Object[])object3, n3, (String)object2, string2, (String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (BannerAd)object;
        object3 = (q22_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Intrinsics.checkNotNullParameter(object, "it");
        BannerAdViewModel bannerAdViewModel = ((q22_0)object3).Wa();
        object2 = (String)((q22_0)object3).g1.getValue();
        ((q22_0)object3).g = object = bannerAdViewModel.getBannerList((BannerAd)object, (String)object2);
        ((q22_0)object3).Ib();
        return Unit.a;
    }
}

