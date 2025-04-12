/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Cart.Coupon;
import com.ril.ajio.services.data.Cart.CouponList;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.HandlerScheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kc0
 */
public final class kc0_2
extends RecyclerView$f {
    public static final kc0$a Companion;
    public final rc0_1 a;
    public CouponList b;
    public final t30_0 c;
    public long d;
    public final ArrayList e;
    public final ArrayList f;
    public Map g;

    static {
        kc0$a kc0$a;
        Companion = kc0$a = new Object();
    }

    public kc0_2(rc0_1 arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "mInteractionListener");
        this.a = arrayList;
        arrayList = new ArrayList();
        this.c = arrayList;
        this.e = arrayList = new ArrayList();
        this.f = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        int n3;
        int n4;
        int n7;
        ArrayList arrayList = this.e;
        int n8 = 0;
        if (arrayList != null && (n7 = arrayList.size()) != 0) {
            n4 = arrayList.size() + 2;
        } else {
            n4 = 0;
            arrayList = null;
        }
        ArrayList arrayList2 = this.f;
        if (arrayList2 != null && (n3 = arrayList2.size()) != 0) {
            n8 = arrayList2.size() + 1;
        }
        return n4 + n8;
    }

    public final int getItemViewType(int n3) {
        int n4;
        int n7;
        int n8;
        int n10;
        ArrayList arrayList = this.e;
        int n14 = 0;
        if (arrayList != null) {
            n10 = arrayList.size();
        } else {
            n10 = 0;
            arrayList = null;
        }
        ArrayList arrayList2 = this.f;
        if (arrayList2 != null) {
            n8 = arrayList2.size();
        } else {
            n8 = 0;
            arrayList2 = null;
        }
        if (n10 > 0 && n3 == 0) {
            return 0;
        }
        if (n10 > 0 && n3 > 0 && n3 <= n10) {
            return 1;
        }
        n14 = 2;
        if (n10 > 0 && n3 == (n7 = n10 + 1)) {
            return n14;
        }
        n7 = 3;
        if (n8 > 0 && (n3 == 0 || n10 > 0 && n3 == (n4 = n10 + 2))) {
            return n7;
        }
        if (n8 > 0 && n3 > n10 && n3 < (n10 = n10 + n7 + n8)) {
            return 4;
        }
        return n14;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (nw_1)recyclerView$B;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof wc0_1;
        ArrayList arrayList = this.f;
        Serializable serializable = this.e;
        if (bl2) {
            recyclerView$B = (wc0_1)recyclerView$B;
            ((wc0_1)recyclerView$B).w((List)((Object)serializable), arrayList, n3);
            bl2 = og1_1.c();
            if (!bl2) {
                Intrinsics.checkNotNull(serializable);
                Object object2 = (Coupon)((ArrayList)serializable).get(n3 += -1);
                long l2 = k7.p();
                Intrinsics.checkNotNull(object2);
                serializable = k7.s(((Coupon)object2).getEndTime());
                Intrinsics.checkNotNull(serializable);
                long l3 = (Long)serializable;
                long l4 = k7.t(((Coupon)object2).getTimerStartBefore());
                object2 = ((Coupon)object2).isEndTimerVisibility();
                Long l7 = l4;
                Long l8 = l2;
                n3 = (int)(hv3_0.i0((Boolean)object2, l7, (Long)serializable, l8) ? 1 : 0);
                if (n3 != 0) {
                    this.d = l4 = 0L;
                    n3 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1));
                    if (n3 != 0 && (n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1))) > 0) {
                        this.d = l3 -= l2;
                    }
                    object2 = t62_0.d(TimeUnit.MILLISECONDS);
                    object = qt2_2.b;
                    object2 = ((t62_0)object2).g((Scheduler)object);
                    object = ti_2.a();
                    object2 = ((t62_0)object2).e((HandlerScheduler)object);
                    object = new lc0_1(this, (wc0_1)recyclerView$B);
                    ((t62_0)object2).c((e62_0)object);
                }
            }
        } else {
            bl2 = recyclerView$B instanceof hc0_1;
            if (bl2) {
                recyclerView$B = (hc0_1)recyclerView$B;
                ((hc0_1)recyclerView$B).w((List)((Object)serializable), arrayList, n3);
            } else {
                bl2 = false;
                object = null;
                ((nw_1)recyclerView$B).w(null, null, n3);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object3 = null;
        if (n3 != 0) {
            int n4 = 1;
            rc0_1 rc0_12 = this.a;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n3 = (int)(og1_1.c() ? 1 : 0);
                        if (n3 != 0) {
                            object2 = LayoutInflater.from((Context)object.getContext());
                            n4 = R$layout.coupon_separator_layout_luxe;
                            object = object2.inflate(n4, object, false);
                        } else {
                            object2 = LayoutInflater.from((Context)object.getContext());
                            n4 = R$layout.coupon_separator_layout_refresh;
                            object = object2.inflate(n4, object, false);
                        }
                        object2 = new nw_1((View)object);
                    } else {
                        n3 = (int)(og1_1.c() ? 1 : 0);
                        if (n3 != 0) {
                            object2 = LayoutInflater.from((Context)object.getContext());
                            n4 = R$layout.invalid_coupon_list_item_luxe;
                            object = object2.inflate(n4, object, false);
                        } else {
                            object2 = LayoutInflater.from((Context)object.getContext());
                            n4 = R$layout.invalid_coupon_list_item_refresh;
                            object = object2.inflate(n4, object, false);
                        }
                        object3 = this.g;
                        Intrinsics.checkNotNull(object3);
                        CouponList couponList = this.b;
                        Intrinsics.checkNotNull(couponList);
                        object3 = (HashMap)object3;
                        object2 = new hc0_1((View)object, rc0_12, (HashMap)object3, couponList);
                    }
                } else {
                    n3 = (int)(og1_1.c() ? 1 : 0);
                    if (n3 != 0) {
                        object2 = LayoutInflater.from((Context)object.getContext());
                        n4 = R$layout.coupon_list_invalid_header_layout_luxe;
                        object = object2.inflate(n4, object, false);
                    } else {
                        object2 = LayoutInflater.from((Context)object.getContext());
                        n4 = R$layout.coupon_list_invalid_header_layout_refresh;
                        object = object2.inflate(n4, object, false);
                    }
                    object2 = new gc0_2((View)object);
                }
            } else {
                n3 = (int)(og1_1.c() ? 1 : 0);
                if (n3 != 0) {
                    object2 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.coupon_list_item_luxe;
                    object2 = object2.inflate(n4, object, false);
                } else {
                    object2 = LayoutInflater.from((Context)object.getContext());
                    n4 = R$layout.coupon_list_item_refresh;
                    object2 = object2.inflate(n4, object, false);
                }
                CouponList couponList = this.b;
                object = object.getContext();
                String string2 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner";
                Intrinsics.checkNotNull(object, string2);
                object = (mu1_1)object;
                object3 = new wc0_1((View)object2, rc0_12, couponList, (mu1_1)object);
                object2 = object3;
            }
        } else {
            n3 = (int)(og1_1.c() ? 1 : 0);
            if (n3 != 0) {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n7 = R$layout.coupon_list_header_layout_luxe;
                object = object2.inflate(n7, object, false);
            } else {
                object2 = LayoutInflater.from((Context)object.getContext());
                int n8 = R$layout.coupon_list_header_layout_refresh;
                object = object2.inflate(n8, object, false);
            }
            object2 = new vc0_1((View)object);
        }
        return object2;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.c.d();
    }
}

