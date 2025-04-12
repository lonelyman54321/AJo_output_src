/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.ril.ajio.analytics.events;

import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.PlpListViewEvents$Companion;
import com.ril.ajio.analytics.events.PlpListViewEvents$WhenMappings;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlpListViewEvents {
    public static final int $stable = 0;
    public static final PlpListViewEvents$Companion Companion;
    private static final String VIEW_TYPE_GRID = "grid view";
    private static final String VIEW_TYPE_HIDDEN = "hidden";
    private static final String VIEW_TYPE_LIST = "list view";
    private static PlpListViewEvents plpListViewEvents;
    private final NewCustomEventsRevamp newCustomEventsRevamp;
    private final String previousScreen;
    private final String previousScreenType;

    static {
        PlpListViewEvents$Companion plpListViewEvents$Companion;
        Companion = plpListViewEvents$Companion = new PlpListViewEvents$Companion(null);
        $stable = 8;
    }

    private PlpListViewEvents() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.newCustomEventsRevamp = object2;
        this.previousScreen = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.previousScreenType = object = cv_0.a((AnalyticsManager$Companion)object);
    }

    public /* synthetic */ PlpListViewEvents(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ PlpListViewEvents access$getPlpListViewEvents$cp() {
        return plpListViewEvents;
    }

    public static final /* synthetic */ void access$setPlpListViewEvents$cp(PlpListViewEvents plpListViewEvents) {
        PlpListViewEvents.plpListViewEvents = plpListViewEvents;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Bundle createProductGAEventBundle(Product serializable) {
        Bundle bundle;
        block15: {
            boolean bl2;
            Object object;
            Object object2;
            Object object3;
            boolean bl3;
            block18: {
                double d2;
                double d5;
                block17: {
                    block16: {
                        NumberFormatException numberFormatException2;
                        block11: {
                            bundle = new Bundle();
                            if (serializable == null) break block15;
                            bl3 = false;
                            object3 = null;
                            d5 = 0.0;
                            try {
                                object2 = serializable.getPrice();
                                object2 = object2 != null ? ((Price)object2).getValue() : null;
                            }
                            catch (NumberFormatException numberFormatException2) {
                                break block11;
                            }
                            if (object2 == null || (object2 = serializable.getPrice()) == null || (object2 = ((Price)object2).getValue()) == null) break block16;
                            d2 = Double.parseDouble((String)object2);
                            break block17;
                        }
                        yn3$a yn3$a = yn3_0.a;
                        yn3$a.e(numberFormatException2);
                    }
                    d2 = d5;
                }
                double d7 = d2 == d5 ? 0 : (d2 < d5 ? -1 : 1);
                if (d7 != false) {
                    NumberFormatException numberFormatException3;
                    block14: {
                        block13: {
                            block12: {
                                try {
                                    object = serializable.getWasPriceData();
                                    if (object == null) break block12;
                                    object = ((Price)object).getValue();
                                    break block13;
                                }
                                catch (NumberFormatException numberFormatException3) {
                                    break block14;
                                }
                            }
                            bl2 = false;
                            object = null;
                        }
                        if (object != null) {
                            object = serializable.getWasPriceData();
                            if (object != null && (object = ((Price)object).getValue()) != null) {
                                double d9 = Double.parseDouble((String)object);
                                object3 = d9;
                            }
                            Intrinsics.checkNotNull(object3);
                            object3.getClass();
                        }
                        break block18;
                    }
                    object = yn3_0.a;
                    ((yn3$a)object).e(numberFormatException3);
                }
            }
            bl3 = hv3_0.Y();
            if (bl3 && (object3 = serializable.getSelectedSizeVariant()) != null) {
                Y63.c((ProductOptionVariant)object3);
            }
            object3 = this.newCustomEventsRevamp.getPRODUCT_NAME();
            object = serializable.getName();
            String string2 = "";
            if (object == null) {
                object = string2;
            }
            bundle.putString((String)object3, (String)object);
            object3 = this.newCustomEventsRevamp.getPRODUCT_ID();
            object = serializable.getCode();
            if (object == null) {
                object = string2;
            }
            bundle.putString((String)object3, (String)object);
            object3 = this.newCustomEventsRevamp.getPRODUCT_TAG();
            object = hv3_0.a;
            object2 = serializable.getFnlColorVariantData();
            object.getClass();
            object = hv3_0.A((ProductFnlColorVariantData)object2);
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                serializable = serializable.getFnlColorVariantData();
                string2 = hv3_0.A((ProductFnlColorVariantData)serializable);
            }
            bundle.putString((String)object3, string2);
        }
        return bundle;
    }

    public static final PlpListViewEvents getInstance() {
        return Companion.getInstance();
    }

    public final void logImageInteractEvents(int n3, int n4, Product product) {
        PlpListViewEvents plpListViewEvents = this;
        Object object = n4 > n3 ? "Left" : "Right";
        NewCustomEventsRevamp newCustomEventsRevamp = plpListViewEvents.newCustomEventsRevamp;
        String string2 = newCustomEventsRevamp.getEC_PRODUCT_LIST_INTERACTIONS();
        String string3 = "Swipe ".concat((String)object);
        object = AnalyticsManager.Companion;
        String string4 = av_0.a((AnalyticsManager$Companion)object);
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = plpListViewEvents.previousScreen;
        object = product;
        Bundle bundle = plpListViewEvents.createProductGAEventBundle(product);
        String string7 = plpListViewEvents.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, "", "image_interact", string4, string5, string6, bundle, string7, false, null, 1536, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void logToggleButtonClickEvent(Yj2 object) {
        void var1_3;
        int n3;
        if (object == null) {
            n3 = -1;
        } else {
            int[] nArray = PlpListViewEvents$WhenMappings.$EnumSwitchMapping$0;
            n3 = ((Enum)object).ordinal();
            n3 = nArray[n3];
        }
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                String string2 = "";
            } else {
                String string3 = VIEW_TYPE_GRID;
            }
        } else {
            String string4 = VIEW_TYPE_LIST;
        }
        void var5_11 = var1_3;
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string5 = av_0.a(analyticsManager$Companion);
        String string6 = av_0.a(analyticsManager$Companion);
        String string7 = this.previousScreen;
        String string8 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "product list interactions", "toggle button click", (String)var5_11, "toggle_button_click", string5, string6, string7, null, string8, false, null, 1536, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void logToggleButtonViewEvent(Yj2 object) {
        void var1_3;
        block6: {
            block7: {
                int n3;
                if (object == null) {
                    n3 = -1;
                } else {
                    int[] nArray = PlpListViewEvents$WhenMappings.$EnumSwitchMapping$0;
                    n3 = ((Enum)object).ordinal();
                    n3 = nArray[n3];
                }
                int n4 = 1;
                if (n3 == n4) break block7;
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        String string2 = "";
                        break block6;
                    } else {
                        String string3 = VIEW_TYPE_HIDDEN;
                    }
                    break block6;
                } else {
                    String string4 = VIEW_TYPE_GRID;
                }
                break block6;
            }
            String string5 = VIEW_TYPE_LIST;
        }
        void var5_12 = var1_3;
        NewCustomEventsRevamp newCustomEventsRevamp = this.newCustomEventsRevamp;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        String string6 = av_0.a(analyticsManager$Companion);
        String string7 = av_0.a(analyticsManager$Companion);
        String string8 = this.previousScreen;
        String string9 = this.previousScreenType;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "product list interactions", "toggle button view", (String)var5_12, "toggle_button_view", string6, string7, string8, null, string9, false, null, 1536, null);
    }
}

