/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.affise.attribution.deeplink;

import android.net.Uri;
import com.affise.attribution.converter.Converter;
import com.affise.attribution.deeplink.InstallReferrerToDeeplinkUriConverter$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class InstallReferrerToDeeplinkUriConverter
implements Converter {
    private static final InstallReferrerToDeeplinkUriConverter$Companion Companion;
    public static final String DEEPLINK_PARAM_NAME = "deeplink";

    static {
        InstallReferrerToDeeplinkUriConverter$Companion installReferrerToDeeplinkUriConverter$Companion;
        Companion = installReferrerToDeeplinkUriConverter$Companion = new InstallReferrerToDeeplinkUriConverter$Companion(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final Uri extractDeeplinkFromAbsolute(Uri object) {
        String string2;
        Uri uri = null;
        String string3 = DEEPLINK_PARAM_NAME;
        try {
            string2 = object.getQueryParameter(string3);
            if (string2 == null) return uri;
        }
        catch (Exception exception) {
            return uri;
        }
        return Uri.parse((String)string2);
    }

    private final Uri extractDeeplinkFromRelative(String string2) {
        Uri.Builder builder = new Uri.Builder();
        string2 = builder.encodedQuery(string2);
        string2 = string2.build();
        try {
            string2 = this.extractDeeplinkFromAbsolute((Uri)string2);
        }
        catch (Exception exception) {
            string2 = null;
        }
        return string2;
    }

    public Uri convert(String string2) {
        Intrinsics.checkNotNullParameter(string2, "from");
        Uri uri = Uri.parse((String)string2);
        String string3 = "uri";
        Intrinsics.checkNotNullExpressionValue(uri, string3);
        uri = this.extractDeeplinkFromAbsolute(uri);
        if (uri == null) {
            uri = this.extractDeeplinkFromRelative(string2);
        }
        return uri;
    }
}

