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
import com.ril.ajio.services.data.dresstool.Question$Creator;
import com.ril.ajio.services.data.dresstool.Style;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Question
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String bannerUrl;
    private final String question_type;
    private final Integer selectedStyleIndex;
    private final List styles;
    private final String sub_title;
    private final String title;
    private final String viewType;

    static {
        Question$Creator question$Creator = new Question$Creator();
        CREATOR = question$Creator;
    }

    public Question() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public Question(String string2, String string3, List list, String string4, Integer n3, String string5, String string6) {
        this.title = string2;
        this.sub_title = string3;
        this.styles = list;
        this.question_type = string4;
        this.selectedStyleIndex = n3;
        this.viewType = string5;
        this.bannerUrl = string6;
    }

    public /* synthetic */ Question(String object, String object2, List object3, String object4, Integer object5, String object6, String string2, int n3, DefaultConstructorMarker object7) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object7 = null;
        } else {
            object7 = object;
        }
        int n7 = n3 & 2;
        Object object8 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        Object object9 = n7 != 0 ? null : object3;
        n7 = n3 & 8;
        Object object10 = n7 != 0 ? null : object4;
        n7 = n3 & 0x10;
        Object object11 = n7 != 0 ? null : object5;
        n7 = n3 & 0x20;
        Object object12 = n7 != 0 ? null : object6;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = string2;
        }
        object = this;
        object2 = object7;
        object3 = object8;
        object4 = object9;
        object5 = object10;
        object6 = object11;
        string2 = object12;
        this((String)object7, (String)object8, (List)object9, (String)object10, (Integer)object11, (String)object12, string3);
    }

    public static /* synthetic */ Question copy$default(Question question, String string2, String object, List object2, String object3, Integer object4, String string3, String object5, int n3, Object object6) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = question.title;
        }
        if ((n4 = n3 & 2) != 0) {
            object = question.sub_title;
        }
        object6 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = question.styles;
        }
        List list = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = question.question_type;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = question.selectedStyleIndex;
        }
        Integer n8 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = question.viewType;
        }
        String string5 = string3;
        n7 = n3 & 0x40;
        if (n7 != 0) {
            object5 = question.bannerUrl;
        }
        String string6 = object5;
        object = question;
        object2 = string2;
        object3 = object6;
        object4 = list;
        string3 = string4;
        object5 = n8;
        object6 = string6;
        return question.copy(string2, (String)object3, list, string4, n8, string5, string6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.sub_title;
    }

    public final List component3() {
        return this.styles;
    }

    public final String component4() {
        return this.question_type;
    }

    public final Integer component5() {
        return this.selectedStyleIndex;
    }

    public final String component6() {
        return this.viewType;
    }

    public final String component7() {
        return this.bannerUrl;
    }

    public final Question copy(String string2, String string3, List list, String string4, Integer n3, String string5, String string6) {
        Question question = new Question(string2, string3, list, string4, n3, string5, string6);
        return question;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Question;
        if (!bl3) {
            return false;
        }
        object = (Question)object;
        Object object2 = this.title;
        Object object3 = ((Question)object).title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.sub_title;
        object3 = ((Question)object).sub_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.styles;
        object3 = ((Question)object).styles;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.question_type;
        object3 = ((Question)object).question_type;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.selectedStyleIndex;
        object3 = ((Question)object).selectedStyleIndex;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.viewType;
        object3 = ((Question)object).viewType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerUrl;
        object = ((Question)object).bannerUrl;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    public final String getQuestion_type() {
        return this.question_type;
    }

    public final Integer getSelectedStyleIndex() {
        return this.selectedStyleIndex;
    }

    public final List getStyles() {
        return this.styles;
    }

    public final String getSub_title() {
        return this.sub_title;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.sub_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.styles;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.question_type;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.selectedStyleIndex;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.viewType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.title;
        String string2 = this.sub_title;
        List list = this.styles;
        String string3 = this.question_type;
        Integer n3 = this.selectedStyleIndex;
        String string4 = this.viewType;
        String string5 = this.bannerUrl;
        charSequence = og_1.a("Question(title=", (String)charSequence, ", sub_title=", string2, ", styles=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", question_type=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", selectedStyleIndex=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", viewType=");
        ((StringBuilder)charSequence).append(string4);
        ((StringBuilder)charSequence).append(", bannerUrl=");
        return h30_0.a((StringBuilder)charSequence, string5, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.title;
        parcel.writeString((String)object);
        object = this.sub_title;
        parcel.writeString((String)object);
        object = this.styles;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            boolean bl2;
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                Style style2 = (Style)object.next();
                style2.writeToParcel(parcel, n3);
            }
        }
        Object object2 = this.question_type;
        parcel.writeString((String)object2);
        object2 = this.selectedStyleIndex;
        if (object2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object2;
            parcel.writeInt(n3);
        }
        object2 = this.viewType;
        parcel.writeString((String)object2);
        object2 = this.bannerUrl;
        parcel.writeString((String)object2);
    }
}

