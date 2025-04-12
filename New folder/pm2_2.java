/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ReturnFeeBottomSheetLayoutBinding;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Howitworks;
import com.ril.ajio.services.data.Cart.PossibleActions;
import com.ril.ajio.services.data.Cart.Value;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from PM2
 */
public final class pm2_2
extends BottomSheetDialogFragment {
    public static final PM2$a Companion;
    public static final /* synthetic */ gn1_2[] c;
    public ActionContent a;
    public final cc3_2 b;

    static {
        Object object = jz.a(pm2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/ReturnFeeBottomSheetLayoutBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        c = gn1_2Array;
        Companion = object = new Object();
    }

    public pm2_2() {
        cc3_2 cc3_22;
        this.b = cc3_22 = z80_0.c(pm2$b_0.a, this);
    }

    public static void Pa(String string2) {
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
        String string3 = analyticsManager$Companion.getInstance().getNewCustomEventsRevamp().getRETURN_FEE_HALF_CARD_INTERACTION();
        String string4 = bv_0.a(analyticsManager$Companion);
        String string5 = cv_0.a(analyticsManager$Companion);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "return fee halfcard interaction", string2, null, string3, "return fee halfcard screen", null, string4, null, string5, false, null, 1700, null);
    }

    public final ReturnFeeBottomSheetLayoutBinding Oa() {
        Object object = c[0];
        object = this.b.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (ReturnFeeBottomSheetLayoutBinding)object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        om2_0 om2_02 = new om2_0((BottomSheetDialog)object, this);
        object.setOnShowListener((DialogInterface.OnShowListener)om2_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        int n4;
        String string2;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        if (object != null) {
            string2 = "EntryPoint";
            object = object.getString(string2);
        }
        object = this.getArguments();
        string2 = null;
        if (object != null) {
            n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            if (n4 >= n7) {
                object = dh2_1.a(object);
            } else {
                String string3 = "actionContent";
                n4 = (object = object.getSerializable(string3)) instanceof ActionContent;
                if (n4 == 0) {
                    n3 = 0;
                    object = null;
                }
                object = (ActionContent)object;
            }
            object = (ActionContent)object;
        } else {
            n3 = 0;
            object = null;
        }
        n4 = object instanceof ActionContent;
        if (n4 != 0) {
            string2 = object;
        }
        this.a = (ActionContent)((Object)string2);
        n3 = R$layout.return_fee_bottom_sheet_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        int n4;
        pm2_2 pm2_22 = this;
        int n7 = 2;
        int n8 = 1;
        float f5 = Float.MIN_VALUE;
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object2 = this.Oa().rvpBottomSheetItem.layoutSeekBar;
        Intrinsics.checkNotNullExpressionValue(object2, "layoutSeekBar");
        ai0_2.i((View)object2);
        object2 = this.Oa().rvpBottomSheetItem.possibleActionsHeadingText;
        Intrinsics.checkNotNullExpressionValue(object2, "possibleActionsHeadingText");
        ai0_2.i((View)object2);
        object2 = this.Oa().rvpBottomSheetItem.layoutPossibleActionItems;
        Intrinsics.checkNotNullExpressionValue(object2, "layoutPossibleActionItems");
        ai0_2.i((View)object2);
        object2 = this.Oa().rvpBottomSheetItem.headerTitle;
        object = this.a;
        Object object3 = "";
        if (object == null || (object = ((ActionContent)object).getReturn_fee_half_card_title()) == null) {
            object = object3;
        }
        object2.setText((CharSequence)object);
        object2 = this.Oa().rvpBottomSheetItem.headerSubTitle;
        object = pm2_22.a;
        if (object == null || (object = ((ActionContent)object).getReturn_fee_half_card_desc()) == null) {
            object = object3;
        }
        object2.setText((CharSequence)object);
        object2 = pm2_22.a;
        object = null;
        if (object2 != null) {
            object2 = ((ActionContent)object2).getReturn_fee_half_card_cta();
        } else {
            n4 = 0;
            object2 = null;
        }
        Object object4 = "btnOkay";
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = this.Oa().btnOkay;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            ai0_2.B((View)object2);
            object2 = this.Oa().btnOkay;
            object4 = pm2_22.a;
            if (object4 == null || (object4 = ((ActionContent)object4).getReturn_fee_half_card_cta()) == null) {
                object4 = object3;
            }
            object2.setText((CharSequence)object4);
        } else {
            object2 = this.Oa().btnOkay;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            ai0_2.i((View)object2);
        }
        object2 = pm2_22.a;
        if (object2 == null || (object2 = ((ActionContent)object2).getReturn_fee_section_desc()) == null) {
            object2 = object3;
        }
        object4 = pm2_22.a;
        int n10 = 0;
        if (object4 != null && (object4 = ((ActionContent)object4).getReturn_fee()) != null) {
            float f6 = ((Float)object4).floatValue();
            n3 = (int)f6;
        } else {
            n3 = 0;
            float f7 = 0.0f;
            object4 = null;
        }
        Object object5 = "{return_fee}";
        if (n3 > 0) {
            AjioTextView ajioTextView = this.Oa().rvpBottomSheetItem.rvpCautionText;
            object4 = String.valueOf(n3);
            object2 = kotlin.text.b.n((String)object2, (String)object5, (String)object4, false);
            ajioTextView.setText((CharSequence)object2);
        } else {
            object4 = this.Oa().rvpBottomSheetItem.rvpCautionText;
            object2 = kotlin.text.b.n((String)object2, (String)object5, (String)object3, false);
            object4.setText((CharSequence)object2);
        }
        object2 = this.Oa().rvpBottomSheetItem.howItWorksHeadingText;
        object4 = pm2_22.a;
        if (object4 == null || (object4 = ((ActionContent)object4).getHowitworks()) == null || (object4 = ((Howitworks)object4).getTitle()) == null) {
            object4 = object3;
        }
        object2.setText((CharSequence)object4);
        object2 = this.Oa().rvpBottomSheetItem.howItWorksSubText;
        object4 = pm2_22.a;
        if (object4 != null && (object4 = ((ActionContent)object4).getHowitworks()) != null && (object4 = ((Howitworks)object4).getDesc()) != null) {
            object3 = object4;
        }
        object2.setText((CharSequence)object3);
        object2 = pm2_22.a;
        if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
            object2 = ((PossibleActions)object2).getTitle();
        } else {
            n4 = 0;
            object2 = null;
        }
        object3 = "avoidPenalityHeadingText";
        if (object2 != null && (n4 = ((String)object2).length()) != 0) {
            object2 = this.Oa().rvpBottomSheetItem.avoidPenalityHeadingText;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ai0_2.B((View)object2);
            object2 = this.Oa().rvpBottomSheetItem.avoidPenalityHeadingText;
            object3 = pm2_22.a;
            object3 = object3 != null && (object3 = ((ActionContent)object3).getPossibleActions()) != null ? ((PossibleActions)object3).getTitle() : null;
            object2.setText((CharSequence)object3);
        } else {
            object2 = this.Oa().rvpBottomSheetItem.avoidPenalityHeadingText;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ai0_2.i((View)object2);
        }
        object2 = pm2_22.a;
        if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null) {
            object2 = ((PossibleActions)object2).getValues();
        } else {
            n4 = 0;
            object2 = null;
        }
        object2 = (Collection)object2;
        object3 = "layoutPenaltyParent";
        if (object2 != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
            object2 = this.Oa().rvpBottomSheetItem.layoutPenaltyParent;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ai0_2.B((View)object2);
            object2 = pm2_22.a;
            object3 = "layoutPenalty1";
            if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null && (object2 = (Value)CollectionsKt.N(0, (List)object2)) != null) {
                object4 = this.Oa().rvpBottomSheetItem.layoutPenalty1;
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                ai0_2.B((View)object4);
                object3 = this.Oa().rvpBottomSheetItem.avoidPenalitySubText1;
                object4 = ((Value)object2).getText();
                object3.setText((CharSequence)object4);
                object3 = new da$a();
                ((da$a)object3).k = n8;
                ((da$a)object3).r = n8;
                n3 = R$string.acc_banner;
                object4 = hv3_0.K(n3);
                ((da$a)object3).b((String)object4);
                object4 = UrlHelper.Companion.getInstance();
                object2 = ((Value)object2).getImageUrl();
                object2 = ((UrlHelper)object4).getImageUrl((String)object2);
                object4 = this.Oa().rvpBottomSheetItem.avoidPenalityImage1;
                ((da$a)object3).n = object2;
                ((da$a)object3).u = object4;
                ((da$a)object3).a();
            } else {
                object2 = this.Oa().rvpBottomSheetItem.layoutPenalty1;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                ai0_2.i((View)object2);
                object2 = Unit.a;
            }
            object2 = pm2_22.a;
            object3 = "layoutPenalty2";
            if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null && (object2 = (Value)CollectionsKt.N(n8, (List)object2)) != null) {
                object4 = this.Oa().rvpBottomSheetItem.layoutPenalty2;
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                ai0_2.B((View)object4);
                object3 = this.Oa().rvpBottomSheetItem.avoidPenalitySubText2;
                object4 = ((Value)object2).getText();
                object3.setText((CharSequence)object4);
                object3 = new da$a();
                ((da$a)object3).k = n8;
                ((da$a)object3).r = n8;
                n3 = R$string.acc_banner;
                object4 = hv3_0.K(n3);
                ((da$a)object3).b((String)object4);
                object4 = UrlHelper.Companion.getInstance();
                object2 = ((Value)object2).getImageUrl();
                object2 = ((UrlHelper)object4).getImageUrl((String)object2);
                object4 = this.Oa().rvpBottomSheetItem.avoidPenalityImage2;
                ((da$a)object3).n = object2;
                ((da$a)object3).u = object4;
                ((da$a)object3).a();
            } else {
                object2 = this.Oa().rvpBottomSheetItem.layoutPenalty2;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                ai0_2.i((View)object2);
                object2 = Unit.a;
            }
            object2 = pm2_22.a;
            object3 = "layoutPenalty3";
            if (object2 != null && (object2 = ((ActionContent)object2).getPossibleActions()) != null && (object2 = ((PossibleActions)object2).getValues()) != null && (object2 = (Value)CollectionsKt.N(n7, (List)object2)) != null) {
                object4 = this.Oa().rvpBottomSheetItem.layoutPenalty3;
                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                ai0_2.B((View)object4);
                object3 = this.Oa().rvpBottomSheetItem.avoidPenalitySubText3;
                object4 = ((Value)object2).getText();
                object3.setText((CharSequence)object4);
                object3 = new da$a();
                ((da$a)object3).k = n8;
                ((da$a)object3).r = n8;
                n3 = R$string.acc_banner;
                object4 = hv3_0.K(n3);
                ((da$a)object3).b((String)object4);
                object4 = UrlHelper.Companion.getInstance();
                object2 = ((Value)object2).getImageUrl();
                object2 = ((UrlHelper)object4).getImageUrl((String)object2);
                object4 = this.Oa().rvpBottomSheetItem.avoidPenalityImage3;
                ((da$a)object3).n = object2;
                ((da$a)object3).u = object4;
                ((da$a)object3).a();
            } else {
                object2 = this.Oa().rvpBottomSheetItem.layoutPenalty3;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                ai0_2.i((View)object2);
                object2 = Unit.a;
            }
        } else {
            object2 = this.Oa().rvpBottomSheetItem.layoutPenaltyParent;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ai0_2.i((View)object2);
            object2 = Unit.a;
        }
        object2 = this.Oa().rvpCloseDialog;
        object3 = new ix0_1(pm2_22, n8);
        object2.setOnClickListener((View.OnClickListener)object3);
        Object object6 = this.Oa().btnOkay;
        object2 = new kh0_0(pm2_22, n7);
        object6.setOnClickListener((View.OnClickListener)object2);
        Bundle bundle2 = new Bundle();
        object6 = pm2_22.a;
        if (object6 != null) {
            object6 = ((ActionContent)object6).getProductId();
        } else {
            n8 = 0;
            object6 = null;
            f5 = 0.0f;
        }
        object2 = "product_id";
        bundle2.putString((String)object2, (String)object6);
        object6 = pm2_22.a;
        if (object6 != null) {
            object = ((ActionContent)object6).getOrderId();
        }
        bundle2.putString("order_id", (String)object);
        object6 = pm2_22.a;
        if (object6 != null && (object6 = ((ActionContent)object6).getReturn_fee()) != null) {
            f5 = ((Float)object6).floatValue();
            n10 = (int)f5;
        }
        bundle2.putInt("return_fee", n10);
        object6 = AnalyticsManager.Companion;
        object5 = ((AnalyticsManager$Companion)object6).getInstance().getNewCustomEventsRevamp();
        String string2 = cv_0.a((AnalyticsManager$Companion)object6);
        String string3 = bv_0.a((AnalyticsManager$Companion)object6);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, "", "", null, "screen_view", "return fee halfcard screen", null, string3, bundle2, string2, false, null, 1572, null);
    }
}

