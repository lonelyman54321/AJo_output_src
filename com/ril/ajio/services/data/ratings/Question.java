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
import com.ril.ajio.services.data.ratings.Question$Creator;
import com.ril.ajio.services.data.ratings.ResponseOption;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Question
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String category;
    private Integer questionId;
    private ArrayList responseOptions;
    private String target;
    private String title;
    private String type;

    static {
        Question$Creator question$Creator = new Question$Creator();
        CREATOR = question$Creator;
    }

    public Question() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Question(String string2, Integer n3, ArrayList arrayList, String string3, String string4, String string5) {
        this.category = string2;
        this.questionId = n3;
        this.responseOptions = arrayList;
        this.target = string3;
        this.title = string4;
        this.type = string5;
    }

    public /* synthetic */ Question(String object, Integer object2, ArrayList serializable, String object3, String string2, String string3, int n3, DefaultConstructorMarker object4) {
        String string4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        ArrayList arrayList = n7 != 0 ? null : serializable;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        object = this;
        object2 = object4;
        serializable = object5;
        object3 = arrayList;
        string2 = object6;
        string3 = string5;
        this((String)object4, (Integer)object5, arrayList, (String)object6, string5, string4);
    }

    public static /* synthetic */ Question copy$default(Question question, String string2, Integer object, ArrayList object2, String object3, String object4, String string3, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = question.category;
        }
        if ((n4 = n3 & 2) != 0) {
            object = question.questionId;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = question.responseOptions;
        }
        ArrayList arrayList = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = question.target;
        }
        String string4 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = question.title;
        }
        String string5 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = question.type;
        }
        String string6 = string3;
        object = question;
        object2 = string2;
        object3 = object5;
        object4 = arrayList;
        string3 = string4;
        object5 = string6;
        return question.copy(string2, (Integer)object3, arrayList, string4, string5, string6);
    }

    public final String component1() {
        return this.category;
    }

    public final Integer component2() {
        return this.questionId;
    }

    public final ArrayList component3() {
        return this.responseOptions;
    }

    public final String component4() {
        return this.target;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.type;
    }

    public final Question copy(String string2, Integer n3, ArrayList arrayList, String string3, String string4, String string5) {
        Question question = new Question(string2, n3, arrayList, string3, string4, string5);
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
        Object object2 = this.category;
        Object object3 = ((Question)object).category;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.questionId;
        object3 = ((Question)object).questionId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.responseOptions;
        object3 = ((Question)object).responseOptions;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.target;
        object3 = ((Question)object).target;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.title;
        object3 = ((Question)object).title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.type;
        object = ((Question)object).type;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Integer getQuestionId() {
        return this.questionId;
    }

    public final ArrayList getResponseOptions() {
        return this.responseOptions;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.category;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.questionId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.responseOptions;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.target;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.type;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCategory(String string2) {
        this.category = string2;
    }

    public final void setQuestionId(Integer n3) {
        this.questionId = n3;
    }

    public final void setResponseOptions(ArrayList arrayList) {
        this.responseOptions = arrayList;
    }

    public final void setTarget(String string2) {
        this.target = string2;
    }

    public final void setTitle(String string2) {
        this.title = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        String string2 = this.category;
        Integer n3 = this.questionId;
        ArrayList arrayList = this.responseOptions;
        String string3 = this.target;
        String string4 = this.title;
        String string5 = this.type;
        StringBuilder stringBuilder = new StringBuilder("Question(category=");
        stringBuilder.append(string2);
        stringBuilder.append(", questionId=");
        stringBuilder.append(n3);
        stringBuilder.append(", responseOptions=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", target=");
        stringBuilder.append(string3);
        stringBuilder.append(", title=");
        return ko_0.a(stringBuilder, string4, ", type=", string5, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.category;
        parcel.writeString((String)((Object)iterator));
        iterator = this.questionId;
        int n4 = 1;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            int n7 = (Integer)((Object)iterator);
            parcel.writeInt(n7);
        }
        iterator = this.responseOptions;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            int n8 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n8);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                ResponseOption responseOption = (ResponseOption)iterator.next();
                if (responseOption == null) {
                    parcel.writeInt(0);
                    continue;
                }
                parcel.writeInt(n4);
                responseOption.writeToParcel(parcel, n3);
            }
        }
        String string2 = this.target;
        parcel.writeString(string2);
        string2 = this.title;
        parcel.writeString(string2);
        string2 = this.type;
        parcel.writeString(string2);
    }
}

