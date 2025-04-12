/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.os.Build$VERSION
 *  android.util.TypedValue
 */
package com.google.accompanist.appcompattheme;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.TypedValue;
import com.google.accompanist.appcompattheme.FontFamilyWithWeight;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class TypedArrayUtilsKt {
    private static final ThreadLocal tempTypedValue;

    static {
        ThreadLocal threadLocal;
        tempTypedValue = threadLocal = new ThreadLocal();
    }

    private static final tv0_0 fontWeightOf(int n3) {
        tv0_0 tv0_02;
        int n4 = 150;
        if (n3 >= 0 && n3 < n4) {
            tv0_02 = tv0_0.b;
            tv0_02 = tv0_0.b;
        } else {
            int n7 = 250;
            if (n4 <= n3 && n3 < n7) {
                tv0_02 = tv0_0.b;
                tv0_02 = tv0_0.c;
            } else {
                n4 = 350;
                if (n7 <= n3 && n3 < n4) {
                    tv0_02 = tv0_0.b;
                    tv0_02 = tv0_0.d;
                } else {
                    n7 = 450;
                    if (n4 <= n3 && n3 < n7) {
                        tv0_02 = tv0_0.b;
                        tv0_02 = tv0_0.e;
                    } else {
                        n4 = 550;
                        if (n7 <= n3 && n3 < n4) {
                            tv0_02 = tv0_0.b;
                            tv0_02 = tv0_0.f;
                        } else {
                            n7 = 650;
                            if (n4 <= n3 && n3 < n7) {
                                tv0_02 = tv0_0.b;
                                tv0_02 = tv0_0.g;
                            } else {
                                n4 = 750;
                                if (n7 <= n3 && n3 < n4) {
                                    tv0_02 = tv0_0.b;
                                    tv0_02 = tv0_0.h;
                                } else {
                                    n7 = 850;
                                    if (n4 <= n3 && n3 < n7) {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.i;
                                    } else if (n7 <= n3 && n3 < (n4 = 1000)) {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.j;
                                    } else {
                                        tv0_02 = tv0_0.b;
                                        tv0_02 = tv0_0.e;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return tv0_02;
    }

    public static final long getComposeColor-mxwnekA(TypedArray typedArray, int n3, long l2) {
        String string2 = "$this$getComposeColor";
        Intrinsics.checkNotNullParameter(typedArray, string2);
        boolean bl2 = typedArray.hasValue(n3);
        if (bl2) {
            ct3.c(typedArray, n3);
            int n4 = typedArray.getColor(n3, 0);
            l2 = zx_0.c(n4);
        }
        return l2;
    }

    public static long getComposeColor-mxwnekA$default(TypedArray typedArray, int n3, long l2, int n4, Object object) {
        if ((n4 &= 2) != 0) {
            l2 = OX.l;
        }
        return TypedArrayUtilsKt.getComposeColor-mxwnekA(typedArray, n3, l2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final FontFamilyWithWeight getFontFamilyOrNull(TypedArray object, int n3) {
        void var0_2;
        int n4;
        void var3_17;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = tempTypedValue;
        Object t3 = ((ThreadLocal)object2).get();
        if (t3 == null) {
            TypedValue typedValue = new TypedValue();
            ((ThreadLocal)object2).set(typedValue);
        }
        TypedValue typedValue = (TypedValue)var3_17;
        n4 = object.getValue(n4, typedValue);
        object2 = null;
        if (n4 == 0) return object2;
        n4 = typedValue.type;
        int n7 = 3;
        if (n4 != n7) return object2;
        Object object3 = typedValue.string;
        String string2 = "sans-serif";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        int n8 = 2;
        if (n7 != 0) {
            object3 = RU0.b;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "sans-serif-thin";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_12 = RU0.b;
            object3 = tv0_0.k;
            return new FontFamilyWithWeight(gz0_12, (tv0_0)object3);
        }
        string2 = "sans-serif-light";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_13 = RU0.b;
            object3 = tv0_0.l;
            return new FontFamilyWithWeight(gz0_13, (tv0_0)object3);
        }
        string2 = "sans-serif-medium";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_14 = RU0.b;
            object3 = tv0_0.n;
            return new FontFamilyWithWeight(gz0_14, (tv0_0)object3);
        }
        string2 = "sans-serif-black";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            gz0_1 gz0_15 = RU0.b;
            object3 = tv0_0.p;
            return new FontFamilyWithWeight(gz0_15, (tv0_0)object3);
        }
        string2 = "serif";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            object3 = RU0.c;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "cursive";
        n7 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n7 != 0) {
            object3 = RU0.e;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        string2 = "monospace";
        n4 = (int)(Intrinsics.areEqual(object3, string2) ? 1 : 0);
        if (n4 != 0) {
            object3 = RU0.d;
            FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
            return var0_2;
        }
        n4 = typedValue.resourceId;
        if (n4 == 0) return object2;
        object3 = typedValue.string;
        string2 = "tv.string";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        String string3 = "res/font";
        n4 = (int)(StringsKt.c0((CharSequence)object3, string3, false) ? 1 : 0);
        if (n4 == 0) return object2;
        n4 = Build.VERSION.SDK_INT;
        int n10 = 23;
        if (n4 >= n10) {
            object3 = typedValue.string;
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            string2 = ".xml";
            n4 = (int)(StringsKt.J((CharSequence)object3, string2) ? 1 : 0);
            if (n4 != 0) {
                Resources resources = object.getResources();
                object3 = "resources";
                Intrinsics.checkNotNullExpressionValue(resources, (String)object3);
                n4 = typedValue.resourceId;
                RU0 rU0 = TypedArrayUtilsKt.parseXmlFontFamily(resources, n4);
                if (rU0 == null) return object2;
                object3 = new FontFamilyWithWeight(rU0, null, n8, null);
                return object3;
            }
        }
        n4 = typedValue.resourceId;
        object3 = ZU0.a(n4, null, 0, 14);
        int n14 = 1;
        LU0[] lU0Array = new LU0[n14];
        lU0Array[0] = object3;
        object3 = SU0.a(lU0Array);
        FontFamilyWithWeight fontFamilyWithWeight = new FontFamilyWithWeight((RU0)object3, null, n8, null);
        return var0_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final RU0 parseXmlFontFamily(Resources object, int n3) {
        Throwable throwable2;
        XmlResourceParser xmlResourceParser;
        block5: {
            xmlResourceParser = object.getXml(n3);
            ArrayList<Object> arrayList = "getXml(resourceId)";
            Intrinsics.checkNotNullExpressionValue(xmlResourceParser, (String)((Object)arrayList));
            try {
                object = iv0_0.a(xmlResourceParser, (Resources)object);
            }
            catch (Throwable throwable2) {
                break block5;
            }
            boolean bl2 = object instanceof iV0$b;
            if (!bl2) {
                xmlResourceParser.close();
                return null;
            }
            object = (iV0$b)object;
            object = object.a;
            arrayList = "result.entries";
            Intrinsics.checkNotNullExpressionValue(object, (String)((Object)arrayList));
            int n4 = ((iV0$c[])object).length;
            arrayList = new ArrayList<Object>(n4);
            for (Object object2 : object) {
                int n7 = ((iV0$c)object2).f;
                int n8 = ((iV0$c)object2).b;
                tv0_0 tv0_02 = TypedArrayUtilsKt.fontWeightOf(n8);
                int n10 = ((iV0$c)object2).c;
                int n14 = 8;
                object2 = ZU0.a(n7, tv0_02, n10, n14);
                arrayList.add(object2);
            }
            object = new av0_0(arrayList);
            xmlResourceParser.close();
            return object;
        }
        xmlResourceParser.close();
        throw throwable2;
    }
}

