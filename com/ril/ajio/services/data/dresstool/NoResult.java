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
import com.ril.ajio.services.data.dresstool.NoResult$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NoResult
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String cta_text;
    private final String subtitle;
    private final String title;

    static {
        NoResult$Creator noResult$Creator = new NoResult$Creator();
        CREATOR = noResult$Creator;
    }

    public NoResult() {
        this(null, null, null, 7, null);
    }

    public NoResult(String string2, String string3, String string4) {
        this.title = string2;
        this.subtitle = string3;
        this.cta_text = string4;
    }

    public /* synthetic */ NoResult(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ NoResult copy$default(NoResult noResult, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = noResult.title;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = noResult.subtitle;
        }
        if ((n3 &= 4) != 0) {
            string4 = noResult.cta_text;
        }
        return noResult.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.cta_text;
    }

    public final NoResult copy(String string2, String string3, String string4) {
        NoResult noResult = new NoResult(string2, string3, string4);
        return noResult;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NoResult;
        if (!bl3) {
            return false;
        }
        object = (NoResult)object;
        String string2 = this.title;
        String string3 = ((NoResult)object).title;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.subtitle;
        string3 = ((NoResult)object).subtitle;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.cta_text;
        object = ((NoResult)object).cta_text;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
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
        String string3 = this.subtitle;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.cta_text;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.title;
        String string3 = this.subtitle;
        String string4 = this.cta_text;
        return h30_0.a(og_1.a("NoResult(title=", string2, ", subtitle=", string3, ", cta_text="), string4, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.title;
        parcel.writeString(string2);
        string2 = this.subtitle;
        parcel.writeString(string2);
        string2 = this.cta_text;
        parcel.writeString(string2);
    }
}

