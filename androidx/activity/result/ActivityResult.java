/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult$a;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResult
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Intent b;

    static {
        ActivityResult$a activityResult$a = new Object();
        CREATOR = activityResult$a;
    }

    public ActivityResult(int n3, Intent intent) {
        this.a = n3;
        this.b = intent;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String string2 = "ActivityResult{resultCode=";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n3 = this.a;
        int n4 = -1;
        string2 = n3 != n4 ? (n3 != 0 ? String.valueOf(n3) : "RESULT_CANCELED") : "RESULT_OK";
        stringBuilder.append(string2);
        stringBuilder.append(", data=");
        string2 = this.b;
        stringBuilder.append((Object)string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n4 = this.a;
        parcel.writeInt(n4);
        Intent intent = this.b;
        int n7 = intent == null ? 0 : 1;
        parcel.writeInt(n7);
        if (intent != null) {
            intent.writeToParcel(parcel, n3);
        }
    }
}

