/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.bk;
import com.google.android.play.core.assetpacks.bt;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class AssetPackStates {
    public static AssetPackStates a(Bundle bundle, dd dd2, er er2) {
        bk bk2 = new bk();
        return AssetPackStates.b(bundle, dd2, er2, bk2);
    }

    public static AssetPackStates b(Bundle bundle, dd dd2, er object, bf bf2) {
        ArrayList arrayList = bundle.getStringArrayList("pack_names");
        HashMap<String, AssetPackState> hashMap = new HashMap<String, AssetPackState>();
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = (String)arrayList.get(i3);
            AssetPackState assetPackState = AssetPackState.c(bundle, string2, dd2, (er)object, bf2);
            hashMap.put(string2, assetPackState);
        }
        long l2 = bundle.getLong("total_bytes_to_download");
        object = new bt(l2, hashMap);
        return object;
    }

    public abstract Map packStates();

    public abstract long totalBytes();
}

