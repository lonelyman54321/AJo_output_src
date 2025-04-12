/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.kmm.shared.network.api.HomeApi;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationResponse;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class F61
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F61(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (kd2_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((kd2_0)object3).b;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "unratedItemRatingsReviews", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                Object object4 = (o12_0)this.b;
                Intrinsics.checkNotNullParameter(object4, "this$0");
                Object object5 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object5, (DataCallback)object);
                if (n4 == 0) return Unit.a;
                n4 = ((DataCallback)object).getStatus();
                Object object6 = null;
                if (n4 == 0) {
                    object5 = (LocationResponse)((DataCallback)object).getData();
                    if (object5 != null) {
                        object5 = ((LocationResponse)object5).getData();
                    } else {
                        n4 = 0;
                        object5 = null;
                    }
                    if (object5 != null) {
                        object5 = (jo_2)((o12_0)object4).a.getValue();
                        object = (LocationResponse)((DataCallback)object).getData();
                        String string2 = "";
                        if (object == null || (object = ((LocationResponse)object).getData()) == null || (object = ((GPSResponse)object).getPincodeGroup()) == null) {
                            object = string2;
                        }
                        ((jo_2)object5).z((String)object);
                        boolean bl2 = ap_0.b();
                        if (bl2) {
                            object = ((o12_0)object4).r;
                            if (object == null) {
                                object = "cartViewModel";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object6 = object;
                            }
                            object = ((o12_0)object4).s;
                            ((wx1_1)object6).h((String)object, string2);
                            return Unit.a;
                        }
                        object = ((o12_0)object4).e;
                        if (object != null) {
                            object6 = object.getText();
                        }
                        object = String.valueOf(object6);
                        n4 = (int)(mz3_0.B() ? 1 : 0);
                        if (n4 != 0 && (n4 = (int)(((UserInformation)(object5 = UserInformation.getInstance(((Fragment)object4).getContext()))).isUserOnline() ? 1 : 0)) != 0) {
                            ((o12_0)object4).Pa((String)object);
                            return Unit.a;
                        }
                        ((o12_0)object4).Oa((String)object);
                        return Unit.a;
                    }
                }
                if ((object = (LocationResponse)((DataCallback)object).getData()) != null) {
                    object6 = ((LocationResponse)object).getData();
                }
                if (object6 != null) return Unit.a;
                object = ((o12_0)object4).c;
                if (object != null) {
                    n4 = 0;
                    object5 = null;
                    object.setVisibility(0);
                }
                if ((object = ((o12_0)object4).c) != null) {
                    ai0_2.a((View)object);
                }
                if ((object = ((o12_0)object4).c) == null) return Unit.a;
                n3 = R$string.invalid_pincode_refresh_luxe;
                object4 = hv3_0.K(n3);
                object.setText((CharSequence)object4);
                return Unit.a;
            }
            case 0: 
        }
        Map map2 = (Map)this.b;
        object = (p41_0)object;
        return HomeApi.a(map2, (p41_0)object);
    }
}

