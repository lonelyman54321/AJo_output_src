/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.services.data.Payment.OfferDetails;
import com.ril.ajio.services.data.Payment.PayNowRequest;
import com.ril.ajio.services.data.Payment.PriceValidation;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.Payment.UPI;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Pc0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Pc0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object;
                int n4;
                Object object2 = (ss2_2)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = ((ss2_2)object2).i.getText();
                Object object4 = null;
                Object object5 = ((ss2_2)object2).m;
                if (object3 != null && (n4 = ((String)(object = object3.toString())).length()) != 0) {
                    object = oo2_0.a;
                    Object object6 = object3.toString();
                    object.getClass();
                    if (object6 != null && (n4 = ((String)object6).length()) != 0 && (n4 = (int)(StringsKt.F((CharSequence)object6, (CharSequence)(object = "@"), false) ? 1 : 0)) != 0) {
                        object4 = ((ss2_2)object2).v;
                        ((cu3)object4).m = null;
                        object5 = ((ss2_2)object2).t;
                        object = ((ss2_2)object2).b;
                        if (object5 != null) {
                            object3 = ((ss2_2)object2).c;
                            object4 = object3.n8();
                            if (object4 != null && object != null) {
                                object2 = ((ss2_2)object2).t;
                                float f5 = object3.D();
                                object3 = Float.valueOf(f5);
                                object3 = oo2_0.q((UPI)object2, (TenantResponse)object4, (Float)object3);
                                object.I2((UPI)object2, (PayNowRequest)object3);
                            }
                        } else {
                            boolean bl2;
                            String string2 = null;
                            String string3 = null;
                            int n7 = 255;
                            object6 = object5;
                            object5 = new UPI(null, null, null, null, null, null, null, null, n7, null);
                            object3 = object3.toString();
                            ((UPI)object5).setVpa((String)object3);
                            object3 = ((ss2_2)object2).l;
                            boolean bl3 = object3.isChecked();
                            object6 = bl3;
                            ((UPI)object5).setSaveUPI((Boolean)object6);
                            object4 = ((cu3)object4).n;
                            object6 = ((UPI)object4).getOfferDetails();
                            ((UPI)object5).setOfferDetails((OfferDetails)object6);
                            object4 = ((UPI)object4).getPriceValidation();
                            ((UPI)object5).setPriceValidation((PriceValidation)object4);
                            if (object != null) {
                                object.g9((UPI)object5);
                            }
                            object3 = (bl2 = object3.isChecked()) ? "check" : "uncheck";
                            if (object != null) {
                                object2 = ((ss2_2)object2).q;
                                object6 = ((NewCustomEventsRevamp)object2).getEC_CHECKOUT_INTERACTIONS();
                                string3 = "spc_interactions";
                                string2 = "save upi for faster checkout";
                                object.g((String)object6, string2, (String)object3, null, string3);
                            }
                        }
                    } else {
                        n3 = R$string.enter_valid_upi;
                        object2 = hv3_0.K(n3);
                        object5.setText((CharSequence)object2);
                        object5.setVisibility(0);
                        ai0_2.a((View)object5);
                    }
                } else {
                    n3 = R$string.enter_valid_upi;
                    object2 = hv3_0.K(n3);
                    object5.setText((CharSequence)object2);
                    object5.setVisibility(0);
                    ai0_2.a((View)object5);
                }
                return;
            }
            case 1: {
                FeedbackRatingSnackbar feedbackRatingSnackbar = (FeedbackRatingSnackbar)this.b;
                Intrinsics.checkNotNullParameter(feedbackRatingSnackbar, "$snackbar");
                feedbackRatingSnackbar.dismiss();
                return;
            }
            case 0: 
        }
        sc0_2 sc0_22 = (sc0_2)this.b;
        Intrinsics.checkNotNullParameter(sc0_22, "this$0");
        sc0_22.Pa().dismiss();
    }
}

