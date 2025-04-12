/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.ril.ajio.services.query;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ril.ajio.services.data.BreadcrumbsItems;
import com.ril.ajio.services.data.Product.Category;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.query.QueryFilter$1;
import com.ril.ajio.services.query.QueryFilter$2;
import com.ril.ajio.services.query.QueryFilter$3;
import com.ril.ajio.services.query.QueryFilter$4;
import com.ril.ajio.services.query.QueryFilter$5;
import com.ril.ajio.services.query.QueryFilter$6;
import com.ril.ajio.services.query.QueryFilter$QueryFilterData;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

public class QueryFilter
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String categoryId;
    private int currentPage;
    private String facetSelectionQuery;
    private boolean isSelected;
    private int pageSize;
    private String query;
    private List removeQueries;
    private String searchCategoryTag;
    private String sortCode;
    private String storeId;

    static {
        QueryFilter$1 queryFilter$1 = new QueryFilter$1();
        CREATOR = queryFilter$1;
    }

    public QueryFilter() {
    }

    public QueryFilter(int n3, int n4, String string2, String string3, boolean bl2, String string4, String string5, String string6, List list) {
        this.currentPage = n3;
        this.pageSize = n4;
        this.searchCategoryTag = string2;
        this.facetSelectionQuery = string3;
        this.isSelected = bl2;
        this.categoryId = string4;
        this.sortCode = string5;
        this.query = string6;
        this.removeQueries = list;
    }

    private QueryFilter(Parcel parcel) {
        Object object = parcel.readString();
        this.query = object;
        object = parcel.readString();
        this.sortCode = object;
        object = parcel.readString();
        this.categoryId = object;
        int n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        this.isSelected = n3;
        object = parcel.readString();
        this.facetSelectionQuery = object;
        object = parcel.readString();
        this.searchCategoryTag = object;
        this.pageSize = n3 = parcel.readInt();
        this.currentPage = n3 = parcel.readInt();
        object = this.removeQueries;
        ClassLoader classLoader = this.getClass().getClassLoader();
        parcel.readList((List)object, classLoader);
    }

    public /* synthetic */ QueryFilter(Parcel parcel, int n3) {
        this(parcel);
    }

    public static /* bridge */ /* synthetic */ String a(QueryFilter queryFilter) {
        return queryFilter.categoryId;
    }

    public static /* bridge */ /* synthetic */ String b(QueryFilter queryFilter) {
        return queryFilter.facetSelectionQuery;
    }

    public static /* bridge */ /* synthetic */ String c(QueryFilter queryFilter) {
        return queryFilter.query;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String de(String string2) {
        String string3 = ":";
        try {
            boolean bl2 = string2.contains(string3);
            String string4 = "UTF-8";
            if (!bl2) return URLDecoder.decode(string2, string4);
            string2 = URLEncoder.encode(string2, string4);
            return URLDecoder.decode(string2, string4);
        }
        catch (Exception exception) {}
        yn3_0.a(exception);
        return string2;
    }

    public static /* bridge */ /* synthetic */ String e(QueryFilter queryFilter) {
        return queryFilter.searchCategoryTag;
    }

    private String enc(String string2) {
        String string3 = "UTF-8";
        try {
            return URLEncoder.encode(string2, string3);
        }
        catch (Exception exception) {
            yn3_0.a(exception);
            return string2;
        }
    }

    public static /* bridge */ /* synthetic */ String f(QueryFilter queryFilter) {
        return queryFilter.sortCode;
    }

    public static /* bridge */ /* synthetic */ String g(QueryFilter queryFilter, String string2) {
        return queryFilter.de(string2);
    }

    public static /* bridge */ /* synthetic */ String h(QueryFilter queryFilter, String string2) {
        return queryFilter.enc(string2);
    }

    public static /* bridge */ /* synthetic */ boolean i(QueryFilter queryFilter, String string2) {
        return queryFilter.isPresent(string2);
    }

    private boolean isPresent(String string2) {
        return TextUtils.isEmpty((CharSequence)string2) ^ true;
    }

    public int describeContents() {
        return 0;
    }

    public QueryFilter$QueryFilterData getCategoryId() {
        QueryFilter$4 queryFilter$4 = new QueryFilter$4(this);
        return queryFilter$4;
    }

    public String getClearQuery() {
        boolean bl2;
        CharSequence charSequence = new StringBuilder();
        Object object = this.removeQueries;
        if (object != null && !(bl2 = object.isEmpty())) {
            Object object2;
            int n3;
            bl2 = false;
            object = null;
            String string2 = null;
            for (int i3 = 0; i3 < (n3 = (object2 = this.removeQueries).size()); ++i3) {
                object2 = ((BreadcrumbsItems)this.removeQueries.get(i3)).getRemoveQuery().getQuery().getValue();
                if (i3 != 0) continue;
                String string3 = ":";
                object2 = object2.split(string3);
                StringBuilder stringBuilder = new StringBuilder();
                String string4 = object2[0];
                stringBuilder.append(string4);
                stringBuilder.append(string3);
                int n4 = 1;
                object2 = object2[n4];
                stringBuilder.append((String)object2);
                object2 = stringBuilder.toString();
                ((StringBuilder)charSequence).append((String)object2);
            }
            object = this.searchCategoryTag;
            if (object != null && !(bl2 = ((String)object).isEmpty())) {
                object = new StringBuilder();
                string2 = this.searchCategoryTag;
                ((StringBuilder)object).append(string2);
                charSequence = ((StringBuilder)charSequence).toString();
                ((StringBuilder)object).append((String)charSequence);
                charSequence = ((StringBuilder)object).toString();
            } else {
                charSequence = ((StringBuilder)charSequence).toString();
            }
        } else {
            charSequence = "";
        }
        return charSequence;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public QueryFilter$QueryFilterData getFacetSelectionQuery() {
        QueryFilter$5 queryFilter$5 = new QueryFilter$5(this);
        return queryFilter$5;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public QueryFilter$QueryFilterData getQuery() {
        QueryFilter$2 queryFilter$2 = new QueryFilter$2(this);
        return queryFilter$2;
    }

    public QueryFilter$QueryFilterData getSearchCategoryTag() {
        QueryFilter$6 queryFilter$6 = new QueryFilter$6(this);
        return queryFilter$6;
    }

    public QueryFilter$QueryFilterData getSortCode() {
        QueryFilter$3 queryFilter$3 = new QueryFilter$3(this);
        return queryFilter$3;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCategoryId(String string2) {
        this.categoryId = string2;
    }

    public void setCurrentPage(int n3) {
        this.currentPage = n3;
    }

    public void setFacetSelectionQuery(String string2) {
        this.facetSelectionQuery = string2;
    }

    public void setIsSelected(boolean bl2) {
        this.isSelected = bl2;
    }

    public void setPageSize(int n3) {
        this.pageSize = n3;
    }

    public void setQuery(String string2) {
        this.query = string2;
    }

    public void setSearchCategoryTag(Category object) {
        object = object != null ? ((Category)object).getSearchTag() : null;
        this.searchCategoryTag = object;
    }

    public void setSearchCategoryTag(String string2) {
        this.searchCategoryTag = string2;
    }

    public void setSortCode(Sort object) {
        object = object != null ? ((Sort)object).getCode() : null;
        this.sortCode = object;
    }

    public void setSortCode(String string2) {
        this.sortCode = string2;
    }

    public void setStoreId(String string2) {
        this.storeId = string2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("QueryFilter{query='");
        String string2 = this.query;
        stringBuilder.append(string2);
        stringBuilder.append("', sortCode='");
        string2 = this.sortCode;
        stringBuilder.append(string2);
        stringBuilder.append("', categoryId='");
        string2 = this.categoryId;
        stringBuilder.append(string2);
        stringBuilder.append("', isSelected=");
        int n3 = this.isSelected;
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", facetSelectionQuery='");
        string2 = this.facetSelectionQuery;
        stringBuilder.append(string2);
        stringBuilder.append("', searchCategoryTag='");
        string2 = this.searchCategoryTag;
        stringBuilder.append(string2);
        stringBuilder.append("', pageSize=");
        n3 = this.pageSize;
        stringBuilder.append(n3);
        stringBuilder.append(", currentPage=");
        n3 = this.currentPage;
        return tu.a(stringBuilder, n3, '}');
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.query;
        parcel.writeString((String)object);
        object = this.sortCode;
        parcel.writeString((String)object);
        object = this.categoryId;
        parcel.writeString((String)object);
        n3 = (int)(this.isSelected ? 1 : 0);
        parcel.writeInt(n3);
        object = this.facetSelectionQuery;
        parcel.writeString((String)object);
        object = this.searchCategoryTag;
        parcel.writeString((String)object);
        n3 = this.pageSize;
        parcel.writeInt(n3);
        n3 = this.currentPage;
        parcel.writeInt(n3);
        object = this.removeQueries;
        parcel.writeList((List)object);
    }
}

