/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
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
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.graphics.Color;
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
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$AddCardLoyaltyClickListener;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$BankOfferClickableSpan;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$Companion;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$CustomClickableSpan;
import com.ril.ajio.customviews.widgets.AddCardLoyaltyView$RegisterClickableSpan;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import java.io.Serializable;
import java.lang.constant.Constable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class AddCardLoyaltyView
extends FrameLayout
implements View.OnClickListener {
    public static final int $stable = 0;
    public static final AddCardLoyaltyView$Companion Companion;
    public static final int LOYALTY_VIEW = 1;
    public static final int OFFER_VIEW = 2;
    private AddCardLoyaltyView$AddCardLoyaltyClickListener cardClickListener;
    private ImageView imvLoyalty;
    private ImageView imvOffer;
    private View layoutLoyalty;
    private View layoutLoyaltyOffer;
    private View layoutOffer;
    private LpStoredCardBalance lpStoredCardBalance;
    private OfferDetails offerDetail;
    private Typeface sSPRegular;
    private Typeface sSPSemiBold;
    private TextView tvLoyaltyBalance;
    private TextView tvLoyaltyPoints;
    private TextView tvOffer;

    static {
        AddCardLoyaltyView$Companion addCardLoyaltyView$Companion;
        Companion = addCardLoyaltyView$Companion = new AddCardLoyaltyView$Companion(null);
        $stable = 8;
    }

    public AddCardLoyaltyView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.initView(context);
    }

    public AddCardLoyaltyView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.initView(context);
    }

    public AddCardLoyaltyView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.initView(context);
    }

    public AddCardLoyaltyView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.initView(context);
    }

    public static final /* synthetic */ AddCardLoyaltyView$AddCardLoyaltyClickListener access$getCardClickListener$p(AddCardLoyaltyView addCardLoyaltyView) {
        return addCardLoyaltyView.cardClickListener;
    }

    public static final /* synthetic */ OfferDetails access$getOfferDetail$p(AddCardLoyaltyView addCardLoyaltyView) {
        return addCardLoyaltyView.offerDetail;
    }

    private final void initView(Context context) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        int n3 = R$layout.view_add_card_loyalty_point;
        boolean bl2 = true;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)this, bl2);
        n3 = R$id.loyalty_offer_layout;
        this.layoutLoyaltyOffer = view = layoutInflater.findViewById(n3);
        n3 = R$id.imv_loyalty;
        view = (ImageView)layoutInflater.findViewById(n3);
        this.imvLoyalty = view;
        n3 = R$id.tv_loyalty;
        view = (TextView)layoutInflater.findViewById(n3);
        this.tvLoyaltyPoints = view;
        n3 = R$id.tv_loyalty_balance;
        view = (TextView)layoutInflater.findViewById(n3);
        this.tvLoyaltyBalance = view;
        n3 = R$id.layout_loyalty;
        this.layoutLoyalty = view = layoutInflater.findViewById(n3);
        n3 = R$id.layout_offer;
        this.layoutOffer = view = layoutInflater.findViewById(n3);
        n3 = R$id.imv_offer;
        view = (ImageView)layoutInflater.findViewById(n3);
        this.imvOffer = view;
        n3 = R$id.tv_offer;
        layoutInflater = (TextView)layoutInflater.findViewById(n3);
        this.tvOffer = layoutInflater;
        layoutInflater = this.imvLoyalty;
        if (layoutInflater == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imvLoyalty");
            layoutInflater = null;
        }
        layoutInflater.setOnClickListener((View.OnClickListener)this);
        layoutInflater = FontsManager.getInstance().getTypefaceWithFont(context, 5);
        this.sSPRegular = layoutInflater;
        context = FontsManager.getInstance().getTypefaceWithFont(context, 8);
        this.sSPSemiBold = context;
    }

    private final void setCollapseLoyaltyView(LpStoredCardBalance object) {
        float f5;
        int n3;
        int n4 = 1;
        Object object2 = this.tvLoyaltyBalance;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvLoyaltyBalance");
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        int n7 = 8;
        object2.setVisibility(n7);
        object2 = ((LpStoredCardBalance)object).getLoyaltyPoints();
        int n8 = 0;
        float f6 = 0.0f;
        Object object4 = null;
        if (object2 != null) {
            f5 = object2.floatValue();
        } else {
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        int n10 = 18;
        String string2 = "#176d93";
        String string3 = "tvLoyaltyPoints";
        String string4 = "";
        int n14 = 34;
        float f7 = f5 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            object2 = AnalyticsManager.Companion;
            Object object5 = object2.getInstance().getGtmEvents();
            String string5 = "MessageTicker";
            String string6 = "Use LR Points to Pay for this order";
            ak0_0.a((AnalyticsManager$Companion)object2, (GTMEvents)object5, string5, string6);
            object2 = StringCompanionObject.INSTANCE;
            object = ((LpStoredCardBalance)object).getLoyaltyPoints();
            if (object != null) {
                f6 = ((Float)object).floatValue();
            }
            object = hv3_0.v(f6);
            object2 = new Object[n4];
            object2[0] = object;
            object = xh2_0.a((Object[])object2, n4, "Use \u20b9%s Loylty Rewardz Points to pay for this order.", "format(...)");
            object2 = ((String)object).concat(" View details");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object2);
            f5 = 8.4E-45f;
            object5 = "to";
            n3 = StringsKt.R((CharSequence)object, (String)object5, 0, 6);
            int n15 = ((String)object).length();
            n7 = n15 + 13;
            string5 = this.sSPRegular;
            object4 = new AjioCustomTypefaceSpan(string4, (Typeface)string5);
            spannableStringBuilder.setSpan(object4, 0, n7, n14);
            string5 = this.sSPSemiBold;
            object4 = new AjioCustomTypefaceSpan(string4, (Typeface)string5);
            int n16 = 21;
            spannableStringBuilder.setSpan(object4, n16, n3, n14);
            object4 = this.sSPSemiBold;
            object2 = new AjioCustomTypefaceSpan(string4, (Typeface)object4);
            spannableStringBuilder.setSpan(object2, n15, n7, n14);
            n8 = Color.parseColor((String)string2);
            object2 = new ForegroundColorSpan(n8);
            spannableStringBuilder.setSpan(object2, n15, n7, n10);
            object2 = new AddCardLoyaltyView$CustomClickableSpan(this);
            spannableStringBuilder.setSpan(object2, n15, n7, n14);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n15 = 0;
                object = null;
            }
            object.setText((CharSequence)spannableStringBuilder);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n15 = 0;
                object = null;
            }
            spannableStringBuilder = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)spannableStringBuilder);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            object3.setHighlightColor(0);
        } else {
            Boolean bl2;
            boolean bl3 = Intrinsics.areEqual(object = ((LpStoredCardBalance)object).getMobileNumberRegistered(), bl2 = Boolean.TRUE);
            if (!bl3) {
                object = this.imvLoyalty;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imvLoyalty");
                    bl3 = false;
                    object = null;
                }
                object.setVisibility(n7);
                object = new SpannableStringBuilder((CharSequence)"Enter registered number to use Loylty Rewardz Points. View details");
                n4 = object.length();
                Typeface typeface = this.sSPSemiBold;
                object2 = new AjioCustomTypefaceSpan(string4, typeface);
                n7 = 23;
                object.setSpan(object2, 0, n7, n14);
                object4 = this.sSPRegular;
                object2 = new AjioCustomTypefaceSpan(string4, (Typeface)object4);
                object.setSpan(object2, n7, n4, n14);
                object4 = this.sSPSemiBold;
                object2 = new AjioCustomTypefaceSpan(string4, (Typeface)object4);
                n8 = n4 + -12;
                object.setSpan(object2, n8, n4, n14);
                int n17 = Color.parseColor((String)string2);
                object2 = new ForegroundColorSpan(n17);
                object.setSpan(object2, 0, n7, n10);
                int n18 = Color.parseColor((String)string2);
                object2 = new ForegroundColorSpan(n18);
                object.setSpan(object2, n8, n4, n10);
                object2 = new AddCardLoyaltyView$RegisterClickableSpan(this);
                object.setSpan(object2, 0, n7, n14);
                object2 = new AddCardLoyaltyView$CustomClickableSpan(this);
                object.setSpan(object2, n8, n4, n14);
                bl2 = this.tvLoyaltyPoints;
                if (bl2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    bl2 = null;
                }
                bl2.setText((CharSequence)object);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl3 = false;
                    object = null;
                }
                bl2 = LinkMovementMethod.getInstance();
                object.setMovementMethod((MovementMethod)bl2);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object3 = object;
                }
                object3.setHighlightColor(0);
            } else {
                object = this.offerDetail;
                if (object == null) {
                    object = this.layoutLoyaltyOffer;
                    if (object == null) {
                        object = "layoutLoyaltyOffer";
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    } else {
                        object3 = object;
                    }
                    object3.setVisibility(n7);
                }
            }
        }
    }

    private final void setExpandedLoyaltyView(LpStoredCardBalance lpStoredCardBalance) {
        Object object;
        float f5;
        int n3;
        AddCardLoyaltyView addCardLoyaltyView = this;
        int n4 = 1;
        Object object2 = this.tvLoyaltyBalance;
        String string2 = "tvLoyaltyBalance";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        int n7 = 8;
        object2.setVisibility(n7);
        if (lpStoredCardBalance == null) {
            return;
        }
        object2 = addCardLoyaltyView.lpStoredCardBalance;
        if (object2 != null) {
            object2 = ((LpStoredCardBalance)object2).getMobileNumberRegistered();
            object = Boolean.FALSE;
            n3 = Intrinsics.areEqual(object2, object);
        } else {
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        if (n3 != 0) {
            this.setCollapseLoyaltyView(lpStoredCardBalance);
        } else {
            object2 = lpStoredCardBalance.getLoyaltyPoints();
            int n8 = 0;
            float f6 = 0.0f;
            object = null;
            if (object2 != null) {
                f5 = ((Float)object2).floatValue();
            } else {
                n3 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            String string3 = "layoutLoyaltyOffer";
            float f7 = f5 - 0.0f;
            n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (n3 > 0) {
                int n10;
                Object object3;
                Object object4;
                Comparable<Boolean> comparable;
                int n14;
                object2 = addCardLoyaltyView.imvLoyalty;
                String string4 = "imvLoyalty";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = addCardLoyaltyView.layoutLoyaltyOffer;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = addCardLoyaltyView.layoutLoyalty;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutLoyalty");
                    n3 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = lpStoredCardBalance.getRemainingPoints();
                if (object2 != null) {
                    f5 = ((Float)object2).floatValue();
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    object2 = null;
                }
                string3 = "format(...)";
                String string5 = "";
                int n15 = 34;
                float f8 = f5 - 0.0f;
                float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (f11 > 0 && (n14 = Intrinsics.areEqual(comparable = lpStoredCardBalance.isSelected(), object4 = Boolean.TRUE)) != 0) {
                    comparable = lpStoredCardBalance.getUsablePoints();
                    object4 = StringCompanionObject.INSTANCE;
                    if (comparable != null) {
                        f6 = ((Float)comparable).floatValue();
                    }
                    object = hv3_0.v(f6);
                    comparable = new Object[n4];
                    comparable[0] = object;
                    object = xh2_0.a(comparable, n4, "Use \u20b9%s Loylty Rewardz Points to pay for this order.", string3);
                    object4 = "to";
                    n14 = StringsKt.R((CharSequence)object, (String)object4, 0, 6);
                    int n16 = ((String)object).length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                    object3 = addCardLoyaltyView.sSPRegular;
                    object = new AjioCustomTypefaceSpan(string5, (Typeface)object3);
                    spannableStringBuilder.setSpan(object, 0, n16, n15);
                    object = addCardLoyaltyView.sSPSemiBold;
                    object3 = new AjioCustomTypefaceSpan(string5, (Typeface)object);
                    n8 = 4;
                    f6 = 5.6E-45f;
                    spannableStringBuilder.setSpan(object3, n8, n14, n15);
                    object3 = addCardLoyaltyView.tvLoyaltyPoints;
                    object = "tvLoyaltyPoints";
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        n10 = 0;
                        object3 = null;
                    }
                    object3.setText((CharSequence)spannableStringBuilder);
                    object3 = addCardLoyaltyView.tvLoyaltyPoints;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object);
                        n10 = 0;
                        object3 = null;
                    }
                    object3.setHighlightColor(0);
                } else {
                    this.setCollapseLoyaltyView(lpStoredCardBalance);
                }
                object3 = lpStoredCardBalance.isSelected();
                object = Boolean.TRUE;
                n10 = Intrinsics.areEqual(object3, object);
                if (n10 != 0) {
                    object3 = addCardLoyaltyView.imvLoyalty;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n10 = 0;
                        object3 = null;
                    }
                    int n17 = R$drawable.pe_tick;
                    string4 = hv3_0.r(n17);
                    object3.setImageDrawable((Drawable)string4);
                } else {
                    object3 = addCardLoyaltyView.imvLoyalty;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n10 = 0;
                        object3 = null;
                    }
                    int n18 = R$drawable.pe_tick_unselected;
                    string4 = hv3_0.r(n18);
                    object3.setImageDrawable((Drawable)string4);
                }
                if (f11 > 0 && (n10 = Intrinsics.areEqual(object3 = lpStoredCardBalance.isSelected(), object)) != 0) {
                    object3 = addCardLoyaltyView.tvLoyaltyBalance;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object3 = null;
                    }
                    object3.setVisibility(0);
                    object3 = StringCompanionObject.INSTANCE;
                    object2 = hv3_0.v(f5);
                    object3 = new Object[n4];
                    object3[0] = object2;
                    String string6 = xh2_0.a((Object[])object3, n4, "Remaining balance after purchase \u20b9%s.", string3);
                    object3 = string6.concat(" View details");
                    object2 = new SpannableStringBuilder((CharSequence)object3);
                    n4 = string6.length();
                    n10 = n4 + 13;
                    object = addCardLoyaltyView.sSPRegular;
                    Object object5 = new AjioCustomTypefaceSpan(string5, (Typeface)object);
                    object2.setSpan(object5, 0, n4, n15);
                    object = addCardLoyaltyView.sSPSemiBold;
                    object5 = new AjioCustomTypefaceSpan(string5, (Typeface)object);
                    object2.setSpan(object5, n4, n10, n15);
                    object = "#176d93";
                    n8 = Color.parseColor((String)object);
                    object5 = new ForegroundColorSpan(n8);
                    n8 = 18;
                    f6 = 2.5E-44f;
                    object2.setSpan(object5, n4, n10, n8);
                    object5 = new AddCardLoyaltyView$CustomClickableSpan(addCardLoyaltyView);
                    object2.setSpan(object5, n4, n10, n15);
                    string6 = addCardLoyaltyView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        string6 = null;
                    }
                    string6.setText((CharSequence)object2);
                    string6 = addCardLoyaltyView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        string6 = null;
                    }
                    object2 = LinkMovementMethod.getInstance();
                    string6.setMovementMethod((MovementMethod)object2);
                    string6 = addCardLoyaltyView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object3 = null;
                    } else {
                        object3 = string6;
                    }
                    object3.setHighlightColor(0);
                } else {
                    TextView textView = addCardLoyaltyView.tvLoyaltyBalance;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object3 = null;
                    } else {
                        object3 = textView;
                    }
                    object3.setVisibility(n7);
                }
            } else {
                OfferDetails offerDetails = addCardLoyaltyView.offerDetail;
                if (offerDetails == null) {
                    OfferDetails offerDetails2;
                    offerDetails = addCardLoyaltyView.layoutLoyaltyOffer;
                    if (offerDetails == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        boolean bl2 = false;
                        offerDetails2 = null;
                    } else {
                        offerDetails2 = offerDetails;
                    }
                    offerDetails2.setVisibility(n7);
                }
            }
        }
    }

    private final void setOfferView(OfferDetails offerDetails, String string2) {
        int n3;
        float f5;
        Float f6;
        AddCardLoyaltyView addCardLoyaltyView = this;
        int n4 = 0;
        Object object = null;
        if (offerDetails != null && (f6 = offerDetails.getOfferAmountApplied()) != null) {
            f5 = f6.floatValue();
        } else {
            n3 = 0;
            f5 = 0.0f;
            f6 = null;
        }
        String string3 = "layoutOffer";
        Object object2 = "layoutLoyaltyOffer";
        Object object3 = null;
        float f7 = f5 - 0.0f;
        n4 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (n4 > 0) {
            if (offerDetails != null) {
                object = offerDetails.getInstantDiscountMsg();
            } else {
                n4 = 0;
                object = null;
            }
            n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n4 == 0) {
                Object object4;
                Object object5;
                Object object6;
                Object object7;
                boolean bl2;
                object = addCardLoyaltyView.layoutLoyaltyOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object = null;
                }
                n3 = 0;
                f5 = 0.0f;
                f6 = null;
                object.setVisibility(0);
                object = addCardLoyaltyView.layoutOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = "";
                if (offerDetails == null || (string3 = offerDetails.getInstantDiscountMsg()) == null) {
                    string3 = object;
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                    Bundle bundle = new Bundle();
                    if (offerDetails != null) {
                        object2 = offerDetails.getOfferAmountApplied();
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    object2 = String.valueOf(object2);
                    bundle.putString("instant_discount", (String)object2);
                    object2 = AnalyticsManager.Companion;
                    object7 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                    String string4 = cv_0.a((AnalyticsManager$Companion)object2);
                    int n7 = 1600;
                    object6 = "checkout interactions";
                    object5 = "instant discount load";
                    String string5 = "instant_discount_load";
                    String string6 = "single page checkout";
                    String string7 = "single page checkout";
                    object4 = string2;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object7, (String)object6, (String)object5, string2, string5, string6, string7, null, bundle, string4, false, null, n7, null);
                }
                object7 = string3.concat(" View details");
                object2 = new SpannableStringBuilder((CharSequence)object7);
                int n8 = string3.length();
                int n10 = object2.length();
                object5 = addCardLoyaltyView.sSPRegular;
                object6 = new AjioCustomTypefaceSpan((String)object, (Typeface)object5);
                int n14 = 34;
                object2.setSpan(object6, 0, n8, n14);
                object4 = addCardLoyaltyView.sSPSemiBold;
                object6 = new AjioCustomTypefaceSpan((String)object, (Typeface)object4);
                object2.setSpan(object6, n8, n10, n14);
                object6 = "#176d93";
                int n15 = Color.parseColor((String)object6);
                object = new ForegroundColorSpan(n15);
                n15 = 18;
                object2.setSpan(object, n8, n10, n15);
                object = new AddCardLoyaltyView$BankOfferClickableSpan(addCardLoyaltyView);
                object2.setSpan(object, n8, n10, n14);
                object = addCardLoyaltyView.tvOffer;
                string3 = "tvOffer";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                object.setText((CharSequence)object2);
                object = addCardLoyaltyView.tvOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                object2 = LinkMovementMethod.getInstance();
                object.setMovementMethod((MovementMethod)object2);
                object = addCardLoyaltyView.tvOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object3 = object;
                }
                object3.setHighlightColor(0);
                return;
            }
        }
        if ((object = addCardLoyaltyView.layoutOffer) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n4 = 0;
            object = null;
        }
        n3 = 8;
        f5 = 1.1E-44f;
        object.setVisibility(n3);
        object = addCardLoyaltyView.lpStoredCardBalance;
        if (object == null) {
            object = addCardLoyaltyView.layoutLoyaltyOffer;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            object3.setVisibility(n3);
        }
    }

    public void onClick(View object) {
        int n3;
        int n4;
        Serializable serializable = this.lpStoredCardBalance;
        if (serializable == null) {
            return;
        }
        if (object != null && (n4 = object.getId()) == (n3 = R$id.imv_loyalty)) {
            object = this.lpStoredCardBalance;
            if (object != null) {
                object = ((LpStoredCardBalance)object).isSelected();
                serializable = Boolean.TRUE;
                n4 = (int)(Intrinsics.areEqual(object, serializable) ? 1 : 0);
            } else {
                n4 = 0;
                object = null;
            }
            if (n4 != 0) {
                object = this.cardClickListener;
                if (object != null) {
                    object.onLoyaltyDeSelected();
                }
            } else {
                object = this.cardClickListener;
                if (object != null) {
                    object.onLoyaltySelected();
                }
            }
        }
    }

    public final void setCardClickListener(AddCardLoyaltyView$AddCardLoyaltyClickListener addCardLoyaltyView$AddCardLoyaltyClickListener) {
        Intrinsics.checkNotNullParameter(addCardLoyaltyView$AddCardLoyaltyClickListener, "clickListener");
        this.cardClickListener = addCardLoyaltyView$AddCardLoyaltyClickListener;
    }

    public final void setData(LpStoredCardBalance object, OfferDetails offerDetails, int n3, String string2) {
        float f5;
        float f6;
        Constable constable;
        String string3 = "paymentMethodFormedString";
        Intrinsics.checkNotNullParameter(string2, string3);
        this.offerDetail = offerDetails;
        this.lpStoredCardBalance = object;
        int n4 = 8;
        Serializable serializable = null;
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
        int n7 = 0;
        Object object2 = null;
        if (object != null && (constable = ((LpStoredCardBalance)object).getLoyaltyPoints()) != null) {
            f6 = constable.floatValue();
        } else {
            f6 = 0.0f;
            constable = null;
        }
        n7 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
        if (n7 <= 0) {
            if (object != null) {
                object2 = ((LpStoredCardBalance)object).getMobileNumberRegistered();
                constable = Boolean.TRUE;
                n7 = (int)(Intrinsics.areEqual(object2, constable) ? 1 : 0);
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n7 != 0) {
                object2 = this.layoutLoyalty;
                if (object2 == null) {
                    object2 = "layoutLoyalty";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                } else {
                    serializable = object2;
                }
                serializable.setVisibility(n4);
            }
        }
        if (n3 == (n4 = 1)) {
            this.setExpandedLoyaltyView((LpStoredCardBalance)object);
            this.setOfferView(offerDetails, string2);
        }
    }
}

