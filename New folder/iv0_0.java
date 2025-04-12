/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from iV0
 */
public final class iv0_0 {
    public static iV0$a a(XmlResourceParser xmlResourceParser, Resources resources) {
        int n3;
        int n4;
        int n7;
        iV0$c[] iV0$cArray = resources;
        do {
            n7 = xmlResourceParser.next();
            n3 = 1;
        } while (n7 != (n4 = 2) && n7 != n3);
        if (n7 == n4) {
            n7 = 0;
            Object object = null;
            String string2 = "font-family";
            xmlResourceParser.require(n4, null, string2);
            ArrayList<Object> arrayList = xmlResourceParser.getName();
            boolean n8 = ((String)((Object)arrayList)).equals(string2);
            if (n8) {
                string2 = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                arrayList = (ArrayList<Object>)R$styleable.FontFamily;
                string2 = iV0$cArray.obtainAttributes((AttributeSet)string2, (int[])arrayList);
                int n10 = R$styleable.FontFamily_fontProviderAuthority;
                arrayList = string2.getString(n10);
                int n14 = R$styleable.FontFamily_fontProviderPackage;
                Object object2 = string2.getString(n14);
                int n15 = R$styleable.FontFamily_fontProviderQuery;
                Object object3 = string2.getString(n15);
                int n16 = R$styleable.FontFamily_fontProviderFallbackQuery;
                String string3 = string2.getString(n16);
                int n17 = R$styleable.FontFamily_fontProviderCerts;
                n17 = string2.getResourceId(n17, 0);
                int n18 = R$styleable.FontFamily_fontProviderFetchStrategy;
                int n19 = string2.getInteger(n18, n3);
                n18 = R$styleable.FontFamily_fontProviderFetchTimeout;
                int n20 = 500;
                int n21 = string2.getInteger(n18, n20);
                n18 = R$styleable.FontFamily_fontProviderSystemFontFamily;
                String string4 = string2.getString(n18);
                string2.recycle();
                int n22 = 3;
                if (arrayList != null && object2 != null && object3 != null) {
                    while ((n3 = xmlResourceParser.next()) != n22) {
                        iv0_0.c(xmlResourceParser);
                    }
                    iV0$cArray = iv0_0.b((Resources)iV0$cArray, n17);
                    if (string3 != null) {
                        object = new gV0((String)((Object)arrayList), (String)object2, string3, (List)iV0$cArray);
                    }
                    iV0$b iV0$b = object;
                    gV0 gV02 = new gV0((String)((Object)arrayList), (String)object2, (String)object3, (List)iV0$cArray);
                    object = new iV0$d(gV02, (gV0)((Object)iV0$b), n19, n21, string4);
                } else {
                    arrayList = new ArrayList<Object>();
                    while ((n14 = xmlResourceParser.next()) != n22) {
                        n14 = xmlResourceParser.getEventType();
                        if (n14 != n4) continue;
                        object2 = xmlResourceParser.getName();
                        n14 = (int)(((String)object2).equals(object3 = "font") ? 1 : 0);
                        if (n14 != 0) {
                            boolean bl2;
                            object2 = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                            object3 = R$styleable.FontFamilyFont;
                            object2 = iV0$cArray.obtainAttributes((AttributeSet)object2, (int[])object3);
                            n15 = R$styleable.FontFamilyFont_fontWeight;
                            n15 = (n15 = (int)(object2.hasValue(n15) ? 1 : 0)) != 0 ? R$styleable.FontFamilyFont_fontWeight : R$styleable.FontFamilyFont_android_fontWeight;
                            n16 = 400;
                            n20 = object2.getInt(n15, n16);
                            n15 = R$styleable.FontFamilyFont_fontStyle;
                            n15 = (int)(object2.hasValue(n15) ? 1 : 0);
                            n15 = n15 != 0 ? R$styleable.FontFamilyFont_fontStyle : R$styleable.FontFamilyFont_android_fontStyle;
                            if (n3 == (n15 = object2.getInt(n15, 0))) {
                                bl2 = true;
                            } else {
                                bl2 = false;
                                string4 = null;
                            }
                            n15 = R$styleable.FontFamilyFont_ttcIndex;
                            n15 = (int)(object2.hasValue(n15) ? 1 : 0);
                            n15 = n15 != 0 ? R$styleable.FontFamilyFont_ttcIndex : R$styleable.FontFamilyFont_android_ttcIndex;
                            n16 = R$styleable.FontFamilyFont_fontVariationSettings;
                            n16 = (int)(object2.hasValue(n16) ? 1 : 0);
                            n16 = n16 != 0 ? R$styleable.FontFamilyFont_fontVariationSettings : R$styleable.FontFamilyFont_android_fontVariationSettings;
                            String string5 = object2.getString(n16);
                            int n24 = object2.getInt(n15, 0);
                            n15 = R$styleable.FontFamilyFont_font;
                            n15 = (int)(object2.hasValue(n15) ? 1 : 0);
                            n15 = n15 != 0 ? R$styleable.FontFamilyFont_font : R$styleable.FontFamilyFont_android_font;
                            int n25 = object2.getResourceId(n15, 0);
                            String string6 = object2.getString(n15);
                            object2.recycle();
                            while ((n14 = xmlResourceParser.next()) != n22) {
                                iv0_0.c(xmlResourceParser);
                            }
                            object2 = new iV0$c(n20, n24, n25, string6, string5, bl2);
                            arrayList.add(object2);
                            continue;
                        }
                        iv0_0.c(xmlResourceParser);
                    }
                    boolean bl3 = arrayList.isEmpty();
                    if (!bl3) {
                        iV0$cArray = new iV0$c[]{};
                        iV0$cArray = arrayList.toArray(iV0$cArray);
                        object = new iV0$b(iV0$cArray);
                    }
                }
            } else {
                iv0_0.c(xmlResourceParser);
            }
            return object;
        }
        iV0$cArray = new XmlPullParserException("No start tag found");
        throw iV0$cArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List b(Resources object, int n3) {
        Throwable throwable2;
        TypedArray typedArray;
        block9: {
            ArrayList arrayList;
            block10: {
                int n4;
                int n7;
                block8: {
                    block7: {
                        if (n3 == 0) {
                            return Collections.emptyList();
                        }
                        typedArray = object.obtainTypedArray(n3);
                        try {
                            int n8 = typedArray.length();
                            if (n8 != 0) break block7;
                            object = Collections.emptyList();
                        }
                        catch (Throwable throwable2) {}
                        typedArray.recycle();
                        return object;
                    }
                    arrayList = new ArrayList();
                    n7 = typedArray.getType(0);
                    n4 = 1;
                    if (n7 != n4) break block8;
                    Object var7_8 = null;
                    break block9;
                    for (n3 = 0; n3 < (n7 = typedArray.length()); ++n3) {
                        n7 = typedArray.getResourceId(n3, 0);
                        if (n7 == 0) continue;
                        String[] stringArray = object.getStringArray(n7);
                        ArrayList<Object> arrayList2 = new ArrayList<Object>();
                        for (Object object2 : stringArray) {
                            object2 = Base64.decode((String)object2, (int)0);
                            arrayList2.add(object2);
                        }
                        arrayList.add(arrayList2);
                    }
                    break block10;
                }
                object = object.getStringArray(n3);
                ArrayList<Object> arrayList3 = new ArrayList<Object>();
                n7 = ((String[])object).length;
                Object var9_12 = null;
                for (n4 = 0; n4 < n7; ++n4) {
                    Object object3 = object[n4];
                    object3 = Base64.decode((String)object3, (int)0);
                    arrayList3.add(object3);
                }
                arrayList.add(arrayList3);
            }
            typedArray.recycle();
            return arrayList;
        }
        typedArray.recycle();
        throw throwable2;
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int n3 = 1;
        while (n3 > 0) {
            int n4;
            int n7 = xmlResourceParser.next();
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

