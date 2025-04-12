/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  org.json.JSONObject
 */
package com.ril.ajio.analytics.handler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget$Companion;
import com.ril.ajio.analytics.handler.OnGACuratedWidgetEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener$DefaultImpls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AnalyticsGAEventHandlerMultipleWidget
extends Handler {
    public static final int $stable = 0;
    public static final String BANNER_POSITION = "bannerPosition";
    public static final String BANNER_THEME_EXTENDED = "banner_theme_extended";
    public static final String COMPONENT_POSITION = "componentPosition";
    public static final String CURATED_WIDGET_OPTION_IMPRESSION = "curatedWidgetOptionImpression";
    public static final AnalyticsGAEventHandlerMultipleWidget$Companion Companion;
    public static final String IS_PLP = "isPLP";
    public static final String LIST_NAME = "listName";
    public static final String PAGE_TYPE = "pageType";
    public static final String PLP_SOURCE = "plpSource";
    public static final String PLP_SOURCE_DETAIL = "plpSourceDetail";
    public static final String PRODUCT_IMPRESSION = "productImpression";
    public static final int PUSH_CURATED_OPTIONS_IMPRESSION_DATA = 1007;
    public static final int PUSH_PRODUCT_IMPRESSION_DATA = 1005;
    public static final int PUSH_SIMILAR_PRODUCT_IMPRESSION_DATA = 1008;
    public static final String ROW_POSITION = "rowPosition";
    public static final String SCREEN_NAME = "screenName";
    public static final String SCREEN_TYPE = "screenType";
    public static final int SEND_PRODUCT_DATA_ON_DESTROY = 1006;
    public static final String SIMILAR_PRODUCT_IMPRESSION = "similarProductImpression";
    public static final String SIZE_TEXT = "sizeText";
    private static volatile AnalyticsGAEventHandlerMultipleWidget mINSTANCE;
    private int THRESHOLD;
    private String curatedListName;
    private String isBannerThemeExtended;
    private boolean isPLP;
    private ArrayList newCuratedWidgetOptionsList;
    private ArrayList newProductRevampList;
    private ArrayList newSimilarProductsList;
    private OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener;
    private OnGAEventHandlerListener onGAEventHandlerListener;
    private String plpSource;
    private String plpSourceDetail;
    private String productListName;
    private int rowPosition;
    private String screenName;
    private String screenType;
    private String similarProductListName;
    private String sizeText;

    static {
        AnalyticsGAEventHandlerMultipleWidget$Companion analyticsGAEventHandlerMultipleWidget$Companion;
        Companion = analyticsGAEventHandlerMultipleWidget$Companion = new AnalyticsGAEventHandlerMultipleWidget$Companion(null);
        $stable = 8;
    }

    public AnalyticsGAEventHandlerMultipleWidget(HandlerThread object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "handlerThread");
        object = object.getLooper();
        super((Looper)object);
        super();
        this.newProductRevampList = object;
        super();
        this.newCuratedWidgetOptionsList = object;
        super();
        this.newSimilarProductsList = object;
        object = "";
        this.curatedListName = object;
        this.productListName = object;
        this.similarProductListName = object;
        this.sizeText = object;
        this.screenName = object;
        this.screenType = object;
        this.plpSourceDetail = object;
        this.plpSource = object;
        this.isBannerThemeExtended = object;
        object = z40_0.Companion;
        this.THRESHOLD = n3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.g("ga_revamp_events_bundle_threshold");
    }

    public static final /* synthetic */ AnalyticsGAEventHandlerMultipleWidget access$getMINSTANCE$cp() {
        return mINSTANCE;
    }

    public static final /* synthetic */ void access$setMINSTANCE$cp(AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget) {
        mINSTANCE = analyticsGAEventHandlerMultipleWidget;
    }

    private final void pushEECuratedOptionsImpression(boolean bl2) {
        Object object = this.newCuratedWidgetOptionsList;
        int n3 = object.isEmpty() ^ 1;
        if (n3 != 0) {
            Collection collection;
            if (!bl2) {
                int n4;
                collection = this.newCuratedWidgetOptionsList;
                n3 = collection.size();
                if (n3 > (n4 = this.THRESHOLD)) {
                    n3 = n4;
                }
                collection = CollectionsKt.f0(collection, n3);
            } else {
                collection = this.newCuratedWidgetOptionsList;
            }
            object = this.onGACuratedWidgetEventHandlerListener;
            if (object != null) {
                int n7 = this.rowPosition;
                String string2 = this.screenName;
                Object object2 = AnalyticsManager.Companion;
                String string3 = bv_0.a((AnalyticsManager$Companion)object2);
                String string4 = this.screenType;
                String string5 = cv_0.a((AnalyticsManager$Companion)object2);
                String string6 = this.curatedListName;
                object2 = collection;
                object.pushEECuratedWidgetOptionsImpressions((List)collection, n7, string2, string3, string4, string5, string6);
            }
            object = this.newCuratedWidgetOptionsList;
            collection = collection;
            ((ArrayList)object).removeAll(collection);
        }
    }

    private final void pushEEProductImpression(boolean bl2) {
        AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget = this;
        Collection collection = this.newProductRevampList;
        boolean bl3 = collection.isEmpty() ^ true;
        if (bl3) {
            if (!bl2) {
                int n3;
                collection = this.newProductRevampList;
                int n4 = collection.size();
                if (n4 > (n3 = this.THRESHOLD)) {
                    n4 = n3;
                }
                collection = CollectionsKt.f0(collection, n4);
            } else {
                collection = this.newProductRevampList;
            }
            Object object = analyticsGAEventHandlerMultipleWidget.onGAEventHandlerListener;
            if (object != null) {
                Object object2 = AnalyticsManager.Companion;
                String string2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
                String string3 = analyticsGAEventHandlerMultipleWidget.productListName;
                String string4 = analyticsGAEventHandlerMultipleWidget.sizeText;
                String string5 = analyticsGAEventHandlerMultipleWidget.screenName;
                boolean bl4 = analyticsGAEventHandlerMultipleWidget.isPLP;
                String string6 = bv_0.a((AnalyticsManager$Companion)object2);
                String string7 = analyticsGAEventHandlerMultipleWidget.screenType;
                String string8 = cv_0.a((AnalyticsManager$Companion)object2);
                String string9 = analyticsGAEventHandlerMultipleWidget.plpSourceDetail;
                String string10 = analyticsGAEventHandlerMultipleWidget.plpSource;
                String string11 = analyticsGAEventHandlerMultipleWidget.isBannerThemeExtended;
                int n7 = 28672;
                object2 = collection;
                OnGAEventHandlerListener$DefaultImpls.pushEEProductImpression$default((OnGAEventHandlerListener)object, collection, string2, string3, string4, string5, bl4, string6, string7, string8, string9, string10, string11, null, null, null, n7, null);
            }
            object = analyticsGAEventHandlerMultipleWidget.newProductRevampList;
            collection = collection;
            ((ArrayList)object).removeAll(collection);
        }
    }

    private final void pushSimilarProductImpression(boolean bl2) {
        AnalyticsGAEventHandlerMultipleWidget analyticsGAEventHandlerMultipleWidget = this;
        Collection collection = this.newSimilarProductsList;
        boolean bl3 = collection.isEmpty() ^ true;
        if (bl3) {
            if (!bl2) {
                int n3;
                collection = this.newSimilarProductsList;
                int n4 = collection.size();
                if (n4 > (n3 = this.THRESHOLD)) {
                    n4 = n3;
                }
                collection = CollectionsKt.f0(collection, n4);
            } else {
                collection = this.newSimilarProductsList;
            }
            Object object = analyticsGAEventHandlerMultipleWidget.onGAEventHandlerListener;
            if (object != null) {
                Object object2 = AnalyticsManager.Companion;
                String string2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
                String string3 = analyticsGAEventHandlerMultipleWidget.similarProductListName;
                String string4 = analyticsGAEventHandlerMultipleWidget.sizeText;
                String string5 = analyticsGAEventHandlerMultipleWidget.screenName;
                boolean bl4 = analyticsGAEventHandlerMultipleWidget.isPLP;
                String string6 = bv_0.a((AnalyticsManager$Companion)object2);
                String string7 = analyticsGAEventHandlerMultipleWidget.screenType;
                String string8 = cv_0.a((AnalyticsManager$Companion)object2);
                String string9 = analyticsGAEventHandlerMultipleWidget.plpSourceDetail;
                String string10 = analyticsGAEventHandlerMultipleWidget.plpSource;
                String string11 = analyticsGAEventHandlerMultipleWidget.isBannerThemeExtended;
                int n7 = 28672;
                object2 = collection;
                OnGAEventHandlerListener$DefaultImpls.pushEEProductImpression$default((OnGAEventHandlerListener)object, collection, string2, string3, string4, string5, bl4, string6, string7, string8, string9, string10, string11, null, null, null, n7, null);
            }
            object = analyticsGAEventHandlerMultipleWidget.newSimilarProductsList;
            collection = collection;
            ((ArrayList)object).removeAll(collection);
        }
    }

    public void handleMessage(Message object) {
        Object object2 = "msg";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.handleMessage((Message)object);
        int n3 = ((Message)object).what;
        String string2 = "null cannot be cast to non-null type kotlin.Boolean";
        String string3 = IS_PLP;
        String string4 = SIZE_TEXT;
        String string5 = SCREEN_TYPE;
        String string6 = SCREEN_NAME;
        String string7 = LIST_NAME;
        String string8 = PLP_SOURCE;
        String string9 = PLP_SOURCE_DETAIL;
        String string10 = BANNER_THEME_EXTENDED;
        Object object3 = null;
        String string11 = "null cannot be cast to non-null type kotlin.String";
        switch (n3) {
            default: {
                break;
            }
            case 1008: {
                int n4;
                object = ((Message)object).obj;
                n3 = object instanceof JSONObject;
                if (n3 != 0) {
                    object = (JSONObject)object;
                } else {
                    n4 = 0;
                    object = null;
                }
                if (object != null) {
                    object2 = object.get(SIMILAR_PRODUCT_IMPRESSION);
                    boolean bl2 = object2 instanceof List;
                    if (bl2) {
                        object3 = object2;
                        object3 = (List)object2;
                    }
                    object2 = object.get(string7);
                    Intrinsics.checkNotNull(object2, string11);
                    this.similarProductListName = object2 = (String)object2;
                    object2 = object.get(string4);
                    Intrinsics.checkNotNull(object2, string11);
                    this.sizeText = object2 = (String)object2;
                    object2 = object.get(string3);
                    Intrinsics.checkNotNull(object2, string2);
                    n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    this.isPLP = n3;
                    object2 = object.get(string6);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenName = object2 = (String)object2;
                    object2 = object.get(string5);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenType = object2 = (String)object2;
                    n3 = (int)(object.has(string10) ? 1 : 0);
                    if (n3 != 0) {
                        object2 = object.get(string10);
                        Intrinsics.checkNotNull(object2, string11);
                        this.isBannerThemeExtended = object2 = (String)object2;
                    }
                    if ((n3 = (int)(object.has(string9) ? 1 : 0)) != 0) {
                        object2 = object.get(string9);
                        Intrinsics.checkNotNull(object2, string11);
                        this.plpSourceDetail = object2 = (String)object2;
                    }
                    if ((n3 = (int)(object.has(string8) ? 1 : 0)) != 0) {
                        object = object.get(string8);
                        Intrinsics.checkNotNull(object, string11);
                        this.plpSource = object = (String)object;
                    }
                    if (object3 != null) {
                        object = this.newSimilarProductsList;
                        object3 = (Collection)object3;
                        ((ArrayList)object).addAll(object3);
                    }
                }
                if ((n4 = ((ArrayList)(object = this.newSimilarProductsList)).size()) < (n3 = this.THRESHOLD)) break;
                this.pushSimilarProductImpression(false);
                break;
            }
            case 1007: {
                int n7;
                object = ((Message)object).obj;
                n3 = object instanceof JSONObject;
                if (n3 != 0) {
                    object = (JSONObject)object;
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null) {
                    object2 = object.get(CURATED_WIDGET_OPTION_IMPRESSION);
                    boolean bl3 = object2 instanceof List;
                    if (bl3) {
                        object3 = object2;
                        object3 = (List)object2;
                    }
                    if (object3 != null) {
                        object2 = this.newCuratedWidgetOptionsList;
                        object3 = (Collection)object3;
                        ((ArrayList)object2).addAll(object3);
                    }
                    object2 = object.get(ROW_POSITION);
                    string2 = "null cannot be cast to non-null type kotlin.Int";
                    Intrinsics.checkNotNull(object2, string2);
                    this.rowPosition = n3 = ((Integer)object2).intValue();
                    object2 = object.get(string6);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenName = object2 = (String)object2;
                    object2 = object.get(string5);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenType = object2 = (String)object2;
                    object = object.get(string7);
                    Intrinsics.checkNotNull(object, string11);
                    this.curatedListName = object = (String)object;
                }
                if ((n7 = ((ArrayList)(object = this.newCuratedWidgetOptionsList)).size()) < (n3 = this.THRESHOLD)) break;
                this.pushEECuratedOptionsImpression(false);
                break;
            }
            case 1006: {
                boolean bl4 = true;
                this.pushEEProductImpression(bl4);
                this.pushEECuratedOptionsImpression(bl4);
                this.pushSimilarProductImpression(bl4);
                break;
            }
            case 1005: {
                int n8;
                object = ((Message)object).obj;
                n3 = object instanceof JSONObject;
                if (n3 != 0) {
                    object = (JSONObject)object;
                } else {
                    n8 = 0;
                    object = null;
                }
                if (object != null) {
                    object2 = object.get(PRODUCT_IMPRESSION);
                    boolean bl5 = object2 instanceof List;
                    if (bl5) {
                        object3 = object2;
                        object3 = (List)object2;
                    }
                    object2 = object.get(string7);
                    Intrinsics.checkNotNull(object2, string11);
                    this.productListName = object2 = (String)object2;
                    object2 = object.get(string4);
                    Intrinsics.checkNotNull(object2, string11);
                    this.sizeText = object2 = (String)object2;
                    object2 = object.get(string3);
                    Intrinsics.checkNotNull(object2, string2);
                    n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                    this.isPLP = n3;
                    object2 = object.get(string6);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenName = object2 = (String)object2;
                    object2 = object.get(string5);
                    Intrinsics.checkNotNull(object2, string11);
                    this.screenType = object2 = (String)object2;
                    n3 = (int)(object.has(string10) ? 1 : 0);
                    if (n3 != 0) {
                        object2 = object.get(string10);
                        Intrinsics.checkNotNull(object2, string11);
                        this.isBannerThemeExtended = object2 = (String)object2;
                    }
                    if ((n3 = (int)(object.has(string9) ? 1 : 0)) != 0) {
                        object2 = object.get(string9);
                        Intrinsics.checkNotNull(object2, string11);
                        this.plpSourceDetail = object2 = (String)object2;
                    }
                    if ((n3 = (int)(object.has(string8) ? 1 : 0)) != 0) {
                        object = object.get(string8);
                        Intrinsics.checkNotNull(object, string11);
                        this.plpSource = object = (String)object;
                    }
                    if (object3 != null) {
                        object = this.newProductRevampList;
                        object3 = (Collection)object3;
                        ((ArrayList)object).addAll(object3);
                    }
                }
                if ((n8 = ((ArrayList)(object = this.newProductRevampList)).size()) < (n3 = this.THRESHOLD)) break;
                this.pushEEProductImpression(false);
            }
        }
    }

    public final void setOnGACuratedWidgetEventHandlerListener(OnGACuratedWidgetEventHandlerListener onGACuratedWidgetEventHandlerListener) {
        this.onGACuratedWidgetEventHandlerListener = onGACuratedWidgetEventHandlerListener;
    }

    public final void setOnGAEventHandlerListener(OnGAEventHandlerListener onGAEventHandlerListener) {
        this.onGAEventHandlerListener = onGAEventHandlerListener;
    }
}

