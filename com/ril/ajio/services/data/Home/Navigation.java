/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import com.ril.ajio.services.data.Home.Navigation$Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Navigation
implements NavImpl,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private List childDetails;
    private String imageUrl2;
    private String link;
    private List linkDetails;
    private String name;
    private Boolean newFlag;
    private String parentName;
    private String picture;

    static {
        Navigation$Creator navigation$Creator = new Navigation$Creator();
        CREATOR = navigation$Creator;
    }

    public Navigation(Navigation navigation) {
        Intrinsics.checkNotNullParameter(navigation, "originalObject");
        Collection collection = navigation.childDetails;
        Intrinsics.checkNotNull(collection);
        collection = collection;
        ArrayList arrayList = new ArrayList(collection);
        collection = navigation.linkDetails;
        Intrinsics.checkNotNull(collection);
        collection = collection;
        ArrayList arrayList2 = new ArrayList(collection);
        String string2 = navigation.link;
        String string3 = navigation.name;
        String string4 = navigation.parentName;
        String string5 = navigation.imageUrl2;
        Boolean bl2 = navigation.newFlag;
        String string6 = navigation.picture;
        this(arrayList, arrayList2, string2, string3, string4, string5, bl2, string6);
    }

    public Navigation(List list, List list2, String string2, String string3, String string4, String string5, Boolean bl2, String string6) {
        this.childDetails = list;
        this.linkDetails = list2;
        this.link = string2;
        this.name = string3;
        this.parentName = string4;
        this.imageUrl2 = string5;
        this.newFlag = bl2;
        this.picture = string6;
    }

    public /* synthetic */ Navigation(List arrayList, List arrayList2, String string2, String string3, String string4, String string5, Boolean bl2, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList3;
        int n4 = n3 & 1;
        ArrayList arrayList4 = n4 != 0 ? (arrayList3 = new ArrayList()) : arrayList;
        n4 = n3 & 2;
        ArrayList arrayList5 = n4 != 0 ? (arrayList3 = new ArrayList()) : arrayList2;
        n4 = n3 & 4;
        String string7 = n4 != 0 ? null : string2;
        n4 = n3 & 8;
        String string8 = n4 != 0 ? null : string3;
        n4 = n3 & 0x10;
        String string9 = n4 != 0 ? null : string4;
        n4 = n3 & 0x20;
        String string10 = n4 != 0 ? null : string5;
        this(arrayList4, arrayList5, string7, string8, string9, string10, bl2, string6);
    }

    public final int describeContents() {
        return 0;
    }

    public final List getAllLinks() {
        ArrayList arrayList = new ArrayList();
        Collection collection = this.childDetails;
        if (collection != null) {
            Intrinsics.checkNotNull(collection);
            collection = collection;
            arrayList.addAll(collection);
        }
        if ((collection = this.linkDetails) != null) {
            Intrinsics.checkNotNull(collection);
            collection = collection;
            arrayList.addAll(collection);
        }
        return arrayList;
    }

    public final List getChildDetails() {
        return this.childDetails;
    }

    public final String getImageUrl2() {
        return this.imageUrl2;
    }

    public final String getLink() {
        return this.link;
    }

    public final List getLinkDetails() {
        return this.linkDetails;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNewFlag() {
        return this.newFlag;
    }

    public final String getParentName() {
        return this.parentName;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getTag() {
        CharSequence charSequence = new StringBuilder();
        String string2 = this.getThisName();
        String string3 = "";
        if (string2 == null) {
            charSequence.append(string3);
        } else {
            string2 = this.getThisName();
            charSequence.append(string2);
        }
        string2 = this.getThisParentName();
        if (string2 == null) {
            charSequence.append(string3);
        } else {
            string2 = this.getThisParentName();
            charSequence.append(string2);
        }
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "toString(...)");
        return charSequence;
    }

    public String getThisName() {
        return this.name;
    }

    public String getThisParentName() {
        return this.parentName;
    }

    public boolean isLeafNode() {
        return false;
    }

    public final void setChildDetails(List list) {
        this.childDetails = list;
    }

    public final void setImageUrl2(String string2) {
        this.imageUrl2 = string2;
    }

    public final void setLink(String string2) {
        this.link = string2;
    }

    public final void setLinkDetails(List list) {
        this.linkDetails = list;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setNewFlag(Boolean bl2) {
        this.newFlag = bl2;
    }

    public final void setParentName(String string2) {
        this.parentName = string2;
    }

    public final void setPicture(String string2) {
        this.picture = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable parcelable;
        boolean bl2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.childDetails;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                parcelable = (Navigation)object.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        object = this.linkDetails;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                parcelable = (LinkDetail)object.next();
                parcelable.writeToParcel(parcel, n3);
            }
        }
        Object object2 = this.link;
        parcel.writeString((String)object2);
        object2 = this.name;
        parcel.writeString((String)object2);
        object2 = this.parentName;
        parcel.writeString((String)object2);
        object2 = this.imageUrl2;
        parcel.writeString((String)object2);
        object2 = this.newFlag;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object2);
        }
        object2 = this.picture;
        parcel.writeString((String)object2);
    }
}

