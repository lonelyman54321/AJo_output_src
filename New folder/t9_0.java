/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.earlyaccess.OnBoardingInfoActivity;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.home.transform.HomeData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.LpStoredCardBalanceList;
import com.ril.ajio.services.data.user.ScreenType;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t9
 */
public final class t9_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t9_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        int n4 = 1;
        int n7 = 0;
        Intent intent = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n8 = this.a;
        switch (n8) {
            default: {
                Intent intent2 = object;
                intent2 = (Throwable)object;
                object3 = (gE2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((gE2)object3).g;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(intent2);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)intent2, "submitSubRatingProductReview", false, null, null, 28, null);
                object.k(dataCallback);
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                object3 = (g)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "callback");
                object2 = cp_1.Companion;
                int n10 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n10 != 0) {
                    object2 = ((g)object3).c;
                    if (object2 != null) {
                        object2.h();
                    }
                    if ((n10 = object.getStatus()) == 0) {
                        ((g)object3).l = null;
                        ((g)object3).f = null;
                        if ((object = (LpStoredCardBalanceList)object.getData()) != null) {
                            kj2_1 kj2_12 = ((g)object3).Wa();
                            object = object.getResponseList();
                            kj2_12.i = object;
                        }
                    } else {
                        int n14 = object.getStatus();
                        if (n14 == n4) {
                            object = ((g)object3).Wa();
                            object.i = null;
                        }
                    }
                    ((g)object3).db();
                    ((g)object3).Ra();
                }
                return Unit.a;
            }
            case 1: {
                intent = object;
                intent = (Throwable)object;
                object3 = (ps_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((ps_0)object3).d;
                Object object4 = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(intent);
                object4 = ApiErrorRepo.handleApiException$default((ApiErrorRepo)object4, (Throwable)intent, "PlaceOrderRequest", false, null, null, 28, null);
                object.k(object4);
                return Unit.a;
            }
            case 0: 
        }
        object = (BaseResponse)object;
        object2 = (HomeData)object.getData();
        if (object2 != null && (object2 = ((HomeData)object2).getHomeRowData()) != null && (n3 = (object2 = (Collection)object2).isEmpty() ^ n4) == n4) {
            Object object5;
            if ((object = (HomeData)object.getData()) != null && (object = object.getHomeRowData()) != null) {
                n4 = 0;
                object5 = null;
                if ((object = (HomeRowData)object.get(0)) != null) {
                    intent = object.getBanners();
                }
            }
            ww0_2.a = intent;
            object = CustomerStoreType.a;
            object = od3_2.a();
            object5 = ScreenType.SCREEN_HOME;
            boolean bl2 = mz3_0.y((String)(object = CustomerStoreType.a((String)object, object5)));
            if (bl2) {
                object = q9_0.Companion;
                object = ((q9_0)(object3 = (q9_0)object3)).db().isOnBoardingShown();
                bl2 = object.booleanValue();
                if (!bl2) {
                    object = ((q9_0)object3).db();
                    object5 = Boolean.TRUE;
                    object.setOnBoardingShown((Boolean)object5);
                    object5 = ((Fragment)object3).getActivity();
                    intent = OnBoardingInfoActivity.class;
                    object = new Intent((Context)object5, intent);
                    object5 = ((Fragment)object3).getActivity();
                    if (object5 != null) {
                        n7 = 60;
                        ((ComponentActivity)object5).startActivityForResult((Intent)object, n7);
                    }
                }
            }
        }
        return Unit.a;
    }
}

