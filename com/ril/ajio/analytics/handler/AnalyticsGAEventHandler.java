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
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler$Companion;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener$DefaultImpls;
import com.ril.ajio.services.entity.GABannerAdData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class AnalyticsGAEventHandler
extends Handler {
    public static final int $stable = 0;
    public static final String BANNER_IMPRESSION = "bannerImpression";
    public static final String BANNER_POSITION = "bannerPosition";
    public static final String BANNER_THEME_EXTENDED = "banner_theme_extended";
    public static final String COMPONENT_POSITION = "componentPosition";
    public static final String CREATIVE = "creative";
    public static final String CREATIVE_SLOT = "creative_slot";
    public static final AnalyticsGAEventHandler$Companion Companion;
    public static final String FLEEK_IMPRESSION_OBJ = "fleek_impression_obj";
    public static final String ID = "id";
    public static final String IS_ADS_BANNER = "isAdsBanner";
    public static final String IS_PD_BANNER = "isPdBanner";
    public static final String IS_PLP = "isPLP";
    public static final String LIST_NAME = "listName";
    public static final String NAME = "name";
    public static final String PAGE_TYPE = "pageType";
    public static final String PLP_PAGE_TITLE = "plp_page_title";
    public static final String PLP_SOURCE = "plpSource";
    public static final String PLP_SOURCE_DETAIL = "plpSourceDetail";
    public static final String POST_ID = "post_id";
    public static final String PRODUCT_IMPRESSION = "productImpression";
    public static final int PUSH_BANNER_AD_IMPRESSION_DATA = 1005;
    public static final int PUSH_BANNER_IMPRESSION_DATA = 1003;
    public static final int PUSH_FLEEK_IMPRESSION_DATA = 1006;
    public static final int PUSH_IMPRESSION_DATA = 1001;
    public static final String SCREEN_NAME = "screenName";
    public static final String SCREEN_TYPE = "screenType";
    public static final int SEND_BANNER_DATA_ON_DESTROY = 1004;
    public static final int SEND_DATA_ON_DESTROY = 1002;
    public static final int SEND_FLEEK_IMPRESSION_ON_DESTROY = 1007;
    public static final int SEND_FLEEK_PRODUCT_IMPRESSIONS = 1008;
    public static final String SERVED_FROM_CMS = "servedFromCms";
    public static final String SIZE_TEXT = "sizeText";
    public static final String STORY_ID = "story_id";
    private static volatile AnalyticsGAEventHandler mINSTANCE;
    private int THRESHOLD;
    private GABannerAdData bannerAdData;
    private HashMap bannerAdList;
    private int bannerPosition;
    private int componentPosition;
    private String creative;
    private Integer creativeSlot;
    private ArrayList fleekImpressionsList;
    private String isBannerThemeExtended;
    private boolean isPLP;
    private boolean isPdBanner;
    private String listName;
    private String name;
    private HashMap newBannerRevampList;
    private ArrayList newProductRevampList;
    private OnGAEventHandlerListener onGAEventHandlerListener;
    private String pageTitle;
    private String pageType;
    private String plpSource;
    private String plpSourceDetail;
    private String postId;
    private String screenName;
    private String screenType;
    private boolean servedFromCms;
    private String sizeText;
    private String storyId;
    private String url;

    static {
        AnalyticsGAEventHandler$Companion analyticsGAEventHandler$Companion;
        Companion = analyticsGAEventHandler$Companion = new AnalyticsGAEventHandler$Companion(null);
        $stable = 8;
    }

    public AnalyticsGAEventHandler(HandlerThread object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "handlerThread");
        object = object.getLooper();
        super((Looper)object);
        super();
        this.newProductRevampList = object;
        super();
        this.newBannerRevampList = object;
        super();
        this.bannerAdList = object;
        super();
        this.fleekImpressionsList = object;
        object = "";
        this.url = object;
        this.listName = object;
        this.sizeText = object;
        this.screenName = object;
        this.screenType = object;
        this.pageType = object;
        this.plpSourceDetail = object;
        this.plpSource = object;
        this.isBannerThemeExtended = object;
        object = z40_0.Companion;
        this.THRESHOLD = n3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.g("ga_revamp_events_bundle_threshold");
    }

    public static final /* synthetic */ AnalyticsGAEventHandler access$getMINSTANCE$cp() {
        return mINSTANCE;
    }

    public static final /* synthetic */ void access$setMINSTANCE$cp(AnalyticsGAEventHandler analyticsGAEventHandler) {
        mINSTANCE = analyticsGAEventHandler;
    }

    private final void pushBannerAdImpression() {
        Object object = this.bannerAdList;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2) {
            OnGAEventHandlerListener onGAEventHandlerListener = this.onGAEventHandlerListener;
            if (onGAEventHandlerListener != null) {
                object = AnalyticsManager.Companion;
                String string2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_PROMOTION();
                HashMap hashMap = this.bannerAdList;
                String string3 = this.screenName;
                String string4 = bv_0.a((AnalyticsManager$Companion)object);
                String string5 = this.screenType;
                String string6 = cv_0.a((AnalyticsManager$Companion)object);
                String string7 = this.pageType;
                boolean bl3 = this.servedFromCms;
                boolean bl4 = true;
                String string8 = this.pageTitle;
                onGAEventHandlerListener.pushEEBannerImpression(string2, hashMap, string3, string4, string5, string6, string7, bl3, bl4, string8);
            }
            object = this.bannerAdList;
            ((HashMap)object).clear();
        }
    }

    private final void pushEEBannerImpression() {
        Object object = this.newBannerRevampList;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2) {
            OnGAEventHandlerListener onGAEventHandlerListener = this.onGAEventHandlerListener;
            if (onGAEventHandlerListener != null) {
                object = AnalyticsManager.Companion;
                String string2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_PROMOTION();
                HashMap hashMap = this.newBannerRevampList;
                String string3 = this.screenName;
                String string4 = bv_0.a((AnalyticsManager$Companion)object);
                String string5 = this.screenType;
                String string6 = cv_0.a((AnalyticsManager$Companion)object);
                String string7 = this.pageType;
                boolean bl3 = this.servedFromCms;
                int n3 = 768;
                OnGAEventHandlerListener$DefaultImpls.pushEEBannerImpression$default(onGAEventHandlerListener, string2, hashMap, string3, string4, string5, string6, string7, bl3, false, null, n3, null);
            }
            object = this.newBannerRevampList;
            ((HashMap)object).clear();
        }
    }

    private final void pushEEFleekImpressions() {
        ArrayList arrayList = this.fleekImpressionsList;
        boolean bl2 = arrayList.isEmpty() ^ true;
        if (bl2) {
            Object object;
            OnGAEventHandlerListener onGAEventHandlerListener = this.onGAEventHandlerListener;
            if (onGAEventHandlerListener != null) {
                ArrayList arrayList2 = this.fleekImpressionsList;
                String string2 = this.screenName;
                object = AnalyticsManager.Companion;
                String string3 = bv_0.a((AnalyticsManager$Companion)object);
                String string4 = this.screenType;
                String string5 = cv_0.a((AnalyticsManager$Companion)object);
                onGAEventHandlerListener.pushEEFleekImpressions(arrayList2, string2, string3, string4, string5);
            }
            object = this.fleekImpressionsList;
            ((ArrayList)object).removeAll(arrayList);
        }
    }

    private final void pushEEProductImpression(boolean bl2) {
        int n3;
        AnalyticsGAEventHandler analyticsGAEventHandler = this;
        Collection collection = this.newProductRevampList;
        int n4 = collection.isEmpty() ^ 1;
        if (n4 != 0) {
            if (!bl2) {
                int n7;
                collection = this.newProductRevampList;
                n3 = collection.size();
                if (n3 > (n7 = this.THRESHOLD)) {
                    n3 = n7;
                }
                collection = CollectionsKt.f0(collection, n3);
            } else {
                collection = this.newProductRevampList;
            }
            Object object = analyticsGAEventHandler.onGAEventHandlerListener;
            if (object != null) {
                Object object2 = AnalyticsManager.Companion;
                String string2 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_ITEM_LIST();
                String string3 = analyticsGAEventHandler.listName;
                String string4 = analyticsGAEventHandler.sizeText;
                String string5 = analyticsGAEventHandler.screenName;
                boolean bl3 = analyticsGAEventHandler.isPLP;
                String string6 = bv_0.a((AnalyticsManager$Companion)object2);
                String string7 = analyticsGAEventHandler.screenType;
                String string8 = cv_0.a((AnalyticsManager$Companion)object2);
                String string9 = analyticsGAEventHandler.plpSourceDetail;
                String string10 = analyticsGAEventHandler.plpSource;
                String string11 = analyticsGAEventHandler.isBannerThemeExtended;
                String string12 = analyticsGAEventHandler.pageTitle;
                object2 = analyticsGAEventHandler.storyId;
                Object object3 = string12;
                string12 = analyticsGAEventHandler.postId;
                Object object4 = object2;
                object2 = collection;
                String string13 = string12;
                string12 = object3;
                object3 = object4;
                object4 = string13;
                object.pushEEProductImpression((List)collection, string2, string3, string4, string5, bl3, string6, string7, string8, string9, string10, string11, string12, (String)object3, string13);
            }
            object = analyticsGAEventHandler.newProductRevampList;
            collection = collection;
            ((ArrayList)object).removeAll(collection);
        }
        if ((n4 = (collection = analyticsGAEventHandler.newProductRevampList).isEmpty() ^ 1) != 0 && (n4 = (collection = analyticsGAEventHandler.newProductRevampList).size()) >= (n3 = analyticsGAEventHandler.THRESHOLD)) {
            this.pushEEProductImpression(bl2);
        }
    }

    private final void pushFleekProductImpressions(Message object) {
        object = ((Message)object).obj;
        boolean bl2 = object instanceof JSONObject;
        Object object2 = null;
        object = bl2 ? (JSONObject)object : null;
        if (object != null) {
            Object object3 = object.get(PRODUCT_IMPRESSION);
            boolean bl3 = object3 instanceof List;
            if (bl3) {
                object2 = object3;
                object2 = (List)object3;
            }
            object3 = object.get(LIST_NAME);
            String string2 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object3, string2);
            this.listName = object3 = (String)object3;
            object3 = object.get(SIZE_TEXT);
            Intrinsics.checkNotNull(object3, string2);
            this.sizeText = object3 = (String)object3;
            object3 = object.get(IS_PLP);
            String string3 = "null cannot be cast to non-null type kotlin.Boolean";
            Intrinsics.checkNotNull(object3, string3);
            this.isPLP = bl2 = ((Boolean)object3).booleanValue();
            object3 = object.get(SCREEN_NAME);
            Intrinsics.checkNotNull(object3, string2);
            this.screenName = object3 = (String)object3;
            object3 = object.get(SCREEN_TYPE);
            Intrinsics.checkNotNull(object3, string2);
            this.screenType = object3 = (String)object3;
            object3 = BANNER_THEME_EXTENDED;
            boolean bl4 = object.has((String)object3);
            if (bl4) {
                object3 = object.get((String)object3);
                Intrinsics.checkNotNull(object3, string2);
                this.isBannerThemeExtended = object3 = (String)object3;
            }
            if (bl4 = object.has((String)(object3 = PLP_SOURCE_DETAIL))) {
                object3 = object.get((String)object3);
                Intrinsics.checkNotNull(object3, string2);
                this.plpSourceDetail = object3 = (String)object3;
            }
            if (bl4 = object.has((String)(object3 = PLP_SOURCE))) {
                object3 = object.get((String)object3);
                Intrinsics.checkNotNull(object3, string2);
                this.plpSource = object3 = (String)object3;
            }
            if (bl3 = object.has((String)(object3 = PLP_PAGE_TITLE))) {
                object = object.optString((String)object3);
                this.pageTitle = object;
            }
            if (object2 != null) {
                object = this.newProductRevampList;
                object2 = (Collection)object2;
                ((ArrayList)object).addAll(object2);
            }
        }
        this.pushEEProductImpression(false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void handleMessage(Message var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = "name";
        var5_5 = "creative";
        var6_6 = "creative_slot";
        var7_7 = "banner_ad_data";
        var8_8 = "msg";
        Intrinsics.checkNotNullParameter(var1_1, (String)var8_8);
        super.handleMessage(var1_1);
        var9_9 = var1_1.what;
        var10_10 = "Tracking the Banner impression Json error ";
        var11_11 = "bannerImpression";
        var12_12 = "plp_page_title";
        var13_13 = "bannerPosition";
        var14_14 = "null cannot be cast to non-null type kotlin.Int";
        var15_15 = "isPdBanner";
        var16_16 = "screenType";
        var17_17 = "null cannot be cast to non-null type kotlin.Boolean";
        var18_18 = "screenName";
        var19_19 = "servedFromCms";
        var20_20 = "|";
        var21_21 = null;
        var22_22 = "pageType";
        var23_23 = "null cannot be cast to non-null type kotlin.String";
        switch (var9_9) {
            default: {
                break;
            }
            case 1008: {
                this.pushFleekProductImpressions(var1_1);
                break;
            }
            case 1007: {
                this.pushEEFleekImpressions();
                break;
            }
            case 1006: {
                var3_3 = var1_1.obj;
                var24_24 = var3_3 instanceof JSONObject;
                if (var24_24) {
                    var3_3 = (JSONObject)var3_3;
                } else {
                    var25_28 = 0;
                    var3_3 = null;
                }
                if (var3_3 != null) {
                    var20_20 = "fleek_impression_obj";
                    var26_33 = var3_3.has((String)var20_20);
                    if (var26_33 && (var26_33 = (var20_20 = var3_3.get((String)var20_20)) instanceof wq0_0)) {
                        var21_21 = var20_20;
                        var21_21 = (wq0_0)var20_20;
                    }
                    var20_20 = var21_21;
                    var4_4 = var3_3.get(var18_18);
                    Intrinsics.checkNotNull(var4_4, (String)var23_23);
                    var2_2.screenName = var4_4 = (String)var4_4;
                    var3_3 = var3_3.get((String)var16_16);
                    Intrinsics.checkNotNull(var3_3, (String)var23_23);
                    var2_2.screenType = var3_3 = (String)var3_3;
                    if (var21_21 != null) {
                        var3_3 = var2_2.fleekImpressionsList;
                        var3_3.add(var21_21);
                    }
                }
                if ((var25_28 = (var3_3 = var2_2.fleekImpressionsList).size()) < (var27_36 = var2_2.THRESHOLD)) break;
                this.pushEEFleekImpressions();
                break;
            }
            case 1005: {
                var3_3 = var1_1.obj;
                var9_9 = var3_3 instanceof JSONObject;
                if (var9_9 != 0) {
                    var3_3 = (JSONObject)var3_3;
                } else {
                    var25_29 = false;
                    var3_3 = null;
                }
                if (var3_3 == null) ** GOTO lbl256
                var8_8 = var3_3.get(var11_11);
                Intrinsics.checkNotNull(var8_8, (String)var23_23);
                var8_8 = (String)var8_8;
                var2_2.url = var8_8;
                var8_8 = var3_3.get(var18_18);
                Intrinsics.checkNotNull(var8_8, (String)var23_23);
                var8_8 = (String)var8_8;
                var2_2.screenName = var8_8;
                var16_16 = var3_3.get((String)var16_16);
                Intrinsics.checkNotNull(var16_16, (String)var23_23);
                var16_16 = (String)var16_16;
                var2_2.screenType = var16_16;
                var27_37 = (int)var3_3.has(var13_13);
                if (var27_37 == 0) ** GOTO lbl105
                var16_16 = var3_3.get(var13_13);
                Intrinsics.checkNotNull(var16_16, var14_14);
                var16_16 = (Integer)var16_16;
                var27_37 = var16_16.intValue();
                var2_2.bannerPosition = var27_37;
lbl105:
                // 3 sources

                var27_37 = (int)var3_3.has((String)var7_7);
                if (var27_37 == 0) ** GOTO lbl115
                var16_16 = var3_3.opt((String)var7_7);
                var7_7 = "null cannot be cast to non-null type com.ril.ajio.services.entity.GABannerAdData";
                Intrinsics.checkNotNull(var16_16, (String)var7_7);
                var16_16 = (GABannerAdData)var16_16;
                var2_2.bannerAdData = var16_16;
lbl115:
                // 2 sources

                var16_16 = var2_2.bannerAdData;
                var7_7 = "";
                if (var16_16 == null) ** GOTO lbl134
                var16_16 = var16_16.getComponentIndex();
                if (var16_16 == null) ** GOTO lbl134
                var27_37 = var16_16.intValue();
                var8_8 = new StringBuilder();
                var8_8.append(var27_37);
                var16_16 = "-";
                var8_8.append((String)var16_16);
                var16_16 = var8_8.toString();
                ** GOTO lbl136
lbl134:
                // 2 sources

                var16_16 = var7_7;
lbl136:
                // 3 sources

                var9_9 = (int)var3_3.has((String)var6_6);
                if (var9_9 == 0) ** GOTO lbl146
                var6_6 = var3_3.get((String)var6_6);
                Intrinsics.checkNotNull(var6_6, var14_14);
                var6_6 = (Integer)var6_6;
                var2_2.creativeSlot = var6_6;
lbl146:
                // 3 sources

                var28_40 = var3_3.has((String)var5_5);
                if (!var28_40) ** GOTO lbl156
                var5_5 = var3_3.get((String)var5_5);
                Intrinsics.checkNotNull(var5_5, (String)var23_23);
                var5_5 = (String)var5_5;
                var2_2.creative = var5_5;
lbl156:
                // 3 sources

                var29_41 = var3_3.has((String)var4_4);
                if (!var29_41) ** GOTO lbl165
                var4_4 = var3_3.get((String)var4_4);
                Intrinsics.checkNotNull(var4_4, (String)var23_23);
                var4_4 = (String)var4_4;
                var2_2.name = var4_4;
lbl165:
                // 2 sources

                var30_43 = var2_2.bannerPosition;
                var4_4 = new StringBuilder();
                var4_4.append(var16_16);
                var4_4.append(var30_43);
                var16_16 = var4_4.toString();
                var23_23 = var3_3.optString(var12_12);
                var2_2.pageTitle = var23_23;
                var23_23 = var2_2.url;
                var4_4 = new StringBuilder();
                var5_5 = var2_2.bannerAdData;
                if (var5_5 == null) ** GOTO lbl187
                var5_5 = var5_5.getCampaignId();
                if (var5_5 != null) ** GOTO lbl189
lbl187:
                // 2 sources

                var5_5 = var7_7;
lbl189:
                // 3 sources

                var4_4.append((String)var5_5);
                var4_4.append((String)var20_20);
                var5_5 = var2_2.bannerAdData;
                if (var5_5 == null) ** GOTO lbl200
                var5_5 = var5_5.getCreativeName();
                if (var5_5 != null) ** GOTO lbl204
lbl200:
                // 3 sources

                var5_5 = var2_2.creative;
                if (var5_5 != null) ** GOTO lbl204
                var5_5 = var7_7;
lbl204:
                // 4 sources

                var4_4.append((String)var5_5);
                var4_4.append((String)var20_20);
                var4_4.append((String)var16_16);
                var4_4.append((String)var20_20);
                var16_16 = var2_2.bannerAdData;
                if (var16_16 == null) ** GOTO lbl221
                var16_16 = var16_16.getImageName();
                if (var16_16 != null) ** GOTO lbl225
lbl221:
                // 3 sources

                var16_16 = var2_2.name;
                if (var16_16 != null) ** GOTO lbl225
                var16_16 = var7_7;
lbl225:
                // 4 sources

                var4_4.append((String)var16_16);
                var4_4.append((String)var20_20);
                var16_16 = var2_2.bannerAdData;
                if (var16_16 == null) ** GOTO lbl237
                var16_16 = var16_16.getBannerType();
                if (var16_16 == null) ** GOTO lbl237
                var7_7 = var16_16;
lbl237:
                // 4 sources

                var4_4.append((String)var7_7);
                var4_4.append((String)var20_20);
                var16_16 = var2_2.bannerAdData;
                if (var16_16 == null) ** GOTO lbl246
                var21_21 = var16_16.getPageName();
lbl246:
                // 2 sources

                var16_16 = var21_21;
                var4_4.append((String)var21_21);
                var16_16 = var2_2.bannerAdList;
                var20_20 = var4_4.toString();
                var16_16.put(var20_20, var23_23);
lbl256:
                // 2 sources

                var16_16 = var2_2.bannerAdList;
                var27_37 = var16_16.size();
                var24_25 = var2_2.THRESHOLD;
                if (var27_37 < var24_25) break;
                try {
                    this.pushBannerAdImpression();
                }
                catch (Exception v0) {
                    var16_16 = yn3_0.a;
                    var20_20 = new StringBuilder(var10_10);
                    var20_20.append(var3_3);
                    var3_3 = var20_20.toString();
                    var24_25 = 0;
                    var20_20 = new Object[]{};
                    var16_16.a((String)var3_3, (Object[])var20_20);
                }
                break;
            }
            case 1004: {
                this.pushEEBannerImpression();
                this.pushBannerAdImpression();
                break;
            }
            case 1003: {
                var3_3 = var1_1.obj;
                var26_34 = var3_3 instanceof JSONObject;
                if (var26_34) {
                    var3_3 = (JSONObject)var3_3;
                } else {
                    var25_30 = false;
                    var3_3 = null;
                }
                if (var3_3 == null) ** GOTO lbl409
                var4_4 = var3_3.get(var11_11);
                Intrinsics.checkNotNull(var4_4, (String)var23_23);
                var4_4 = (String)var4_4;
                var2_2.url = var4_4;
                var4_4 = var3_3.get(var18_18);
                Intrinsics.checkNotNull(var4_4, (String)var23_23);
                var4_4 = (String)var4_4;
                var2_2.screenName = var4_4;
                var16_16 = var3_3.get((String)var16_16);
                Intrinsics.checkNotNull(var16_16, (String)var23_23);
                var16_16 = (String)var16_16;
                var2_2.screenType = var16_16;
                var16_16 = "componentPosition";
                var16_16 = var3_3.get((String)var16_16);
                Intrinsics.checkNotNull(var16_16, var14_14);
                var16_16 = (Integer)var16_16;
                var27_38 = var16_16.intValue();
                var2_2.componentPosition = var27_38;
                var16_16 = var3_3.get(var13_13);
                Intrinsics.checkNotNull(var16_16, var14_14);
                var16_16 = (Integer)var16_16;
                var27_38 = var16_16.intValue();
                var2_2.bannerPosition = var27_38;
                var16_16 = var22_22;
                var26_34 = var3_3.has(var22_22);
                if (!var26_34) ** GOTO lbl339
                var16_16 = var3_3.get(var22_22);
                Intrinsics.checkNotNull(var16_16, (String)var23_23);
                var16_16 = (String)var16_16;
                var2_2.pageType = var16_16;
lbl339:
                // 2 sources

                var16_16 = var19_19;
                var30_44 = var3_3.has(var19_19);
                if (var30_44 == 0) ** GOTO lbl353
                var16_16 = var3_3.get(var19_19);
                var4_4 = var17_17;
                Intrinsics.checkNotNull(var16_16, var17_17);
                var16_16 = (Boolean)var16_16;
                var27_38 = (int)var16_16.booleanValue();
                var2_2.servedFromCms = var27_38;
lbl353:
                // 2 sources

                var16_16 = var15_15;
                var30_44 = var3_3.has(var15_15);
                if (var30_44 == 0) ** GOTO lbl373
                var16_16 = var3_3.get(var15_15);
                var30_44 = var16_16 instanceof Boolean;
                if (var30_44 != 0) {
                    var21_21 = var16_16;
                    var21_21 = (Boolean)var16_16;
                }
                if (var21_21 != null) {
                    var27_38 = (int)var21_21.booleanValue();
                } else {
                    var27_38 = 0;
                    var16_16 = null;
                }
                var2_2.isPdBanner = var27_38;
lbl373:
                // 3 sources

                var16_16 = new StringBuilder();
                var30_44 = var2_2.componentPosition;
                var16_16.append(var30_44);
                var16_16.append((String)var20_20);
                var30_44 = var2_2.bannerPosition;
                var16_16.append(var30_44);
                var16_16.append((String)var20_20);
                var23_23 = UUID.randomUUID();
                var16_16.append(var23_23);
                var16_16.append((String)var20_20);
                var24_26 = var2_2.isPdBanner;
                var16_16.append(var24_26);
                var20_20 = var2_2.newBannerRevampList;
                var16_16 = var16_16.toString();
                var23_23 = var2_2.url;
                var16_16 = var20_20.put(var16_16, var23_23);
                var16_16 = (String)var16_16;
lbl409:
                // 3 sources

                var16_16 = var2_2.newBannerRevampList;
                var27_38 = var16_16.size();
                var24_26 = var2_2.THRESHOLD;
                if (var27_38 < var24_26) break;
                try {
                    this.pushEEBannerImpression();
                }
                catch (Exception v1) {
                    var16_16 = yn3_0.a;
                    var20_20 = new StringBuilder(var10_10);
                    var20_20.append(var3_3);
                    var3_3 = var20_20.toString();
                    var24_26 = false;
                    var20_20 = new Object[]{};
                    var16_16.a((String)var3_3, (Object[])var20_20);
                }
                break;
            }
            case 1002: {
                this.pushBannerAdImpression();
                var25_31 = true;
                this.pushEEProductImpression(var25_31);
                break;
            }
            case 1001: {
                var4_4 = var17_17;
                var3_3 = var1_1.obj;
                var24_27 = var3_3 instanceof JSONObject;
                if (var24_27) {
                    var3_3 = (JSONObject)var3_3;
                } else {
                    var25_32 = 0;
                    var3_3 = null;
                }
                if (var3_3 != null) {
                    var20_20 = var3_3.get("productImpression");
                    var29_42 = var20_20 instanceof List;
                    if (var29_42) {
                        var20_20 = (List)var20_20;
                    } else {
                        var24_27 = false;
                        var20_20 = null;
                    }
                    var5_5 = var3_3.get("listName");
                    Intrinsics.checkNotNull(var5_5, (String)var23_23);
                    var2_2.listName = var5_5 = (String)var5_5;
                    var5_5 = var3_3.get("sizeText");
                    Intrinsics.checkNotNull(var5_5, (String)var23_23);
                    var2_2.sizeText = var5_5 = (String)var5_5;
                    var5_5 = var3_3.get("isPLP");
                    Intrinsics.checkNotNull(var5_5, (String)var4_4);
                    var5_5 = (Boolean)var5_5;
                    var2_2.isPLP = var26_35 = var5_5.booleanValue();
                    var4_4 = var3_3.get(var18_18);
                    Intrinsics.checkNotNull(var4_4, (String)var23_23);
                    var2_2.screenName = var4_4 = (String)var4_4;
                    var16_16 = var3_3.get((String)var16_16);
                    Intrinsics.checkNotNull(var16_16, (String)var23_23);
                    var2_2.screenType = var16_16 = (String)var16_16;
                    var16_16 = "post_id";
                    var26_35 = var3_3.has((String)var16_16);
                    if (var26_35) {
                        var26_35 = (var16_16 = var3_3.get((String)var16_16)) instanceof String;
                        if (var26_35) {
                            var16_16 = (String)var16_16;
                        } else {
                            var27_39 = 0;
                            var16_16 = null;
                        }
                        var2_2.postId = var16_16;
                    }
                    if ((var27_39 = (int)var3_3.has((String)(var16_16 = "story_id"))) != 0) {
                        var16_16 = var3_3.get("story_id");
                        var26_35 = var16_16 instanceof String;
                        if (var26_35) {
                            var21_21 = var16_16;
                            var21_21 = (String)var16_16;
                        }
                        var16_16 = var21_21;
                        var2_2.storyId = var21_21;
                    }
                    if ((var27_39 = (int)var3_3.has((String)(var16_16 = "banner_theme_extended"))) != 0) {
                        var16_16 = var3_3.get("banner_theme_extended");
                        Intrinsics.checkNotNull(var16_16, (String)var23_23);
                        var16_16 = (String)var16_16;
                        var2_2.isBannerThemeExtended = var16_16;
                    }
                    if ((var27_39 = (int)var3_3.has((String)(var16_16 = "plpSourceDetail"))) != 0) {
                        var16_16 = var3_3.get("plpSourceDetail");
                        Intrinsics.checkNotNull(var16_16, (String)var23_23);
                        var2_2.plpSourceDetail = var16_16 = (String)var16_16;
                    }
                    if ((var27_39 = (int)var3_3.has((String)(var16_16 = "plpSource"))) != 0) {
                        var16_16 = var3_3.get("plpSource");
                        Intrinsics.checkNotNull(var16_16, (String)var23_23);
                        var2_2.plpSource = var16_16 = (String)var16_16;
                    }
                    if ((var27_39 = (int)var3_3.has(var12_12)) != 0) {
                        var2_2.pageTitle = var3_3 = var3_3.optString(var12_12);
                    }
                    if (var20_20 != null) {
                        var3_3 = var2_2.newProductRevampList;
                        var20_20 = (Collection)var20_20;
                        var3_3.addAll(var20_20);
                    }
                }
                if ((var25_32 = (var3_3 = var2_2.newProductRevampList).size()) < (var27_39 = var2_2.THRESHOLD)) break;
                var25_32 = 0;
                var3_3 = null;
                var2_2.pushEEProductImpression(false);
            }
        }
    }

    public final void setOnGAEventHandlerListener(OnGAEventHandlerListener onGAEventHandlerListener) {
        this.onGAEventHandlerListener = onGAEventHandlerListener;
    }
}

