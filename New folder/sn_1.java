/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SN
 */
public final class sn_1
extends rn_1
implements View.OnClickListener {
    public final nw_0 h;
    public final TextView i;
    public final ConstraintLayout j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public final RelativeLayout n;
    public final View o;
    public final TextView p;
    public final FrameLayout q;
    public final NewCustomEventsRevamp r;
    public final ImageView s;
    public final ImageView t;
    public CartEntry u;
    public Boolean v;

    public sn_1(View object, j82_0 object2, nw_0 object3, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((j82_0)object2, (View)object, bl2);
        this.h = object3;
        int n3 = R$id.showSimilar;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.i = object2;
        n3 = R$id.removeBtnConstraint;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.j = object2;
        n3 = R$id.productBrandTv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.k = object2;
        n3 = R$id.id_alert_text;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.l = object2;
        n3 = R$id.qtyContainer;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (LinearLayout)object2;
        this.m = object2;
        n3 = R$id.productDetailsContainer;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (RelativeLayout)object2;
        this.n = object2;
        n3 = R$id.cartProductDivider;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        this.o = object2;
        n3 = R$id.originalPrice;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (TextView)object2;
        this.p = object2;
        n3 = R$id.productImgContainer;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (FrameLayout)object2;
        this.q = object2;
        object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.r = object2;
        n3 = R$id.id_size_arrow;
        object2 = (ImageView)object.findViewById(n3);
        this.s = object2;
        n3 = R$id.id_qty_arrow;
        object = (ImageView)object.findViewById(n3);
        this.t = object;
        object = Boolean.FALSE;
        this.v = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Object object;
        Object object2;
        Object object3;
        int n3;
        sn_1 sn_12;
        block35: {
            int n4;
            TextView textView;
            String string2;
            Object object4;
            String string3;
            Object object5;
            block34: {
                TextView textView2;
                j82_0 j82_02;
                Object object6;
                Object object7;
                TextView textView3;
                TextView textView4;
                int n7;
                block33: {
                    block32: {
                        block31: {
                            int n8;
                            sn_12 = this;
                            if (view != null) {
                                n3 = view.getId();
                                object3 = n3;
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            n7 = R$id.showSimilar;
                            object2 = sn_12.h;
                            object5 = sn_12.r;
                            string3 = "product_id";
                            textView4 = sn_12.l;
                            if (object3 != null && (n8 = ((Integer)object3).intValue()) == n7) {
                                Product product;
                                Object object8;
                                object3 = textView4.getText();
                                if (object3 != null) {
                                    object3 = object3.toString();
                                } else {
                                    n3 = 0;
                                    object3 = null;
                                }
                                Bundle bundle = new Bundle();
                                Object object9 = sn_12.u;
                                if (object9 != null && (object9 = ((CartEntry)object9).getProduct()) != null) {
                                    object9 = ((Product)object9).getCode();
                                } else {
                                    n7 = 0;
                                    object9 = null;
                                }
                                bundle.putString(string3, (String)object9);
                                object9 = sn_12.u;
                                if (object9 != null && (object9 = ((CartEntry)object9).getProduct()) != null) {
                                    object9 = ((Product)object9).getName();
                                } else {
                                    n7 = 0;
                                    object9 = null;
                                }
                                string3 = "product_name";
                                bundle.putString(string3, (String)object9);
                                object9 = "oos";
                                if (object3 != null) {
                                    string3 = hv3_0.K(R$string.sold_out_text);
                                    boolean bl2 = Intrinsics.areEqual(object3, string3);
                                    if (bl2) {
                                        object3 = object9;
                                    }
                                    object8 = object3;
                                } else {
                                    object8 = object9;
                                }
                                if (object5 != null) {
                                    object3 = AnalyticsManager.Companion;
                                    String string4 = bv_0.a((AnalyticsManager$Companion)object3);
                                    String string5 = cv_0.a((AnalyticsManager$Companion)object3);
                                    int n10 = 1536;
                                    string3 = "bag interactions";
                                    String string6 = "show similar";
                                    String string7 = "bag_interaction";
                                    String string8 = "bag screen";
                                    String string9 = "bag screen";
                                    textView4 = null;
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string3, string6, (String)object8, string7, string8, string9, string4, bundle, string5, false, null, n10, null);
                                }
                                if (object2 == null) return;
                                object3 = sn_12.u;
                                if (object3 != null) {
                                    product = ((CartEntry)object3).getProduct();
                                } else {
                                    boolean bl3 = false;
                                    product = null;
                                }
                                object2.a0(product);
                                return;
                            }
                            n7 = R$id.removeBtnConstraint;
                            textView3 = sn_12.f;
                            object4 = "bag screen";
                            object7 = sn_12.b;
                            if (object3 == null || (n8 = ((Integer)object3).intValue()) != n7) break block31;
                            object3 = new Bundle();
                            object6 = sn_12.u;
                            if (object6 == null || (object6 = ((CartEntry)object6).getProduct()) == null) break block32;
                            object6 = ((Product)object6).getCode();
                            break block33;
                        }
                        object = object7;
                        string2 = object4;
                        textView = textView3;
                        n4 = R$id.qtyContainer;
                        if (object3 != null) break block34;
                        break block35;
                    }
                    n7 = 0;
                    object6 = null;
                }
                object3.putString(string3, (String)object6);
                object6 = sn_12.u;
                if (object6 != null) {
                    object6 = ((CartEntry)object6).getEddDate();
                } else {
                    n7 = 0;
                    object6 = null;
                }
                object2 = "EDD";
                object3.putString((String)object2, (String)object6);
                if (object5 != null) {
                    object6 = AnalyticsManager.Companion;
                    object2 = bv_0.a((AnalyticsManager$Companion)object6);
                    object6 = cv_0.a((AnalyticsManager$Companion)object6);
                    int n14 = 1536;
                    string3 = "bag interactions";
                    String string10 = "remove link click";
                    String string11 = "";
                    String string12 = "remove_click";
                    String string13 = "bag screen";
                    String string14 = "bag screen";
                    j82_02 = object7;
                    object7 = object2;
                    object2 = object4;
                    object4 = object3;
                    textView2 = textView3;
                    Object object10 = object6;
                    object3 = textView4;
                    textView4 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string3, string10, string11, string12, string13, string14, (String)object7, (Bundle)object4, (String)object6, false, null, n14, null);
                } else {
                    j82_02 = object7;
                    object2 = object4;
                    textView2 = textView3;
                    object3 = textView4;
                }
                object6 = sn_12.u;
                if (object6 != null) {
                    object6 = rn_1.w((CartEntry)object6);
                    if (j82_02 != null) {
                        j82_02.s9((String)object6);
                    }
                    object5 = AnalyticsManager.Companion;
                    string3 = "Remove from bag";
                    tj2_0.e((AnalyticsManager$Companion)object5, string3, (String)object6, (String)object2);
                }
                if (j82_02 == null) return;
                object6 = sn_12.u;
                object2 = ((Object)textView2.getText()).toString();
                if (object3 != null && (object3 = object3.getText()) != null) {
                    object3 = object3.toString();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                j82_02.U6((CartEntry)object6, (String)object2, (String)object3);
                return;
            }
            int n15 = (Integer)object3;
            if (n15 == n4) {
                int n16;
                object3 = sn_12.u;
                if (object3 != null) {
                    n16 = (int)(((CartEntry)object3).inventoryQtyUpdateNeeded() ? 1 : 0);
                    if (n16 != 0) {
                        object3 = AnalyticsManager.Companion;
                        object2 = "Inventory change";
                        object5 = "Change Quantity Clicked";
                        tj2_0.e((AnalyticsManager$Companion)object3, (String)object5, (String)object2, (String)object4);
                    } else {
                        string2 = new Bundle();
                        if ((object3 = ((CartEntry)object3).getProduct()) != null) {
                            object5 = ((Product)object3).getVerticalColor();
                            string2.putString("Product_Vertical", (String)object5);
                            object5 = ((Product)object3).getBrickCategory();
                            string2.putString("Product_Brick", (String)object5);
                            object2 = "productName";
                            object3 = ((Product)object3).getName();
                            string2.putString((String)object2, (String)object3);
                        }
                        object3 = AnalyticsManager.Companion.getInstance();
                        object2 = ((AnalyticsManager)object3).getGtmEvents();
                        AnalyticsData analyticsData = ne_0.b((Bundle)string2);
                        int n17 = 16;
                        Object var21_38 = null;
                        object5 = "Change Quantity Clicked";
                        string3 = "Change quantity";
                        String string15 = "bag screen";
                        Object var19_33 = null;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object2, (String)object5, string3, string15, analyticsData, null, n17, null);
                    }
                }
                if (object == null) return;
                object3 = sn_12.u;
                string2 = ((Object)textView.getText()).toString();
                n16 = 1;
                object.V0((CartEntry)object3, string2, n16);
                return;
            }
        }
        int n18 = R$id.productImgContainer;
        if (object3 == null) {
            return;
        }
        n3 = (Integer)object3;
        if (n3 != n18) return;
        if (object2 == null) return;
        object = sn_12.u;
        if (object != null) {
            object = ((CartEntry)object).getProduct();
        } else {
            n18 = 0;
            object = null;
        }
        object3 = "bag screen - oos screen";
        object2.K7((Product)object, (String)object3);
    }

    public final void x(Object object) {
        int n3 = object instanceof CartEntry;
        if (n3 != 0) {
            float f5;
            int n4;
            Object object2;
            int n7;
            Object object3;
            Object object4;
            float f6;
            int n8;
            super.x(object);
            this.u = object = (CartEntry)object;
            if (object != null) {
                object = ((CartEntry)object).getProduct();
            } else {
                n8 = 0;
                f6 = 0.0f;
                object = null;
            }
            if (object != null) {
                object4 = ((Product)object).getBrandName();
                n3 = TextUtils.isEmpty((CharSequence)object4);
                object = n3 == 0 ? String.valueOf(((Product)object).getBrandName()) : "";
                object4 = this.k;
                object4.setText((CharSequence)object);
            }
            if ((object = this.u) != null) {
                object4 = this.g;
                if (object4 != null) {
                    ai0_2.B((View)object4);
                }
                float f7 = mz3_0.J(((CartEntry)object).getBasePrice().getValue());
                object3 = ((CartEntry)object).getQuantity();
                Intrinsics.checkNotNullExpressionValue(object3, "getQuantity(...)");
                float f8 = ((Number)object3).floatValue() * f7;
                object4 = ((CartEntry)object).getVoucherPromoAmt();
                n3 = TextUtils.isEmpty((CharSequence)object4);
                n7 = 0;
                object2 = null;
                if (n3 == 0) {
                    object4 = ((CartEntry)object).getVoucherPromoAmt();
                    f7 = mz3_0.J((String)object4);
                } else {
                    n3 = 0;
                    f7 = 0.0f;
                    object4 = null;
                }
                String string2 = ((CartEntry)object).getMultiItemPromoAmt();
                n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
                if (n4 == 0) {
                    string2 = ((CartEntry)object).getMultiItemPromoAmt();
                    f5 = mz3_0.J(string2);
                } else {
                    n4 = 0;
                    f5 = 0.0f;
                    string2 = null;
                }
                f8 = f8 - f7 - f5;
                float f11 = f8 - 0.0f;
                n3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                if (n3 <= 0) {
                    object = this.g;
                    if (object != null) {
                        n3 = R$string.free;
                        object4 = hv3_0.K(n3);
                        object.setText((CharSequence)object4);
                    }
                } else {
                    float f12;
                    object4 = this.g;
                    if (object4 != null) {
                        string2 = qz2_0.t(f8);
                        object4.setText((CharSequence)string2);
                    }
                    Intrinsics.checkNotNull(object);
                    object4 = ((CartEntry)object).getQuantity();
                    if (object4 != null && (object4 = ((CartEntry)object).getProduct()) != null && (object4 = ((CartEntry)object).getProduct().getWasPriceData()) != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object4 = ((CartEntry)object).getBasePrice().getValue())) ? 1 : 0)) == 0) {
                        object4 = ((CartEntry)object).getProduct().getWasPriceData();
                        Intrinsics.checkNotNull(object4);
                        object4 = ((Price)object4).getValue();
                        f7 = mz3_0.J((String)object4);
                        object = ((CartEntry)object).getQuantity();
                        Intrinsics.checkNotNull(object);
                        n8 = (Integer)object;
                        f6 = n8;
                        f7 *= f6;
                    } else {
                        n3 = 0;
                        f7 = 0.0f;
                        object4 = null;
                    }
                    n8 = (f12 = f7 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                    if (n8 != 0 && (n8 = f8 == f7 ? 0 : (f8 < f7 ? -1 : 1)) != 0) {
                        object = this.p;
                        ai0_2.B((View)object);
                        object4 = qz2_0.t(f7);
                        object.setText((CharSequence)object4);
                        n3 = object.getPaintFlags() | 0x10;
                        object.setPaintFlags(n3);
                    }
                }
            }
            object = this.u;
            n3 = this.c;
            object3 = this.l;
            n7 = 1;
            n4 = 1065353216;
            f5 = 1.0f;
            RelativeLayout relativeLayout = this.n;
            if (object != null && (n8 = ((CartEntry)object).isProductNS()) == n7) {
                object = hv3_0.K(R$string.not_deliverable_text);
                object3.setText((CharSequence)object);
                object = cp_1.Companion;
                n8 = km_1.b((cp$a)object);
                if (n8 == 0) {
                    relativeLayout.setAlpha(f5);
                }
            } else {
                object = this.u;
                if (object != null && (n8 = ((CartEntry)object).inventoryQtyUpdateNeeded()) == n7) {
                    object = this.m;
                    if (n3 == 0) {
                        n7 = R$drawable.rounded_cool_grey_red_refresh;
                        object2 = hv3_0.r(n7);
                        object.setBackground(object2);
                    }
                    n7 = R$string.qty_sold_out_text;
                    object2 = hv3_0.K(n7);
                    object3.setText((CharSequence)object2);
                    object.setOnClickListener((View.OnClickListener)this);
                    relativeLayout.setAlpha(f5);
                } else {
                    object = cp_1.Companion;
                    n8 = km_1.b((cp$a)object);
                    if (n8 == 0) {
                        relativeLayout.setAlpha(f5);
                    }
                }
            }
            object = this.v;
            object3 = Boolean.TRUE;
            n8 = Intrinsics.areEqual(object, object3);
            object3 = this.o;
            if (n8 != 0) {
                ai0_2.i((View)object3);
            }
            object = this.j;
            object2 = this.i;
            if (n3 != 0) {
                ai0_2.i((View)object2);
                ai0_2.i((View)object);
                ai0_2.i((View)object3);
                object = this.s;
                if (object != null) {
                    ai0_2.i((View)object);
                }
                if ((object = this.t) != null) {
                    ai0_2.i((View)object);
                }
            } else {
                object2.setOnClickListener((View.OnClickListener)this);
                object.setOnClickListener((View.OnClickListener)this);
            }
            object = this.q;
            object.setOnClickListener((View.OnClickListener)this);
            relativeLayout.setOnClickListener((View.OnClickListener)this);
        }
    }
}

