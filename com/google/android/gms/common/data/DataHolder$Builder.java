/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.os.Bundle
 */
package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zac;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataHolder$Builder {
    private final String[] zaa;
    private final ArrayList zab;
    private final HashMap zac;

    public /* synthetic */ DataHolder$Builder(String[] object, String string2, zac zac2) {
        object = (String[])Preconditions.checkNotNull(object);
        this.zaa = object;
        this.zab = object;
        super();
        this.zac = object;
    }

    public static /* bridge */ /* synthetic */ ArrayList zab(DataHolder$Builder dataHolder$Builder) {
        return dataHolder$Builder.zab;
    }

    public static /* bridge */ /* synthetic */ String[] zac(DataHolder$Builder dataHolder$Builder) {
        return dataHolder$Builder.zaa;
    }

    public DataHolder build(int n3) {
        DataHolder dataHolder = new DataHolder(this, n3, null, null);
        return dataHolder;
    }

    public DataHolder build(int n3, Bundle bundle) {
        DataHolder dataHolder = new DataHolder(this, n3, bundle, -1, null);
        return dataHolder;
    }

    public DataHolder$Builder withRow(ContentValues object) {
        Asserts.checkNotNull(object);
        int n3 = object.size();
        HashMap<String, Map.Entry> hashMap = new HashMap<String, Map.Entry>(n3);
        object = object.valueSet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Map.Entry entry = (Map.Entry)object.next();
            String string2 = (String)entry.getKey();
            entry = entry.getValue();
            hashMap.put(string2, entry);
        }
        return this.zaa(hashMap);
    }

    public DataHolder$Builder zaa(HashMap hashMap) {
        Asserts.checkNotNull(hashMap);
        this.zab.add(hashMap);
        return this;
    }
}

