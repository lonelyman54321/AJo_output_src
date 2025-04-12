/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.VectorDrawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.webkit.MimeTypeMap
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/*
 * Renamed from SK2
 */
public final class sk2_0
implements el0_0 {
    public final Uri a;
    public final ba2 b;

    public sk2_0(Uri uri, ba2 ba22) {
        this.a = uri;
        this.b = ba22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(f80_0 var1_1) {
        block9: {
            block10: {
                block12: {
                    block13: {
                        block11: {
                            var2_2 = 2 != 0;
                            var3_3 /* !! */  = this.a;
                            var4_4 /* !! */  = var3_3 /* !! */ .getAuthority();
                            var5_5 = "Invalid android.resource URI: ";
                            if (var4_4 /* !! */  == null) break block9;
                            var6_6 = kotlin.text.b.k(var4_4 /* !! */ );
                            var7_7 = true;
                            if (!(var6_6 ^= var7_7)) {
                                var8_8 = false;
                                var4_4 /* !! */  = null;
                            }
                            if (var4_4 /* !! */  == null) break block9;
                            var9_9 = (String)CollectionsKt.T(var3_3 /* !! */ .getPathSegments());
                            if (var9_9 == null || (var9_9 = StringsKt.toIntOrNull((String)var9_9)) == null) break block10;
                            var10_10 = var9_9.intValue();
                            var5_5 = this.b;
                            var9_9 = var5_5.a;
                            var11_11 = var9_9.getPackageName();
                            var12_12 = Intrinsics.areEqual(var4_4 /* !! */ , var11_11);
                            var11_11 = var12_12 != false ? var9_9.getResources() : var9_9.getPackageManager().getResourcesForApplication(var4_4 /* !! */ );
                            var13_13 = new TypedValue();
                            var11_11.getValue(var10_10, (TypedValue)var13_13, var7_7);
                            var13_13 = var13_13.string;
                            var14_14 = StringsKt.Q((CharSequence)var13_13, '/', 0, 6);
                            var15_15 = var13_13.length();
                            var13_13 = var13_13.subSequence((int)var14_14, var15_15).toString();
                            var13_13 = m.b(MimeTypeMap.getSingleton(), (String)var13_13);
                            var16_16 = "text/xml";
                            var14_14 = Intrinsics.areEqual(var13_13, var16_16);
                            if (!var14_14) ** GOTO lbl95
                            var13_13 = var9_9.getPackageName();
                            var8_8 = Intrinsics.areEqual(var4_4 /* !! */ , var13_13);
                            var13_13 = "Invalid resource ID: ";
                            if (!var8_8) break block11;
                            var1_1 = xn.a((Context)var9_9, var10_10);
                            if (var1_1 == null) {
                                var1_1 = hj0_0.a(var10_10, (String)var13_13);
                                var1_1 = var1_1.toString();
                                var3_3 /* !! */  = new IllegalStateException((String)var1_1);
                                throw var3_3 /* !! */ ;
                            }
                            ** GOTO lbl-1000
                        }
                        var4_4 /* !! */  = var11_11.getXml(var10_10);
                        var14_14 = var4_4 /* !! */ .next();
                        while (var14_14 != var2_2 && var14_14 != var7_7) {
                            var14_14 = var4_4 /* !! */ .next();
                        }
                        if (var14_14 != var2_2) ** GOTO lbl93
                        var2_2 = Build.VERSION.SDK_INT;
                        var14_14 = 24 != 0;
                        if (var2_2 >= var14_14) break block12;
                        var1_1 = var4_4 /* !! */ .getName();
                        var14_14 = Intrinsics.areEqual(var1_1, var16_16 = "vector");
                        if (!var14_14) break block13;
                        var1_1 = Xml.asAttributeSet((XmlPullParser)var4_4 /* !! */ );
                        var3_3 /* !! */  = var9_9.getTheme();
                        var13_13 = new aa3_1();
                        var13_13.inflate((Resources)var11_11, (XmlPullParser)var4_4 /* !! */ , (AttributeSet)var1_1, (Resources.Theme)var3_3 /* !! */ );
lbl58:
                        // 2 sources

                        while (true) {
                            var1_1 = var13_13;
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    var16_16 = "animated-vector";
                    var2_2 = Intrinsics.areEqual(var1_1, var16_16);
                    if (var2_2) {
                        var1_1 = Xml.asAttributeSet((XmlPullParser)var4_4 /* !! */ );
                        var3_3 /* !! */  = var9_9.getTheme();
                        var13_13 = new tk_0((Context)var9_9);
                        var13_13.inflate((Resources)var11_11, (XmlPullParser)var4_4 /* !! */ , (AttributeSet)var1_1, (Resources.Theme)var3_3 /* !! */ );
                        ** continue;
                    }
                }
                var1_1 = var9_9.getTheme();
                var4_4 /* !! */  = WK2.a;
                if ((var1_1 = var11_11.getDrawable(var10_10, (Resources.Theme)var1_1)) != null) lbl-1000:
                // 3 sources

                {
                    var10_10 = var1_1 instanceof VectorDrawable;
                    if (var10_10 == 0 && (var10_10 = var1_1 instanceof aa3_1) == 0) {
                        var7_7 = false;
                        var17_17 = null;
                    }
                    if (var7_7) {
                        var4_4 /* !! */  = var5_5.b;
                        var11_11 = var5_5.d;
                        var13_13 = var5_5.e;
                        var18_19 = var5_5.f;
                        var1_1 = vu0_0.a((Drawable)var1_1, (Bitmap.Config)var4_4 /* !! */ , (B63)var11_11, (WS2)var13_13, var18_19);
                        var4_4 /* !! */  = var9_9.getResources();
                        var1_1 = var5_5 = new BitmapDrawable((Resources)var4_4 /* !! */ , (Bitmap)var1_1);
                    }
                    var4_4 /* !! */  = ri0.DISK;
                    var3_3 /* !! */  = new hu0((Drawable)var1_1, var7_7, (ri0)var4_4 /* !! */ );
                } else {
                    var1_1 = hj0_0.a(var10_10, (String)var13_13);
                    var1_1 = var1_1.toString();
                    var3_3 /* !! */  = new IllegalStateException((String)var1_1);
                    throw var3_3 /* !! */ ;
lbl93:
                    // 1 sources

                    var1_1 = new XmlPullParserException("No start tag found.");
                    throw var1_1;
lbl95:
                    // 1 sources

                    var5_5 = new TypedValue();
                    var17_18 /* !! */  = var11_11.openRawResource(var10_10, (TypedValue)var5_5);
                    var17_18 /* !! */  = o72_0.b(o72_0.h(var17_18 /* !! */ ));
                    var18_20 = var5_5.density;
                    var16_16 = new PK2(var4_4 /* !! */ , var10_10, var18_20);
                    var4_4 /* !! */  = new zz_1(var9_9, (int)var2_2);
                    var3_3 /* !! */  = new f93_0((se_1)var17_18 /* !! */ , (Function0)var4_4 /* !! */ , (Fe1$a)var16_16);
                    var1_1 = ri0.DISK;
                    var11_11 = new N93((Fe1)var3_3 /* !! */ , (String)var13_13, (ri0)var1_1);
                    var3_3 /* !! */  = var11_11;
                }
                return var3_3 /* !! */ ;
            }
            var3_3 /* !! */  = og3_1.a(var3_3 /* !! */ , (String)var5_5);
            var1_1 = new IllegalStateException((String)var3_3 /* !! */ );
            throw var1_1;
        }
        var3_3 /* !! */  = og3_1.a(var3_3 /* !! */ , (String)var5_5);
        var1_1 = new IllegalStateException((String)var3_3 /* !! */ );
        throw var1_1;
    }
}

