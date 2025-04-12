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
import com.ril.ajio.services.data.dresstool.DressToolModel$Creator;
import com.ril.ajio.services.data.dresstool.NoResult;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DressToolModel
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Map applicable_styles_mapping;
    private final NoResult no_result_screen;
    private final String plp_redirection_url;
    private final List questions;
    private final String result_find_matching_cta_text;
    private final String result_finding_title;
    private final String result_found_title;
    private final String result_retake_cta_text;

    static {
        DressToolModel$Creator dressToolModel$Creator = new DressToolModel$Creator();
        CREATOR = dressToolModel$Creator;
    }

    public DressToolModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public DressToolModel(String string2, String string3, String string4, String string5, String string6, NoResult noResult, List list, Map map2) {
        this.result_finding_title = string2;
        this.result_found_title = string3;
        this.plp_redirection_url = string4;
        this.result_retake_cta_text = string5;
        this.result_find_matching_cta_text = string6;
        this.no_result_screen = noResult;
        this.questions = list;
        this.applicable_styles_mapping = map2;
    }

    public /* synthetic */ DressToolModel(String object, String string2, String string3, String string4, String string5, NoResult object2, List object3, Map object4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        List list;
        NoResult noResult;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        int n4 = n3;
        int n7 = n3 & 1;
        Map map2 = null;
        if (n7 != 0) {
            n7 = 0;
            string10 = null;
        } else {
            string10 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string9 = null;
        } else {
            string9 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string8 = null;
        } else {
            string8 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string6 = null;
        } else {
            string6 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            noResult = null;
        } else {
            noResult = object2;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            list = null;
        } else {
            list = object3;
        }
        if ((n4 &= 0x80) == 0) {
            map2 = object4;
        }
        object = this;
        string2 = string10;
        string3 = string9;
        string4 = string8;
        string5 = string7;
        object2 = string6;
        object3 = noResult;
        object4 = list;
        this(string10, string9, string8, string7, string6, noResult, list, map2);
    }

    public static /* synthetic */ DressToolModel copy$default(DressToolModel dressToolModel, String string2, String string3, String string4, String string5, String string6, NoResult noResult, List list, Map map2, int n3, Object object) {
        DressToolModel dressToolModel2 = dressToolModel;
        int n4 = n3;
        int n7 = n3 & 1;
        String string7 = n7 != 0 ? dressToolModel.result_finding_title : string2;
        int n8 = n4 & 2;
        String string8 = n8 != 0 ? dressToolModel2.result_found_title : string3;
        int n10 = n4 & 4;
        String string9 = n10 != 0 ? dressToolModel2.plp_redirection_url : string4;
        int n14 = n4 & 8;
        String string10 = n14 != 0 ? dressToolModel2.result_retake_cta_text : string5;
        int n15 = n4 & 0x10;
        String string11 = n15 != 0 ? dressToolModel2.result_find_matching_cta_text : string6;
        int n16 = n4 & 0x20;
        NoResult noResult2 = n16 != 0 ? dressToolModel2.no_result_screen : noResult;
        int n17 = n4 & 0x40;
        List list2 = n17 != 0 ? dressToolModel2.questions : list;
        Map map3 = (n4 &= 0x80) != 0 ? dressToolModel2.applicable_styles_mapping : map2;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        noResult = noResult2;
        list = list2;
        map2 = map3;
        return dressToolModel.copy(string7, string8, string9, string10, string11, noResult2, list2, map3);
    }

    public final String component1() {
        return this.result_finding_title;
    }

    public final String component2() {
        return this.result_found_title;
    }

    public final String component3() {
        return this.plp_redirection_url;
    }

    public final String component4() {
        return this.result_retake_cta_text;
    }

    public final String component5() {
        return this.result_find_matching_cta_text;
    }

    public final NoResult component6() {
        return this.no_result_screen;
    }

    public final List component7() {
        return this.questions;
    }

    public final Map component8() {
        return this.applicable_styles_mapping;
    }

    public final DressToolModel copy(String string2, String string3, String string4, String string5, String string6, NoResult noResult, List list, Map map2) {
        DressToolModel dressToolModel = new DressToolModel(string2, string3, string4, string5, string6, noResult, list, map2);
        return dressToolModel;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DressToolModel;
        if (!bl3) {
            return false;
        }
        object = (DressToolModel)object;
        Object object2 = this.result_finding_title;
        Object object3 = ((DressToolModel)object).result_finding_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.result_found_title;
        object3 = ((DressToolModel)object).result_found_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.plp_redirection_url;
        object3 = ((DressToolModel)object).plp_redirection_url;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.result_retake_cta_text;
        object3 = ((DressToolModel)object).result_retake_cta_text;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.result_find_matching_cta_text;
        object3 = ((DressToolModel)object).result_find_matching_cta_text;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.no_result_screen;
        object3 = ((DressToolModel)object).no_result_screen;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questions;
        object3 = ((DressToolModel)object).questions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.applicable_styles_mapping;
        object = ((DressToolModel)object).applicable_styles_mapping;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Map getApplicable_styles_mapping() {
        return this.applicable_styles_mapping;
    }

    public final NoResult getNo_result_screen() {
        return this.no_result_screen;
    }

    public final String getPlp_redirection_url() {
        return this.plp_redirection_url;
    }

    public final List getQuestions() {
        return this.questions;
    }

    public final String getResult_find_matching_cta_text() {
        return this.result_find_matching_cta_text;
    }

    public final String getResult_finding_title() {
        return this.result_finding_title;
    }

    public final String getResult_found_title() {
        return this.result_found_title;
    }

    public final String getResult_retake_cta_text() {
        return this.result_retake_cta_text;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.result_finding_title;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.result_found_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.plp_redirection_url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.result_retake_cta_text;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.result_find_matching_cta_text;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.no_result_screen;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((NoResult)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.questions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.applicable_styles_mapping;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.result_finding_title;
        String string2 = this.result_found_title;
        String string3 = this.plp_redirection_url;
        String string4 = this.result_retake_cta_text;
        String string5 = this.result_find_matching_cta_text;
        NoResult noResult = this.no_result_screen;
        List list = this.questions;
        Map map2 = this.applicable_styles_mapping;
        charSequence = og_1.a("DressToolModel(result_finding_title=", (String)charSequence, ", result_found_title=", string2, ", plp_redirection_url=");
        X50.a((StringBuilder)charSequence, string3, ", result_retake_cta_text=", string4, ", result_find_matching_cta_text=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", no_result_screen=");
        ((StringBuilder)charSequence).append(noResult);
        ((StringBuilder)charSequence).append(", questions=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(", applicable_styles_mapping=");
        ((StringBuilder)charSequence).append(map2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.result_finding_title;
        parcel.writeString((String)((Object)iterator));
        iterator = this.result_found_title;
        parcel.writeString((String)((Object)iterator));
        iterator = this.plp_redirection_url;
        parcel.writeString((String)((Object)iterator));
        iterator = this.result_retake_cta_text;
        parcel.writeString((String)((Object)iterator));
        iterator = this.result_find_matching_cta_text;
        parcel.writeString((String)((Object)iterator));
        iterator = this.no_result_screen;
        int n4 = 1;
        String string2 = null;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((NoResult)((Object)iterator)).writeToParcel(parcel, n3);
        }
        iterator = this.questions;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            boolean bl2;
            iterator = oz0_2.a(parcel, (List)((Object)iterator), n4);
            while (bl2 = iterator.hasNext()) {
                Question question = (Question)iterator.next();
                question.writeToParcel(parcel, n3);
            }
        }
        iterator = this.applicable_styles_mapping;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n4 = iterator.size();
            parcel.writeInt(n4);
            iterator = iterator.entrySet().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                Object object = iterator.next();
                string2 = (String)object.getKey();
                parcel.writeString(string2);
                object = (ApplicableStyle)object.getValue();
                ((ApplicableStyle)object).writeToParcel(parcel, n3);
            }
        }
    }
}

