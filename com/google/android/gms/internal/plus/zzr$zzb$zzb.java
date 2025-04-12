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
import com.google.android.gms.plus.model.people.Person$Cover$CoverPhoto;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzr$zzb$zzb
extends FastSafeParcelableJsonResponse
implements Person$Cover$CoverPhoto {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzao;
    private final Set zzap;
    private int zzbu;
    private int zzbv;
    private String zzk;
    private final int zzw;

    static {
        HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
        CREATOR = hashMap;
        zzao = hashMap = new HashMap<String, FastJsonResponse$Field>();
        String string2 = "height";
        FastJsonResponse$Field fastJsonResponse$Field = FastJsonResponse$Field.forInteger(string2, 2);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "url";
        fastJsonResponse$Field = FastJsonResponse$Field.forString(string2, 3);
        hashMap.put(string2, fastJsonResponse$Field);
        string2 = "width";
        fastJsonResponse$Field = FastJsonResponse$Field.forInteger(string2, 4);
        hashMap.put(string2, fastJsonResponse$Field);
    }

    public zzr$zzb$zzb() {
        HashSet hashSet;
        this.zzw = 1;
        this.zzap = hashSet = new HashSet();
    }

    public zzr$zzb$zzb(Set set, int n3, int n4, String string2, int n7) {
        this.zzap = set;
        this.zzw = n3;
        this.zzbu = n4;
        this.zzk = string2;
        this.zzbv = n7;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzr$zzb$zzb;
        if (!bl3) {
            return false;
        }
        bl3 = true;
        if (this == object) {
            return bl3;
        }
        object = (zzr$zzb$zzb)object;
        Iterator iterator = zzao.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2;
            Object object3 = (FastJsonResponse$Field)iterator.next();
            boolean bl4 = this.isFieldSet((FastJsonResponse$Field)object3);
            if (!(bl4 ? !(bl4 = ((zzr$zzb$zzb)object).isFieldSet((FastJsonResponse$Field)object3)) || !(bl2 = (object2 = this.getFieldValue((FastJsonResponse$Field)object3)).equals(object3 = ((zzr$zzb$zzb)object).getFieldValue((FastJsonResponse$Field)object3))) : (bl2 = ((zzr$zzb$zzb)object).isFieldSet((FastJsonResponse$Field)object3)))) continue;
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
            if (n4 != n3) {
                n3 = 4;
                if (n4 == n3) {
                    return this.zzbv;
                }
                int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
                object = tk3_2.a(38, n7, "Unknown safe parcelable id=");
                IllegalStateException illegalStateException = new IllegalStateException((String)object);
                throw illegalStateException;
            }
            return this.zzk;
        }
        return this.zzbu;
    }

    public final int getHeight() {
        return this.zzbu;
    }

    public final String getUrl() {
        return this.zzk;
    }

    public final int getWidth() {
        return this.zzbv;
    }

    public final boolean hasHeight() {
        Set set = this.zzap;
        Integer n3 = 2;
        return set.contains(n3);
    }

    public final boolean hasUrl() {
        Set set = this.zzap;
        Integer n3 = 3;
        return set.contains(n3);
    }

    public final boolean hasWidth() {
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

    /*
     * Enabled aggressive block sorting
     */
    public final void setIntegerInternal(FastJsonResponse$Field object, String object2, int n3) {
        int n4;
        int n7 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n7 != (n4 = 2)) {
            n4 = 4;
            if (n7 != n4) {
                object = oe2_0.a(52, n7, "Field with id=", " is not known to be an int.");
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            this.zzbv = n3;
        } else {
            this.zzbu = n3;
        }
        object2 = this.zzap;
        object = n7;
        object2.add(object);
    }

    public final void setStringInternal(FastJsonResponse$Field object, String object2, String string2) {
        int n3;
        int n4 = ((FastJsonResponse$Field)object).getSafeParcelableFieldId();
        if (n4 == (n3 = 3)) {
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
        int n4;
        Object object;
        int n7;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zzap;
        int n8 = 1;
        Integer n10 = n8;
        int n14 = set.contains(n10);
        if (n14 != 0) {
            n14 = this.zzw;
            SafeParcelWriter.writeInt(parcel, n8, n14);
        }
        if ((n7 = set.contains(object = Integer.valueOf(n14 = 2))) != 0) {
            n7 = this.zzbu;
            SafeParcelWriter.writeInt(parcel, n14, n7);
        }
        if ((n7 = (int)(set.contains(object = Integer.valueOf(n14 = 3)) ? 1 : 0)) != 0) {
            object = this.zzk;
            SafeParcelWriter.writeString(parcel, n14, (String)object, n8 != 0);
        }
        if ((n4 = set.contains(n10 = Integer.valueOf(n8 = 4))) != 0) {
            n4 = this.zzbv;
            SafeParcelWriter.writeInt(parcel, n8, n4);
        }
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }
}

