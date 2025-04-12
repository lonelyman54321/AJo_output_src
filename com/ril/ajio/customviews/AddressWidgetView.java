/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.style.StyleSpan
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$font;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.analytics.utils.PriorityDeliveryGaUtils;
import com.ril.ajio.customviews.AddressWidgetView$WhenMappings;
import com.ril.ajio.customviews.ChangeLocationListener;
import com.ril.ajio.services.data.Address.AddressType;
import com.ril.ajio.services.data.Address.PageType;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class AddressWidgetView {
    public static final int $stable = 8;
    private final View addressBarUiDividerBottom;
    private final TextView addressTv;
    private jo_2 appPreferences;
    private final TextView changeAddressBtn;
    private final ConstraintLayout clChange;
    private final ConstraintLayout clMain;
    private final Context context;
    private final View itemView;
    private final ImageView locationImg;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
    private final ChangeLocationListener onChangeLocationClick;
    private final TextView pinCodeTv;
    private uw3_0 updatePDDeeplinkListener;

    public AddressWidgetView(Context object, View object2, ChangeLocationListener object3) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "onChangeLocationClick";
        Intrinsics.checkNotNullParameter(object3, string2);
        this.context = object;
        this.itemView = object2;
        this.onChangeLocationClick = object3;
        int n4 = 0;
        object = null;
        if (object2 != null) {
            n3 = R$id.location_img;
            object3 = (ImageView)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.locationImg = object3;
        if (object2 != null) {
            n3 = R$id.change_address;
            object3 = (TextView)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.changeAddressBtn = object3;
        if (object2 != null) {
            n3 = R$id.address_text;
            object3 = (TextView)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.addressTv = object3;
        if (object2 != null) {
            n3 = R$id.pincode_text;
            object3 = (TextView)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.pinCodeTv = object3;
        if (object2 != null) {
            n3 = R$id.cl_change;
            object3 = (ConstraintLayout)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.clChange = object3;
        if (object2 != null) {
            n3 = R$id.cl_main;
            object3 = (ConstraintLayout)object2.findViewById(n3);
        } else {
            n3 = 0;
            object3 = null;
        }
        this.clMain = object3;
        if (object2 != null) {
            n4 = R$id.address_bar_ui_divider_bottom;
            object = object2.findViewById(n4);
        }
        this.addressBarUiDividerBottom = object;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.newCustomEventsRevamp = object2;
        this.newEEcommerceEventsRevamp = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        AJIOApplication.Companion.getClass();
        object2 = AJIOApplication$a.a();
        this.appPreferences = object = new jo_2((Context)object2);
    }

    public static /* synthetic */ void a(AddressWidgetView addressWidgetView, AddressType addressType, String string2, View view) {
        AddressWidgetView.setData$lambda$0(addressWidgetView, addressType, string2, view);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void sendEventsOnButtonClick(AddressType object, String string2) {
        Object object2 = AddressWidgetView$WhenMappings.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        int n4 = 1;
        if ((n3 = object2[n3]) == n4) {
            object = PriorityDeliveryGaUtils.INSTANCE;
            n4 = 0;
            object2 = null;
            ((PriorityDeliveryGaUtils)object).pushAddressDropDownClickedEvent(string2, string2, 0);
            return;
        }
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 == n4) {
                object = PriorityDeliveryGaUtils.INSTANCE;
                ((PriorityDeliveryGaUtils)object).pushEnterLocationCTAClickedEvent(string2, string2);
                return;
            }
            n4 = 4;
            if (n3 == n4) {
                object = PriorityDeliveryGaUtils.INSTANCE;
                ((PriorityDeliveryGaUtils)object).pushCheckCTAClickedEvent(string2, string2);
                return;
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = this.appPreferences.l();
        if (object != null) {
            n3 = (int)(((CartDeliveryAddress)object).isDefaultAddress() ? 1 : 0);
            object = n3 != 0;
        } else {
            n3 = 0;
            object = null;
        }
        object2 = Boolean.TRUE;
        n3 = Intrinsics.areEqual(object, object2);
        object2 = PriorityDeliveryGaUtils.INSTANCE;
        ((PriorityDeliveryGaUtils)object2).pushAddressDropDownClickedEvent(string2, string2, n3);
    }

    /*
     * Unable to fully structure code
     */
    private final void setAddressLoadedEvent(String var1_1, String var2_2, String var3_3) {
        var4_4 = this;
        var5_5 = var3_3;
        var6_6 = "default_address";
        if (var2_2 != null && (var7_7 = var2_2.length()) > 0) {
            var5_5 = DE.a();
            var8_8 = "1";
            var5_5.putString((String)var6_6, var8_8);
lbl8:
            // 2 sources

            while (true) {
                var9_10 = var5_5;
                break;
            }
        } else if (var5_5 != null && (var7_7 = var3_3.length()) > 0) {
            var8_9 = DE.a();
            var8_9.putString((String)var6_6, var5_5);
            var9_10 = var8_9;
        } else {
            var5_5 = null;
            ** continue;
        }
        var6_6 = var4_4.newCustomEventsRevamp;
        var10_11 = var4_4.newEEcommerceEventsRevamp.getPrevScreen();
        var11_12 = var4_4.newEEcommerceEventsRevamp.getPrevScreenType();
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var6_6, "address interaction", "address_loaded", "", "address_loaded", var1_1, var1_1, var10_11, (Bundle)var9_10, var11_12, false, null, 1536, null);
    }

    public static /* synthetic */ void setData$default(AddressWidgetView addressWidgetView, AddressType addressType, String string2, String string3, String string4, String string5, String string6, PageType pageType, int n3, Object object) {
        PageType pageType2;
        int n4 = n3 & 2;
        String string7 = "";
        String string8 = n4 != 0 ? string7 : string2;
        n4 = n3 & 8;
        String string9 = n4 != 0 ? string7 : string4;
        n4 = n3 & 0x10;
        String string10 = n4 != 0 ? string7 : string5;
        n4 = n3 & 0x20;
        String string11 = n4 != 0 ? string7 : string6;
        n4 = n3 & 0x40;
        PageType pageType3 = n4 != 0 ? (pageType2 = PageType.NONE) : pageType;
        addressWidgetView.setData(addressType, string8, string3, string9, string10, string11, pageType3);
    }

    private static final void setData$lambda$0(AddressWidgetView object, AddressType addressType, String string2, View object2) {
        Intrinsics.checkNotNullParameter(object, "this$0");
        Intrinsics.checkNotNullParameter((Object)addressType, "$addressType");
        Intrinsics.checkNotNullParameter(string2, "$screenName");
        object2 = ((AddressWidgetView)object).onChangeLocationClick;
        object2.onChangeLocationClick();
        ((AddressWidgetView)object).sendEventsOnButtonClick(addressType, string2);
        object = ((AddressWidgetView)object).updatePDDeeplinkListener;
        if (object != null) {
            object.a();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void setData(AddressType object, String string2, String object2, String string3, String string4, String string5, PageType object3) {
        TextView textView;
        int n3;
        TextView textView2;
        String string6;
        int n4;
        int n7;
        float f5;
        void var5_52;
        Object object4;
        void var7_54;
        String string7;
        void var3_30;
        Intrinsics.checkNotNullParameter(object, "addressType");
        Intrinsics.checkNotNullParameter(var3_30, "storeType");
        Intrinsics.checkNotNullParameter(string7, "screenName");
        Intrinsics.checkNotNullParameter(var7_54, "pageType");
        this.setAddressLoadedEvent(string7, (String)object4, (String)var5_52);
        ConstraintLayout constraintLayout = this.clChange;
        if (constraintLayout != null) {
            i5 i54 = new i5(this, (AddressType)((Object)object), string7);
            constraintLayout.setOnClickListener(i54);
        }
        string7 = ld3_2.STORE_LUXE.getStoreId();
        int n8 = Intrinsics.areEqual(var3_30, string7);
        constraintLayout = null;
        int n10 = 2;
        int n14 = 1;
        int n15 = 8;
        if (n8 != 0) {
            View view;
            TextView textView3;
            TextView textView4;
            TextView textView5;
            TextView textView6;
            TextView textView7 = this.changeAddressBtn;
            if (textView7 != null) {
                textView7.setPaintFlags(n15);
            }
            if ((textView6 = this.changeAddressBtn) != null) {
                textView6.setAllCaps(n14 != 0);
            }
            Context context = this.context;
            n8 = R$font.muli_regular_font;
            Typeface typeface = WK2.c(n8, context);
            string7 = this.changeAddressBtn;
            if (string7 != null) {
                string7.setTypeface(typeface);
            }
            if ((textView5 = this.changeAddressBtn) != null) {
                n8 = 1092616192;
                f5 = 10.0f;
                textView5.setTextSize(n10, f5);
            }
            if ((textView4 = this.changeAddressBtn) != null) {
                string7 = this.context;
                n7 = R$color.accent_color_17;
                n8 = t70.getColor((Context)string7, n7);
                textView4.setTextColor(n8);
            }
            if ((textView3 = this.addressTv) != null) {
                n8 = 1096810496;
                f5 = 14.0f;
                textView3.setTextSize(n10, f5);
            }
            if ((view = this.addressBarUiDividerBottom) != null) {
                view.setVisibility(n15);
            }
        } else {
            string7 = ld3_2.STORE_AJIOGRAM.getStoreId();
            n4 = Intrinsics.areEqual(var3_30, string7);
            if (n4 != 0) {
                TextView textView8;
                TextView textView9;
                TextView textView10;
                ImageView imageView;
                View view;
                ConstraintLayout constraintLayout2;
                ConstraintLayout constraintLayout3 = this.clMain;
                if (constraintLayout3 != null) {
                    string7 = this.context;
                    n7 = R$color.accent_color_17;
                    n8 = t70.getColor((Context)string7, n7);
                    constraintLayout3.setBackgroundColor(n8);
                }
                if ((constraintLayout2 = this.clChange) != null) {
                    string7 = this.context;
                    n7 = R$color.accent_color_17;
                    n8 = t70.getColor((Context)string7, n7);
                    constraintLayout2.setBackgroundColor(n8);
                }
                if ((view = this.addressBarUiDividerBottom) != null) {
                    view.setVisibility(0);
                }
                if ((imageView = this.locationImg) != null) {
                    string7 = this.context;
                    n7 = R$color.white;
                    string7 = t70.getColorStateList((Context)string7, n7);
                    imageView.setImageTintList((ColorStateList)string7);
                }
                if ((textView10 = this.addressTv) != null) {
                    n8 = hv3_0.m(R$color.white);
                    textView10.setTextColor(n8);
                }
                if ((textView9 = this.pinCodeTv) != null) {
                    n8 = hv3_0.m(R$color.white);
                    textView9.setTextColor(n8);
                }
                if ((textView8 = this.changeAddressBtn) != null) {
                    n8 = hv3_0.m(R$color.bg_color_accent_3);
                    textView8.setTextColor(n8);
                }
            } else {
                View view = this.addressBarUiDividerBottom;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }
        int[] nArray = AddressWidgetView$WhenMappings.$EnumSwitchMapping$0;
        int n17 = ((Enum)object).ordinal();
        n17 = nArray[n17];
        String string8 = "|";
        n8 = 6;
        f5 = 8.4E-45f;
        n7 = -1;
        String string9 = " | ";
        if (n17 != n14) {
            TextView textView11;
            int n18;
            int n19;
            if (n17 != n10) {
                TextView textView12;
                TextView textView13;
                int n20 = 3;
                if (n17 != n20) {
                    TextView textView14;
                    PageType pageType;
                    TextView textView15;
                    n20 = 4;
                    if (n17 != n20) {
                        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
                        throw noWhenBranchMatchedException;
                    }
                    TextView textView16 = this.pinCodeTv;
                    if (textView16 != null) {
                        textView16.setVisibility(n15);
                    }
                    if ((textView15 = this.addressTv) != null) {
                        textView15.setVisibility(0);
                    }
                    if (var7_54 == (pageType = PageType.HOME)) {
                        TextView textView17;
                        TextView textView18 = this.addressTv;
                        if (textView18 != null) {
                            object4 = this.context;
                            n4 = R$string.no_location_found;
                            object4 = object4.getString(n4);
                            textView18.setText((CharSequence)object4);
                        }
                        if ((textView17 = this.changeAddressBtn) == null) return;
                        object4 = this.context;
                        n4 = R$string.enter_location;
                        object4 = object4.getString(n4);
                        textView17.setText((CharSequence)object4);
                        return;
                    }
                    TextView textView19 = this.addressTv;
                    if (textView19 != null) {
                        object4 = this.context;
                        n4 = R$string.enter_pincode_pd;
                        object4 = object4.getString(n4);
                        textView19.setText((CharSequence)object4);
                    }
                    if ((textView14 = this.changeAddressBtn) == null) return;
                    object4 = this.context;
                    n4 = R$string.check;
                    object4 = object4.getString(n4);
                    textView14.setText((CharSequence)object4);
                    return;
                }
                TextView textView20 = this.changeAddressBtn;
                if (textView20 != null) {
                    object4 = this.context;
                    n4 = R$string.enter_location;
                    object4 = object4.getString(n4);
                    textView20.setText((CharSequence)object4);
                }
                if ((textView13 = this.addressTv) != null) {
                    object4 = this.context;
                    n4 = R$string.no_location_found;
                    object4 = object4.getString(n4);
                    textView13.setText((CharSequence)object4);
                }
                if ((textView12 = this.pinCodeTv) == null) return;
                textView12.setVisibility(n15);
                return;
            }
            TextView textView21 = this.changeAddressBtn;
            if (textView21 != null) {
                Context context = this.context;
                n10 = R$string.change;
                String string10 = context.getString(n10);
                textView21.setText((CharSequence)string10);
            }
            if (string6 != null && (n19 = string6.length()) != 0 && object4 != null && (n18 = object4.length()) != 0) {
                SpannableString spannableString = new SpannableString((CharSequence)(object4 = n1.a(string6, string9, (String)object4)));
                int n21 = StringsKt.O((CharSequence)spannableString, string8, 0, false, n8) + n14;
                if (n21 == n7) {
                    n21 = string6.length();
                }
                StyleSpan styleSpan = new StyleSpan(n14);
                int n22 = 33;
                spannableString.setSpan((Object)styleSpan, 0, n21, n22);
                object4 = this.pinCodeTv;
                if (object4 != null) {
                    object4.setVisibility(0);
                }
                if ((object4 = this.addressTv) != null) {
                    object4.setVisibility(0);
                }
                if ((object4 = this.pinCodeTv) != null) {
                    object4.setText((CharSequence)var5_52);
                }
                if ((object4 = this.addressTv) == null) return;
                object4.setText((CharSequence)spannableString);
                return;
            }
            TextView textView22 = this.pinCodeTv;
            if (textView22 != null) {
                textView22.setVisibility(n15);
            }
            if ((textView11 = this.addressTv) == null) return;
            textView11.setText((CharSequence)object4);
            return;
        }
        TextView textView23 = this.pinCodeTv;
        if (textView23 != null) {
            textView23.setVisibility(n15);
        }
        if ((textView2 = this.addressTv) != null) {
            textView2.setVisibility(0);
        }
        if (var5_52 != null && (n3 = var5_52.length()) != 0) {
            TextView textView24;
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            int n24 = R$string.pincode;
            String string11 = aJIOApplication.getString(n24);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            string6 = n1.a(string11, string9, (String)var5_52);
            object4 = new SpannableString((CharSequence)string6);
            n4 = StringsKt.O((CharSequence)object4, string8, 0, false, n8) + n14;
            if (n4 == n7) {
                n4 = string11.length();
            }
            StyleSpan styleSpan = new StyleSpan(n14);
            int n25 = 18;
            object4.setSpan((Object)styleSpan, 0, n4, n25);
            TextView textView25 = this.addressTv;
            if (textView25 != null) {
                textView25.setText((CharSequence)object4);
            }
            if ((textView24 = this.changeAddressBtn) == null) return;
            object4 = this.context;
            n4 = R$string.change;
            object4 = object4.getString(n4);
            textView24.setText((CharSequence)object4);
            return;
        }
        PageType pageType = PageType.HOME;
        if (var7_54 == pageType) {
            TextView textView26;
            TextView textView27 = this.addressTv;
            if (textView27 != null) {
                object4 = this.context;
                n4 = R$string.no_location_found;
                object4 = object4.getString(n4);
                textView27.setText((CharSequence)object4);
            }
            if ((textView26 = this.changeAddressBtn) == null) return;
            object4 = this.context;
            n4 = R$string.enter_location;
            object4 = object4.getString(n4);
            textView26.setText((CharSequence)object4);
            return;
        }
        TextView textView28 = this.addressTv;
        if (textView28 != null) {
            object4 = this.context;
            n4 = R$string.enter_pincode_pd;
            object4 = object4.getString(n4);
            textView28.setText((CharSequence)object4);
        }
        if ((textView = this.changeAddressBtn) == null) return;
        object4 = this.context;
        n4 = R$string.change;
        object4 = object4.getString(n4);
        textView.setText((CharSequence)object4);
    }

    public final void updatePdDeeplinkListener(uw3_0 uw3_02) {
        this.updatePDDeeplinkListener = uw3_02;
    }
}

