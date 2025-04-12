/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartSavings;
import com.ril.ajio.services.data.Cart.ServicabilityInfo;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery;
import com.ril.ajio.services.data.Cart.ServicabilityInfo$PriorityDelivery$Fee;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.prioritydelivery.DeliveryTimeData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from LO
 */
public final class lo_0
extends RecyclerView$B
implements View.OnClickListener {
    public final TextView A;
    public CartEntry B;
    public final View C;
    public final TextView D;
    public long E;
    public boolean F;
    public CountDownTimer G;
    public boolean H;
    public final TextView I;
    public final ConstraintLayout J;
    public final TextView K;
    public final TextView L;
    public final CheckBox M;
    public final ImageView N;
    public final ImageView O;
    public final TextView P;
    public final j82_0 a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final AppCompatImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final ConstraintLayout n;
    public final ConstraintLayout o;
    public final View p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final View w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public lo_0(j82_0 object, Context object2, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter(object, "onCartClickListener");
        super(view);
        this.a = object;
        this.H = true;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.offerContainer;
        object = (ConstraintLayout)view.findViewById(n3);
        this.n = object;
        n3 = R$id.offerDivider;
        object = view.findViewById(n3);
        this.p = object;
        n3 = R$id.offerContainerFreebies;
        object = (ConstraintLayout)view.findViewById(n3);
        this.o = object;
        n3 = R$id.productImg;
        object = (ImageView)view.findViewById(n3);
        this.c = object;
        n3 = R$id.exclusiveTag;
        object = (TextView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.productTitle;
        object = (TextView)view.findViewById(n3);
        this.d = object;
        n3 = R$id.removeProduct;
        object = (TextView)view.findViewById(n3);
        this.m = object;
        object2 = "removeImv";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        int n4 = R$string.remove_refresh;
        Object object4 = hv3_0.K(n4);
        object.setText((CharSequence)object4);
        n3 = R$id.lowStockInfo;
        object = (TextView)view.findViewById(n3);
        this.s = object;
        n3 = R$id.savingsTv;
        object = (TextView)view.findViewById(n3);
        this.g = object;
        n3 = R$id.originalPrice;
        object = (TextView)view.findViewById(n3);
        this.i = object;
        n3 = R$id.offerPrice;
        object = (TextView)view.findViewById(n3);
        this.h = object;
        n3 = R$id.sizeContainer;
        object = view.findViewById(n3);
        this.k = object;
        n3 = R$id.sizeInfo;
        object = (TextView)view.findViewById(n3);
        this.j = object;
        n3 = R$id.qtyInfo;
        object = (TextView)view.findViewById(n3);
        this.l = object;
        n3 = R$id.priceDropTV;
        object = (TextView)view.findViewById(n3);
        this.e = object;
        n3 = R$id.priceDropIV;
        object = (AppCompatImageView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.tvStandardDeliveryDate;
        object = (TextView)view.findViewById(n3);
        this.q = object;
        n3 = R$id.discountTv;
        object = (TextView)view.findViewById(n3);
        this.r = object;
        n3 = R$id.brandInfo;
        object = (TextView)view.findViewById(n3);
        this.t = object;
        n3 = R$id.dodCartPrdView;
        object = view.findViewById(n3);
        this.C = object;
        n3 = R$id.dodCartTimerTv;
        object = (TextView)view.findViewById(n3);
        this.D = object;
        n3 = R$id.offerTitle;
        object = (TextView)view.findViewById(n3);
        this.u = object;
        n3 = R$id.offerSubTitle;
        object = (TextView)view.findViewById(n3);
        this.v = object;
        n3 = R$id.qtyContainer;
        object = view.findViewById(n3);
        this.w = object;
        n3 = R$id.moreOffers;
        object = (TextView)view.findViewById(n3);
        this.x = object;
        n3 = R$id.cartS1S2Info;
        object = (TextView)view.findViewById(n3);
        this.y = object;
        n3 = R$id.tvBestPrice;
        object = (TextView)view.findViewById(n3);
        this.z = object;
        n3 = R$id.id_cart_gwp_title;
        object = (TextView)view.findViewById(n3);
        this.A = object;
        n3 = R$id.iv_standard_pd2;
        object = (ImageView)view.findViewById(n3);
        this.O = object;
        n3 = R$id.tvStandardDeliveryDatePd2;
        object = (TextView)view.findViewById(n3);
        this.P = object;
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("offerContainerFreebies");
            n3 = 0;
            object = null;
        }
        object4 = new io_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object4);
        n3 = R$id.priorityDeliveryConstraint;
        object = (ConstraintLayout)view.findViewById(n3);
        this.J = object;
        n3 = R$id.pd_delivery_details;
        object = (TextView)view.findViewById(n3);
        this.K = object;
        n3 = R$id.pd_order_cut_off_time;
        object = (TextView)view.findViewById(n3);
        this.L = object;
        n3 = R$id.pd_checkbox;
        object = (CheckBox)view.findViewById(n3);
        this.M = object;
        n3 = R$id.iv_pd_delivery_alert;
        object = (ImageView)view.findViewById(n3);
        this.N = object;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object4 = this.m) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object4 = null;
            }
            n4 = object4.getPaintFlags() | 8;
            object.setPaintFlags(n4);
        } else {
            object = this.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            if ((object4 = this.m) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object4 = null;
            }
            n4 = object4.getPaintFlags() & 0xFFFFFFF7;
            object.setPaintFlags(n4);
        }
        object = this.M;
        if (object != null) {
            object.setOnClickListener(this);
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productImv");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener(this);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object.setOnClickListener(this);
        object = this.w;
        if (object == null) {
            object = "qtyContainer";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        object3.setOnClickListener(this);
        n3 = R$id.sizeContainer;
        ((LinearLayout)view.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.returnExchangeTv;
        object = (TextView)view.findViewById(n3);
        this.I = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void A() {
        block50: {
            Object object;
            lo_0 lo_02;
            block56: {
                Object object2;
                block65: {
                    String string2;
                    String string3;
                    Object object3;
                    String string4;
                    Object object4;
                    block48: {
                        double d2;
                        String string5;
                        String string6;
                        Object object5;
                        block47: {
                            block63: {
                                double d5;
                                block46: {
                                    block61: {
                                        block60: {
                                            block45: {
                                                block49: {
                                                    String string7;
                                                    String string8;
                                                    Object object6;
                                                    block64: {
                                                        double d7;
                                                        block55: {
                                                            block62: {
                                                                block57: {
                                                                    block58: {
                                                                        block59: {
                                                                            double d9;
                                                                            Object object7;
                                                                            int n3;
                                                                            block52: {
                                                                                String string9;
                                                                                int n4;
                                                                                block54: {
                                                                                    int n7;
                                                                                    block53: {
                                                                                        TextView textView;
                                                                                        block51: {
                                                                                            TextView textView2;
                                                                                            TextView textView3;
                                                                                            lo_02 = this;
                                                                                            object = this.B;
                                                                                            if (object != null && (object = ((CartEntry)object).getServicabilityInfo()) != null) {
                                                                                                object = ((ServicabilityInfo)object).getPriorityDelivery();
                                                                                            } else {
                                                                                                boolean bl2 = false;
                                                                                                object = null;
                                                                                            }
                                                                                            if (object == null) break block49;
                                                                                            object = h40_0.a;
                                                                                            n3 = h40_0.O1();
                                                                                            if (n3 == 0) break block49;
                                                                                            object5 = lo_02.B;
                                                                                            if (object5 == null || (object5 = ((CartEntry)object5).getServicabilityInfo()) == null || (object5 = ((ServicabilityInfo)object5).getPriorityDelivery()) == null) break block50;
                                                                                            ConstraintLayout constraintLayout = lo_02.J;
                                                                                            if (constraintLayout != null) {
                                                                                                ai0_2.B((View)constraintLayout);
                                                                                            }
                                                                                            if ((textView3 = lo_02.L) != null) {
                                                                                                ai0_2.B((View)textView3);
                                                                                            }
                                                                                            n4 = 0;
                                                                                            Object var6_11 = null;
                                                                                            lo_02.w(false);
                                                                                            object4 = lo_02.M;
                                                                                            if (object4 != null) {
                                                                                                boolean bl3 = ((ServicabilityInfo$PriorityDelivery)object5).isApplied();
                                                                                                object4.setChecked(bl3);
                                                                                            }
                                                                                            n7 = ((ServicabilityInfo$PriorityDelivery)object5).isApplicable();
                                                                                            string4 = "toString(...)";
                                                                                            if (n7 != 0) break block51;
                                                                                            object4 = lo_02.M;
                                                                                            if (object4 != null) {
                                                                                                object4.setChecked(false);
                                                                                            }
                                                                                            n4 = 1;
                                                                                            lo_02.w(n4 != 0);
                                                                                            TextView textView4 = lo_02.L;
                                                                                            if (textView4 != null) {
                                                                                                object4 = ((ServicabilityInfo$PriorityDelivery)object5).getErrorMessage();
                                                                                                textView4.setText((CharSequence)object4);
                                                                                            }
                                                                                            if ((textView2 = lo_02.L) != null) {
                                                                                                n7 = hv3_0.m(R$color.light_red);
                                                                                                textView2.setTextColor(n7);
                                                                                            }
                                                                                            break block52;
                                                                                        }
                                                                                        String string10 = ((ServicabilityInfo$PriorityDelivery)object5).getErrorMessage();
                                                                                        if (string10 == null || (n4 = string10.length()) == 0) break block53;
                                                                                        TextView textView5 = lo_02.L;
                                                                                        if (textView5 != null) {
                                                                                            object4 = ((ServicabilityInfo$PriorityDelivery)object5).getErrorMessage();
                                                                                            textView5.setText((CharSequence)object4);
                                                                                        }
                                                                                        if ((textView = lo_02.L) != null) {
                                                                                            n7 = hv3_0.m(R$color.light_red);
                                                                                            textView.setTextColor(n7);
                                                                                        }
                                                                                        break block52;
                                                                                    }
                                                                                    String string11 = ((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime();
                                                                                    if (string11 == null || (n4 = string11.length()) == 0 || (n4 = (int)(((ServicabilityInfo$PriorityDelivery)object5).isApplied() ? 1 : 0)) == 0 || (n4 = (int)(h40_0.Q1() ? 1 : 0)) != 0) break block54;
                                                                                    String string12 = k7.v(((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime());
                                                                                    if (string12 != null && (n4 = string12.length()) != 0) {
                                                                                        TextView textView;
                                                                                        TextView textView6 = lo_02.L;
                                                                                        if (textView6 != null) {
                                                                                            object4 = new StringBuilder("Order within ");
                                                                                            object6 = k7.v(((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime());
                                                                                            ((StringBuilder)object4).append((String)object6);
                                                                                            object4 = ((StringBuilder)object4).toString();
                                                                                            Intrinsics.checkNotNullExpressionValue(object4, string4);
                                                                                            textView6.setText((CharSequence)object4);
                                                                                        }
                                                                                        if ((textView = lo_02.L) != null) {
                                                                                            n7 = hv3_0.m(R$color.color_6d6d6d);
                                                                                            textView.setTextColor(n7);
                                                                                        }
                                                                                        break block52;
                                                                                    } else {
                                                                                        TextView textView = lo_02.L;
                                                                                        if (textView != null) {
                                                                                            ai0_2.i((View)textView);
                                                                                        }
                                                                                    }
                                                                                    break block52;
                                                                                }
                                                                                n4 = h40_0.Q1();
                                                                                if (n4 != 0 && (string9 = ((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime()) != null && (n4 = string9.length()) != 0) {
                                                                                    String string13 = ((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime();
                                                                                    n4 = (int)(k7.y(string13) ? 1 : 0);
                                                                                    if (n4 != 0) {
                                                                                        String string14 = k7.u(((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime());
                                                                                    } else {
                                                                                        String string15 = k7.r(((ServicabilityInfo$PriorityDelivery)object5).getCutoffTime());
                                                                                    }
                                                                                    object4 = lo_02.L;
                                                                                    if (object4 != null) {
                                                                                        TextView textView;
                                                                                        void var6_26;
                                                                                        object3 = "Order by ";
                                                                                        object6 = new StringBuilder((String)object3);
                                                                                        if (var6_26 != null) {
                                                                                            ((StringBuilder)object6).append((String)var6_26);
                                                                                        }
                                                                                        if ((textView = lo_02.L) != null) {
                                                                                            int n8 = hv3_0.m(R$color.black);
                                                                                            textView.setTextColor(n8);
                                                                                        }
                                                                                        String string16 = ((StringBuilder)object6).toString();
                                                                                        Intrinsics.checkNotNullExpressionValue(string16, string4);
                                                                                        object4.setText((CharSequence)string16);
                                                                                    }
                                                                                } else {
                                                                                    TextView textView = lo_02.L;
                                                                                    if (textView != null) {
                                                                                        ai0_2.i((View)textView);
                                                                                    }
                                                                                }
                                                                            }
                                                                            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                                                            ref$ObjectRef.element = object4 = "";
                                                                            boolean bl4 = h40_0.Q1();
                                                                            object3 = "<font color='#008526'>Free</font>";
                                                                            string6 = "</b>";
                                                                            string5 = "<b>";
                                                                            string3 = "Delivery by ";
                                                                            string8 = "EEE";
                                                                            string7 = "yyyy-MM-dd'T'HH:mm:ssZ";
                                                                            object2 = "dateInString";
                                                                            string2 = " for ";
                                                                            if (!bl4) break block55;
                                                                            object6 = ((ServicabilityInfo$PriorityDelivery)object5).getFee();
                                                                            if (object6 == null) break block56;
                                                                            d5 = ((ServicabilityInfo$PriorityDelivery$Fee)object6).getValue();
                                                                            if ((object = ((h40_0)object).d0()) != null) {
                                                                                object6 = lo_02.B;
                                                                                if (object6 != null && (object6 = ((CartEntry)object6).getServicabilityInfo()) != null && (object6 = ((ServicabilityInfo)object6).getPriorityDelivery()) != null) {
                                                                                    object6 = ((ServicabilityInfo$PriorityDelivery)object6).getDeliverySLA();
                                                                                } else {
                                                                                    bl4 = false;
                                                                                    object6 = null;
                                                                                }
                                                                                object = (DeliveryTimeData)object.get(object6);
                                                                            } else {
                                                                                boolean bl5 = false;
                                                                                object = null;
                                                                            }
                                                                            if (object == null) break block57;
                                                                            object5 = lo_02.B;
                                                                            if (object5 != null && (object5 = ((CartEntry)object5).getServicabilityInfo()) != null && (object5 = ((ServicabilityInfo)object5).getPriorityDelivery()) != null) {
                                                                                object7 = object5 = ((ServicabilityInfo$PriorityDelivery)object5).getDeliveryDateTime();
                                                                                d9 = 0.0;
                                                                            } else {
                                                                                d9 = 0.0;
                                                                                object7 = null;
                                                                            }
                                                                            n3 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1);
                                                                            if (n3 <= 0) break block58;
                                                                            object5 = new StringBuilder();
                                                                            bl4 = ((DeliveryTimeData)object).getShowDay();
                                                                            if (!bl4) break block59;
                                                                            object = ((DeliveryTimeData)object).getDisplayName();
                                                                            object6 = String.valueOf(object7);
                                                                            Intrinsics.checkNotNullParameter(object6, (String)object2);
                                                                            int n10 = ((String)object6).length();
                                                                            if (n10 == 0) break block45;
                                                                            try {
                                                                                object3 = Locale.ENGLISH;
                                                                                object2 = new SimpleDateFormat(string7, (Locale)object3);
                                                                                object2 = ((DateFormat)object2).parse((String)object6);
                                                                                object6 = new SimpleDateFormat(string8, (Locale)object3);
                                                                                object4 = ((DateFormat)object6).format((Date)object2);
                                                                                break block45;
                                                                            }
                                                                            catch (Exception exception) {}
                                                                        }
                                                                        object = ((DeliveryTimeData)object).getDisplayName();
                                                                        object2 = new StringBuilder();
                                                                        ((StringBuilder)object2).append((String)object);
                                                                        ((StringBuilder)object2).append(string2);
                                                                        object = ((StringBuilder)object2).toString();
                                                                        ((StringBuilder)object5).append((String)object);
                                                                        break block60;
                                                                    }
                                                                    object2 = new StringBuilder();
                                                                    object = ((DeliveryTimeData)object).getDisplayName();
                                                                    object5 = new StringBuilder();
                                                                    ((StringBuilder)object5).append((String)object);
                                                                    ((StringBuilder)object5).append(string2);
                                                                    object = ((StringBuilder)object5).toString();
                                                                    ((StringBuilder)object2).append((String)object);
                                                                    ((StringBuilder)object2).append((String)object3);
                                                                    object = ((StringBuilder)object2).toString();
                                                                    Intrinsics.checkNotNullExpressionValue(object, string4);
                                                                    break block61;
                                                                }
                                                                double d12 = 0.0;
                                                                double d13 = d5 - d12;
                                                                Object object8 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                                                if (object8 <= 0) break block62;
                                                                object = new StringBuilder();
                                                                if ((object5 = ((ServicabilityInfo$PriorityDelivery)object5).getDeliveryDateTime()) == null) {
                                                                    object5 = object4;
                                                                }
                                                                Intrinsics.checkNotNullParameter(object5, (String)object2);
                                                                int n14 = ((String)object5).length();
                                                                if (n14 == 0) break block46;
                                                                try {
                                                                    object6 = Locale.ENGLISH;
                                                                    object2 = new SimpleDateFormat(string7, (Locale)object6);
                                                                    object2 = ((DateFormat)object2).parse((String)object5);
                                                                    object5 = new SimpleDateFormat(string8, (Locale)object6);
                                                                    object4 = ((DateFormat)object5).format((Date)object2);
                                                                    break block46;
                                                                }
                                                                catch (Exception exception) {}
                                                            }
                                                            object = new StringBuilder();
                                                            object2 = k7.n(((ServicabilityInfo$PriorityDelivery)object5).getDeliveryDate());
                                                            object5 = new StringBuilder(string3);
                                                            ((StringBuilder)object5).append((String)object2);
                                                            ((StringBuilder)object5).append(string2);
                                                            object2 = ((StringBuilder)object5).toString();
                                                            ((StringBuilder)object).append((String)object2);
                                                            ((StringBuilder)object).append((String)object3);
                                                            object = ((StringBuilder)object).toString();
                                                            Intrinsics.checkNotNullExpressionValue(object, string4);
                                                            break block63;
                                                        }
                                                        object = ((ServicabilityInfo$PriorityDelivery)object5).getFee();
                                                        if (object == null) break block56;
                                                        d2 = ((ServicabilityInfo$PriorityDelivery$Fee)object).getValue();
                                                        double d14 = d2 - (d7 = 0.0);
                                                        Object object9 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                                        if (object9 <= 0) break block64;
                                                        object = new StringBuilder();
                                                        if ((object5 = ((ServicabilityInfo$PriorityDelivery)object5).getDeliveryDateTime()) == null) {
                                                            object5 = object4;
                                                        }
                                                        Intrinsics.checkNotNullParameter(object5, (String)object2);
                                                        int n15 = ((String)object5).length();
                                                        if (n15 == 0) break block47;
                                                        try {
                                                            object6 = Locale.ENGLISH;
                                                            object2 = new SimpleDateFormat(string7, (Locale)object6);
                                                            object2 = ((DateFormat)object2).parse((String)object5);
                                                            object5 = new SimpleDateFormat(string8, (Locale)object6);
                                                            object4 = ((DateFormat)object5).format((Date)object2);
                                                            break block47;
                                                        }
                                                        catch (Exception exception) {}
                                                    }
                                                    object = new StringBuilder();
                                                    if ((object5 = ((ServicabilityInfo$PriorityDelivery)object5).getDeliveryDateTime()) == null) {
                                                        object5 = object4;
                                                    }
                                                    Intrinsics.checkNotNullParameter(object5, (String)object2);
                                                    int n16 = ((String)object5).length();
                                                    if (n16 == 0) break block48;
                                                    try {
                                                        object6 = Locale.ENGLISH;
                                                        object2 = new SimpleDateFormat(string7, (Locale)object6);
                                                        object2 = ((DateFormat)object2).parse((String)object5);
                                                        object5 = new SimpleDateFormat(string8, (Locale)object6);
                                                        object4 = ((DateFormat)object5).format((Date)object2);
                                                        break block48;
                                                    }
                                                    catch (Exception exception) {}
                                                }
                                                if ((object = lo_02.J) != null) {
                                                    ai0_2.i((View)object);
                                                }
                                                return;
                                            }
                                            object2 = new StringBuilder();
                                            ((StringBuilder)object2).append((String)object);
                                            ((StringBuilder)object2).append(" ");
                                            ((StringBuilder)object2).append((String)object4);
                                            ((StringBuilder)object2).append(string2);
                                            object = ((StringBuilder)object2).toString();
                                            ((StringBuilder)object5).append((String)object);
                                        }
                                        object = qz2_0.w(d5);
                                        object2 = new StringBuilder(string5);
                                        ((StringBuilder)object2).append((String)object);
                                        ((StringBuilder)object2).append(string6);
                                        object = ((StringBuilder)object2).toString();
                                        ((StringBuilder)object5).append((String)object);
                                        object = ((StringBuilder)object5).toString();
                                        Intrinsics.checkNotNullExpressionValue(object, string4);
                                    }
                                    ref$ObjectRef.element = object;
                                    object2 = lo_02.K;
                                    if (object2 != null) {
                                        object = hv3_0.f((String)object);
                                        object2.setText((CharSequence)object);
                                    }
                                    break block56;
                                }
                                object2 = new StringBuilder(string3);
                                ((StringBuilder)object2).append((String)object4);
                                ((StringBuilder)object2).append(string2);
                                object2 = ((StringBuilder)object2).toString();
                                ((StringBuilder)object).append((String)object2);
                                object2 = qz2_0.w(d5);
                                object5 = new StringBuilder(string5);
                                ((StringBuilder)object5).append((String)object2);
                                ((StringBuilder)object5).append(string6);
                                object2 = ((StringBuilder)object5).toString();
                                ((StringBuilder)object).append((String)object2);
                                object = ((StringBuilder)object).toString();
                                Intrinsics.checkNotNullExpressionValue(object, string4);
                            }
                            ref$ObjectRef.element = object;
                            object2 = lo_02.K;
                            if (object2 != null) {
                                object = hv3_0.f((String)object);
                                object2.setText((CharSequence)object);
                            }
                            break block56;
                        }
                        object2 = new StringBuilder(string3);
                        ((StringBuilder)object2).append((String)object4);
                        ((StringBuilder)object2).append(string2);
                        object2 = ((StringBuilder)object2).toString();
                        ((StringBuilder)object).append((String)object2);
                        object2 = qz2_0.w(d2);
                        object5 = new StringBuilder(string5);
                        ((StringBuilder)object5).append((String)object2);
                        ((StringBuilder)object5).append(string6);
                        object2 = ((StringBuilder)object5).toString();
                        ((StringBuilder)object).append((String)object2);
                        object = ((StringBuilder)object).toString();
                        Intrinsics.checkNotNullExpressionValue(object, string4);
                        break block65;
                    }
                    object2 = new StringBuilder(string3);
                    ((StringBuilder)object2).append((String)object4);
                    ((StringBuilder)object2).append(string2);
                    object2 = ((StringBuilder)object2).toString();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append((String)object3);
                    object = ((StringBuilder)object).toString();
                    Intrinsics.checkNotNullExpressionValue(object, string4);
                }
                ref$ObjectRef.element = object;
                object2 = lo_02.K;
                if (object2 != null) {
                    object = hv3_0.f((String)object);
                    object2.setText((CharSequence)object);
                }
            }
            if ((object = lo_02.N) != null) {
                lp_0.h((ImageView)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = this.B;
        if (object2 == null) {
            return;
        }
        int n3 = object.getId();
        int n4 = R$id.removeProduct;
        String string2 = "sizeValue";
        Object object3 = null;
        j82_0 j82_02 = this.a;
        if (n3 == n4) {
            object = this.B;
            object2 = this.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = ((Object)object3.getText()).toString();
            int n7 = 2;
            j82_02.V0((CartEntry)object, (String)object2, n7);
            return;
        }
        n4 = R$id.sizeContainer;
        String string3 = "bag screen";
        int n8 = 1;
        if (n3 == n4) {
            object = AnalyticsManager.Companion;
            String string4 = "Change Size";
            tj2_0.e((AnalyticsManager$Companion)object, "Change Size Clicked", string4, string3);
            object = this.B;
            object2 = this.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = ((Object)object3.getText()).toString();
            j82_02.V0((CartEntry)object, (String)object2, n8);
            return;
        }
        n4 = R$id.qtyContainer;
        if (n3 == n4) {
            object = this.B;
            Intrinsics.checkNotNull(object);
            n3 = (int)(((CartEntry)object).inventoryQtyUpdateNeeded() ? 1 : 0);
            if (n3 != 0) {
                object = AnalyticsManager.Companion;
                object2 = "Change Quantity Clicked";
                String string5 = "Inventory change";
                tj2_0.e((AnalyticsManager$Companion)object, (String)object2, string5, string3);
            } else {
                Object object4;
                object = this.B;
                Intrinsics.checkNotNull(object);
                object2 = new Bundle();
                object = ((CartEntry)object).getProduct();
                if (object != null) {
                    object4 = ((Product)object).getVerticalColor();
                    object2.putString("Product_Vertical", (String)object4);
                    object4 = ((Product)object).getBrickCategory();
                    object2.putString("Product_Brick", (String)object4);
                    string3 = "productName";
                    object = ((Product)object).getName();
                    object2.putString(string3, (String)object);
                }
                object = AnalyticsManager.Companion.getInstance();
                object4 = ((AnalyticsManager)object).getGtmEvents();
                AnalyticsData analyticsData = ne_0.b((Bundle)object2);
                String string6 = "bag screen";
                String string7 = "Change Quantity Clicked";
                String string8 = "Change quantity";
                int n10 = 16;
                GTMEvents.pushButtonTapEvent$default((GTMEvents)object4, string7, string8, string6, analyticsData, null, n10, null);
            }
            object = this.B;
            if (object != null && (n3 = (int)(((CartEntry)object).isDealEnabled() ? 1 : 0)) == n8) {
                long l2 = Calendar.getInstance(TimeZone.getTimeZone("IST")).getTimeInMillis();
                object = this.B;
                long l3 = 0L;
                long l4 = object != null ? ((CartEntry)object).getActualDealStartTime() : l3;
                long l7 = l2 - l4;
                n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                if (n3 > 0) {
                    object = this.B;
                    if (object != null) {
                        l3 = ((CartEntry)object).getDealEndTime();
                    }
                    if ((n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1))) < 0) {
                        j82_02.qa();
                        return;
                    }
                }
            }
            if ((n3 = (int)(this.H ? 1 : 0)) == 0) {
                object = this.B;
                object2 = "";
                int n14 = 3;
                j82_02.V0((CartEntry)object, (String)object2, n14);
                return;
            }
            object = this.B;
            object2 = this.j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = ((Object)object3.getText()).toString();
            j82_02.V0((CartEntry)object, (String)object2, n8);
            return;
        }
        n4 = R$id.productImg;
        if (n3 == n4) {
            object = this.B;
            Intrinsics.checkNotNull(object);
            object = ((CartEntry)object).getProduct();
            object2 = this.B;
            Intrinsics.checkNotNull(object2);
            object2 = ((CartEntry)object2).getEntryNumber();
            Intrinsics.checkNotNull(object2);
            n4 = (Integer)object2;
            j82_02.n1(n4, (Product)object);
            return;
        }
        n4 = R$id.pd_checkbox;
        if (n3 != n4) return;
        object = this.B;
        object2 = this.M;
        if (object2 != null) {
            n4 = (int)(object2.isChecked() ? 1 : 0);
            object3 = n4 != 0;
        }
        j82_02.u0((CartEntry)object, (Boolean)object3);
    }

    public final void w(boolean bl2) {
        CheckBox checkBox;
        float f5 = 1.0f;
        float f6 = bl2 ? 0.4f : 1.0f;
        cp$a cp$a = cp_1.Companion;
        boolean bl3 = km_1.b(cp$a);
        if (!bl3) {
            f5 = f6;
        }
        TextView textView = this.K;
        if (textView != null) {
            textView.setAlpha(f5);
        }
        if ((textView = this.N) != null) {
            textView.setAlpha(f5);
        }
        if ((textView = this.M) != null) {
            textView.setAlpha(f5);
        }
        if ((checkBox = this.M) != null) {
            checkBox.setClickable(bl2 ^= true);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void x(CartEntry var1_1) {
        block71: {
            block68: {
                block72: {
                    block70: {
                        var2_2 = this;
                        var3_3 /* !! */  = var1_1.getAllPromotionsList();
                        var4_4 = 0;
                        var5_5 = null;
                        if (var3_3 /* !! */  != null) {
                            var6_6 = var3_3 /* !! */ .size();
                        } else {
                            var6_6 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var7_7 = "promotionOfferDivider";
                        var8_8 = "promotionLayout";
                        var9_9 = 8;
                        if (var6_6 <= 0) break block68;
                        var3_3 /* !! */  = var2_2.z;
                        var10_10 = "tvBestPrice";
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                            var6_6 = 0;
                            var3_3 /* !! */  = null;
                        }
                        ai0_2.i((View)var3_3 /* !! */ );
                        var3_3 /* !! */  = var1_1.getAllPromotionsList();
                        Intrinsics.checkNotNullExpressionValue(var3_3 /* !! */ , "getAllPromotionsList(...)");
                        var3_3 /* !! */  = var3_3 /* !! */ .iterator();
                        var11_11 = 0;
                        var12_12 = null;
                        var13_13 = false;
                        var14_14 = null;
                        block0: while (true) {
                            var15_15 = 0;
                            var16_16 = null;
                            while (true) {
                                block69: {
                                    var17_17 = var3_3 /* !! */ .hasNext();
                                    var18_18 = "offerTitle";
                                    var19_19 = "";
                                    var20_20 = "offerSubTitle";
                                    var21_21 = 1;
                                    if (var17_17 == 0) break block0;
                                    var22_22 = (CartPromotion)var3_3 /* !! */ .next();
                                    var23_23 = var22_22.isCouponCode();
                                    var24_24 = " ";
                                    if (!var23_23 || var11_11 != 0) break block69;
                                    var25_26 = var22_22.isApplied();
                                    if (!var25_26) continue;
                                    var12_12 = var22_22.getDescription();
                                    var25_26 = TextUtils.isEmpty((CharSequence)var12_12);
                                    if (var25_26) {
                                        var12_12 = var22_22.getPromotion();
                                        if (var12_12 != null) {
                                            var12_12 = var12_12.getCode();
                                        } else {
                                            var11_11 = 0;
                                            var12_12 = null;
                                        }
                                        if (var12_12 != null && (var11_11 = var12_12.length()) != 0) {
                                            var12_12 = var22_22.getPromotion();
                                            if (var12_12 != null) {
                                                var12_12 = var12_12.getCode();
                                            } else {
                                                var11_11 = 0;
                                                var12_12 = null;
                                            }
                                        } else {
                                            var12_12 = var19_19;
                                        }
                                    }
                                    if ((var17_17 = var22_22.isCouponCode()) == 0 || (var22_22 = var1_1.getVoucherMessages()) == null || (var17_17 = var22_22.length()) == 0) ** GOTO lbl-1000
                                    var22_22 = var1_1.getVoucherMessages();
                                    Intrinsics.checkNotNullExpressionValue(var22_22, "getVoucherMessages(...)");
                                    var20_20 = Locale.ROOT;
                                    var22_22 = var22_22.toLowerCase((Locale)var20_20);
                                    Intrinsics.checkNotNullExpressionValue(var22_22, "toLowerCase(...)");
                                    var20_20 = "best price";
                                    var17_17 = (int)StringsKt.F((CharSequence)var22_22, (CharSequence)var20_20, false);
                                    if (var17_17 != 0) {
                                        var17_17 = R$string.Product_at_best_price;
                                        var22_22 = hv3_0.K(var17_17);
                                        var24_24 = kp1_0.c((String)var24_24, (String)var22_22);
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var17_17 = R$string.applied;
                                        var22_22 = hv3_0.K(var17_17);
                                        var24_24 = kp1_0.c((String)var24_24, (String)var22_22);
                                    }
                                    var24_24 = Ft2.a((String)var12_12, (String)var24_24);
                                    var12_12 = var2_2.u;
                                    if (var12_12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                        var11_11 = 0;
                                        var12_12 = null;
                                    }
                                    if ((var17_17 = (int)TextUtils.isEmpty((CharSequence)var24_24)) == 0) {
                                        var19_19 = var24_24;
                                    }
                                    var12_12.setText((CharSequence)var19_19);
                                    var11_11 = 1;
                                    continue;
                                }
                                var26_27 = var22_22.isApplied();
                                if (var26_27 && !var13_13) {
                                    var14_14 = var22_22.getDescription();
                                    var15_15 = R$string.applied;
                                    var16_16 = hv3_0.K(var15_15);
                                    var24_24 = n1.a((String)var14_14, (String)var24_24, var16_16);
                                    var14_14 = var2_2.v;
                                    if (var14_14 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                                        var13_13 = false;
                                        var14_14 = null;
                                    }
                                    var14_14.setText((CharSequence)var24_24);
                                    var24_24 = var1_1.getMultiItemPromoAmt();
                                    var27_28 = mz3_0.J((String)var24_24);
                                    var13_13 = false;
                                    var14_14 = null;
                                    cfr_temp_0 = var27_28 - 0.0f;
                                    var28_30 = (int)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1));
                                    if (var28_30 == 0) {
                                        var24_24 = var22_22.getPromotion();
                                        if (var24_24 != null) {
                                            var24_24 = var24_24.getDescription();
                                        } else {
                                            var28_30 = 0;
                                            var27_28 = 0.0f;
                                            var24_24 = null;
                                        }
                                        if (var24_24 != null && (var28_30 = var24_24.length()) != 0) {
                                            var24_24 = var2_2.z;
                                            if (var24_24 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                                var28_30 = 0;
                                                var27_28 = 0.0f;
                                                var24_24 = null;
                                            }
                                            if ((var14_14 = var22_22.getPromotion()) != null) {
                                                var14_14 = var14_14.getDescription();
                                            } else {
                                                var13_13 = false;
                                                var14_14 = null;
                                            }
                                            var24_24.setText((CharSequence)var14_14);
                                        }
                                        if ((var24_24 = var2_2.z) == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                            var28_30 = 0;
                                            var27_28 = 0.0f;
                                            var24_24 = null;
                                        }
                                        ai0_2.B((View)var24_24);
                                    } else {
                                        var24_24 = var2_2.z;
                                        if (var24_24 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(var10_10);
                                            var28_30 = 0;
                                            var27_28 = 0.0f;
                                            var24_24 = null;
                                        }
                                        ai0_2.i((View)var24_24);
                                    }
                                    var13_13 = true;
                                    continue block0;
                                }
                                var24_24 = var22_22.getDescription();
                                if (var24_24 == null || (var28_30 = var24_24.length()) == 0 || var13_13) continue;
                                var24_24 = var2_2.v;
                                if (var24_24 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                                    var28_30 = 0;
                                    var27_28 = 0.0f;
                                    var24_24 = null;
                                }
                                var16_16 = var22_22.getDescription();
                                var24_24.setText((CharSequence)var16_16);
                                var15_15 = 1;
                            }
                            break;
                        }
                        if (var11_11 != 0) {
                            var3_3 /* !! */  = var2_2.u;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                var6_6 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(0);
                        } else {
                            var3_3 /* !! */  = var2_2.u;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(var18_18);
                                var6_6 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(var9_9);
                        }
                        if (!var13_13 && var15_15 == 0) {
                            var3_3 /* !! */  = var2_2.v;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                                var6_6 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(var9_9);
                        } else {
                            var3_3 /* !! */  = var2_2.v;
                            if (var3_3 /* !! */  == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)var20_20);
                                var6_6 = 0;
                                var3_3 /* !! */  = null;
                            }
                            var3_3 /* !! */ .setVisibility(0);
                        }
                        if (var13_13 || var11_11 != 0 || var15_15 != 0) break block70;
                        var3_3 /* !! */  = var2_2.n;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                            var6_6 = 0;
                            var3_3 /* !! */  = null;
                        }
                        var3_3 /* !! */ .setVisibility(var9_9);
                        var3_3 /* !! */  = var2_2.p;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var28_30 = 0;
                            var27_28 = 0.0f;
                            var24_24 = null;
                        } else {
                            var24_24 = var3_3 /* !! */ ;
                        }
                        var24_24.setVisibility(var9_9);
                        break block71;
                    }
                    var3_3 /* !! */  = var2_2.n;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setVisibility(0);
                    var3_3 /* !! */  = var2_2.p;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setVisibility(0);
                    var3_3 /* !! */  = var1_1.getAllPromotionsList();
                    var6_6 = var3_3 /* !! */ .size();
                    var7_7 = "moreOfferLbl";
                    if (var6_6 <= var21_21) break block72;
                    var3_3 /* !! */  = var2_2.x;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setVisibility(0);
                    var3_3 /* !! */  = var2_2.x;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var4_4 = R$string.more_offers_refresh;
                    var5_5 = hv3_0.K(var4_4);
                    var3_3 /* !! */ .setText((CharSequence)var5_5);
                    var3_3 /* !! */  = var2_2.x;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var8_8 = var1_1;
                    var5_5 = new jo_0(var2_2, var1_1);
                    var3_3 /* !! */ .setOnClickListener((View.OnClickListener)var5_5);
                    var6_6 = (int)og1_1.b();
                    if (var6_6 != 0) {
                        var3_3 /* !! */  = var2_2.x;
                        if (var3_3 /* !! */  == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var6_6 = 0;
                            var3_3 /* !! */  = null;
                        }
                        if ((var5_5 = var2_2.x) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var28_30 = 0;
                            var27_28 = 0.0f;
                            var24_24 = null;
                        } else {
                            var24_24 = var5_5;
                        }
                        var4_4 = var24_24.getPaintFlags() | var9_9;
                        var3_3 /* !! */ .setPaintFlags(var4_4);
                    }
                    break block71;
                }
                var8_8 = var1_1;
                var3_3 /* !! */  = var1_1.getAllPromotionsList();
                var6_6 = var3_3 /* !! */ .size();
                if (var6_6 != var21_21 || var15_15 == 0) ** GOTO lbl-1000
                var3_3 /* !! */  = (CartPromotion)var1_1.getAllPromotionsList().get(0);
                if (var3_3 /* !! */  != null && (var3_3 /* !! */  = var3_3 /* !! */ .getPromotion()) != null) {
                    var3_3 /* !! */  = var3_3 /* !! */ .getDetailsURL();
                } else {
                    var6_6 = 0;
                    var3_3 /* !! */  = null;
                }
                if (var3_3 /* !! */  != null && (var6_6 = var3_3 /* !! */ .length()) != 0) {
                    var3_3 /* !! */  = var2_2.x;
                    if (var3_3 /* !! */  == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var6_6 = 0;
                        var3_3 /* !! */  = null;
                    }
                    var3_3 /* !! */ .setVisibility(0);
                    var3_3 /* !! */  = (CartPromotion)var1_1.getAllPromotionsList().get(0);
                    if (var3_3 /* !! */  != null) {
                        var5_5 = var3_3 /* !! */ .getPromotion();
                    } else {
                        var4_4 = 0;
                        var5_5 = null;
                    }
                    if (var5_5 != null) {
                        var5_5 = var3_3 /* !! */ .getPromotion();
                        var19_19 = var5_5.getPromotionType();
                    }
                    if ((var4_4 = (int)TextUtils.isEmpty((CharSequence)var19_19)) == 0) {
                        var5_5 = var2_2.x;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var4_4 = 0;
                            var5_5 = null;
                        }
                        var29_32 = R$string.add_product;
                        var8_8 = hv3_0.K(var29_32);
                        var5_5.setText((CharSequence)var8_8);
                    } else {
                        var5_5 = var2_2.x;
                        if (var5_5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                            var4_4 = 0;
                            var5_5 = null;
                        }
                        var29_33 = R$string.view_product;
                        var8_8 = hv3_0.K(var29_33);
                        var5_5.setText((CharSequence)var8_8);
                    }
                    var5_5 = var2_2.x;
                    if (var5_5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var28_30 = 0;
                        var27_28 = 0.0f;
                        var24_24 = null;
                    } else {
                        var24_24 = var5_5;
                    }
                    var7_7 = null;
                    var5_5 = new ko_1(0, var2_2, var3_3 /* !! */ );
                    var24_24.setOnClickListener((View.OnClickListener)var5_5);
                } else lbl-1000:
                // 2 sources

                {
                    if ((var3_3 /* !! */  = var2_2.x) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                        var28_30 = 0;
                        var27_28 = 0.0f;
                        var24_24 = null;
                    } else {
                        var24_24 = var3_3 /* !! */ ;
                    }
                    var24_24.setVisibility(var9_9);
                }
                break block71;
            }
            var3_3 /* !! */  = var2_2.n;
            if (var3_3 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var8_8);
                var6_6 = 0;
                var3_3 /* !! */  = null;
            }
            var3_3 /* !! */ .setVisibility(var9_9);
            var3_3 /* !! */  = var2_2.p;
            if (var3_3 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var7_7);
                var28_31 = false;
                var27_29 = 0.0f;
                var24_25 = null;
            } else {
                var24_25 = var3_3 /* !! */ ;
            }
            var24_25.setVisibility(var9_9);
        }
    }

    public final void y(boolean bl2) {
        boolean bl3 = og1_1.b();
        if (!bl3) {
            bl3 = false;
            ConstraintLayout constraintLayout = null;
            String string2 = "promotionLayout";
            if (bl2) {
                ConstraintLayout constraintLayout2 = this.n;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    constraintLayout = constraintLayout2;
                }
                int n3 = R$drawable.cart_offer_gradient_dod_refresh;
                constraintLayout2 = hv3_0.r(n3);
                constraintLayout.setBackground((Drawable)constraintLayout2);
            } else {
                ConstraintLayout constraintLayout3 = this.n;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    constraintLayout = constraintLayout3;
                }
                int n4 = R$drawable.cart_offer_gradient_refresh;
                constraintLayout3 = hv3_0.r(n4);
                constraintLayout.setBackground((Drawable)constraintLayout3);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void z(int var1_1, Product var2_2) {
        var3_3 = this;
        var4_4 = this.r;
        var5_5 = this.h;
        var6_6 = this.I;
        var7_7 = this.f;
        var8_8 /* !! */  = this.e;
        var9_9 = this.i;
        var10_10 = this.g;
        var11_11 = this.B;
        if (var11_11 != null) {
            var11_11 = var11_11.getQuantity();
        } else {
            var12_12 = false;
            var13_13 = 0.0f;
            var11_11 = null;
        }
        var14_14 = 0;
        var15_15 = null;
        if (var11_11 == null) ** GOTO lbl-1000
        var11_11 = var3_3.B;
        if (var11_11 != null) {
            var11_11 = var11_11.getProduct();
        } else {
            var12_12 = false;
            var13_13 = 0.0f;
            var11_11 = null;
        }
        if (var11_11 == null) ** GOTO lbl-1000
        var11_11 = var3_3.B;
        if (var11_11 != null && (var11_11 = var11_11.getProduct()) != null) {
            var11_11 = var11_11.getWasPriceData();
        } else {
            var12_12 = false;
            var13_13 = 0.0f;
            var11_11 = null;
        }
        if (var11_11 == null) ** GOTO lbl-1000
        var11_11 = var3_3.B;
        if (var11_11 != null && (var11_11 = var11_11.getBasePrice()) != null) {
            var11_11 = var11_11.getValue();
        } else {
            var12_12 = false;
            var13_13 = 0.0f;
            var11_11 = null;
        }
        var12_12 = TextUtils.isEmpty((CharSequence)var11_11);
        if (!var12_12) {
            var11_11 = var3_3.B;
            if (var11_11 != null && (var11_11 = var11_11.getTotalBasePrice()) != null && (var11_11 = var11_11.getValue()) != null) {
                var13_13 = var11_11.floatValue();
            } else {
                var11_11 = var3_3.B;
                if (var11_11 != null && (var11_11 = var11_11.getProduct()) != null && (var11_11 = var11_11.getWasPriceData()) != null) {
                    var11_11 = var11_11.getValue();
                } else {
                    var12_12 = false;
                    var13_13 = 0.0f;
                    var11_11 = null;
                }
                var13_13 = mz3_0.J((String)var11_11);
                var16_16 /* !! */  = var3_3.B;
                if (var16_16 /* !! */  != null) {
                    var16_16 /* !! */  = var16_16 /* !! */ .getQuantity();
                } else {
                    var17_17 = 0;
                    var18_18 = 0.0f;
                    var16_16 /* !! */  = null;
                }
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var17_17 = var16_16 /* !! */ .intValue();
                var18_18 = var17_17;
                var13_13 *= var18_18;
            }
            var16_16 /* !! */  = h40_0.a;
            var17_17 = h40_0.l();
            if (var17_17 != 0) {
                var16_16 /* !! */  = var3_3.B;
                if (var16_16 /* !! */  != null && (var16_16 /* !! */  = var16_16 /* !! */ .getBasePrice()) != null) {
                    var16_16 /* !! */  = var16_16 /* !! */ .getValue();
                } else {
                    var17_17 = 0;
                    var18_18 = 0.0f;
                    var16_16 /* !! */  = null;
                }
                var18_18 = mz3_0.J((String)var16_16 /* !! */ );
                var19_19 = var3_3.B;
                if (var19_19 != null) {
                    var19_19 = var19_19.getQuantity();
                } else {
                    var20_20 = 0;
                    var21_21 = 0.0f;
                    var19_19 = null;
                }
                Intrinsics.checkNotNull(var19_19);
                var20_20 = var19_19.intValue();
                var21_21 = var20_20;
                var17_17 = ok1_1.b(var18_18 * var21_21);
                var18_18 = var17_17;
            } else {
                var16_16 /* !! */  = var3_3.B;
                if (var16_16 /* !! */  != null && (var16_16 /* !! */  = var16_16 /* !! */ .getBasePrice()) != null) {
                    var16_16 /* !! */  = var16_16 /* !! */ .getValue();
                } else {
                    var17_17 = 0;
                    var18_18 = 0.0f;
                    var16_16 /* !! */  = null;
                }
                var18_18 = mz3_0.J((String)var16_16 /* !! */ );
                var19_19 = var3_3.B;
                if (var19_19 != null) {
                    var19_19 = var19_19.getQuantity();
                } else {
                    var20_20 = 0;
                    var21_21 = 0.0f;
                    var19_19 = null;
                }
                Intrinsics.checkNotNull(var19_19);
                var20_20 = var19_19.intValue();
                var21_21 = var20_20;
                var18_18 *= var21_21;
            }
            var21_21 = var13_13 - var18_18;
        } else lbl-1000:
        // 4 sources

        {
            var12_12 = false;
            var13_13 = 0.0f;
            var11_11 = null;
            var17_17 = 0;
            var18_18 = 0.0f;
            var16_16 /* !! */  = null;
            var20_20 = 0;
            var21_21 = 0.0f;
            var19_19 = null;
        }
        var22_22 = var3_3.B;
        if (var22_22 != null) {
            var22_22 = var22_22.getVoucherPromoAmt();
        } else {
            var23_23 = 0;
            var24_24 = 0.0f;
            var22_22 = null;
        }
        var23_23 = TextUtils.isEmpty((CharSequence)var22_22);
        if (var23_23 == 0) {
            var22_22 = h40_0.a;
            var23_23 = h40_0.l();
            if (var23_23 != 0) {
                var22_22 = var3_3.B;
                if (var22_22 != null) {
                    var22_22 = var22_22.getVoucherPromoAmt();
                } else {
                    var23_23 = 0;
                    var24_24 = 0.0f;
                    var22_22 = null;
                }
                var23_23 = ok1_1.b(mz3_0.J((String)var22_22));
                var24_24 = var23_23;
            } else {
                var22_22 = var3_3.B;
                if (var22_22 != null) {
                    var22_22 = var22_22.getVoucherPromoAmt();
                } else {
                    var23_23 = 0;
                    var24_24 = 0.0f;
                    var22_22 = null;
                }
                var24_24 = mz3_0.J((String)var22_22);
            }
        } else {
            var23_23 = 0;
            var24_24 = 0.0f;
            var22_22 = null;
        }
        var25_25 /* !! */  = var3_3.B;
        if (var25_25 /* !! */  != null) {
            var25_25 /* !! */  = var25_25 /* !! */ .getMultiItemPromoAmt();
        } else {
            var26_26 = 0;
            var27_27 = 0.0f;
            var25_25 /* !! */  = null;
        }
        var26_26 = TextUtils.isEmpty((CharSequence)var25_25 /* !! */ );
        if (var26_26 == 0) {
            var25_25 /* !! */  = h40_0.a;
            var26_26 = h40_0.l();
            if (var26_26 != 0) {
                var25_25 /* !! */  = var3_3.B;
                if (var25_25 /* !! */  != null) {
                    var25_25 /* !! */  = var25_25 /* !! */ .getMultiItemPromoAmt();
                } else {
                    var26_26 = 0;
                    var27_27 = 0.0f;
                    var25_25 /* !! */  = null;
                }
                var26_26 = ok1_1.b(mz3_0.J((String)var25_25 /* !! */ ));
                var27_27 = var26_26;
            } else {
                var25_25 /* !! */  = var3_3.B;
                if (var25_25 /* !! */  != null) {
                    var25_25 /* !! */  = var25_25 /* !! */ .getMultiItemPromoAmt();
                } else {
                    var26_26 = 0;
                    var27_27 = 0.0f;
                    var25_25 /* !! */  = null;
                }
                var27_27 = mz3_0.J((String)var25_25 /* !! */ );
            }
        } else {
            var26_26 = 0;
            var27_27 = 0.0f;
            var25_25 /* !! */  = null;
        }
        var28_28 = var3_3.B;
        var29_29 = var28_28 != null && (var28_28 = var28_28.getNetPrice()) != null && (var28_28 = var28_28.getValue()) != null ? var28_28.floatValue() : var18_18 - var24_24 - var27_27;
        var30_30 = "offerPriceTv";
        cfr_temp_0 = var29_29 - 0.0f;
        var31_31 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        if (var31_31 <= 0) {
            if (var5_5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var30_30);
                var32_32 = 0;
                var33_33 = null;
            } else {
                var33_33 = var5_5;
            }
            var31_31 = R$string.free;
            var15_15 = hv3_0.K((int)var31_31);
            var33_33.setText(var15_15);
lbl204:
            // 2 sources

            while (true) {
                continue;
                break;
            }
        }
        var33_33 = h40_0.a;
        var32_32 = h40_0.l();
        if (var32_32 != 0) {
            var32_32 = ok1_1.b(var29_29);
            var33_33 = qz2_0.v(var32_32);
        } else {
            var33_33 = qz2_0.u(var29_29);
        }
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var30_30);
            var14_14 = 0;
            var15_15 = null;
        } else {
            var15_15 = var5_5;
        }
        var15_15.setText((CharSequence)var33_33);
        ** while (true)
        var32_32 = 0;
        var33_33 = null;
        cfr_temp_1 = var13_13 - 0.0f;
        var14_14 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
        if (var14_14 == 0) {
            return;
        }
        var33_33 = var3_3.B;
        if (var33_33 != null) {
            var32_32 = var33_33.getPriceDrop();
        } else {
            var32_32 = 0;
            var33_33 = null;
        }
        var15_15 = "priceDropIv";
        var34_34 = "priceDropTv";
        var35_35 = var21_21;
        if (var32_32 > 0) {
            if (var8_8 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var34_34);
                var32_32 = 0;
                var33_33 = null;
lbl241:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var33_33 = var8_8 /* !! */ ;
            ** continue;
            var20_20 = 0;
            var21_21 = 0.0f;
            var19_19 = null;
            var33_33.setVisibility(0);
            if (var7_7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                var32_32 = 0;
                var33_33 = null;
            } else {
                var33_33 = var7_7;
            }
            var33_33.setVisibility(0);
            if (var8_8 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException(var34_34);
                var36_36 = 0;
                var8_8 /* !! */  = null;
            }
            var32_32 = R$string.price_drop_formatted;
            var19_19 = var3_3.B;
            Intrinsics.checkNotNull(var19_19);
            var20_20 = var19_19.getPriceDrop();
            var19_19 = Integer.valueOf(var20_20);
            var37_37 = var10_10;
            var38_38 = var18_18;
            var10_10 = new Object[1];
            var17_17 = 0;
            var18_18 = 0.0f;
            var16_16 /* !! */  = null;
            var10_10[0] = var19_19;
            var10_10 = hv3_0.L(var32_32, (Object[])var10_10);
            var8_8 /* !! */ .setText((CharSequence)var10_10);
            if (var7_7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                var39_39 = 0;
                var40_40 = 0.0f;
                var7_7 = null;
            }
            var36_36 = R$drawable.ic_price_drop_16dp;
            var7_7.setImageResource(var36_36);
            var41_41 = var27_27;
        } else {
            var37_37 = var10_10;
            var38_38 = var18_18;
            var10_10 = var3_3.B;
            if (var10_10 != null) {
                var42_42 = var10_10.getPriceIncrease();
            } else {
                var42_42 = false;
                var43_43 = 0.0f;
                var10_10 = null;
            }
            if (var42_42 > false) {
                if (var8_8 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var34_34);
                    var42_42 = false;
                    var43_43 = 0.0f;
                    var10_10 = null;
lbl298:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var10_10 = var8_8 /* !! */ ;
                ** continue;
                var32_32 = 0;
                var33_33 = null;
                var10_10.setVisibility(0);
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                    var42_42 = false;
                    var43_43 = 0.0f;
                    var10_10 = null;
                } else {
                    var10_10 = var7_7;
                }
                var10_10.setVisibility(0);
                if (var8_8 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var34_34);
                    var36_36 = 0;
                    var8_8 /* !! */  = null;
                }
                var42_42 = R$string.price_increase_formatted;
                var16_16 /* !! */  = var3_3.B;
                Intrinsics.checkNotNull(var16_16 /* !! */ );
                var17_17 = var16_16 /* !! */ .getPriceIncrease();
                var16_16 /* !! */  = var17_17;
                var41_41 = var27_27;
                var20_20 = 1;
                var21_21 = 1.4E-45f;
                var25_25 /* !! */  = new Object[var20_20];
                var25_25 /* !! */ [0] = var16_16 /* !! */ ;
                var10_10 = hv3_0.L((int)var42_42, var25_25 /* !! */ );
                var8_8 /* !! */ .setText((CharSequence)var10_10);
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                    var39_39 = 0;
                    var40_40 = 0.0f;
                    var7_7 = null;
                }
                var36_36 = R$drawable.ic_price_increase_16dp;
                var7_7.setImageResource(var36_36);
            } else {
                var41_41 = var27_27;
                if (var8_8 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var34_34);
                    var36_36 = 0;
                    var8_8 /* !! */  = null;
                }
                var42_42 = 8 != 0;
                var43_43 = 1.1E-44f;
                var8_8 /* !! */ .setVisibility((int)var42_42);
                if (var7_7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var15_15);
                    var39_39 = 0;
                    var40_40 = 0.0f;
                    var7_7 = null;
                }
                var7_7.setVisibility((int)var42_42);
            }
        }
        var7_7 = var3_3.B;
        var36_36 = 100;
        if (var7_7 != null && (var7_7 = var7_7.getTotalDiscountPercentage()) != null) {
            var40_40 = var7_7.floatValue();
            var39_39 = ok1_1.b(var40_40);
        } else {
            var40_40 = var36_36;
            var42_42 = 1120403456 != 0;
            var43_43 = 100.0f * var29_29 / var13_13;
            var39_39 = ok1_1.b(var40_40 -= var43_43);
        }
        var10_10 = "discountTv";
        var33_33 = "originalPriceTv";
        if (var39_39 <= 0) {
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var44_44 = 0;
                var45_45 = 0.0f;
                var9_9 = null;
            }
            var32_32 = 8;
            var9_9.setVisibility(var32_32);
            if (var4_4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                var46_46 = 0;
                var4_4 = null;
            }
            var4_4.setVisibility(var32_32);
        } else {
            if (var39_39 > 0) {
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var26_26 = 0;
                    var27_27 = 0.0f;
                    var25_25 /* !! */  = null;
                } else {
                    var25_25 /* !! */  = var4_4;
                }
                var15_15 = new StringBuilder("(");
                var15_15.append(var39_39);
                var16_16 /* !! */  = "%)";
                var15_15.append((String)var16_16 /* !! */ );
                var15_15 = var15_15.toString();
                var25_25 /* !! */ .setText(var15_15);
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var46_46 = 0;
                    var4_4 = null;
                }
                var42_42 = false;
                var43_43 = 0.0f;
                var10_10 = null;
                var4_4.setVisibility(0);
            } else {
                if (var4_4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var10_10);
                    var46_46 = 0;
                    var4_4 = null;
                }
                var42_42 = 8 != 0;
                var43_43 = 1.1E-44f;
                var4_4.setVisibility((int)var42_42);
            }
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var46_46 = 0;
                var4_4 = null;
lbl413:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var4_4 = var9_9;
            ** continue;
            var42_42 = false;
            var43_43 = 0.0f;
            var10_10 = null;
            var4_4.setVisibility(0);
            var4_4 = h40_0.a;
            var46_46 = h40_0.l();
            if (var46_46 != 0) {
                var46_46 = ok1_1.b(var13_13);
                var4_4 = qz2_0.v(var46_46);
            } else {
                var4_4 = qz2_0.u(var13_13);
            }
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var42_42 = false;
                var43_43 = 0.0f;
                var10_10 = null;
            } else {
                var10_10 = var9_9;
            }
            var25_25 /* !! */  = TextView.BufferType.SPANNABLE;
            var10_10.setText((CharSequence)var4_4, (TextView.BufferType)var25_25 /* !! */ );
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var46_46 = 0;
                var4_4 = null;
            } else {
                var4_4 = var9_9;
            }
            var10_10 = String.valueOf(var13_13);
            var4_4.setContentDescription((CharSequence)var10_10);
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var46_46 = 0;
                var4_4 = null;
            } else {
                var4_4 = var9_9;
            }
            var4_4 = var4_4.getText();
            Intrinsics.checkNotNull(var4_4, "null cannot be cast to non-null type android.text.Spannable");
            var4_4 = (Spannable)var4_4;
            var10_10 = new StrikethroughSpan();
            if (var9_9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var33_33);
                var44_44 = 0;
                var45_45 = 0.0f;
                var9_9 = null;
            }
            var9_9 = var9_9.getText();
            var44_44 = var9_9.length();
            var32_32 = 17;
            var26_26 = 0;
            var27_27 = 0.0f;
            var25_25 /* !! */  = null;
            var4_4.setSpan(var10_10, 0, var44_44, var32_32);
        }
        var4_4 = mz3_0.a;
        var44_44 = mz3_0.A();
        if (var44_44 != 0) {
            var44_44 = 13;
            var45_45 = 1.8E-44f;
            if (var39_39 <= 0) {
                if (var6_6 != null) {
                    var10_10 = var6_6.getResources();
                    if (var10_10 != null) {
                        var32_32 = R$dimen.dp12;
                        var43_43 = var10_10.getDimension(var32_32);
                        var42_42 = (int)var43_43;
lbl479:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var42_42 = 12 != 0;
                    var43_43 = 1.7E-44f;
                    ** continue;
                    var32_32 = 0;
                    var33_33 = null;
                    ai0_2.u((int)var42_42, 0, var44_44, (View)var6_6);
                    var9_9 = Unit.a;
                }
            } else if (var6_6 != null) {
                var10_10 = var6_6.getResources();
                if (var10_10 != null) {
                    var32_32 = R$dimen.dp5;
                    var43_43 = var10_10.getDimension(var32_32);
                    var42_42 = (int)var43_43;
lbl495:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var42_42 = 5 != 0;
                var43_43 = 7.0E-45f;
                ** continue;
                var32_32 = 0;
                var33_33 = null;
                ai0_2.u((int)var42_42, 0, var44_44, (View)var6_6);
                var9_9 = Unit.a;
            }
            if (var6_6 != null) {
                ai0_2.B((View)var6_6);
                var9_9 = Unit.a;
            }
            var44_44 = (int)var2_2.isReturnable();
            var10_10 = var2_2.isExchangeable();
            if (var10_10 != null) {
                var42_42 = var10_10.booleanValue();
            } else {
                var42_42 = false;
                var43_43 = 0.0f;
                var10_10 = null;
            }
            var33_33 = var2_2.getReturnWindow();
            if (var33_33 != null) {
                var32_32 = var33_33.intValue();
            } else {
                var32_32 = 0;
                var33_33 = null;
            }
            var4_4 = var4_4.l(var32_32, (boolean)var44_44, var42_42);
            if (var6_6 != null) {
                var6_6.setText((CharSequence)var4_4);
                var4_4 = Unit.a;
            }
        } else if (var6_6 != null) {
            ai0_2.i((View)var6_6);
            var4_4 = Unit.a;
        }
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var30_30);
            var46_46 = 0;
            var4_4 = null;
        } else {
            var4_4 = var5_5;
        }
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var30_30);
            var47_47 = 0;
            var48_48 = 0.0f;
            var5_5 = null;
        }
        var5_5 = var5_5.getResources();
        Intrinsics.checkNotNullExpressionValue(var5_5, "getResources(...)");
        Intrinsics.checkNotNullParameter(var5_5, "resources");
        var6_6 = new StringBuilder();
        var9_9 = Float.valueOf(var29_29);
        var10_10 = Float.valueOf(var13_13);
        var44_44 = (int)var9_9.equals(var10_10);
        var10_10 = "format(...)";
        var33_33 = "getString(...)";
        if (var44_44 == 0) {
            var9_9 = StringCompanionObject.INSTANCE;
            var44_44 = R$string.acc_plp_final_price;
            var9_9 = var5_5.getString(var44_44);
            Intrinsics.checkNotNullExpressionValue(var9_9, (String)var33_33);
            var25_25 /* !! */  = mz3_0.h(String.valueOf(var29_29));
            var14_14 = 1;
            var16_16 /* !! */  = new Object[var14_14];
            var20_20 = 0;
            var21_21 = 0.0f;
            var16_16 /* !! */ [0] = var25_25 /* !! */ ;
            var25_25 /* !! */  = Arrays.copyOf(var16_16 /* !! */ , var14_14);
            var9_9 = String.format((String)var9_9, var25_25 /* !! */ );
            Intrinsics.checkNotNullExpressionValue(var9_9, (String)var10_10);
            var6_6.append((String)var9_9);
            var9_9 = qz2_0.s(mz3_0.h(String.valueOf(var13_13)));
            var25_25 /* !! */  = ", ";
            var6_6.append((String)var25_25 /* !! */ );
            var14_14 = R$string.acc_plp_original_price;
            var15_15 = var5_5.getString(var14_14);
            Intrinsics.checkNotNullExpressionValue(var15_15, (String)var33_33);
            var17_17 = 1;
            var18_18 = 1.4E-45f;
            var19_19 = new Object[var17_17];
            var30_30 = null;
            var19_19[0] = var9_9;
            var9_9 = Arrays.copyOf(var19_19, var17_17);
            var9_9 = String.format((String)var15_15, (Object[])var9_9);
            Intrinsics.checkNotNullExpressionValue(var9_9, (String)var10_10);
            var6_6.append((String)var9_9);
            var45_45 = (var13_13 - var29_29) / var13_13;
            var29_29 = var36_36;
            var9_9 = mz3_0.h(String.valueOf(var45_45 *= var29_29));
            var49_49 = (int)TextUtils.isEmpty((CharSequence)var9_9);
            if (var49_49 == 0) {
                var6_6.append((String)var25_25 /* !! */ );
                var49_49 = R$string.acc_plp_discount_price;
                var5_5 = var5_5.getString(var49_49);
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var33_33);
                var49_49 = 1;
                var29_29 = 1.4E-45f;
                var33_33 = new Object[var49_49];
                var26_26 = 0;
                var27_27 = 0.0f;
                var25_25 /* !! */  = null;
                var33_33[0] = var9_9;
                var9_9 = Arrays.copyOf(var33_33, var49_49);
                var5_5 = String.format((String)var5_5, (Object[])var9_9);
                Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
                var6_6.append((String)var5_5);
            } else {
                var5_5 = "";
                var6_6.append((String)var5_5);
            }
        } else {
            var9_9 = StringCompanionObject.INSTANCE;
            var44_44 = R$string.acc_plp_final_price_without_discount;
            var5_5 = var5_5.getString(var44_44);
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var33_33);
            var9_9 = mz3_0.h(String.valueOf(var29_29));
            var49_49 = 1;
            var29_29 = 1.4E-45f;
            var33_33 = new Object[var49_49];
            var26_26 = 0;
            var27_27 = 0.0f;
            var25_25 /* !! */  = null;
            var33_33[0] = var9_9;
            var9_9 = Arrays.copyOf(var33_33, var49_49);
            var5_5 = String.format((String)var5_5, (Object[])var9_9);
            Intrinsics.checkNotNullExpressionValue(var5_5, (String)var10_10);
            var6_6.append((String)var5_5);
        }
        var5_5 = var6_6.toString();
        var6_6 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(var5_5, (String)var6_6);
        var4_4.setContentDescription((CharSequence)var5_5);
        var4_4 = "savingAmountTv";
        if (var39_39 > 0) ** GOTO lbl-1000
        var47_47 = 0;
        var48_48 = 0.0f;
        var5_5 = null;
        cfr_temp_2 = var24_24 - 0.0f;
        var50_50 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
        if (var50_50 /* !! */  <= 0 && (var50_50 /* !! */  = (cfr_temp_3 = var41_41 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1)) <= 0) {
            if (var37_37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                var47_47 = 0;
                var48_48 = 0.0f;
                var5_5 = null;
lbl643:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5 = var37_37;
            ** continue;
            var50_50 /* !! */  = 8;
            var51_51 = 1.1E-44f;
            var5_5.setVisibility((int)var50_50 /* !! */ );
            if (var37_37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                var46_46 = 0;
                var4_4 = null;
                var42_42 = false;
                var43_43 = 0.0f;
                var10_10 = null;
            } else {
                var10_10 = var37_37;
                var46_46 = 0;
                var4_4 = null;
            }
            var10_10.setTag(null);
        } else lbl-1000:
        // 2 sources

        {
            var38_38 = var13_13 - var38_38;
            var48_48 = var38_38 / var13_13;
            var51_52 = var36_36;
            var52_53 = ok1_1.b(var48_48 *= var51_52);
            if (var37_37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                var47_47 = 0;
                var48_48 = 0.0f;
                var5_5 = null;
lbl672:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_5 = var37_37;
            ** continue;
            var50_50 /* !! */  = (float)false;
            var51_52 = 0.0f;
            var6_6 = null;
            var5_5.setVisibility(0);
            var50_50 /* !! */  = R$string.savings;
            var34_34 = hv3_0.K((int)var50_50 /* !! */ );
            var6_6 = var3_3.B;
            Intrinsics.checkNotNull(var6_6);
            var53_54 = var6_6.getVoucherMessages();
            var30_30 = var5_5;
            var5_5 = new CartSavings(var34_34, var38_38, var24_24, var52_53, var41_41, var53_54, var1_1);
            var6_6 = var3_3.B;
            Intrinsics.checkNotNull(var6_6);
            var6_6 = var6_6.getAllPromotionsList();
            if (var6_6 != null) {
                var6_6 = var3_3.B;
                Intrinsics.checkNotNull(var6_6);
                var6_6 = var6_6.getAllPromotionsList();
                var50_50 /* !! */  = var6_6.size();
                if (var50_50 /* !! */  > 0) {
                    var6_6 = var3_3.B;
                    Intrinsics.checkNotNull(var6_6);
                    var6_6 = var6_6.getAllPromotionsList().iterator();
                    var7_7 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(var6_6, (String)var7_7);
                    while ((var39_39 = (int)var6_6.hasNext()) != 0) {
                        var7_7 = (CartPromotion)var6_6.next();
                        var36_36 = (int)var7_7.isCouponCode();
                        if (var36_36 == 0) continue;
                        var50_50 /* !! */  = (float)var7_7.isCouponCode();
                        var5_5.setCoupon((boolean)var50_50 /* !! */ );
                        var50_50 /* !! */  = (float)var7_7.isApplied();
                        var5_5.setCouponApplied((boolean)var50_50 /* !! */ );
                        break;
                    }
                }
            }
            if ((var6_6 = var3_3.B) != null && (var6_6 = var6_6.getTotalSavingAmount()) != null && (var6_6 = var6_6.getValue()) != null) {
                var51_52 = var6_6.floatValue();
                var7_7 = Unit.a;
                var40_40 = var51_52;
                var50_50 /* !! */  = (float)false;
                var51_52 = 0.0f;
                var6_6 = null;
            } else {
                var50_50 /* !! */  = (float)false;
                var51_52 = 0.0f;
                var6_6 = null;
                cfr_temp_4 = var35_35 - 0.0f;
                var39_39 = (int)(cfr_temp_4 == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1));
                if (var39_39 > 0) {
                    var21_21 = var35_35;
                } else {
                    var20_20 = 0;
                    var21_21 = 0.0f;
                    var19_19 = null;
                }
                var39_39 = (int)((cfr_temp_5 = var24_24 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1));
                if (var39_39 <= 0) {
                    var23_23 = 0;
                    var24_24 = 0.0f;
                    var22_22 = null;
                }
                var21_21 += var24_24;
                cfr_temp_6 = var41_41 - 0.0f;
                var39_39 = (int)(cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 > 0.0f ? 1 : -1));
                if (var39_39 > 0) {
                    var27_27 = var41_41;
                } else {
                    var26_26 = 0;
                    var27_27 = 0.0f;
                    var25_25 /* !! */  = null;
                }
                var40_40 = var21_21 + var27_27;
                var8_8 /* !! */  = Unit.a;
            }
            var50_50 /* !! */  = (cfr_temp_7 = var40_40 - 0.0f) == 0.0f ? 0 : (cfr_temp_7 > 0.0f ? 1 : -1);
            if (var50_50 /* !! */  > 0) {
                var6_6 = h40_0.a;
                var50_50 /* !! */  = (float)h40_0.l();
                if (var50_50 /* !! */  != false) {
                    var50_50 /* !! */  = ok1_1.b(var40_40);
                    var6_6 = qz2_0.v((int)var50_50 /* !! */ );
                } else {
                    var6_6 = qz2_0.u(var40_40);
                }
                if (var37_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var39_39 = 0;
                    var40_40 = 0.0f;
                    var7_7 = null;
                } else {
                    var7_7 = var37_37;
                }
                var36_36 = R$string.you_save_refresh;
                var10_10 = new Object[1];
                var44_44 = 0;
                var45_45 = 0.0f;
                var9_9 = null;
                var10_10[0] = var6_6;
                var8_8 /* !! */  = hv3_0.L(var36_36, (Object[])var10_10);
                var7_7.setText((CharSequence)var8_8 /* !! */ );
                if (var37_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var39_39 = 0;
                    var40_40 = 0.0f;
                    var7_7 = null;
                } else {
                    var7_7 = var37_37;
                }
                var7_7.setTag(var5_5);
                if (var37_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var42_42 = false;
                    var43_43 = 0.0f;
                    var10_10 = null;
                } else {
                    var10_10 = var37_37;
                }
                var46_46 = R$string.you_save_refresh;
                var47_47 = 1;
                var48_48 = 1.4E-45f;
                var5_5 = new Object[var47_47];
                var39_39 = 0;
                var40_40 = 0.0f;
                var7_7 = null;
                var5_5[0] = var6_6;
                var4_4 = hv3_0.L(var46_46, (Object[])var5_5);
                var10_10.setContentDescription((CharSequence)var4_4);
            } else {
                if (var37_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var47_47 = 0;
                    var48_48 = 0.0f;
                    var5_5 = null;
lbl800:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var5_5 = var37_37;
                ** continue;
                var50_50 /* !! */  = 8;
                var51_52 = 1.1E-44f;
                var5_5.setVisibility((int)var50_50 /* !! */ );
                if (var37_37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
                    var46_46 = 0;
                    var4_4 = null;
                    var42_42 = false;
                    var43_43 = 0.0f;
                    var10_10 = null;
                } else {
                    var10_10 = var37_37;
                    var46_46 = 0;
                    var4_4 = null;
                }
                var10_10.setTag(null);
            }
        }
    }
}

