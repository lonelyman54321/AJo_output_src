/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zan
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final HashMap zab;
    private final String zac;

    static {
        zao zao2 = new zao();
        CREATOR = zao2;
    }

    public zan(int n3, ArrayList arrayList, String string2) {
        this.zaa = n3;
        Object object = new HashMap();
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            zal zal2 = (zal)arrayList.get(i3);
            String string3 = zal2.zab;
            HashMap<String, zam> hashMap = new HashMap<String, zam>();
            ArrayList arrayList2 = (ArrayList)Preconditions.checkNotNull(zal2.zac);
            int n7 = arrayList2.size();
            for (int i8 = 0; i8 < n7; ++i8) {
                AbstractSafeParcelable abstractSafeParcelable = (zam)zal2.zac.get(i8);
                String string4 = abstractSafeParcelable.zab;
                abstractSafeParcelable = abstractSafeParcelable.zac;
                hashMap.put(string4, (zam)abstractSafeParcelable);
            }
            ((HashMap)object).put(string3, hashMap);
        }
        this.zab = object;
        this.zac = object = (String)Preconditions.checkNotNull(string2);
        this.zad();
    }

    public zan(Class object) {
        HashMap hashMap;
        this.zaa = 1;
        this.zab = hashMap = new HashMap();
        this.zac = object = (String)Preconditions.checkNotNull(((Class)object).getCanonicalName());
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.zab.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            Object object = (String)iterator.next();
            stringBuilder.append((String)object);
            stringBuilder.append(":\n");
            object = (Map)this.zab.get(object);
            Iterator iterator2 = object.keySet().iterator();
            while (bl3 = iterator2.hasNext()) {
                String string2 = (String)iterator2.next();
                stringBuilder.append("  ");
                stringBuilder.append(string2);
                String string3 = ": ";
                stringBuilder.append(string3);
                string2 = object.get(string2);
                stringBuilder.append((Object)string2);
            }
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        boolean bl2;
        n3 = SafeParcelWriter.beginObjectHeader(parcel);
        int n4 = 1;
        int n7 = this.zaa;
        SafeParcelWriter.writeInt(parcel, n4, n7);
        ArrayList<zal> arrayList = new ArrayList<zal>();
        Object object = this.zab.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Map map2 = this.zab;
            map2 = (Map)map2.get(string2);
            zal zal2 = new zal(string2, map2);
            arrayList.add(zal2);
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        object = this.zac;
        SafeParcelWriter.writeString(parcel, 3, (String)object, false);
        SafeParcelWriter.finishObjectHeader(parcel, n3);
    }

    public final String zaa() {
        return this.zac;
    }

    public final Map zab(String string2) {
        return (Map)this.zab.get(string2);
    }

    public final void zac() {
        boolean bl2;
        Iterator iterator = this.zab.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            String string2 = (String)iterator.next();
            Map map2 = (Map)this.zab.get(string2);
            HashMap<String, FastJsonResponse$Field> hashMap = new HashMap<String, FastJsonResponse$Field>();
            Iterator iterator2 = map2.keySet().iterator();
            while (bl3 = iterator2.hasNext()) {
                String string3 = (String)iterator2.next();
                FastJsonResponse$Field fastJsonResponse$Field = ((FastJsonResponse$Field)map2.get(string3)).zab();
                hashMap.put(string3, fastJsonResponse$Field);
            }
            map2 = this.zab;
            ((HashMap)map2).put(string2, hashMap);
        }
    }

    public final void zad() {
        boolean bl2;
        Iterator iterator = this.zab.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            boolean bl3;
            Object object = (String)iterator.next();
            object = (Map)this.zab.get(object);
            Iterator iterator2 = object.keySet().iterator();
            while (bl3 = iterator2.hasNext()) {
                Object object2 = (String)iterator2.next();
                object2 = (FastJsonResponse$Field)object.get(object2);
                ((FastJsonResponse$Field)object2).zai(this);
            }
        }
    }

    public final void zae(Class object, Map map2) {
        object = (String)Preconditions.checkNotNull(((Class)object).getCanonicalName());
        this.zab.put(object, map2);
    }

    public final boolean zaf(Class object) {
        object = Preconditions.checkNotNull(((Class)object).getCanonicalName());
        return this.zab.containsKey(object);
    }
}

