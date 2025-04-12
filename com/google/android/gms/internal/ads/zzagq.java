/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzagm;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgaz;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzge;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class zzagq {
    private static final String[] zza = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzagm zza(String string2) {
        Object object = "x:xmpmeta";
        Object object2 = null;
        try {
            void var4_6;
            int n3;
            long l2;
            XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
            xmlPullParserFactory = xmlPullParserFactory.newPullParser();
            StringReader stringReader = new StringReader(string2);
            xmlPullParserFactory.setInput((Reader)stringReader);
            xmlPullParserFactory.next();
            int n4 = zzge.zzc((XmlPullParser)xmlPullParserFactory, (String)object);
            if (n4 == 0) {
                object = "Couldn't find xmp metadata";
                object = zzch.zza((String)object, null);
                throw object;
            }
            zzgbc zzgbc2 = zzgbc.zzm();
            long l3 = l2 = -9223372036854775807L;
            do {
                long l4;
                block15: {
                    int n7;
                    String string3;
                    int n8;
                    zzagl zzagl2;
                    int n10;
                    block14: {
                        xmlPullParserFactory.next();
                        String string4 = "rdf:Description";
                        n3 = zzge.zzc((XmlPullParser)xmlPullParserFactory, string4);
                        if (n3 == 0) {
                            string4 = "Container:Directory";
                            n3 = zzge.zzc((XmlPullParser)xmlPullParserFactory, string4);
                            if (n3 != 0) {
                                String string5 = "Container";
                                string4 = "Item";
                                zzgbc zzgbc3 = zzagq.zzb((XmlPullParser)xmlPullParserFactory, string5, string4);
                                continue;
                            }
                            string4 = "GContainer:Directory";
                            n3 = (int)(zzge.zzc((XmlPullParser)xmlPullParserFactory, string4) ? 1 : 0);
                            if (n3 == 0) continue;
                            String string6 = "GContainer";
                            string4 = "GContainerItem";
                            zzgbc zzgbc4 = zzagq.zzb((XmlPullParser)xmlPullParserFactory, string6, string4);
                            continue;
                        }
                        String[] stringArray = zza;
                        n10 = 0;
                        zzagl2 = null;
                        n8 = 0;
                        while (n8 < (n3 = 4)) {
                            string3 = stringArray[n8];
                            if ((string3 = zzge.zza((XmlPullParser)xmlPullParserFactory, string3)) == null) {
                                ++n8;
                                continue;
                            }
                            break block14;
                        }
                        return object2;
                    }
                    n4 = Integer.parseInt(string3);
                    if (n4 != (n8 = 1)) return object2;
                    String[] stringArray = zzb;
                    n8 = 0;
                    while (true) {
                        if (n8 < n3) {
                            string3 = stringArray[n8];
                            if ((string3 = zzge.zza((XmlPullParser)xmlPullParserFactory, string3)) != null) {
                                long l7;
                                l4 = Long.parseLong(string3);
                                long l8 = l4 - (l7 = (long)-1);
                                n4 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                if (n4 != 0) break;
                            }
                        } else {
                            l4 = l2;
                            break;
                        }
                        ++n8;
                    }
                    String[] stringArray2 = zzc;
                    while (n10 < (n7 = 2)) {
                        string3 = stringArray2[n10];
                        if ((string3 = zzge.zza((XmlPullParser)xmlPullParserFactory, string3)) != null) {
                            long l12 = Long.parseLong(string3);
                            String string7 = "image/jpeg";
                            String string8 = "Primary";
                            long l14 = 0L;
                            long l15 = 0L;
                            zzagl zzagl3 = new zzagl(string7, string8, l14, l15);
                            String string9 = "video/mp4";
                            String string10 = "MotionPhoto";
                            long l16 = 0L;
                            zzagl2 = new zzagl(string9, string10, l12, l16);
                            zzgbc zzgbc5 = zzgbc.zzo(zzagl3, zzagl2);
                            break block15;
                        }
                        ++n10;
                    }
                    zzgbc zzgbc6 = zzgbc.zzm();
                }
                l3 = l4;
            } while ((n3 = (int)(zzge.zzb((XmlPullParser)xmlPullParserFactory, (String)object) ? 1 : 0)) == 0);
            boolean bl2 = var4_6.isEmpty();
            if (!bl2) return object = new zzagm(l3, (List)var4_6);
            return object2;
        }
        catch (zzch | NumberFormatException | XmlPullParserException throwable) {}
        zzfk.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
        return null;
    }

    private static zzgbc zzb(XmlPullParser xmlPullParser, String string2, String string3) {
        String string4;
        boolean bl2;
        zzgaz zzgaz2 = new zzgaz();
        do {
            string4 = string2.concat(":Item");
            xmlPullParser.next();
            bl2 = zzge.zzc(xmlPullParser, string4);
            if (!bl2) continue;
            string4 = string3.concat(":Mime");
            String string5 = string3.concat(":Semantic");
            Object object = string3.concat(":Length");
            String string6 = string3.concat(":Padding");
            String string7 = zzge.zza(xmlPullParser, string4);
            String string8 = zzge.zza(xmlPullParser, string5);
            string4 = zzge.zza(xmlPullParser, (String)object);
            string5 = zzge.zza(xmlPullParser, string6);
            if (string7 != null && string8 != null) {
                long l2;
                long l3 = 0L;
                long l4 = string4 != null ? Long.parseLong(string4) : l3;
                long l7 = string5 != null ? (l2 = Long.parseLong(string5)) : l3;
                object = new zzagl(string7, string8, l4, l7);
                zzgaz2.zzf(object);
                continue;
            }
            return zzgbc.zzm();
        } while (!(bl2 = zzge.zzb(xmlPullParser, string4 = string2.concat(":Directory"))));
        return zzgaz2.zzi();
    }
}

