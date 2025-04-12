/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.Coupon;
import com.ril.ajio.services.data.Cart.CouponList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DV1
 */
public final class dv1_2
implements Function1 {
    public final /* synthetic */ iv1_2 a;

    public /* synthetic */ dv1_2(iv1_2 iv1_22) {
        this.a = iv1_22;
    }

    public final Object invoke(Object object) {
        int n3;
        Coupon coupon;
        Object object2;
        int n4;
        int n7;
        int n8;
        object = (DataCallback)object;
        iv1_2 iv1_22 = this.a;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        Object object3 = iv1_22.e;
        Object object4 = "progressBar";
        Object object5 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n8 = 0;
            object3 = null;
        }
        ((AjioLoaderView)((Object)object3)).stopLoader();
        object3 = cp_1.Companion;
        n8 = nn_2.b((cp$a)object3, (DataCallback)object);
        String string2 = "couponListAdapter";
        if (n8 != 0) {
            n8 = ((DataCallback)object).getStatus();
            if (n8 != 0) {
                int n10 = 1;
                if (n8 != n10) {
                    n10 = 3;
                    if (n8 == n10) {
                        object = iv1_22.e;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n10 = 0;
                            object = null;
                        }
                        ((AjioLoaderView)((Object)object)).stopLoader();
                    }
                } else {
                    object3 = iv1_22.getActivity();
                    if (object3 != null && (object3 = iv1_22.getContext()) != null) {
                        ig0_0.Companion.getClass();
                        object3 = iv1_22.requireContext();
                        Intrinsics.checkNotNullExpressionValue(object3, "requireContext(...)");
                        n7 = R$string.coupon_page_alert;
                        object4 = hv3_0.K(n7);
                        object = n10;
                        n4 = 8;
                        ig0_0.b((Context)object3, (String)object4, (Integer)object, n4);
                    }
                }
            } else {
                object3 = iv1_22.r;
                if (object3 != null) {
                    object4 = ((qm_1)object3).a;
                } else {
                    n7 = 0;
                    object4 = null;
                }
                if (object4 != null) {
                    Intrinsics.checkNotNull(object3);
                    object3 = ((qm_1)object3).a;
                    Intrinsics.checkNotNull(object3);
                } else {
                    object3 = new HashMap();
                }
                object4 = iv1_22.r;
                if (object4 != null) {
                    ((qm_1)object4).a = null;
                }
                if ((object4 = (CouponList)((DataCallback)object).getData()) != null) {
                    object4 = ((CouponList)object4).getVoucherList();
                } else {
                    n7 = 0;
                    object4 = null;
                }
                iv1_22.x = object4;
                object4 = iv1_22.h;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object4 = null;
                }
                ((kc0_2)object4).b = object = (CouponList)((DataCallback)object).getData();
                if (object != null) {
                    if ((object = ((CouponList)object).getVoucherList()) != null) {
                        int n14;
                        object = object.iterator();
                        while (true) {
                            n4 = (int)(object.hasNext() ? 1 : 0);
                            object2 = ((kc0_2)object4).f;
                            if (n4 == 0) break;
                            coupon = (Coupon)object.next();
                            boolean bl2 = coupon.isCouponValid();
                            if (bl2) {
                                object2 = ((kc0_2)object4).e;
                                Intrinsics.checkNotNull(object2);
                                ((ArrayList)object2).add(coupon);
                                continue;
                            }
                            Intrinsics.checkNotNull(object2);
                            ((ArrayList)object2).add(coupon);
                        }
                        if (object2 != null && (n14 = ((ArrayList)object2).size()) > 0) {
                            object = new Object();
                            Collections.sort(object2, object);
                        }
                    }
                    ((kc0_2)object4).g = object3;
                    ((RecyclerView$f)object4).notifyDataSetChanged();
                }
            }
        }
        Bundle bundle = new Bundle();
        object = iv1_22.k;
        object3 = ((NewCustomEventsRevamp)object).getCOUPONS_AVAILABLE();
        object4 = iv1_22.h;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object4 = null;
        }
        object4 = ((kc0_2)object4).e;
        n4 = 0;
        coupon = null;
        if (object4 != null) {
            n7 = ((ArrayList)object4).size();
        } else {
            n7 = 0;
            object4 = null;
        }
        object2 = iv1_22.h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = ((kc0_2)object2).f) != null) {
            n3 = ((ArrayList)object2).size();
        } else {
            n3 = 0;
            object2 = null;
        }
        bundle.putInt((String)object3, n7 += n3);
        object = ((NewCustomEventsRevamp)object).getCOUPONS_APPLICABLE();
        object3 = iv1_22.h;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object5 = object3;
        }
        object3 = ((kc0_2)object5).e;
        if (object3 != null) {
            n4 = ((ArrayList)object3).size();
        }
        bundle.putInt((String)object, n4);
        String string3 = iv1_22.l;
        String string4 = iv1_22.m;
        iv1_22.k.newPushCustomScreenView("coupon screen", "coupon screen", string3, bundle, string4);
        return Unit.a;
    }
}

