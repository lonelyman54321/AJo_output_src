/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAd$VideoAd;
import kotlin.jvm.internal.Intrinsics;

public final class JioAd$VideoAd$Media {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public JioAd$VideoAd$Media(JioAd$VideoAd jioAd$VideoAd, String string2, String string3, String string4, String string5, String string6, String string7, long l2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Intrinsics.checkNotNullParameter(string3, "delivery");
        Intrinsics.checkNotNullParameter(string4, "bitrate");
        Intrinsics.checkNotNullParameter(string5, "width");
        Intrinsics.checkNotNullParameter(string6, "height");
        Intrinsics.checkNotNullParameter(string7, "type");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
        this.g = l2;
    }

    public final int getBitrate() {
        int n3;
        String string2 = this.c;
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (Exception exception) {
            n3 = 0;
            string2 = null;
        }
        return n3;
    }

    public final String getDelivery() {
        return this.b;
    }

    public final long getDuration() {
        return this.g;
    }

    public final int getHeight() {
        int n3;
        String string2 = this.e;
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (Exception exception) {
            n3 = 0;
            string2 = null;
        }
        return n3;
    }

    public final String getMediaType() {
        return this.f;
    }

    public final String getMediaUrl() {
        return this.a;
    }

    public final int getWidth() {
        int n3;
        String string2 = this.d;
        try {
            n3 = Integer.parseInt(string2);
        }
        catch (Exception exception) {
            n3 = 0;
            string2 = null;
        }
        return n3;
    }
}

