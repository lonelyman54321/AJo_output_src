/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityResult$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, string2);
        Intrinsics.checkNotNullParameter(parcel, string2);
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        if (n4 == 0) {
            parcel = null;
        } else {
            Parcelable.Creator creator = Intent.CREATOR;
            parcel = (Intent)creator.createFromParcel(parcel);
        }
        ActivityResult activityResult = new ActivityResult(n3, (Intent)parcel);
        return activityResult;
    }

    public final Object[] newArray(int n3) {
        return new ActivityResult[n3];
    }
}

