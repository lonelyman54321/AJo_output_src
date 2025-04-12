/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest$a;
import kotlin.jvm.internal.Intrinsics;

public final class IntentSenderRequest
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    static {
        IntentSenderRequest$a intentSenderRequest$a = new Object();
        CREATOR = intentSenderRequest$a;
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int n3, int n4) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.a = intentSender;
        this.b = intent;
        this.c = n3;
        this.d = n4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        IntentSender intentSender = this.a;
        parcel.writeParcelable((Parcelable)intentSender, n3);
        intentSender = this.b;
        parcel.writeParcelable((Parcelable)intentSender, n3);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.d;
        parcel.writeInt(n3);
    }
}

