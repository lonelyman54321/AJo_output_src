/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects$ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zaj;
import com.google.android.gms.common.server.response.zan;
import java.util.Map;

public class FastJsonResponse$Field
extends AbstractSafeParcelable {
    public static final zaj CREATOR;
    protected final int zaa;
    protected final boolean zab;
    protected final int zac;
    protected final boolean zad;
    protected final String zae;
    protected final int zaf;
    protected final Class zag;
    protected final String zah;
    private final int zai;
    private zan zaj;
    private final FastJsonResponse$FieldConverter zak;

    static {
        zaj zaj2;
        CREATOR = zaj2 = new zaj();
    }

    public FastJsonResponse$Field(int n3, int n4, boolean bl2, int n7, boolean bl3, String string2, int n8, String string3, zaa zaa2) {
        this.zai = n3;
        this.zaa = n4;
        this.zab = bl2;
        this.zac = n7;
        this.zad = bl3;
        this.zae = string2;
        this.zaf = n8;
        n3 = 0;
        FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter = null;
        if (string3 == null) {
            this.zag = null;
            this.zah = null;
        } else {
            Class<SafeParcelResponse> clazz;
            this.zag = clazz = SafeParcelResponse.class;
            this.zah = string3;
        }
        if (zaa2 == null) {
            this.zak = null;
            return;
        }
        this.zak = fastJsonResponse$FieldConverter = zaa2.zab();
    }

    public FastJsonResponse$Field(int n3, boolean bl2, int n4, boolean bl3, String string2, int n7, Class clazz, FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter) {
        int n8;
        this.zai = n8 = 1;
        this.zaa = n3;
        this.zab = bl2;
        this.zac = n4;
        this.zad = bl3;
        this.zae = string2;
        this.zaf = n7;
        this.zag = clazz;
        if (clazz == null) {
            n3 = 0;
            Object var10_10 = null;
            this.zah = null;
        } else {
            String string3;
            this.zah = string3 = clazz.getCanonicalName();
        }
        this.zak = fastJsonResponse$FieldConverter;
    }

    public static FastJsonResponse$Field forBase64(String string2, int n3) {
        int n4 = 8;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, false, n4, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forBoolean(String string2, int n3) {
        int n4 = 6;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, false, n4, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forConcreteType(String string2, int n3, Class clazz) {
        int n4 = 11;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, false, n4, false, string2, n3, clazz, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forConcreteTypeArray(String string2, int n3, Class clazz) {
        int n4 = 11;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, true, n4, true, string2, n3, clazz, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forDouble(String string2, int n3) {
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(4, false, 4, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forFloat(String string2, int n3) {
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(3, false, 3, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forInteger(String string2, int n3) {
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(0, false, 0, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forLong(String string2, int n3) {
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(2, false, 2, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forString(String string2, int n3) {
        int n4 = 7;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, false, n4, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forStringMap(String string2, int n3) {
        int n4 = 10;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, false, n4, false, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field forStrings(String string2, int n3) {
        int n4 = 7;
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n4, true, n4, true, string2, n3, null, null);
        return fastJsonResponse$Field;
    }

    public static FastJsonResponse$Field withConverter(String string2, int n3, FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter, boolean bl2) {
        fastJsonResponse$FieldConverter.zaa();
        fastJsonResponse$FieldConverter.zab();
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(7, bl2, 0, false, string2, n3, null, fastJsonResponse$FieldConverter);
        return fastJsonResponse$Field;
    }

    public static /* bridge */ /* synthetic */ FastJsonResponse$FieldConverter zac(FastJsonResponse$Field fastJsonResponse$Field) {
        return fastJsonResponse$Field.zak;
    }

    public int getSafeParcelableFieldId() {
        return this.zaf;
    }

    public final String toString() {
        Objects$ToStringHelper objects$ToStringHelper = Objects.toStringHelper(this);
        Object object = this.zai;
        objects$ToStringHelper = objects$ToStringHelper.add("versionCode", object);
        object = this.zaa;
        objects$ToStringHelper = objects$ToStringHelper.add("typeIn", object);
        object = this.zab;
        objects$ToStringHelper = objects$ToStringHelper.add("typeInArray", object);
        object = this.zac;
        objects$ToStringHelper = objects$ToStringHelper.add("typeOut", object);
        object = this.zad;
        objects$ToStringHelper = objects$ToStringHelper.add("typeOutArray", object);
        String string2 = this.zae;
        objects$ToStringHelper = objects$ToStringHelper.add("outputFieldName", string2);
        int n3 = this.zaf;
        object = n3;
        objects$ToStringHelper = objects$ToStringHelper.add("safeParcelFieldId", object);
        string2 = this.zag();
        objects$ToStringHelper = objects$ToStringHelper.add("concreteTypeName", string2);
        object = this.zag;
        if (object != null) {
            string2 = "concreteType.class";
            object = ((Class)object).getCanonicalName();
            objects$ToStringHelper.add(string2, object);
        }
        if ((object = this.zak) != null) {
            object = object.getClass().getCanonicalName();
            string2 = "converterName";
            objects$ToStringHelper.add(string2, object);
        }
        return objects$ToStringHelper.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zai;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        int n8 = this.zaa;
        SafeParcelWriter.writeInt(parcel, 2, n8);
        n8 = (int)(this.zab ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 3, n8 != 0);
        n8 = this.zac;
        SafeParcelWriter.writeInt(parcel, 4, n8);
        n8 = (int)(this.zad ? 1 : 0);
        SafeParcelWriter.writeBoolean(parcel, 5, n8 != 0);
        String string2 = this.zae;
        SafeParcelWriter.writeString(parcel, 6, string2, false);
        n8 = this.getSafeParcelableFieldId();
        SafeParcelWriter.writeInt(parcel, 7, n8);
        Object object = this.zag();
        SafeParcelWriter.writeString(parcel, 8, (String)object, false);
        object = this.zaa();
        SafeParcelWriter.writeParcelable(parcel, 9, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }

    public final zaa zaa() {
        FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter = this.zak;
        if (fastJsonResponse$FieldConverter == null) {
            return null;
        }
        return com.google.android.gms.common.server.converter.zaa.zaa(fastJsonResponse$FieldConverter);
    }

    public final FastJsonResponse$Field zab() {
        int n3 = this.zai;
        int n4 = this.zaa;
        boolean bl2 = this.zab;
        int n7 = this.zac;
        boolean bl3 = this.zad;
        String string2 = this.zae;
        int n8 = this.zaf;
        String string3 = this.zah;
        zaa zaa2 = this.zaa();
        FastJsonResponse$Field fastJsonResponse$Field = new FastJsonResponse$Field(n3, n4, bl2, n7, bl3, string2, n8, string3, zaa2);
        return fastJsonResponse$Field;
    }

    public final FastJsonResponse zad() {
        Preconditions.checkNotNull(this.zag);
        Object object = this.zag;
        Object object2 = SafeParcelResponse.class;
        if (object == object2) {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            object2 = this.zaj;
            String string2 = this.zah;
            object = new SafeParcelResponse((zan)object2, string2);
            return object;
        }
        return (FastJsonResponse)((Class)object).newInstance();
    }

    public final Object zae(Object object) {
        Preconditions.checkNotNull(this.zak);
        return Preconditions.checkNotNull(this.zak.zac(object));
    }

    public final Object zaf(Object object) {
        Preconditions.checkNotNull(this.zak);
        return this.zak.zad(object);
    }

    public final String zag() {
        String string2 = this.zah;
        if (string2 == null) {
            string2 = null;
        }
        return string2;
    }

    public final Map zah() {
        Preconditions.checkNotNull(this.zah);
        Preconditions.checkNotNull(this.zaj);
        zan zan2 = this.zaj;
        String string2 = this.zah;
        return (Map)Preconditions.checkNotNull(zan2.zab(string2));
    }

    public final void zai(zan zan2) {
        this.zaj = zan2;
    }

    public final boolean zaj() {
        FastJsonResponse$FieldConverter fastJsonResponse$FieldConverter = this.zak;
        return fastJsonResponse$FieldConverter != null;
    }
}

