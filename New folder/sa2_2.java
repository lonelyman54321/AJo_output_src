/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.FragmentProductBreakupBinding;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp$AmountData;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from SA2
 */
public final class sa2_2
extends g61_0 {
    public static final /* synthetic */ gn1_2[] j;
    public final D f;
    public CartEntry g;
    public final NewCustomEventsRevamp h;
    public final cc3_2 i;

    static {
        in1_2 in1_22 = jz.a(sa2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentProductBreakupBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{in1_22};
        j = gn1_2Array;
    }

    public sa2_2() {
        Object object = Reflection.getOrCreateKotlinClass(qz1_2.class);
        SA2$b sA2$b = new SA2$b(this);
        SA2$c sA2$c = new SA2$c(this);
        SA2$d sA2$d = new SA2$d(this);
        this.f = object = LW0.a(this, (yn1_2)object, sA2$b, sA2$c, sA2$d);
        this.h = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.i = object = z80_0.c(SA2$a.a, this);
    }

    public final FragmentProductBreakupBinding Pa() {
        Object object = j[0];
        object = this.i.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentProductBreakupBinding)object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        QA2 qA2 = new QA2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)qA2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        String string2 = "PRODUCT_DETAIL_BREAKUP";
        Object object2 = null;
        if (object != null) {
            n3 = object.containsKey(string2);
            object = n3 != 0;
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                int n4 = Build.VERSION.SDK_INT;
                int n7 = 33;
                if (n4 >= n7) {
                    object = NA2.a(object);
                } else {
                    boolean bl2 = (object = object.getSerializable(string2)) instanceof CartEntry;
                    if (bl2) {
                        object2 = object;
                    }
                    object = object2;
                    object = (CartEntry)object2;
                }
                object2 = object;
                object2 = (CartEntry)object;
            }
            this.g = object2;
        }
        n3 = R$layout.fragment_product_breakup;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.parent_layout;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ConstraintLayout)((Object)object);
        Object object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new OA2((ConstraintLayout)((Object)object));
        long l2 = 100;
        object2.postDelayed((Runnable)object3, l2);
        object = this.Pa().okayButton;
        object2 = new PA2(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.Pa().imCancelBtn;
        int n4 = 2;
        float f5 = 2.8E-45f;
        object2 = new uZ1(this, n4);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.g;
        if (object != null) {
            float f6;
            object2 = ((CartEntry)object).getProduct();
            object3 = ((CartEntry)object).getProduct();
            String string2 = null;
            if (object3 != null) {
                object3 = ((Product)object3).getName();
            } else {
                n4 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            object3 = kp1_0.c(" ", (String)object3);
            this.Pa().tvProductDetails.setText((CharSequence)object3);
            object3 = this.Pa().tvOriginalPrice;
            Intrinsics.checkNotNull(object2);
            Object object4 = ((CartEntry)object).getQuantity();
            object4 = BN2.g((CartEntry)object, (Product)object2, (Integer)object4);
            object3.setText((CharSequence)object4);
            object3 = this.g;
            object4 = ((CartEntry)object).getQuantity();
            float f7 = 0.0f;
            Object object5 = null;
            object2 = BN2.e((CartEntry)object3, (Product)object2, (Integer)object4, false);
            n4 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n4 == 0) {
                this.Pa().discountConstaintview.setVisibility(0);
                object3 = this.Pa().tvDiscountPrice;
                object3.setText((CharSequence)object2);
            }
            object2 = this.f;
            ((qz1_2)((D)object2).getValue()).getClass();
            object3 = qz1_2.p((CartEntry)object);
            int n7 = TextUtils.isEmpty((CharSequence)object3);
            if (n7 == 0) {
                this.Pa().couponConstraintview.setVisibility(0);
                object4 = this.Pa().tvCouponPrice;
                object4.setText((CharSequence)object3);
            }
            object3 = ((CartEntry)object).getQuantity();
            n7 = TextUtils.isEmpty((CharSequence)(object3 = BN2.a((CartEntry)object, (Integer)object3)));
            if (n7 == 0) {
                this.Pa().bankOfferConstraintview.setVisibility(0);
                object4 = this.Pa().tvBankDiscountPrice;
                object4.setText((CharSequence)object3);
            }
            if ((object3 = (CartOrder)((qz1_2)((D)object2).getValue()).l.getValue()) != null) {
                object4 = (qz1_2)((D)object2).getValue();
                object4.getClass();
                object3 = qz1_2.x((CartOrder)object3);
            } else {
                n4 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n7 = TextUtils.isEmpty((CharSequence)object3);
            if (n7 == 0) {
                this.Pa().promoConstraintview.setVisibility(0);
                object4 = this.Pa().tvPromoPrice;
                object4.setText((CharSequence)object3);
            }
            if ((object3 = this.g) != null && (object3 = ((CartEntry)object3).getTotalPrice()) != null) {
                object3 = ((Price)object3).getValue();
            } else {
                n4 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            f5 = mz3_0.J((String)object3);
            object4 = cp_1.Companion;
            object4.getClass();
            n7 = cp$a.w();
            if (n7 != 0 || (n7 = cp$a.v()) != 0) {
                object4 = this.g;
                if (object4 != null) {
                    object5 = ((CartEntry)object4).getQuantity();
                } else {
                    object5 = null;
                    f7 = 0.0f;
                }
                f6 = BN2.b((CartEntry)object4, (Integer)object5);
                f5 += f6;
            }
            if ((object4 = this.g) != null && (object4 = ((CartEntry)object4).getBankDiscountPromoAmt()) != null) {
                double d2 = ((Number)object4).doubleValue();
                f6 = (float)d2;
                f5 -= f6;
            }
            ((qz1_2)((D)object2).getValue()).getClass();
            object2 = qz2_0.u(f5);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = this.Pa().tvProductTotal;
                object3 = BN2.h((CartEntry)object);
                object2.setText((CharSequence)object3);
            }
            n3 = (int)(cp$a.w() ? 1 : 0);
            object3 = "constraintConvFee";
            if (n3 == 0 && (n3 = (int)(cp$a.v() ? 1 : 0)) == 0) {
                object = this.Pa().constraintConvFee;
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                ai0_2.i((View)object);
            } else {
                object2 = this.Pa().constraintConvFee;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                ai0_2.B((View)object2);
                object2 = this.g;
                if (object2 != null) {
                    object3 = ((CartEntry)object2).getQuantity();
                } else {
                    n4 = 0;
                    object3 = null;
                    f5 = 0.0f;
                }
                float f8 = BN2.b((CartEntry)object2, (Integer)object3);
                object3 = cp$a.n();
                this.Pa().convenienceFeeNonRefund.setText((CharSequence)object3);
                object4 = "convenienceFeeNonRefund";
                object5 = "convenienceFeeWhatsThis";
                float f11 = 0.0f;
                float f12 = f8 - 0.0f;
                float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (f14 > 0) {
                    AjioTextView ajioTextView = this.Pa().convenienceFeeWhatsThis;
                    Intrinsics.checkNotNullExpressionValue(ajioTextView, (String)object5);
                    ai0_2.B((View)ajioTextView);
                    n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                    if (n4 == 0) {
                        object3 = this.Pa().convenienceFeeNonRefund;
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                        ai0_2.B((View)object3);
                    }
                    object3 = this.Pa().tvConvFee;
                    n7 = hv3_0.m(R$color.color_202020);
                    object3.setTextColor(n7);
                    object3 = this.Pa().tvConvFee;
                    object2 = String.valueOf(qz2_0.u(f8));
                    object3.setText((CharSequence)object2);
                } else {
                    object2 = this.Pa().tvConvFee;
                    object3 = "Free";
                    object2.setText((CharSequence)object3);
                    object2 = this.Pa().convenienceFeeWhatsThis;
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                    ai0_2.i((View)object2);
                    object2 = this.Pa().convenienceFeeNonRefund;
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                    ai0_2.i((View)object2);
                }
                object2 = ((CartEntry)object).getConvenienceFee();
                if (object2 != null) {
                    object3 = ((ConvenienceFeePriceSplitUp)object2).getTotal();
                    if (object3 != null) {
                        f5 = ((ConvenienceFeePriceSplitUp$AmountData)object3).getNetAmount();
                    } else {
                        n4 = 0;
                        f5 = 0.0f;
                        object3 = null;
                    }
                    object4 = ((ConvenienceFeePriceSplitUp)object2).getDelivery();
                    if (object4 != null) {
                        f6 = ((ConvenienceFeePriceSplitUp$AmountData)object4).getNetAmount();
                    } else {
                        n7 = 0;
                        f6 = 0.0f;
                        object4 = null;
                    }
                    object5 = ((ConvenienceFeePriceSplitUp)object2).getRVP();
                    if (object5 != null) {
                        f7 = ((ConvenienceFeePriceSplitUp$AmountData)object5).getNetAmount();
                    } else {
                        f7 = 0.0f;
                        object5 = null;
                    }
                    object2 = ((ConvenienceFeePriceSplitUp)object2).getCOD();
                    if (object2 != null) {
                        f11 = ((ConvenienceFeePriceSplitUp$AmountData)object2).getNetAmount();
                    }
                    f8 = f11;
                    f11 = f5;
                } else {
                    n3 = 0;
                    f8 = 0.0f;
                    object2 = null;
                    n7 = 0;
                    f6 = 0.0f;
                    object4 = null;
                    f7 = 0.0f;
                    object5 = null;
                }
                object2 = mz3_0.f(mz3_0.s(f11, f6, f8, f7));
                object3 = this.h;
                object4 = ((NewCustomEventsRevamp)object3).getPRODUCT_ID();
                object5 = ((CartEntry)object).getProduct();
                if (object5 != null) {
                    object5 = ((Product)object5).getCode();
                } else {
                    object5 = null;
                    f7 = 0.0f;
                }
                object2.putString((String)object4, (String)object5);
                object3 = ((NewCustomEventsRevamp)object3).getPRODUCT_NAME();
                object4 = ((CartEntry)object).getProduct();
                if (object4 != null) {
                    string2 = ((Product)object4).getName();
                }
                object2.putString((String)object3, string2);
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string2 = "product breakup";
                ((GTMEvents)object3).pushOpenScreenEvent(string2, (Bundle)object2);
                object2 = this.Pa().convenienceFeeWhatsThis;
                object3 = new RA2(this, (CartEntry)object);
                object2.setOnClickListener((View.OnClickListener)object3);
            }
        }
    }
}

