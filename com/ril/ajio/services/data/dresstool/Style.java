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
import com.ril.ajio.services.data.dresstool.Style$Creator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Style
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final List applicable_styles;
    private final String style_img_url;
    private final String style_name;

    static {
        Style$Creator style$Creator = new Style$Creator();
        CREATOR = style$Creator;
    }

    public Style() {
        this(null, null, null, 7, null);
    }

    public Style(String string2, String string3, List list) {
        this.style_name = string2;
        this.style_img_url = string3;
        this.applicable_styles = list;
    }

    public /* synthetic */ Style(String string2, String string3, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            list = null;
        }
        this(string2, string3, list);
    }

    public static /* synthetic */ Style copy$default(Style style2, String string2, String string3, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = style2.style_name;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = style2.style_img_url;
        }
        if ((n3 &= 4) != 0) {
            list = style2.applicable_styles;
        }
        return style2.copy(string2, string3, list);
    }

    public final String component1() {
        return this.style_name;
    }

    public final String component2() {
        return this.style_img_url;
    }

    public final List component3() {
        return this.applicable_styles;
    }

    public final Style copy(String string2, String string3, List list) {
        Style style2 = new Style(string2, string3, list);
        return style2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Style;
        if (!bl3) {
            return false;
        }
        object = (Style)object;
        Object object2 = this.style_name;
        String string2 = ((Style)object).style_name;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.style_img_url;
        string2 = ((Style)object).style_img_url;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.applicable_styles;
        object = ((Style)object).applicable_styles;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getApplicable_styles() {
        return this.applicable_styles;
    }

    public final String getStyle_img_url() {
        return this.style_img_url;
    }

    public final String getStyle_name() {
        return this.style_name;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.style_name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.style_img_url;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.applicable_styles;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.style_name;
        String string2 = this.style_img_url;
        List list = this.applicable_styles;
        charSequence = og_1.a("Style(style_name=", (String)charSequence, ", style_img_url=", string2, ", applicable_styles=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.style_name;
        parcel.writeString((String)object);
        object = this.style_img_url;
        parcel.writeString((String)object);
        object = this.applicable_styles;
        parcel.writeStringList((List)object);
    }
}

