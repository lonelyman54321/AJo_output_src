/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from YL
 */
public final class yl_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yl_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        int n3 = 1;
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (pq$a$c)object;
                object3 = (tr1_0)object3;
                Intrinsics.checkNotNullParameter(object3, "$showShimmer");
                Intrinsics.checkNotNullParameter(object, "it");
                object = Boolean.TRUE;
                object3.setValue(object);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                pJ0$a pJ0$a = pj0_2.Companion;
                object3 = (pj0_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    kx3_0.a = n3;
                    object2 = ((pj0_2)object3).f;
                    n4 = 0;
                    pJ0$a = null;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                        n7 = 0;
                        object2 = null;
                    }
                    object2.stopLoader();
                    n7 = ((DataCallback)object).getStatus();
                    if (n7 == 0) {
                        object = ((pj0_2)object3).t;
                        int n8 = ov3.u((RecyclerView)object);
                        object2 = ((pj0_2)object3).y;
                        if (object2 != null) {
                            ((RecyclerView$f)object2).notifyItemChanged(n8);
                        }
                        n8 = 4;
                        rw_1.a(n8, null);
                        object = ((pj0_2)object3).Qa().h;
                        object2 = ((pj0_2)object3).Qa().h.c;
                        String string2 = "plp screen";
                        ((BH3)object).d((Product)object2, string2);
                    } else {
                        int n10 = ((DataCallback)object).getStatus();
                        if (n10 == n3) {
                            n10 = 5;
                            rw_1.a(n10, null);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (lm_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = cp_1.Companion;
        int n14 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n14 != 0) {
            object2 = ((lm_2)object3).u;
            if (object2 != null) {
                ((AjioLoaderView)((Object)object2)).stopLoader();
            }
            Intrinsics.checkNotNull(object);
            n14 = ((DataCallback)object).getStatus();
            if (n14 == 0) {
                object = ((lm_2)object3).t;
                if (object != null) {
                    object = StringCompanionObject.INSTANCE;
                    int n15 = R$string.acc_alert_message;
                    object = hv3_0.K(n15);
                    object2 = hv3_0.K(R$string.address_updated);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object2;
                    object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
                    n14 = R$string.address_updated;
                    object2 = hv3_0.K(n14);
                    ((lm_2)object3).showNotification((String)object2, (String)object);
                    object = new Intent();
                    object2 = ((lm_2)object3).t;
                    Intrinsics.checkNotNull(object2);
                    n3 = -1;
                    object2.setResult(n3, (Intent)object);
                    object = ((lm_2)object3).t;
                    Intrinsics.checkNotNull(object);
                    object.finish();
                }
            } else {
                n14 = ((DataCallback)object).getStatus();
                if (n14 == n3) {
                    object = ((DataCallback)object).getError();
                    ((lm_2)object3).Va((DataError)object);
                }
            }
        }
        return Unit.a;
    }
}

