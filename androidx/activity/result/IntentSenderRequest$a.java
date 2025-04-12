/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.Intrinsics;

public final class IntentSenderRequest$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "inParcel");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ClassLoader classLoader = IntentSender.class.getClassLoader();
        classLoader = parcel.readParcelable(classLoader);
        Intrinsics.checkNotNull(classLoader);
        classLoader = (IntentSender)classLoader;
        ClassLoader classLoader2 = Intent.class.getClassLoader();
        classLoader2 = (Intent)parcel.readParcelable(classLoader2);
        int n3 = parcel.readInt();
        int n4 = parcel.readInt();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest((IntentSender)classLoader, (Intent)classLoader2, n3, n4);
        return intentSenderRequest;
    }

    public final Object[] newArray(int n3) {
        return new IntentSenderRequest[n3];
    }
}

