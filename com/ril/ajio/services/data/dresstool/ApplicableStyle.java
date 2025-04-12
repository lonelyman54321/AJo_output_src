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
import com.ril.ajio.services.data.dresstool.ApplicableStyle$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ApplicableStyle
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String applicable_style_desc;
    private final String applicable_style_image_url;
    private final String applicable_style_name;
    private final boolean isSelected;
    private final String saas_redirection_params;

    static {
        ApplicableStyle$Creator applicableStyle$Creator = new ApplicableStyle$Creator();
        CREATOR = applicableStyle$Creator;
    }

    public ApplicableStyle() {
        this(null, null, null, null, false, 31, null);
    }

    public ApplicableStyle(String string2, String string3, String string4, String string5, boolean bl2) {
        this.applicable_style_name = string2;
        this.applicable_style_image_url = string3;
        this.applicable_style_desc = string4;
        this.saas_redirection_params = string5;
        this.isSelected = bl2;
    }

    public /* synthetic */ ApplicableStyle(String object, String object2, String string2, String string3, boolean bl2, int n3, DefaultConstructorMarker object3) {
        int n4 = n3 & 1;
        String string4 = null;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        if (n7 == 0) {
            string4 = string3;
        }
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = false;
            n3 = 0;
        } else {
            n3 = (int)(bl2 ? 1 : 0);
        }
        object = this;
        object2 = object3;
        string2 = object4;
        string3 = string5;
        this((String)object3, (String)object4, string5, string4, n3 != 0);
    }

    public static /* synthetic */ ApplicableStyle copy$default(ApplicableStyle applicableStyle, String string2, String object, String string3, String object2, boolean bl2, int n3, Object object3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = applicableStyle.applicable_style_name;
        }
        if ((n4 = n3 & 2) != 0) {
            object = applicableStyle.applicable_style_image_url;
        }
        object3 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = applicableStyle.applicable_style_desc;
        }
        String string4 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = applicableStyle.saas_redirection_params;
        }
        String string5 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = applicableStyle.isSelected;
        }
        object = applicableStyle;
        string3 = string2;
        object2 = object3;
        n4 = (int)(bl2 ? 1 : 0);
        return applicableStyle.copy(string2, (String)object3, string4, string5, bl2);
    }

    public final String component1() {
        return this.applicable_style_name;
    }

    public final String component2() {
        return this.applicable_style_image_url;
    }

    public final String component3() {
        return this.applicable_style_desc;
    }

    public final String component4() {
        return this.saas_redirection_params;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final ApplicableStyle copy(String string2, String string3, String string4, String string5, boolean bl2) {
        ApplicableStyle applicableStyle = new ApplicableStyle(string2, string3, string4, string5, bl2);
        return applicableStyle;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApplicableStyle;
        if (!bl3) {
            return false;
        }
        object = (ApplicableStyle)object;
        String string2 = this.applicable_style_name;
        String string3 = ((ApplicableStyle)object).applicable_style_name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.applicable_style_image_url;
        string3 = ((ApplicableStyle)object).applicable_style_image_url;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.applicable_style_desc;
        string3 = ((ApplicableStyle)object).applicable_style_desc;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.saas_redirection_params;
        string3 = ((ApplicableStyle)object).saas_redirection_params;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.isSelected;
        boolean bl4 = ((ApplicableStyle)object).isSelected;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getApplicable_style_desc() {
        return this.applicable_style_desc;
    }

    public final String getApplicable_style_image_url() {
        return this.applicable_style_image_url;
    }

    public final String getApplicable_style_name() {
        return this.applicable_style_name;
    }

    public final String getSaas_redirection_params() {
        return this.saas_redirection_params;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.applicable_style_name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.applicable_style_image_url;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.applicable_style_desc;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.saas_redirection_params;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.isSelected ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        return n4 + n7;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        CharSequence charSequence = this.applicable_style_name;
        String string2 = this.applicable_style_image_url;
        String string3 = this.applicable_style_desc;
        String string4 = this.saas_redirection_params;
        boolean bl2 = this.isSelected;
        charSequence = og_1.a("ApplicableStyle(applicable_style_name=", charSequence, ", applicable_style_image_url=", string2, ", applicable_style_desc=");
        X50.a((StringBuilder)charSequence, string3, ", saas_redirection_params=", string4, ", isSelected=");
        return Vm.a(")", bl2, (StringBuilder)charSequence);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.applicable_style_name;
        parcel.writeString(string2);
        string2 = this.applicable_style_image_url;
        parcel.writeString(string2);
        string2 = this.applicable_style_desc;
        parcel.writeString(string2);
        string2 = this.saas_redirection_params;
        parcel.writeString(string2);
        n3 = (int)(this.isSelected ? 1 : 0);
        parcel.writeInt(n3);
    }
}

