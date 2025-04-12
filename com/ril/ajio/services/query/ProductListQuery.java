/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse;
import com.ril.ajio.services.data.Product.Category;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.query.ProductListQuery$1;
import java.util.ArrayList;
import java.util.List;

public class ProductListQuery
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private AdaptiveSearchReplayResponse adaptiveSearchReplayResponse;
    private String brandCode;
    private String brandId;
    private List breadcrumbsItemsList;
    private String categoryId;
    private String categoryJson;
    private String categoryLink;
    private int currentPage;
    private String currentQueryString;
    private String deviceid;
    private String filterText;
    private boolean fromDidYouMean;
    private String imageName;
    private boolean isAppendProductsQueryParam;
    private boolean isBrandMiniPLP;
    private boolean isSearch;
    private String linkDetailJson;
    private boolean ospreySearch;
    private int pageSize = 25;
    private String pageType;
    private String pincode;
    private String previousSource;
    private String productToggle;
    private String productsListJson;
    private String queryText;
    private Category selectedCategory;
    private List selectedFacetValues;
    private Sort selectedSort;
    private String sessionId;
    private Boolean showAdsOnNextPage;
    private String storeId;
    private int totalPages;
    private int totalResults;
    private Boolean urgencyDriverEnabled;
    private WidgetRecord widgetRecord;

    static {
        ProductListQuery$1 productListQuery$1 = new ProductListQuery$1();
        CREATOR = productListQuery$1;
    }

    public ProductListQuery() {
        ArrayList arrayList;
        this.totalPages = 1;
        this.selectedFacetValues = arrayList = new ArrayList();
        this.breadcrumbsItemsList = arrayList = new ArrayList();
        this.fromDidYouMean = false;
        this.ospreySearch = false;
    }

    private ProductListQuery(Parcel object) {
        int n3;
        ArrayList arrayList;
        int n4;
        this.totalPages = n4 = 1;
        this.selectedFacetValues = arrayList = new ArrayList();
        this.breadcrumbsItemsList = arrayList = new ArrayList();
        arrayList = null;
        this.fromDidYouMean = false;
        this.ospreySearch = false;
        Object object2 = object.readString();
        this.queryText = object2;
        object2 = this.selectedFacetValues;
        ClassLoader classLoader = this.getClass().getClassLoader();
        object.readList((List)object2, classLoader);
        object2 = this.breadcrumbsItemsList;
        classLoader = this.getClass().getClassLoader();
        object.readList((List)object2, classLoader);
        object2 = this.getClass().getClassLoader();
        this.selectedSort = object2 = (Sort)object.readParcelable((ClassLoader)object2);
        object2 = this.getClass().getClassLoader();
        object2 = (Boolean)object.readValue((ClassLoader)object2);
        this.fromDidYouMean = n3 = ((Boolean)object2).booleanValue();
        n3 = object.readInt();
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.isSearch = n3;
        this.productsListJson = object2 = object.readString();
        this.categoryJson = object2 = object.readString();
        this.linkDetailJson = object2 = object.readString();
        this.currentQueryString = object2 = object.readString();
        this.productToggle = object2 = object.readString();
        this.currentPage = n3 = object.readInt();
        this.pageSize = n3 = object.readInt();
        this.totalResults = n3 = object.readInt();
        this.totalPages = n3 = object.readInt();
        this.storeId = object2 = object.readString();
        this.imageName = object2 = object.readString();
        object2 = this.getClass().getClassLoader();
        this.adaptiveSearchReplayResponse = object2 = (AdaptiveSearchReplayResponse)object.readParcelable((ClassLoader)object2);
        object2 = this.getClass().getClassLoader();
        this.widgetRecord = object2 = (WidgetRecord)object.readParcelable((ClassLoader)object2);
        this.brandId = object2 = object.readString();
        n3 = object.readInt();
        if (n3 != n4) {
            n4 = 0;
        }
        this.isBrandMiniPLP = n4;
        object = object.readString();
        this.previousSource = object;
    }

    public /* synthetic */ ProductListQuery(Parcel parcel, int n3) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public AdaptiveSearchReplayResponse getAdaptiveSearchReplayResponse() {
        return this.adaptiveSearchReplayResponse;
    }

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getBrandId() {
        return this.brandId;
    }

    public List getBreadcrumbsItemsList() {
        return this.breadcrumbsItemsList;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryJson() {
        return this.categoryJson;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public String getCurrentQueryString() {
        return this.currentQueryString;
    }

    public String getDeviceid() {
        return this.deviceid;
    }

    public String getImageName() {
        return this.imageName;
    }

    public String getLinkDetailJson() {
        return this.linkDetailJson;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public String getPageType() {
        return this.pageType;
    }

    public String getPincode() {
        return this.pincode;
    }

    public String getPreviousSource() {
        return this.previousSource;
    }

    public String getProductToggle() {
        return this.productToggle;
    }

    public String getProductsListJson() {
        return this.productsListJson;
    }

    public String getQueryText() {
        return this.queryText;
    }

    public Category getSelectedCategory() {
        return this.selectedCategory;
    }

    public List getSelectedFacetValues() {
        return this.selectedFacetValues;
    }

    public Sort getSelectedSort() {
        return this.selectedSort;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Boolean getShowAdsOnNextPage() {
        return this.showAdsOnNextPage;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getTotalResults() {
        return this.totalResults;
    }

    public Boolean getUrgencyDriverEnabled() {
        return this.urgencyDriverEnabled;
    }

    public WidgetRecord getWidgetRecord() {
        return this.widgetRecord;
    }

    public boolean isAppendProductsQueryParam() {
        return this.isAppendProductsQueryParam;
    }

    public boolean isBrandMiniPLP() {
        return this.isBrandMiniPLP;
    }

    public boolean isFromDidYouMean() {
        return this.fromDidYouMean;
    }

    public boolean isOspreySearch() {
        return this.ospreySearch;
    }

    public boolean isSearch() {
        return this.isSearch;
    }

    public void setAdaptiveSearchReplayResponse(AdaptiveSearchReplayResponse adaptiveSearchReplayResponse) {
        this.adaptiveSearchReplayResponse = adaptiveSearchReplayResponse;
    }

    public void setAppendProductsQueryParam(boolean bl2) {
        this.isAppendProductsQueryParam = bl2;
    }

    public void setBrandCode(String string2) {
        this.brandCode = string2;
    }

    public void setBrandId(String string2) {
        this.brandId = string2;
    }

    public void setBrandMiniPLP(boolean bl2) {
        this.isBrandMiniPLP = bl2;
    }

    public void setBreadcrumbsItemsList(List list) {
        this.breadcrumbsItemsList = list;
    }

    public void setCategoryId(String string2) {
        this.categoryId = string2;
    }

    public void setCategoryJson(String string2) {
        this.categoryJson = string2;
    }

    public void setCurrentPage(int n3) {
        this.currentPage = n3;
    }

    public void setCurrentQueryString(String string2) {
        this.currentQueryString = string2;
    }

    public void setDeviceid(String string2) {
        this.deviceid = string2;
    }

    public void setFromDidYouMean(boolean bl2) {
        this.fromDidYouMean = bl2;
    }

    public void setImageName(String string2) {
        this.imageName = string2;
    }

    public void setIsSearch(boolean bl2) {
        this.isSearch = bl2;
    }

    public void setLinkDetailJson(String string2) {
        this.linkDetailJson = string2;
    }

    public void setOspreySearch(boolean bl2) {
        this.ospreySearch = bl2;
    }

    public void setPageSize(int n3) {
        this.pageSize = n3;
    }

    public void setPageType(String string2) {
        this.pageType = string2;
    }

    public void setPincode(String string2) {
        this.pincode = string2;
    }

    public void setPreviousSource(String string2) {
        this.previousSource = string2;
    }

    public void setProductToggle(String string2) {
        this.productToggle = string2;
    }

    public void setProductsListJson(String string2) {
        this.productsListJson = string2;
    }

    public void setQueryText(String string2) {
        this.queryText = string2;
    }

    public void setSelectedCategory(Category category) {
        this.selectedCategory = category;
    }

    public void setSelectedFacetValues(List list) {
        this.selectedFacetValues = list;
    }

    public void setSelectedSort(Sort sort) {
        this.selectedSort = sort;
    }

    public void setSessionId(String string2) {
        this.sessionId = string2;
    }

    public void setShowAdsOnNextPage(Boolean bl2) {
        this.showAdsOnNextPage = bl2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }

    public void setTotalPages(int n3) {
        this.totalPages = n3;
    }

    public void setTotalResults(int n3) {
        this.totalResults = n3;
    }

    public void setUrgencyDriverEnabled(Boolean bl2) {
        this.urgencyDriverEnabled = bl2;
    }

    public void setWidgetRecord(WidgetRecord widgetRecord) {
        this.widgetRecord = widgetRecord;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.queryText;
        parcel.writeString((String)object);
        object = this.selectedFacetValues;
        parcel.writeList((List)object);
        object = this.breadcrumbsItemsList;
        parcel.writeList((List)object);
        object = this.selectedSort;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.fromDidYouMean;
        parcel.writeValue(object);
        int n4 = this.isSearch;
        parcel.writeInt(n4);
        object = this.productsListJson;
        parcel.writeString((String)object);
        object = this.categoryJson;
        parcel.writeString((String)object);
        object = this.linkDetailJson;
        parcel.writeString((String)object);
        object = this.currentQueryString;
        parcel.writeString((String)object);
        object = this.productToggle;
        parcel.writeString((String)object);
        int n7 = this.currentPage;
        parcel.writeInt(n7);
        int n8 = this.pageSize;
        parcel.writeInt(n8);
        int n10 = this.totalResults;
        parcel.writeInt(n10);
        int n14 = this.totalPages;
        parcel.writeInt(n14);
        object = this.storeId;
        parcel.writeString((String)object);
        object = this.imageName;
        parcel.writeString((String)object);
        object = this.brandId;
        parcel.writeString((String)object);
        object = this.adaptiveSearchReplayResponse;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.widgetRecord;
        parcel.writeParcelable((Parcelable)object, n3);
        n3 = (int)(this.isBrandMiniPLP ? 1 : 0);
        parcel.writeInt(n3);
        String string2 = this.previousSource;
        parcel.writeString(string2);
    }
}

