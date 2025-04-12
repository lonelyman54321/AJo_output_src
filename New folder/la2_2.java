/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioOrderSummaryView;
import com.ril.ajio.customviews.widgets.AjioToggleButton;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.entity.Component;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from La2
 */
public final class la2_2
extends RecyclerView$f {
    public final ArrayList a;
    public final CartOrder b;
    public final boolean c;
    public final ma2_1 d;
    public final wg2_1 e;
    public final Av f;
    public final Activity g;
    public final xc1_2 h;

    public la2_2(ArrayList arrayList, CartOrder cartOrder, boolean bl2, ma2_1 ma2_12, wg2_1 wg2_12, Av av2, FragmentActivity fragmentActivity, xc1_2 xc1_22) {
        Intrinsics.checkNotNullParameter(arrayList, "viewTypeDataList");
        Intrinsics.checkNotNullParameter(cartOrder, "cartOrder");
        Intrinsics.checkNotNullParameter(ma2_12, "listener");
        Intrinsics.checkNotNullParameter(wg2_12, "referralClickListener");
        Intrinsics.checkNotNullParameter(av2, "bannerClickListener");
        this.a = arrayList;
        this.b = cartOrder;
        this.c = bl2;
        this.d = ma2_12;
        this.e = wg2_12;
        this.f = av2;
        this.g = fragmentActivity;
        this.h = xc1_22;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        return ((pa2_1)this.a.get((int)n3)).a;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n7 = this.getItemViewType(n3);
        int n8 = 0;
        float f5 = 0.0f;
        Object object3 = null;
        int n10 = 8;
        TextView textView = null;
        Serializable serializable = this.a;
        Object object4 = "cartOrder";
        CartOrder cartOrder = this.b;
        switch (n7) {
            default: {
                break;
            }
            case 9: {
                object = (yg_1)object;
                Component component = ((pa2_1)serializable.get((int)n3)).c;
                Activity activity = this.g;
                object2 = this.h;
                ((yg_1)object).x(component, activity, (xc1_2)object2);
                break;
            }
            case 8: {
                fa2 fa22;
                String string2;
                object = (ga2_2)object;
                object.getClass();
                ma2_1 ma2_12 = this.d;
                Intrinsics.checkNotNullParameter(ma2_12, "listener");
                cp_1.Companion.getClass();
                object2 = z40_0.Companion;
                object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.d("order_confirm_assured_gift_json");
                object3 = ((ga2_2)object).f;
                n10 = (int)(object2.has((String)object3) ? 1 : 0);
                if (n10 == n4 && (string2 = object2.getString((String)object3)) != null && (n10 = string2.length()) != 0) {
                    string2 = ((ga2_2)object).b;
                    object3 = object2.getString((String)object3);
                    string2.setText((CharSequence)object3);
                }
                if ((n10 = (int)(object2.has((String)(object3 = ((ga2_2)object).g)) ? 1 : 0)) == n4 && (string2 = object2.getString((String)object3)) != null && (n10 = string2.length()) != 0) {
                    string2 = ((ga2_2)object).c;
                    object3 = object2.getString((String)object3);
                    string2.setText((CharSequence)object3);
                }
                object3 = ((ga2_2)object).i;
                n10 = (int)(object2.has((String)object3) ? 1 : 0);
                textView = ((ga2_2)object).d;
                if (n10 == n4 && (string2 = object2.getString((String)object3)) != null && (n10 = string2.length()) != 0) {
                    object3 = object2.getString((String)object3);
                    textView.setText((CharSequence)object3);
                }
                if ((n10 = (int)(object2.has((String)(object3 = ((ga2_2)object).h)) ? 1 : 0)) == n4 && (object2 = object2.getString((String)object3)) != null && (n7 = ((String)object2).length()) != 0) {
                    object2 = new da$a();
                    ((da$a)object2).k = n4;
                    ((da$a)object2).n = object3;
                    fa22 = ((ga2_2)object).a;
                    ((da$a)object2).u = fa22;
                    ((da$a)object2).a();
                }
                fa22 = new fa2((ga2_2)object, ma2_12);
                textView.setOnClickListener((View.OnClickListener)fa22);
                break;
            }
            case 7: {
                object = (mh2_2)object;
                pa2_1 pa2_12 = (pa2_1)serializable.get(n3);
                float f6 = pa2_12.b;
                ((mh2_2)object).w(f6);
                break;
            }
            case 6: {
                object = (w40_0)object;
                object.getClass();
                n3 = mz3_0.d(n10);
                n7 = -1;
                float f7 = 0.0f / 0.0f;
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n7, n3);
                object = ((w40_0)object).a;
                object.setLayoutParams(layoutParams);
                break;
            }
            case 5: {
                object = (kg2_2)object;
                object.getClass();
                Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                object = ((kg2_2)object).a;
                ((AjioOrderSummaryView)((Object)object)).configureOrder(cartOrder);
                ((AjioOrderSummaryView)((Object)object)).setOrderAmtPaidViewVisible(false);
                break;
            }
            case 4: {
                object = (uf2_1)object;
                object.getClass();
                Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                Object object5 = cartOrder.getEntries();
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlin.collections.List<com.ril.ajio.services.data.Cart.CartItem>");
                object3 = ((uf2_1)object).a;
                Intrinsics.checkNotNull(object3);
                object2 = new na2_1((Context)object3, (ArrayList)object5);
                ((uf2_1)object).b.setAdapter((ListAdapter)object2);
                n7 = object5.size();
                f5 = 0.0f;
                object3 = null;
                n10 = 0;
                Object var16_31 = null;
                for (n8 = 0; n8 < n7; n8 += n4) {
                    serializable = object5.get(n8);
                    boolean bl2 = serializable instanceof CartEntry;
                    if (!bl2) continue;
                    serializable = object5.get(n8);
                    Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
                    serializable = (CartEntry)serializable;
                    object4 = ((CartEntry)serializable).getPriorityDeliveryApplied();
                    if (object4 == null || !(bl2 = ((Boolean)(serializable = ((CartEntry)serializable).getPriorityDeliveryApplied())).booleanValue())) continue;
                    n10 += n4;
                }
                object5 = h40_0.a;
                n3 = (int)(h40_0.O1() ? 1 : 0);
                object2 = ((uf2_1)object).c;
                if (n3 != 0 && n10 > 0) {
                    n3 = R$string.pd_delivery_selected_spc;
                    object3 = String.valueOf(n10);
                    TextView textView2 = new Object[n4];
                    textView2[0] = object3;
                    object5 = hv3_0.L(n3, (Object[])textView2);
                    textView2 = ((uf2_1)object).e;
                    textView2.setText((CharSequence)object5);
                    object = ((uf2_1)object).d;
                    lp_0.h((ImageView)object);
                    ai0_2.B((View)object2);
                    break;
                }
                ai0_2.i((View)object2);
                break;
            }
            case 2: {
                object = (v40_0)object;
                object.getClass();
                Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                ((v40_0)object).f = cartOrder;
                Object object6 = "store-pickup";
                String string3 = cartOrder.getDeliveryModeValue();
                n3 = (int)(Intrinsics.areEqual(object6, string3) ? 1 : 0);
                string3 = ((v40_0)object).e;
                object2 = ((v40_0)object).d;
                object3 = ((v40_0)object).b;
                if (n3 != 0) {
                    n3 = R$drawable.ic_stores_revamp;
                    object3.setImageResource(n3);
                    n3 = R$string.store_pickup;
                    object6 = hv3_0.K(n3);
                    object2.setText((CharSequence)object6);
                    object6 = "Order will be delivered to the Trends Store.";
                    string3.setText((CharSequence)object6);
                } else {
                    n3 = R$drawable.ic_home_revamp;
                    object3.setImageResource(n3);
                    n3 = R$string.home_delivery;
                    object6 = hv3_0.K(n3);
                    object2.setText((CharSequence)object6);
                    object6 = "Order will be delivered to the address provided by you.";
                    string3.setText((CharSequence)object6);
                }
                object6 = ((v40_0)object).g;
                object = ((v40_0)object).c;
                object.setOnClickListener((View.OnClickListener)object6);
                break;
            }
            case 1: {
                float f8;
                n7 = (int)(og1_1.b() ? 1 : 0);
                if (n7 != 0) {
                    float f11;
                    object = (cc_0)object;
                    float f12 = ((pa2_1)serializable.get((int)n3)).b;
                    object.getClass();
                    Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                    ((cc_0)object).j = f12;
                    ((cc_0)object).k = f11 = cartOrder.getLoyaltyEarnedPoints();
                    n7 = R$string.you_earned_amount;
                    String string4 = qz2_0.u(f12 += f11);
                    View view = new Object[n4];
                    view[0] = string4;
                    string4 = hv3_0.L(n7, (Object[])view);
                    ((cc_0)object).b.setText((CharSequence)string4);
                    string4 = ((cc_0)object).c;
                    n4 = string4.getPaintFlags() | n10;
                    string4.setPaintFlags(n4);
                    ((cc_0)object).l = false;
                    view = ((cc_0)object).f;
                    view.setVisibility(n10);
                    object = ((cc_0)object).m;
                    string4.setOnClickListener((View.OnClickListener)object);
                    break;
                }
                object = (Ac)object;
                Object object7 = (pa2_1)serializable.get(n3);
                float f14 = ((pa2_1)object7).b;
                object.getClass();
                Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                ((Ac)object).e = f14;
                ((Ac)object).f = f8 = cartOrder.getLoyaltyEarnedPoints();
                object2 = cartOrder.getTaaraEarnedAmount();
                if (object2 == null) {
                    object2 = ax0_1.a;
                    object3 = cartOrder.getRelianceOneEarnedAmount();
                    object2.getClass();
                    f5 = ax0_1.a((Price)object3);
                }
                ((Ac)object).h = f5;
                object2 = ax0_1.a;
                object3 = cartOrder.getTaaraEarnedAmount();
                object2.getClass();
                ((Ac)object).i = f8 = ax0_1.a((Price)object3);
                f5 = ((Ac)object).f;
                f14 += f5;
                f5 = ((Ac)object).h;
                ((Ac)object).g = f8 = ax0_1.b(f5, f8) + f14;
                n3 = R$string.you_earned_amount;
                object2 = qz2_0.u(f8);
                TextView textView3 = new Object[n4];
                textView3[0] = object2;
                object7 = hv3_0.L(n3, (Object[])textView3);
                textView3 = ((Ac)object).c;
                textView3.setText((CharSequence)object7);
                object7 = ((Ac)object).j;
                object = ((Ac)object).d;
                object.setOnClickListener((View.OnClickListener)object7);
                break;
            }
            case 0: {
                String string5;
                object = (k41_0)object;
                Object object8 = (pa2_1)serializable.get(n3);
                float f15 = ((pa2_1)object8).b;
                object.getClass();
                Intrinsics.checkNotNullParameter(cartOrder, (String)object4);
                object2 = ((k41_0)object).f;
                if (object2 != null) {
                    string5 = cartOrder.getCode();
                    object4 = "Order ID ";
                    serializable = new StringBuilder((String)object4);
                    ((StringBuilder)serializable).append(string5);
                    string5 = ((StringBuilder)serializable).toString();
                    object2.setText((CharSequence)string5);
                }
                if ((object2 = ((k41_0)object).g) != null) {
                    ai0_2.B((View)object2);
                }
                if ((n7 = (int)(og1_1.b() ? 1 : 0)) == 0) {
                    object2 = h40_0.a;
                    n7 = (int)(h40_0.y1() ? 1 : 0);
                    if (n7 != 0 && (n7 = (int)(((k41_0)object).b ? 1 : 0)) != 0) {
                        float f16;
                        ((k41_0)object).k = f16 = cartOrder.getLoyaltyEarnedPoints();
                        object2 = cartOrder.getTaaraEarnedAmount();
                        if (object2 == null) {
                            object2 = ax0_1.a;
                            object3 = cartOrder.getRelianceOneEarnedAmount();
                            object2.getClass();
                            f5 = ax0_1.a((Price)object3);
                        }
                        ((k41_0)object).m = f5;
                        object2 = ax0_1.a;
                        object3 = cartOrder.getTaaraEarnedAmount();
                        object2.getClass();
                        f16 = ax0_1.a((Price)object3);
                        f5 = ((k41_0)object).k;
                        f15 += f5;
                        f5 = ((k41_0)object).m;
                        ((k41_0)object).l = f16 = ax0_1.b(f5, f16) + f15;
                        n3 = R$string.you_earned_amount;
                        object2 = qz2_0.u(f16);
                        SpannableString spannableString = new Object[n4];
                        spannableString[0] = object2;
                        object8 = hv3_0.L(n3, (Object[])spannableString);
                        spannableString = new SpannableString((CharSequence)object8);
                        object3 = ((k41_0)object).a.getContext();
                        n10 = R$color.rating_green_revamp;
                        n8 = t70.getColor(object3, n10);
                        object2 = new ForegroundColorSpan(n8);
                        n8 = ((String)object8).length();
                        string5 = String.valueOf(((k41_0)object).l);
                        n10 = string5.length();
                        n8 = n8 - n10 + -2;
                        n3 = ((String)object8).length();
                        n10 = 34;
                        spannableString.setSpan(object2, n8, n3, n10);
                        object = ((k41_0)object).h;
                        if (object == null) break;
                        object.setText((CharSequence)spannableString);
                        break;
                    }
                }
                if ((object = ((k41_0)object).i) == null) break;
                ai0_2.i((View)object);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parent");
        Object object3 = "inflate(...)";
        Object object4 = this.d;
        switch (n3) {
            default: {
                Object object5 = LayoutInflater.from((Context)object.getContext());
                int n4 = R$layout.layout_space;
                object = object5.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNull(object);
                object5 = new w40_0((View)object);
                return object5;
            }
            case 9: {
                object4 = LayoutInflater.from((Context)object.getContext());
                int n4 = R$layout.item_cms_banner_layout;
                object = object4.inflate(n4, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object3 = this.f;
                yg_1 yg_12 = new yg_1((View)object, (Av)object3);
                return yg_12;
            }
            case 8: {
                LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
                int n8 = R$layout.order_confirm_assured_gifts_view;
                layoutInflater = layoutInflater.inflate(n8, (ViewGroup)object, false);
                Intrinsics.checkNotNull(layoutInflater);
                object.getContext();
                object3 = new ga2_2((View)layoutInflater);
                return object3;
            }
            case 7: {
                object4 = LayoutInflater.from((Context)object.getContext());
                int n7 = R$layout.row_referral_widget_3;
                object = object4.inflate(n7, (ViewGroup)object, false);
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object3 = this.e;
                mh2_2 mh2_22 = new mh2_2((View)object, (wg2_1)object3);
                return mh2_22;
            }
            case 5: {
                Object object6 = LayoutInflater.from((Context)object.getContext());
                int n14 = R$layout.order_confirm_summary_view;
                object = object6.inflate(n14, (ViewGroup)object, false);
                Intrinsics.checkNotNull(object);
                object6 = new kg2_2((View)object);
                return object6;
            }
            case 4: {
                LayoutInflater layoutInflater;
                n3 = (int)(og1_1.b() ? 1 : 0);
                if (n3 != 0) {
                    layoutInflater = LayoutInflater.from((Context)object.getContext());
                    int n15 = R$layout.order_confirm_product_list_luxe;
                    layoutInflater = layoutInflater.inflate(n15, (ViewGroup)object, false);
                } else {
                    layoutInflater = LayoutInflater.from((Context)object.getContext());
                    int n16 = R$layout.order_confirm_product_list_revamp;
                    layoutInflater = layoutInflater.inflate(n16, (ViewGroup)object, false);
                }
                Intrinsics.checkNotNull(layoutInflater);
                object = object.getContext();
                object3 = new uf2_1((Context)object, (View)layoutInflater);
                return object3;
            }
            case 3: {
                Object object7 = LayoutInflater.from((Context)object.getContext());
                int n17 = R$layout.order_confirm_whathappensnext_view;
                object = object7.inflate(n17, (ViewGroup)object, false);
                Intrinsics.checkNotNull(object);
                Intrinsics.checkNotNullParameter(object, "itemView");
                object7 = new RecyclerView$B((View)object);
                int n18 = R$id.whathappens_next_expand;
                object = object.findViewById(n18);
                Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
                object = (AjioToggleButton)object;
                object3 = FontsManager.getInstance();
                AJIOApplication.Companion.getClass();
                object4 = AJIOApplication$a.a();
                object3 = ((FontsManager)object3).getTypefaceWithFont((Context)object4, 3);
                object.setTypeface((Typeface)object3);
                return object7;
            }
            case 2: {
                Object object8;
                n3 = (int)(og1_1.b() ? 1 : 0);
                if (n3 != 0) {
                    object8 = LayoutInflater.from((Context)object.getContext());
                    int n19 = R$layout.order_delivery_address_luxe;
                    object = object8.inflate(n19, (ViewGroup)object, false);
                } else {
                    object8 = LayoutInflater.from((Context)object.getContext());
                    int n20 = R$layout.order_deliv_address_revamp;
                    object = object8.inflate(n20, (ViewGroup)object, false);
                }
                Intrinsics.checkNotNull(object);
                object8 = new v40_0((View)object, (ma2_1)object4);
                return object8;
            }
            case 1: {
                Object object9;
                n3 = (int)(og1_1.b() ? 1 : 0);
                if (n3 != 0) {
                    object9 = LayoutInflater.from((Context)object.getContext());
                    int n21 = R$layout.order_summary_earnpoints_layout_luxe;
                    object = object9.inflate(n21, (ViewGroup)object, false);
                    Intrinsics.checkNotNull(object);
                    object9 = new cc_0((View)object, (ma2_1)object4);
                } else {
                    object9 = LayoutInflater.from((Context)object.getContext());
                    int bl2 = R$layout.order_summary_earnpoints_layout_revamp;
                    object = object9.inflate(bl2, (ViewGroup)object, false);
                    Intrinsics.checkNotNull(object);
                    object9 = new Ac((View)object, (ma2_1)object4);
                }
                return object9;
            }
            case 0: 
        }
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object2 = LayoutInflater.from((Context)object.getContext());
            int n8 = R$layout.order_conf_header_view_luxe;
            object = object2.inflate(n8, (ViewGroup)object, false);
        } else {
            object2 = LayoutInflater.from((Context)object.getContext());
            int n10 = R$layout.order_conf_header_view_revamp;
            object = object2.inflate(n10, (ViewGroup)object, false);
        }
        Intrinsics.checkNotNull(object);
        boolean bl2 = this.c;
        object2 = new k41_0((View)object, bl2, (ma2_1)object4);
        return object2;
    }

    public final void onViewAttachedToWindow(RecyclerView$B recyclerView$B) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        super.onViewAttachedToWindow(recyclerView$B);
        boolean bl2 = recyclerView$B instanceof yg_1;
        if (bl2) {
            recyclerView$B = (yg_1)recyclerView$B;
            ((yg_1)recyclerView$B).w();
        }
    }
}

