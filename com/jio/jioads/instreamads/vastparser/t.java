/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.jio.jioads.instreamads.vastparser;

import android.text.TextUtils;
import com.jio.jioads.adinterfaces.AdMetaData$AdParams;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.companionads.CompanionManager;
import com.jio.jioads.companionads.CompanionManager$Companion;
import com.jio.jioads.instreamads.vastparser.model.CtaUrl;
import com.jio.jioads.instreamads.vastparser.model.a;
import com.jio.jioads.instreamads.vastparser.model.b;
import com.jio.jioads.instreamads.vastparser.model.c;
import com.jio.jioads.instreamads.vastparser.model.d;
import com.jio.jioads.instreamads.vastparser.model.e;
import com.jio.jioads.instreamads.vastparser.model.f;
import com.jio.jioads.instreamads.vastparser.model.g;
import com.jio.jioads.instreamads.vastparser.model.h;
import com.jio.jioads.instreamads.vastparser.model.i;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.instreamads.vastparser.model.p;
import com.jio.jioads.instreamads.vastparser.model.q;
import com.jio.jioads.util.Utility;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class t {
    public m a;
    public String b = "";
    public String c;
    public String d;
    public Integer e;
    public String f;

    public static void b(XmlPullParser xmlPullParser, p p2) {
        Object object;
        String string2;
        int n3;
        int n4;
        while ((n4 = xmlPullParser.next()) != (n3 = 3) || (n4 = (int)((string2 = "ViewableImpression").equalsIgnoreCase((String)(object = xmlPullParser.getName())) ? 1 : 0)) == 0) {
            int n7;
            object = xmlPullParser.getName();
            int n8 = xmlPullParser.getEventType();
            if (n8 != (n7 = 2) || (n8 = xmlPullParser.getEventType()) != n7 || (n4 = (int)((string2 = "Viewable").equalsIgnoreCase((String)object) ? 1 : 0)) == 0 || p2 == null || (object = p2.b) == null) continue;
            string2 = xmlPullParser.nextText();
            n7 = xmlPullParser.getEventType();
            if (n7 != n3) {
                xmlPullParser.nextTag();
            }
            Intrinsics.checkNotNull(string2);
            object.add(string2);
        }
        return;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(XmlPullParser xmlPullParser, ArrayList arrayList, Object object) {
        Object object2 = xmlPullParser;
        ArrayList arrayList2 = arrayList;
        while (true) {
            int n3;
            int n4;
            String string2;
            block46: {
                String string3;
                int n7;
                Object object3;
                block45: {
                    boolean bl2;
                    object3 = object;
                    xmlPullParser.next();
                    string2 = xmlPullParser.getName();
                    int n8 = xmlPullParser.getEventType();
                    n7 = 2;
                    if (n8 == n7 && (bl2 = Intrinsics.areEqual(string3 = "Extension", string2)) && arrayList2 != null) break block45;
                    n4 = 3;
                    break block46;
                }
                d d2 = new Object();
                int n10 = 0;
                String string4 = null;
                d2.a = null;
                d2.b = null;
                d2.c = null;
                d2.d = null;
                d2.e = null;
                d2.f = null;
                Object object4 = new ArrayList();
                d2.f = object4;
                while (true) {
                    String string5;
                    int n14;
                    int n15;
                    Object object5;
                    int n16;
                    int n17;
                    Object object6;
                    block47: {
                        boolean bl3;
                        block43: {
                            int n18;
                            if ((n18 = xmlPullParser.getEventType()) != n7 || (n18 = (int)(Intrinsics.areEqual(string3, object4 = xmlPullParser.getName()) ? 1 : 0)) == 0 || (n18 = object3 instanceof q) == 0) break block43;
                            object4 = "type";
                            try {
                                object4 = object2.getAttributeValue(null, (String)object4);
                                object6 = "fallback_index";
                                object6 = object2.getAttributeValue(null, (String)object6);
                                n17 = TextUtils.isEmpty((CharSequence)object4);
                                if (n17 == 0) {
                                    d2.d = object4;
                                }
                            }
                            catch (Exception exception) {
                                break block43;
                            }
                            {
                                if ((n18 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0)) == 0) {
                                    Intrinsics.checkNotNull(object6);
                                    n18 = Integer.parseInt((String)object6);
                                    d2.e = object4 = Integer.valueOf(n18);
                                }
                                object4 = object3;
                                object4 = (q)object3;
                                Intrinsics.checkNotNull(object6);
                                n16 = Integer.parseInt((String)object6);
                                ((q)object4).d = object6 = Integer.valueOf(n16);
                            }
                        }
                        xmlPullParser.next();
                        object4 = xmlPullParser.getName();
                        n16 = xmlPullParser.getEventType();
                        n17 = 1;
                        if (n16 != n7 || !(bl3 = Intrinsics.areEqual(object6 = "AdVerifications", object4))) break block47;
                        while (true) {
                            String string6;
                            block48: {
                                String string7;
                                String string8;
                                block50: {
                                    block51: {
                                        block49: {
                                            boolean bl4;
                                            xmlPullParser.next();
                                            string6 = xmlPullParser.getName();
                                            int n19 = xmlPullParser.getEventType();
                                            if (n19 != n7 || !(bl4 = Intrinsics.areEqual(string8 = "Verification", string6))) break block48;
                                            string7 = object2.getAttributeValue(null, "vendor");
                                            n4 = (int)(kotlin.text.b.i(string7, (String)(object5 = "Moat"), n17 != 0) ? 1 : 0);
                                            if (n4 != 0) {
                                                object5 = new ArrayList();
                                                d2.a = object5;
                                                while (true) {
                                                    String string9;
                                                    xmlPullParser.next();
                                                    object5 = xmlPullParser.getName();
                                                    n15 = xmlPullParser.getEventType();
                                                    if (n15 == n7 && (n15 = (int)(Intrinsics.areEqual(string9 = "ViewableImpression", object5) ? 1 : 0)) != 0) {
                                                        int n20;
                                                        string9 = object2.getAttributeValue(null, "id");
                                                        string4 = t.g(xmlPullParser);
                                                        n7 = n20 = string4.length() + -1;
                                                        n17 = 0;
                                                        boolean bl5 = false;
                                                        while (n17 <= n7) {
                                                            n3 = !bl5 ? n17 : n7;
                                                            n3 = string4.charAt(n3);
                                                            n14 = 32;
                                                            if ((n3 = Intrinsics.compare(n3, n14)) <= 0) {
                                                                n3 = 1;
                                                            } else {
                                                                n3 = 0;
                                                                object2 = null;
                                                            }
                                                            if (!bl5) {
                                                                if (n3 == 0) {
                                                                    bl5 = true;
                                                                } else {
                                                                    ++n17;
                                                                }
                                                            } else {
                                                                if (n3 == 0) break;
                                                                n7 += -1;
                                                            }
                                                            object2 = xmlPullParser;
                                                            object3 = object;
                                                        }
                                                        if ((n14 = (int)(TextUtils.isEmpty((CharSequence)(object2 = com.jio.jioads.adinterfaces.a.a(n7, n3 = 1, n17, string4))) ? 1 : 0)) == 0) {
                                                            object3 = "<ViewableImpression id=\"";
                                                            string5 = "\">\n";
                                                            string4 = "</ViewableImpression>";
                                                            object2 = uc0_0.a((String)object3, string9, string5, (String)object2, string4);
                                                        } else {
                                                            n3 = 0;
                                                            object2 = null;
                                                        }
                                                        if (object2 != null && (object3 = d2.a) != null) {
                                                            object3.add(object2);
                                                        }
                                                    }
                                                    if ((n3 = xmlPullParser.getEventType()) == (n14 = 3) && (n3 = (int)(Intrinsics.areEqual(string8, object5) ? 1 : 0)) != 0) break;
                                                    object3 = object;
                                                    n7 = 2;
                                                    n10 = 0;
                                                    string4 = null;
                                                    n17 = 1;
                                                    object2 = xmlPullParser;
                                                }
                                            }
                                            if ((n3 = (int)(TextUtils.isEmpty((CharSequence)string7) ? 1 : 0)) != 0) break block49;
                                            Intrinsics.checkNotNull(string7);
                                            object2 = "iabtech";
                                            n14 = 1;
                                            n3 = StringsKt.F(string7, (CharSequence)object2, n14 != 0);
                                            if (n3 != 0) break block50;
                                            break block51;
                                        }
                                        n14 = 1;
                                    }
                                    Intrinsics.checkNotNull(string7);
                                    object2 = "omid";
                                    n3 = StringsKt.F(string7, (CharSequence)object2, n14 != 0);
                                    if (n3 == 0) break block48;
                                }
                                object2 = new h();
                                ((h)object2).a = string7;
                                do {
                                    xmlPullParser.next();
                                    object3 = xmlPullParser.getName();
                                    n4 = xmlPullParser.getEventType();
                                    n7 = 2;
                                    if (n4 == n7 && (n4 = (int)(Intrinsics.areEqual(object5 = "JavaScriptResource", object3) ? 1 : 0)) != 0) {
                                        object5 = xmlPullParser.nextText();
                                        n7 = xmlPullParser.getEventType();
                                        if (n7 != (n10 = 3)) {
                                            xmlPullParser.nextTag();
                                        }
                                        Intrinsics.checkNotNull(object5);
                                        ((h)object2).c = object5;
                                    }
                                    if ((n4 = xmlPullParser.getEventType()) != (n7 = 2) || (n4 = (int)(Intrinsics.areEqual(object5 = "VerificationParameters", object3) ? 1 : 0)) == 0) continue;
                                    object5 = xmlPullParser.nextText();
                                    n7 = xmlPullParser.getEventType();
                                    if (n7 != (n10 = 3)) {
                                        xmlPullParser.nextTag();
                                    }
                                    Intrinsics.checkNotNull(object5);
                                    ((h)object2).b = object5 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
                                } while ((n4 = xmlPullParser.getEventType()) != (n7 = 3) || (n14 = (int)(Intrinsics.areEqual(string8, object3) ? 1 : 0)) == 0);
                                object3 = d2.f;
                                if (object3 != null) {
                                    object3.add(object2);
                                }
                            }
                            if ((n3 = xmlPullParser.getEventType()) == (n14 = 3) && (n3 = (int)(Intrinsics.areEqual(object6, string6) ? 1 : 0)) != 0) break;
                            object3 = object;
                            n7 = 2;
                            n10 = 0;
                            string4 = null;
                            n17 = 1;
                            object2 = xmlPullParser;
                        }
                    }
                    if ((n3 = xmlPullParser.getEventType()) == (n14 = 2) && (n3 = (int)(Intrinsics.areEqual(object2 = "deeplinkurl", object4) ? 1 : 0)) != 0) {
                        object2 = t.g(xmlPullParser);
                        n14 = ((String)object2).length() - 1;
                        n4 = 0;
                        object5 = null;
                        n7 = 0;
                        string5 = null;
                        while (n7 <= n14) {
                            n10 = n4 == 0 ? n7 : n14;
                            n10 = ((String)object2).charAt(n10);
                            n16 = 32;
                            if ((n10 = Intrinsics.compare(n10, n16)) <= 0) {
                                n10 = 1;
                            } else {
                                n10 = 0;
                                string4 = null;
                            }
                            if (n4 == 0) {
                                if (n10 == 0) {
                                    n4 = 1;
                                    continue;
                                }
                                ++n7;
                                continue;
                            }
                            if (n10 == 0) break;
                            n14 += -1;
                        }
                        n4 = 1;
                        d2.b = object2 = com.jio.jioads.adinterfaces.a.a(n14, n4, n7, (String)object2);
                    }
                    if ((n3 = xmlPullParser.getEventType()) == (n14 = 2) && (n3 = (int)(Intrinsics.areEqual(object2 = "brandurl", object4) ? 1 : 0)) != 0) {
                        object2 = t.g(xmlPullParser);
                        n4 = ((String)object2).length();
                        n7 = 1;
                        n10 = n4 - n7;
                        n4 = 0;
                        object5 = null;
                        n16 = 0;
                        object6 = null;
                        while (n16 <= n10) {
                            n17 = n4 == 0 ? n16 : n10;
                            n17 = ((String)object2).charAt(n17);
                            n15 = 32;
                            n17 = Intrinsics.compare(n17, n15);
                            n17 = n17 <= 0 ? 1 : 0;
                            if (n4 == 0) {
                                if (n17 == 0) {
                                    n4 = 1;
                                    continue;
                                }
                                ++n16;
                                continue;
                            }
                            if (n17 == 0) break;
                            n10 += -1;
                        }
                        n4 = 1;
                        d2.c = object2 = com.jio.jioads.adinterfaces.a.a(n10, n4, n16, (String)object2);
                    }
                    if ((n3 = xmlPullParser.getEventType()) == (n4 = 3) && (n3 = (int)(Intrinsics.areEqual(string3, object4) ? 1 : 0)) != 0) {
                        arrayList2.add(d2);
                        break;
                    }
                    object3 = object;
                    n7 = 2;
                    n10 = 0;
                    string4 = null;
                    object2 = xmlPullParser;
                }
            }
            n3 = xmlPullParser.getEventType();
            if (n3 == n4 && (n3 = (int)(Intrinsics.areEqual(object2 = "Extensions", string2) ? 1 : 0)) != 0) {
                return;
            }
            object2 = xmlPullParser;
        }
    }

    public static String g(XmlPullParser xmlPullParser) {
        String string2 = "parser";
        Intrinsics.checkNotNullParameter(xmlPullParser, string2);
        int n3 = xmlPullParser.next();
        int n4 = 4;
        if (n3 == n4) {
            string2 = xmlPullParser.getText();
            String string3 = "getText(...)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            xmlPullParser.nextTag();
        } else {
            string2 = "";
        }
        return string2;
    }

    public static void h(XmlPullParser xmlPullParser, ArrayList arrayList) {
        String string2;
        String string3;
        boolean bl2;
        int n3;
        int n4;
        do {
            int n7;
            boolean bl3;
            xmlPullParser.next();
            string2 = xmlPullParser.getName();
            n4 = xmlPullParser.getEventType();
            int n8 = 2;
            n3 = 3;
            if (n4 != n8 || !(bl3 = Intrinsics.areEqual(string3 = "Verification", string2)) || arrayList == null) continue;
            bl3 = false;
            String string4 = xmlPullParser.getAttributeValue(null, "vendor");
            h h3 = new h();
            h3.a = string4;
            do {
                int n10;
                String string5;
                xmlPullParser.next();
                string4 = xmlPullParser.getName();
                n7 = xmlPullParser.getEventType();
                if (n7 == n8 && (n7 = (int)(Intrinsics.areEqual(string5 = "JavaScriptResource", string4) ? 1 : 0)) != 0) {
                    string5 = xmlPullParser.nextText();
                    n10 = xmlPullParser.getEventType();
                    if (n10 != n3) {
                        xmlPullParser.nextTag();
                    }
                    Intrinsics.checkNotNull(string5);
                    h3.c = string5;
                }
                if ((n7 = xmlPullParser.getEventType()) != n8 || (n7 = (int)(Intrinsics.areEqual(string5 = "VerificationParameters", string4) ? 1 : 0)) == 0) continue;
                string5 = xmlPullParser.nextText();
                n10 = xmlPullParser.getEventType();
                if (n10 != n3) {
                    xmlPullParser.nextTag();
                }
                Intrinsics.checkNotNull(string5);
                h3.b = string5 = ((Object)StringsKt.m0(string5)).toString();
            } while ((n7 = xmlPullParser.getEventType()) != n3 || !(bl3 = Intrinsics.areEqual(string3, string4)));
            arrayList.add(h3);
        } while ((n4 = xmlPullParser.getEventType()) != n3 || !(bl2 = Intrinsics.areEqual(string3 = "AdVerifications", string2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m a(Integer object, String object2, String string2, String object3) {
        Exception exception2;
        String string3;
        block10: {
            block9: {
                block8: {
                    block7: {
                        string3 = "message";
                        String string4 = "xmlString";
                        Intrinsics.checkNotNullParameter(object2, string4);
                        this.c = string2;
                        this.d = object3;
                        this.e = object;
                        Intrinsics.checkNotNullParameter(object2, string4);
                        object = null;
                        try {
                            string2 = XmlPullParserFactory.newInstance();
                            object3 = "newInstance(...)";
                            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                            boolean bl2 = true;
                            string2.setNamespaceAware(bl2);
                            string2 = string2.newPullParser();
                        }
                        catch (XmlPullParserException xmlPullParserException) {
                            string2 = null;
                            break block7;
                        }
                        try {
                            object3 = new StringReader((String)object2);
                            string2.setInput((Reader)object3);
                            break block8;
                        }
                        catch (XmlPullParserException xmlPullParserException) {}
                    }
                    object3 = Utility.INSTANCE;
                    Intrinsics.checkNotNullParameter(((Utility)object3).printStacktrace((Exception)object2), string3);
                    JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                    object2 = JioAds$LogLevel.NONE;
                }
                try {
                    object2 = new m();
                    this.a = object2;
                    if (string2 == null) break block9;
                    string2.nextTag();
                    object2 = "VAST";
                    object3 = string2.getName();
                    boolean bl3 = ((String)object2).equalsIgnoreCase((String)object3);
                    if (!bl3) break block9;
                    object2 = this.a;
                    object3 = "version";
                    if (object2 != null) {
                        string2.getAttributeValue(null, (String)object3);
                    }
                    string2.getAttributeValue(null, (String)object3);
                    this.e((XmlPullParser)string2);
                }
                catch (Exception exception2) {
                    break block10;
                }
            }
            object = this.a;
            Intrinsics.checkNotNull(object);
            return object;
        }
        object2 = Utility.INSTANCE;
        Intrinsics.checkNotNullParameter(((Utility)object2).printStacktrace(exception2), string3);
        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        object = JioAds$LogLevel.NONE;
        object = this.a;
        if (object == null) return new m();
        Intrinsics.checkNotNull(object);
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(XmlPullParser var1_1, ArrayList var2_2) {
        var3_3 /* !! */  = var1_1;
        var4_4 = var2_2;
        while (true) {
            block68: {
                var5_5 = var1_1.getName();
                var6_6 = "Creatives";
                var7_7 = var6_6.equalsIgnoreCase((String)var5_5);
                var8_8 = 3;
                if (var7_7 != 0 && (var7_7 = var1_1.getEventType()) == var8_8) {
                    return;
                }
                var9_9 = "Creative";
                var5_5 = var1_1.getName();
                var7_7 = (int)var9_9.equalsIgnoreCase((String)var5_5);
                if (var7_7 == 0 || (var7_7 = var1_1.getEventType()) != (var10_10 = 2) || var4_4 == null) break block68;
                var5_5 = new c();
                var11_11 = new ArrayList();
                var5_5.d = var11_11;
                block1: while (true) {
                    block71: {
                        block72: {
                            block69: {
                                block70: {
                                    if ((var12_12 = var1_1.next()) == var8_8 && (var12_12 = (int)var9_9.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) {
                                        var4_4.add(var5_5);
                                        break;
                                    }
                                    var11_11 = var1_1.getName();
                                    var14_14 = var1_1.getEventType();
                                    if (var14_14 != var10_10) continue;
                                    var14_14 = var1_1.getEventType();
                                    if (var14_14 == var10_10) {
                                        var13_13 = "id";
                                        var14_14 = (int)var13_13.equalsIgnoreCase((String)var11_11);
                                        if (var14_14 != 0) {
                                            var13_13 = var1_1.nextText();
                                            var15_15 = var1_1.getEventType();
                                            if (var15_15 != var8_8) {
                                                var1_1.nextTag();
                                            }
                                            Intrinsics.checkNotNull(var13_13);
                                            var5_5.b = var13_13;
                                        } else {
                                            var13_13 = "sequence";
                                            var14_14 = (int)var13_13.equalsIgnoreCase((String)var11_11);
                                            if (var14_14 != 0) {
                                                var13_13 = var1_1.nextText();
                                                var15_15 = var1_1.getEventType();
                                                if (var15_15 != var8_8) {
                                                    var1_1.nextTag();
                                                }
                                                Intrinsics.checkNotNull(var13_13);
                                                var5_5.a = var13_13;
                                            }
                                        }
                                    }
                                    var13_13 = "Linear";
                                    var15_15 = var13_13.equalsIgnoreCase((String)var11_11);
                                    var16_16 = 1;
                                    var17_17 = 0;
                                    var18_18 = null;
                                    if (var15_15 == 0) break block69;
                                    var19_19 = new f();
                                    var11_11 = new ArrayList();
                                    var19_19.c = var11_11;
                                    var11_11 = new ArrayList();
                                    var19_19.b = var11_11;
                                    var19_19.a = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "skipoffset");
                                    block2: while (true) {
                                        if ((var12_12 = var1_1.next()) == var8_8 && (var12_12 = (int)var13_13.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) {
                                            var5_5.c = var19_19;
                                            continue block1;
                                        }
                                        var12_12 = var1_1.getEventType();
                                        if (var12_12 != var10_10) continue;
                                        var11_11 = var1_1.getName();
                                        var20_20 = var1_1.getEventType();
                                        if (var20_20 == var10_10 && (var20_20 = (int)(var21_21 = "Duration").equalsIgnoreCase((String)var11_11))) {
                                            var21_21 = var1_1.nextText();
                                            var22_22 = var1_1.getEventType();
                                            if (var22_22 != var8_8) {
                                                var1_1.nextTag();
                                            }
                                            Intrinsics.checkNotNull(var21_21);
                                            var19_19.d = var21_21;
                                        }
                                        if ((var22_22 = (var21_21 = "MediaFiles").equalsIgnoreCase((String)var11_11)) != 0) {
                                            block3: while (true) {
                                                if ((var12_12 = var1_1.next()) == var8_8 && (var12_12 = (int)var21_21.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) continue block2;
                                                var12_12 = var1_1.getEventType();
                                                if (var12_12 != var10_10 || (var12_12 = var1_1.getEventType()) != var10_10 || (var12_12 = (int)(var23_23 = "MediaFile").equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) == 0) continue;
                                                var11_11 = var19_19.b;
                                                var24_24 = new g();
                                                if (var11_11 != null) {
                                                    var11_11.add(var24_24);
                                                }
                                                while (true) {
                                                    var11_11 = var1_1.getName();
                                                    var25_25 = var1_1.getEventType();
                                                    if (var25_25 == var10_10 && (var12_12 = (int)var23_23.equalsIgnoreCase((String)var11_11)) != 0) {
                                                        var24_24.e = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "width");
                                                        var24_24.f = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "height");
                                                        var24_24.g = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "type");
                                                        var24_24.a = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "delivery");
                                                        var24_24.b = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "bitrate");
                                                        var24_24.c = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "minBitrate");
                                                        var24_24.d = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "maxBitrate");
                                                        var24_24.h = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "scalable");
                                                        var24_24.i = var11_11 = var3_3 /* !! */ .getAttributeValue(null, "maintainAspectRatio");
                                                    }
                                                    if ((var12_12 = var1_1.getEventType()) == var10_10 && (var12_12 = (int)var23_23.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) {
                                                        var11_11 = var1_1.nextText();
                                                        var25_25 = var1_1.getEventType();
                                                        if (var25_25 != var8_8) {
                                                            var1_1.nextTag();
                                                        }
                                                        Intrinsics.checkNotNull(var11_11);
                                                        var25_25 = var11_11.length();
                                                        if (var25_25 > 0) {
                                                            var25_25 = var11_11.length() - var16_16;
                                                            var26_26 = 0;
                                                            var27_27 = null;
                                                            var28_28 = false;
                                                            block5: while (var26_26 <= var25_25) {
                                                                var16_16 = var28_28 == false ? var26_26 : var25_25;
                                                                var16_16 = var11_11.charAt(var16_16);
                                                                var17_17 = 32;
                                                                if ((var16_16 = Intrinsics.compare(var16_16, var17_17)) <= 0) {
                                                                    var16_16 = 1;
                                                                } else {
                                                                    var16_16 = 0;
                                                                    var29_29 = null;
                                                                }
                                                                if (!var28_28) {
                                                                    if (var16_16 == 0) {
                                                                        var16_16 = 1;
                                                                        var17_17 = 0;
                                                                        var18_18 = null;
                                                                        var28_28 = true;
                                                                        continue;
                                                                    }
                                                                    ++var26_26;
lbl129:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var16_16 = 1;
                                                                        var17_17 = 0;
                                                                        var18_18 = null;
                                                                        continue block5;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var16_16 == 0) break;
                                                                var25_25 += -1;
                                                                ** continue;
                                                            }
                                                            var16_16 = 1;
                                                            var24_24.j = var11_11 = com.jio.jioads.adinterfaces.a.a(var25_25, var16_16, var26_26, (String)var11_11);
                                                        }
                                                    }
                                                    if ((var12_12 = var1_1.getEventType()) == var8_8 && (var12_12 = (int)var23_23.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) {
                                                        var16_16 = 1;
                                                        var17_17 = 0;
                                                        var18_18 = null;
                                                        continue block3;
                                                    }
                                                    var1_1.next();
                                                    var16_16 = 1;
                                                    var17_17 = 0;
                                                    var18_18 = null;
                                                }
                                                break;
                                            }
                                        }
                                        var27_27 = "TrackingEvents";
                                        var16_16 = var27_27.equalsIgnoreCase((String)var11_11);
                                        if (var16_16 == 0) break;
                                        while (true) {
                                            if ((var12_12 = var1_1.next()) == var8_8 && (var12_12 = (int)var27_27.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) lbl-1000:
                                            // 4 sources

                                            {
                                                while (true) {
                                                    var16_16 = 1;
                                                    var17_17 = 0;
                                                    var18_18 = null;
                                                    continue block2;
                                                    break;
                                                }
                                            }
                                            var12_12 = var1_1.getEventType();
                                            if (var12_12 != var10_10 || (var12_12 = (int)(var29_29 = "Tracking").equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) == 0) continue;
                                            var17_17 = 0;
                                            var29_29 = var3_3 /* !! */ .getAttributeValue(null, "event");
                                            var18_18 = var1_1.nextText();
                                            var20_20 = var1_1.getEventType();
                                            if (var20_20 != var8_8) {
                                                var1_1.nextTag();
                                            }
                                            Intrinsics.checkNotNull(var18_18);
                                            var11_11 = new i((String)var29_29, (String)var18_18);
                                            var29_29 = var19_19.c;
                                            if (var29_29 == null) continue;
                                            var29_29.add(var11_11);
                                        }
                                        break;
                                    }
                                    var27_27 = "VideoClicks";
                                    var16_16 = var27_27.equalsIgnoreCase((String)var11_11);
                                    if (var16_16 == 0) break block70;
                                    var29_29 = new Object();
                                    var12_12 = 0;
                                    var29_29.a = null;
                                    var29_29.b = null;
                                    var29_29.b = var11_11 = new ArrayList();
                                    var19_19.e = var29_29;
                                    while (true) {
                                        if ((var12_12 = var1_1.next()) == var8_8 && (var12_12 = (int)var27_27.equalsIgnoreCase((String)(var11_11 = var1_1.getName()))) != 0) ** GOTO lbl-1000
                                        var12_12 = var1_1.getEventType();
                                        if (var12_12 == var10_10 && (var12_12 = (int)kotlin.text.b.i((String)(var11_11 = var1_1.getName()), (String)(var18_18 = "ClickThrough"), (boolean)(var20_20 = 1))) != 0) {
                                            var11_11 = var1_1.nextText();
                                            var17_17 = var1_1.getEventType();
                                            if (var17_17 != var8_8) {
                                                var1_1.nextTag();
                                            }
                                            Intrinsics.checkNotNull(var11_11);
                                            var29_29.a = var11_11;
                                            continue;
                                        }
                                        var12_12 = var1_1.getEventType();
                                        if (var12_12 != var10_10 || (var12_12 = (int)kotlin.text.b.i((String)(var11_11 = var1_1.getName()), (String)(var18_18 = "ClickTracking"), (boolean)(var20_20 = 1))) == 0 || (var11_11 = var29_29.b) == null) continue;
                                        var21_21 = var1_1.nextText();
                                        var22_22 = var1_1.getEventType();
                                        if (var22_22 != var8_8) {
                                            var1_1.nextTag();
                                        }
                                        Intrinsics.checkNotNull(var21_21);
                                        var18_18 = new a(var21_21);
                                        var11_11.add(var18_18);
                                    }
                                }
                                var27_27 = "AdParameters";
                                var12_12 = (int)var27_27.equalsIgnoreCase((String)var11_11);
                                if (var12_12 == 0) ** GOTO lbl-1000
                                var30_30 = 32767;
                                var11_11 = new AdMetaData$AdParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, var30_30, null);
                                while ((var26_26 = var1_1.next()) != var8_8) {
                                    var26_26 = var1_1.getEventType();
                                    if (var26_26 != var10_10) continue;
                                    var27_27 = var1_1.getName();
                                    Intrinsics.checkNotNullExpressionValue(var27_27, "getName(...)");
                                    var29_29 = "jtitle";
                                    var17_17 = 1;
                                    var16_16 = kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setAdTitle((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jctatext";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setVideoCtaText((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jopeninapp";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setOpenInApp((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jctabuttoncolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setVideoButtonColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jctatextcolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setVideoCtaColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jicon";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setIconUrl((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jdesc";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setAdDescription((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jtitlecolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setTitleTextColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jdesccolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setDescriptionTextColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jsecctatext";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setSecondaryCtaText((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jsecctatextcolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setSecondaryCtaTextColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jsecctabuttoncolor";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setSecondaryCtaButtonColor((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jsecctatracking";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setSecondaryCtaUrlTracker((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "jsecctaurl";
                                    var16_16 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var16_16 != 0) {
                                        var27_27 = t.g(var1_1);
                                        var11_11.setSecondaryCtaUrl((String)var27_27);
                                        continue;
                                    }
                                    var29_29 = "ctaUrl";
                                    var26_26 = (int)kotlin.text.b.i((String)var27_27, (String)var29_29, (boolean)var17_17);
                                    if (var26_26 != 0) {
                                        Intrinsics.checkNotNullParameter(var3_3 /* !! */ , "xmlPullParser");
                                        var31_31 = 7;
                                        var25_25 = 0;
                                        var17_17 = 0;
                                        var18_18 = null;
                                        var20_20 = 0;
                                        var21_21 = null;
                                        var22_22 = 0;
                                        var23_23 = null;
                                        var29_29 = var27_27;
                                        var27_27 = new CtaUrl(null, null, null, var31_31, null);
                                        while ((var16_16 = var1_1.next()) != var8_8) {
                                            var16_16 = var1_1.getEventType();
                                            if (var16_16 == var10_10) {
                                                var29_29 = var1_1.getName();
                                                var16_16 = (int)kotlin.text.b.i((String)var29_29, (String)(var18_18 = "deeplink"), (boolean)(var20_20 = 1));
                                                if (var16_16 != 0) {
                                                    var29_29 = t.g(var1_1);
                                                    var27_27.setDeeplink((String)var29_29);
                                                }
                                            } else {
                                                var20_20 = 1;
                                            }
                                            if ((var16_16 = var1_1.getEventType()) != var10_10 || (var16_16 = (int)kotlin.text.b.i((String)(var29_29 = var1_1.getName()), (String)(var18_18 = "fallback"), (boolean)var20_20)) == 0) continue;
                                            var29_29 = t.g(var1_1);
                                            var27_27.setFallback((String)var29_29);
                                        }
                                        var11_11.setCtaUrl((CtaUrl)var27_27);
                                        continue;
                                    }
                                    var26_26 = var1_1.getEventType();
                                    if (var26_26 == var10_10) {
                                        var20_20 = 1;
                                        while (var20_20) {
                                            var26_26 = var1_1.next();
                                            if (var26_26 != var10_10) {
                                                if (var26_26 != var8_8) continue;
                                                var20_20 += -1;
                                                continue;
                                            }
                                            var20_20 += 1;
                                        }
                                        continue;
                                    }
                                    var4_4 = "Check failed.".toString();
                                    var3_3 /* !! */  = new IllegalStateException((String)var4_4);
                                    throw var3_3 /* !! */ ;
                                }
                                var19_19.f = var11_11;
                                ** continue;
                            }
                            var13_13 = "CompanionAds";
                            var14_14 = (int)var13_13.equalsIgnoreCase((String)var11_11);
                            if (var14_14 != 0) {
                                var11_11 = (ArrayList<E>)var5_5.d;
                                var13_13 = this;
                                this.f(var3_3 /* !! */ , (ArrayList)var11_11);
                                continue;
                            }
                            var13_13 = this;
                            var19_19 = "UniversalAdId";
                            var12_12 = (int)var19_19.equalsIgnoreCase((String)var11_11);
                            if (var12_12 == 0 || (var12_12 = (int)TextUtils.isEmpty((CharSequence)(var11_11 = var5_5.e))) == 0) continue;
                            var15_15 = 0;
                            var11_11 = var3_3 /* !! */ .getAttributeValue(null, "idRegistry");
                            var19_19 = var1_1.nextText();
                            var26_26 = var1_1.getEventType();
                            if (var26_26 != var8_8) {
                                var1_1.nextTag();
                            }
                            Intrinsics.checkNotNull(var19_19);
                            var27_27 = "unknown";
                            var16_16 = 0;
                            var29_29 = null;
                            var17_17 = StringsKt.F((CharSequence)var19_19, (CharSequence)var27_27, false);
                            var21_21 = "";
                            if (var17_17) break block71;
                            if (var11_11 == null || !(var17_17 = var11_11.length())) break block72;
                            Intrinsics.checkNotNull(var11_11);
                            var26_26 = (int)StringsKt.F((CharSequence)var11_11, (CharSequence)var27_27, false);
                            if (var26_26 != 0) break block71;
                        }
                        var27_27 = "\\n";
                        var16_16 = 1;
                        var19_19 = kotlin.text.b.n((String)var19_19, (String)var27_27, var21_21, (boolean)var16_16);
                        if (var11_11 != null && (var17_17 = var11_11.length())) {
                            Intrinsics.checkNotNull(var11_11);
                            var21_21 = kotlin.text.b.n((String)var11_11, (String)var27_27, var21_21, (boolean)var16_16);
                        }
                        var11_11 = new StringBuilder();
                        Intrinsics.checkNotNull(var21_21);
                        var27_27 = StringsKt.m0(var21_21).toString();
                        var11_11.append((String)var27_27);
                        var26_26 = 95;
                        var11_11.append((char)var26_26);
                        var19_19 = StringsKt.m0((CharSequence)var19_19).toString();
                        var11_11.append((String)var19_19);
                        var5_5.e = var11_11 = var11_11.toString();
                        continue;
                    }
                    var5_5.e = var21_21;
                }
            }
            var13_13 = this;
            var1_1.next();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public final void e(XmlPullParser var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.a;
        var5_5 = "<set-?>";
        if (var4_4 != null) {
            var6_6 = new ArrayList();
            Intrinsics.checkNotNullParameter(var6_6, (String)var5_5);
            var4_4.c = var6_6;
        }
        block0: while (true) {
            if ((var7_7 = var1_1.next()) == (var8_8 = 3) && (var7_7 = (int)(var9_9 = "VAST").equalsIgnoreCase((String)(var4_4 = var1_1.getName()))) != 0) {
                return;
            }
            var7_7 = var1_1.getEventType();
            if (var7_7 != (var10_10 = 2)) continue;
            var11_11 = "Error";
            var4_4 = var1_1.getName();
            var12_12 = var11_11.equalsIgnoreCase((String)var4_4);
            if (var12_12 != 0 && (var12_12 = var1_1.getEventType()) == var10_10) {
                var4_4 = var2_2.a;
                if (var4_4 == null) continue;
                var4_4 = var1_1.nextText();
                var10_10 = var1_1.getEventType();
                if (var10_10 != var8_8) {
                    var1_1.nextTag();
                }
                Intrinsics.checkNotNull(var4_4);
                Intrinsics.checkNotNullParameter(var4_4, (String)var5_5);
                continue;
            }
            var13_13 = "Ad";
            var7_7 = (int)var13_13.equalsIgnoreCase((String)var4_4);
            if (var7_7 == 0 || (var7_7 = var1_1.getEventType()) != var10_10) continue;
            var4_4 = new j();
            var14_14 = var2_2.c;
            var4_4.i = var14_14;
            var14_14 = var2_2.d;
            var4_4.j = var14_14;
            var4_4.s = var14_14 = var2_2.e;
            var14_14 = null;
            var15_15 = "id";
            var16_16 = var3_3.getAttributeValue(null, (String)var15_15);
            var4_4.h = var16_16;
            if (var16_16 != null) {
                var2_2.b = var16_16;
            }
            var16_16 = "adType";
            var17_17 = var3_3.getAttributeValue(null, (String)var16_16);
            var4_4.q = var17_17;
            var17_17 = "sequence";
            var18_18 = var3_3.getAttributeValue(null, (String)var17_17);
            if (var18_18 == null) {
                var19_19 = 0;
                var17_17 = null;
            } else {
                var17_17 = var3_3.getAttributeValue(null, (String)var17_17);
                var18_18 = "getAttributeValue(...)";
                Intrinsics.checkNotNullExpressionValue(var17_17, var18_18);
                var17_17 = StringsKt.toIntOrNull((String)var17_17);
            }
            var4_4.k = var17_17;
            block1: while (true) {
                block47: {
                    if ((var19_19 = var1_1.next()) == var8_8 && (var19_19 = (int)var13_13.equalsIgnoreCase((String)(var17_17 = var1_1.getName()))) != 0) {
                        var6_6 = var2_2.a;
                        if (var6_6 == null || (var6_6 = var6_6.c) == null) continue block0;
                        var6_6.add(var4_4);
                        continue block0;
                    }
                    var17_17 = var1_1.getName();
                    var20_20 = var1_1.getEventType();
                    if (var20_20 != var10_10) continue;
                    var20_20 = (int)var11_11.equalsIgnoreCase((String)var17_17);
                    if (var20_20 != 0 && (var20_20 = var1_1.getEventType()) == var10_10) {
                        var17_17 = var1_1.nextText();
                        var20_20 = var1_1.getEventType();
                        if (var20_20 != var8_8) {
                            var1_1.nextTag();
                        }
                        Intrinsics.checkNotNull(var17_17);
                        Intrinsics.checkNotNullParameter(var17_17, (String)var5_5);
                        var4_4.l = var17_17;
                        continue;
                    }
                    var20_20 = var1_1.getEventType();
                    if (var20_20 == var10_10 && (var20_20 = (int)var15_15.equalsIgnoreCase((String)var17_17)) != 0) {
                        var17_17 = var1_1.nextText();
                        var20_20 = var1_1.getEventType();
                        if (var20_20 != var8_8) {
                            var1_1.nextTag();
                        }
                        Intrinsics.checkNotNull(var17_17);
                        var4_4.h = var17_17;
                        if (var17_17 == null) continue;
                        var2_2.b = var17_17;
                        continue;
                    }
                    var20_20 = var1_1.getEventType();
                    if (var20_20 == var10_10 && (var20_20 = (int)var16_16.equalsIgnoreCase((String)var17_17)) != 0) {
                        var17_17 = var1_1.nextText();
                        var20_20 = var1_1.getEventType();
                        if (var20_20 != var8_8) {
                            var1_1.nextTag();
                        }
                        Intrinsics.checkNotNull(var17_17);
                        var4_4.q = var17_17;
                        continue;
                    }
                    var18_18 = "inline";
                    var21_21 = var18_18.equalsIgnoreCase((String)var17_17);
                    var22_22 = "AdVerifications";
                    var23_23 = "Extensions";
                    var14_14 = "Creatives";
                    var9_9 = "ViewableImpression";
                    var6_6 = "Impression";
                    if (var21_21 != 0) break block47;
                    var25_25 = var5_5;
                    var26_26 = var13_13;
                    var28_28 = var15_15;
                    var30_30 = var16_16;
                    var5_5 = "Wrapper";
                    var12_12 = (int)var5_5.equalsIgnoreCase((String)var17_17);
                    if (var12_12 != 0) {
                        var13_13 = new Object();
                        var13_13.a = var29_29 = 1;
                        var13_13.b = var29_29;
                        var13_13.c = var29_29;
                        var13_13.d = null;
                        var13_13.e = null;
                        var13_13.f = null;
                        var13_13.g = null;
                        var13_13.h = null;
                        var13_13.i = null;
                        var13_13.j = null;
                        var15_15 = new ArrayList();
                        var13_13.i = var15_15;
                        var15_15 = new ArrayList();
                        var13_13.g = var15_15;
                        var13_13.h = var15_15 = new p();
                        var16_16 = new ArrayList();
                        var15_15.b = var16_16;
                        var15_15 = new ArrayList();
                        var13_13.j = var15_15;
                        var29_29 = var1_1.getEventType();
                        if (var29_29 != (var31_31 = 2) || (var29_29 = (int)Intrinsics.areEqual(var5_5, var15_15 = var1_1.getName())) == 0) break block0;
                        var31_31 = 0;
                        var16_16 = null;
                        var15_15 = var3_3.getAttributeValue(null, "followAdditionalWrappers");
                        var17_17 = "1";
                        var29_29 = (int)Intrinsics.areEqual(var15_15, var17_17);
                        var13_13.a = var29_29;
                        var29_29 = (int)Intrinsics.areEqual(var3_3.getAttributeValue(null, "allowMultipleAds"), var17_17);
                        var13_13.b = var29_29;
                        var15_15 = var3_3.getAttributeValue(null, "fallbackOnNoAd");
                        var29_29 = (int)Intrinsics.areEqual(var15_15, var17_17);
                        var13_13.c = var29_29;
                        break block0;
                    }
                    ** GOTO lbl290
                }
                var24_24 = var4_4.h;
                var17_17 = new e();
                var25_25 = var5_5;
                var5_5 = new ArrayList();
                var17_17.g = var5_5;
                var5_5 = new ArrayList();
                var17_17.f = var5_5;
                var5_5 = new ArrayList();
                var17_17.h = var5_5;
                var5_5 = new ArrayList();
                var17_17.i = var5_5;
                var17_17.j = var5_5 = new p();
                var26_26 = var13_13;
                var13_13 = new ArrayList();
                var5_5.b = var13_13;
                while (true) {
                    block50: {
                        block48: {
                            block53: {
                                block52: {
                                    block51: {
                                        block49: {
                                            if ((var27_27 = var1_1.next()) == (var12_12 = 3) && (var27_27 = (int)var18_18.equalsIgnoreCase((String)(var5_5 = var1_1.getName()))) != 0) {
                                                var4_4.n = var17_17;
                                                var5_5 = var25_25;
                                                var13_13 = var26_26;
                                                break;
                                            }
                                            var5_5 = var1_1.getName();
                                            var12_12 = var1_1.getEventType();
                                            var28_28 = var15_15;
                                            var29_29 = 2;
                                            if (var12_12 != var29_29) continue;
                                            var12_12 = var1_1.getEventType();
                                            if (var12_12 != var29_29) break block48;
                                            var13_13 = "AdSystem";
                                            var12_12 = (int)var13_13.equalsIgnoreCase((String)var5_5);
                                            if (var12_12 == 0) break block49;
                                            var13_13 = new StringBuilder();
                                            var13_13.append(var24_24);
                                            var29_29 = 95;
                                            var13_13.append((char)var29_29);
                                            var15_15 = var1_1.nextText();
                                            var30_30 = var16_16;
                                            var31_31 = var1_1.getEventType();
                                            var32_32 = var18_18;
                                            var20_20 = 3;
                                            if (var31_31 != var20_20) {
                                                var1_1.nextTag();
                                            }
                                            Intrinsics.checkNotNull(var15_15);
                                            var13_13.append((String)var15_15);
                                            var17_17.a = var13_13 = var13_13.toString();
                                            break block50;
                                        }
                                        var30_30 = var16_16;
                                        var32_32 = var18_18;
                                        var13_13 = "AdTitle";
                                        var12_12 = (int)var13_13.equalsIgnoreCase((String)var5_5);
                                        if (var12_12 == 0) break block51;
                                        var13_13 = var1_1.nextText();
                                        var29_29 = var1_1.getEventType();
                                        if (var29_29 != (var31_31 = 3)) {
                                            var1_1.nextTag();
                                        }
                                        Intrinsics.checkNotNull(var13_13);
                                        var17_17.c = var13_13;
                                        break block50;
                                    }
                                    var13_13 = "AdServingId";
                                    var12_12 = (int)var13_13.equalsIgnoreCase((String)var5_5);
                                    if (var12_12 == 0) break block52;
                                    var13_13 = var1_1.nextText();
                                    var29_29 = var1_1.getEventType();
                                    if (var29_29 != (var31_31 = 3)) {
                                        var1_1.nextTag();
                                    }
                                    Intrinsics.checkNotNull(var13_13);
                                    var17_17.e = var13_13;
                                    break block50;
                                }
                                var12_12 = (int)var11_11.equalsIgnoreCase((String)var5_5);
                                if (var12_12 == 0) break block53;
                                var13_13 = var1_1.nextText();
                                var29_29 = var1_1.getEventType();
                                if (var29_29 != (var31_31 = 3)) {
                                    var1_1.nextTag();
                                }
                                Intrinsics.checkNotNull(var13_13);
                                var17_17.b = var13_13;
                                break block50;
                            }
                            var13_13 = "description";
                            var12_12 = (int)var13_13.equalsIgnoreCase((String)var5_5);
                            if (var12_12 != 0) {
                                var13_13 = var1_1.nextText();
                                var29_29 = var1_1.getEventType();
                                if (var29_29 != (var31_31 = 3)) {
                                    var1_1.nextTag();
                                }
                                Intrinsics.checkNotNull(var13_13);
                                var17_17.d = var13_13;
                                break block50;
                            } else {
                                var12_12 = (int)var6_6.equalsIgnoreCase((String)var5_5);
                                if (var12_12 != 0 && (var13_13 = var17_17.f) != null) {
                                    var15_15 = var1_1.nextText();
                                    var31_31 = var1_1.getEventType();
                                    if (var31_31 != (var20_20 = 3)) {
                                        var1_1.nextTag();
                                    }
                                    Intrinsics.checkNotNull(var15_15);
                                    var13_13.add(var15_15);
                                }
                            }
                            break block50;
                        }
                        var30_30 = var16_16;
                        var32_32 = var18_18;
                    }
                    var12_12 = (int)var9_9.equalsIgnoreCase((String)var5_5);
                    if (var12_12 != 0) {
                        var13_13 = var17_17.j;
                        t.b(var3_3, (p)var13_13);
                    }
                    if ((var12_12 = (int)var14_14.equalsIgnoreCase((String)var5_5)) != 0) {
                        var13_13 = (ArrayList)var17_17.g;
                        var2_2.c(var3_3, (ArrayList)var13_13);
                    }
                    if ((var12_12 = (int)var23_23.equalsIgnoreCase((String)var5_5)) != 0) {
                        var13_13 = (ArrayList)var17_17.h;
                        t.d(var3_3, (ArrayList)var13_13, var17_17);
                    }
                    if ((var27_27 = (int)var22_22.equalsIgnoreCase((String)var5_5)) != 0) {
                        var5_5 = (ArrayList)var17_17.i;
                        t.h(var3_3, (ArrayList)var5_5);
                    }
                    var15_15 = var28_28;
                    var16_16 = var30_30;
                    var18_18 = var32_32;
                }
lbl282:
                // 2 sources

                while (true) {
                    var8_8 = 3;
                    var10_10 = 2;
                    var14_14 = null;
                    continue block1;
                    break;
                }
                break;
            }
            break;
        }
        while (true) {
            block56: {
                block55: {
                    block54: {
                        if ((var29_29 = var1_1.next()) != (var31_31 = 3) || (var29_29 = (int)var5_5.equalsIgnoreCase((String)(var15_15 = var1_1.getName()))) == 0) break block54;
                        var4_4.m = var13_13;
lbl290:
                        // 2 sources

                        var5_5 = var25_25;
                        var13_13 = var26_26;
                        var15_15 = var28_28;
                        var16_16 = var30_30;
                        ** continue;
                    }
                    var15_15 = var1_1.getName();
                    var31_31 = var1_1.getEventType();
                    if (var31_31 != (var19_19 = 2)) continue;
                    var31_31 = var1_1.getEventType();
                    if (var31_31 != var19_19) ** GOTO lbl-1000
                    var16_16 = "VASTAdTagURI";
                    var31_31 = (int)var16_16.equalsIgnoreCase((String)var15_15);
                    if (var31_31 == 0) break block55;
                    var16_16 = var1_1.nextText();
                    var20_20 = var1_1.getEventType();
                    if (var20_20 != (var21_21 = 3)) {
                        var1_1.nextTag();
                    }
                    Intrinsics.checkNotNull(var16_16);
                    var13_13.e = var16_16 = StringsKt.m0((CharSequence)var16_16).toString();
                    ** GOTO lbl-1000
                }
                var31_31 = (int)var11_11.equalsIgnoreCase((String)var15_15);
                if (var31_31 == 0) break block56;
                var16_16 = var1_1.nextText();
                var20_20 = var1_1.getEventType();
                if (var20_20 != (var21_21 = 3)) {
                    var1_1.nextTag();
                }
                Intrinsics.checkNotNull(var16_16);
                var13_13.f = var16_16;
                ** GOTO lbl-1000
            }
            var31_31 = (int)var6_6.equalsIgnoreCase((String)var15_15);
            if (var31_31 != 0 && (var16_16 = var13_13.g) != null) {
                var18_18 = var1_1.nextText();
                var21_21 = var1_1.getEventType();
                if (var21_21 != (var19_19 = 3)) {
                    var1_1.nextTag();
                }
                Intrinsics.checkNotNull(var18_18);
                var16_16.add(var18_18);
            } else lbl-1000:
            // 4 sources

            {
                var19_19 = 3;
            }
            var31_31 = (int)var9_9.equalsIgnoreCase((String)var15_15);
            if (var31_31 != 0) {
                var16_16 = var13_13.h;
                t.b(var3_3, (p)var16_16);
            }
            if ((var31_31 = (int)var14_14.equalsIgnoreCase((String)var15_15)) != 0) {
                var16_16 = (ArrayList)var13_13.i;
                var2_2.c(var3_3, (ArrayList)var16_16);
            }
            if ((var31_31 = (int)var23_23.equalsIgnoreCase((String)var15_15)) != 0) {
                var16_16 = (ArrayList)var13_13.j;
                t.d(var3_3, (ArrayList)var16_16, var13_13);
            }
            if ((var29_29 = (int)var22_22.equalsIgnoreCase((String)var15_15)) == 0) continue;
            var29_29 = 0;
            var15_15 = null;
            t.h(var3_3, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(XmlPullParser xmlPullParser, ArrayList arrayList) {
        t t3 = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList2 = arrayList;
        String string2 = "show_for_after_ve";
        String string3 = "show_after_vs";
        int n3 = 0;
        Object object = null;
        int n4 = 0;
        Object object2 = null;
        while (true) {
            Object object3;
            block48: {
                Exception exception2;
                Object object4;
                String string4;
                block51: {
                    CompanionManager companionManager;
                    CharSequence charSequence;
                    Object object5;
                    int n7;
                    int n8;
                    Object object6;
                    int n10;
                    String string5;
                    Object object7;
                    block50: {
                        int n14;
                        block49: {
                            int n15;
                            block52: {
                                block53: {
                                    block54: {
                                        JSONException jSONException2;
                                        block47: {
                                            block46: {
                                                int n16;
                                                if ((n16 = xmlPullParser.next()) == (n15 = 3) && (n16 = (int)(((String)(object7 = "CompanionAds")).equalsIgnoreCase((String)(object3 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                                    return;
                                                }
                                                n16 = xmlPullParser.getEventType();
                                                object7 = "Companion";
                                                string4 = "message";
                                                n14 = 2;
                                                if (n16 == n14 && (n16 = (int)(((String)object7).equalsIgnoreCase((String)(object3 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                                    object2 = new Object();
                                                    ((b)object2).a = null;
                                                    ((b)object2).b = null;
                                                    ((b)object2).c = null;
                                                    ((b)object2).d = null;
                                                    ((b)object2).e = null;
                                                    ((b)object2).f = null;
                                                    ((b)object2).g = null;
                                                    ((b)object2).h = null;
                                                    ((b)object2).i = null;
                                                    ((b)object2).j = null;
                                                    ((b)object2).k = null;
                                                    object3 = new ArrayList();
                                                    ((b)object2).i = object3;
                                                    if (arrayList2 != null) {
                                                        arrayList2.add(object2);
                                                    }
                                                    object3 = new ArrayList();
                                                    ((b)object2).j = object3;
                                                    n16 = xmlPullParser.getEventType();
                                                    if (n16 == n14 && (n16 = (int)(((String)object7).equalsIgnoreCase((String)(object3 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                                        ((b)object2).d = object3 = xmlPullParser2.getAttributeValue(null, "height");
                                                        ((b)object2).e = object3 = xmlPullParser2.getAttributeValue(null, "width");
                                                        ((b)object2).f = object3 = xmlPullParser2.getAttributeValue(null, "id");
                                                        ((b)object2).g = object3 = xmlPullParser2.getAttributeValue(null, "adSlotId");
                                                        object3 = new StringBuilder("adSlotId:");
                                                        string5 = ((b)object2).g;
                                                        ir3_0.b((StringBuilder)object3, string5, string4);
                                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                                        object3 = JioAds$LogLevel.NONE;
                                                    }
                                                }
                                                object3 = object2;
                                                n10 = 1;
                                                if (object2 == null) break block52;
                                                n4 = xmlPullParser.getEventType();
                                                if (n4 == n14 && (n4 = (int)(((String)(object6 = "HTMLResource")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                                    object2 = xmlPullParser.nextText();
                                                    n8 = xmlPullParser.getEventType();
                                                    if (n8 != n15) {
                                                        xmlPullParser.nextTag();
                                                    }
                                                    Intrinsics.checkNotNull(object2);
                                                    ((b)object3).b = object2;
                                                }
                                                if ((n4 = xmlPullParser.getEventType()) != n14 || (n4 = (int)(((String)(object6 = "AdParameters")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) == 0) break block53;
                                                try {
                                                    object6 = xmlPullParser.nextText();
                                                    n7 = xmlPullParser.getEventType();
                                                    if (n7 == n15) break block46;
                                                    xmlPullParser.nextTag();
                                                }
                                                catch (JSONException jSONException2) {
                                                    break block47;
                                                }
                                            }
                                            Intrinsics.checkNotNull(object6);
                                            object2 = new JSONObject((String)object6);
                                            break block54;
                                        }
                                        object6 = new StringBuilder("Exception in parseCompanionAds VastXMLParser ");
                                        object5 = Utility.INSTANCE;
                                        object2 = ((Utility)object5).printStacktrace((Exception)((Object)jSONException2));
                                        ((StringBuilder)object6).append((String)object2);
                                        Intrinsics.checkNotNullParameter(((StringBuilder)object6).toString(), string4);
                                        JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                        object2 = JioAds$LogLevel.NONE;
                                        n4 = 0;
                                        object2 = null;
                                    }
                                    ((b)object3).k = object2;
                                }
                                if ((n4 = xmlPullParser.getEventType()) == n14 && (n4 = (int)(((String)(object6 = "StaticResource")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                    object2 = xmlPullParser.nextText();
                                    n8 = xmlPullParser.getEventType();
                                    if (n8 != n15) {
                                        xmlPullParser.nextTag();
                                    }
                                    Intrinsics.checkNotNull(object2);
                                    ((b)object3).a = object2;
                                }
                                if ((n4 = xmlPullParser.getEventType()) == n14 && (n4 = (int)(((String)(object6 = "IFrameResource")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                    object2 = xmlPullParser.nextText();
                                    n8 = xmlPullParser.getEventType();
                                    if (n8 != n15) {
                                        xmlPullParser.nextTag();
                                    }
                                    Intrinsics.checkNotNull(object2);
                                    ((b)object3).c = object2;
                                }
                                if ((n4 = xmlPullParser.getEventType()) == n14 && (n4 = (int)(kotlin.text.b.i((String)(object2 = xmlPullParser.getName()), (String)(object6 = "CompanionClickThrough"), n10 != 0) ? 1 : 0)) != 0) {
                                    object2 = xmlPullParser.nextText();
                                    n8 = xmlPullParser.getEventType();
                                    if (n8 != n15) {
                                        xmlPullParser.nextTag();
                                    }
                                    Intrinsics.checkNotNull(object2);
                                    ((b)object3).h = object2;
                                }
                                if ((n4 = (int)(((String)(object6 = "TrackingEvents")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) != 0) {
                                    while ((n4 = xmlPullParser.next()) != n15 || (n4 = (int)(((String)object6).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) == 0) {
                                        n4 = xmlPullParser.getEventType();
                                        if (n4 != n14 || (n4 = (int)(((String)(object5 = "Tracking")).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) == 0) continue;
                                        object5 = xmlPullParser2.getAttributeValue(null, "event");
                                        String string6 = xmlPullParser.nextText();
                                        n3 = xmlPullParser.getEventType();
                                        if (n3 != n15) {
                                            xmlPullParser.nextTag();
                                        }
                                        Intrinsics.checkNotNull(string6);
                                        object2 = new i((String)object5, string6);
                                        object = ((b)object3).j;
                                        if (object != null) {
                                            object.add(object2);
                                        }
                                        n3 = 0;
                                        object = null;
                                    }
                                }
                                if ((n4 = xmlPullParser.getEventType()) == n14 && (n4 = (int)(kotlin.text.b.i((String)(object2 = xmlPullParser.getName()), (String)(object = "CompanionClickTracking"), n10 != 0) ? 1 : 0)) != 0 && (object2 = ((b)object3).i) != null) {
                                    charSequence = xmlPullParser.nextText();
                                    n8 = xmlPullParser.getEventType();
                                    if (n8 != n15) {
                                        xmlPullParser.nextTag();
                                    }
                                    Intrinsics.checkNotNull(charSequence);
                                    charSequence = ((Object)StringsKt.m0(charSequence)).toString();
                                    object = new a((String)charSequence);
                                    object2.add(object);
                                }
                            }
                            try {
                                n4 = xmlPullParser.getEventType();
                                if (n4 != n15 || (n4 = (int)(((String)object7).equalsIgnoreCase((String)(object2 = xmlPullParser.getName())) ? 1 : 0)) == 0) break block48;
                                object2 = new com.jio.jioads.companionads.f();
                                object = ((com.jio.jioads.companionads.f)object2).g;
                                if (object3 == null) break block48;
                                object4 = new StringBuilder();
                                object7 = "Companion Ad Params:: ";
                                ((StringBuilder)object4).append((String)object7);
                                object7 = ((b)object3).k;
                                ((StringBuilder)object4).append(object7);
                                object4 = ((StringBuilder)object4).toString();
                                Intrinsics.checkNotNullParameter(object4, string4);
                                object4 = JioAds.Companion;
                                object7 = ((JioAds$Companion)object4).getInstance();
                                ((JioAds)object7).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                                object7 = JioAds$LogLevel.NONE;
                                object7 = ((b)object3).g;
                                charSequence = ((b)object3).e;
                                n14 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
                                if (n14 != 0 || (n14 = (int)(TextUtils.isEmpty((CharSequence)(charSequence = ((b)object3).d)) ? 1 : 0)) != 0) break block49;
                                charSequence = new StringBuilder();
                                object6 = ((b)object3).e;
                                ((StringBuilder)charSequence).append((String)object6);
                                n8 = 120;
                                ((StringBuilder)charSequence).append((char)n8);
                                object6 = ((b)object3).d;
                                ((StringBuilder)charSequence).append((String)object6);
                                charSequence = ((StringBuilder)charSequence).toString();
                                break block50;
                            }
                            catch (Exception exception2) {
                                break block51;
                            }
                        }
                        n14 = 0;
                        charSequence = null;
                    }
                    object6 = ((b)object3).i;
                    if (object6 != null) {
                        n8 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
                        if (n8 == 0) {
                            object6 = ((b)object3).g;
                            Intrinsics.checkNotNull(object6);
                            object5 = ((b)object3).i;
                            ((HashMap)object).put(object6, object5);
                        } else {
                            n8 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
                            if (n8 == 0) {
                                Intrinsics.checkNotNull(charSequence);
                                object6 = ((b)object3).i;
                                ((HashMap)object).put(charSequence, object6);
                            }
                        }
                    }
                    if ((object = ((b)object3).k) != null) {
                        long l2;
                        n3 = (int)(object.has(string3) ? 1 : 0);
                        object6 = "AdslotId:: ";
                        if (n3 == n10) {
                            long l3;
                            object = ((b)object3).k;
                            l2 = object != null && (object = object.getString(string3)) != null ? (l3 = Long.parseLong((String)object)) : 0L;
                            ((com.jio.jioads.companionads.f)object2).a = l2;
                            object = new StringBuilder();
                            object5 = "show_after_vs:: ";
                            ((StringBuilder)object).append((String)object5);
                            object5 = ((b)object3).k;
                            if (object5 != null) {
                                object5 = object5.getString(string3);
                            } else {
                                n7 = 0;
                                object5 = null;
                            }
                            ((StringBuilder)object).append((String)object5);
                            ((StringBuilder)object).append((String)object6);
                            object5 = ((b)object3).g;
                            ((StringBuilder)object).append((String)object5);
                            object = ((StringBuilder)object).toString();
                            Intrinsics.checkNotNullParameter(object, string4);
                            object = ((JioAds$Companion)object4).getInstance();
                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                        if ((object = ((b)object3).k) != null && (n3 = (int)(object.has(string2) ? 1 : 0)) == n10) {
                            object = ((b)object3).k;
                            l2 = object != null && (object = object.getString(string2)) != null ? Long.parseLong((String)object) : 0L;
                            ((com.jio.jioads.companionads.f)object2).b = l2;
                            object = new StringBuilder();
                            string5 = "show_for_after_ve:: ";
                            ((StringBuilder)object).append(string5);
                            string5 = ((b)object3).k;
                            if (string5 != null) {
                                string5 = string5.getString(string2);
                            } else {
                                n10 = 0;
                                string5 = null;
                            }
                            ((StringBuilder)object).append(string5);
                            ((StringBuilder)object).append((String)object6);
                            string5 = ((b)object3).g;
                            ((StringBuilder)object).append(string5);
                            object = ((StringBuilder)object).toString();
                            Intrinsics.checkNotNullParameter(object, string4);
                            object = ((JioAds$Companion)object4).getInstance();
                            ((JioAds)object).getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                        }
                    }
                    if ((object = ((b)object3).b) != null) {
                        ((com.jio.jioads.companionads.f)object2).c = object;
                    } else {
                        object = ((b)object3).c;
                        if (object != null) {
                            ((com.jio.jioads.companionads.f)object2).c = object;
                        } else {
                            object = ((b)object3).a;
                            if (object != null) {
                                object = new StringBuilder();
                                object4 = "<!DOCTYPE html><html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>img {max-width: 100%; height:auto; position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);}</style></head><body><center><img onclick=\"window.open('";
                                ((StringBuilder)object).append((String)object4);
                                object4 = ((b)object3).h;
                                ((StringBuilder)object).append((String)object4);
                                object4 = "')\" src=\"";
                                ((StringBuilder)object).append((String)object4);
                                object4 = ((b)object3).a;
                                ((StringBuilder)object).append((String)object4);
                                object4 = "\"></center></body></html>";
                                ((StringBuilder)object).append((String)object4);
                                ((com.jio.jioads.companionads.f)object2).c = object = ((StringBuilder)object).toString();
                            }
                        }
                    }
                    object = ((b)object3).e;
                    if (object != null) {
                        ((com.jio.jioads.companionads.f)object2).e = n3 = Integer.parseInt((String)object);
                    }
                    if ((object = ((b)object3).d) != null) {
                        ((com.jio.jioads.companionads.f)object2).f = n3 = Integer.parseInt((String)object);
                    }
                    if ((object = ((b)object3).j) != null) {
                        ((com.jio.jioads.companionads.f)object2).d = object;
                    }
                    if ((n3 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0)) == 0) {
                        object = CompanionManager.Companion;
                        companionManager = ((CompanionManager$Companion)object).getInstance();
                        if (companionManager != null) {
                            object = t3.b;
                            object4 = t3.f;
                            companionManager.setJioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((com.jio.jioads.companionads.f)object2, (String)object7, (String)object, (String)object4, null);
                        }
                        break block48;
                    } else {
                        n3 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
                        if (n3 == 0 && (companionManager = ((CompanionManager$Companion)(object = CompanionManager.Companion)).getInstance()) != null) {
                            object = t3.b;
                            object4 = t3.f;
                            companionManager.setJioAdCache$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease((com.jio.jioads.companionads.f)object2, null, (String)object, (String)object4, (String)charSequence);
                        }
                    }
                    break block48;
                }
                object4 = "exception";
                object = new StringBuilder((String)object4);
                object2 = exception2.getStackTrace();
                ((StringBuilder)object).append(object2);
                Intrinsics.checkNotNullParameter(((StringBuilder)object).toString(), string4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
            }
            object2 = object3;
            n3 = 0;
            object = null;
        }
    }
}

