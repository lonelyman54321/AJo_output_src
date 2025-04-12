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
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.RequestParams;
import com.google.android.gms.fido.u2f.api.common.zzh;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RegisterRequestParams
extends RequestParams {
    public static final Parcelable.Creator CREATOR;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;
    private final Integer zza;
    private final Double zzb;
    private final Uri zzc;
    private final List zzd;
    private final List zze;
    private final ChannelIdValue zzf;
    private final String zzg;
    private Set zzh;

    static {
        zzh zzh2 = new zzh();
        CREATOR = zzh2;
    }

    public RegisterRequestParams(Integer n3, Double d2, Uri uri, List iterator, List object, ChannelIdValue hashSet, String string2) {
        int n4;
        int n7;
        boolean bl2;
        Object object2;
        boolean bl3;
        this.zza = n3;
        this.zzb = d2;
        this.zzc = uri;
        boolean bl4 = false;
        n3 = null;
        if (iterator != null && !(bl3 = iterator.isEmpty())) {
            bl3 = true;
        } else {
            bl3 = false;
            object2 = null;
        }
        String string3 = "empty list of register requests is provided";
        Preconditions.checkArgument(bl3, string3);
        this.zzd = iterator;
        this.zze = object;
        this.zzf = hashSet;
        hashSet = new HashSet<Uri>();
        if (uri != null) {
            hashSet.add(uri);
        }
        iterator = iterator.iterator();
        while (bl3 = iterator.hasNext()) {
            boolean bl5;
            object2 = (RegisterRequest)iterator.next();
            if (uri != null || (string3 = ((RegisterRequest)object2).getAppId()) != null) {
                bl5 = true;
            } else {
                bl5 = false;
                string3 = null;
            }
            String string4 = "register request has null appId and no request appId is provided";
            Preconditions.checkArgument(bl5, string4);
            string3 = ((RegisterRequest)object2).getAppId();
            if (string3 == null) continue;
            object2 = Uri.parse((String)((RegisterRequest)object2).getAppId());
            hashSet.add((Uri)object2);
        }
        iterator = object.iterator();
        while (bl2 = iterator.hasNext()) {
            object = (RegisteredKey)iterator.next();
            if (uri != null || (object2 = ((RegisteredKey)object).getAppId()) != null) {
                bl3 = true;
            } else {
                bl3 = false;
                object2 = null;
            }
            string3 = "registered key has null appId and no request appId is provided";
            Preconditions.checkArgument(bl3, string3);
            object2 = ((RegisteredKey)object).getAppId();
            if (object2 == null) continue;
            object = Uri.parse((String)((RegisteredKey)object).getAppId());
            hashSet.add((Uri)object);
        }
        this.zzh = hashSet;
        if (string2 == null || (n7 = string2.length()) <= (n4 = 80)) {
            bl4 = true;
        }
        Preconditions.checkArgument(bl4, "Display Hint cannot be longer than 80 characters");
        this.zzg = string2;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof RegisterRequestParams;
        if (!bl4) {
            return false;
        }
        object = (RegisterRequestParams)object;
        Object object2 = this.zza;
        Object object3 = ((RegisterRequestParams)object).zza;
        bl4 = Objects.equal(object2, object3);
        if (bl4 && (bl4 = Objects.equal(object2 = this.zzb, object3 = ((RegisterRequestParams)object).zzb)) && (bl4 = Objects.equal(object2 = this.zzc, object3 = ((RegisterRequestParams)object).zzc)) && (bl4 = Objects.equal(object2 = this.zzd, object3 = ((RegisterRequestParams)object).zzd)) && ((object2 = this.zze) == null && (object3 = ((RegisterRequestParams)object).zze) == null || object2 != null && (object3 = ((RegisterRequestParams)object).zze) != null && (bl4 = object2.containsAll((Collection<?>)object3)) && (bl4 = (object2 = ((RegisterRequestParams)object).zze).containsAll((Collection<?>)(object3 = this.zze)))) && (bl4 = Objects.equal(object2 = this.zzf, object3 = ((RegisterRequestParams)object).zzf)) && (bl2 = Objects.equal(object2 = this.zzg, object = ((RegisterRequestParams)object).zzg))) {
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

    public String getDisplayHint() {
        return this.zzg;
    }

    public List getRegisterRequests() {
        return this.zzd;
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
        List list = this.zzd;
        List list2 = this.zze;
        ChannelIdValue channelIdValue = this.zzf;
        String string2 = this.zzg;
        Object[] objectArray = new Object[]{n3, uri, d2, list, list2, channelIdValue, string2};
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
        object2 = this.getRegisterRequests();
        SafeParcelWriter.writeTypedList(parcel, 5, (List)object2, false);
        object2 = this.getRegisteredKeys();
        SafeParcelWriter.writeTypedList(parcel, 6, (List)object2, false);
        object2 = this.getChannelIdValue();
        SafeParcelWriter.writeParcelable(parcel, 7, (Parcelable)object2, n3, false);
        object = this.getDisplayHint();
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

