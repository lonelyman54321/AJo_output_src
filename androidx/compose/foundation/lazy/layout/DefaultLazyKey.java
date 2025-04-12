/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey$a;

final class DefaultLazyKey
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;

    static {
        DefaultLazyKey$a defaultLazyKey$a = new Object();
        CREATOR = defaultLazyKey$a;
    }

    public DefaultLazyKey(int n3) {
        this.a = n3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof DefaultLazyKey;
        if (n3 == 0) {
            return false;
        }
        object = (DefaultLazyKey)object;
        n3 = this.a;
        int n4 = ((DefaultLazyKey)object).a;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DefaultLazyKey(index=");
        int n3 = this.a;
        return tu.a(stringBuilder, n3, ')');
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.a;
        parcel.writeInt(n3);
    }
}

