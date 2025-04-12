/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.internal.plus.zzr$zzb$zza;
import com.google.android.gms.internal.plus.zzr$zzb$zzb;
import com.google.android.gms.plus.model.people.Person$Cover;
import com.google.android.gms.plus.model.people.Person$Cover$CoverInfo;
import com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zzb
extends FastSafeParcelableJsonResponse
implements Person$Cover {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private zzr$zzb$zza zzbp;
    private zzr$zzb$zzb zzbq;
    private int zzbr;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "coverInfo";
        AbstractSafeParcelable abstractSafeParcelable = FastJsonResponse$Field.forConcreteType(string2, 2, zzr$zzb$zza.class);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        string2 = "coverPhoto";
        abstractSafeParcelable = FastJsonResponse$Field.forConcreteType(string2, 3, zzr$zzb$zzb.class);
        hashMap.put(string2, (FastJsonResponse$Field)abstractSafeParcelable);
        abstractSafeParcelable = new StringToIntConverter();
        abstractSafeParcelable = ((StringToIntConverter)abstractSafeParcelable).add("banner", 0);
        String string3 = "layout";
        abstractSafeParcelable = FastJsonResponse$Field.withConverter(string3, 4, (FastJsonResponse$FieldConverter)((Object)abstractSafeParcelable), false);
        hashMap.put(string3, (FastJsonResponse$Field)abstractSafeParcelable);
    }

    public zzr$zzb() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zzb(Set set, int n3, zzr$zzb$zza zzr$zzb$zza, zzr$zzb$zzb zzr$zzb$zzb, int n4) {
        this.zzap = set;
        this.zzw = n3;
        this.zzbp = zzr$zzb$zza;
        this.zzbq = zzr$zzb$zzb;
        this.zzbr = n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void addConcreteTypeInternal(FastJsonResponse$Field object, String object2, FastJsonResponse object3) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 != n3) {
                object3 = object3.getClass().getCanonicalName();
                int n7 = lE2.a(62, (String)object3);
                StringBuilder stringBuilder = new StringBuilder(n7);
                stringBuilder.append("Field with id=");
                stringBuilder.append(n4);
                stringBuilder.append(" is not a known custom type.  Found ");
                stringBuilder.append((String)object3);
                stringBuilder.append(".");
                object = stringBuilder.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzbq = object3 = (zzr$zzb$zzb)object3;
        } else {
            this.zzbp = object3 = (zzr$zzb$zza)object3;
        }
        object2 = this.zzap;
        object = n4;
        object2.add(object);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zzb;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zzb)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zzb)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zzb)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zzb)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
            return false;
        }
        return bl3;
    }

    public final Person$Cover$CoverInfo getCoverInfo() {
        return this.zzbp;
    }

    public final Person$Cover$CoverPhoto getCoverPhoto() {
        return this.zzbq;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return zzao;
    }

    public final Object getFieldValue(FastJsonResponse$Field object) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 != n3) {
                n3 = 4;
                if (n4 == n3) {
                    return this.zzbr;
                }
                int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                object = tk3_2.a(38, n7, "Unknown safe parcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            return this.zzbq;
        }
        return this.zzbp;
    }

    public final int getLayout() {
        return this.zzbr;
    }

    public final boolean hasCoverInfo() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasCoverPhoto() {
        Set set = this.zzap;
        Integer n3 = 3;
        return set.contains(n3);
    }

    public final boolean hasLayout() {
        Set set = this.zzap;
        Integer n3 = 4;
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

    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 == (n4 = 4)) {
            this.zzbr = n3;
            object2 = this.zzap;
            object = n7;
            object2.add(object);
            return;
        }
        object = oe2_0.a(52, n7, "Field with id=", " is not known to be an int.");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Integer n4;
        int n7;
        Object object;
        boolean bl2;
        int n8 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        boolean bl3 = true;
        Integer n10 = (int)(bl3 ? 1 : 0);
        int n14 = set.contains(n10);
        if (n14 != 0) {
            n14 = this.zzw;
            SafeParcelWriter.writeInt(parcel, (int)(bl3 ? 1 : 0), n14);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n14 = 2))) {
            object = this.zzbp;
            SafeParcelWriter.writeParcelable(parcel, n14, (Parcelable)object, n3, bl3);
        }
        if (bl2 = set.contains(object = Integer.valueOf(n14 = 3))) {
            object = this.zzbq;
            SafeParcelWriter.writeParcelable(parcel, n14, (Parcelable)object, n3, bl3);
        }
        if ((n7 = set.contains(n4 = Integer.valueOf(n3 = 4))) != 0) {
            n7 = this.zzbr;
            SafeParcelWriter.writeInt(parcel, n3, n7);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n8);
    }
}

