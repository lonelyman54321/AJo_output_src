/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.dresstool;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import com.ril.ajio.services.data.dresstool.ResultModel$Creator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ResultModel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String ctaFindMatching;
    private final String ctaRetake;
    private final List recommendedStyles;
    private final String title;

    static {
        ResultModel$Creator resultModel$Creator = new ResultModel$Creator();
        CREATOR = resultModel$Creator;
    }

    public ResultModel(String string2, String string3, String string4, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "ctaRetake");
        Intrinsics.checkNotNullParameter(string4, "ctaFindMatching");
        Intrinsics.checkNotNullParameter(list, "recommendedStyles");
        this.title = string2;
        this.ctaRetake = string3;
        this.ctaFindMatching = string4;
        this.recommendedStyles = list;
    }

    public static /* synthetic */ ResultModel copy$default(ResultModel resultModel, String string2, String string3, String string4, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = resultModel.title;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = resultModel.ctaRetake;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = resultModel.ctaFindMatching;
        }
        if ((n3 &= 8) != 0) {
            list = resultModel.recommendedStyles;
        }
        return resultModel.copy(string2, string3, string4, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.ctaRetake;
    }

    public final String component3() {
        return this.ctaFindMatching;
    }

    public final List component4() {
        return this.recommendedStyles;
    }

    public final ResultModel copy(String string2, String string3, String string4, List list) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "ctaRetake");
        Intrinsics.checkNotNullParameter(string4, "ctaFindMatching");
        Intrinsics.checkNotNullParameter(list, "recommendedStyles");
        ResultModel resultModel = new ResultModel(string2, string3, string4, list);
        return resultModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ResultModel;
        if (!bl3) {
            return false;
        }
        object = (ResultModel)object;
        Object object2 = this.title;
        String string2 = ((ResultModel)object).title;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaRetake;
        string2 = ((ResultModel)object).ctaRetake;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.ctaFindMatching;
        string2 = ((ResultModel)object).ctaFindMatching;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.recommendedStyles;
        object = ((ResultModel)object).recommendedStyles;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCtaFindMatching() {
        return this.ctaFindMatching;
    }

    public final String getCtaRetake() {
        return this.ctaRetake;
    }

    public final List getRecommendedStyles() {
        return this.recommendedStyles;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3 = this.title.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.ctaRetake;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.ctaFindMatching;
        n3 = zy_2.b(n3, n4, string2);
        return ((Object)this.recommendedStyles).hashCode() + n3;
    }

    public String toString() {
        CharSequence charSequence = this.title;
        String string2 = this.ctaRetake;
        String string3 = this.ctaFindMatching;
        List list = this.recommendedStyles;
        charSequence = og_1.a("ResultModel(title=", (String)charSequence, ", ctaRetake=", string2, ", ctaFindMatching=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", recommendedStyles=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.title;
        parcel.writeString((String)((Object)iterator));
        iterator = this.ctaRetake;
        parcel.writeString((String)((Object)iterator));
        iterator = this.ctaFindMatching;
        parcel.writeString((String)((Object)iterator));
        iterator = this.recommendedStyles;
        int n4 = iterator.size();
        parcel.writeInt(n4);
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            ApplicableStyle applicableStyle = (ApplicableStyle)iterator.next();
            applicableStyle.writeToParcel(parcel, n3);
        }
    }
}

