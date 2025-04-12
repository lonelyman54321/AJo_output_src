/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.ril.ajio.jiobannerads.domain;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.jiobannerads.BannerAdsRepository;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase$Companion;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase$callThirdPartyBannerAdsApi$1;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase$getBannersForDifferentPages$1;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase$getJioBannerAdsTargetedParameter$$inlined$sortedByDescending$1;
import com.ril.ajio.jiobannerads.domain.BannerAdUseCase$getTargetedParameter$$inlined$sortedByDescending$1;
import com.ril.ajio.login.CustomerStoreType;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.BannerAdTargetedFormulaData;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacet;
import com.ril.ajio.services.data.Product.JioBannerAdsPLPFacetData;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.user.ScreenType;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.entity.Ad;
import com.ril.ajio.services.entity.AdConfig;
import com.ril.ajio.services.entity.BannerAd;
import com.ril.ajio.services.entity.BannerAdComponents;
import com.ril.ajio.services.entity.BannerAdData;
import com.ril.ajio.services.entity.Campaigns;
import com.ril.ajio.services.entity.Cmps;
import com.ril.ajio.services.entity.DD;
import com.ril.ajio.services.entity.Result;
import com.ril.ajio.services.entity.ThirdPartyBannerAds;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

public class BannerAdUseCase {
    public static final int $stable = 0;
    private static final String CLIENT_ID = "client_id";
    private static final String CLI_UBID = "cli_ubid";
    public static final BannerAdUseCase$Companion Companion;
    private static final String DEVICE_TYPE = "f.channel";
    private static final String PAGE_SIZE = "pcnt_au";
    private static final String PAGE_URL = "pt";
    private static final String PLATFORM = "f.platform";
    private static final String RANDOM_NUMBER = "rn";
    private static final String SIS = "f.sis";
    private static final String USER_GROUP = "f.user_cohort";
    private static final String USER_LOGIN_STATUS = "f.user_loginstatus";
    private static final String USER_TYPE = "f.user_type";
    private final rq1_2 appPreferences$delegate;
    private final BannerAdsRepository bannerAdsRepository;

    static {
        BannerAdUseCase$Companion bannerAdUseCase$Companion;
        Companion = bannerAdUseCase$Companion = new BannerAdUseCase$Companion(null);
        $stable = 8;
    }

    public BannerAdUseCase(BannerAdsRepository object) {
        Intrinsics.checkNotNullParameter(object, "bannerAdsRepository");
        this.bannerAdsRepository = object;
        object = new Object();
        this.appPreferences$delegate = object = yr1_2.b((Function0)object);
    }

    public static /* synthetic */ jo_2 a() {
        return BannerAdUseCase.appPreferences_delegate$lambda$0();
    }

    private final void addConfigQueries(HashMap hashMap, ArrayList arrayList, JioBannerAdsPLPFacet iterator, int n3, HashMap hashMap2) {
        if ((iterator = ((JioBannerAdsPLPFacet)((Object)iterator)).getFacetsList()) != null) {
            boolean bl2;
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                String string2;
                int n4;
                Object object = (JioBannerAdsPLPFacetData)iterator.next();
                boolean bl3 = ((JioBannerAdsPLPFacetData)object).getEnable();
                if (!bl3 || (n4 = (string2 = this.getJioBannerAdsTargetedParameter(arrayList, (JioBannerAdsPLPFacetData)object, n3, hashMap2)).length()) <= 0) continue;
                object = ((JioBannerAdsPLPFacetData)object).getJioAdsKey();
                hashMap.put(object, string2);
            }
        }
    }

    private static final jo_2 appPreferences_delegate$lambda$0() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        jo_2 jo_22 = new jo_2((Context)aJIOApplication);
        return jo_22;
    }

    public static /* synthetic */ Object callThirdPartyBannerAdsApi$default(BannerAdUseCase object, String string2, String string3, boolean bl2, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            int n4 = n3 & 2;
            if (n4 != 0) {
                string3 = null;
            }
            if ((n3 &= 4) != 0) {
                bl2 = false;
            }
            return ((BannerAdUseCase)object).callThirdPartyBannerAdsApi(string2, string3, bl2, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callThirdPartyBannerAdsApi");
        throw object;
    }

    private final String getCustomerType(String object) {
        Object object2 = "non_premium";
        if (object != null) {
            boolean bl2;
            Object object3 = new String[]{"|"};
            object3 = object = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, 6);
            object3 = (Collection)object;
            boolean bl3 = object3.isEmpty();
            boolean bl4 = true;
            if ((bl3 ^= bl4) && (bl2 = b.i((String)(object = (String)object.get(0)), (String)(object3 = "premium"), bl4))) {
                object2 = object3;
            }
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final String getCustomerTypeForHome(String object) {
        int n3;
        String string2 = "";
        String string3 = "userType";
        if (object != null && (n3 = ((String)object).length()) != 0) {
            Object object2 = new String[]{"|"};
            int n4 = 6;
            object2 = object = StringsKt.a0((CharSequence)object, (String[])object2, false, 0, n4);
            object2 = (Collection)object;
            n3 = object2.isEmpty() ^ 1;
            if (n3 != 0) {
                return (String)object.get(0);
            }
            object = h40_0.a;
            object = h40_0.I();
            boolean bl2 = object.has(string3);
            if (!bl2) return string2;
            object = h40_0.I();
            string2 = object.getString(string3);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        object = h40_0.a;
        object = h40_0.I();
        boolean bl3 = object.has(string3);
        if (!bl3) return string2;
        object = h40_0.I();
        string2 = object.getString(string3);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    private final String getJioBannerAdsTargetedParameter(ArrayList iterator, JioBannerAdsPLPFacetData jioBannerAdsPLPFacetData, int n3, HashMap hashMap) {
        boolean bl2;
        int n4;
        Boolean bl3;
        String string2;
        Object object;
        Object object2;
        boolean bl4;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (iterator != null) {
            block6: {
                iterator = iterator.iterator();
                while (bl4 = iterator.hasNext()) {
                    object2 = iterator.next();
                    object = object2;
                    object = ((Facet)object2).getCode();
                    boolean n7 = Intrinsics.areEqual(object, string2 = jioBannerAdsPLPFacetData.getFacet_type());
                    if (!n7) continue;
                    break block6;
                }
                bl4 = false;
                object2 = null;
            }
            object2 = (Facet)object2;
            if (object2 != null && (iterator = ((Facet)object2).getValues()) != null && (iterator = CollectionsKt.e0((Iterable)((Object)iterator), (Comparator)(object2 = new BannerAdUseCase$getJioBannerAdsTargetedParameter$$inlined$sortedByDescending$1()))) != null) {
                iterator = ((Iterable)((Object)iterator)).iterator();
                while (bl4 = iterator.hasNext()) {
                    object2 = (FacetValue)iterator.next();
                    int n7 = ((FacetValue)object2).getSelected();
                    string2 = jioBannerAdsPLPFacetData.getFacet_type();
                    n4 = Intrinsics.areEqual(string2 = hashMap.get(string2), bl3 = Boolean.TRUE);
                    if (n7 != n4) continue;
                    n7 = ((FacetValue)object2).getCount();
                    if ((n7 = (int)(this.isEligibleForJioBannerAd(n7, n3, jioBannerAdsPLPFacetData) ? 1 : 0)) == 0 || (object2 = ((FacetValue)object2).getCode()) == null || (n7 = arrayList.size()) == (n4 = jioBannerAdsPLPFacetData.getCount())) continue;
                    object2 = this.replaceSpecialCharacters((String)object2);
                    object = Locale.ROOT;
                    object2 = ((String)object2).toLowerCase((Locale)object);
                    object = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, object);
                    arrayList.add(object2);
                }
            }
        }
        if (bl2 = arrayList.isEmpty() ^ true) {
            n4 = 0;
            string2 = null;
            bl3 = null;
            bl4 = false;
            object2 = null;
            boolean bl5 = false;
            object = null;
            int n8 = 63;
            iterator = CollectionsKt.R(arrayList, null, null, null, null, n8);
        } else {
            iterator = "";
        }
        return iterator;
    }

    private final String getModifiedSecondaryID(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            return oo1_1.a("[^a-zA-Z0-9,_]", string2, "_");
        }
        return "";
    }

    private final String getModifiedThirdPartyPageUrl(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            return b.n(string2, "/", "_", false);
        }
        return "";
    }

    private final String getOrGenerateUUID() {
        AJIOApplication.Companion.getClass();
        SharedPreferences sharedPreferences2 = AJIOApplication$a.a().getSharedPreferences("app_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getSharedPreferences(...)");
        String string2 = "device_uuid";
        String string3 = sharedPreferences2.getString(string2, null);
        if (string3 == null) {
            string3 = UUID.randomUUID().toString();
            sharedPreferences2 = sharedPreferences2.edit().putString(string2, string3);
            sharedPreferences2.apply();
        }
        return string3;
    }

    private final String getSecondaryId(String object) {
        Object object2 = "";
        if (object != null) {
            Object object3 = new String[]{"|"};
            object3 = object = StringsKt.a0((CharSequence)object, (String[])object3, false, 0, 6);
            object3 = (Collection)object;
            int n3 = object3.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) != 0 && (n3 = object.size()) > n4) {
                object2 = object = object.get(n4);
                object2 = (String)object;
            }
        }
        return object2;
    }

    private final String getStoreName(bv2_0 object) {
        block3: {
            block2: {
                object = ((bv2_0)object).Z0;
                if (object == null) break block2;
                Object object2 = Locale.ROOT;
                object = ((String)object).toLowerCase((Locale)object2);
                object2 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                if (object != null) break block3;
            }
            object = od3_2.a();
        }
        return object;
    }

    private final String getTargetedParameter(ArrayList iterator, BannerAdTargetedFormulaData bannerAdTargetedFormulaData, int n3, boolean n4) {
        boolean bl2;
        int n7;
        Object object;
        boolean bl3;
        Object object2;
        String string2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (iterator != null) {
            block6: {
                boolean n8;
                iterator = iterator.iterator();
                do {
                    bl3 = iterator.hasNext();
                    n8 = false;
                    object2 = null;
                    if (!bl3) break block6;
                    object = iterator.next();
                    string2 = (String)object;
                    string2 = ((Facet)object).getCode();
                    if (bannerAdTargetedFormulaData == null) continue;
                    object2 = bannerAdTargetedFormulaData.getFacetType();
                } while (!(n8 = Intrinsics.areEqual(string2, object2)));
                object2 = object;
            }
            if ((object2 = (Facet)object2) != null && (iterator = ((Facet)object2).getValues()) != null && (iterator = CollectionsKt.e0((Iterable)((Object)iterator), object = new BannerAdUseCase$getTargetedParameter$$inlined$sortedByDescending$1())) != null) {
                iterator = ((Iterable)((Object)iterator)).iterator();
                while (bl3 = iterator.hasNext()) {
                    object = (FacetValue)iterator.next();
                    int n8 = ((FacetValue)object).getSelected();
                    if (n8 != n4) continue;
                    n8 = ((FacetValue)object).getCount();
                    if ((n8 = (int)(this.isEligibleForBannerAd(n8, n3, bannerAdTargetedFormulaData) ? 1 : 0)) == 0 || (object = ((FacetValue)object).getCode()) == null || (n8 = arrayList.size()) == (n7 = 3)) continue;
                    object = this.replaceSpecialCharacters((String)object);
                    object2 = Locale.ROOT;
                    object = ((String)object).toLowerCase((Locale)object2);
                    object2 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    arrayList.add(object);
                }
            }
        }
        if (bl2 = arrayList.isEmpty() ^ true) {
            n7 = 0;
            string2 = null;
            bl3 = false;
            object = null;
            boolean bl4 = false;
            object2 = null;
            int n10 = 63;
            iterator = CollectionsKt.R(arrayList, null, null, null, null, n10);
        } else {
            iterator = "";
        }
        return iterator;
    }

    private final boolean isEligibleForBannerAd(int n3, int n4, BannerAdTargetedFormulaData bannerAdTargetedFormulaData) {
        boolean bl2;
        String string2;
        boolean bl3 = false;
        String string3 = null;
        if (bannerAdTargetedFormulaData != null) {
            string2 = bannerAdTargetedFormulaData.getOperatorType();
        } else {
            bl2 = false;
            string2 = null;
        }
        String string4 = "greater";
        bl2 = Intrinsics.areEqual(string2, string4);
        boolean bl4 = true;
        if (bl2) {
            int n7 = bannerAdTargetedFormulaData.getPercentage() * n4 / 100;
            if (n3 >= n7) {
                return bl4;
            }
        } else {
            int n8;
            if (bannerAdTargetedFormulaData != null) {
                string3 = bannerAdTargetedFormulaData.getOperatorType();
            }
            if ((bl3 = Intrinsics.areEqual(string3, string2 = "less")) && n3 <= (n8 = bannerAdTargetedFormulaData.getPercentage() * n4 / 100)) {
                return bl4;
            }
        }
        return false;
    }

    private final boolean isEligibleForJioBannerAd(int n3, int n4, JioBannerAdsPLPFacetData jioBannerAdsPLPFacetData) {
        float f5 = n3;
        float f6 = jioBannerAdsPLPFacetData.getPercentage();
        float f7 = n4;
        f6 *= f7;
        n4 = 100;
        f7 = n4;
        float f8 = f5 - (f6 /= f7);
        n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n3 >= 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isValidImageSize(List object, String string2) {
        boolean bl2 = Intrinsics.areEqual(string2, "A");
        boolean bl3 = false;
        Object object2 = null;
        if (bl2) {
            if (object != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null) {
                string2 = "512x910";
                object2 = object = object.get(string2);
                object2 = (String)object;
            }
            if (object2 == null) return bl3;
            int n3 = object2.length();
            if (n3 != 0) return true;
            return bl3;
        } else {
            if (object != null && (object = (Map)CollectionsKt.firstOrNull((List)object)) != null) {
                string2 = "1024x320";
                object2 = object = object.get(string2);
                object2 = (String)object;
            }
            if (object2 == null) return bl3;
            int n4 = object2.length();
            if (n4 != 0) return true;
        }
        return bl3;
    }

    private final String replaceSpecialCharacters(String string2) {
        block3: {
            block2: {
                String string3 = "[^A-Za-z\\d ]";
                Regex regex = new Regex(string3);
                if (string2 == null) break block2;
                string3 = "_";
                string2 = regex.replace(string2, string3);
                regex = null;
                String string4 = " ";
                if ((string2 = b.n(string2, string4, string3, false)) != null) break block3;
            }
            string2 = "";
        }
        return string2;
    }

    public final BannerAdData buildBannerAd(String object, String string2) {
        Intrinsics.checkNotNullParameter(object, "ad");
        Intrinsics.checkNotNullParameter(string2, "clickId");
        Gson gson = new Gson();
        object = (BannerAdData)gson.fromJson((String)object, BannerAdData.class);
        ((BannerAdData)object).setClickId(string2);
        Intrinsics.checkNotNull(object);
        return object;
    }

    public final Object callBannerAdsApi(String string2, BannerAdTargetedFormulaData bannerAdTargetedFormulaData, JioBannerAdsPLPFacet jioBannerAdsPLPFacet, bv2_0 bv2_02, boolean bl2, HashMap hashMap, f80_0 f80_02) {
        BannerAdUseCase bannerAdUseCase = this;
        Object object = bv2_02;
        HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
        Object object2 = el1_2.a;
        object2 = el1_2.g();
        Object object3 = "ua";
        boolean bl3 = ((HashMap)object2).containsKey(object3);
        Object object4 = "";
        Object object5 = bl3 ? (String)((HashMap)object2).get(object3) : object4;
        Object object6 = "vr";
        boolean bl4 = ((HashMap)object2).containsKey(object6);
        Object object7 = bl4 ? (String)((HashMap)object2).get(object6) : object4;
        String string3 = "os";
        boolean bl5 = ((HashMap)object2).containsKey(string3);
        Object object8 = bl5 ? (String)((HashMap)object2).get(string3) : object4;
        String string4 = "ai";
        boolean bl6 = ((HashMap)object2).containsKey(string4);
        Object object9 = bl6 ? (String)((HashMap)object2).get(string4) : object4;
        String string5 = "ifa";
        boolean bl7 = ((HashMap)object2).containsKey(string5);
        object2 = bl7 ? (String)((HashMap)object2).get(string5) : object4;
        if (object5 == null) {
            object5 = object4;
        }
        hashMap2.put(object3, object5);
        if (object7 == null) {
            object7 = object4;
        }
        hashMap2.put(object6, object7);
        if (object8 == null) {
            object8 = object4;
        }
        hashMap2.put(string3, object8);
        if (object9 == null) {
            object9 = object4;
        }
        hashMap2.put(string4, object9);
        if (object2 != null) {
            object4 = object2;
        }
        hashMap2.put(string5, object4);
        long l2 = k7.p();
        object2 = String.valueOf(l2);
        hashMap2.put("trq", object2);
        object3 = string2;
        hashMap2.put("asi", string2);
        hashMap2.put("vnm", "jioads");
        object3 = this.getStoreName((bv2_0)object);
        hashMap2.put("md_sis", object3);
        object2 = CustomerStoreType.a;
        object2 = ((bv2_0)object).Z0;
        object3 = ScreenType.SCREEN_PLP;
        object2 = CustomerStoreType.a((String)object2, (ScreenType)((Object)object3));
        object2 = this.getCustomerType((String)object2);
        object5 = "md_utype";
        hashMap2.put(object5, object2);
        object2 = CustomerStoreType.a(((bv2_0)object).Z0, (ScreenType)((Object)object3));
        object2 = this.getSecondaryId((String)object2);
        object7 = this.getModifiedSecondaryID((String)object2);
        int n3 = ((String)object7).length();
        if (n3 > 0) {
            object2 = "md_secondaryid";
            hashMap2.put(object2, object7);
        }
        string3 = null;
        if (jioBannerAdsPLPFacet != null) {
            object2 = jioBannerAdsPLPFacet.getEnabled();
            object3 = Boolean.TRUE;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        } else {
            n3 = 0;
            object2 = null;
        }
        object3 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Facet>";
        bl3 = false;
        object5 = null;
        if (n3 != 0) {
            int n4;
            object2 = ((bv2_0)object).M;
            if (object2 != null) {
                object5 = ((ProductsList)object2).getFacets();
            }
            Intrinsics.checkNotNull(object5, object3);
            object3 = object5;
            object3 = (ArrayList)object5;
            object = ((bv2_0)object).M;
            if (object != null && (object = ((ProductsList)object).getPagination()) != null) {
                int n7;
                n4 = n7 = ((Pagination)object).getTotalResults();
            } else {
                n4 = 0;
                object4 = null;
            }
            object = this;
            object2 = hashMap2;
            object5 = jioBannerAdsPLPFacet;
            object6 = hashMap;
            this.addConfigQueries(hashMap2, (ArrayList)object3, jioBannerAdsPLPFacet, n4, hashMap);
        } else {
            boolean bl8;
            int n8;
            object2 = ((bv2_0)object).M;
            if (object2 != null) {
                object5 = ((ProductsList)object2).getFacets();
            }
            Intrinsics.checkNotNull(object5, object3);
            object5 = (ArrayList)object5;
            object = ((bv2_0)object).M;
            if (object != null && (object = ((ProductsList)object).getPagination()) != null) {
                n8 = ((Pagination)object).getTotalResults();
                object2 = bannerAdTargetedFormulaData;
                bl8 = bl2;
            } else {
                object2 = bannerAdTargetedFormulaData;
                bl8 = bl2;
                n8 = 0;
                object = null;
            }
            object = this.getTargetedParameter((ArrayList)object5, (BannerAdTargetedFormulaData)object2, n8, bl8);
            object2 = "md_ajiocat";
            hashMap2.put(object2, object);
        }
        object = UrlHelper.Companion.getInstance();
        object2 = new Object[]{};
        object = ((UrlHelper)object).getApiUrl("plp", "banner_ads_url", (Object[])object2);
        object2 = bannerAdUseCase.bannerAdsRepository;
        object3 = f80_02;
        return object2.getBannerAds((String)object, hashMap2, (String)object7, f80_02);
    }

    public final Object callBannerClickImpression(String object, f80_0 object2) {
        BannerAdsRepository bannerAdsRepository;
        if (object != null && (object = (bannerAdsRepository = this.bannerAdsRepository).callClickTracker((String)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object callBannerViewImpression(String object, f80_0 object2) {
        BannerAdsRepository bannerAdsRepository;
        if (object != null && (object = (bannerAdsRepository = this.bannerAdsRepository).callViewImpressionTracker((String)object, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final Object callJioBannerAdsApi(String string2, String string3, String string4, String string5, String string6, String string7, f80_0 f80_02) {
        boolean bl2;
        BannerAdUseCase bannerAdUseCase = this;
        Object object = string3;
        Object object2 = string4;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object3 = el1_2.a;
        object3 = el1_2.g();
        Object object4 = "ua";
        boolean bl3 = object3.containsKey(object4);
        String string8 = "";
        String string9 = bl3 ? (String)object3.get(object4) : string8;
        String string10 = "vr";
        boolean bl4 = object3.containsKey(string10);
        String string11 = bl4 ? (String)object3.get(string10) : string8;
        String string12 = "os";
        boolean bl5 = object3.containsKey(string12);
        String string13 = bl5 ? (String)object3.get(string12) : string8;
        String string14 = "ai";
        boolean bl6 = object3.containsKey(string14);
        String string15 = bl6 ? (String)object3.get(string14) : string8;
        String string16 = "ifa";
        boolean bl7 = object3.containsKey(string16);
        object3 = bl7 ? (String)object3.get(string16) : string8;
        if (string9 == null) {
            string9 = string8;
        }
        hashMap.put(object4, string9);
        if (string11 == null) {
            string11 = string8;
        }
        hashMap.put(string10, string11);
        if (string13 == null) {
            string13 = string8;
        }
        hashMap.put(string12, string13);
        if (object3 == null) {
            object3 = string8;
        }
        hashMap.put(string16, object3);
        long l2 = k7.p();
        object3 = String.valueOf(l2);
        object4 = "trq";
        hashMap.put(object4, object3);
        object3 = UrlHelper.Companion;
        int n3 = object3.getISPREVIEW();
        string9 = "asi";
        if (n3 != 0) {
            object4 = CMSConfigInitializer.getPreviewAdSpotId();
            hashMap.put(string9, object4);
        } else {
            object4 = string2;
            hashMap.put(string9, string2);
        }
        if (string15 == null) {
            string15 = string8;
        }
        hashMap.put(string14, string15);
        object4 = "vnm";
        string9 = "jioads";
        hashMap.put(object4, string9);
        object4 = object2 == null ? string8 : object2;
        object4 = xv_0.f((String)object4);
        hashMap.put("md_sis", object4);
        object4 = CustomerStoreType.a;
        object4 = ScreenType.SCREEN_PLP;
        string9 = CustomerStoreType.a((String)object2, (ScreenType)((Object)object4));
        string9 = xv_0.f(bannerAdUseCase.getCustomerTypeForHome(string9));
        string10 = "md_utype";
        hashMap.put(string10, string9);
        object2 = CustomerStoreType.a((String)object2, (ScreenType)((Object)object4));
        object2 = bannerAdUseCase.getSecondaryId((String)object2);
        object2 = bannerAdUseCase.getModifiedSecondaryID((String)object2);
        n3 = ((String)object2).length();
        if (n3 > 0) {
            object4 = "md_secondaryid";
            hashMap.put(object4, object2);
        }
        object4 = string5 != null && (n3 = string5.length()) != 0 ? string5 : "non_logged_in";
        object4 = xv_0.f((String)object4);
        string9 = "md_user_status";
        hashMap.put(string9, object4);
        if (string6 != null && (n3 = string6.length()) != 0) {
            object4 = string6;
        } else {
            object4 = h40_0.a;
            object4 = h40_0.I();
            n3 = (int)(object4.has(string9 = "userRestriction") ? 1 : 0);
            if (n3 != 0) {
                object4 = h40_0.I().getString(string9);
                Intrinsics.checkNotNull(object4);
            } else {
                object4 = string8;
            }
        }
        object4 = xv_0.f((String)object4);
        hashMap.put("md_user_restriction", object4);
        hashMap.put("md_platform", "mobile");
        object4 = "md_channel";
        hashMap.put(object4, "android");
        n3 = string3.length();
        bl3 = false;
        string9 = null;
        if (n3 > 0) {
            Intrinsics.checkNotNullParameter(object, "pageUrl");
            object4 = "/shop/";
            boolean bl8 = StringsKt.F((CharSequence)object, (CharSequence)object4, false);
            if (bl8) {
                object = b.n((String)object, (String)object4, string8, false);
            }
            object = xv_0.f((String)object);
            object4 = "md_page_url";
            hashMap.put(object4, object);
        }
        if (bl2 = object3.getISPREVIEW()) {
            object = CMSConfigInitializer.INSTANCE.getBannerAdsUrlForPreview();
        } else {
            object = object3.getInstance();
            object3 = new Object[]{};
            object4 = "homepage";
            string9 = "banner_ads_url";
            object = ((UrlHelper)object).getApiUrl((String)object4, string9, object3);
        }
        object3 = new HashMap();
        string9 = string7;
        object3.put("RequestId", string7);
        object3.put("userCohortValues", object2);
        object2 = bannerAdUseCase.bannerAdsRepository;
        object4 = f80_02;
        return object2.getBannerAds((String)object, hashMap, (HashMap)object3, f80_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object callThirdPartyBannerAdsApi(String var1_1, String var2_2, boolean var3_3, f80_0 var4_4) {
        var5_5 = this;
        var6_6 = var4_4;
        var7_7 = var4_4 instanceof BannerAdUseCase$callThirdPartyBannerAdsApi$1;
        if (!var7_7) ** GOTO lbl-1000
        var8_8 = var4_4;
        var8_8 = (BannerAdUseCase$callThirdPartyBannerAdsApi$1)var4_4;
        var9_9 = var8_8.label;
        var10_10 = -1 << -1;
        var11_11 = var9_9 & var10_10;
        if (var11_11 != 0) {
            var8_8.label = var9_9 -= var10_10;
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = new BannerAdUseCase$callThirdPartyBannerAdsApi$1(var5_5, (f80_0)var6_6);
        }
        var6_6 = var8_8.result;
        var12_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        var10_10 = var8_8.label;
        var11_11 = 1;
        if (var10_10 == 0) ** GOTO lbl24
        if (var10_10 == var11_11) {
            vl2_2.b(var6_6);
        } else {
            var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var6_6;
lbl24:
            // 1 sources

            vl2_2.b(var6_6);
            var6_6 = h40_0.a;
            var6_6 = h40_0.J0();
            var13_13 = new HashMap<Object, Object>();
            var14_14 = this.getOrGenerateUUID();
            var13_13.put("cli_ubid", var14_14);
            var14_14 = var6_6.getClientId();
            var15_15 = "";
            if (var14_14 == null) {
                var14_14 = var15_15;
            }
            var13_13.put("client_id", var14_14);
            var16_16 = this.getModifiedThirdPartyPageUrl(var1_1);
            var13_13.put("pt", var16_16);
            var17_17 = System.currentTimeMillis();
            var14_14 = String.valueOf(var17_17);
            var16_16 = "rn";
            var13_13.put(var16_16, var14_14);
            var6_6 = var6_6.getPageSize();
            var19_18 = var6_6 != null ? var6_6.intValue() : 10;
            var6_6 = String.valueOf(var19_18);
            var13_13.put("pcnt_au", var6_6);
            var13_13.put("f.channel", "Android");
            var14_14 = "MOBILE";
            var13_13.put("f.platform", var14_14);
            AJIOApplication.Companion.getClass();
            var6_6 = UserInformation.getInstance((Context)AJIOApplication$a.a());
            var19_18 = (int)var6_6.isUserOnline();
            var6_6 = var19_18 != 0 ? "LOGGED_IN" : "NON_LOGGED_IN";
            var14_14 = "f.user_loginstatus";
            var13_13.put(var14_14, var6_6);
            var6_6 = this.getAppPreferences().f();
            if (var6_6 != null) {
                var15_15 = var6_6;
            }
            var13_13.put("f.user_type", var15_15);
            var6_6 = CustomerStoreType.a;
            var6_6 = od3_2.a();
            var14_14 = ScreenType.SCREEN_HOME;
            var6_6 = CustomerStoreType.a((String)var6_6, (ScreenType)var14_14);
            var14_14 = var6_6 != null && (var20_19 = (var14_14 = StringsKt.m0((CharSequence)var6_6).toString()).length()) != 0 ? var6_6 : "nonpremium";
            var15_15 = "f.user_cohort";
            var13_13.put(var15_15, var14_14);
            var14_14 = od3_2.a();
            if (var2_2 != null) {
                var14_14 = var2_2;
            }
            Intrinsics.checkNotNullParameter(var14_14, "input");
            var14_14 = b.n((String)var14_14, "-", "_", false);
            var15_15 = Locale.ROOT;
            var14_14 = var14_14.toLowerCase((Locale)var15_15);
            Intrinsics.checkNotNullExpressionValue(var14_14, "toLowerCase(...)");
            var13_13.put("f.sis", var14_14);
            var14_14 = UrlHelper.Companion.getInstance();
            var15_15 = new Object[]{};
            var16_16 = "misc";
            var21_20 = "third_party_banner_ads";
            var14_14 = var14_14.getApiUrl(var16_16, var21_20, (Object[])var15_15);
            var15_15 = new HashMap();
            if (var3_3) {
                var21_20 = "jioBannerAdsHome";
                var15_15.put("RequestId", var21_20);
                var16_16 = "userCohortValues";
                var15_15.put(var16_16, var6_6);
            }
            var6_6 = var5_5.bannerAdsRepository;
            var8_8.label = var11_11;
            if ((var6_6 = var6_6.getThirdPartyAdBannersForDifferentPages((String)var14_14, var13_13, (HashMap)var15_15, (f80_0)var8_8)) == var12_12 /* !! */ ) {
                return var12_12 /* !! */ ;
            }
        }
        var6_6 = (dl2_2)var6_6;
        var22_21 = var8_8 = var6_6.b;
        var22_21 = (ThirdPartyBannerAds)var8_8;
        var6_6 = var6_6.a;
        var19_18 = var6_6.d();
        if (var19_18 != 0 && var22_21 != null) {
            var20_19 = 0;
            var14_14 = null;
            var15_15 = null;
            var10_10 = 0;
            var13_13 = null;
            var23_22 = 12;
            var21_20 = null;
            var12_12 /* !! */  = var6_6;
            var6_6 = new DataCallback(0, var22_21, null, null, var23_22, null);
        } else {
            var24_23 = 1;
            var25_24 = 14;
            var6_6 = new DataCallback(var24_23, null, null, null, var25_24, null);
        }
        return var6_6;
    }

    public final jo_2 getAppPreferences() {
        return (jo_2)this.appPreferences$delegate.getValue();
    }

    public final List getBannerList(BannerAd iterator, String string2) {
        boolean bl2;
        Object object;
        Object object2;
        int n3;
        Intrinsics.checkNotNullParameter(iterator, "bannerAd");
        Intrinsics.checkNotNullParameter(string2, "bannerAdVariantType");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        iterator = ((BannerAd)((Object)iterator)).getResult();
        boolean bl3 = false;
        Object object3 = null;
        if (iterator != null && (iterator = ((Result)((Object)iterator)).getAsi()) != null) {
            n3 = iterator.size();
            object2 = new ArrayList(n3);
            iterator = iterator.entrySet().iterator();
            while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object = (Campaigns)iterator.next().getValue();
                object2.add(object);
            }
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null && (iterator = (Campaigns)object2.get(0)) != null) {
            object3 = ((Campaigns)((Object)iterator)).getCampaigns();
        }
        if (object3 != null && (iterator = ((Cmps)object3).getDd()) != null) {
            iterator = iterator.entrySet().iterator();
            while (bl3 = iterator.hasNext()) {
                object3 = ((DD)iterator.next().getValue()).getAds();
                if (object3 == null) continue;
                object3 = object3.entrySet().iterator();
                while (bl2 = object3.hasNext()) {
                    object2 = (Ad)object3.next().getValue();
                    object = ((Ad)object2).getAd();
                    if (object == null) continue;
                    if ((object2 = ((Ad)object2).getConfig()) == null || (object2 = ((AdConfig)object2).getCid()) == null) {
                        object2 = "";
                    }
                    if ((object = (Collection)((BannerAdData)(object2 = this.buildBannerAd((String)object, (String)object2))).getCustomimage()) == null || (n3 = (int)(object.isEmpty() ? 1 : 0)) != 0 || (n3 = (int)(this.isValidImageSize((List)(object = ((BannerAdData)object2).getCustomimage()), string2) ? 1 : 0)) == 0) continue;
                    arrayList.add(object2);
                }
            }
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object getBannersForDifferentPages(String var1_1, String var2_2, f80_0 var3_3) {
        var4_4 = this;
        var5_5 = var3_3;
        var6_6 = var3_3 instanceof BannerAdUseCase$getBannersForDifferentPages$1;
        if (!var6_6) ** GOTO lbl-1000
        var7_7 = var3_3;
        var7_7 = (BannerAdUseCase$getBannersForDifferentPages$1)var3_3;
        var8_8 = var7_7.label;
        var9_9 = -1 << -1;
        var10_10 = var8_8 & var9_9;
        if (var10_10 != 0) {
            var7_7.label = var8_8 -= var9_9;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = new BannerAdUseCase$getBannersForDifferentPages$1(var4_4, (f80_0)var5_5);
        }
        var5_5 = var7_7.result;
        var11_11 = j90_0.COROUTINE_SUSPENDED;
        var9_9 = var7_7.label;
        var10_10 = 1;
        if (var9_9 == 0) ** GOTO lbl26
        if (var9_9 == var10_10) {
            var7_7 = (String)var7_7.L$0;
            vl2_2.b(var5_5);
            var12_12 = var7_7;
        } else {
            block21: {
                var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var5_5;
lbl26:
                // 1 sources

                vl2_2.b(var5_5);
                var5_5 = new HashMap();
                var13_13 = Locale.ROOT;
                var14_14 = "mobile".toUpperCase((Locale)var13_13);
                var15_15 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15);
                var5_5.put("platform", var14_14);
                var14_14 = od3_2.a().toUpperCase((Locale)var13_13);
                Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15);
                var5_5.put("store", var14_14);
                var14_14 = "ajio".toUpperCase((Locale)var13_13);
                Intrinsics.checkNotNullExpressionValue(var14_14, (String)var15_15);
                var16_16 /* !! */  = "tenantId";
                var5_5.put(var16_16 /* !! */ , var14_14);
                var13_13 = "android".toUpperCase((Locale)var13_13);
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var15_15);
                var14_14 = "channel";
                var5_5.put(var14_14, var13_13);
                AJIOApplication.Companion.getClass();
                var13_13 = UserInformation.getInstance((Context)AJIOApplication$a.a());
                var9_9 = (int)var13_13.isUserOnline();
                var13_13 = var9_9 != 0 ? "LOGGED_IN" : "NON_LOGGED_IN";
                var5_5.put("userStatus", var13_13);
                var13_13 = this.getAppPreferences().f();
                var14_14 = "";
                if (var13_13 == null) {
                    var13_13 = var14_14;
                }
                var5_5.put("userType", var13_13);
                var13_13 = CustomerStoreType.a;
                var13_13 = od3_2.a();
                var15_15 = ScreenType.SCREEN_HOME;
                var13_13 = CustomerStoreType.a((String)var13_13, (ScreenType)var15_15);
                var5_5.put("userGroup", var13_13);
                var15_15 = this.getAppPreferences().i();
                if (var15_15 == null || (var15_15 = var15_15.getCity()) == null) {
                    var15_15 = var14_14;
                }
                var16_16 /* !! */  = "city";
                var5_5.put(var16_16 /* !! */ , var15_15);
                var15_15 = var1_1 == null ? var14_14 : var1_1;
                var5_5.put("url", var15_15);
                var15_15 = AJIOApplication$a.a().getPackageManager();
                var16_16 /* !! */  = AJIOApplication$a.a().getPackageName();
                var12_12 = null;
                var15_15 = var15_15.getPackageInfo((String)var16_16 /* !! */ , (int)0).versionName;
                if (var15_15 == null) {
                    var15_15 = var14_14;
                }
                var16_16 /* !! */  = "appVersion";
                var5_5.put(var16_16 /* !! */ , var15_15);
                var15_15 = this.getAppPreferences().i();
                if (var15_15 == null || (var15_15 = var15_15.getPincode()) == null) {
                    var15_15 = var14_14;
                }
                var16_16 /* !! */  = "pincode";
                var5_5.put(var16_16 /* !! */ , var15_15);
                var15_15 = this.getAppPreferences().i();
                if (var15_15 == null || (var15_15 = var15_15.getState()) == null) {
                    var15_15 = var14_14;
                }
                var16_16 /* !! */  = "state";
                var5_5.put(var16_16 /* !! */ , var15_15);
                var15_15 = this.getAppPreferences().i();
                if (var15_15 == null || (var15_15 = var15_15.getZone()) == null) {
                    var15_15 = var14_14;
                }
                var16_16 /* !! */  = "zone";
                var5_5.put(var16_16 /* !! */ , var15_15);
                var15_15 = w61_0.a();
                var17_17 = var15_15.length();
                if (var17_17 <= 0) break block21;
                var16_16 /* !! */  = "experiments";
                var18_18 = "\"";
                var15_15 = b.n((String)var15_15, (String)var18_18, (String)var14_14, false);
                var19_19 = "\\s";
                var18_18 = new Regex(var19_19);
                var14_14 = var18_18.replace((CharSequence)var15_15, (String)var14_14);
                try {
                    var5_5.put(var16_16 /* !! */ , var14_14);
                }
                catch (Exception v0) {
                    var14_14 = yn3_0.a;
                    var15_15 = "Exception while fetching experiments";
                    var16_16 /* !! */  = new Object[]{};
                    var14_14.a((String)var15_15, var16_16 /* !! */ );
                }
            }
            var14_14 = UrlHelper.Companion.getInstance();
            var15_15 = new Object[]{};
            var12_12 = "banner_ad_different_api";
            var14_14 = var14_14.getApiUrl("misc", (String)var12_12, (Object[])var15_15);
            var15_15 = var4_4.bannerAdsRepository;
            var16_16 /* !! */  = var2_2;
            var7_7.L$0 = var2_2;
            var7_7.label = var10_10;
            if ((var5_5 = var15_15.getBannersForDifferentPages((String)var14_14, (Map)var5_5, (String)var13_13, (f80_0)var7_7)) == var11_11) {
                return var11_11;
            }
            var12_12 = var2_2;
        }
        var14_14 = var5_5;
        var14_14 = (dl2_2)var5_5;
        var5_5 = (BannerAdComponents)var14_14.b;
        var7_7 = var14_14.a;
        var6_6 = var7_7.d();
        if (var6_6 && var5_5 != null) {
            var20_20 = var5_5.getData();
            var21_22 = false;
            var22_24 = false;
            var19_19 = null;
            var23_26 = 12;
            var24_28 = null;
            var18_18 = var7_7;
            var7_7 = new DataCallback(0, var20_20, null, null, var23_26, null);
        } else {
            var13_13 = ApiErrorRepo.INSTANCE;
            var5_5 = var14_14.c;
            var25_30 = String.valueOf(var5_5);
            var17_17 = 1;
            var18_18 = null;
            var15_15 = "BannerAdsApi";
            var22_25 = 32;
            var20_21 = null;
            var24_29 = ApiErrorRepo.logApiError$default((ApiErrorRepo)var13_13, var25_30, (dl2_2)var14_14, (String)var15_15, (boolean)var17_17, (String)var12_12, null, var22_25, null);
            var23_27 = false;
            var21_23 = 1;
            var26_31 = 10;
            var7_7 = new DataCallback(var21_23, null, var24_29, null, var26_31, null);
        }
        return var7_7;
    }
}

