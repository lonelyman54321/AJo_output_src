/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.ResponseOption$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ResponseOption
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Integer id;
    private String imageUrl;
    private String subText;
    private String text;

    static {
        ResponseOption$Creator responseOption$Creator = new ResponseOption$Creator();
        CREATOR = responseOption$Creator;
    }

    public ResponseOption() {
        this(null, null, null, null, 15, null);
    }

    public ResponseOption(Integer n3, String string2, String string3, String string4) {
        this.id = n3;
        this.imageUrl = string2;
        this.subText = string3;
        this.text = string4;
    }

    public /* synthetic */ ResponseOption(Integer n3, String string2, String string3, String string4, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = null;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = null;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = null;
        }
        if ((n4 &= 8) != 0) {
            string4 = null;
        }
        this(n3, string2, string3, string4);
    }

    public static /* synthetic */ ResponseOption copy$default(ResponseOption responseOption, Integer n3, String string2, String string3, String string4, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = responseOption.id;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = responseOption.imageUrl;
        }
        if ((n7 = n4 & 4) != 0) {
            string3 = responseOption.subText;
        }
        if ((n4 &= 8) != 0) {
            string4 = responseOption.text;
        }
        return responseOption.copy(n3, string2, string3, string4);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.subText;
    }

    public final String component4() {
        return this.text;
    }

    public final ResponseOption copy(Integer n3, String string2, String string3, String string4) {
        ResponseOption responseOption = new ResponseOption(n3, string2, string3, string4);
        return responseOption;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ResponseOption;
        if (!bl3) {
            return false;
        }
        object = (ResponseOption)object;
        Object object2 = this.id;
        Object object3 = ((ResponseOption)object).id;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.imageUrl;
        object3 = ((ResponseOption)object).imageUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.subText;
        object3 = ((ResponseOption)object).subText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.text;
        object = ((ResponseOption)object).text;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.id;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        String string2 = this.imageUrl;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.subText;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.text;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public final void setId(Integer n3) {
        this.id = n3;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }

    public final void setSubText(String string2) {
        this.subText = string2;
    }

    public final void setText(String string2) {
        this.text = string2;
    }

    public String toString() {
        Integer n3 = this.id;
        String string2 = this.imageUrl;
        String string3 = this.subText;
        String string4 = this.text;
        StringBuilder stringBuilder = new StringBuilder("ResponseOption(id=");
        stringBuilder.append(n3);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string2);
        stringBuilder.append(", subText=");
        return ko_0.a(stringBuilder, string3, ", text=", string4, ")");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.id;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            n3 = (Integer)object;
        }
        parcel.writeInt(n3);
        object = this.imageUrl;
        parcel.writeString((String)object);
        object = this.subText;
        parcel.writeString((String)object);
        object = this.text;
        parcel.writeString((String)object);
    }
}

