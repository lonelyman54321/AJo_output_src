/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Mc0
 */
public final class mc0_0
implements F62 {
    public final /* synthetic */ sc0_2 a;

    public /* synthetic */ mc0_0(sc0_2 sc0_22) {
        this.a = sc0_22;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        sc0_2 sc0_22 = this.a;
        Intrinsics.checkNotNullParameter(sc0_22, "this$0");
        Object object2 = cp_1.Companion;
        boolean bl2 = nn_2.b(object2, (DataCallback)object);
        if (bl2) {
            object2 = sc0_22.c;
            if (object2 != null) {
                ((AjioProgressView)((Object)object2)).dismiss();
            }
            Intrinsics.checkNotNull(object);
            int n3 = ((DataCallback)object).getStatus();
            int n4 = 1;
            if (n3 == 0) {
                sc0_22.e = object = (CouponPromotion)((DataCallback)object).getData();
                object = sc0_22.l;
                Intrinsics.checkNotNull(object);
                boolean bl3 = ((h91)object).w;
                if (bl3) {
                    sc0_22.Ra();
                } else {
                    Object object3;
                    Object object4;
                    object = sc0_22.l;
                    Intrinsics.checkNotNull(object);
                    bl3 = ((h91)object).v;
                    if (bl3) {
                        boolean bl4;
                        object = sc0_22.e;
                        Intrinsics.checkNotNull(object);
                        object = ((CouponPromotion)object).getAvailableCoupons();
                        object2 = new ArrayList();
                        object = ((ArrayList)object).iterator();
                        object4 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                        while (bl4 = object.hasNext()) {
                            boolean bl5;
                            object3 = (CouponEntity)object.next();
                            Iterator iterator = sc0_22.k.iterator();
                            Intrinsics.checkNotNullExpressionValue(iterator, (String)object4);
                            while (bl5 = iterator.hasNext()) {
                                String string2;
                                Object object5 = iterator.next();
                                Intrinsics.checkNotNullExpressionValue(object5, "next(...)");
                                bl5 = b.i(object5 = ((CouponEntity)object5).getCode(), string2 = ((CouponEntity)object3).getCode(), n4 != 0);
                                if (!bl5) continue;
                                ((ArrayList)object2).add(object3);
                                ((CouponEntity)object3).setSelected(n4 != 0);
                            }
                        }
                        sc0_22.k = object2;
                        sc0_22.Ua();
                    } else {
                        object = sc0_22.k;
                        ((ArrayList)object).clear();
                        sc0_22.Ua();
                    }
                    object = sc0_22.f;
                    boolean bl6 = false;
                    object2 = null;
                    String string3 = "adapter";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        bl3 = false;
                        object = null;
                    }
                    object4 = sc0_22.e;
                    Intrinsics.checkNotNull(object4);
                    object.getClass();
                    object3 = "data";
                    Intrinsics.checkNotNullParameter(object4, (String)object3);
                    ((gd0_2)object).b = object4;
                    object = sc0_22.f;
                    if (object != null) {
                        object2 = object;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    }
                    ((RecyclerView$f)object2).notifyDataSetChanged();
                    object = sc0_22.b;
                    if (object != null) {
                        object.invalidate();
                    }
                }
            } else {
                int n7 = ((DataCallback)object).getStatus();
                if (n7 == n4) {
                    object = ((DataCallback)object).getError();
                    sc0_22.Ta((DataError)object);
                }
            }
        }
    }
}

