/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data.Product;

import android.text.TextUtils;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.PlpExtendedBanner;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.ProductsList$Companion;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.SpellingSuggestion;
import com.ril.ajio.services.query.CurrentQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ProductsList {
    private static String BRAND_PAGE;
    private static String CATEGORY_PAGE;
    private static String CURATED_PAGE;
    public static final ProductsList$Companion Companion;
    private static String SEARCH_PAGE;
    private static String WEB_CATEGORY_PAGE;
    private Integer adapterPositionForDynamicWidget;
    private AdaptiveSearchReplayResponse adaptiveSearchReplayResponse;
    private String appliedGenderFilter;
    private boolean autoAppliedFilter;
    private final boolean autoCorrect;
    private BrandDetails brandDetails;
    private String categoryCode;
    private String categoryDescription;
    private final String classifierType;
    private CurrentQuery currentQuery;
    private Long dealEndTime;
    private Long dealStartTime;
    private String descriptionV2;
    private boolean endTimerVisibility;
    private List facets;
    private String freeTextSearch;
    private String im_id;
    private boolean isFromImageSearch;
    private boolean isSlaNodesAvailable;
    private String lastSavedCohort;
    private String offerEndTime;
    private List offerInfoCartData;
    private final String originalSearchTerm;
    private String pageType;
    private Pagination pagination;
    private PlpExtendedBanner plpExtendedBanner;
    private String plpViewType;
    private PriceRevealMetaInfo priceRevealMetaInfo;
    private String productListsOffset;
    private final String productToggle;
    private List productUiModelList;
    private List product_types;
    private List products;
    private List quickFilters;
    private String redirect;
    private String responseSource;
    private Long saleEndTime;
    private Long saleStartTime;
    private Boolean showAdsOnNextPage;
    private List sorts;
    private ArrayList spellCheckSuggestions;
    private final SpellingSuggestion spellingSuggestion;
    private String store;
    private String storeInfo;
    private String storeRedirectUri;
    private ArrayList suggestedSearchTerms;
    private String timerStartBefore;
    private String userGroup;
    private WidgetRecord widgetRecord;

    static {
        ProductsList$Companion productsList$Companion;
        Companion = productsList$Companion = new ProductsList$Companion(null);
        SEARCH_PAGE = "search page";
        CATEGORY_PAGE = "category page";
        CURATED_PAGE = "curated page";
        WEB_CATEGORY_PAGE = "web category page";
        BRAND_PAGE = "brand page";
    }

    public ProductsList() {
        String string2;
        this.lastSavedCohort = string2 = "";
        this.responseSource = string2;
    }

    public static final /* synthetic */ String access$getBRAND_PAGE$cp() {
        return BRAND_PAGE;
    }

    public static final /* synthetic */ String access$getCATEGORY_PAGE$cp() {
        return CATEGORY_PAGE;
    }

    public static final /* synthetic */ String access$getCURATED_PAGE$cp() {
        return CURATED_PAGE;
    }

    public static final /* synthetic */ String access$getSEARCH_PAGE$cp() {
        return SEARCH_PAGE;
    }

    public static final /* synthetic */ String access$getWEB_CATEGORY_PAGE$cp() {
        return WEB_CATEGORY_PAGE;
    }

    public static final /* synthetic */ void access$setBRAND_PAGE$cp(String string2) {
        BRAND_PAGE = string2;
    }

    public static final /* synthetic */ void access$setCATEGORY_PAGE$cp(String string2) {
        CATEGORY_PAGE = string2;
    }

    public static final /* synthetic */ void access$setCURATED_PAGE$cp(String string2) {
        CURATED_PAGE = string2;
    }

    public static final /* synthetic */ void access$setSEARCH_PAGE$cp(String string2) {
        SEARCH_PAGE = string2;
    }

    public static final /* synthetic */ void access$setWEB_CATEGORY_PAGE$cp(String string2) {
        WEB_CATEGORY_PAGE = string2;
    }

    public final Integer getAdapterPositionForDynamicWidget() {
        return this.adapterPositionForDynamicWidget;
    }

    public final AdaptiveSearchReplayResponse getAdaptiveSearchReplayResponse() {
        return this.adaptiveSearchReplayResponse;
    }

    public final String getAppliedGenderFilter() {
        return this.appliedGenderFilter;
    }

    public final boolean getAutoAppliedFilter() {
        return this.autoAppliedFilter;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final BrandDetails getBrandDetails() {
        return this.brandDetails;
    }

    public final String getCategoryCode() {
        return this.categoryCode;
    }

    public final String getCategoryDescription() {
        return this.categoryDescription;
    }

    public final String getClassifierType() {
        return this.classifierType;
    }

    public final CurrentQuery getCurrentQuery() {
        return this.currentQuery;
    }

    public final Long getDealEndTime() {
        return this.dealEndTime;
    }

    public final Long getDealStartTime() {
        return this.dealStartTime;
    }

    public final String getDescriptionV2() {
        return this.descriptionV2;
    }

    public final boolean getEndTimerVisibility() {
        return this.endTimerVisibility;
    }

    public final List getFacets() {
        return this.facets;
    }

    public final String getFreeTextSearch() {
        return this.freeTextSearch;
    }

    public final String getIm_id() {
        return this.im_id;
    }

    public final String getLastSavedCohort() {
        return this.lastSavedCohort;
    }

    public final String getOfferEndTime() {
        return this.offerEndTime;
    }

    public final List getOfferInfoCartData() {
        return this.offerInfoCartData;
    }

    public final String getOriginalSearchTerm() {
        return this.originalSearchTerm;
    }

    public final String getPageType() {
        String string2 = this.pageType;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string2 = this.pageType;
            Intrinsics.checkNotNull(string2);
            string2 = string2.toLowerCase();
            String string3 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
        } else {
            bl2 = false;
            string2 = null;
        }
        return string2;
    }

    public final Pagination getPagination() {
        return this.pagination;
    }

    public final PlpExtendedBanner getPlpExtendedBanner() {
        return this.plpExtendedBanner;
    }

    public final String getPlpViewType() {
        return this.plpViewType;
    }

    public final PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public final String getProductListsOffset() {
        return this.productListsOffset;
    }

    public final String getProductToggle() {
        return this.productToggle;
    }

    public final List getProductUiModelList() {
        return this.productUiModelList;
    }

    public final List getProduct_types() {
        return this.product_types;
    }

    public final List getProducts() {
        return this.products;
    }

    public final List getQuickFilters() {
        return this.quickFilters;
    }

    public final String getRedirect() {
        return this.redirect;
    }

    public final String getResponseSource() {
        return this.responseSource;
    }

    public final Long getSaleEndTime() {
        return this.saleEndTime;
    }

    public final Long getSaleStartTime() {
        return this.saleStartTime;
    }

    public final Boolean getShowAdsOnNextPage() {
        return this.showAdsOnNextPage;
    }

    public final List getSorts() {
        return this.sorts;
    }

    public final ArrayList getSpellCheckSuggestions() {
        return this.spellCheckSuggestions;
    }

    public final SpellingSuggestion getSpellingSuggestion() {
        return this.spellingSuggestion;
    }

    public final String getStore() {
        return this.store;
    }

    public final String getStoreInfo() {
        return this.storeInfo;
    }

    public final String getStoreRedirectUri() {
        return this.storeRedirectUri;
    }

    public final ArrayList getSuggestedSearchTerms() {
        return this.suggestedSearchTerms;
    }

    public final String getTimerStartBefore() {
        return this.timerStartBefore;
    }

    public final String getUserGroup() {
        return this.userGroup;
    }

    public final WidgetRecord getWidgetRecord() {
        return this.widgetRecord;
    }

    public final boolean isFromImageSearch() {
        return this.isFromImageSearch;
    }

    public final boolean isSlaNodesAvailable() {
        return this.isSlaNodesAvailable;
    }

    public final void setAdapterPositionForDynamicWidget(Integer n3) {
        this.adapterPositionForDynamicWidget = n3;
    }

    public final void setAdaptiveSearchReplayResponse(AdaptiveSearchReplayResponse adaptiveSearchReplayResponse) {
        this.adaptiveSearchReplayResponse = adaptiveSearchReplayResponse;
    }

    public final void setAppliedGenderFilter(String string2) {
        this.appliedGenderFilter = string2;
    }

    public final void setAutoAppliedFilter(boolean bl2) {
        this.autoAppliedFilter = bl2;
    }

    public final void setBrandDetails(BrandDetails brandDetails) {
        this.brandDetails = brandDetails;
    }

    public final void setCategoryCode(String string2) {
        this.categoryCode = string2;
    }

    public final void setCategoryDescription(String string2) {
        this.categoryDescription = string2;
    }

    public final void setCurrentQuery(CurrentQuery currentQuery) {
        this.currentQuery = currentQuery;
    }

    public final void setDealEndTime(Long l2) {
        this.dealEndTime = l2;
    }

    public final void setDealStartTime(Long l2) {
        this.dealStartTime = l2;
    }

    public final void setDescriptionV2(String string2) {
        this.descriptionV2 = string2;
    }

    public final void setEndTimerVisibility(boolean bl2) {
        this.endTimerVisibility = bl2;
    }

    public final void setFacets(List list) {
        this.facets = list;
    }

    public final void setFreeTextSearch(String string2) {
        this.freeTextSearch = string2;
    }

    public final void setFromImageSearch(boolean bl2) {
        this.isFromImageSearch = bl2;
    }

    public final void setIm_id(String string2) {
        this.im_id = string2;
    }

    public final void setLastSavedCohort(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.lastSavedCohort = string2;
    }

    public final void setOfferEndTime(String string2) {
        this.offerEndTime = string2;
    }

    public final void setOfferInfoCartData(List list) {
        this.offerInfoCartData = list;
    }

    public final void setPageType(String string2) {
        this.pageType = string2;
    }

    public final void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public final void setPlpExtendedBanner(PlpExtendedBanner plpExtendedBanner) {
        this.plpExtendedBanner = plpExtendedBanner;
    }

    public final void setPlpViewType(String string2) {
        this.plpViewType = string2;
    }

    public final void setPriceRevealMetaInfo(PriceRevealMetaInfo priceRevealMetaInfo) {
        this.priceRevealMetaInfo = priceRevealMetaInfo;
    }

    public final void setProductListsOffset(String string2) {
        this.productListsOffset = string2;
    }

    public final void setProductUiModelList(List list) {
        this.productUiModelList = list;
    }

    public final void setProduct_types(List list) {
        this.product_types = list;
    }

    public final void setProducts(List list) {
        this.products = list;
    }

    public final void setQuickFilters(List list) {
        this.quickFilters = list;
    }

    public final void setRedirect(String string2) {
        this.redirect = string2;
    }

    public final void setResponseSource(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.responseSource = string2;
    }

    public final void setSaleEndTime(Long l2) {
        this.saleEndTime = l2;
    }

    public final void setSaleStartTime(Long l2) {
        this.saleStartTime = l2;
    }

    public final void setShowAdsOnNextPage(Boolean bl2) {
        this.showAdsOnNextPage = bl2;
    }

    public final void setSlaNodesAvailable(boolean bl2) {
        this.isSlaNodesAvailable = bl2;
    }

    public final void setSorts(List list) {
        this.sorts = list;
    }

    public final void setSpellCheckSuggestions(ArrayList arrayList) {
        this.spellCheckSuggestions = arrayList;
    }

    public final void setStore(String string2) {
        this.store = string2;
    }

    public final void setStoreInfo(String string2) {
        this.storeInfo = string2;
    }

    public final void setStoreRedirectUri(String string2) {
        this.storeRedirectUri = string2;
    }

    public final void setSuggestedSearchTerms(ArrayList arrayList) {
        this.suggestedSearchTerms = arrayList;
    }

    public final void setTimerStartBefore(String string2) {
        this.timerStartBefore = string2;
    }

    public final void setUserGroup(String string2) {
        this.userGroup = string2;
    }

    public final void setWidgetRecord(WidgetRecord widgetRecord) {
        this.widgetRecord = widgetRecord;
    }
}

