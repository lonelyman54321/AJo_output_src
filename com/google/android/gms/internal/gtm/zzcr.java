/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.XmlResourceParser
 *  android.text.TextUtils
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.google.android.gms.internal.gtm;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcp;
import com.google.android.gms.internal.gtm.zzcq;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

class zzcr
extends zzbq {
    final zzcq zza;

    public zzcr(zzbu zzbu2, zzcq zzcq2) {
        super(zzbu2);
        this.zza = zzcq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzcp zzb(XmlResourceParser xmlResourceParser) {
        int n3;
        int n4;
        block20: {
            XmlPullParserException xmlPullParserException2;
            String string2;
            block21: {
                string2 = "Error parsing tracker configuration file";
                try {
                    xmlResourceParser.next();
                    n4 = xmlResourceParser.getEventType();
                    break block20;
                }
                catch (IOException iOException) {
                }
                catch (XmlPullParserException xmlPullParserException2) {
                    break block21;
                }
                this.zzJ(string2, iOException);
                return this.zza.zza();
            }
            this.zzJ(string2, (Object)xmlPullParserException2);
            return this.zza.zza();
        }
        while (n4 != (n3 = 1)) {
            n4 = xmlResourceParser.getEventType();
            if (n4 == (n3 = 2)) {
                int n7;
                String string3 = xmlResourceParser.getName();
                Object object = Locale.US;
                string3 = string3.toLowerCase((Locale)object);
                object = "screenname";
                n3 = (int)(string3.equals(object) ? 1 : 0);
                Object object2 = "name";
                zzcq zzcq2 = null;
                if (n3 != 0) {
                    string3 = xmlResourceParser.getAttributeValue(null, (String)object2);
                    object = xmlResourceParser.nextText();
                    object = ((String)object).trim();
                    n7 = TextUtils.isEmpty((CharSequence)string3);
                    if (n7 == 0 && (n7 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                        object2 = this.zza;
                        object2.zzb(string3, (String)object);
                    }
                } else {
                    object = "string";
                    n3 = (int)(string3.equals(object) ? 1 : 0);
                    if (n3 != 0) {
                        string3 = xmlResourceParser.getAttributeValue(null, (String)object2);
                        object = xmlResourceParser.nextText();
                        object = ((String)object).trim();
                        n7 = TextUtils.isEmpty((CharSequence)string3);
                        if (n7 == 0 && object != null) {
                            object2 = this.zza;
                            object2.zze(string3, (String)object);
                        }
                    } else {
                        object = "bool";
                        n3 = (int)(string3.equals(object) ? 1 : 0);
                        if (n3 != 0) {
                            string3 = xmlResourceParser.getAttributeValue(null, (String)object2);
                            object = xmlResourceParser.nextText();
                            object = ((String)object).trim();
                            n7 = TextUtils.isEmpty((CharSequence)string3);
                            if (n7 == 0 && (n7 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                                try {
                                    n7 = Boolean.parseBoolean((String)object);
                                    zzcq2 = this.zza;
                                    zzcq2.zzc(string3, n7 != 0);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    object2 = "Error parsing bool configuration value";
                                    this.zzS((String)object2, object, numberFormatException);
                                }
                            }
                        } else {
                            object = "integer";
                            n4 = (int)(string3.equals(object) ? 1 : 0);
                            if (n4 != 0) {
                                string3 = xmlResourceParser.getAttributeValue(null, (String)object2);
                                object = xmlResourceParser.nextText();
                                object = ((String)object).trim();
                                n7 = TextUtils.isEmpty((CharSequence)string3);
                                if (n7 == 0 && (n7 = TextUtils.isEmpty((CharSequence)object)) == 0) {
                                    try {
                                        n7 = Integer.parseInt((String)object);
                                        zzcq2 = this.zza;
                                        zzcq2.zzd(string3, n7);
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        object2 = "Error parsing int configuration value";
                                        this.zzS((String)object2, object, numberFormatException);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n4 = xmlResourceParser.next();
        }
        return this.zza.zza();
    }

    public zzcp zza(int n3) {
        zzbu zzbu2;
        try {
            zzbu2 = this.zzt();
        }
        catch (Resources.NotFoundException notFoundException) {
            this.zzR("inflate() called with unknown resourceId", (Object)notFoundException);
            return null;
        }
        zzbu2 = zzbu2.zzb();
        zzbu2 = zzbu2.getResources();
        XmlResourceParser xmlResourceParser = zzbu2.getXml(n3);
        return this.zzb(xmlResourceParser);
    }
}

