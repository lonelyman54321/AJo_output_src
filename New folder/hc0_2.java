/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.returnexchange.BaseOptions;
import com.ril.ajio.services.data.returnexchange.BasePrice;
import com.ril.ajio.services.data.returnexchange.ExchangeEntries;
import com.ril.ajio.services.data.returnexchange.Images;
import com.ril.ajio.services.data.returnexchange.Product;
import com.ril.ajio.services.data.returnexchange.ReturnEntries;
import com.ril.ajio.services.data.returnexchange.ReturnExchange;
import com.ril.ajio.services.data.returnexchange.ReturnExchangeResponse;
import com.ril.ajio.services.data.returnexchange.ReturnOrderEntry;
import com.ril.ajio.services.data.returnexchange.Selected;
import com.ril.ajio.services.data.returnexchange.Value;
import com.ril.ajio.services.data.returnexchange.VariantOptionQualifiers;
import com.ril.ajio.services.data.returnexchange.WasPriceData;
import com.ril.ajio.services.helper.UrlHelper;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from HC0
 */
public final class hc0_2
extends t51 {
    public ReturnExchangeResponse f;
    public final NewEEcommerceEventsRevamp g;
    public final NewCustomEventsRevamp h;
    public String i;
    public ReturnOrderItemDetails j;

    public hc0_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.g = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.h = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.i = "";
    }

    public static SpannableString Qa(ReturnOrderEntry object) {
        int n3;
        float f5;
        BasePrice basePrice = ((ReturnOrderEntry)object).getBasePrice();
        object = ((ReturnOrderEntry)object).getProduct().getWasPriceData();
        int n4 = 0;
        float f6 = 0.0f;
        String string2 = null;
        if (basePrice != null) {
            f5 = basePrice.getValue();
        } else {
            n3 = 0;
            f5 = 0.0f;
            basePrice = null;
        }
        if (object != null) {
            f6 = ((WasPriceData)object).getValue();
        }
        f5 = (f6 - f5) / f6;
        n4 = 100;
        f6 = n4;
        n3 = ok1_1.b(f5 *= f6);
        string2 = UX.a(n3, "%");
        object = object != null ? ((WasPriceData)object).getFormattedValue() : "";
        String string3 = " (";
        String string4 = " off)";
        string2 = y02.a((String)object, string3, string2, string4);
        if (n3 <= 0) {
            boolean bl2 = false;
            object = null;
        } else {
            basePrice = new SpannableString((CharSequence)string2);
            string2 = new StrikethroughSpan();
            int n7 = ((String)object).length();
            string4 = null;
            int n8 = 33;
            basePrice.setSpan(string2, 0, n7, n8);
            string3 = "#B09975";
            n7 = Color.parseColor((String)string3);
            string2 = new ForegroundColorSpan(n7);
            int n10 = ((String)object).length() + 1;
            n7 = basePrice.length();
            basePrice.setSpan(string2, n10, n7, n8);
            object = basePrice;
        }
        return object;
    }

    public static String Ta(Product iterator) {
        String string2;
        int n3;
        boolean bl2;
        String string3;
        Object object;
        int n4;
        iterator = ((Product)((Object)iterator)).getBaseOptions();
        String string4 = "";
        if (iterator != null) {
            iterator = iterator.iterator();
            while ((n4 = iterator.hasNext()) != 0) {
                Iterator iterator2 = (BaseOptions)iterator.next();
                object = hv3_0.K(R$string.size_variant_option);
                bl2 = Intrinsics.areEqual(object, string3 = ((BaseOptions)((Object)iterator2)).getVariantType());
                if (!bl2) continue;
                iterator2 = ((BaseOptions)((Object)iterator2)).getSelected();
                Intrinsics.checkNotNull(iterator2);
                iterator2 = ((Selected)((Object)iterator2)).getVariantOptionQualifiers();
                Intrinsics.checkNotNull(iterator2);
                iterator2 = iterator2.iterator();
                while (bl2 = iterator2.hasNext()) {
                    object = (VariantOptionQualifiers)iterator2.next();
                    if (object == null || (n3 = (int)(Intrinsics.areEqual(string3 = hv3_0.K(R$string.size_variant_name), string2 = ((VariantOptionQualifiers)object).getName()) ? 1 : 0)) == 0) continue;
                    string4 = String.valueOf(((VariantOptionQualifiers)object).getValue());
                }
            }
        }
        int n7 = string4.length();
        n4 = 1;
        n7 -= n4;
        bl2 = false;
        object = null;
        n3 = 0;
        string3 = null;
        boolean bl3 = false;
        string2 = null;
        while (n3 <= n7) {
            int n8 = !bl3 ? n3 : n7;
            n8 = string4.charAt(n8);
            int n10 = 32;
            n8 = Intrinsics.compare(n8, n10);
            n8 = n8 <= 0 ? 1 : 0;
            if (!bl3) {
                if (n8 == 0) {
                    bl3 = true;
                    continue;
                }
                ++n3;
                continue;
            }
            if (n8 == 0) break;
            n7 += -1;
        }
        return com.jio.jioads.adinterfaces.a.a(n7, n4, n3, string4);
    }

    public final View Pa(String string2, String string3, String string4, String string5, String string6, Integer n3, Integer n4, Integer n7, Integer n8) {
        int n10;
        Object object = string3;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n14 = R$layout.view_whats_next;
        layoutInflater = layoutInflater.inflate(n14, null);
        n14 = R$id.exchange_confirm_tv_title;
        Object object2 = layoutInflater.findViewById(n14);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        int n15 = R$id.line1;
        Object object4 = layoutInflater.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (AjioTextView)object4;
        int n16 = R$id.imv1;
        Context context = layoutInflater.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(context, (String)object3);
        context = (ImageView)context;
        int n17 = R$id.ll_line1;
        View view = layoutInflater.findViewById(n17);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        view = (LinearLayout)view;
        int n18 = R$id.recycler_view;
        Object object5 = layoutInflater.findViewById(n18);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object5 = (RecyclerView)object5;
        int n19 = R$id.line2;
        Object object6 = layoutInflater.findViewById(n19);
        Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
        object6 = (AjioTextView)object6;
        int n20 = R$id.imv2;
        View view2 = layoutInflater.findViewById(n20);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object3);
        view2 = (ImageView)view2;
        int n21 = R$id.ll_line2;
        View view3 = layoutInflater.findViewById(n21);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object3);
        view3 = (LinearLayout)view3;
        int n22 = R$id.line3;
        Object object7 = layoutInflater.findViewById(n22);
        Intrinsics.checkNotNullExpressionValue(object7, (String)object3);
        object7 = (AjioTextView)object7;
        int n24 = R$id.imv3;
        View view4 = layoutInflater.findViewById(n24);
        Intrinsics.checkNotNullExpressionValue(view4, (String)object3);
        view4 = (ImageView)view4;
        int n25 = R$id.ll_line3;
        View view5 = layoutInflater.findViewById(n25);
        Intrinsics.checkNotNullExpressionValue(view5, (String)object3);
        view5 = (LinearLayout)view5;
        int n26 = R$id.line4;
        Object object8 = layoutInflater.findViewById(n26);
        Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
        object8 = (AjioTextView)object8;
        int n27 = R$id.imv4;
        View view6 = layoutInflater.findViewById(n27);
        Intrinsics.checkNotNullExpressionValue(view6, (String)object3);
        ImageView imageView = (ImageView)view6;
        n27 = R$id.ll_line4;
        view6 = layoutInflater.findViewById(n27);
        Intrinsics.checkNotNullExpressionValue(view6, (String)object3);
        view6 = (LinearLayout)view6;
        int n28 = TextUtils.isEmpty((CharSequence)string2);
        if (n28 != 0) {
            n28 = 8;
            object2.setVisibility(n28);
        } else {
            object3 = string2;
            object2.setText((CharSequence)string2);
        }
        n14 = (int)(TextUtils.isEmpty((CharSequence)string3) ? 1 : 0);
        if (n14 == 0) {
            object4.setText((CharSequence)object);
            object2 = this.getActivity();
            if (object2 != null) {
                n28 = n3;
                object2 = t70.getDrawable((Context)object2, n28);
            } else {
                n14 = 0;
                object2 = null;
            }
            context.setImageDrawable((Drawable)object2);
            object2 = R$drawable.ic_ack_slip;
            object3 = n4;
            n14 = (int)(((Object)n4).equals(object2) ? 1 : 0);
            n15 = 1;
            if (n14 == n15) {
                object2 = context.getContext();
                n15 = R$string.acc_icon_acknowledge_slip_icon;
                object2 = object2.getString(n15);
                context.setContentDescription((CharSequence)object2);
            }
            ai0_2.B(view);
            n14 = R$string.packing_self_ship_new;
            object2 = hv3_0.K(n14);
            n10 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
            if (n10 != 0) {
                ai0_2.B((View)object5);
                object2 = hv3_0.K(R$string.packing_self_ship_new_1);
                object = new ro1_0("1.", (String)object2);
                n15 = R$string.packing_self_ship_new_2;
                object4 = hv3_0.K(n15);
                object2 = new ro1_0("2.", (String)object4);
                context = hv3_0.K(R$string.packing_self_ship_new_3);
                object4 = new ro1_0("3.", (String)context);
                n16 = 3;
                context = new ro1_0[n16];
                n17 = 0;
                view = null;
                context[0] = object;
                n10 = 1;
                context[n10] = object2;
                n14 = 2;
                context[n14] = object4;
                object2 = xx_2.i((Object[])context);
                context = ye_0.EXCHANGE_CONFIRM_FRAGMENT;
                object4 = new ae_2((List)object2, (ye_0)context);
                ((RecyclerView)object5).setHasFixedSize(n10 != 0);
                context = object5.getContext();
                object2 = new LinearLayoutManager(context, n10, false);
                ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object2);
                ((RecyclerView)object5).setAdapter((RecyclerView$f)object4);
            }
        } else {
            object3 = n4;
            ai0_2.i(view);
        }
        if ((n10 = TextUtils.isEmpty((CharSequence)string4)) == 0) {
            object = string4;
            object6.setText((CharSequence)string4);
            object = this.getActivity();
            if (object != null) {
                n14 = n4;
                object = t70.getDrawable((Context)object, n14);
            } else {
                n10 = 0;
                object = null;
            }
            view2.setImageDrawable((Drawable)object);
            ai0_2.B(view3);
        } else {
            ai0_2.i(view3);
        }
        n10 = TextUtils.isEmpty((CharSequence)string5);
        if (n10 == 0 && n7 != null) {
            object = string5;
            object7.setText((CharSequence)string5);
            object = this.getActivity();
            if (object != null) {
                n14 = n7;
                object = t70.getDrawable((Context)object, n14);
            } else {
                n10 = 0;
                object = null;
            }
            view4.setImageDrawable((Drawable)object);
            n10 = R$string.acc_unbox_icon;
            object = hv3_0.K(n10);
            view4.setContentDescription((CharSequence)object);
            ai0_2.B(view5);
        } else {
            ai0_2.i(view5);
        }
        n10 = TextUtils.isEmpty((CharSequence)string6);
        if (n10 == 0 && n8 != null) {
            object = string6;
            object8.setText((CharSequence)string6);
            object = this.getActivity();
            if (object != null) {
                n26 = n8;
                view5 = t70.getDrawable((Context)object, n26);
                object = imageView;
            } else {
                object = imageView;
                n25 = 0;
                view5 = null;
            }
            object.setImageDrawable((Drawable)view5);
            ai0_2.B(view6);
        } else {
            ai0_2.i(view6);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View Ra(String string2, String string3, String string4, String string5, int n3, String string6, String string7, String string8) {
        String string9;
        int n4 = n3;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n7 = R$layout.row_exchange_confirm_product;
        layoutInflater = layoutInflater.inflate(n7, null);
        n7 = R$id.img_product;
        Object object = (ImageView)layoutInflater.findViewById(n7);
        int n8 = R$id.item_name;
        TextView textView = (TextView)layoutInflater.findViewById(n8);
        int n10 = R$id.item_price;
        Object object2 = layoutInflater.findViewById(n10);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        int n14 = R$id.size;
        View view = layoutInflater.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view, (String)object3);
        AjioTextView ajioTextView = (AjioTextView)view;
        int n15 = R$id.quantity;
        View view2 = layoutInflater.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object3);
        AjioTextView ajioTextView2 = (AjioTextView)view2;
        int n16 = R$id.item_tv_status;
        Object object4 = layoutInflater.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (AjioTextView)object4;
        int n17 = R$id.brand_Name;
        View view3 = layoutInflater.findViewById(n17);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object3);
        AjioTextView ajioTextView3 = (AjioTextView)view3;
        int n18 = TextUtils.isEmpty((CharSequence)string3);
        int n19 = 1;
        if (n18 == 0) {
            object3 = new da$a();
            ((da$a)object3).k = n19;
            ((da$a)object3).r = n19;
            int n20 = R$string.acc_banner;
            String string10 = hv3_0.K(n20);
            ((da$a)object3).b(string10);
            string10 = string3;
            ((da$a)object3).n = string3;
            ((da$a)object3).u = object;
            ((da$a)object3).a();
        } else {
            n18 = R$drawable.item_dummy_noimg;
            object.setImageResource(n18);
        }
        object = qz2_0.s(string4);
        object2.setText((CharSequence)object);
        object = new StringBuilder("Size ");
        object2 = string5;
        ((StringBuilder)object).append(string5);
        object = ((StringBuilder)object).toString();
        ajioTextView.setText((CharSequence)object);
        n7 = 8;
        if (n4 > n19) {
            object3 = "Qty ";
            object2 = new StringBuilder((String)object3);
            ((StringBuilder)object2).append(n4);
            string9 = ((StringBuilder)object2).toString();
            ajioTextView2.setText(string9);
            n4 = 0;
            string9 = null;
            ajioTextView2.setVisibility(0);
        } else {
            ajioTextView2.setVisibility(n7);
        }
        n4 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n4 != 0) {
            textView.setVisibility(n7);
        } else {
            string9 = string2;
            textView.setText((CharSequence)string2);
        }
        n4 = (int)(TextUtils.isEmpty((CharSequence)string8) ? 1 : 0);
        if (n4 == 0) {
            string9 = string8;
            ajioTextView3.setText(string8);
            ai0_2.B((View)ajioTextView3);
        } else {
            ai0_2.i((View)ajioTextView3);
        }
        string9 = string6;
        object4.setText((CharSequence)string6);
        n4 = cf_2.c(string7);
        n7 = -1;
        if (n4 != n7 && (string9 = hv3_0.r(n4)) != null) {
            ((AppCompatTextView)object4).setCompoundDrawablesWithIntrinsicBounds(null, null, (Drawable)string9, null);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    public final View Sa(ReturnExchange object) {
        int n3 = 1;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n4 = R$layout.row_selfship_confirm_address;
        layoutInflater = layoutInflater.inflate(n4, null);
        n4 = R$id.exchange_confirm_layout_address_selfship;
        Object object2 = (LinearLayout)layoutInflater.findViewById(n4);
        int n7 = R$id.tv_mode;
        AjioTextView ajioTextView = (AjioTextView)layoutInflater.findViewById(n7);
        int n8 = R$id.cl_mode;
        ConstraintLayout constraintLayout = (ConstraintLayout)layoutInflater.findViewById(n8);
        int n10 = R$id.tv_total_refund_amount;
        AjioTextView ajioTextView2 = (AjioTextView)layoutInflater.findViewById(n10);
        Object object3 = ((ReturnExchange)object).getWarehouseAddress();
        int n14 = 8;
        if (object3 != null) {
            CharSequence[] charSequenceArray = ((CartDeliveryAddress)object3).getFirstName();
            int n15 = TextUtils.isEmpty((CharSequence)charSequenceArray);
            String string2 = "null";
            String string3 = "";
            if (n15 == 0 && (n15 = string2.equalsIgnoreCase((String)(charSequenceArray = ((CartDeliveryAddress)object3).getFirstName()))) == 0) {
                charSequenceArray = ((CartDeliveryAddress)object3).getFirstName();
                string3 = kp1_0.c(string3, (String)charSequenceArray);
            }
            if ((n15 = TextUtils.isEmpty((CharSequence)(charSequenceArray = ((CartDeliveryAddress)object3).getLastName()))) == 0 && (n15 = string2.equalsIgnoreCase((String)(charSequenceArray = ((CartDeliveryAddress)object3).getLastName()))) == 0) {
                charSequenceArray = ((CartDeliveryAddress)object3).getLastName();
                string2 = " ";
                string3 = n1.a(string3, string2, (String)charSequenceArray);
            }
            object3 = hv3_0.g((CartDeliveryAddress)object3);
            n15 = TextUtils.isEmpty((CharSequence)string3);
            if (n15 == 0) {
                n15 = 3;
                charSequenceArray = new CharSequence[n15];
                charSequenceArray[0] = string3;
                string2 = "\n";
                charSequenceArray[n3] = string2;
                int n16 = 2;
                charSequenceArray[n16] = object3;
                object3 = TextUtils.concat((CharSequence[])charSequenceArray);
            }
            n15 = R$id.exchange_confirm_tv_info;
            object2 = object2.findViewById(n15);
            charSequenceArray = "findViewById(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)charSequenceArray);
            object2 = (AjioTextView)object2;
            n15 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            if (n15 != 0) {
                object2.setVisibility(n14);
            } else {
                object2.setText((CharSequence)object3);
            }
        }
        if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((ReturnExchange)object).getReturnRefundType())) ? 1 : 0)) != 0) {
            constraintLayout.setVisibility(n14);
        } else {
            object2 = ((ReturnExchange)object).getReturnRefundType();
            ajioTextView.setText((CharSequence)object2);
        }
        object = ((ReturnExchange)object).getReturnEntries();
        object2 = "getReturnEntries(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        n4 = object.size();
        ajioTextView = null;
        n8 = 0;
        constraintLayout = null;
        for (n7 = 0; n7 < n4; n7 += n3) {
            object3 = ((ReturnEntries)object.get(n7)).getReturnOrderEntry().getBasePrice();
            float f5 = ((BasePrice)object3).getValue();
            int n17 = (int)f5;
            n8 += n17;
        }
        int n18 = R$string.total_refund;
        object2 = n8;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object2;
        object = hv3_0.L(n18, objectArray);
        ajioTextView2.setText((CharSequence)object);
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    public final View Ua(String string2, String string3, String string4, String string5, boolean bl2, boolean bl3) {
        int n3 = 1;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n4 = R$layout.row_exchange_confirm_header;
        layoutInflater = layoutInflater.inflate(n4, null);
        n4 = R$id.layout_verification_process;
        View view = layoutInflater.findViewById(n4);
        int n7 = R$id.info_tv_verification_process;
        TextView textView = (TextView)layoutInflater.findViewById(n7);
        int n8 = R$id.rlReturnHeader;
        Object object = (RelativeLayout)layoutInflater.findViewById(n8);
        int n10 = R$id.exchange_confirm_tv_type;
        Object object2 = layoutInflater.findViewById(n10);
        Object[] objectArray = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray);
        object2 = (AjioTextView)object2;
        int n14 = R$id.exchange_confirm_tv_id;
        Object object3 = layoutInflater.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
        object3 = (AjioTextView)object3;
        int n15 = R$id.exchange_confirm_tv_message;
        Object object4 = layoutInflater.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
        object4 = (AjioTextView)object4;
        if (bl3) {
            int n16 = R$drawable.cc_rounded_full_bg_yellow_refresh;
            object.setBackgroundResource(n16);
        }
        object = string2;
        object2.setText((CharSequence)string2);
        if (string4 != null) {
            object = "format(...)";
            if (!bl2) {
                object2 = StringCompanionObject.INSTANCE;
                n10 = R$string.return_id;
                object2 = hv3_0.K(n10);
                objectArray = new Object[n3];
                objectArray[0] = string4;
                n40_0.a(objectArray, n3, (String)object2, (String)object, (AjioTextView)object3);
            } else {
                object2 = StringCompanionObject.INSTANCE;
                n10 = R$string.exchange_id;
                object2 = hv3_0.K(n10);
                objectArray = new Object[n3];
                objectArray[0] = string4;
                n40_0.a(objectArray, n3, (String)object2, (String)object, (AjioTextView)object3);
            }
        }
        n3 = string3.length();
        n8 = 8;
        if (n3 != 0 && !bl2) {
            ai0_2.z((TextView)object4, string3);
        } else {
            object4.setVisibility(n8);
        }
        n3 = (int)(TextUtils.isEmpty((CharSequence)string5) ? 1 : 0);
        if (n3 != 0) {
            view.setVisibility(n8);
        } else {
            view.setVisibility(0);
            textView.setText((CharSequence)string5);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    public final View Va(String string2, String string3) {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.getContext());
        int n3 = R$layout.row_exchange_confirm_status;
        layoutInflater = layoutInflater.inflate(n3, null);
        n3 = R$id.exchange_confirm_tv_name;
        Object object = layoutInflater.findViewById(n3);
        String string4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string4);
        object = (AjioTextView)object;
        int n4 = R$id.exchange_confirm_tv_value;
        Object object2 = layoutInflater.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string4);
        object2 = (AjioTextView)object2;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        int n7 = 8;
        if (bl2) {
            object.setVisibility(n7);
        } else {
            String string5 = "  ";
            string2 = kp1_0.c(string5, string2);
            string4 = new SpannableString((CharSequence)string2);
            object.setText((CharSequence)string4);
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        if (bl3) {
            object2.setVisibility(n7);
        } else {
            object2.setText((CharSequence)string3);
        }
        Intrinsics.checkNotNull(layoutInflater);
        return layoutInflater;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            String string2;
            object = this.requireArguments();
            String string3 = "requireArguments(...)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            int n3 = Build.VERSION.SDK_INT;
            Object object2 = null;
            int n4 = 33;
            if (n3 >= n4) {
                object = FC0.a(object);
            } else {
                string2 = "INITIATE_RETURN_REQUEST_DATA";
                boolean bl3 = (object = object.getSerializable(string2)) instanceof ReturnExchangeResponse;
                if (!bl3) {
                    bl2 = false;
                    object = null;
                }
                object = (ReturnExchangeResponse)object;
            }
            object = (ReturnExchangeResponse)object;
            this.f = object;
            object = this.requireArguments();
            string2 = "RETURN_EXCHANGE_IFSC_VALUE";
            bl2 = object.containsKey(string2);
            if (bl2 && (object = this.requireArguments().getString(string2)) != null) {
                object = this.requireArguments().getString(string2);
                Intrinsics.checkNotNull(object);
            }
            if (bl2 = (object = this.requireArguments()).containsKey(string2 = "RETURN_ORDER_ITEM_DETAILS")) {
                object = this.requireArguments();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                if (n3 >= n4) {
                    object = GC0.a(object);
                } else {
                    boolean bl4 = (object = object.getSerializable(string2)) instanceof ReturnOrderItemDetails;
                    if (bl4) {
                        object2 = object;
                    }
                    object = object2;
                    object = (ReturnOrderItemDetails)object2;
                }
                object = (ReturnOrderItemDetails)object;
                this.j = object;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_exchange_confirmed;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.h.getSTEP();
        bundle.putString((String)object, "5");
        String string2 = Ft2.a(this.i, "success screen");
        object = this.g;
        String string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string4 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.h.newPushCustomScreenView(string2, "order management screen", string3, bundle, string4);
    }

    public final void onStop() {
        super.onStop();
        this.g.setPreviousScreenData("success screen", "order management screen");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block129: {
            block113: {
                var3_3 = this;
                var4_4 /* !! */  = var1_1;
                var5_5 = 0;
                var6_6 = 0.0f;
                var7_7 = null;
                var8_8 = 1;
                Intrinsics.checkNotNullParameter(var1_1, "view");
                super.onViewCreated(var1_1, var2_2 /* !! */ );
                var9_9 = this.f;
                if (var9_9 == null) {
                    var9_9 = this.requireActivity();
                    var9_9.finish();
                }
                var10_10 = R$id.exchange_confirm_layout_address;
                var11_11 = var9_9 = var4_4 /* !! */ .findViewById(var10_10);
                var11_11 = (LinearLayout)var9_9;
                var10_10 = R$id.exchange_confirm_layout_ret_dynamic;
                var9_9 = var4_4 /* !! */ .findViewById(var10_10);
                var12_12 = var9_9;
                var12_12 = (LinearLayout)var9_9;
                var10_10 = R$id.exchange_confirm_layout_exc_dynamic;
                var13_13 = var9_9 = var4_4 /* !! */ .findViewById(var10_10);
                var13_13 = (LinearLayout)var9_9;
                var9_9 = var3_3.f;
                var14_14 = "getResponseDetails(...)";
                var15_15 /* !! */  = "getReturnEntries(...)";
                if (var9_9 == null) break block113;
                Intrinsics.checkNotNull(var9_9);
                var9_9 = var9_9.getResponseDetails();
                if (var9_9 == null) break block113;
                var9_9 = var3_3.f;
                Intrinsics.checkNotNull(var9_9);
                var9_9 = var9_9.getResponseDetails();
                Intrinsics.checkNotNullExpressionValue(var9_9, (String)var14_14);
                var10_10 = var9_9.isEmpty() ^ var8_8;
                if (var10_10 == 0) break block113;
                var9_9 = var3_3.f;
                Intrinsics.checkNotNull(var9_9);
                var16_16 = var9_9.getResponseDetails().size();
                var17_17 = "";
                var18_18 = var17_17;
                var10_10 = 0;
                var19_19 = 0.0f;
                var9_9 = null;
                var20_20 = 0;
                var21_21 = 0.0f;
                var22_22 = null;
                var23_23 = 0;
                var24_24 = false;
                while (var20_20 < var16_16) {
                    block114: {
                        block128: {
                            block115: {
                                block111: {
                                    block127: {
                                        block117: {
                                            block119: {
                                                block118: {
                                                    block116: {
                                                        var25_25 /* !! */  = var3_3.f;
                                                        Intrinsics.checkNotNull(var25_25 /* !! */ );
                                                        var25_25 /* !! */  = var25_25 /* !! */ .getResponseDetails().get(var20_20);
                                                        var26_26 = var25_25 /* !! */ ;
                                                        var26_26 = (ReturnExchange)var25_25 /* !! */ ;
                                                        if (var26_26 == null) break block114;
                                                        var25_25 /* !! */  = var26_26.getReturnEntries();
                                                        var2_2 /* !! */  = var13_13;
                                                        var13_13 = "return_exchange_message_enable";
                                                        var27_27 = "getApplication(...)";
                                                        var28_28 = "getReturnOrderEntry(...)";
                                                        var29_29 = "PRIMARY";
                                                        var30_30 = "cartIcon";
                                                        var31_31 /* !! */  = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ";
                                                        var32_32 /* !! */  = "EEEE, dd MMMM";
                                                        var33_33 = var16_16;
                                                        if (var25_25 /* !! */  == null) break block115;
                                                        var25_25 /* !! */  = var26_26.getReturnEntries();
                                                        Intrinsics.checkNotNullExpressionValue(var25_25 /* !! */ , (String)var15_15 /* !! */ );
                                                        var34_34 = var25_25 /* !! */ .isEmpty() ^ var8_8;
                                                        if (var34_34 == 0) break block115;
                                                        var35_35 = var10_10 + 1;
                                                        var10_10 = (int)var26_26.isReturnonHold();
                                                        if (var10_10 == 0 || (var10_10 = (int)TextUtils.isEmpty((CharSequence)(var9_9 = var26_26.getReturnVerificationDate()))) != 0) break block116;
                                                        var9_9 = var26_26.getReturnVerificationDate();
                                                        var25_25 /* !! */  = "yyyy-MM-dd'T'kk:mm:ss.SSSXXX";
                                                        var36_36 = TextUtils.isEmpty((CharSequence)(var9_9 = k7.c((String)var9_9, (String)var32_32 /* !! */ , (String)var25_25 /* !! */ )));
                                                        if (!var36_36) {
                                                            var16_16 = R$string.verification_complete_by;
                                                            var37_37 = var18_18;
                                                            var18_18 = new Object[var8_8];
                                                            var18_18[0] = var9_9;
                                                            var18_18 = var9_9 = hv3_0.L(var16_16, (Object[])var18_18);
                                                        } else {
                                                            var37_37 = var18_18;
                                                            var18_18 = var17_17;
                                                        }
                                                        var9_9 = k7.c(var26_26.getReturnVerificationDate(), "dd MMMM", (String)var25_25 /* !! */ );
                                                        var34_34 = R$string.return_verification_info;
                                                        var38_38 = new Object[var8_8];
                                                        var38_38[0] = var9_9;
                                                        var38_38 = hv3_0.L(var34_34, (Object[])var38_38);
                                                        var25_25 /* !! */  = hv3_0.K(R$string.return_pending_verification);
                                                        var9_9 = var26_26.getReturnRequestCode();
                                                        var10_10 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                                                        if (var10_10 != 0) {
                                                            var9_9 = var26_26.getExchangeRequestCode();
lbl96:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        var9_9 = var26_26.getReturnRequestCode();
                                                        ** continue;
                                                        var39_39 = var9_9;
                                                        var40_40 = 0;
                                                        var41_41 = null;
                                                        var42_42 = 1;
                                                        var43_43 = 1.4E-45f;
                                                        var9_9 = this;
                                                        var44_44 = var26_26;
                                                        var26_26 = var18_18;
                                                        var45_45 = var37_37;
                                                        var18_18 = var39_39;
                                                        var46_46 = var20_20;
                                                        var22_22 = var38_38;
                                                        var16_16 = 0;
                                                        var38_38 = null;
                                                        var47_47 = 0.0f;
                                                        var48_48 = var32_32 /* !! */ ;
                                                        var49_49 = var27_27;
                                                        var50_50 = var28_28;
                                                        var51_51 = var29_29;
                                                        var52_52 = var30_30;
                                                        var7_7 = var31_31 /* !! */ ;
                                                        var53_53 = var42_42;
                                                        var9_9 = this.Ua((String)var25_25 /* !! */ , (String)var26_26, (String)var39_39, (String)var22_22, false, (boolean)var42_42);
                                                        var12_12.addView((View)var9_9);
                                                        var53_53 = 0;
                                                        var32_32 /* !! */  = null;
                                                        break block117;
                                                    }
                                                    var44_44 = var26_26;
                                                    var45_45 = var18_18;
                                                    var46_46 = var20_20;
                                                    var48_48 = var32_32 /* !! */ ;
                                                    var49_49 = var27_27;
                                                    var50_50 = var28_28;
                                                    var51_51 = var29_29;
                                                    var52_52 = var30_30;
                                                    var7_7 = var31_31 /* !! */ ;
                                                    var10_10 = (int)var26_26.getSelfShipReturn();
                                                    if (var10_10 != 0) break block118;
                                                    var10_10 = R$string.pickup_by_message;
                                                    var25_25 /* !! */  = k7.c(var26_26.getReturnPickupDate(), (String)var32_32 /* !! */ , (String)var31_31 /* !! */ );
                                                    var54_54 = 1;
                                                    var55_55 = 1.4E-45f;
                                                    var18_18 = new Object[var54_54];
                                                    var20_20 = 0;
                                                    var21_21 = 0.0f;
                                                    var22_22 = null;
                                                    var18_18[0] = var25_25 /* !! */ ;
                                                    var9_9 = hv3_0.L(var10_10, (Object[])var18_18);
                                                    var25_25 /* !! */  = var26_26.getRefundAtDoorstepMessages();
                                                    if (var25_25 /* !! */  == null) ** GOTO lbl-1000
                                                    var25_25 /* !! */  = var26_26.getRefundAtDoorstepMessages();
                                                    var18_18 = "getRefundAtDoorstepMessages(...)";
                                                    Intrinsics.checkNotNullExpressionValue(var25_25 /* !! */ , (String)var18_18);
                                                    var34_34 = var25_25 /* !! */ .isEmpty() ^ var54_54;
                                                    if (var34_34 != 0) {
                                                        var25_25 /* !! */  = var26_26.getRefundAtDoorstepMessages();
                                                        var54_54 = 0;
                                                        var55_55 = 0.0f;
                                                        var25_25 /* !! */  = ((Value)var25_25 /* !! */ .get(0)).getValue();
                                                        var26_26 = var9_9;
                                                        var32_32 /* !! */  = var25_25 /* !! */ ;
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var26_26 = var9_9;
                                                        var32_32 /* !! */  = var17_17;
                                                    }
                                                    break block119;
                                                }
                                                var26_26 = var17_17;
                                                var32_32 /* !! */  = var17_17;
                                            }
                                            var25_25 /* !! */  = hv3_0.K(R$string.return_request_confirmed);
                                            var9_9 = var44_44.getReturnRequestCode();
                                            var10_10 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                                            if (var10_10 != 0) {
                                                var9_9 = var44_44.getExchangeRequestCode();
lbl175:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            var9_9 = var44_44.getReturnRequestCode();
                                            ** continue;
                                            var18_18 = var9_9;
                                            var56_56 = 0;
                                            var28_28 = null;
                                            var20_20 = 0;
                                            var21_21 = 0.0f;
                                            var22_22 = null;
                                            var16_16 = 0;
                                            var47_47 = 0.0f;
                                            var38_38 = null;
                                            var9_9 = this;
                                            var29_29 = var32_32 /* !! */ ;
                                            var9_9 = this.Ua((String)var25_25 /* !! */ , (String)var26_26, (String)var18_18, null, false, false);
                                            var12_12.addView((View)var9_9);
                                            var10_10 = (int)TextUtils.isEmpty((CharSequence)var32_32 /* !! */ );
                                            var25_25 /* !! */  = var32_32 /* !! */ ;
                                            var53_53 = 0;
                                            var32_32 /* !! */  = null;
                                            if (var10_10 == 0) {
                                                var9_9 = var3_3.Va((String)var29_29, null);
                                                var12_12.addView((View)var9_9);
                                            }
                                            if ((var10_10 = (int)TextUtils.isEmpty((CharSequence)(var9_9 = var44_44.getReturnRefundType()))) == 0 && (var10_10 = (int)TextUtils.isEmpty((CharSequence)var25_25 /* !! */ )) == 0) {
                                                var25_25 /* !! */  = var44_44.getReturnRefundType();
                                                var9_9 = var3_3.Va("Mode:", (String)var25_25 /* !! */ );
                                                var12_12.addView((View)var9_9);
                                            }
                                        }
                                        var10_10 = (int)var44_44.getSelfShipReturn();
                                        var38_38 = var44_44;
                                        if (var10_10 != 0) {
                                            var9_9 = var3_3.Sa((ReturnExchange)var44_44);
                                            var12_12.addView((View)var9_9);
                                            var24_24 = true;
                                        }
                                        Intrinsics.checkNotNull(var12_12);
                                        var22_22 = var38_38.getReturnEntries();
                                        Intrinsics.checkNotNullExpressionValue(var22_22, (String)var15_15 /* !! */ );
                                        var57_57 = var22_22.size();
                                        var54_54 = 0;
                                        var55_55 = 0.0f;
                                        var26_26 = null;
                                        while (var54_54 < var57_57) {
                                            block121: {
                                                block126: {
                                                    block123: {
                                                        block122: {
                                                            block125: {
                                                                block124: {
                                                                    block110: {
                                                                        block120: {
                                                                            var9_9 = ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry().getProduct();
                                                                            if (var9_9 != null) break block120;
                                                                            var58_58 = var57_57;
                                                                            var31_31 /* !! */  = var22_22;
                                                                            var44_44 = var38_38;
                                                                            var56_56 = 0;
                                                                            var28_28 = null;
                                                                            var59_59 = var15_15 /* !! */ ;
                                                                            var60_60 = var7_7;
                                                                            var61_61 = var48_48;
                                                                            var30_30 = var11_11;
                                                                            var11_11 = var50_50;
                                                                            var10_10 = 1;
                                                                            var19_19 = 1.4E-45f;
                                                                            var5_5 = var54_54;
                                                                            var48_48 = var14_14;
                                                                            break block121;
                                                                        }
                                                                        var25_25 /* !! */  = var9_9.getName();
                                                                        var28_28 = var9_9.getImages();
                                                                        if (var28_28 != null) {
                                                                            var28_28 = var9_9.getImages();
                                                                            Intrinsics.checkNotNull(var28_28);
                                                                            var28_28 = var28_28.iterator();
                                                                            while ((var58_58 = (int)var28_28.hasNext()) != 0) {
                                                                                var29_29 = (Images)var28_28.next();
                                                                                var32_32 /* !! */  = var29_29.getFormat();
                                                                                var62_62 = var57_57;
                                                                                var30_30 = var11_11;
                                                                                var11_11 = var52_52;
                                                                                var57_57 = 1;
                                                                                var63_63 = 1.4E-45f;
                                                                                var53_53 = (int)kotlin.text.b.i((String)var32_32 /* !! */ , (String)var52_52, (boolean)var57_57);
                                                                                if (var53_53 != 0) {
                                                                                    var32_32 /* !! */  = var29_29.getImageType();
                                                                                    var11_11 = var51_51;
                                                                                    var53_53 = (int)kotlin.text.b.i((String)var32_32 /* !! */ , (String)var51_51, (boolean)var57_57);
                                                                                    if (var53_53 != 0) {
                                                                                        var18_18 = UrlHelper.Companion.getInstance();
                                                                                        var32_32 /* !! */  = var29_29.getUrl();
                                                                                        var18_18 = var18_18.getImageUrl((String)var32_32 /* !! */ );
                                                                                        break block110;
                                                                                    }
                                                                                }
                                                                                var11_11 = var30_30;
                                                                                var57_57 = var62_62;
                                                                                var53_53 = 0;
                                                                                var32_32 /* !! */  = null;
                                                                            }
                                                                        }
                                                                        var62_62 = var57_57;
                                                                        var30_30 = var11_11;
                                                                        var11_11 = var51_51;
                                                                        var57_57 = 0;
                                                                        var63_63 = 0.0f;
                                                                        var18_18 = null;
                                                                    }
                                                                    ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry().getBasePrice().getValue();
                                                                    var32_32 /* !! */  = ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry();
                                                                    var51_51 = var11_11;
                                                                    var11_11 = var50_50;
                                                                    Intrinsics.checkNotNullExpressionValue(var32_32 /* !! */ , (String)var50_50);
                                                                    hc0_2.Qa((ReturnOrderEntry)var32_32 /* !! */ );
                                                                    var32_32 /* !! */  = hc0_2.Ta((Product)var9_9);
                                                                    var56_56 = ((ReturnEntries)var22_22.get(var54_54)).getReturnedQty();
                                                                    var29_29 = ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry().getEntryStatusDisplay();
                                                                    var64_64 = ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry().getEntryStatusDisplay();
                                                                    var9_9 = ((ReturnEntries)var22_22.get(var54_54)).getReturnOrderEntry();
                                                                    var39_39 = var9_9 != null && (var9_9 = var9_9.getProduct()) != null ? (var9_9 = var9_9.getBrandName()) : null;
                                                                    var9_9 = new ArrayList();
                                                                    var41_41 = var22_22;
                                                                    var22_22 = var3_3.j;
                                                                    if (var22_22 != null) {
                                                                        var22_22 = var22_22.getSelectedControllerConfirmedList();
                                                                    } else {
                                                                        var20_20 = 0;
                                                                        var21_21 = 0.0f;
                                                                        var22_22 = null;
                                                                    }
                                                                    var42_42 = 0;
                                                                    var43_43 = 0.0f;
                                                                    var65_65 = 0.0;
                                                                    if (var22_22 == null || (var67_66 = (int)var22_22.isEmpty()) != 0 || (var22_22 = (CartEntry)CollectionsKt.N(var54_54, (List)var22_22)) == null) break block122;
                                                                    var67_66 = var54_54;
                                                                    var26_26 = var22_22.getOrderEntry();
                                                                    var9_9.add(var26_26);
                                                                    var26_26 = var22_22.getOrderEntry();
                                                                    if (var26_26 != null && (var26_26 = var26_26.getTotalPrice()) != null) {
                                                                        var26_26 = var26_26.getValue();
                                                                    } else {
                                                                        var54_54 = 0;
                                                                        var55_55 = 0.0f;
                                                                        var26_26 = null;
                                                                    }
                                                                    if (var26_26 == null || (var54_54 = var26_26.length()) == 0 || (var26_26 = var22_22.getOrderEntry()) == null) break block123;
                                                                    var54_54 = var26_26.getReturnEditedQuantity();
                                                                    var50_50 = var22_22.getOrderEntry();
                                                                    if (var50_50 != null && (var50_50 = var50_50.getTotalPrice()) != null) {
                                                                        var50_50 = var50_50.getValue();
                                                                    } else {
                                                                        var68_67 = 0.0f;
                                                                        var50_50 = null;
                                                                    }
                                                                    Intrinsics.checkNotNull(var50_50);
                                                                    var68_67 = Float.parseFloat((String)var50_50);
                                                                    var59_59 = var22_22.getOrderEntry();
                                                                    var69_68 = var38_38;
                                                                    var38_38 = var59_59.getOrderTotalQuantity();
                                                                    var59_59 = var15_15 /* !! */ ;
                                                                    var15_15 /* !! */  = "getOrderTotalQuantity(...)";
                                                                    Intrinsics.checkNotNullExpressionValue(var38_38, (String)var15_15 /* !! */ );
                                                                    var47_47 = var38_38.floatValue();
                                                                    var68_67 /= var47_47;
                                                                    var47_47 = var54_54;
                                                                    var68_67 = var68_67 * var47_47 + 0.0f;
                                                                    var70_69 = var22_22.getOrderEntry().getBankDiscountPromoAmt();
                                                                    if (var70_69 != null) {
                                                                        var71_70 = var70_69;
                                                                        var60_60 = var22_22.getOrderEntry();
                                                                        var73_71 = var14_14;
                                                                        var14_14 = var60_60.getOrderTotalQuantity();
                                                                        Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15 /* !! */ );
                                                                        var74_72 = var14_14.doubleValue();
                                                                        var71_70 /= var74_72;
                                                                        var60_60 = var7_7;
                                                                        var61_61 = var48_48;
                                                                        var76_73 = var54_54;
                                                                        var65_65 = (var71_70 *= var76_73) + var65_65;
                                                                    } else {
                                                                        var73_71 = var14_14;
                                                                        var60_60 = var7_7;
                                                                        var61_61 = var48_48;
                                                                    }
                                                                    var26_26 = cp_1.Companion;
                                                                    var14_14 = var22_22.getOrderEntry();
                                                                    var26_26.getClass();
                                                                    var54_54 = (int)cp$a.k((CartEntry)var14_14);
                                                                    if (var54_54 == 0) break block124;
                                                                    var26_26 = var22_22.getOrderEntry();
                                                                    if (var26_26 != null && (var26_26 = var26_26.getConvenienceFee()) != null && (var26_26 = var26_26.getRVP()) != null) {
                                                                        var26_26 = var26_26.isFeeCharged();
                                                                        var14_14 = Boolean.TRUE;
                                                                        var54_54 = (int)Intrinsics.areEqual(var26_26, var14_14);
                                                                    } else {
                                                                        var54_54 = 0;
                                                                        var55_55 = 0.0f;
                                                                        var26_26 = null;
                                                                    }
                                                                    if (var54_54 == 0) ** GOTO lbl-1000
                                                                    var26_26 = var22_22.getOrderEntry();
                                                                    if (var26_26 != null && (var26_26 = var26_26.getConvenienceFee()) != null && (var26_26 = var26_26.getRVP()) != null) {
                                                                        var55_55 = var26_26.getNetAmount();
                                                                        var26_26 = Float.valueOf(var55_55);
                                                                    } else {
                                                                        var54_54 = 0;
                                                                        var55_55 = 0.0f;
                                                                        var26_26 = null;
                                                                    }
                                                                    if (var26_26 != null) {
                                                                        var55_55 = var26_26.floatValue();
                                                                        var14_14 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                        Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15 /* !! */ );
                                                                        var78_74 = var14_14.floatValue();
                                                                        var55_55 = var55_55 / var78_74 * var47_47 + 0.0f;
                                                                    } else lbl-1000:
                                                                    // 2 sources

                                                                    {
                                                                        var54_54 = 0;
                                                                        var55_55 = 0.0f;
                                                                        var26_26 = null;
                                                                    }
                                                                    var14_14 = var22_22.getOrderEntry();
                                                                    if (var14_14 != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getCOD()) != null) {
                                                                        var14_14 = var14_14.isFeeCharged();
                                                                        var7_7 = Boolean.TRUE;
                                                                        var79_75 = Intrinsics.areEqual(var14_14, var7_7);
                                                                    } else {
                                                                        var79_75 = false;
                                                                        var78_74 = 0.0f;
                                                                        var14_14 = null;
                                                                    }
                                                                    if (var79_75) {
                                                                        var14_14 = var22_22.getOrderEntry();
                                                                        if (var14_14 != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getCOD()) != null) {
                                                                            var78_74 = var14_14.getNetAmount();
                                                                            var14_14 = Float.valueOf(var78_74);
                                                                        } else {
                                                                            var79_75 = false;
                                                                            var78_74 = 0.0f;
                                                                            var14_14 = null;
                                                                        }
                                                                        if (var14_14 != null) {
                                                                            var78_74 = var14_14.floatValue();
                                                                            var7_7 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var7_7, (String)var15_15 /* !! */ );
                                                                            var6_6 = var7_7.floatValue();
                                                                            var78_74 = var78_74 / var6_6 * var47_47;
                                                                            var55_55 += var78_74;
                                                                        }
                                                                    }
                                                                    if ((var14_14 = var22_22.getOrderEntry()) != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getDelivery()) != null) {
                                                                        var14_14 = var14_14.isFeeCharged();
                                                                        var7_7 = Boolean.TRUE;
                                                                        var79_75 = Intrinsics.areEqual(var14_14, var7_7);
                                                                    } else {
                                                                        var79_75 = false;
                                                                        var78_74 = 0.0f;
                                                                        var14_14 = null;
                                                                    }
                                                                    if (var79_75) {
                                                                        var14_14 = var22_22.getOrderEntry();
                                                                        if (var14_14 != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getDelivery()) != null) {
                                                                            var78_74 = var14_14.getNetAmount();
                                                                            var14_14 = Float.valueOf(var78_74);
                                                                        } else {
                                                                            var79_75 = false;
                                                                            var78_74 = 0.0f;
                                                                            var14_14 = null;
                                                                        }
                                                                        if (var14_14 != null) {
                                                                            var78_74 = var14_14.floatValue();
                                                                            var7_7 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                            Intrinsics.checkNotNullExpressionValue(var7_7, (String)var15_15 /* !! */ );
                                                                            var6_6 = var7_7.floatValue();
                                                                            var78_74 = var78_74 / var6_6 * var47_47;
                                                                            var55_55 += var78_74;
                                                                        }
                                                                    }
                                                                    if (var79_75 = h40_0.P1()) {
                                                                        var14_14 = var22_22.getOrderEntry();
                                                                        if (var14_14 != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getPriorityDelivery()) != null) {
                                                                            var14_14 = var14_14.isFeeCharged();
                                                                            var7_7 = Boolean.TRUE;
                                                                            var79_75 = Intrinsics.areEqual(var14_14, var7_7);
                                                                        } else {
                                                                            var79_75 = false;
                                                                            var78_74 = 0.0f;
                                                                            var14_14 = null;
                                                                        }
                                                                        if (var79_75) {
                                                                            var14_14 = var22_22.getOrderEntry();
                                                                            if (var14_14 != null && (var14_14 = var14_14.getConvenienceFee()) != null && (var14_14 = var14_14.getPriorityDelivery()) != null) {
                                                                                var78_74 = var14_14.getNetAmount();
                                                                                var14_14 = Float.valueOf(var78_74);
                                                                            } else {
                                                                                var79_75 = false;
                                                                                var78_74 = 0.0f;
                                                                                var14_14 = null;
                                                                            }
                                                                            if (var14_14 != null) {
                                                                                var78_74 = var14_14.floatValue();
                                                                                var7_7 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                                Intrinsics.checkNotNullExpressionValue(var7_7, (String)var15_15 /* !! */ );
                                                                                var6_6 = var7_7.floatValue();
                                                                                var78_74 = var78_74 / var6_6 * var47_47;
                                                                                var55_55 += var78_74;
                                                                            }
                                                                        }
                                                                    }
                                                                    break block125;
                                                                }
                                                                var26_26 = var22_22.getOrderEntry().getConvenienceFee();
                                                                if (var26_26 != null && (var26_26 = var26_26.getTotal()) != null) {
                                                                    var55_55 = var26_26.getNetAmount();
                                                                    var14_14 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                    Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15 /* !! */ );
                                                                    var78_74 = var14_14.floatValue();
                                                                    var55_55 = var55_55 / var78_74 * var47_47 + 0.0f;
                                                                } else {
                                                                    var54_54 = 0;
                                                                    var55_55 = 0.0f;
                                                                    var26_26 = null;
                                                                }
                                                            }
                                                            if ((var14_14 = var22_22.getOrderEntry().getConvenienceFee()) != null && (var14_14 = var14_14.getTotal()) != null) {
                                                                var78_74 = var14_14.getNetAmount();
                                                                var22_22 = var22_22.getOrderEntry().getOrderTotalQuantity();
                                                                Intrinsics.checkNotNullExpressionValue(var22_22, (String)var15_15 /* !! */ );
                                                                var21_21 = var22_22.floatValue();
                                                                var78_74 = var78_74 / var21_21 * var47_47;
                                                                var43_43 = var78_74 + 0.0f;
                                                            }
                                                            var21_21 = var43_43;
                                                            var43_43 = var68_67;
                                                            break block126;
                                                        }
                                                        var67_66 = var54_54;
                                                    }
                                                    var69_68 = var38_38;
                                                    var59_59 = var15_15 /* !! */ ;
                                                    var73_71 = var14_14;
                                                    var60_60 = var7_7;
                                                    var61_61 = var48_48;
                                                    var54_54 = 0;
                                                    var55_55 = 0.0f;
                                                    var26_26 = null;
                                                    var20_20 = 0;
                                                    var21_21 = 0.0f;
                                                    var22_22 = null;
                                                }
                                                var38_38 = cp_1.Companion;
                                                var38_38.getClass();
                                                var16_16 = (int)cp$a.u();
                                                if (var16_16 == 0) {
                                                    var43_43 += var21_21;
                                                    var10_10 = (int)cp$a.l((ArrayList)var9_9);
                                                    if (var10_10 != 0) {
                                                        var43_43 -= var55_55;
                                                    }
                                                }
                                                var19_19 = var43_43;
                                                Intrinsics.checkNotNull(Float.valueOf(var43_43));
                                                var80_76 = (double)var43_43 - var65_65;
                                                var19_19 = (float)var80_76;
                                                var26_26 = var3_3.j;
                                                if (var26_26 != null) {
                                                    var54_54 = (int)var26_26.isSelfShip();
                                                    var20_20 = 1;
                                                    var21_21 = 1.4E-45f;
                                                    if (var54_54 == var20_20) {
                                                        cp$a.e().getClass();
                                                        var26_26 = cp_1.B();
                                                        var55_55 = Float.parseFloat((String)var26_26);
                                                        var19_19 += var55_55;
                                                    }
                                                }
                                                var26_26 = new DecimalFormat("#.##");
                                                var22_22 = RoundingMode.DOWN;
                                                var26_26.setRoundingMode((RoundingMode)var22_22);
                                                var9_9 = Float.valueOf(var19_19);
                                                var22_22 = var26_26.format(var9_9).toString();
                                                Intrinsics.checkNotNull(var29_29);
                                                Intrinsics.checkNotNull(var64_64);
                                                var9_9 = this;
                                                var5_5 = var67_66;
                                                var26_26 = var18_18;
                                                var8_8 = var62_62;
                                                var18_18 = var22_22;
                                                var31_31 /* !! */  = var41_41;
                                                var22_22 = var32_32 /* !! */ ;
                                                var14_14 = var69_68;
                                                var16_16 = var56_56;
                                                var56_56 = 0;
                                                var28_28 = null;
                                                var32_32 /* !! */  = var29_29;
                                                var58_58 = var62_62;
                                                var48_48 = var59_59;
                                                var15_15 /* !! */  = var64_64;
                                                var44_44 = var69_68;
                                                var48_48 = var73_71;
                                                var14_14 = var39_39;
                                                var9_9 = this.Ra((String)var25_25 /* !! */ , (String)var26_26, (String)var18_18, (String)var22_22, var16_16, (String)var29_29, (String)var64_64, (String)var39_39);
                                                var12_12.addView((View)var9_9);
                                                var10_10 = 1;
                                                var19_19 = 1.4E-45f;
                                            }
                                            var54_54 = var5_5 + 1;
                                            var14_14 = var48_48;
                                            var50_50 = var11_11;
                                            var53_53 = 0;
                                            var32_32 /* !! */  = null;
                                            var57_57 = var58_58;
                                            var11_11 = var30_30;
                                            var22_22 = var31_31 /* !! */ ;
                                            var38_38 = var44_44;
                                            var15_15 /* !! */  = var59_59;
                                            var7_7 = var60_60;
                                            var48_48 = var61_61;
                                        }
                                        var44_44 = var38_38;
                                        var56_56 = 0;
                                        var28_28 = null;
                                        var59_59 = var15_15 /* !! */ ;
                                        var60_60 = var7_7;
                                        var61_61 = var48_48;
                                        var30_30 = var11_11;
                                        var11_11 = var50_50;
                                        var48_48 = var14_14;
                                        var10_10 = R$string.what_next;
                                        var34_34 = R$string.return_1;
                                        var54_54 = R$drawable.ic_handover_item;
                                        var57_57 = R$drawable.ic_ack_slip;
                                        var20_20 = (int)var38_38.isReturnonHold();
                                        if (var20_20 != 0) {
                                            var10_10 = R$string.what_next;
                                            var34_34 = R$string.return_verification_step_1;
                                            var38_38 = R$string.return_verification_step_2;
                                            var54_54 = R$drawable.ic_ret_verify;
                                            var57_57 = R$drawable.ic_return_verify_nxt_stps;
                                        } else {
                                            var20_20 = (int)var38_38.getSelfShipReturn();
                                            if (var20_20 != 0) {
                                                var34_34 = R$string.packing_self_ship_new;
                                                var38_38 = R$string.ship_the_products;
                                                var54_54 = R$drawable.ic_self_ship_box;
                                                var57_57 = R$drawable.ic_ship_to_address;
                                            } else {
                                                var16_16 = 0;
                                                var38_38 = null;
                                                var47_47 = 0.0f;
                                            }
                                        }
                                        var22_22 = z40_0.Companion;
                                        var32_32 /* !! */  = this.requireActivity().getApplication();
                                        var7_7 = var49_49;
                                        Intrinsics.checkNotNullExpressionValue(var32_32 /* !! */ , (String)var49_49);
                                        var22_22.getClass();
                                        var22_22 = z40$a.a((Context)var32_32 /* !! */ ).a;
                                        var20_20 = (int)var22_22.a((String)var13_13);
                                        if (var20_20 == 0) break block127;
                                        var10_10 = R$string.what_next;
                                        var20_20 = R$string.return_jewel;
                                        var22_22 = var20_20;
                                        var53_53 = R$drawable.ic_exchange_default_icon;
                                        var32_32 /* !! */  = var53_53;
                                        var82_77 = (int)var44_44.isReturnonHold();
                                        if (var82_77 != 0) {
                                            var10_10 = R$string.what_next;
                                            var20_20 = R$string.return_verify_jewel;
                                            var22_22 = var20_20;
lbl612:
                                            // 3 sources

                                            while (true) {
                                                var14_14 = var32_32 /* !! */ ;
                                                break block111;
                                                break;
                                            }
                                        }
                                        var82_77 = var44_44.getSelfShipReturn();
                                        if (var82_77 == 0) ** GOTO lbl612
                                        var20_20 = R$string.self_ship_jewellery;
                                        var22_22 = var20_20;
                                        ** continue;
                                    }
                                    var20_20 = 0;
                                    var22_22 = null;
                                    var21_21 = 0.0f;
                                    var79_75 = false;
                                    var14_14 = null;
                                    var78_74 = 0.0f;
                                }
                                var32_32 /* !! */  = hv3_0.K(var10_10);
                                var15_15 /* !! */  = var3_3.getString(var34_34);
                                if (var38_38 != null) {
                                    var10_10 = var38_38.intValue();
                                    var38_38 = var9_9 = var3_3.getString(var10_10);
                                } else {
                                    var16_16 = 0;
                                    var38_38 = null;
                                    var47_47 = 0.0f;
                                }
                                if (var22_22 != null) {
                                    var10_10 = var22_22.intValue();
                                    var22_22 = var9_9 = var3_3.getString(var10_10);
                                } else {
                                    var20_20 = 0;
                                    var22_22 = null;
                                    var21_21 = 0.0f;
                                }
                                var29_29 = var54_54;
                                var31_31 /* !! */  = var57_57;
                                var36_36 = false;
                                var64_64 = null;
                                var39_39 = null;
                                var9_9 = this;
                                var25_25 /* !! */  = var32_32 /* !! */ ;
                                var26_26 = var15_15 /* !! */ ;
                                var18_18 = var38_38;
                                var16_16 = 0;
                                var38_38 = null;
                                var47_47 = 0.0f;
                                var32_32 /* !! */  = var29_29;
                                var15_15 /* !! */  = var31_31 /* !! */ ;
                                var83_78 = var13_13;
                                var73_71 = var48_48;
                                var48_48 = var2_2 /* !! */ ;
                                var13_13 = null;
                                var9_9 = this.Pa((String)var25_25 /* !! */ , (String)var26_26, (String)var18_18, (String)var22_22, null, (Integer)var29_29, (Integer)var31_31 /* !! */ , (Integer)var14_14, null);
                                var12_12.addView((View)var9_9);
                                break block128;
                            }
                            var48_48 = var2_2 /* !! */ ;
                            var44_44 = var26_26;
                            var45_45 = var18_18;
                            var46_46 = var20_20;
                            var61_61 = var32_32 /* !! */ ;
                            var59_59 = var15_15 /* !! */ ;
                            var73_71 = var14_14;
                            var83_78 = var13_13;
                            var7_7 = var27_27;
                            var51_51 = var29_29;
                            var52_52 = var30_30;
                            var60_60 = var31_31 /* !! */ ;
                            var30_30 = var11_11;
                            var11_11 = var28_28;
                            var56_56 = 0;
                            var28_28 = null;
                            var35_35 = var10_10;
                        }
                        var9_9 = var44_44.getExchangeEntries();
                        if (var9_9 == null) ** GOTO lbl-1000
                        var9_9 = var44_44.getExchangeEntries();
                        var15_15 /* !! */  = "getExchangeEntries(...)";
                        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var15_15 /* !! */ );
                        var10_10 = (int)var9_9.isEmpty();
                        var34_34 = 1;
                        if ((var10_10 ^= var34_34) != 0 && (var10_10 = (int)var44_44.getSelfShipReturn()) == 0) {
                            ++var23_23;
                            var10_10 = R$id.exchange_confirm_layout_exchange;
                            var9_9 = var4_4 /* !! */ .findViewById(var10_10);
                            var13_13 = null;
                            var9_9.setVisibility(0);
                            var26_26 = hv3_0.K(R$string.exchange_request_confirmed);
                            var10_10 = R$string.pickup_by_message;
                            var18_18 = var44_44.getReturnPickupDate();
                            var22_22 = var60_60;
                            var38_38 = var61_61;
                            var18_18 = k7.c((String)var18_18, (String)var61_61, (String)var60_60);
                            var22_22 = new Object[var34_34];
                            var22_22[0] = var18_18;
                            var18_18 = hv3_0.L(var10_10, (Object[])var22_22);
                            var22_22 = var44_44.getExchangeRequestCode();
                            var53_53 = 0;
                            var32_32 /* !! */  = null;
                            var38_38 = null;
                            var79_75 = true;
                            var78_74 = 1.4E-45f;
                            var9_9 = this;
                            var25_25 /* !! */  = var26_26;
                            var26_26 = var18_18;
                            var18_18 = var22_22;
                            var20_20 = 0;
                            var22_22 = null;
                            var21_21 = 0.0f;
                            var16_16 = var79_75;
                            var47_47 = var78_74;
                            var9_9 = this.Ua((String)var25_25 /* !! */ , (String)var26_26, (String)var18_18, null, var79_75, false);
                            var48_48.addView((View)var9_9);
                            var10_10 = (int)var44_44.getSelfShipReturn();
                            if (var10_10 != 0 && !var24_24) {
                                var14_14 = var44_44;
                                var9_9 = var3_3.Sa((ReturnExchange)var44_44);
                                var12_12.addView((View)var9_9);
                            } else {
                                var14_14 = var44_44;
                            }
                            Intrinsics.checkNotNull(var48_48);
                            var32_32 /* !! */  = var14_14.getExchangeEntries();
                            Intrinsics.checkNotNullExpressionValue(var32_32 /* !! */ , (String)var15_15 /* !! */ );
                            var82_77 = var32_32 /* !! */ .size();
                            var16_16 = 0;
                            var47_47 = 0.0f;
                            var38_38 = null;
                            while (var16_16 < var82_77) {
                                block112: {
                                    var9_9 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry().getProduct();
                                    if (var9_9 == null) {
                                        var40_40 = var16_16;
                                        var29_29 = var32_32 /* !! */ ;
                                        var62_62 = var82_77;
                                        var64_64 = var14_14;
                                        var13_13 = var51_51;
lbl745:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var25_25 /* !! */  = var9_9.getName();
                                    var26_26 = var9_9.getImages();
                                    if (var26_26 != null) {
                                        var26_26 = var9_9.getImages();
                                        Intrinsics.checkNotNull(var26_26);
                                        var26_26 = var26_26.iterator();
                                        while ((var57_57 = (int)var26_26.hasNext()) != 0) {
                                            var18_18 = (Images)var26_26.next();
                                            var22_22 = var18_18.getFormat();
                                            var2_2 /* !! */  = var26_26;
                                            var13_13 = var52_52;
                                            var54_54 = 1;
                                            var55_55 = 1.4E-45f;
                                            var20_20 = kotlin.text.b.i((String)var22_22, (String)var52_52, (boolean)var54_54);
                                            if (var20_20 != 0) {
                                                var22_22 = var18_18.getImageType();
                                                var13_13 = var51_51;
                                                var20_20 = kotlin.text.b.i((String)var22_22, (String)var51_51, (boolean)var54_54);
                                                if (var20_20 != 0) {
                                                    var26_26 = UrlHelper.Companion.getInstance();
                                                    var18_18 = var18_18.getUrl();
                                                    var26_26 = var26_26.getImageUrl((String)var18_18);
                                                    break block112;
                                                }
                                            }
                                            var13_13 = null;
                                        }
                                    }
                                    var13_13 = var51_51;
                                    var54_54 = 0;
                                    var26_26 = null;
                                    var55_55 = 0.0f;
                                }
                                var63_63 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry().getBasePrice().getValue();
                                var22_22 = new StringBuilder();
                                var22_22.append(var63_63);
                                var18_18 = var22_22.toString();
                                var22_22 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry();
                                Intrinsics.checkNotNullExpressionValue(var22_22, (String)var11_11);
                                hc0_2.Qa((ReturnOrderEntry)var22_22);
                                var22_22 = hc0_2.Ta(var9_9);
                                var58_58 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnedQty();
                                var31_31 /* !! */  = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry().getEntryStatusDisplay();
                                var64_64 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry().getEntryStatusDisplay();
                                var9_9 = ((ExchangeEntries)var32_32 /* !! */ .get(var16_16)).getReturnOrderEntry();
                                var39_39 = var9_9 != null && (var9_9 = var9_9.getProduct()) != null ? (var9_9 = var9_9.getBrandName()) : null;
                                Intrinsics.checkNotNull(var31_31 /* !! */ );
                                Intrinsics.checkNotNull(var64_64);
                                var9_9 = this;
                                var40_40 = var16_16;
                                var16_16 = var58_58;
                                var29_29 = var32_32 /* !! */ ;
                                var32_32 /* !! */  = var31_31 /* !! */ ;
                                var62_62 = var82_77;
                                var15_15 /* !! */  = var64_64;
                                var64_64 = var14_14;
                                var14_14 = var39_39;
                                var9_9 = this.Ra((String)var25_25 /* !! */ , (String)var26_26, (String)var18_18, (String)var22_22, var58_58, (String)var31_31 /* !! */ , (String)var15_15 /* !! */ , (String)var39_39);
                                var48_48.addView((View)var9_9);
                                ** continue;
                                var10_10 = 1;
                                var19_19 = 1.4E-45f;
                                var16_16 = var40_40 + 1;
                                var51_51 = var13_13;
                                var32_32 /* !! */  = var29_29;
                                var82_77 = var62_62;
                                var14_14 = var64_64;
                                var13_13 = null;
                            }
                            var64_64 = var14_14;
                            var10_10 = R$string.what_next;
                            var34_34 = R$string.exchnage_1;
                            var54_54 = R$string.exchange_2;
                            var38_38 = R$string.exchange_3;
                            var57_57 = R$drawable.ic_handover_item;
                            var20_20 = R$drawable.ic_excess_item;
                            var53_53 = R$drawable.ic_unbox_style;
                            var32_32 /* !! */  = var53_53;
                            var82_77 = (int)var14_14.getSelfShipReturn();
                            if (var82_77 != 0) {
                                var10_10 = R$string.what_next;
                                var34_34 = R$string.return_self_ship_1;
                                var54_54 = R$string.return_self_ship_2;
                                var57_57 = R$drawable.ic_self_ship_box;
                                var20_20 = R$drawable.ic_ship_to_address;
                                var16_16 = 0;
                                var38_38 = null;
                                var47_47 = 0.0f;
                                var79_75 = false;
                                var14_14 = null;
                                var78_74 = 0.0f;
                            } else {
                                var14_14 = var32_32 /* !! */ ;
                            }
                            var32_32 /* !! */  = z40_0.Companion;
                            var15_15 /* !! */  = this.requireActivity().getApplication();
                            Intrinsics.checkNotNullExpressionValue(var15_15 /* !! */ , (String)var7_7);
                            var32_32 /* !! */ .getClass();
                            var32_32 /* !! */  = z40$a.a((Context)var15_15 /* !! */ ).a;
                            var15_15 /* !! */  = var83_78;
                            var53_53 = var32_32 /* !! */ .a((String)var83_78);
                            if (var53_53 != 0) {
                                var10_10 = R$string.what_next;
                                var53_53 = R$string.exchange_4;
                                var32_32 /* !! */  = var53_53;
                                var82_77 = R$drawable.ic_exchange_default_icon;
                                var15_15 /* !! */  = var82_77;
                                var13_13 = var15_15 /* !! */ ;
                            } else {
                                var53_53 = 0;
                                var32_32 /* !! */  = null;
                                var13_13 = null;
                            }
                            var15_15 /* !! */  = hv3_0.K(var10_10);
                            var7_7 = hv3_0.K(var34_34);
                            var11_11 = hv3_0.K(var54_54);
                            if (var38_38 != null) {
                                var10_10 = var38_38.intValue();
                                var38_38 = var9_9 = var3_3.getString(var10_10);
                            } else {
                                var16_16 = 0;
                                var38_38 = null;
                                var47_47 = 0.0f;
                            }
                            if (var32_32 /* !! */  != null) {
                                var10_10 = var32_32 /* !! */ .intValue();
                                var28_28 = var9_9 = var3_3.getString(var10_10);
                            }
                            var32_32 /* !! */  = var57_57;
                            var29_29 = var20_20;
                            var9_9 = this;
                            var25_25 /* !! */  = var15_15 /* !! */ ;
                            var26_26 = var7_7;
                            var18_18 = var11_11;
                            var22_22 = var38_38;
                            var38_38 = var28_28;
                            var15_15 /* !! */  = var29_29;
                            var5_5 = 0;
                            var6_6 = 0.0f;
                            var7_7 = null;
                            var9_9 = this.Pa((String)var25_25 /* !! */ , (String)var26_26, (String)var11_11, (String)var22_22, (String)var28_28, (Integer)var32_32 /* !! */ , (Integer)var29_29, (Integer)var14_14, (Integer)var13_13);
                            var48_48.addView((View)var9_9);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var64_64 = var44_44;
                            var5_5 = 0;
                            var6_6 = 0.0f;
                            var7_7 = null;
                        }
                        var10_10 = (int)var64_64.getSelfShipReturn();
                        var9_9 = var10_10 == 0 ? var64_64.getDeliveryAddress() : var64_64.getWarehouseAddress();
                        if (var9_9 != null) {
                            var25_25 /* !! */  = var9_9.getFirstName();
                            var34_34 = (int)TextUtils.isEmpty((CharSequence)var25_25 /* !! */ );
                            var26_26 = "null";
                            if (var34_34 == 0 && (var34_34 = (int)var26_26.equalsIgnoreCase((String)(var25_25 /* !! */  = var9_9.getFirstName()))) == 0) {
                                var25_25 /* !! */  = var9_9.getFirstName();
                                var18_18 = var45_45;
                                var18_18 = Ft2.a((String)var45_45, (String)var25_25 /* !! */ );
                            } else {
                                var18_18 = var45_45;
                            }
                            var25_25 /* !! */  = var9_9.getLastName();
                            var34_34 = (int)TextUtils.isEmpty((CharSequence)var25_25 /* !! */ );
                            if (var34_34 == 0 && (var34_34 = (int)var26_26.equalsIgnoreCase((String)(var25_25 /* !! */  = var9_9.getLastName()))) == 0) {
                                var25_25 /* !! */  = var9_9.getLastName();
                                var26_26 = " ";
                                var25_25 /* !! */  = n1.a((String)var18_18, (String)var26_26, (String)var25_25 /* !! */ );
                                var18_18 = var25_25 /* !! */ ;
                            }
                            var9_9 = hv3_0.g((CartDeliveryAddress)var9_9);
                            var34_34 = (int)var64_64.getSelfShipReturn();
                            if (var34_34 == 0) {
                                Intrinsics.checkNotNull(var30_30);
                                var34_34 = R$id.tvName;
                                var26_26 = var30_30;
                                var25_25 /* !! */  = var30_30.findViewById(var34_34);
                                var22_22 = "findViewById(...)";
                                Intrinsics.checkNotNullExpressionValue(var25_25 /* !! */ , (String)var22_22);
                                var25_25 /* !! */  = (AjioTextView)var25_25 /* !! */ ;
                                var16_16 = R$id.tvAddress;
                                var38_38 = var30_30.findViewById(var16_16);
                                Intrinsics.checkNotNullExpressionValue(var38_38, (String)var22_22);
                                var38_38 = (AjioTextView)var38_38;
                                var20_20 = (int)TextUtils.isEmpty((CharSequence)var18_18);
                                if (var20_20 != 0) {
                                    var20_20 = 8;
                                    var21_21 = 1.1E-44f;
                                    var25_25 /* !! */ .setVisibility(var20_20);
                                } else {
                                    var20_20 = 8;
                                    var21_21 = 1.1E-44f;
                                    var25_25 /* !! */ .setText((CharSequence)var18_18);
                                }
                                var34_34 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                                if (var34_34 != 0) {
                                    var38_38.setVisibility(var20_20);
                                } else {
                                    var38_38.setText((CharSequence)var9_9);
                                }
                            } else {
                                var26_26 = var30_30;
                                var20_20 = 8;
                                var21_21 = 1.1E-44f;
                                Intrinsics.checkNotNull(var30_30);
                                ai0_2.i((View)var30_30);
                            }
lbl943:
                            // 4 sources

                            while (true) {
                                var10_10 = var35_35;
lbl945:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
                        }
                        var26_26 = var30_30;
                        var18_18 = var45_45;
                        var20_20 = 8;
                        var21_21 = 1.1E-44f;
                        ** continue;
                    }
                    var46_46 = var20_20;
                    var33_33 = var16_16;
                    var59_59 = var15_15 /* !! */ ;
                    var73_71 = var14_14;
                    var48_48 = var13_13;
                    var26_26 = var11_11;
                    var20_20 = 8;
                    var21_21 = 1.1E-44f;
                    ** continue;
                    var34_34 = 1;
                    var16_16 = var46_46 + 1;
                    var11_11 = var26_26;
                    var20_20 = var16_16;
                    var13_13 = var48_48;
                    var16_16 = var33_33;
                    var15_15 /* !! */  = var59_59;
                    var14_14 = var73_71;
                    var8_8 = 1;
                }
                var59_59 = var15_15 /* !! */ ;
                var73_71 = var14_14;
                var20_20 = 8;
                var21_21 = 1.1E-44f;
                break block129;
            }
            var59_59 = var15_15 /* !! */ ;
            var73_71 = var14_14;
            var20_20 = 8;
            var21_21 = 1.1E-44f;
            var4_4 /* !! */ .setVisibility(var20_20);
            var10_10 = 0;
            var19_19 = 0.0f;
            var9_9 = null;
            var23_23 = 0;
        }
        if (var10_10 == 0) {
            var10_10 = R$id.exchange_confirm_layout_return;
            var4_4 /* !! */ .findViewById(var10_10).setVisibility(var20_20);
            var3_3.i = var9_9 = "return";
        }
        if (var23_23 == 0) {
            var10_10 = R$id.exchange_confirm_layout_exchange;
            var4_4 /* !! */ .findViewById(var10_10).setVisibility(var20_20);
            var3_3.i = var9_9 = "exchange";
        }
        var9_9 = new ArrayList();
        var25_25 /* !! */  = var3_3.f;
        if (var25_25 /* !! */  != null) {
            Intrinsics.checkNotNull(var25_25 /* !! */ );
            var25_25 /* !! */  = var25_25 /* !! */ .getResponseDetails();
            if (var25_25 /* !! */  != null) {
                var25_25 /* !! */  = var3_3.f;
                Intrinsics.checkNotNull(var25_25 /* !! */ );
                var25_25 /* !! */  = var25_25 /* !! */ .getResponseDetails();
                var26_26 = var73_71;
                Intrinsics.checkNotNullExpressionValue(var25_25 /* !! */ , (String)var73_71);
                var34_34 = var25_25 /* !! */ .isEmpty();
                var54_54 = 1;
                var55_55 = 1.4E-45f;
                if ((var34_34 ^= var54_54) != 0) {
                    var25_25 /* !! */  = var3_3.f;
                    Intrinsics.checkNotNull(var25_25 /* !! */ );
                    var25_25 /* !! */  = var25_25 /* !! */ .getResponseDetails();
                    var34_34 = var25_25 /* !! */ .size();
                    var21_21 = 0.0f;
                    var22_22 = null;
                    for (var20_20 = 0; var20_20 < var34_34; var20_20 += var82_77) {
                        var26_26 = var3_3.f;
                        Intrinsics.checkNotNull(var26_26);
                        var26_26 = (ReturnExchange)var26_26.getResponseDetails().get(var20_20);
                        if (var26_26 != null && (var18_18 = var26_26.getReturnEntries()) != null) {
                            var18_18 = var26_26.getReturnEntries();
                            var38_38 = var59_59;
                            Intrinsics.checkNotNullExpressionValue(var18_18, (String)var59_59);
                            var57_57 = var18_18.isEmpty();
                            var53_53 = 1;
                            if ((var57_57 ^= var53_53) != 0) {
                                var26_26 = var26_26.getReturnEntries();
                                Intrinsics.checkNotNullExpressionValue(var26_26, (String)var59_59);
                                var57_57 = var26_26.size();
                                var32_32 /* !! */  = null;
                                for (var53_53 = 0; var53_53 < var57_57; var53_53 += var82_77) {
                                    var15_15 /* !! */  = ((ReturnEntries)var26_26.get(var53_53)).getReturnOrderEntry().getProduct();
                                    if (var15_15 /* !! */  == null) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var14_14 = (ReturnEntries)var26_26.get(var53_53);
                                    var79_75 = var14_14.getReturnedQty();
                                    var15_15 /* !! */  = var15_15 /* !! */ .getCode();
                                    ((ReturnEntries)var26_26.get(var53_53)).getReturnOrderEntry().getBasePrice().getValue();
                                    var13_13 = new Bundle();
                                    var4_4 /* !! */  = "item_id";
                                    var13_13.putString((String)var4_4 /* !! */ , (String)var15_15 /* !! */ );
                                    var15_15 /* !! */  = "quantity";
                                    var84_79 = (long)var79_75;
                                    var13_13.putLong((String)var15_15 /* !! */ , var84_79);
                                    var9_9.add(var13_13);
                                    ** continue;
                                    var82_77 = 1;
                                }
                            }
lbl1053:
                            // 4 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var38_38 = var59_59;
                        ** continue;
                        var82_77 = 1;
                        var59_59 = var38_38;
                    }
                }
            }
        }
    }
}

