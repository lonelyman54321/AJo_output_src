/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.be;
import com.google.android.play.core.assetpacks.bf;
import com.google.android.play.core.assetpacks.bs;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.model.b;

public abstract class AssetPackState {
    public static AssetPackState a(String string2, int n3, int n4, long l2, long l3, double d2, int n7, String string3, String string4) {
        double d5 = 100.0 * d2;
        int n8 = (int)Math.rint(d5);
        bs bs2 = new bs(string2, n3, n4, l2, l3, n8, n7, string3, string4);
        return bs2;
    }

    public static AssetPackState b(Bundle bundle, String string2, dd dd2, er er2) {
        be be2 = new be();
        return AssetPackState.c(bundle, string2, dd2, er2, be2);
    }

    public static AssetPackState c(Bundle bundle, String string2, dd dd2, er er2, bf bf2) {
        Object object = bundle;
        String string3 = string2;
        String string4 = b.a("status", string2);
        int n3 = bundle.getInt(string4);
        Object object2 = bf2;
        n3 = bf2.a(n3, string2);
        object2 = b.a("error_code", string2);
        int n4 = bundle.getInt((String)object2);
        String string5 = b.a("bytes_downloaded", string2);
        long l2 = bundle.getLong(string5);
        String string6 = b.a("total_bytes_to_download", string2);
        long l3 = bundle.getLong(string6);
        double d2 = dd2.a(string2);
        String string7 = b.a("pack_version", string2);
        long l4 = bundle.getLong(string7);
        String string8 = b.a("pack_base_version", string2);
        long l7 = bundle.getLong(string8);
        int n7 = 1;
        int n8 = 4;
        if (n3 == n8) {
            long l8 = 0L;
            long l12 = l7 - l8;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 != 0 && (n3 = (int)(l7 == l4 ? 0 : (l7 < l4 ? -1 : 1))) != 0) {
                n3 = 2;
                n7 = 2;
            }
        } else {
            n8 = n3;
        }
        string4 = b.a("pack_version_tag", string3);
        string7 = String.valueOf(object.getInt("app_version_code"));
        string7 = object.getString(string4, string7);
        object = er2;
        String string9 = er2.a(string3);
        object = string2;
        n3 = n4;
        return AssetPackState.a(string2, n8, n4, l2, l3, d2, n7, string7, string9);
    }

    public abstract String availableVersionTag();

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String installedVersionTag();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}

