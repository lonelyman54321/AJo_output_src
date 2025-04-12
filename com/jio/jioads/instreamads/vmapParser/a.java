/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.jio.jioads.instreamads.vmapParser;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.instreamads.vmapParser.model.b;
import com.jio.jioads.instreamads.vmapParser.model.c;
import com.jio.jioads.util.Utility;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a {
    public final String a;
    public final XmlPullParser b;
    public final String c;

    public a(String string2) {
        XmlPullParser xmlPullParser;
        Intrinsics.checkNotNullParameter(string2, "input");
        this.a = string2;
        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        this.b = xmlPullParser = xmlPullParserFactory.newPullParser();
        this.c = "vmap:";
        StringReader stringReader = new StringReader(string2);
        xmlPullParser.setInput((Reader)stringReader);
        xmlPullParserFactory.setNamespaceAware(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final c a() {
        Object object2;
        Object object3;
        Object object;
        block8: {
            CharSequence charSequence;
            Object object4;
            block7: {
                block6: {
                    object = "";
                    object4 = this.b;
                    object3 = this.a;
                    int n3 = ((String)object3).length();
                    if (n3 == 0) {
                        object = new IllegalArgumentException("Vmap input can't be empty");
                        throw object;
                    }
                    n3 = 0;
                    object3 = null;
                    try {
                        object4.nextTag();
                        object2 = object4.getName();
                        charSequence = new StringBuilder();
                        String string2 = this.c;
                        ((StringBuilder)charSequence).append(string2);
                        string2 = "VMAP";
                        ((StringBuilder)charSequence).append(string2);
                        charSequence = ((StringBuilder)charSequence).toString();
                        boolean bl2 = true;
                        boolean bl3 = kotlin.text.b.i((String)object2, (String)charSequence, bl2);
                        if (!bl3) break block6;
                        object2 = "version";
                        object2 = object4.getAttributeValue(null, (String)object2);
                    }
                    catch (Exception exception) {
                        object2 = object;
                        break block7;
                    }
                    try {
                        object4.nextTag();
                        object3 = this.b();
                        break block8;
                    }
                    catch (Exception exception) {
                        break block7;
                    }
                }
                object2 = object;
                break block8;
            }
            charSequence = "Parsing exception: ";
            LO1.b((String)charSequence, (Exception)object4);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object4 = JioAds$LogLevel.NONE;
        }
        object3 = object3 != null ? fh1_2.q((Map)object3) : new LinkedHashMap();
        if (object2 != null) {
            object = object2;
        }
        return new c((String)object, (LinkedHashMap)object3);
    }

    public final LinkedHashMap b() {
        int n3;
        int n4;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        XmlPullParser xmlPullParser = this.b;
        int bl3 = xmlPullParser.getEventType();
        while (n4 != (n3 = 1)) {
            String string2;
            Object object;
            Object object2 = xmlPullParser.getName();
            int n7 = 2;
            String string3 = this.c;
            if (n4 != n7 && object2 != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string3);
                string2 = "VMAP";
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
                n4 = ((String)object2).equals(object);
                if (n4 == 0) {
                    xmlPullParser.nextTag();
                    n4 = xmlPullParser.getEventType();
                    continue;
                }
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string3);
            string2 = "AdBreak";
            ((StringBuilder)object).append(string2);
            object = ((StringBuilder)object).toString();
            n4 = kotlin.text.b.i((String)object2, (String)object, n3 != 0);
            if (n4 != 0) {
                Object object3;
                Serializable serializable;
                Object object4;
                n4 = 0;
                object = null;
                object2 = xmlPullParser.getAttributeValue(null, "timeOffset");
                String string4 = "getAttributeValue(...)";
                Intrinsics.checkNotNullExpressionValue(object2, string4);
                Object object5 = Locale.ROOT;
                object2 = ((String)object2).toLowerCase((Locale)object5);
                Intrinsics.checkNotNullExpressionValue(object2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                object5 = "start";
                boolean bl2 = Intrinsics.areEqual(object2, object5);
                if (bl2) {
                    bl2 = true;
                } else {
                    object5 = "end";
                    bl2 = Intrinsics.areEqual(object2, object5);
                }
                if (!bl2) {
                    object5 = Utility.INSTANCE;
                    object2 = ((Utility)object5).ensureMilliseconds((String)object2);
                }
                object5 = (b)linkedHashMap.get(object2);
                if (object5 == null) {
                    object5 = xmlPullParser.getAttributeValue(null, "breakType");
                    object4 = xmlPullParser.getAttributeValue(null, "breakId");
                    Intrinsics.checkNotNull(object5);
                    Intrinsics.checkNotNull(object4);
                    serializable = new Serializable();
                    object5 = object3 = new b((String)object5, (String)object4, (ArrayList)serializable);
                }
                linkedHashMap.put((String)object2, object5);
                xmlPullParser.nextTag();
                object2 = (b)linkedHashMap.get(object2);
                if (object2 != null && (object2 = ((b)object2).c) != null) {
                    int n8;
                    int n10;
                    object5 = "";
                    boolean bl4 = false;
                    object3 = null;
                    boolean bl5 = false;
                    serializable = null;
                    object4 = object5;
                    while ((n10 = xmlPullParser.getEventType()) != (n8 = 3)) {
                        String string5 = xmlPullParser.getName();
                        CharSequence charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string3);
                        ((StringBuilder)charSequence).append(string2);
                        charSequence = ((StringBuilder)charSequence).toString();
                        n10 = (int)(kotlin.text.b.i(string5, (String)charSequence, n3 != 0) ? 1 : 0);
                        if (n10 != 0) break;
                        string5 = xmlPullParser.getName();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(string3);
                        String string6 = "AdSource";
                        ((StringBuilder)charSequence).append(string6);
                        charSequence = ((StringBuilder)charSequence).toString();
                        n10 = (int)(kotlin.text.b.i(string5, (String)charSequence, n3 != 0) ? 1 : 0);
                        if (n10 != 0) {
                            object5 = xmlPullParser.getAttributeValue(null, "id");
                            Intrinsics.checkNotNullExpressionValue(object5, string4);
                            bl4 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "allowMultipleAds"));
                            object3 = bl4;
                            bl5 = Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, "followRedirects"));
                            serializable = bl5;
                        } else {
                            string5 = xmlPullParser.getName();
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append(string3);
                            string6 = "AdTagURI";
                            ((StringBuilder)charSequence).append(string6);
                            charSequence = ((StringBuilder)charSequence).toString();
                            n10 = (int)(kotlin.text.b.i(string5, (String)charSequence, n3 != 0) ? 1 : 0);
                            if (n10 != 0 && (n10 = xmlPullParser.next()) == (n8 = 4)) {
                                object4 = xmlPullParser.getText();
                                string5 = "getText(...)";
                                Intrinsics.checkNotNullExpressionValue(object4, string5);
                                xmlPullParser.nextTag();
                            }
                        }
                        xmlPullParser.nextTag();
                    }
                    n3 = 0;
                    if (object3 != null) {
                        n7 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                    } else {
                        n7 = 0;
                        string2 = null;
                    }
                    if (serializable != null) {
                        n3 = ((Boolean)serializable).booleanValue();
                    }
                    object = new com.jio.jioads.instreamads.vmapParser.model.a((String)object5, (String)object4, n7 != 0, n3 != 0);
                    object2.add(object);
                }
            }
            n4 = xmlPullParser.next();
        }
        return linkedHashMap;
    }
}

