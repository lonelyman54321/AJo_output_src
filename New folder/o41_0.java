/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O41
 */
public final class o41_0
extends RecyclerView$s {
    public final /* synthetic */ M41 a;

    public o41_0(M41 m41) {
        this.a = m41;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onScrolled(RecyclerView recyclerView, int n3, int n4) {
        block41: {
            int n7;
            block42: {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                Bundle bundle;
                l02_0 l02_02;
                Object object5;
                Object object6;
                Object object7;
                Object object8;
                block43: {
                    double d2;
                    int n8;
                    int n10;
                    Object object9;
                    Object object10;
                    block46: {
                        double d5;
                        block45: {
                            block44: {
                                NumberFormatException numberFormatException2;
                                block37: {
                                    block36: {
                                        block35: {
                                            int n14;
                                            M41 m41;
                                            block34: {
                                                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                                                super.onScrolled(recyclerView, n3, n4);
                                                m41 = this.a;
                                                object10 = m41.i;
                                                object9 = null;
                                                if (object10 != null) {
                                                    object10 = ((RecyclerView)object10).getLayoutManager();
                                                } else {
                                                    n10 = 0;
                                                    object10 = null;
                                                }
                                                n14 = object10 instanceof LinearLayoutManager;
                                                if (n14 != 0) {
                                                    object10 = (LinearLayoutManager)object10;
                                                } else {
                                                    n10 = 0;
                                                    object10 = null;
                                                }
                                                n14 = -1;
                                                if (object10 != null) {
                                                    int n15 = ((LinearLayoutManager)object10).findFirstVisibleItemPosition();
                                                    n10 = ((LinearLayoutManager)object10).findLastVisibleItemPosition();
                                                    boolean bl2 = true;
                                                    if (n15 <= n10) {
                                                        while (true) {
                                                            float f5;
                                                            int n16;
                                                            if ((object8 = m41.i) != null) {
                                                                object8 = ((RecyclerView)object8).findViewHolderForAdapterPosition(n15);
                                                            } else {
                                                                n16 = 0;
                                                                object8 = null;
                                                                f5 = 0.0f;
                                                            }
                                                            int n17 = object8 instanceof fj2_1;
                                                            if (n17 != 0) {
                                                                object8 = (fj2_1)object8;
                                                            } else {
                                                                n16 = 0;
                                                                object8 = null;
                                                                f5 = 0.0f;
                                                            }
                                                            if (object8 != null) {
                                                                object8 = ((RecyclerView$B)object8).itemView;
                                                                Intrinsics.checkNotNullExpressionValue(object8, "itemView");
                                                                object7 = new Rect();
                                                                object8.getGlobalVisibleRect((Rect)object7);
                                                                n8 = ((Rect)object7).right;
                                                                n17 = ((Rect)object7).left;
                                                                n16 = object8.getWidth();
                                                                float f6 = n8 -= n17;
                                                                f5 = n16;
                                                                f6 /= f5;
                                                                f5 = 0.5f;
                                                                n16 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
                                                                if (n16 >= 0) {
                                                                    object10 = m41.G;
                                                                    if (object10 == null || n15 != (n16 = ((l02_0)object10).i)) {
                                                                        if (object10 != null && (n10 = ((l02_0)object10).i) != n15) {
                                                                            object8 = m41.i;
                                                                            Intrinsics.checkNotNull(object8);
                                                                            l02_0.g((RecyclerView)object8, n10);
                                                                            m41.A(bl2);
                                                                        }
                                                                        if ((object10 = m41.G) != null) {
                                                                            object6 = m41.i;
                                                                            Intrinsics.checkNotNull(object6);
                                                                            ((l02_0)object10).h((RecyclerView)object6, n15);
                                                                        }
                                                                        if ((object10 = m41.G) != null) {
                                                                            ((l02_0)object10).i = n15;
                                                                        }
                                                                        n10 = 0;
                                                                        object10 = null;
                                                                        m41.A(false);
                                                                    }
                                                                    break block34;
                                                                }
                                                            }
                                                            if (n15 == n10) break;
                                                            ++n15;
                                                        }
                                                    }
                                                    if ((object10 = m41.G) == null || (n15 = ((l02_0)object10).i) != n14) {
                                                        if (object10 != null) {
                                                            n10 = ((l02_0)object10).i;
                                                            object5 = m41.i;
                                                            Intrinsics.checkNotNull(object5);
                                                            l02_0.g((RecyclerView)object5, n10);
                                                            m41.A(bl2);
                                                        }
                                                        if ((object10 = m41.G) != null) {
                                                            ((l02_0)object10).i = n14;
                                                        }
                                                    }
                                                }
                                            }
                                            n7 = ig2_2.a(recyclerView);
                                            if (n7 == n14 || (n10 = m41.L) == n7) break block41;
                                            l02_02 = m41.G;
                                            if (l02_02 == null) break block42;
                                            object5 = l02_02.f;
                                            object6 = ((NewCustomEventsRevamp)object5).getEC_PRODUCT_DETAILS_INTERACTIONS();
                                            object10 = n10 > n7 ? "LEFT / " : "RIGHT / ";
                                            object7 = object10 = hj0_0.a(n7, (String)object10);
                                            object10 = l02_02.d;
                                            object8 = object10.x5();
                                            bundle = new Bundle();
                                            if (object8 == null) break block43;
                                            d2 = 0.0;
                                            try {
                                                object10 = ((Product)object8).getPrice();
                                                if (object10 == null) break block35;
                                                object10 = ((Price)object10).getValue();
                                                break block36;
                                            }
                                            catch (NumberFormatException numberFormatException2) {
                                                break block37;
                                            }
                                        }
                                        n10 = 0;
                                        object10 = null;
                                    }
                                    if (object10 == null || (object10 = ((Product)object8).getPrice()) == null || (object10 = ((Price)object10).getValue()) == null) break block44;
                                    d5 = Double.parseDouble((String)object10);
                                    break block45;
                                }
                                object4 = yn3_0.a;
                                ((yn3$a)object4).e(numberFormatException2);
                            }
                            d5 = d2;
                        }
                        n10 = (int)(d5 == d2 ? 0 : (d5 < d2 ? -1 : 1));
                        if (n10 != 0) {
                            NumberFormatException numberFormatException3;
                            block40: {
                                block39: {
                                    block38: {
                                        try {
                                            object10 = ((Product)object8).getWasPriceData();
                                            if (object10 == null) break block38;
                                            object10 = ((Price)object10).getValue();
                                            break block39;
                                        }
                                        catch (NumberFormatException numberFormatException3) {
                                            break block40;
                                        }
                                    }
                                    n10 = 0;
                                    object10 = null;
                                }
                                if (object10 != null) {
                                    object10 = ((Product)object8).getWasPriceData();
                                    if (object10 != null && (object10 = ((Price)object10).getValue()) != null) {
                                        double d7 = Double.parseDouble((String)object10);
                                        object9 = d7;
                                    }
                                    Intrinsics.checkNotNull(object9);
                                    d2 = (Double)object9 - d5;
                                }
                                break block46;
                            }
                            object9 = yn3_0.a;
                            ((yn3$a)object9).e(numberFormatException3);
                        }
                    }
                    n10 = (int)(hv3_0.Y() ? 1 : 0);
                    object9 = "";
                    object10 = n10 != 0 && (object10 = ((Product)object8).getSelectedSizeVariant()) != null ? Y63.c((ProductOptionVariant)object10) : object9;
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_NAME();
                    object3 = ((Product)object8).getName();
                    if (object3 == null) {
                        object3 = object9;
                    }
                    bundle.putString((String)object4, (String)object3);
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_ID();
                    object3 = ((Product)object8).getCode();
                    if (object3 == null) {
                        object3 = object9;
                    }
                    bundle.putString((String)object4, (String)object3);
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_BRAND();
                    object3 = ((Product)object8).getBrandName();
                    if (object3 == null) {
                        object3 = object9;
                    }
                    bundle.putString((String)object4, (String)object3);
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_PRICE();
                    object3 = ((Product)object8).getPrice();
                    if (object3 == null || (object3 = ((Price)object3).getValue()) == null) {
                        object3 = object9;
                    }
                    bundle.putString((String)object4, (String)object3);
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_COLOR();
                    object3 = hv3_0.n((Product)object8);
                    bundle.putString((String)object4, (String)object3);
                    object4 = ((NewCustomEventsRevamp)object5).getPRODUCT_SIZE();
                    bundle.putString((String)object4, (String)object10);
                    object10 = ((NewCustomEventsRevamp)object5).getPRODUCT_DISCOUNT();
                    bundle.putDouble((String)object10, d2);
                    object10 = ((NewCustomEventsRevamp)object5).getPRODUCT_CATEGORY();
                    object2 = ((Product)object8).getBrickCategory();
                    if (object2 == null) {
                        object2 = object9;
                    }
                    bundle.putString((String)object10, (String)object2);
                    object10 = ((NewCustomEventsRevamp)object5).getPRODUCT_BRICK();
                    object2 = ((Product)object8).getBrickCategory();
                    if (object2 == null) {
                        object2 = object9;
                    }
                    bundle.putString((String)object10, (String)object2);
                    object10 = ((NewCustomEventsRevamp)object5).getPRODUCT_TAG();
                    object2 = hv3_0.a;
                    object = ((Product)object8).getFnlColorVariantData();
                    object2.getClass();
                    object2 = hv3_0.A((ProductFnlColorVariantData)object);
                    n8 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
                    if (n8 == 0) {
                        object9 = hv3_0.A(((Product)object8).getFnlColorVariantData());
                    }
                    bundle.putString((String)object10, (String)object9);
                    object10 = "number";
                    bundle.putInt((String)object10, n7);
                }
                object3 = l02_02.g;
                String string2 = l02_02.h;
                int n18 = 1536;
                object8 = "image interaction - Swipe";
                object2 = "image_interact";
                object = "pdp screen";
                object4 = "pdp screen";
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object6, (String)object8, (String)object7, (String)object2, (String)object, (String)object4, (String)object3, bundle, string2, false, null, n18, null);
            }
            m41.L = n7;
        }
    }
}

