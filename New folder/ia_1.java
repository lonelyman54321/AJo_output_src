/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$animator;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.IncentivizeBottomSheetBinding;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.IncentiviseHighReturnData;
import com.ril.ajio.services.data.Order.ResultIncentivise;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from iA
 */
public final class ia_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final ia$a_1 Companion;
    public boolean a;
    public boolean b;
    public vk1_0 c;
    public vk1_0 d;
    public vk1_0 e;
    public IncentivizeBottomSheetBinding f;
    public qz1_2 g;
    public SelectedOrderItem h;
    public LinkedHashMap i;
    public LinkedHashMap j;
    public String k;
    public String l;
    public String m;
    public Float n;
    public int o;
    public final hh3_2 p;

    static {
        ia$a_1 ia$a_1;
        Companion = ia$a_1 = new Object();
    }

    public ia_1() {
        boolean bl2;
        this.a = bl2 = true;
        this.b = bl2;
        Object object = Float.valueOf(0.0f);
        this.n = object;
        object = new ha_1(this);
        this.p = object = yr1_2.b((Function0)object);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void Oa(View object, View view, View view2) {
        void var2_3;
        void var3_4;
        Context context;
        String string2 = "null cannot be cast to non-null type android.animation.AnimatorSet";
        try {
            ai0_2.B(object);
            context = null;
        }
        catch (Exception exception) {
            return;
        }
        var3_4.setEnabled(false);
        context = this.getContext();
        int n3 = R$animator.front_animator;
        context = AnimatorInflater.loadAnimator((Context)context, (int)n3);
        Intrinsics.checkNotNull(context, string2);
        context = (AnimatorSet)context;
        context.setTarget((Object)var2_3);
        Context context2 = this.getContext();
        int n4 = R$animator.back_animator;
        context2 = AnimatorInflater.loadAnimator((Context)context2, (int)n4);
        Intrinsics.checkNotNull(context2, string2);
        context2 = (AnimatorSet)context2;
        context2.setTarget(object);
        context.start();
        context2.start();
        ia$b_1 ia$b_1 = new ia$b_1((View)var2_3, (View)var3_4);
        context2.addListener((Animator.AnimatorListener)ia$b_1);
    }

    public final Bundle Pa() {
        Object object = this.g;
        Object object2 = null;
        object = object != null && (object = ((qz1_2)object).l) != null ? (CartOrder)((h83_0)object).getValue() : null;
        Bundle bundle = new Bundle();
        Object object3 = this.g;
        object3 = object3 != null ? ((qz1_2)object3).g : null;
        String string2 = "product_id";
        bundle.putString(string2, (String)object3);
        if (object != null) {
            object2 = ((CartOrder)object).getCode();
        }
        bundle.putString("order_id", (String)object2);
        object = this.h;
        object2 = "";
        if (object == null || (object = ((SelectedOrderItem)object).getOrderStatus()) == null) {
            object = object2;
        }
        bundle.putString("order_status", (String)object);
        object3 = this.k;
        bundle.putString("non_refundable_fee", (String)object3);
        object3 = this.l;
        bundle.putString("discounts", (String)object3);
        object = this.m;
        if (object == null) {
            object = object2;
        }
        object3 = "return_percentage";
        bundle.putString((String)object3, (String)object);
        object = this.g;
        if (object != null && (object = ((qz1_2)object).k0) != null && (object = (DataCallback)((LiveData)object).d()) != null && (object = (IncentiviseHighReturnData)((DataCallback)object).getData()) != null && (object = ((IncentiviseHighReturnData)object).getResult()) != null && (object = ((ResultIncentivise)object).getEXCHANGE_NUDGE()) != null && (object = ((ProfileHealth)object).getRule()) != null) {
            object2 = object;
        }
        bundle.putString("fraud_rule_name", (String)object2);
        return bundle;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        ia_1 ia_12 = this;
        int n7 = 0;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.id_refundable_viewmore;
        Object object3 = "cvNonRefundFee";
        String string2 = "clNonRefundFeeDetails";
        int n10 = 0;
        String string3 = null;
        String string4 = "binding";
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            n4 = (int)(ia_12.a ? 1 : 0);
            if (n4 != 0) {
                object = ia_12.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                }
                object = ((IncentivizeBottomSheetBinding)object).clNonRefundFeeDetails;
                Intrinsics.checkNotNullExpressionValue(object, string2);
                Object object4 = ia_12.f;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n8 = 0;
                    object4 = null;
                }
                object4 = object4.cvNonRefundFee;
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                object3 = ia_12.f;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    object2 = object3;
                }
                object2 = ((IncentivizeBottomSheetBinding)object2).idRefundableViewless;
                Intrinsics.checkNotNullExpressionValue(object2, "idRefundableViewless");
                ia_12.Oa((View)object, (View)object4, (View)object2);
                ia_12.a = false;
                object2 = AnalyticsManager.Companion;
                object4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                String string5 = cv_0.a((AnalyticsManager$Companion)object2);
                String string6 = bv_0.a((AnalyticsManager$Companion)object2);
                Bundle bundle = this.Pa();
                string2 = "non refundable fees  section";
                string3 = "view more click";
                String string7 = "return and exchange nudge bottom card";
                boolean bl2 = false;
                int n14 = 1568;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object3, string2, string3, string4, string7, null, string6, bundle, string5, false, null, n14, null);
            }
        } else {
            int n15;
            n8 = R$id.id_refundable_viewless;
            n3 = 1;
            if (object != null && (n15 = ((Integer)object).intValue()) == n8) {
                n4 = (int)(ia_12.a ? 1 : 0);
                if (n4 == 0) {
                    object = ia_12.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n4 = 0;
                        object = null;
                    }
                    object = ((IncentivizeBottomSheetBinding)object).cvNonRefundFee;
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    Object object5 = ia_12.f;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n8 = 0;
                        object5 = null;
                    }
                    object5 = object5.clNonRefundFeeDetails;
                    Intrinsics.checkNotNullExpressionValue(object5, string2);
                    object3 = ia_12.f;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        object2 = object3;
                    }
                    object2 = ((IncentivizeBottomSheetBinding)object2).idRefundableViewmore;
                    object3 = "idRefundableViewmore";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                    ia_12.Oa((View)object, (View)object5, (View)object2);
                    ia_12.a = n3;
                }
            } else {
                n8 = R$id.id_discount_viewmore;
                object3 = "clDiscountFee";
                string2 = "clDiscountFeeDetails";
                if (object != null && (n15 = ((Integer)object).intValue()) == n8) {
                    n4 = (int)(ia_12.b ? 1 : 0);
                    if (n4 != 0) {
                        object = ia_12.f;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n4 = 0;
                            object = null;
                        }
                        object = ((IncentivizeBottomSheetBinding)object).clDiscountFeeDetails;
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        Object object6 = ia_12.f;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n8 = 0;
                            object6 = null;
                        }
                        object6 = object6.clDiscountFee;
                        Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                        object3 = ia_12.f;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                        } else {
                            object2 = object3;
                        }
                        object2 = ((IncentivizeBottomSheetBinding)object2).idDiscountViewless;
                        Intrinsics.checkNotNullExpressionValue(object2, "idDiscountViewless");
                        ia_12.Oa((View)object, (View)object6, (View)object2);
                        ia_12.b = false;
                        object2 = AnalyticsManager.Companion;
                        object6 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                        string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                        object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                        object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                        String string8 = cv_0.a((AnalyticsManager$Companion)object2);
                        String string9 = bv_0.a((AnalyticsManager$Companion)object2);
                        Bundle bundle = this.Pa();
                        string2 = "discounts and coupon section";
                        string3 = "view more click";
                        String string10 = "return and exchange nudge bottom card";
                        n15 = 0;
                        int n16 = 1568;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object3, string2, string3, string4, string10, null, string9, bundle, string8, false, null, n16, null);
                    }
                } else {
                    n8 = R$id.id_discount_viewless;
                    if (object != null && (n15 = ((Integer)object).intValue()) == n8) {
                        n4 = (int)(ia_12.b ? 1 : 0);
                        if (n4 == 0) {
                            object = ia_12.f;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                                n4 = 0;
                                object = null;
                            }
                            object = ((IncentivizeBottomSheetBinding)object).clDiscountFee;
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            Object object7 = ia_12.f;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                                n8 = 0;
                                object7 = null;
                            }
                            object7 = object7.clDiscountFeeDetails;
                            Intrinsics.checkNotNullExpressionValue(object7, string2);
                            object3 = ia_12.f;
                            if (object3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                            } else {
                                object2 = object3;
                            }
                            object2 = ((IncentivizeBottomSheetBinding)object2).idDiscountViewmore;
                            object3 = "idDiscountViewmore";
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                            ia_12.Oa((View)object, (View)object7, (View)object2);
                            ia_12.b = n3;
                        }
                    } else {
                        n8 = R$id.horizontal_viewmore;
                        object3 = "clHorizentalRefundableFeeView";
                        string2 = "clHorizentalRefundableDetails";
                        if (object != null && (n15 = ((Integer)object).intValue()) == n8) {
                            n4 = (int)(ia_12.a ? 1 : 0);
                            if (n4 != 0) {
                                object = ia_12.f;
                                if (object == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n4 = 0;
                                    object = null;
                                }
                                object = ((IncentivizeBottomSheetBinding)object).clHorizentalRefundableDetails;
                                Intrinsics.checkNotNullExpressionValue(object, string2);
                                Object object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = object8.clHorizentalRefundableFeeView;
                                Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
                                object3 = ia_12.f;
                                if (object3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                                } else {
                                    object2 = object3;
                                }
                                object2 = ((IncentivizeBottomSheetBinding)object2).horizentalRefundableViewless;
                                Intrinsics.checkNotNullExpressionValue(object2, "horizentalRefundableViewless");
                                ia_12.Oa((View)object, (View)object8, (View)object2);
                                ia_12.a = false;
                                object2 = AnalyticsManager.Companion;
                                object8 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                                object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                                String string11 = cv_0.a((AnalyticsManager$Companion)object2);
                                String string12 = bv_0.a((AnalyticsManager$Companion)object2);
                                Bundle bundle = this.Pa();
                                string2 = "discounts and coupon section";
                                string3 = "view more click";
                                String string13 = "return and exchange nudge bottom card";
                                n15 = 0;
                                int n17 = 1568;
                                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object8, (String)object3, string2, string3, string4, string13, null, string12, bundle, string11, false, null, n17, null);
                            }
                        } else {
                            n8 = R$id.horizental_refundable_viewless;
                            if (object != null && (n10 = ((Integer)object).intValue()) == n8) {
                                n4 = (int)(ia_12.a ? 1 : 0);
                                if (n4 == 0) {
                                    object = ia_12.f;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                                        n4 = 0;
                                        object = null;
                                    }
                                    object = ((IncentivizeBottomSheetBinding)object).clHorizentalRefundableFeeView;
                                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                                    Object object9 = ia_12.f;
                                    if (object9 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                                        n8 = 0;
                                        object9 = null;
                                    }
                                    object9 = object9.clHorizentalRefundableDetails;
                                    Intrinsics.checkNotNullExpressionValue(object9, string2);
                                    object3 = ia_12.f;
                                    if (object3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                                    } else {
                                        object2 = object3;
                                    }
                                    object2 = ((IncentivizeBottomSheetBinding)object2).horizontalViewmore;
                                    object3 = "horizontalViewmore";
                                    Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                                    ia_12.Oa((View)object, (View)object9, (View)object2);
                                    ia_12.a = n3;
                                }
                            } else {
                                n7 = R$id.close_dialog;
                                if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                                    object2 = AnalyticsManager.Companion;
                                    NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                    string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                                    object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                    object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                                    String string14 = cv_0.a((AnalyticsManager$Companion)object2);
                                    String string15 = bv_0.a((AnalyticsManager$Companion)object2);
                                    string2 = "cross click";
                                    string3 = "close";
                                    String string16 = "return and exchange nudge bottom card";
                                    n15 = 0;
                                    Object var17_38 = null;
                                    int n18 = 1568;
                                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object3, string2, string3, string4, string16, null, string15, null, string14, false, null, n18, null);
                                    this.dismiss();
                                } else {
                                    n7 = R$id.tv_proceed_return;
                                    if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                                        n7 = (int)(h40_0.l1() ? 1 : 0);
                                        if (n7 != 0 && (object2 = ia_12.g) != null) {
                                            ((qz1_2)object2).x0 = object = "return";
                                        }
                                        if ((object2 = ia_12.g) != null) {
                                            object = Boolean.TRUE;
                                            object2 = ((qz1_2)object2).q;
                                            ((h83_0)object2).setValue(object);
                                        }
                                        object2 = AnalyticsManager.Companion;
                                        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                        string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                                        object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                        object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                                        String string17 = cv_0.a((AnalyticsManager$Companion)object2);
                                        String string18 = bv_0.a((AnalyticsManager$Companion)object2);
                                        Bundle bundle = this.Pa();
                                        string2 = "return/exchange click";
                                        string3 = "return";
                                        String string19 = "return and exchange nudge bottom card";
                                        n15 = 0;
                                        int n19 = 1568;
                                        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object3, string2, string3, string4, string19, null, string18, bundle, string17, false, null, n19, null);
                                        this.dismiss();
                                    } else {
                                        n7 = R$id.tv_proceed_exchange;
                                        if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                                            n7 = (int)(h40_0.l1() ? 1 : 0);
                                            if (n7 != 0 && (object2 = ia_12.g) != null) {
                                                ((qz1_2)object2).x0 = object = "exchange";
                                            }
                                            if ((object2 = ia_12.g) != null) {
                                                object = Boolean.TRUE;
                                                object2 = ((qz1_2)object2).q;
                                                ((h83_0)object2).setValue(object);
                                            }
                                            object2 = AnalyticsManager.Companion;
                                            NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                            string4 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp().getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_EVENT();
                                            object = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                            object3 = ((NewCustomEventsRevamp)object).getEXCHANGE_NUDGE_BOTTOM_CARD_INTERACTION_CATEGORY();
                                            String string20 = cv_0.a((AnalyticsManager$Companion)object2);
                                            String string21 = bv_0.a((AnalyticsManager$Companion)object2);
                                            Bundle bundle = this.Pa();
                                            string2 = "return/exchange click";
                                            string3 = "exchange";
                                            String string22 = "return and exchange nudge bottom card";
                                            n15 = 0;
                                            int n20 = 1568;
                                            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, (String)object3, string2, string3, string4, string22, null, string21, bundle, string20, false, null, n20, null);
                                            this.dismiss();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ea_0 ea_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)ea_02);
        return object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle bundle) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = IncentivizeBottomSheetBinding.inflate(this.getLayoutInflater());
        this.f = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object = ((ViewDataBinding)object).getRoot();
        Intrinsics.checkNotNullExpressionValue(object, "getRoot(...)");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        int n3;
        Object object2;
        int n4;
        SpannableString spannableString;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        String string2;
        Object object7;
        Object object8;
        int n7;
        ia_1 ia_12;
        block84: {
            Object object9;
            block80: {
                Object object10;
                String string3;
                int n8;
                block83: {
                    block81: {
                        float f5;
                        block82: {
                            block79: {
                                float f6;
                                int n10;
                                float f7;
                                int n14;
                                float f8;
                                block78: {
                                    int n15;
                                    block77: {
                                        ia_12 = this;
                                        n7 = 1;
                                        n8 = 0;
                                        object8 = null;
                                        object9 = "optString(...)";
                                        string3 = "callout1_title";
                                        object7 = view;
                                        Intrinsics.checkNotNullParameter(view, "view");
                                        super.onViewCreated(view, bundle);
                                        float cfr_ignored_1 = this.requireActivity().getResources().getDisplayMetrics().density;
                                        object10 = h40_0.a;
                                        object10 = h40_0.F();
                                        object7 = "callout2";
                                        n15 = object10.optBoolean((String)object7);
                                        string2 = "binding";
                                        object6 = null;
                                        object5 = "clSeekBarLayout";
                                        if (n15 == 0) break block77;
                                        object10 = this.f;
                                        if (object10 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                                            n15 = 0;
                                            object10 = null;
                                        }
                                        object10 = ((IncentivizeBottomSheetBinding)object10).clSeekBarLayout;
                                        Intrinsics.checkNotNullExpressionValue(object10, (String)object5);
                                        ai0_2.B((View)object10);
                                        object10 = ia_12.g;
                                        if (object10 != null && (object10 = ((qz1_2)object10).k0) != null && (object10 = (DataCallback)((LiveData)object10).d()) != null && (n15 = ((DataCallback)object10).getStatus()) == 0) {
                                            object10 = ia_12.g;
                                            if (object10 != null && (object10 = ((qz1_2)object10).k0) != null && (object10 = (DataCallback)((LiveData)object10).d()) != null) {
                                                ((DataCallback)object10).setNewData(n7 != 0);
                                            }
                                            break block78;
                                        } else {
                                            object10 = ia_12.f;
                                            if (object10 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                                n15 = 0;
                                                object10 = null;
                                            }
                                            hv3_0.p0(((IncentivizeBottomSheetBinding)object10).shimmerView);
                                            object5 = Looper.getMainLooper();
                                            object10 = new Handler((Looper)object5);
                                            object5 = new fa_1(ia_12, 0);
                                            long l2 = 1000L;
                                            object10.postDelayed((Runnable)object5, l2);
                                        }
                                        break block78;
                                    }
                                    object10 = this.f;
                                    if (object10 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n15 = 0;
                                        object10 = null;
                                    }
                                    object10 = ((IncentivizeBottomSheetBinding)object10).clSeekBarLayout;
                                    Intrinsics.checkNotNullExpressionValue(object10, (String)object5);
                                    ai0_2.i((View)object10);
                                }
                                if ((object10 = ia_12.g) != null && (object10 = ((qz1_2)object10).k0) != null) {
                                    object5 = new ga_1(ia_12);
                                    object4 = new ia$c_1((ga_1)object5);
                                    ((LiveData)object10).e(ia_12, (F62)object4);
                                }
                                object10 = "format(...)";
                                object5 = ia_12.k;
                                if (object5 != null) {
                                    object4 = ia_12.f;
                                    if (object4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        object4 = null;
                                        f5 = 0.0f;
                                    }
                                    object4 = ((IncentivizeBottomSheetBinding)object4).nonRefundablePrice;
                                    f8 = Float.parseFloat((String)object5);
                                    n14 = Math.round(f8);
                                    object5 = qz2_0.v(n14);
                                    object4.setText((CharSequence)object5);
                                }
                                if ((object5 = ia_12.l) != null) {
                                    object4 = ia_12.f;
                                    if (object4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        object4 = null;
                                        f5 = 0.0f;
                                    }
                                    object4 = ((IncentivizeBottomSheetBinding)object4).tvDiscountPrice;
                                    f8 = Float.parseFloat((String)object5);
                                    n14 = Math.round(f8);
                                    object5 = qz2_0.v(n14);
                                    object4.setText((CharSequence)object5);
                                }
                                object5 = ia_12.k;
                                f5 = 0.0f;
                                object4 = null;
                                if (object5 != null && (n14 = ((String)object5).length()) != 0) {
                                    object5 = ia_12.n;
                                    if (object5 != null) {
                                        f8 = ((Float)object5).floatValue();
                                        object3 = ia_12.k;
                                        if (object3 != null) {
                                            f7 = Float.parseFloat((String)object3);
                                        } else {
                                            n10 = 0;
                                            f7 = 0.0f;
                                            object3 = null;
                                        }
                                        n10 = Math.round(f7);
                                        f7 = n10;
                                        object5 = Float.valueOf(f8 += f7);
                                    } else {
                                        n14 = 0;
                                        object5 = null;
                                        f8 = 0.0f;
                                    }
                                    ia_12.n = object5;
                                }
                                if ((object5 = ia_12.l) != null && (n14 = ((String)object5).length()) != 0) {
                                    object5 = ia_12.n;
                                    if (object5 != null) {
                                        f8 = ((Float)object5).floatValue();
                                        object3 = ia_12.l;
                                        if (object3 != null) {
                                            f7 = Float.parseFloat((String)object3);
                                        } else {
                                            n10 = 0;
                                            f7 = 0.0f;
                                            object3 = null;
                                        }
                                        n10 = Math.round(f7);
                                        f7 = n10;
                                        object5 = Float.valueOf(f8 += f7);
                                    } else {
                                        n14 = 0;
                                        object5 = null;
                                        f8 = 0.0f;
                                    }
                                    ia_12.n = object5;
                                }
                                if ((object5 = ia_12.n) != null && (n14 = (int)((f6 = (f8 = ((Float)object5).floatValue()) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
                                    block76: {
                                        int n16;
                                        block75: {
                                            block74: {
                                                try {
                                                    object5 = StringCompanionObject.INSTANCE;
                                                    object5 = h40_0.F();
                                                    object5 = object5.optString(string3);
                                                    Intrinsics.checkNotNullExpressionValue(object5, (String)object9);
                                                    object3 = ia_12.n;
                                                    if (object3 != null) {
                                                        f7 = ((Number)object3).floatValue();
                                                        n10 = Math.round(f7);
                                                        object3 = qz2_0.v(n10);
                                                    } else {
                                                        n10 = 0;
                                                        object3 = null;
                                                        f7 = 0.0f;
                                                    }
                                                    spannableString = new Object[n7];
                                                    spannableString[0] = object3;
                                                    object3 = Arrays.copyOf(spannableString, n7);
                                                    object5 = String.format((String)object5, (Object[])object3);
                                                    Intrinsics.checkNotNullExpressionValue(object5, (String)object10);
                                                    object3 = ia_12.n;
                                                    if (object3 == null) break block74;
                                                    f7 = ((Number)object3).floatValue();
                                                    n10 = Math.round(f7);
                                                    object3 = qz2_0.v(n10);
                                                    break block75;
                                                }
                                                catch (Exception exception) {
                                                    break block76;
                                                }
                                            }
                                            n10 = 0;
                                            object3 = null;
                                            f7 = 0.0f;
                                        }
                                        object3 = String.valueOf(object3);
                                        n4 = 6;
                                        n10 = StringsKt.O((CharSequence)object5, (String)object3, 0, false, n4);
                                        n4 = -1;
                                        if (n10 != n4) {
                                            object2 = ia_12.n;
                                            if (object2 != null) {
                                                float f11 = ((Number)object2).floatValue();
                                                n16 = Math.round(f11);
                                                object2 = qz2_0.v(n16);
                                            } else {
                                                n16 = 0;
                                                object2 = null;
                                                float f12 = 0.0f;
                                            }
                                            object2 = String.valueOf(object2);
                                            n16 = ((String)object2).length() + n10;
                                        } else {
                                            n16 = 0;
                                            float f14 = 0.0f;
                                            object2 = null;
                                        }
                                        if (n10 != n4 && n16 != n4) {
                                            spannableString = new SpannableString((CharSequence)object5);
                                            int n17 = -65536;
                                            object5 = new ForegroundColorSpan(n17);
                                            n17 = 33;
                                            spannableString.setSpan(object5, n10, n16, n17);
                                            object5 = ia_12.f;
                                            if (object5 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                                n14 = 0;
                                                object5 = null;
                                                f8 = 0.0f;
                                            }
                                            object5 = ((IncentivizeBottomSheetBinding)object5).idLossText;
                                            object5.setText((CharSequence)spannableString);
                                        }
                                        break block79;
                                    }
                                    object5 = ia_12.f;
                                    if (object5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                                        n14 = 0;
                                        object5 = null;
                                        f8 = 0.0f;
                                    }
                                    object5 = ((IncentivizeBottomSheetBinding)object5).idLossText;
                                    object3 = StringCompanionObject.INSTANCE;
                                    object3 = h40_0.a;
                                    string3 = h40_0.F().optString(string3);
                                    Intrinsics.checkNotNullExpressionValue(string3, (String)object9);
                                    object9 = new Object[n7];
                                    object9[0] = object3 = "";
                                    n40_0.a(object9, n7, string3, (String)object10, (AjioTextView)object5);
                                }
                            }
                            object8 = h40_0.a;
                            object8 = h40_0.F();
                            n8 = object8.optBoolean("callout1");
                            object9 = "returnsBreakupView";
                            if (n8 == 0) break block80;
                            object8 = ia_12.k;
                            string3 = "discountData";
                            object10 = "nonRefundableData";
                            if (!(object8 != null && (n8 = ((String)object8).length()) != 0 || (object8 = ia_12.l) != null && (n8 = ((String)object8).length()) != 0)) break block81;
                            object8 = ia_12.k;
                            object9 = "clDiscountFee";
                            object5 = "cvNonRefundFee";
                            if (object8 == null || (n8 = ((String)object8).length()) == 0 || (object8 = ia_12.l) == null || (n8 = ((String)object8).length()) == 0) break block82;
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).cvNonRefundFee;
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object5);
                            ai0_2.B((View)object8);
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).clDiscountFee;
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object9);
                            ai0_2.B((View)object8);
                            break block83;
                        }
                        object8 = ia_12.k;
                        object3 = "clHorizentalRefundableFeeView";
                        if (object8 != null && (n8 = ((String)object8).length()) != 0 && ((object8 = ia_12.l) == null || (n8 = ((String)object8).length()) == 0)) {
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).cvNonRefundFee;
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object5);
                            ai0_2.i((View)object8);
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).clDiscountFee;
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object9);
                            ai0_2.i((View)object8);
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).clHorizentalRefundableFeeView;
                            Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
                            gp0_1.c((View)object8);
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).horizontalRefundablePrice;
                            object9 = ia_12.k;
                            if (object9 != null) {
                                f5 = Float.parseFloat((String)object9);
                            }
                            n3 = Math.round(f5);
                            object9 = qz2_0.v(n3);
                            object8.setText((CharSequence)object9);
                            object9 = ia_12.i;
                            if (object9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                                n3 = 0;
                                object9 = null;
                            }
                            object8 = new vk1_0((LinkedHashMap)object9);
                            ia_12.e = object8;
                            object8 = ia_12.f;
                            if (object8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n8 = 0;
                                object8 = null;
                            }
                            object8 = ((IncentivizeBottomSheetBinding)object8).rvHorizentalRefundableDetails;
                            object9 = ia_12.e;
                            ((RecyclerView)object8).setAdapter((RecyclerView$f)object9);
                            break block83;
                        } else {
                            object8 = ia_12.k;
                            if ((object8 == null || (n8 = ((String)object8).length()) == 0) && (object8 = ia_12.l) != null && (n8 = ((String)object8).length()) != 0) {
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).cvNonRefundFee;
                                Intrinsics.checkNotNullExpressionValue(object8, (String)object5);
                                ai0_2.i((View)object8);
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).clDiscountFee;
                                Intrinsics.checkNotNullExpressionValue(object8, (String)object9);
                                ai0_2.i((View)object8);
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).clHorizentalRefundableFeeView;
                                Intrinsics.checkNotNullExpressionValue(object8, (String)object3);
                                gp0_1.c((View)object8);
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).horizontalRefundableText;
                                n3 = R$string.discount_coupon;
                                object9 = ia_12.getString(n3);
                                object8.setText((CharSequence)object9);
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).horizontalRefundablePrice;
                                object9 = ia_12.l;
                                if (object9 != null) {
                                    f5 = Float.parseFloat((String)object9);
                                }
                                n3 = Math.round(f5);
                                object9 = qz2_0.v(n3);
                                object8.setText((CharSequence)object9);
                                object9 = ia_12.j;
                                if (object9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                                    n3 = 0;
                                    object9 = null;
                                }
                                ia_12.e = object8 = new vk1_0((LinkedHashMap)object9);
                                object8 = ia_12.f;
                                if (object8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                    n8 = 0;
                                    object8 = null;
                                }
                                object8 = ((IncentivizeBottomSheetBinding)object8).rvHorizentalRefundableDetails;
                                object9 = ia_12.e;
                                ((RecyclerView)object8).setAdapter((RecyclerView$f)object9);
                            }
                        }
                        break block83;
                    }
                    object8 = ia_12.f;
                    if (object8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = ((IncentivizeBottomSheetBinding)object8).returnsBreakupView;
                    Intrinsics.checkNotNullExpressionValue(object8, (String)object9);
                    ai0_2.i((View)object8);
                }
                object8 = ia_12.i;
                if (object8 != null && (n8 = object8.isEmpty() ^ n7) != 0) {
                    object9 = ia_12.i;
                    if (object9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object10);
                        n3 = 0;
                        object9 = null;
                    }
                    object8 = new vk1_0((LinkedHashMap)object9);
                    ia_12.c = object8;
                    object8 = ia_12.f;
                    if (object8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n8 = 0;
                        object8 = null;
                    }
                    object8 = ((IncentivizeBottomSheetBinding)object8).rvNonRefund;
                    object9 = ia_12.c;
                    ((RecyclerView)object8).setAdapter((RecyclerView$f)object9);
                }
                if ((object8 = ia_12.j) != null && (n7 ^= (n8 = (int)(object8.isEmpty() ? 1 : 0))) != 0) {
                    object8 = ia_12.j;
                    if (object8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n8 = 0;
                        object8 = null;
                    }
                    ia_12.d = object = new vk1_0((LinkedHashMap)object8);
                    object = ia_12.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object = null;
                    }
                    object = ((IncentivizeBottomSheetBinding)object).rvDiscountFee;
                    object8 = ia_12.d;
                    ((RecyclerView)object).setAdapter((RecyclerView$f)object8);
                }
                break block84;
            }
            object = ia_12.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object = null;
            }
            object = ((IncentivizeBottomSheetBinding)object).returnsBreakupView;
            Intrinsics.checkNotNullExpressionValue(object, (String)object9);
            ai0_2.i((View)object);
        }
        if ((n7 = (object = h40_0.F()).optBoolean((String)object7)) == 0) {
            object = AnalyticsManager.Companion;
            object5 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
            String string4 = cv_0.a((AnalyticsManager$Companion)object);
            String string5 = bv_0.a((AnalyticsManager$Companion)object);
            object = this.Pa();
            object8 = "return_fee";
            n3 = ia_12.o;
            object.putInt((String)object8, n3);
            int n18 = 1572;
            object4 = "";
            object3 = "";
            n4 = 0;
            spannableString = null;
            object2 = "screen_view";
            String string6 = "return and exchange nudge bottom card";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, (String)object4, (String)object3, null, (String)object2, string6, null, string5, (Bundle)object, string4, false, null, n18, null);
        }
        if ((object = ia_12.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).lottieAnimation.f();
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).idRefundableViewmore.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).idRefundableViewless.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).idDiscountViewmore.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).idDiscountViewless.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).horizontalViewmore.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).horizentalRefundableViewless.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).closeDialog.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        ((IncentivizeBottomSheetBinding)object).tvProceedReturn.setOnClickListener(ia_12);
        object = ia_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object6 = object;
        }
        ((IncentivizeBottomSheetBinding)object6).tvProceedExchange.setOnClickListener(ia_12);
    }
}

