/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.zzk;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SignRequestParams
extends RequestParams {
    public static final Parcelable.Creator CREATOR;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final Uri zzc;
    private final byte[] zzd;
    private final List zze;
    private final ChannelIdValue zzf;
    private final String zzg;
    private final Set zzh;

    static {
        zzk zzk2 = new zzk();
        CREATOR = zzk2;
    }

    public SignRequestParams(Integer n3, Double d2, Uri uri, byte[] object, List object2, ChannelIdValue abstractSafeParcelable, String string2) {
        int n4;
        boolean bl2;
        int n7;
        this.zza = n3;
        this.zzb = d2;
        this.zzc = uri;
        this.zzd = object;
        boolean bl3 = false;
        n3 = null;
        boolean bl4 = true;
        if (object2 != null && (n7 = object2.isEmpty()) == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        String string3 = "registeredKeys must not be null or empty";
        Preconditions.checkArgument(n7 != 0, string3);
        this.zze = object2;
        this.zzf = abstractSafeParcelable;
        object = new HashSet;
        if (uri != null) {
            ((HashSet)object).add(uri);
        }
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            boolean bl5;
            abstractSafeParcelable = (RegisteredKey)object2.next();
            string3 = ((RegisteredKey)abstractSafeParcelable).getAppId();
            if (string3 != null || uri != null) {
                bl5 = true;
            } else {
                bl5 = false;
                string3 = null;
            }
            String string4 = "registered key has null appId and no request appId is provided";
            Preconditions.checkArgument(bl5, string4);
            ((RegisteredKey)abstractSafeParcelable).getChallengeValue();
            Preconditions.checkArgument(bl4, "register request has null challenge and no default challenge isprovided");
            string3 = ((RegisteredKey)abstractSafeParcelable).getAppId();
            if (string3 == null) continue;
            abstractSafeParcelable = Uri.parse((String)((RegisteredKey)abstractSafeParcelable).getAppId());
            ((HashSet)object).add(abstractSafeParcelable);
        }
        this.zzh = object;
        if (string2 == null || (n4 = string2.length()) <= (n7 = 80)) {
            bl3 = true;
        }
        Preconditions.checkArgument(bl3, "Display Hint cannot be longer than 80 characters");
        this.zzg = string2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof SignRequestParams;
        if (!bl4) {
            return false;
        }
        object = (SignRequestParams)object;
        Object object2 = this.zza;
        Object object3 = ((SignRequestParams)object).zza;
        bl4 = Objects.equal(object2, object3);
        if (bl4 && (bl4 = Objects.equal(object2 = this.zzb, object3 = ((SignRequestParams)object).zzb)) && (bl4 = Objects.equal(object2 = this.zzc, object3 = ((SignRequestParams)object).zzc)) && (bl4 = Arrays.equals((byte[])(object2 = (Object)this.zzd), (byte[])(object3 = (Object)((SignRequestParams)object).zzd))) && (bl4 = (object2 = this.zze).containsAll((Collection<?>)(object3 = ((SignRequestParams)object).zze))) && (bl4 = (object2 = ((SignRequestParams)object).zze).containsAll((Collection<?>)(object3 = this.zze))) && (bl4 = Objects.equal(object2 = this.zzf, object3 = ((SignRequestParams)object).zzf)) && (bl2 = Objects.equal(object2 = this.zzg, object = ((SignRequestParams)object).zzg))) {
            return bl3;
        }
        return false;
    }

    public Set getAllAppIds() {
        return this.zzh;
    }

    public Uri getAppId() {
        return this.zzc;
    }

    public ChannelIdValue getChannelIdValue() {
        return this.zzf;
    }

    public byte[] getDefaultSignChallenge() {
        return this.zzd;
    }

    public String getDisplayHint() {
        return this.zzg;
    }

    public List getRegisteredKeys() {
        return this.zze;
    }

    public Integer getRequestId() {
        return this.zza;
    }

    public Double getTimeoutSeconds() {
        return this.zzb;
    }

    public int hashCode() {
        Integer n3 = this.zza;
        Uri uri = this.zzc;
        Double d2 = this.zzb;
        List list = this.zze;
        ChannelIdValue channelIdValue = this.zzf;
        String string2 = this.zzg;
        Integer n4 = Arrays.hashCode(this.zzd);
        Object[] objectArray = new Object[]{n3, uri, d2, list, channelIdValue, string2, n4};
        return Objects.hashCode(objectArray);
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.getRequestId();
        SafeParcelWriter.writeIntegerObject(parcel, 2, (Integer)object, false);
        Object object2 = this.getTimeoutSeconds();
        SafeParcelWriter.writeDoubleObject(parcel, 3, (Double)object2, false);
        object2 = this.getAppId();
        SafeParcelWriter.writeParcelable(parcel, 4, (Parcelable)object2, n3, false);
        object2 = this.getDefaultSignChallenge();
        SafeParcelWriter.writeByteArray(parcel, 5, (byte[])object2, false);
        object2 = this.getRegisteredKeys();
        SafeParcelWriter.writeTypedList(parcel, 6, (List)object2, false);
        object2 = this.getChannelIdValue();
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object2, n3, false);
        object = this.getDisplayHint();
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

