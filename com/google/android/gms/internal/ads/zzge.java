/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 */
package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

public final class zzge {
    public static String zza(XmlPullParser xmlPullParser, String string2) {
        int n3 = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = xmlPullParser.getAttributeName(i3);
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return xmlPullParser.getAttributeValue(i3);
        }
        return null;
    }

    public static boolean zzb(XmlPullParser object, String string2) {
        boolean bl2;
        int n3;
        int n4 = object.getEventType();
        return n4 == (n3 = 3) && (bl2 = ((String)(object = object.getName())).equals(string2));
    }

    public static boolean zzc(XmlPullParser object, String string2) {
        boolean bl2;
        int n3;
        int n4 = object.getEventType();
        return n4 == (n3 = 2) && (bl2 = ((String)(object = object.getName())).equals(string2));
    }
}

