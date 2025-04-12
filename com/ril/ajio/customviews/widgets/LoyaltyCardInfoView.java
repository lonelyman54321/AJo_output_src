/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.IBinder
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
 *  android.view.inputmethod.InputMethodManager
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
import android.os.IBinder;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView$BankOfferClickableSpan;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView$Companion;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView$CustomClickableSpan;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
import com.ril.ajio.customviews.widgets.LoyaltyCardInfoView$RegisterClickableSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Payment.LpStoredCardBalance;
import com.ril.ajio.services.data.Payment.OfferDetails;
import java.io.Serializable;
import java.lang.constant.Constable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class LoyaltyCardInfoView
extends FrameLayout
implements View.OnClickListener {
    public static final int $stable = 0;
    public static final int COLLAPSE_LOYALTY_VIEW = 1;
    public static final LoyaltyCardInfoView$Companion Companion;
    public static final int EXPANDED_LOYALTY_VIEW = 3;
    private LoyaltyCardInfoView$LoyaltyCardInfoViewClickListener cardClickListener;
    private ImageView imvLoyalty;
    private View layoutLoyalty;
    private View layoutLoyaltyOffer;
    private View layoutOffer;
    private LpStoredCardBalance lpStoredCardBalance;
    private OfferDetails offerDetails;
    private Typeface sSPRegular;
    private Typeface sSPSemiBold;
    private TextView tvLoyaltyBalance;
    private TextView tvLoyaltyPoints;
    private TextView tvOffer;

    static {
        LoyaltyCardInfoView$Companion loyaltyCardInfoView$Companion;
        Companion = loyaltyCardInfoView$Companion = new LoyaltyCardInfoView$Companion(null);
        $stable = 8;
    }

    public LoyaltyCardInfoView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.initView(context);
    }

    public LoyaltyCardInfoView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.initView(context);
    }

    public LoyaltyCardInfoView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.initView(context);
    }

    public LoyaltyCardInfoView(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3, n4);
        this.initView(context);
    }

    public static final /* synthetic */ LoyaltyCardInfoView$LoyaltyCardInfoViewClickListener access$getCardClickListener$p(LoyaltyCardInfoView loyaltyCardInfoView) {
        return loyaltyCardInfoView.cardClickListener;
    }

    public static final /* synthetic */ LpStoredCardBalance access$getLpStoredCardBalance$p(LoyaltyCardInfoView loyaltyCardInfoView) {
        return loyaltyCardInfoView.lpStoredCardBalance;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final void hideKeyboard(View view) {
        InputMethodManager inputMethodManager;
        String string2;
        block9: {
            block8: {
                if (view != null) {
                    Context context = view.getContext();
                    if (context == null) break block8;
                    string2 = "input_method";
                    Object object = context.getSystemService(string2);
                    break block9;
                }
            }
            Object var2_4 = null;
        }
        string2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
        try {
            void var2_5;
            Intrinsics.checkNotNull(var2_5, string2);
            inputMethodManager = (InputMethodManager)var2_5;
        }
        catch (Exception exception) {
            return;
        }
        view = view.getWindowToken();
        string2 = null;
        inputMethodManager.hideSoftInputFromWindow((IBinder)view, 0);
    }

    private final void initView(Context context) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from((Context)context);
        int n3 = R$layout.view_loyalty_point;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)this, true);
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
        n3 = R$id.tv_offer;
        layoutInflater = (TextView)layoutInflater.findViewById(n3);
        this.tvOffer = layoutInflater;
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
        object2 = this.imvLoyalty;
        Object object4 = "imvLoyalty";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object4);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        int n8 = R$drawable.ic_percentage;
        Object object5 = hv3_0.r(n8);
        object2.setImageDrawable((Drawable)object5);
        object2 = this.imvLoyalty;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object4);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2.setOnClickListener(null);
        object2 = this.imvLoyalty;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object4);
            n3 = 0;
            object2 = null;
            f5 = 0.0f;
        }
        object2.setTag(null);
        object2 = AnalyticsManager.Companion;
        object5 = object2.getInstance().getGtmEvents();
        object2 = object2.getInstance().getGtmEvents().getScreenName();
        String string2 = "MessageTicker";
        String string3 = "Use LR Points to Pay for this order";
        ((GTMEvents)object5).pushButtonTapEvent(string2, string3, (String)object2);
        object2 = ((LpStoredCardBalance)object).getLoyaltyPoints();
        n8 = 0;
        float f6 = 0.0f;
        object5 = null;
        if (object2 != null) {
            f5 = object2.floatValue();
        } else {
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
        }
        string2 = "layoutLoyaltyOffer";
        int n10 = 18;
        String string4 = "#176d93";
        String string5 = "tvLoyaltyPoints";
        String string6 = "";
        int n14 = 34;
        float f7 = f5 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (n3 > 0) {
            object2 = this.layoutLoyaltyOffer;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2.setVisibility(0);
            object2 = this.layoutLoyalty;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutLoyalty");
                n3 = 0;
                object2 = null;
                f5 = 0.0f;
            }
            object2.setVisibility(0);
            object2 = StringCompanionObject.INSTANCE;
            object = ((LpStoredCardBalance)object).getLoyaltyPoints();
            if (object != null) {
                f6 = ((Float)object).floatValue();
            }
            object = hv3_0.v(f6);
            object2 = new Object[n4];
            object2[0] = object;
            object = xh2_0.a((Object[])object2, n4, "Yay! You can use your \u20b9%s Loylty Rewardz Points to pay for this order.", "format(...)");
            object2 = ((String)object).concat(" View details");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object2);
            f5 = 8.4E-45f;
            String string7 = "to";
            n3 = StringsKt.R((CharSequence)object, string7, 0, 6);
            int n15 = ((String)object).length();
            n7 = n15 + 13;
            object5 = this.sSPRegular;
            object4 = new AjioCustomTypefaceSpan(string6, (Typeface)object5);
            spannableStringBuilder.setSpan(object4, 0, n7, n14);
            object5 = this.sSPSemiBold;
            object4 = new AjioCustomTypefaceSpan(string6, (Typeface)object5);
            n8 = 21;
            f6 = 2.9E-44f;
            spannableStringBuilder.setSpan(object4, n8, n3, n14);
            object4 = this.sSPSemiBold;
            object2 = new AjioCustomTypefaceSpan(string6, (Typeface)object4);
            spannableStringBuilder.setSpan(object2, n15, n7, n14);
            int n16 = Color.parseColor((String)string4);
            object2 = new ForegroundColorSpan(n16);
            spannableStringBuilder.setSpan(object2, n15, n7, n10);
            object2 = new LoyaltyCardInfoView$CustomClickableSpan(this);
            spannableStringBuilder.setSpan(object2, n15, n7, n14);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n15 = 0;
                object = null;
            }
            object.setText((CharSequence)spannableStringBuilder);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n15 = 0;
                object = null;
            }
            spannableStringBuilder = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)spannableStringBuilder);
            object = this.tvLoyaltyPoints;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
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
                    Intrinsics.throwUninitializedPropertyAccessException(object4);
                    bl3 = false;
                    object = null;
                }
                object.setVisibility(n7);
                object = new SpannableStringBuilder((CharSequence)"Enter registered number to use Loylty Rewardz Points. View details");
                n4 = object.length();
                Typeface typeface = this.sSPSemiBold;
                object2 = new AjioCustomTypefaceSpan(string6, typeface);
                n7 = 23;
                object.setSpan(object2, 0, n7, n14);
                object4 = this.sSPRegular;
                object2 = new AjioCustomTypefaceSpan(string6, (Typeface)object4);
                object.setSpan(object2, n7, n4, n14);
                object4 = this.sSPSemiBold;
                object2 = new AjioCustomTypefaceSpan(string6, (Typeface)object4);
                int n17 = n4 + -12;
                object.setSpan(object2, n17, n4, n14);
                n8 = Color.parseColor((String)string4);
                object2 = new ForegroundColorSpan(n8);
                object.setSpan(object2, 0, n7, n10);
                n8 = Color.parseColor((String)string4);
                object2 = new ForegroundColorSpan(n8);
                object.setSpan(object2, n17, n4, n10);
                object2 = new LoyaltyCardInfoView$RegisterClickableSpan(this);
                object.setSpan(object2, 0, n7, n14);
                object2 = new LoyaltyCardInfoView$CustomClickableSpan(this);
                object.setSpan(object2, n17, n4, n14);
                bl2 = this.tvLoyaltyPoints;
                if (bl2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n4 = 0;
                    bl2 = null;
                }
                bl2.setText((CharSequence)object);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    bl3 = false;
                    object = null;
                }
                bl2 = LinkMovementMethod.getInstance();
                object.setMovementMethod((MovementMethod)bl2);
                object = this.tvLoyaltyPoints;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                } else {
                    object3 = object;
                }
                object3.setHighlightColor(0);
            } else {
                object = this.offerDetails;
                if (object == null) {
                    object = this.layoutLoyaltyOffer;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object;
                    }
                    object3.setVisibility(n7);
                }
            }
        }
    }

    private final void setExpandedLoyaltyView(LpStoredCardBalance lpStoredCardBalance) {
        float f5;
        int n3;
        LoyaltyCardInfoView loyaltyCardInfoView = this;
        int n4 = 1;
        Object object = this.tvLoyaltyBalance;
        String string2 = "tvLoyaltyBalance";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        int n7 = 8;
        object.setVisibility(n7);
        object = lpStoredCardBalance.getMobileNumberRegistered();
        Object object2 = Boolean.TRUE;
        n3 = Intrinsics.areEqual(object, object2);
        if (n3 == 0) {
            this.setCollapseLoyaltyView(lpStoredCardBalance);
        } else {
            object = lpStoredCardBalance.getLoyaltyPoints();
            int n8 = 0;
            float f6 = 0.0f;
            Object object3 = null;
            if (object != null) {
                f5 = ((Float)object).floatValue();
            } else {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            }
            String string3 = "layoutLoyaltyOffer";
            float f7 = f5 - 0.0f;
            n3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (n3 > 0) {
                int n10;
                Object object4;
                object = loyaltyCardInfoView.layoutLoyaltyOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    f5 = 0.0f;
                    object = null;
                }
                object.setVisibility(0);
                object = loyaltyCardInfoView.layoutLoyalty;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutLoyalty");
                    n3 = 0;
                    f5 = 0.0f;
                    object = null;
                }
                object.setVisibility(0);
                object = lpStoredCardBalance.getRemainingPoints();
                if (object != null) {
                    f5 = ((Float)object).floatValue();
                } else {
                    n3 = 0;
                    f5 = 0.0f;
                    object = null;
                }
                string3 = "format(...)";
                String string4 = "";
                int n14 = 34;
                float f8 = f5 - 0.0f;
                float f11 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (f11 > 0) {
                    Object object5 = lpStoredCardBalance.getUsablePoints();
                    if (object5 != null) {
                        f6 = object5.floatValue();
                    }
                    object5 = StringCompanionObject.INSTANCE;
                    object3 = hv3_0.v(f6);
                    object5 = new Object[n4];
                    object5[0] = object3;
                    object3 = xh2_0.a(object5, n4, "Use \u20b9%s Loylty Rewardz Points to pay for this order.", string3);
                    String string5 = "to";
                    int n15 = StringsKt.R(object3, string5, 0, 6);
                    int n16 = object3.length();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object3);
                    object4 = loyaltyCardInfoView.sSPRegular;
                    object3 = new AjioCustomTypefaceSpan(string4, (Typeface)object4);
                    spannableStringBuilder.setSpan(object3, 0, n16, n14);
                    object3 = loyaltyCardInfoView.sSPSemiBold;
                    object4 = new AjioCustomTypefaceSpan(string4, (Typeface)object3);
                    n8 = 4;
                    f6 = 5.6E-45f;
                    spannableStringBuilder.setSpan(object4, n8, n15, n14);
                    object4 = loyaltyCardInfoView.tvLoyaltyPoints;
                    object3 = "tvLoyaltyPoints";
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(object3);
                        n10 = 0;
                        object4 = null;
                    }
                    object4.setText((CharSequence)spannableStringBuilder);
                    object4 = loyaltyCardInfoView.tvLoyaltyPoints;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(object3);
                        n10 = 0;
                        object4 = null;
                    }
                    object4.setHighlightColor(0);
                } else {
                    this.setCollapseLoyaltyView(lpStoredCardBalance);
                }
                object4 = loyaltyCardInfoView.imvLoyalty;
                object3 = "imvLoyalty";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(object3);
                    n10 = 0;
                    object4 = null;
                }
                object4.setOnClickListener((View.OnClickListener)loyaltyCardInfoView);
                object4 = lpStoredCardBalance.isSelected();
                n10 = Intrinsics.areEqual(object4, object2);
                if (n10 != 0) {
                    object4 = loyaltyCardInfoView.imvLoyalty;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(object3);
                        n10 = 0;
                        object4 = null;
                    }
                    n8 = R$drawable.pe_tick;
                    object3 = hv3_0.r(n8);
                    object4.setImageDrawable((Drawable)object3);
                } else {
                    object4 = loyaltyCardInfoView.imvLoyalty;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(object3);
                        n10 = 0;
                        object4 = null;
                    }
                    n8 = R$drawable.pe_tick_unselected;
                    object3 = hv3_0.r(n8);
                    object4.setImageDrawable((Drawable)object3);
                }
                if (f11 > 0 && (n10 = Intrinsics.areEqual(object4 = lpStoredCardBalance.isSelected(), object2)) != 0) {
                    object4 = loyaltyCardInfoView.tvLoyaltyBalance;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object4 = null;
                    }
                    object4.setVisibility(0);
                    object4 = StringCompanionObject.INSTANCE;
                    object = hv3_0.v(f5);
                    object4 = new Object[n4];
                    object4[0] = object;
                    String string6 = xh2_0.a((Object[])object4, n4, "Remaining balance after purchase \u20b9%s.", string3);
                    object4 = string6.concat(" View details");
                    object = new SpannableStringBuilder((CharSequence)object4);
                    n4 = string6.length();
                    n10 = n4 + 13;
                    object2 = loyaltyCardInfoView.sSPRegular;
                    Object object6 = new AjioCustomTypefaceSpan(string4, (Typeface)object2);
                    object.setSpan(object6, 0, n4, n14);
                    object2 = loyaltyCardInfoView.sSPSemiBold;
                    object6 = new AjioCustomTypefaceSpan(string4, (Typeface)object2);
                    object.setSpan(object6, n4, n10, n14);
                    object2 = "#176d93";
                    int n17 = Color.parseColor((String)object2);
                    object6 = new ForegroundColorSpan(n17);
                    n17 = 18;
                    object.setSpan(object6, n4, n10, n17);
                    object6 = new LoyaltyCardInfoView$CustomClickableSpan(loyaltyCardInfoView);
                    object.setSpan(object6, n4, n10, n14);
                    string6 = loyaltyCardInfoView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        string6 = null;
                    }
                    string6.setText((CharSequence)object);
                    string6 = loyaltyCardInfoView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        string6 = null;
                    }
                    object = LinkMovementMethod.getInstance();
                    string6.setMovementMethod((MovementMethod)object);
                    string6 = loyaltyCardInfoView.tvLoyaltyBalance;
                    if (string6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object4 = null;
                    } else {
                        object4 = string6;
                    }
                    object4.setHighlightColor(0);
                } else {
                    TextView textView = loyaltyCardInfoView.tvLoyaltyBalance;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n10 = 0;
                        object4 = null;
                    } else {
                        object4 = textView;
                    }
                    object4.setVisibility(n7);
                }
            } else {
                OfferDetails offerDetails = loyaltyCardInfoView.offerDetails;
                if (offerDetails == null) {
                    OfferDetails offerDetails2;
                    offerDetails = loyaltyCardInfoView.layoutLoyaltyOffer;
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
        float f5;
        Float f6;
        LoyaltyCardInfoView loyaltyCardInfoView = this;
        Serializable serializable = offerDetails;
        int n3 = 0;
        Object object = null;
        if (offerDetails != null && (f6 = offerDetails.getOfferAmountApplied()) != null) {
            f5 = f6.floatValue();
        } else {
            f5 = 0.0f;
            f6 = null;
        }
        String string3 = "layoutOffer";
        Object object2 = "layoutLoyaltyOffer";
        Serializable serializable2 = null;
        float f7 = f5 - 0.0f;
        n3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (n3 > 0) {
            if (serializable != null) {
                object = offerDetails.getInstantDiscountMsg();
            } else {
                n3 = 0;
                object = null;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 == 0) {
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                boolean bl2;
                object = loyaltyCardInfoView.layoutLoyaltyOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object = null;
                }
                f5 = 0.0f;
                f6 = null;
                object.setVisibility(0);
                object = loyaltyCardInfoView.layoutOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = "";
                if (serializable == null || (string3 = offerDetails.getInstantDiscountMsg()) == null) {
                    string3 = object;
                }
                if (!(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                    Bundle bundle = new Bundle();
                    if (serializable != null) {
                        object2 = offerDetails.getOfferAmountApplied();
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    object2 = String.valueOf(object2);
                    bundle.putString("instant_discount", (String)object2);
                    object2 = AnalyticsManager.Companion;
                    object6 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                    String string4 = cv_0.a((AnalyticsManager$Companion)object2);
                    int n4 = 1600;
                    object5 = "checkout interactions";
                    object4 = "instant discount load";
                    String string5 = "instant_discount_load";
                    String string6 = "single page checkout";
                    String string7 = "single page checkout";
                    object3 = string2;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object6, (String)object5, (String)object4, string2, string5, string6, string7, null, bundle, string4, false, null, n4, null);
                }
                object6 = string3.concat(" View details");
                object2 = new SpannableStringBuilder((CharSequence)object6);
                int n7 = string3.length();
                int n8 = object2.length();
                object4 = loyaltyCardInfoView.sSPRegular;
                object5 = new AjioCustomTypefaceSpan((String)object, (Typeface)object4);
                int n10 = 34;
                object2.setSpan(object5, 0, n7, n10);
                object3 = loyaltyCardInfoView.sSPSemiBold;
                object5 = new AjioCustomTypefaceSpan((String)object, (Typeface)object3);
                object2.setSpan(object5, n7, n8, n10);
                object5 = "#176d93";
                int n14 = Color.parseColor((String)object5);
                object = new ForegroundColorSpan(n14);
                n14 = 18;
                object2.setSpan(object, n7, n8, n14);
                object = new LoyaltyCardInfoView$BankOfferClickableSpan(loyaltyCardInfoView);
                object2.setSpan(object, n7, n8, n10);
                object = loyaltyCardInfoView.tvOffer;
                string3 = "tvOffer";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object.setText((CharSequence)object2);
                object = loyaltyCardInfoView.tvOffer;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object.setTag((Object)serializable);
                serializable = loyaltyCardInfoView.tvOffer;
                if (serializable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    serializable = null;
                }
                object = LinkMovementMethod.getInstance();
                serializable.setMovementMethod((MovementMethod)object);
                serializable = loyaltyCardInfoView.tvOffer;
                if (serializable == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    serializable2 = serializable;
                }
                serializable2.setHighlightColor(0);
                return;
            }
        }
        if ((serializable = loyaltyCardInfoView.layoutOffer) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            serializable = null;
        }
        n3 = 8;
        serializable.setVisibility(n3);
        serializable = loyaltyCardInfoView.lpStoredCardBalance;
        if (serializable == null) {
            serializable = loyaltyCardInfoView.layoutLoyaltyOffer;
            if (serializable == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                serializable2 = serializable;
            }
            serializable2.setVisibility(n3);
        }
    }

    public void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.imv_loyalty)) {
            this.hideKeyboard((View)object);
            object = this.lpStoredCardBalance;
            if (object != null) {
                boolean bl2;
                Serializable serializable;
                if (object != null) {
                    object = ((LpStoredCardBalance)object).isSelected();
                    serializable = Boolean.TRUE;
                    bl2 = Intrinsics.areEqual(object, serializable);
                } else {
                    bl2 = false;
                    object = null;
                }
                if (bl2) {
                    object = this.lpStoredCardBalance;
                    if (object != null) {
                        serializable = Boolean.FALSE;
                        ((LpStoredCardBalance)object).setSelected((Boolean)serializable);
                    }
                    object = this.lpStoredCardBalance;
                    Intrinsics.checkNotNull(object);
                    this.setExpandedLoyaltyView((LpStoredCardBalance)object);
                    object = this.cardClickListener;
                    if (object != null) {
                        serializable = this.lpStoredCardBalance;
                        Intrinsics.checkNotNull(serializable);
                        object.onLoyaltyDeSelected((LpStoredCardBalance)serializable);
                    }
                } else {
                    object = this.lpStoredCardBalance;
                    Intrinsics.checkNotNull(object);
                    serializable = Boolean.TRUE;
                    ((LpStoredCardBalance)object).setSelected((Boolean)serializable);
                    object = this.lpStoredCardBalance;
                    Intrinsics.checkNotNull(object);
                    this.setExpandedLoyaltyView((LpStoredCardBalance)object);
                    object = this.cardClickListener;
                    if (object != null) {
                        serializable = this.lpStoredCardBalance;
                        Intrinsics.checkNotNull(serializable);
                        object.onLoyaltySelected((LpStoredCardBalance)serializable);
                    }
                }
            }
        }
    }

    public final void setCardClickListener(LoyaltyCardInfoView$LoyaltyCardInfoViewClickListener loyaltyCardInfoView$LoyaltyCardInfoViewClickListener) {
        Intrinsics.checkNotNullParameter(loyaltyCardInfoView$LoyaltyCardInfoViewClickListener, "clickListener");
        this.cardClickListener = loyaltyCardInfoView$LoyaltyCardInfoViewClickListener;
    }

    public final void setData(LpStoredCardBalance object, OfferDetails offerDetails, int n3, String string2) {
        float f5;
        float f6;
        Constable constable;
        String string3 = "paymentMethodFormedString";
        Intrinsics.checkNotNullParameter(string2, string3);
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
        if (n3 != (n4 = 1)) {
            n4 = 3;
            if (n3 == n4) {
                if (object != null) {
                    this.setExpandedLoyaltyView((LpStoredCardBalance)object);
                }
                this.setOfferView(offerDetails, string2);
            }
        } else {
            if (object != null) {
                this.setCollapseLoyaltyView((LpStoredCardBalance)object);
            }
            this.setOfferView(offerDetails, string2);
        }
    }
}

