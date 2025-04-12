/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzi;
import com.google.android.play.core.splitinstall.zzk;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class zzbg {
    /*
     * Enabled aggressive exception aggregation
     */
    public static final zzk zza(XmlPullParser xmlPullParser, zzi zzi2) {
        try {
            int n3;
            int n4;
            while ((n4 = xmlPullParser.next()) != (n3 = 1)) {
                int n7;
                String string2;
                n4 = xmlPullParser.getEventType();
                if (n4 != (n3 = 2)) continue;
                String string3 = xmlPullParser.getName();
                n4 = (int)(string3.equals(string2 = "splits") ? 1 : 0);
                if (n4 == 0) {
                    zzbg.zzc(xmlPullParser, zzi2);
                    continue;
                }
                while ((n4 = xmlPullParser.next()) != (n7 = 3)) {
                    String string4;
                    n4 = xmlPullParser.getEventType();
                    if (n4 != n3) continue;
                    string3 = xmlPullParser.getName();
                    n4 = (int)(string3.equals(string4 = "module") ? 1 : 0);
                    if (n4 != 0) {
                        string3 = "name";
                        if ((string3 = zzbg.zzb(string3, xmlPullParser, zzi2)) != null) {
                            int n8;
                            while ((n8 = xmlPullParser.next()) != n7) {
                                String string5;
                                n8 = xmlPullParser.getEventType();
                                if (n8 != n3) continue;
                                string4 = xmlPullParser.getName();
                                n8 = (int)(string4.equals(string5 = "language") ? 1 : 0);
                                if (n8 == 0) {
                                    zzbg.zzc(xmlPullParser, zzi2);
                                    continue;
                                }
                                while ((n8 = xmlPullParser.next()) != n7) {
                                    n8 = xmlPullParser.getEventType();
                                    if (n8 != n3) continue;
                                    string4 = xmlPullParser.getName();
                                    n8 = (int)(string4.equals(string5 = "entry") ? 1 : 0);
                                    if (n8 != 0) {
                                        string4 = "key";
                                        string4 = zzbg.zzb(string4, xmlPullParser, zzi2);
                                        string5 = "split";
                                        string5 = zzbg.zzb(string5, xmlPullParser, zzi2);
                                        zzbg.zzc(xmlPullParser, zzi2);
                                        if (string4 == null || string5 == null) continue;
                                        zzi2.zza(string3, string4, string5);
                                        continue;
                                    }
                                    zzbg.zzc(xmlPullParser, zzi2);
                                }
                            }
                            continue;
                        }
                        zzbg.zzc(xmlPullParser, zzi2);
                        continue;
                    }
                    zzbg.zzc(xmlPullParser, zzi2);
                }
            }
            return zzi2.zzb();
        }
        catch (IOException | IllegalStateException | XmlPullParserException throwable) {
            return null;
        }
    }

    private static final String zzb(String string2, XmlPullParser xmlPullParser, zzi zzi2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = xmlPullParser.getAttributeCount()); ++i3) {
            String string3 = xmlPullParser.getAttributeName(i3);
            n3 = (int)(string3.equals(string2) ? 1 : 0);
            if (n3 == 0) continue;
            return xmlPullParser.getAttributeValue(i3);
        }
        return null;
    }

    private static final void zzc(XmlPullParser xmlPullParser, zzi zzi2) {
        int n3 = 1;
        while (n3 != 0) {
            int n4;
            int n7 = xmlPullParser.next();
            if (n7 != (n4 = 2)) {
                n4 = 3;
                if (n7 != n4) continue;
                n3 += -1;
                continue;
            }
            ++n3;
        }
    }
}

