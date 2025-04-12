/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person$Image;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zzc
extends FastSafeParcelableJsonResponse
implements Person$Image {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private String zzk;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "url";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 2);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzr$zzc() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zzc(String object) {
        HashSet<Object> hashSet;
        this.zzap = hashSet = new HashSet<Object>();
        this.zzw = 1;
        this.zzk = object;
        object = 2;
        hashSet.add(object);
    }

    public zzr$zzc(Set set, int n3, String string2) {
        this.zzap = set;
        this.zzw = n3;
        this.zzk = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zzc;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zzc)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zzc)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zzc)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zzc)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzao;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 2)) {
            return this.zzk;
        }
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        object = tk3_2.a(38, n7, "Unknown safe parcelable id=");
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final String getUrl() {
        return this.zzk;
    }

    public final boolean hasUrl() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final int hashCode() {
        boolean bl2;
        Iterator iterator = zzao.values().iterator();
        int n3 = 0;
        Object object = null;
        while (bl2 = iterator.hasNext()) {
            FastJsonResponse$Field fastJsonResponse$Field = (FastJsonResponse$Field)iterator.next();
            int n4 = this.isFieldSet(fastJsonResponse$Field);
            if (n4 == 0) continue;
            n4 = fastJsonResponse$Field.getSafeParcelableFieldId() + n3;
            object = this.getFieldValue(fastJsonResponse$Field);
            n3 = object.hashCode() + n4;
        }
        return n3;
    }

    public final boolean isDataValid() {
        return true;
    }

    public final boolean isFieldSet(FastJsonResponse$Field object) {
        Set set = this.zzap;
        object = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        return set.contains(object);
    }

    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 2)) {
            this.zzk = string2;
            object2 = this.zzap;
            object = n4;
            object2.add(object);
            return;
        }
        object = oe2_0.a(54, n4, "Field with id=", " is not known to be a String.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Integer n4;
        boolean bl2;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Object object = this.zzap;
        boolean bl3 = true;
        Integer n7 = (int)(bl3 ? 1 : 0);
        int n8 = object.contains(n7);
        if (n8 != 0) {
            n8 = this.zzw;
            SafeParcelWriter.writeInt(parcel, (int)(bl3 ? 1 : 0), n8);
        }
        if (bl2 = object.contains(n4 = Integer.valueOf(n8 = 2))) {
            object = this.zzk;
            SafeParcelWriter.writeString(parcel, n8, (String)object, bl3);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

