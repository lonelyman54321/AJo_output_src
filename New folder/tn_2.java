/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
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
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
 * Renamed from TN
 */
public final class tn_2
extends rn_1
implements View.OnClickListener {
    public final nw_0 h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final LinearLayout m;
    public final RelativeLayout n;
    public final View o;
    public final TextView p;
    public final FrameLayout q;
    public final ImageView r;
    public final ImageView s;
    public final NewCustomEventsRevamp t;
    public CartEntry u;

    public tn_2(View object, j82_0 j82_02, nw_0 object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super(j82_02, (View)object, bl2);
        this.h = object2;
        int n3 = R$id.showSimilar;
        j82_02 = object.findViewById(n3);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (TextView)j82_02;
        this.i = j82_02;
        n3 = R$id.removeBtn;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (TextView)j82_02;
        this.j = j82_02;
        n3 = R$id.productBrandTv;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (TextView)j82_02;
        this.k = j82_02;
        n3 = R$id.id_alert_text;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (TextView)j82_02;
        this.l = j82_02;
        n3 = R$id.qtyContainer;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (LinearLayout)j82_02;
        this.m = j82_02;
        n3 = R$id.productDetailsContainer;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (RelativeLayout)j82_02;
        this.n = j82_02;
        n3 = R$id.cartProductDivider;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        this.o = j82_02;
        n3 = R$id.originalPrice;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (TextView)j82_02;
        this.p = j82_02;
        n3 = R$id.productImgContainer;
        j82_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(j82_02, (String)object2);
        j82_02 = (FrameLayout)j82_02;
        this.q = j82_02;
        n3 = R$id.id_size_arrow;
        j82_02 = (ImageView)object.findViewById(n3);
        this.r = j82_02;
        n3 = R$id.id_qty_arrow;
        object = (ImageView)object.findViewById(n3);
        this.s = object;
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.t = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Object object;
        Object object2;
        Object object3;
        int n3;
        tn_2 tn_22;
        block37: {
            int n4;
            TextView textView;
            String string2;
            Object object4;
            Object object5;
            String string3;
            Object object6;
            block36: {
                TextView textView2;
                j82_0 j82_02;
                Object object7;
                TextView textView3;
                TextView textView4;
                int n7;
                block35: {
                    block34: {
                        block33: {
                            int n8;
                            tn_22 = this;
                            if (view != null) {
                                n3 = view.getId();
                                object3 = n3;
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            n7 = R$id.showSimilar;
                            object2 = tn_22.h;
                            object6 = tn_22.t;
                            string3 = "product_id";
                            textView4 = tn_22.l;
                            if (object3 != null && (n8 = ((Integer)object3).intValue()) == n7) {
                                Product product;
                                Object object8;
                                if (textView4 != null && (object3 = textView4.getText()) != null) {
                                    object3 = object3.toString();
                                } else {
                                    n3 = 0;
                                    object3 = null;
                                }
                                Bundle bundle = new Bundle();
                                Object object9 = tn_22.u;
                                if (object9 != null && (object9 = ((CartEntry)object9).getProduct()) != null) {
                                    object9 = ((Product)object9).getCode();
                                } else {
                                    n7 = 0;
                                    object9 = null;
                                }
                                bundle.putString(string3, (String)object9);
                                object9 = tn_22.u;
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
                                if (object6 != null) {
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
                                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string3, string6, (String)object8, string7, string8, string9, string4, bundle, string5, false, null, n10, null);
                                }
                                if (object2 == null) return;
                                object3 = tn_22.u;
                                if (object3 != null) {
                                    product = ((CartEntry)object3).getProduct();
                                } else {
                                    boolean bl3 = false;
                                    product = null;
                                }
                                object2.a0(product);
                                return;
                            }
                            n7 = R$id.removeBtn;
                            textView3 = tn_22.f;
                            object5 = "bag screen";
                            object4 = tn_22.b;
                            if (object3 == null || (n8 = ((Integer)object3).intValue()) != n7) break block33;
                            object3 = new Bundle();
                            object7 = tn_22.u;
                            if (object7 == null || (object7 = ((CartEntry)object7).getProduct()) == null) break block34;
                            object7 = ((Product)object7).getCode();
                            break block35;
                        }
                        object = object4;
                        string2 = object5;
                        textView = textView3;
                        n4 = R$id.qtyContainer;
                        if (object3 != null) break block36;
                        break block37;
                    }
                    n7 = 0;
                    object7 = null;
                }
                object3.putString(string3, (String)object7);
                object7 = tn_22.u;
                if (object7 != null) {
                    object7 = ((CartEntry)object7).getEddDate();
                } else {
                    n7 = 0;
                    object7 = null;
                }
                object2 = "EDD";
                object3.putString((String)object2, (String)object7);
                if (object6 != null) {
                    object7 = AnalyticsManager.Companion;
                    object2 = bv_0.a((AnalyticsManager$Companion)object7);
                    object7 = cv_0.a((AnalyticsManager$Companion)object7);
                    int n14 = 1536;
                    string3 = "bag interactions";
                    String string10 = "remove link click";
                    String string11 = "";
                    String string12 = "remove_click";
                    String string13 = "bag screen";
                    String string14 = "bag screen";
                    j82_02 = object4;
                    object4 = object2;
                    object2 = object5;
                    object5 = object3;
                    textView2 = textView3;
                    Object object10 = object7;
                    object3 = textView4;
                    textView4 = null;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, string3, string10, string11, string12, string13, string14, (String)object4, (Bundle)object5, (String)object7, false, null, n14, null);
                } else {
                    j82_02 = object4;
                    object2 = object5;
                    textView2 = textView3;
                    object3 = textView4;
                }
                object7 = tn_22.u;
                if (object7 != null) {
                    object7 = rn_1.w((CartEntry)object7);
                    if (j82_02 != null) {
                        j82_02.s9((String)object7);
                    }
                    object6 = AnalyticsManager.Companion;
                    string3 = "Remove from bag";
                    tj2_0.e((AnalyticsManager$Companion)object6, string3, (String)object7, (String)object2);
                }
                if (j82_02 == null) return;
                object7 = tn_22.u;
                if (textView2 != null) {
                    object2 = textView2.getText();
                } else {
                    boolean bl4 = false;
                    object2 = null;
                }
                object2 = String.valueOf(object2);
                if (object3 != null && (object3 = object3.getText()) != null) {
                    object3 = object3.toString();
                } else {
                    n3 = 0;
                    object3 = null;
                }
                j82_02.U6((CartEntry)object7, (String)object2, (String)object3);
                return;
            }
            int n15 = (Integer)object3;
            if (n15 == n4) {
                object3 = tn_22.u;
                int n16 = 1;
                if (object3 != null) {
                    n4 = (int)(((CartEntry)object3).inventoryQtyUpdateNeeded() ? 1 : 0);
                    if (n4 == n16) {
                        object3 = AnalyticsManager.Companion;
                        object6 = "Inventory change";
                        string3 = "Change Quantity Clicked";
                        tj2_0.e((AnalyticsManager$Companion)object3, string3, (String)object6, (String)object5);
                    } else {
                        string2 = new Bundle();
                        if ((object3 = ((CartEntry)object3).getProduct()) != null) {
                            string3 = ((Product)object3).getVerticalColor();
                            string2.putString("Product_Vertical", string3);
                            string3 = ((Product)object3).getBrickCategory();
                            string2.putString("Product_Brick", string3);
                            object6 = "productName";
                            object3 = ((Product)object3).getName();
                            string2.putString((String)object6, (String)object3);
                        }
                        object3 = AnalyticsManager.Companion.getInstance();
                        object6 = ((AnalyticsManager)object3).getGtmEvents();
                        AnalyticsData analyticsData = ne_0.b((Bundle)string2);
                        int n17 = 16;
                        object4 = null;
                        string3 = "Change Quantity Clicked";
                        String string15 = "Change quantity";
                        String string16 = "bag screen";
                        Object var20_36 = null;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object6, string3, string15, string16, analyticsData, null, n17, null);
                    }
                }
                if (object == null) return;
                object3 = tn_22.u;
                string2 = ((Object)textView.getText()).toString();
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
        object = tn_22.u;
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
            Object object2;
            float f5;
            Object object3;
            float f6;
            Object object4;
            Object object5;
            float f7;
            int n4;
            super.x(object);
            this.u = object = (CartEntry)object;
            if (object != null) {
                object = ((CartEntry)object).getProduct();
            } else {
                n4 = 0;
                f7 = 0.0f;
                object = null;
            }
            if (object != null) {
                object5 = ((Product)object).getBrandName();
                n3 = TextUtils.isEmpty((CharSequence)object5);
                object = n3 == 0 ? String.valueOf(((Product)object).getBrandName()) : "";
                object5 = this.k;
                object5.setText((CharSequence)object);
            }
            if ((object = this.u) != null) {
                object5 = this.g;
                if (object5 != null) {
                    ai0_2.B((View)object5);
                }
                float f8 = mz3_0.J(((CartEntry)object).getBasePrice().getValue());
                object4 = ((CartEntry)object).getQuantity();
                Intrinsics.checkNotNullExpressionValue(object4, "getQuantity(...)");
                f6 = ((Number)object4).floatValue() * f8;
                object3 = ((CartEntry)object).getVoucherPromoAmt();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
                f5 = 0.0f;
                if (!bl2) {
                    object3 = ((CartEntry)object).getVoucherPromoAmt();
                    f8 = mz3_0.J((String)object3);
                } else {
                    bl2 = false;
                    f8 = 0.0f;
                    object3 = null;
                }
                object2 = ((CartEntry)object).getMultiItemPromoAmt();
                boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl3) {
                    object = ((CartEntry)object).getMultiItemPromoAmt();
                    f7 = mz3_0.J((String)object);
                } else {
                    n4 = 0;
                    f7 = 0.0f;
                    object = null;
                }
                f6 = f6 - f8 - f7;
                float f11 = f6 - 0.0f;
                n4 = (int)(f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1));
                if (n4 <= 0) {
                    if (object5 != null) {
                        n4 = R$string.free;
                        object = hv3_0.K(n4);
                        object5.setText((CharSequence)object);
                    }
                } else {
                    float f12;
                    if (object5 != null) {
                        object = qz2_0.t(f6);
                        object5.setText((CharSequence)object);
                    }
                    if ((object = this.p) != null) {
                        ai0_2.B((View)object);
                    }
                    if ((object5 = this.u) != null && (object3 = ((CartEntry)object5).getQuantity()) != null && (object3 = ((CartEntry)object5).getProduct()) != null && (object3 = ((CartEntry)object5).getProduct().getWasPriceData()) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((CartEntry)object5).getBasePrice().getValue())))) {
                        object3 = ((CartEntry)object5).getProduct().getWasPriceData();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Price)object3).getValue();
                        f8 = mz3_0.J((String)object3);
                        object5 = ((CartEntry)object5).getQuantity();
                        Intrinsics.checkNotNull(object5);
                        n3 = (Integer)object5;
                        float f14 = n3;
                        f8 *= f14;
                    } else {
                        bl2 = false;
                        f8 = 0.0f;
                        object3 = null;
                    }
                    n3 = (int)((f12 = f8 - 0.0f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1));
                    if (n3 == 0) {
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                    } else {
                        if (object != null) {
                            object5 = qz2_0.t(f8);
                            object.setText((CharSequence)object5);
                        }
                        if (object != null) {
                            n3 = object.getPaintFlags() | 0x10;
                            object.setPaintFlags(n3);
                        }
                    }
                }
            }
            object = this.u;
            n3 = this.c;
            object3 = this.l;
            int n7 = 1;
            f6 = Float.MIN_VALUE;
            f5 = 1.0f;
            object2 = this.n;
            if (object != null && (n4 = ((CartEntry)object).isProductNS()) == n7) {
                n4 = R$string.not_deliverable_text;
                object = hv3_0.K(n4);
                object3.setText((CharSequence)object);
                object2.setAlpha(f5);
            } else {
                object = this.u;
                if (object != null && (n4 = (int)(((CartEntry)object).inventoryQtyUpdateNeeded() ? 1 : 0)) == n7) {
                    object = this.m;
                    if (n3 == 0) {
                        n7 = R$drawable.rect_border_black;
                        object4 = hv3_0.r(n7);
                        object.setBackground((Drawable)object4);
                    }
                    n7 = R$string.qty_sold_out_text;
                    object4 = hv3_0.K(n7);
                    object3.setText((CharSequence)object4);
                    object.setOnClickListener((View.OnClickListener)this);
                    object2.setAlpha(f5);
                } else {
                    object2.setAlpha(f5);
                }
            }
            object = this.j;
            object3 = this.i;
            if (n3 != 0) {
                ai0_2.i((View)object3);
                ai0_2.i((View)object);
                ai0_2.i(this.o);
                object5 = this.r;
                if (object5 != null) {
                    ai0_2.i((View)object5);
                }
                if ((object5 = this.s) != null) {
                    ai0_2.i((View)object5);
                }
            } else {
                object3.setOnClickListener((View.OnClickListener)this);
                object.setOnClickListener((View.OnClickListener)this);
            }
            n3 = object3.getPaintFlags() | 8;
            object3.setPaintFlags(n3);
            n3 = object.getPaintFlags() | 8;
            object.setPaintFlags(n3);
            object = this.q;
            object.setOnClickListener((View.OnClickListener)this);
            object2.setOnClickListener((View.OnClickListener)this);
        }
    }
}

