/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import com.google.android.play.core.splitcompat.zza;
import java.io.File;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class zzal {
    private final zza zza;
    private XmlPullParser zzb;

    public zzal(zza zza2) {
        this.zza = zza2;
    }

    public final long zza() {
        Object object = this.zzb;
        if (object != null) {
            block9: {
                Object object2;
                int n3;
                int n4;
                while ((n4 = (object = this.zzb).next()) != (n3 = 2)) {
                    n3 = 1;
                    if (n4 != n3) {
                        continue;
                    }
                    break block9;
                }
                object = this.zzb.getName();
                n4 = (int)(object.equals(object2 = "manifest") ? 1 : 0);
                if (n4 != 0) {
                    object = this.zzb;
                    String string2 = "http://schemas.android.com/apk/res/android";
                    object = object.getAttributeValue(string2, "versionCode");
                    object2 = this.zzb;
                    String string3 = "versionCodeMajor";
                    object2 = object2.getAttributeValue(string2, string3);
                    if (object != null) {
                        long l2;
                        block10: {
                            try {
                                n4 = Integer.parseInt((String)object);
                                if (object2 != null) break block10;
                            }
                            catch (NumberFormatException numberFormatException) {
                                String string4 = numberFormatException.getMessage();
                                string4 = kp1_0.c("Couldn't parse versionCode to int: ", string4);
                                object2 = new XmlPullParserException(string4);
                                throw object2;
                            }
                            return n4;
                        }
                        try {
                            l2 = Integer.parseInt(object2);
                        }
                        catch (NumberFormatException numberFormatException) {
                            String string5 = numberFormatException.getMessage();
                            string5 = kp1_0.c("Couldn't parse versionCodeMajor to int: ", string5);
                            object2 = new XmlPullParserException(string5);
                            throw object2;
                        }
                        long l3 = n4;
                        long l4 = l2 << 32;
                        long l7 = l3 & 0xFFFFFFFFL;
                        return l4 | l7;
                    }
                    object = new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                    throw object;
                }
            }
            object = new XmlPullParserException("Couldn't find manifest entry at top-level.");
            throw object;
        }
        object = new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        throw object;
    }

    public final void zzb(AssetManager assetManager, File file) {
        int n3 = com.google.android.play.core.splitcompat.zza.zzc(assetManager, file);
        assetManager = assetManager.openXmlResourceParser(n3, "AndroidManifest.xml");
        this.zzb = assetManager;
    }
}

