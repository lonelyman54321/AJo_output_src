/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.zza;

public final class Attachment
extends Enum
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final /* enum */ Attachment CROSS_PLATFORM;
    public static final /* enum */ Attachment PLATFORM;
    private static final /* synthetic */ Attachment[] zza;
    private final String zzb;

    static {
        Attachment attachment;
        Object object;
        PLATFORM = object = new Attachment("PLATFORM", 0, "platform");
        int n3 = 1;
        CROSS_PLATFORM = attachment = new Attachment("CROSS_PLATFORM", n3, "cross-platform");
        Attachment[] attachmentArray = new Attachment[2];
        attachmentArray[0] = object;
        attachmentArray[n3] = attachment;
        zza = attachmentArray;
        object = new zza();
        CREATOR = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Attachment() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzb = var3_2;
    }

    public static Attachment fromString(String string2) {
        for (Attachment attachment : Attachment.values()) {
            String string3 = attachment.zzb;
            boolean bl2 = string2.equals(string3);
            if (!bl2) continue;
            return attachment;
        }
        Attachment$UnsupportedAttachmentException attachment$UnsupportedAttachmentException = new Attachment$UnsupportedAttachmentException(string2);
        throw attachment$UnsupportedAttachmentException;
    }

    public static Attachment valueOf(String string2) {
        return Enum.valueOf(Attachment.class, string2);
    }

    public static Attachment[] values() {
        return (Attachment[])zza.clone();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.zzb;
        parcel.writeString(string2);
    }
}

