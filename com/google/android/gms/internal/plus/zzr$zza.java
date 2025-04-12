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
import com.google.android.gms.plus.model.people.Person$AgeRange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zza
extends FastSafeParcelableJsonResponse
implements Person$AgeRange {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private int zzbn;
    private int zzbo;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "max";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forInteger(string2, 2);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "min";
        fastJsonResponse$Field = FastJsonResponse$Field.forInteger(string2, 3);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzr$zza() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zza(Set set, int n3, int n4, int n7) {
        this.zzap = set;
        this.zzw = n3;
        this.zzbn = n4;
        this.zzbo = n7;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zza;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zza)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zza)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zza)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zza)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
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
        if (n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 == n3) {
                return this.zzbo;
            }
            int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
            object = tk3_2.a(38, n7, "Unknown safe parcelable id=");
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        return this.zzbn;
    }

    public final int getMax() {
        return this.zzbn;
    }

    public final int getMin() {
        return this.zzbo;
    }

    public final boolean hasMax() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasMin() {
        Set set = this.zzap;
        Integer n3 = 3;
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

    /*
     * Enabled aggressive block sorting
     */
    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 != (n4 = 2)) {
            n4 = 3;
            if (n7 != n4) {
                object = oe2_0.a(52, n7, "Field with id=", " is not known to be an int.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzbo = n3;
        } else {
            this.zzbn = n3;
        }
        object2 = this.zzap;
        object = n7;
        object2.add(object);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        int n7 = 1;
        Integer n8 = n7;
        int n10 = set.contains(n8);
        if (n10 != 0) {
            n10 = this.zzw;
            SafeParcelWriter.writeInt(parcel, n7, n10);
        }
        if ((n10 = (int)(set.contains(n8 = Integer.valueOf(n7 = 2)) ? 1 : 0)) != 0) {
            n10 = this.zzbn;
            SafeParcelWriter.writeInt(parcel, n7, n10);
        }
        if ((n4 = set.contains(n8 = Integer.valueOf(n7 = 3))) != 0) {
            n4 = this.zzbo;
            SafeParcelWriter.writeInt(parcel, n7, n4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

