/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class VersionInfoParcel
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    static {
        zzs zzs2 = new zzs();
        CREATOR = zzs2;
    }

    public VersionInfoParcel(int n3, int n4, boolean bl2) {
        this(n3, n4, bl2, false, false);
    }

    public VersionInfoParcel(int n3, int n4, boolean bl2, boolean bl3) {
        this(n3, n4, bl2, false, bl3);
    }

    public VersionInfoParcel(int n3, int n4, boolean bl2, boolean bl3, boolean bl4) {
        String string2 = bl2 ? "0" : (bl3 ? "2" : "1");
        Object object = ".";
        StringBuilder stringBuilder = fQ2.a("afma-sdk-a-v", (String)object, (String)object, n3, n4);
        stringBuilder.append(string2);
        String string3 = stringBuilder.toString();
        object = this;
        this(string3, n3, n4, bl2, bl4);
    }

    public VersionInfoParcel(String string2, int n3, int n4, boolean bl2, boolean bl3) {
        this.afmaVersion = string2;
        this.buddyApkVersion = n3;
        this.clientJarVersion = n4;
        this.isClientJar = bl2;
        this.isLiteSdk = bl3;
    }

    public static VersionInfoParcel forPackage() {
        int n3 = 12451000;
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(n3, n3, true);
        return versionInfoParcel;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        String string2 = this.afmaVersion;
        SafeParcelWriter.writeString(parcel, 2, string2, false);
        int bl2 = this.buddyApkVersion;
        SafeParcelWriter.writeInt(parcel, 3, bl2);
        int n4 = this.clientJarVersion;
        SafeParcelWriter.writeInt(parcel, 4, n4);
        boolean bl3 = this.isClientJar;
        SafeParcelWriter.writeBoolean(parcel, 5, bl3);
        boolean bl4 = this.isLiteSdk;
        SafeParcelWriter.writeBoolean(parcel, 6, bl4);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

