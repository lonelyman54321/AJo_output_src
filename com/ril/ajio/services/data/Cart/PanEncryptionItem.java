/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.PanEncryptionItem$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PanEncryptionItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String encryptionKey;
    private Boolean isPanEnabled;
    private String keyVersion;

    static {
        PanEncryptionItem$Creator panEncryptionItem$Creator = new PanEncryptionItem$Creator();
        CREATOR = panEncryptionItem$Creator;
    }

    public PanEncryptionItem() {
        this(null, null, null, 7, null);
    }

    public PanEncryptionItem(String string2, String string3, Boolean bl2) {
        this.keyVersion = string2;
        this.encryptionKey = string3;
        this.isPanEnabled = bl2;
    }

    public /* synthetic */ PanEncryptionItem(String string2, String string3, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = null;
        }
        this(string2, string3, bl2);
    }

    public static /* synthetic */ PanEncryptionItem copy$default(PanEncryptionItem panEncryptionItem, String string2, String string3, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = panEncryptionItem.keyVersion;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = panEncryptionItem.encryptionKey;
        }
        if ((n3 &= 4) != 0) {
            bl2 = panEncryptionItem.isPanEnabled;
        }
        return panEncryptionItem.copy(string2, string3, bl2);
    }

    public final String component1() {
        return this.keyVersion;
    }

    public final String component2() {
        return this.encryptionKey;
    }

    public final Boolean component3() {
        return this.isPanEnabled;
    }

    public final PanEncryptionItem copy(String string2, String string3, Boolean bl2) {
        PanEncryptionItem panEncryptionItem = new PanEncryptionItem(string2, string3, bl2);
        return panEncryptionItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PanEncryptionItem;
        if (!bl3) {
            return false;
        }
        object = (PanEncryptionItem)object;
        Object object2 = this.keyVersion;
        String string2 = ((PanEncryptionItem)object).keyVersion;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.encryptionKey;
        string2 = ((PanEncryptionItem)object).encryptionKey;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.isPanEnabled;
        object = ((PanEncryptionItem)object).isPanEnabled;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getEncryptionKey() {
        return this.encryptionKey;
    }

    public final String getKeyVersion() {
        return this.keyVersion;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.keyVersion;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.encryptionKey;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isPanEnabled;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isPanEnabled() {
        return this.isPanEnabled;
    }

    public final void setEncryptionKey(String string2) {
        this.encryptionKey = string2;
    }

    public final void setKeyVersion(String string2) {
        this.keyVersion = string2;
    }

    public final void setPanEnabled(Boolean bl2) {
        this.isPanEnabled = bl2;
    }

    public String toString() {
        String string2 = this.keyVersion;
        String string3 = this.encryptionKey;
        Boolean bl2 = this.isPanEnabled;
        return nx3_0.a(og_1.a("PanEncryptionItem(keyVersion=", string2, ", encryptionKey=", string3, ", isPanEnabled="), bl2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.keyVersion;
        parcel.writeString((String)object);
        object = this.encryptionKey;
        parcel.writeString((String)object);
        object = this.isPanEnabled;
        if (object == null) {
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

