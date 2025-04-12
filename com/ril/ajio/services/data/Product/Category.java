/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.Category$1;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Category
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private List childCategories;
    private String name;
    private String searchTag;

    static {
        Category$1 category$1 = new Category$1();
        CREATOR = category$1;
    }

    private Category() {
        ArrayList arrayList;
        this.childCategories = arrayList = new ArrayList();
    }

    private Category(Parcel object) {
        Object object2 = new ArrayList();
        this.childCategories = object2;
        this.searchTag = object2 = object.readString();
        object2 = this.childCategories;
        ClassLoader classLoader = this.getClass().getClassLoader();
        object.readList((List)object2, classLoader);
        object = object.readString();
        this.name = object;
    }

    public /* synthetic */ Category(Parcel parcel, int n3) {
        this(parcel);
    }

    public static Category createCategoryFromObjectInfo(Hashtable object) {
        Category category = new Category();
        Object object2 = new ArrayList();
        category.childCategories = object2;
        category.name = object2 = (String)((Hashtable)object).get("name");
        object2 = (Category)((Hashtable)object).get("parent");
        if (object2 != null) {
            object2 = ((Category)object2).childCategories;
            object2.add(category);
        }
        category.searchTag = object = (String)((Hashtable)object).get("searchTag");
        return category;
    }

    public int describeContents() {
        return 0;
    }

    public List getChildCategories() {
        return this.childCategories;
    }

    public String getName() {
        return this.name;
    }

    public String getSearchTag() {
        return this.searchTag;
    }

    public void setChildCategories(List list) {
        this.childCategories = list;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setSearchTag(String string2) {
        this.searchTag = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.searchTag;
        parcel.writeString((String)object);
        object = this.childCategories;
        parcel.writeList((List)object);
        object = this.name;
        parcel.writeString((String)object);
    }
}

