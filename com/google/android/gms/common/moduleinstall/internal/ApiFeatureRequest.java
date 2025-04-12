/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.common.moduleinstall.internal.zab;
import com.google.android.gms.common.moduleinstall.internal.zac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ApiFeatureRequest
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Comparator zaa;
    private final List zab;
    private final boolean zac;
    private final String zad;
    private final String zae;

    static {
        zac zac2 = new zac();
        CREATOR = zac2;
        zaa = com.google.android.gms.common.moduleinstall.internal.zab.zaa;
    }

    public ApiFeatureRequest(List list, boolean bl2, String string2, String string3) {
        Preconditions.checkNotNull(list);
        this.zab = list;
        this.zac = bl2;
        this.zad = string2;
        this.zae = string3;
    }

    public static ApiFeatureRequest fromModuleInstallRequest(ModuleInstallRequest moduleInstallRequest) {
        return ApiFeatureRequest.zaa(moduleInstallRequest.getApis(), true);
    }

    public static ApiFeatureRequest zaa(List object, boolean bl2) {
        boolean bl3;
        Feature[] featureArray = zaa;
        TreeSet treeSet = new TreeSet(featureArray);
        object = object.iterator();
        while (bl3 = object.hasNext()) {
            featureArray = ((OptionalModuleApi)object.next()).getOptionalFeatures();
            Collections.addAll(treeSet, featureArray);
        }
        featureArray = new ArrayList(treeSet);
        object = new ApiFeatureRequest((List)featureArray, bl2, null, null);
        return object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        Object object3;
        if (object == null) {
            return false;
        }
        boolean bl3 = object instanceof ApiFeatureRequest;
        if (!bl3) {
            return false;
        }
        object = (ApiFeatureRequest)object;
        bl3 = this.zac;
        boolean bl4 = ((ApiFeatureRequest)object).zac;
        return bl3 == bl4 && (bl3 = Objects.equal(object3 = this.zab, object2 = ((ApiFeatureRequest)object).zab)) && (bl3 = Objects.equal(object3 = this.zad, object2 = ((ApiFeatureRequest)object).zad)) && (bl2 = Objects.equal(object3 = this.zae, object = ((ApiFeatureRequest)object).zae));
    }

    public List getApiFeatures() {
        return this.zab;
    }

    public final int hashCode() {
        Boolean bl2 = this.zac;
        List list = this.zab;
        String string2 = this.zad;
        String string3 = this.zae;
        Object[] objectArray = new Object[]{bl2, list, string2, string3};
        return Objects.hashCode(objectArray);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        List list = this.getApiFeatures();
        SafeParcelWriter.writeTypedList(parcel, 1, list, false);
        boolean bl2 = this.zac;
        SafeParcelWriter.writeBoolean(parcel, 2, bl2);
        String string2 = this.zad;
        SafeParcelWriter.writeString(parcel, 3, string2, false);
        string2 = this.zae;
        SafeParcelWriter.writeString(parcel, 4, string2, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

