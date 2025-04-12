/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.jiobannerads;

import androidx.lifecycle.LiveData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdApi$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerAdsHomeApi$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerClickImpression$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$callBannerViewImpression$1;
import com.ril.ajio.jiobannerads.BannerAdViewModel$getAdsBannerDataMiscPages$1;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase;
import com.ril.ajio.services.data.Product.BannerAdTargetedFormulaData;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacet;
import com.ril.ajio.services.entity.Ad;
import com.ril.ajio.services.entity.AdConfig;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.BannerAd;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.entity.BannerAdsConfig;
import com.ril.ajio.services.entity.BannerResponse;
import com.ril.ajio.services.entity.Campaigns;
import com.ril.ajio.services.entity.Cmps;
import com.ril.ajio.services.entity.Component;
import com.ril.ajio.services.entity.DD;
import com.ril.ajio.services.entity.Result;
import com.ril.ajio.services.entity.ThirdPartyBannerAds;
import com.ril.ajio.services.entity.ThirdPartyBannerConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.b;
import kotlinx.coroutines.c;
import kotlinx.coroutines.g;

public final class BannerAdViewModel
extends jD3 {
    public static final int $stable = 8;
    private final LiveData additionalBannerLD;
    private final zr1_1 additionalBannerMLD;
    private final R53 bannerAdLD;
    private List bannerAdList;
    private final R53 bannerAdMLD;
    private final BannerAdUseCase bannerAdUseCase;
    private final R53 bannerAdsHome;
    private final c dispatcher;
    private HashMap externalAds;
    private HashMap jioBannerAdsMap;

    public BannerAdViewModel(BannerAdUseCase object, c c2) {
        Intrinsics.checkNotNullParameter(object, "bannerAdUseCase");
        Intrinsics.checkNotNullParameter(c2, "dispatcher");
        this.bannerAdUseCase = object;
        this.dispatcher = c2;
        this.bannerAdMLD = object = new R53();
        this.bannerAdLD = object;
        this.additionalBannerMLD = object = new zr1_1();
        this.additionalBannerLD = object;
        object = new HashMap();
        this.jioBannerAdsMap = object;
        this.bannerAdsHome = object = new R53();
    }

    public BannerAdViewModel(BannerAdUseCase bannerAdUseCase, c c2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 2) != 0) {
            c2 = ir0_2.a;
            c2 = em0_2.b;
        }
        this(bannerAdUseCase, c2);
    }

    public static final /* synthetic */ void access$checkForBannerType(BannerAdViewModel bannerAdViewModel, BannerResponse bannerResponse) {
        bannerAdViewModel.checkForBannerType(bannerResponse);
    }

    public static final /* synthetic */ zr1_1 access$getAdditionalBannerMLD$p(BannerAdViewModel bannerAdViewModel) {
        return bannerAdViewModel.additionalBannerMLD;
    }

    public static final /* synthetic */ R53 access$getBannerAdMLD$p(BannerAdViewModel bannerAdViewModel) {
        return bannerAdViewModel.bannerAdMLD;
    }

    public static final /* synthetic */ BannerAdUseCase access$getBannerAdUseCase$p(BannerAdViewModel bannerAdViewModel) {
        return bannerAdViewModel.bannerAdUseCase;
    }

    public static final /* synthetic */ c access$getDispatcher$p(BannerAdViewModel bannerAdViewModel) {
        return bannerAdViewModel.dispatcher;
    }

    public static final /* synthetic */ Component access$getEmptyComponentForDynamicAds(BannerAdViewModel bannerAdViewModel, BannerAdsConfig bannerAdsConfig) {
        return bannerAdViewModel.getEmptyComponentForDynamicAds(bannerAdsConfig);
    }

    public static final /* synthetic */ void access$handleBanner(BannerAdViewModel bannerAdViewModel, BannerResponse bannerResponse) {
        bannerAdViewModel.handleBanner(bannerResponse);
    }

    public static final /* synthetic */ void access$updateAllExternalAdsToMap(BannerAdViewModel bannerAdViewModel, DataCallback dataCallback) {
        bannerAdViewModel.updateAllExternalAdsToMap(dataCallback);
    }

    public static final /* synthetic */ void access$updateAllJioAdstoMap(BannerAdViewModel bannerAdViewModel, BannerAd bannerAd, HashMap hashMap) {
        bannerAdViewModel.updateAllJioAdstoMap(bannerAd, hashMap);
    }

    private final void checkForBannerType(BannerResponse iterator) {
        if ((iterator = ((BannerResponse)((Object)iterator)).getComponent()) != null) {
            boolean bl2;
            boolean bl3;
            iterator = (iterator = ((Component)((Object)iterator)).getBanners()) != null ? ((ArrayList)((Object)iterator)).iterator() : null;
            while (iterator != null && (bl3 = iterator.hasNext()) == (bl2 = true)) {
                String string2;
                Object object = iterator.next();
                Intrinsics.checkNotNullExpressionValue(object, "next(...)");
                String string3 = ((Banner)(object = (Banner)object)).getBannerType();
                bl2 = Intrinsics.areEqual(string3, string2 = "EXTERNAL_AD");
                if (bl2 || (bl2 = Intrinsics.areEqual(string3 = ((Banner)object).getBannerType(), string2 = "IMAGE")) || (bl2 = Intrinsics.areEqual(string3 = ((Banner)object).getBannerType(), string2 = "GIF")) || (bl3 = Intrinsics.areEqual(object = ((Banner)object).getBannerType(), string3 = "AD"))) continue;
                iterator.remove();
            }
        }
    }

    public static /* synthetic */ void getAdsBannerDataMiscPages$default(BannerAdViewModel bannerAdViewModel, xv$a_0 xv$a_0, boolean bl2, String string2, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n3 &= 4) != 0) {
            string2 = "";
        }
        bannerAdViewModel.getAdsBannerDataMiscPages(xv$a_0, bl2, string2);
    }

    private final Component getEmptyComponentForDynamicAds(BannerAdsConfig object) {
        boolean bl2 = ((BannerAdsConfig)object).isJioBannerAdsEnabled();
        if (bl2 && (bl2 = ((BannerAdsConfig)object).isJioBannerDynamicAdsEnabled())) {
            Component component;
            Object object2 = component;
            component = new Component(null, null, null, null, null, null, null, false, null, null, 1023, null);
            component.setDynamicAdsFlowEnabled(true);
            object2 = ((BannerAdsConfig)object).getJioAdsSdkAsi();
            component.setDynamicAdAsi((String)object2);
            object = ((BannerAdsConfig)object).getJioAdsSdkDimension();
            component.setDynamicAdsStdDimensions((List)object);
            return component;
        }
        return null;
    }

    private final void handleBanner(BannerResponse iterator) {
        if ((iterator = ((BannerResponse)((Object)iterator)).getComponent()) != null) {
            boolean bl2;
            boolean bl3;
            iterator = (iterator = ((Component)((Object)iterator)).getBanners()) != null ? ((ArrayList)((Object)iterator)).iterator() : null;
            while (iterator != null && (bl3 = iterator.hasNext()) == (bl2 = true)) {
                Object object = iterator.next();
                Intrinsics.checkNotNullExpressionValue(object, "next(...)");
                object = (Banner)object;
                String string2 = ((Banner)object).getBannerType();
                String string3 = "AD";
                bl2 = Intrinsics.areEqual(string2, string3);
                if (!bl2 && !(bl3 = Intrinsics.areEqual(object = ((Banner)object).getBannerType(), string2 = "EXTERNAL_AD"))) continue;
                iterator.remove();
            }
        }
    }

    private final void updateAllExternalAdsToMap(DataCallback object) {
        HashMap hashMap = object != null && (object = (ThirdPartyBannerAds)((DataCallback)object).getData()) != null && (object = ((ThirdPartyBannerAds)object).getAds()) != null ? new HashMap(object) : null;
        this.externalAds = hashMap;
    }

    private final void updateAllJioAdstoMap(BannerAd iterator, HashMap hashMap) {
        Object object;
        Object object2;
        int n3;
        if (iterator == null) {
            return;
        }
        iterator = ((BannerAd)((Object)iterator)).getResult();
        boolean bl2 = false;
        Object object3 = null;
        if (iterator != null && (iterator = ((Result)((Object)iterator)).getAsi()) != null) {
            n3 = iterator.size();
            object2 = new Object(n3);
            iterator = iterator.entrySet().iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = (Campaigns)iterator.next().getValue();
                object2.add(object);
            }
        } else {
            object2 = null;
        }
        if (object2 != null && (iterator = (Campaigns)object2.get(0)) != null) {
            object3 = ((Campaigns)((Object)iterator)).getCampaigns();
        }
        if (object3 != null && (iterator = ((Cmps)object3).getDd()) != null) {
            iterator = iterator.entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object3 = (DD)iterator.next().getValue();
                object2 = ((DD)object3).getAds();
                if (object2 == null) continue;
                object2 = object2.entrySet().iterator();
                while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                    object = (Ad)object2.next().getValue();
                    Object object4 = ((Ad)object).getAd();
                    if (object4 == null) continue;
                    BannerAdUseCase bannerAdUseCase = this.bannerAdUseCase;
                    if ((object = ((Ad)object).getConfig()) == null || (object = ((AdConfig)object).getCid()) == null) {
                        object = "";
                    }
                    object = bannerAdUseCase.buildBannerAd((String)object4, (String)object);
                    object4 = ((DD)object3).getWt();
                    boolean bl3 = hashMap.containsKey(object4);
                    if (bl3) {
                        object4 = ((DD)object3).getWt();
                        if ((object4 = (ArrayList)hashMap.get(object4)) == null) continue;
                        ((ArrayList)object4).add(object);
                        continue;
                    }
                    object4 = new ArrayList();
                    ((ArrayList)object4).add(object);
                    object = ((DD)object3).getWt();
                    if (object == null) continue;
                    object = hashMap.put(object, object4);
                }
            }
        }
    }

    public final void callBannerAdApi(String string2, bv2_0 bv2_02, BannerAdTargetedFormulaData bannerAdTargetedFormulaData, JioBannerAdsPLPFacet jioBannerAdsPLPFacet, boolean bl2, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(string2, "adSpotId");
        Intrinsics.checkNotNullParameter(bv2_02, "plpDelegate");
        Intrinsics.checkNotNullParameter(hashMap, "filtersSelectionStatusMap");
        aW aW2 = md3_0.c(this);
        BannerAdViewModel$callBannerAdApi$1 bannerAdViewModel$callBannerAdApi$1 = new BannerAdViewModel$callBannerAdApi$1(this, string2, bannerAdTargetedFormulaData, jioBannerAdsPLPFacet, bv2_02, bl2, hashMap, null);
        Ae3.d(aW2, null, null, bannerAdViewModel$callBannerAdApi$1, 3);
    }

    public final void callBannerAdsHomeApi(String string2, String string3, String string4, String string5, String string6, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "asi");
        Intrinsics.checkNotNullParameter(string3, "pageUrl");
        aW aW2 = md3_0.c(this);
        em0_2 em0_22 = em0_2.b;
        BannerAdViewModel$callBannerAdsHomeApi$1 bannerAdViewModel$callBannerAdsHomeApi$1 = new BannerAdViewModel$callBannerAdsHomeApi$1(this, string2, string3, string4, string5, string6, null);
        Ae3.d(aW2, em0_22, null, bannerAdViewModel$callBannerAdsHomeApi$1, 2);
    }

    public final void callBannerClickImpression(String string2) {
        aW aW2 = md3_0.c(this);
        BannerAdViewModel$callBannerClickImpression$1 bannerAdViewModel$callBannerClickImpression$1 = new BannerAdViewModel$callBannerClickImpression$1(this, string2, null);
        Ae3.d(aW2, null, null, bannerAdViewModel$callBannerClickImpression$1, 3);
    }

    public final void callBannerViewImpression(String string2) {
        aW aW2 = md3_0.c(this);
        g g3 = ir0_2.a;
        g3 = em0_2.b;
        BannerAdViewModel$callBannerViewImpression$1 bannerAdViewModel$callBannerViewImpression$1 = new BannerAdViewModel$callBannerViewImpression$1(this, string2, null);
        Ae3.d(aW2, g3, null, bannerAdViewModel$callBannerViewImpression$1, 2);
    }

    public final LiveData getAdditionalBannerLD() {
        return this.additionalBannerLD;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void getAdsBannerDataMiscPages(xv$a_0 xv$a_0, boolean bl2, String string2) {
        BannerAdViewModel$getAdsBannerDataMiscPages$1 bannerAdViewModel$getAdsBannerDataMiscPages$1;
        boolean bl3;
        Object object;
        int n3;
        Object object2;
        block5: {
            block6: {
                block7: {
                    Intrinsics.checkNotNullParameter((Object)xv$a_0, "screenName");
                    Intrinsics.checkNotNullParameter(string2, "userType");
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Intrinsics.checkNotNullParameter((Object)xv$a_0, "bannerAdsScreenType");
                    object2 = cp$b.$EnumSwitchMapping$0;
                    int n4 = xv$a_0.ordinal();
                    int n7 = object2[n4];
                    n4 = 1;
                    n3 = 3;
                    if (n7 == n4) break block6;
                    n4 = 2;
                    if (n7 == n4) break block7;
                    if (n7 != n3) {
                        n4 = 4;
                        if (n7 != n4) {
                            n4 = 5;
                            if (n7 != n4) {
                                object2 = new NoWhenBranchMatchedException;
                                ((NoWhenBranchMatchedException)object2)();
                                throw object2;
                            }
                            object2 = new BannerAdsConfig;
                            object = h40_0.a;
                            String string3 = h40_0.a0(xv$a_0);
                            Boolean bl4 = h40_0.R0(xv$a_0);
                            Boolean bl5 = h40_0.s2(xv$a_0);
                            bl3 = h40_0.r2(xv$a_0);
                            Boolean bl6 = bl3;
                            boolean bl7 = ((h40_0)object).q1(xv$a_0);
                            boolean bl8 = ((h40_0)object).p1(xv$a_0);
                            String string4 = ((h40_0)object).G(xv$a_0);
                            boolean bl9 = ((h40_0)object).r1(xv$a_0);
                            String string5 = ((h40_0)object).N(xv$a_0);
                            List list = ((h40_0)object).O(xv$a_0);
                            String string6 = ((h40_0)object).M(xv$a_0);
                            int n8 = 3;
                            bannerAdViewModel$getAdsBannerDataMiscPages$1 = null;
                            Object object3 = object2;
                            ((BannerAdsConfig)object2)(null, null, string3, bl4, bl5, bl6, bl7, bl8, string4, bl9, string5, list, string6, n8, null);
                            break block5;
                        } else {
                            object2 = new BannerAdsConfig;
                            object = h40_0.a;
                            String string7 = h40_0.a0(xv$a_0);
                            Boolean bl10 = h40_0.R0(xv$a_0);
                            Boolean bl11 = h40_0.s2(xv$a_0);
                            bl3 = h40_0.r2(xv$a_0);
                            Boolean bl12 = bl3;
                            boolean bl13 = ((h40_0)object).q1(xv$a_0);
                            boolean bl14 = ((h40_0)object).p1(xv$a_0);
                            String string8 = ((h40_0)object).G(xv$a_0);
                            boolean bl15 = ((h40_0)object).r1(xv$a_0);
                            String string9 = ((h40_0)object).N(xv$a_0);
                            List list = ((h40_0)object).O(xv$a_0);
                            String string10 = ((h40_0)object).M(xv$a_0);
                            int n10 = 3;
                            bannerAdViewModel$getAdsBannerDataMiscPages$1 = null;
                            Object object4 = object2;
                            ((BannerAdsConfig)object2)(null, null, string7, bl10, bl11, bl12, bl13, bl14, string8, bl15, string9, list, string10, n10, null);
                        }
                        break block5;
                    } else {
                        object2 = new BannerAdsConfig;
                        object = h40_0.a;
                        String string11 = h40_0.a0(xv$a_0);
                        Boolean bl16 = h40_0.R0(xv$a_0);
                        Boolean bl17 = h40_0.s2(xv$a_0);
                        bl3 = h40_0.r2(xv$a_0);
                        Boolean bl18 = bl3;
                        boolean bl19 = ((h40_0)object).q1(xv$a_0);
                        boolean bl20 = ((h40_0)object).p1(xv$a_0);
                        String string12 = ((h40_0)object).G(xv$a_0);
                        boolean bl21 = ((h40_0)object).r1(xv$a_0);
                        String string13 = ((h40_0)object).N(xv$a_0);
                        List list = ((h40_0)object).O(xv$a_0);
                        String string14 = ((h40_0)object).M(xv$a_0);
                        int n14 = 3;
                        ((BannerAdsConfig)object2)(null, null, string11, bl16, bl17, bl18, bl19, bl20, string12, bl21, string13, list, string14, n14, null);
                    }
                    break block5;
                }
                object2 = new BannerAdsConfig;
                object = h40_0.a;
                String string15 = h40_0.a0(xv$a_0);
                Boolean bl22 = h40_0.R0(xv$a_0);
                Boolean bl23 = h40_0.s2(xv$a_0);
                bl3 = h40_0.r2(xv$a_0);
                Boolean bl24 = bl3;
                boolean bl25 = ((h40_0)object).q1(xv$a_0);
                boolean bl26 = ((h40_0)object).p1(xv$a_0);
                String string16 = ((h40_0)object).G(xv$a_0);
                String string17 = ((h40_0)object).M(xv$a_0);
                int n15 = 3587;
                bannerAdViewModel$getAdsBannerDataMiscPages$1 = null;
                boolean bl27 = false;
                Object var18_36 = null;
                Object var19_39 = null;
                Object object5 = object2;
                ((BannerAdsConfig)object2)(null, null, string15, bl22, bl23, bl24, bl25, bl26, string16, false, null, null, string17, n15, null);
                break block5;
            }
            object2 = new BannerAdsConfig;
            object = h40_0.a;
            String string18 = h40_0.a0(xv$a_0);
            Boolean bl28 = h40_0.R0(xv$a_0);
            Boolean bl29 = h40_0.s2(xv$a_0);
            bl3 = h40_0.r2(xv$a_0);
            Boolean bl30 = bl3;
            boolean bl31 = ((h40_0)object).q1(xv$a_0);
            boolean bl32 = ((h40_0)object).p1(xv$a_0);
            String string19 = ((h40_0)object).G(xv$a_0);
            String string20 = ((h40_0)object).M(xv$a_0);
            int n16 = 3587;
            boolean bl33 = false;
            Object var32_69 = null;
            Object var33_71 = null;
            ((BannerAdsConfig)object2)(null, null, string18, bl28, bl29, bl30, bl31, bl32, string19, false, null, null, string20, n16, null);
        }
        object = object2;
        object2 = h40_0.a;
        object2 = h40_0.J0();
        Boolean bl34 = ((BannerAdsConfig)object).isThirdPartyAdsEnabled();
        Boolean bl35 = Boolean.TRUE;
        boolean bl36 = Intrinsics.areEqual(bl34, bl35);
        float f5 = ((ThirdPartyBannerConfig)object2).getTimeout();
        float f6 = 1000;
        long l2 = (long)(f5 * f6);
        aW aW2 = md3_0.c(this);
        object2 = bannerAdViewModel$getAdsBannerDataMiscPages$1;
        bl3 = bl2;
        bannerAdViewModel$getAdsBannerDataMiscPages$1 = new BannerAdViewModel$getAdsBannerDataMiscPages$1((BannerAdsConfig)object, bl2, bl36, l2, this, xv$a_0, string2, null);
        Ae3.d(aW2, null, null, bannerAdViewModel$getAdsBannerDataMiscPages$1, n3);
    }

    public final R53 getBannerAdLD() {
        return this.bannerAdLD;
    }

    public final List getBannerAdList() {
        return this.bannerAdList;
    }

    public final R53 getBannerAdsHome() {
        return this.bannerAdsHome;
    }

    public final List getBannerList(BannerAd object, String string2) {
        Intrinsics.checkNotNullParameter(object, "bannerAd");
        Intrinsics.checkNotNullParameter(string2, "bannerAdVariantType");
        this.bannerAdList = object = this.bannerAdUseCase.getBannerList((BannerAd)object, string2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.services.entity.BannerAdData>");
        return TypeIntrinsics.asMutableList(object);
    }

    public final String getBannerUrl(Yj2 object, String object2, BannerAdData bannerAdData) {
        boolean bl2;
        Object object3 = "bannerAdVariantType";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (bannerAdData != null) {
            object3 = bannerAdData.getCustomimage();
        } else {
            bl2 = false;
            object3 = null;
        }
        object3 = (Collection)object3;
        Object object4 = "";
        if (object3 != null && !(bl2 = object3.isEmpty())) {
            boolean bl3 = Intrinsics.areEqual(object2, "A");
            object3 = "1024x320";
            if (bl3) {
                object2 = Yj2.GRID;
                if (object == object2) {
                    if (bannerAdData != null && (object = bannerAdData.getCustomimage()) != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null && (object = (String)object.get(object2 = "512x910")) != null) {
                        object4 = object;
                    }
                    return object4;
                }
                if (bannerAdData != null && (object = bannerAdData.getCustomimage()) != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null && (object = (String)object.get(object3)) != null) {
                    object4 = object;
                }
                return object4;
            }
            if (bannerAdData != null && (object = bannerAdData.getCustomimage()) != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null && (object = (String)object.get(object3)) != null) {
                object4 = object;
            }
        }
        return object4;
    }

    public final String getBannerUrl(List object, String string2) {
        Object object2;
        block0: {
            boolean bl2;
            boolean bl3;
            Intrinsics.checkNotNullParameter(string2, "bannerAdVariantType");
            Object object3 = object;
            object3 = (Collection)object;
            object2 = "";
            if (object3 == null || (bl3 = object3.isEmpty()) || ((bl2 = Intrinsics.areEqual(string2, object3 = "A")) ? object == null || (object = (Map)CollectionsKt.firstOrNull((List)object)) == null || (object = (String)object.get(string2 = "512x910")) == null : object == null || (object = (Map)CollectionsKt.firstOrNull((List)object)) == null || (object = (String)object.get(string2 = "1024x320")) == null)) break block0;
            object2 = object;
        }
        return object2;
    }

    public final String getClickIdWithTimestamp(String string2, String string3) {
        if (string2 != null) {
            if (string3 == null) {
                string3 = "";
            }
            String string4 = "[ccb]";
            string2 = b.n(string2, string4, string3, false);
        } else {
            string2 = null;
        }
        return string2;
    }

    public final String getCreativeName(Yj2 yj2, String object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdVariantType");
        boolean bl2 = Intrinsics.areEqual(object, "A");
        String string2 = "1024x320";
        if (bl2 && yj2 == (object = Yj2.GRID)) {
            return "512x910";
        }
        return string2;
    }

    public final HashMap getExternalAds() {
        return this.externalAds;
    }

    public final HashMap getHomePageBannerAdsMap() {
        return this.jioBannerAdsMap;
    }

    public final HashMap getHomePageExternalAdsMap() {
        return this.externalAds;
    }

    public final HashMap getJioBannerAdsMap() {
        return this.jioBannerAdsMap;
    }

    public final boolean isViewTypeBanner(int n3) {
        int n4 = 21;
        n3 = n3 != n4 && n3 != (n4 = 24) && n3 != (n4 = 20) ? 0 : 1;
        return n3 != 0;
    }

    public final void resetAdsMap() {
        HashMap hashMap;
        this.jioBannerAdsMap = hashMap = new HashMap();
        this.externalAds = hashMap = new HashMap();
    }

    public final void setBannerAdList(List list) {
        this.bannerAdList = list;
    }

    public final void setExternalAds(HashMap hashMap) {
        this.externalAds = hashMap;
    }

    public final void setJioBannerAdsMap(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.jioBannerAdsMap = hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean shouldCallBannerApi(bv2_0 object, String string2, String object2) {
        Intrinsics.checkNotNullParameter(object, "plpDelegate");
        Object object3 = "bannerAdVariantType";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = ((bv2_0)object).q1;
        if (!bl2) return false;
        object3 = el1_2.a;
        int n3 = el1_2.n(string2);
        if (n3 == 0) return false;
        boolean bl3 = ((bv2_0)object).n1;
        if (bl3) return false;
        object = "C";
        bl3 = Intrinsics.areEqual(object2, object);
        if (bl3) return false;
        bl3 = og1_1.c();
        if (bl3) return false;
        object = od3_2.a;
        n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) != 0) return false;
        string2 = od3_2.a();
        n3 = (int)(Intrinsics.areEqual(string2, object3 = ((ld3_2)((Object)(object2 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0);
        if (n3 != 0) return false;
        string2 = ((ld3_2)((Object)object2)).getStoreId();
        bl3 = Intrinsics.areEqual(object, string2);
        if (!bl3) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean shouldCallConversionTracker(bv2_0 object, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "plpDelegate");
        Object object2 = "bannerAdVariantType";
        Intrinsics.checkNotNullParameter(string3, (String)object2);
        boolean bl2 = ((bv2_0)object).p1;
        boolean bl3 = false;
        if (bl2) {
            object = ((bv2_0)object).s1;
            if (object == null) return bl3;
            return true;
        }
        bl2 = ((bv2_0)object).q1;
        if (!bl2) return bl3;
        object2 = el1_2.a;
        boolean bl4 = el1_2.n(string2);
        if (!bl4) return bl3;
        object = ((bv2_0)object).s1;
        if (object == null) return bl3;
        object = "C";
        boolean bl5 = Intrinsics.areEqual(string3, object);
        if (bl5) return bl3;
        return true;
    }

    public final void triggerGAForBannerClick(Yj2 yj2, String string2, BannerAdData bannerAdData, String string3) {
        Object object = string2;
        Intrinsics.checkNotNullParameter(string2, "bannerAdVariantType");
        String string4 = this.getBannerUrl(yj2, string2, bannerAdData);
        StringBuilder stringBuilder = new StringBuilder();
        Object object2 = null;
        String string5 = bannerAdData != null ? bannerAdData.getCmpid() : null;
        stringBuilder.append(string5);
        string5 = "|";
        stringBuilder.append(string5);
        object = this.getCreativeName(yj2, string2);
        stringBuilder.append((String)object);
        stringBuilder.append(string5);
        object = bannerAdData != null ? bannerAdData.getBannerIndex() : null;
        stringBuilder.append(object);
        stringBuilder.append(string5);
        if (bannerAdData != null) {
            object2 = bannerAdData.getDesc2();
        }
        stringBuilder.append((String)object2);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        string5 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_SELECT_PROMOTION();
        String string6 = o72_0.a;
        String string7 = bv_0.a((AnalyticsManager$Companion)object);
        String string8 = o72_0.a;
        String string9 = cv_0.a((AnalyticsManager$Companion)object);
        String string10 = stringBuilder.toString();
        object = object2;
        object2 = string5;
        string5 = string6;
        string6 = string7;
        string7 = string8;
        string8 = string9;
        NewEEcommerceEventsRevamp.pushEESelectPromotion$default((NewEEcommerceEventsRevamp)object, (String)object2, string4, string5, string6, string7, string9, false, true, string10, string3, null, false, 3072, null);
    }
}

