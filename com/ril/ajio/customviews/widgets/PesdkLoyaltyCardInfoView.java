/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$BankOfferClickableSpan;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$Companion;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$CustomClickableSpan;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.PesdkLoyaltyCardInfoView$RegisterClickableSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class PesdkLoyaltyCardInfoView
extends FrameLayout {
    public static final int $stable = 0;
    public static final int COLLAPSE_LOYALTY_VIEW = 1;
    public static final PesdkLoyaltyCardInfoView$Companion Companion;
    private Typeface boldFont;
    private PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener cardClickListener;
    private ImageView imvLoyalty;
    private View layoutLoyalty;
    private View layoutLoyaltyOffer;
    private View layoutOffer;
    private LpStoredCardBalance lpStoredCardBalance;
    private OfferDetails offerDetails;
    private Typeface regularFont;
    private TextView tvLoyaltyPoints;
    private TextView tvOffer;

    static {
        PesdkLoyaltyCardInfoView$Companion pesdkLoyaltyCardInfoView$Companion;
        Companion = pesdkLoyaltyCardInfoView$Companion = new PesdkLoyaltyCardInfoView$Companion(null);
        $stable = 8;
    }

    public PesdkLoyaltyCardInfoView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.initView(context);
    }

    public PesdkLoyaltyCardInfoView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.initView(context);
    }

    public PesdkLoyaltyCardInfoView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.initView(context);
    }

    public PesdkLoyaltyCardInfoView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.initView(context);
    }

    public static final /* synthetic */ PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener access$getCardClickListener$p(PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView) {
        return pesdkLoyaltyCardInfoView.cardClickListener;
    }

    public static final /* synthetic */ LpStoredCardBalance access$getLpStoredCardBalance$p(PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView) {
        return pesdkLoyaltyCardInfoView.lpStoredCardBalance;
    }

    private final void initView(Context context) {
        View view;
        LayoutInflater layoutInflater;
        boolean bl2 = og1_1.b();
        int n3 = 1;
        if (bl2) {
            layoutInflater = LayoutInflater.from((Context)context);
            int n4 = R$layout.pesdk_lux_view_loyalty_point;
            layoutInflater = layoutInflater.inflate(n4, (ViewGroup)this, n3 != 0);
        } else {
            layoutInflater = LayoutInflater.from((Context)context);
            int n7 = R$layout.pesdk_view_loyalty_point;
            layoutInflater = layoutInflater.inflate(n7, (ViewGroup)this, n3 != 0);
        }
        n3 = R$id.loyalty_offer_layout;
        this.layoutLoyaltyOffer = view = layoutInflater.findViewById(n3);
        n3 = R$id.imv_loyalty;
        view = (ImageView)layoutInflater.findViewById(n3);
        this.imvLoyalty = view;
        n3 = R$id.tv_loyalty;
        view = (TextView)layoutInflater.findViewById(n3);
        this.tvLoyaltyPoints = view;
        n3 = R$id.layout_loyalty;
        this.layoutLoyalty = view = layoutInflater.findViewById(n3);
        n3 = R$id.layout_offer;
        this.layoutOffer = view = layoutInflater.findViewById(n3);
        n3 = R$id.tv_offer;
        layoutInflater = (TextView)layoutInflater.findViewById(n3);
        this.tvOffer = layoutInflater;
        layoutInflater = FontsManager.getInstance().getTypefaceWithFont(context, 9);
        this.regularFont = layoutInflater;
        context = FontsManager.getInstance().getTypefaceWithFont(context, 10);
        this.boldFont = context;
    }

    private final void setCollapseLoyaltyView(LpStoredCardBalance object) {
        float f5;
        int n3;
        int n4 = 1;
        Object object2 = this.imvLoyalty;
        Object object3 = "imvLoyalty";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        int n7 = R$drawable.pesdk_ic_percentage;
        Object object5 = hv3_0.r(n7);
        object2.setImageDrawable((Drawable)object5);
        object2 = this.imvLoyalty;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        object2.setOnClickListener(null);
        object2 = this.imvLoyalty;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        object2.setTag(null);
        n3 = og1_1.b();
        n3 = n3 != 0 ? hv3_0.m(R$color.pesdk_lux_color_3) : hv3_0.m(R$color.pesdk_color_3);
        object5 = AnalyticsManager.Companion;
        Object object6 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents();
        object5 = ((AnalyticsManager$Companion)object5).getInstance().getGtmEvents().getScreenName();
        String string2 = "MessageTicker";
        String string3 = "Use LR Points to Pay for this order";
        ((GTMEvents)object6).pushButtonTapEvent(string2, string3, (String)object5);
        object5 = ((LpStoredCardBalance)object).getLoyaltyPoints();
        int n8 = 0;
        float f6 = 0.0f;
        object6 = null;
        if (object5 != null) {
            f5 = ((Float)object5).floatValue();
        } else {
            n7 = 0;
            f5 = 0.0f;
            object5 = null;
        }
        int n10 = 6;
        string3 = "layoutLoyalty";
        int n14 = 18;
        String string4 = "layoutLoyaltyOffer";
        String string5 = "tvLoyaltyPoints";
        String string6 = "";
        int n15 = 34;
        float f7 = f5 - 0.0f;
        n7 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n7 > 0) {
            boolean bl2;
            object3 = this.layoutLoyaltyOffer;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object3 = null;
            }
            object3.setVisibility(0);
            object3 = this.layoutLoyalty;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object3 = null;
            }
            object3.setVisibility(0);
            bl2 = og1_1.b();
            object5 = "format(...)";
            if (bl2) {
                object3 = StringCompanionObject.INSTANCE;
                if ((object = ((LpStoredCardBalance)object).getLoyaltyPoints()) != null) {
                    f6 = ((Float)object).floatValue();
                }
                object = hv3_0.v(f6);
                object3 = new Object[n4];
                object3[0] = object;
                object = xh2_0.a((Object[])object3, n4, "Loylty Rewardz worth \u20b9%s can be used on this card for this purchase.", (String)object5);
            } else {
                object3 = StringCompanionObject.INSTANCE;
                if ((object = ((LpStoredCardBalance)object).getLoyaltyPoints()) != null) {
                    f6 = ((Float)object).floatValue();
                }
                object = hv3_0.v(f6);
                object3 = new Object[n4];
                object3[0] = object;
                object = xh2_0.a((Object[])object3, n4, "Yay! You can use your \u20b9%s Loylty Rewardz Points to pay for this order.", (String)object5);
            }
            bl2 = og1_1.b();
            object5 = "View details";
            if (bl2) {
                object3 = Locale.getDefault();
                object6 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object6);
                object5 = ((String)object5).toUpperCase((Locale)object3);
                object3 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            }
            object6 = n1.a((String)object, " ", (String)object5);
            object3 = new SpannableStringBuilder((CharSequence)object6);
            object6 = "to";
            n8 = StringsKt.R((CharSequence)object, (String)object6, 0, n10);
            int n16 = ((String)object).length();
            n7 = ((String)object5).length() + n16 + n4;
            string2 = this.regularFont;
            Object object7 = new AjioCustomTypefaceSpan(string6, (Typeface)string2);
            object3.setSpan(object7, 0, n7, n15);
            n4 = (int)(og1_1.b() ? 1 : 0);
            if (n4 == 0) {
                string2 = this.boldFont;
                object7 = new AjioCustomTypefaceSpan(string6, (Typeface)string2);
                n10 = 21;
                object3.setSpan(object7, n10, n8, n15);
            }
            object6 = this.boldFont;
            object7 = new AjioCustomTypefaceSpan(string6, (Typeface)object6);
            object3.setSpan(object7, n16, n7, n15);
            object7 = new ForegroundColorSpan(n3);
            object3.setSpan(object7, n16, n7, n14);
            object7 = new PesdkLoyaltyCardInfoView$CustomClickableSpan(this);
            object3.setSpan(object7, n16, n7, n15);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n16 = 0;
                object = null;
            }
            object.setText((CharSequence)object3);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n16 = 0;
                object = null;
            }
            object7 = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)object7);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
            } else {
                object4 = object;
            }
            object4.setHighlightColor(0);
        } else {
            object = ((LpStoredCardBalance)object).getMobileNumberRegistered();
            Boolean bl3 = Boolean.TRUE;
            int n17 = Intrinsics.areEqual(object, bl3);
            n4 = 8;
            if (n17 == 0) {
                object = this.imvLoyalty;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n17 = 0;
                    object = null;
                }
                object.setVisibility(n4);
                object = this.layoutLoyaltyOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n17 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = this.layoutLoyalty;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n17 = 0;
                    object = null;
                }
                object.setVisibility(0);
                n17 = og1_1.b();
                object = n17 != 0 ? "Loylty Rewardz - enter REGISTERED PHONE NUMBER to use. VIEW DETAILS" : "Loylty Rewardz - enter registered phone number to use. View details";
                bl3 = new SpannableStringBuilder((CharSequence)object);
                int n18 = og1_1.b();
                if (n18 != 0) {
                    object3 = "REGISTERED";
                    n17 = StringsKt.O((CharSequence)object, (String)object3, 0, false, n10);
                } else {
                    object3 = "registered";
                    n17 = StringsKt.O((CharSequence)object, (String)object3, 0, false, n10);
                }
                n18 = n17 + 23;
                n7 = bl3.length();
                string2 = this.boldFont;
                object6 = new AjioCustomTypefaceSpan(string6, (Typeface)string2);
                bl3.setSpan(object6, n17, n18, n15);
                string2 = this.regularFont;
                object6 = new AjioCustomTypefaceSpan(string6, (Typeface)string2);
                bl3.setSpan(object6, n18, n7, n15);
                string2 = this.boldFont;
                object6 = new AjioCustomTypefaceSpan(string6, (Typeface)string2);
                n10 = n7 + -12;
                bl3.setSpan(object6, n10, n7, n15);
                object6 = new ForegroundColorSpan(n3);
                bl3.setSpan(object6, n17, n18, n14);
                object6 = new ForegroundColorSpan(n3);
                bl3.setSpan(object6, n10, n7, n14);
                object2 = new PesdkLoyaltyCardInfoView$RegisterClickableSpan(this);
                bl3.setSpan(object2, n17, n18, n15);
                object = new PesdkLoyaltyCardInfoView$CustomClickableSpan(this);
                bl3.setSpan(object, n10, n7, n15);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n17 = 0;
                    object = null;
                }
                object.setText((CharSequence)((Object)bl3));
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n17 = 0;
                    object = null;
                }
                bl3 = LinkMovementMethod.getInstance();
                object.setMovementMethod((MovementMethod)bl3);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                } else {
                    object4 = object;
                }
                object4.setHighlightColor(0);
            } else {
                object = this.offerDetails;
                if (object == null) {
                    object = this.layoutLoyaltyOffer;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        object4 = object;
                    }
                    object4.setVisibility(n4);
                }
            }
        }
    }

    private final void setOfferView(OfferDetails offerDetails, String string2) {
        float f5;
        Object object;
        PesdkLoyaltyCardInfoView pesdkLoyaltyCardInfoView = this;
        Serializable serializable = offerDetails;
        int n3 = 0;
        Object object2 = null;
        if (offerDetails != null && (object = offerDetails.getOfferAmountApplied()) != null) {
            f5 = ((Float)object).floatValue();
        } else {
            f5 = 0.0f;
            object = null;
        }
        Object object3 = "layoutOffer";
        String string3 = "layoutLoyaltyOffer";
        Serializable serializable2 = null;
        float f6 = f5 - 0.0f;
        n3 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
        if (n3 > 0) {
            if (serializable != null) {
                object2 = offerDetails.getInstantDiscountMsg();
            } else {
                n3 = 0;
                object2 = null;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
            if (n3 == 0) {
                String string4;
                Object object4;
                Object object5;
                int n4;
                Object object6;
                Object object7;
                boolean bl2;
                n3 = (int)(og1_1.b() ? 1 : 0);
                n3 = n3 != 0 ? hv3_0.m(R$color.pesdk_lux_color_3) : hv3_0.m(R$color.pesdk_color_3);
                object = pesdkLoyaltyCardInfoView.layoutLoyaltyOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object = null;
                    f5 = 0.0f;
                }
                string3 = null;
                object.setVisibility(0);
                object = pesdkLoyaltyCardInfoView.layoutOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    object = null;
                    f5 = 0.0f;
                }
                object.setVisibility(0);
                object = "";
                if (serializable == null || (object3 = offerDetails.getInstantDiscountMsg()) == null) {
                    object3 = object;
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)object3))) {
                    object7 = new Bundle();
                    if (serializable != null) {
                        object6 = offerDetails.getOfferAmountApplied();
                    } else {
                        n4 = 0;
                        object6 = null;
                    }
                    object6 = String.valueOf(object6);
                    object7.putString("instant_discount", (String)object6);
                    object6 = AnalyticsManager.Companion;
                    object5 = ((AnalyticsManager$Companion)object6).getInstance().getNewCustomEventsRevamp();
                    String string5 = cv_0.a((AnalyticsManager$Companion)object6);
                    int n7 = 1600;
                    String string6 = "instant_discount_load";
                    String string7 = "single page checkout";
                    String string8 = "single page checkout";
                    object6 = object5;
                    object5 = "checkout interactions";
                    object4 = "instant discount load";
                    string4 = string2;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object5, (String)object4, string2, string6, string7, string8, null, object7, string5, false, null, n7, null);
                }
                bl2 = og1_1.b();
                object6 = "View details";
                if (bl2) {
                    object7 = Locale.getDefault();
                    object5 = "getDefault(...)";
                    Intrinsics.checkNotNullExpressionValue(object7, (String)object5);
                    object6 = ((String)object6).toUpperCase((Locale)object7);
                    object7 = "toUpperCase(...)";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                }
                object6 = n1.a((String)object3, " ", (String)object6);
                object7 = new SpannableStringBuilder((CharSequence)object6);
                int n8 = ((String)object3).length();
                n4 = object7.length();
                object4 = pesdkLoyaltyCardInfoView.regularFont;
                object5 = new AjioCustomTypefaceSpan((String)object, (Typeface)object4);
                int n10 = 34;
                object7.setSpan(object5, 0, n8, n10);
                string4 = pesdkLoyaltyCardInfoView.boldFont;
                object5 = new AjioCustomTypefaceSpan((String)object, (Typeface)string4);
                object7.setSpan(object5, n8, n4, n10);
                object = new ForegroundColorSpan(n3);
                n3 = 18;
                object7.setSpan(object, n8, n4, n3);
                object2 = new PesdkLoyaltyCardInfoView$BankOfferClickableSpan(pesdkLoyaltyCardInfoView);
                object7.setSpan(object2, n8, n4, n10);
                object2 = pesdkLoyaltyCardInfoView.tvOffer;
                object = "tvOffer";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n3 = 0;
                    object2 = null;
                }
                object2.setText((CharSequence)object7);
                object2 = pesdkLoyaltyCardInfoView.tvOffer;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    n3 = 0;
                    object2 = null;
                }
                object2.setTag((Object)serializable);
                serializable = pesdkLoyaltyCardInfoView.tvOffer;
                if (serializable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    serializable = null;
                }
                object2 = LinkMovementMethod.getInstance();
                serializable.setMovementMethod((MovementMethod)object2);
                serializable = pesdkLoyaltyCardInfoView.tvOffer;
                if (serializable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    serializable2 = serializable;
                }
                serializable2.setHighlightColor(0);
                return;
            }
        }
        if ((serializable = pesdkLoyaltyCardInfoView.layoutOffer) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            serializable = null;
        }
        n3 = 8;
        serializable.setVisibility(n3);
        serializable = pesdkLoyaltyCardInfoView.lpStoredCardBalance;
        if (serializable == null) {
            serializable = pesdkLoyaltyCardInfoView.layoutLoyaltyOffer;
            if (serializable == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                serializable2 = serializable;
            }
            serializable2.setVisibility(n3);
        }
    }

    public final void setCardClickListener(PesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener pesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener) {
        Intrinsics.checkNotNullParameter(pesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener, "clickListener");
        this.cardClickListener = pesdkLoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
    }

    public final void setData(LpStoredCardBalance object, OfferDetails offerDetails, int n3, String string2) {
        int n4;
        block13: {
            Object object2;
            Serializable serializable;
            block12: {
                float f5;
                int n7;
                float f6;
                String string3 = "paymentMethodFormedString";
                Intrinsics.checkNotNullParameter(string2, string3);
                this.lpStoredCardBalance = object;
                n4 = 8;
                serializable = null;
                if (object == null && offerDetails == null) {
                    object = this.layoutLoyaltyOffer;
                    if (object == null) {
                        object = "layoutLoyaltyOffer";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        serializable = object;
                    }
                    serializable.setVisibility(n4);
                    return;
                }
                if (object == null) break block12;
                object2 = ((LpStoredCardBalance)object).getLoyaltyPoints();
                Boolean bl2 = null;
                if (object2 != null) {
                    f6 = ((Float)object2).floatValue();
                } else {
                    n7 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
                n7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                if (n7 > 0 || (n7 = (int)(Intrinsics.areEqual(object2 = ((LpStoredCardBalance)object).getMobileNumberRegistered(), bl2 = Boolean.TRUE) ? 1 : 0)) == 0) break block13;
            }
            if ((object2 = this.layoutLoyalty) == null) {
                object2 = "layoutLoyalty";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                serializable = object2;
            }
            serializable.setVisibility(n4);
        }
        if (n3 == (n4 = 1)) {
            if (object != null) {
                this.setCollapseLoyaltyView((LpStoredCardBalance)object);
            }
            this.setOfferView(offerDetails, string2);
        }
    }
}

