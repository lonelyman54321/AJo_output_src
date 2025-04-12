/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class t23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ t23(B23 b23) {
        this.a = b23;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        Object object2 = null;
        boolean bl2 = true;
        object = (DataCallback)object;
        Object object3 = B23.Companion;
        object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        object3.getClass();
        Object object4 = cp_1.Companion;
        boolean bl3 = nn_2.b((cp$a)object4, (DataCallback)object);
        if (bl3) {
            Intrinsics.checkNotNull(object);
            boolean bl4 = ((DataCallback)object).getStatus();
            String string2 = "format(...)";
            if (bl4) {
                if (bl4 == bl2) {
                    ((B23)object3).Ra().fswmdProgressView.dismiss();
                    object = StringCompanionObject.INSTANCE;
                    int n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    int n4 = R$string.something_wrong_msg;
                    object4 = hv3_0.K(n4);
                    Object[] objectArray = new Object[bl2];
                    objectArray[0] = object4;
                    object = xh2_0.a(objectArray, (int)(bl2 ? 1 : 0), (String)object, string2);
                    n3 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n3);
                    mq0_2.c((String)object2, (String)object);
                    object = ((Fragment)object3).getActivity();
                    if (object != null) {
                        ((ComponentActivity)object).onBackPressed();
                    }
                }
            } else {
                object4 = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object4);
                object4 = ((RecentlyViewedProducts)object4).getProducts();
                String string3 = "Items shared with you, are out of stock.";
                if (object4 != null) {
                    object4 = ((DataCallback)object).getData();
                    Intrinsics.checkNotNull(object4);
                    object4 = ((RecentlyViewedProducts)object4).getProducts();
                    Intrinsics.checkNotNull(object4);
                    boolean bl5 = object4.isEmpty();
                    if (bl5) {
                        object = StringCompanionObject.INSTANCE;
                        int n7 = R$string.acc_alert_message;
                        object = hv3_0.K(n7);
                        object4 = new Object[bl2];
                        object4[0] = string3;
                        ZK1.e(object4, (int)(bl2 ? 1 : 0), (String)object, string2, string3);
                        object = ((Fragment)object3).getActivity();
                        if (object != null) {
                            ((ComponentActivity)object).onBackPressed();
                        }
                    } else {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = ((RecentlyViewedProducts)object).getProducts();
                        Intrinsics.checkNotNull(object);
                        Intrinsics.checkNotNullParameter(object, "<this>");
                        object4 = new yo2_2((List)object);
                        boolean bl6 = ((B23)object3).m;
                        ((B23)object3).f = object2 = new m23_0((yo2_2)object4, (p23)object3, bl6);
                        object = ((B23)object3).Ra().fswmdRvList;
                        object2 = ((B23)object3).f;
                        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                        ((B23)object3).Ra().fswmdProgressView.dismiss();
                        object = ((B23)object3).Ra().sharedStateLayout.fswmdLayoutState;
                        Intrinsics.checkNotNullExpressionValue(object, "fswmdLayoutState");
                        ai0_2.i((View)object);
                        object = ((B23)object3).Ra().fswmdRvList;
                        object2 = "fswmdRvList";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        ai0_2.B((View)object);
                        object = ((B23)object3).e;
                        if (object != null) {
                            n3 = R$drawable.ic_share;
                            object.setIcon(n3);
                            object.setVisible(bl2);
                        }
                    }
                } else {
                    object = StringCompanionObject.INSTANCE;
                    int n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    object4 = new Object[bl2];
                    object4[0] = string3;
                    ZK1.e(object4, (int)(bl2 ? 1 : 0), (String)object, string2, string3);
                    object = ((Fragment)object3).getActivity();
                    if (object != null) {
                        ((ComponentActivity)object).onBackPressed();
                    }
                }
            }
        } else {
            object = ((B23)object3).Ra().fswmdProgressView;
            ((AjioProgressView)((Object)object)).dismiss();
        }
    }
}

