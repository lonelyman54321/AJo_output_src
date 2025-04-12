/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.Typeface$CustomFallbackBuilder
 *  android.graphics.fonts.Font
 *  android.graphics.fonts.Font$Builder
 *  android.graphics.fonts.FontFamily
 *  android.graphics.fonts.FontFamily$Builder
 *  android.graphics.fonts.FontStyle
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.provider.h$b;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class nt3
extends ot3 {
    public static Font g(FontFamily fontFamily, int n3) {
        Font font2;
        int n4 = n3 & 1;
        n4 = n4 != 0 ? 700 : 400;
        int n7 = 1;
        int n8 = 0;
        Font font3 = null;
        if ((n3 &= 2) != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            font2 = null;
        }
        FontStyle fontStyle = new FontStyle(n4, n3);
        font2 = fontFamily.getFont(0);
        FontStyle fontStyle2 = font2.getStyle();
        n4 = nt3.i(fontStyle, fontStyle2);
        while (n7 < (n8 = fontFamily.getSize())) {
            font3 = fontFamily.getFont(n7);
            FontStyle fontStyle3 = font3.getStyle();
            int n10 = nt3.i(fontStyle, fontStyle3);
            if (n10 < n4) {
                font2 = font3;
                n4 = n10;
            }
            ++n7;
        }
        return font2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FontFamily h(h$b[] h$bArray, ContentResolver contentResolver) {
        int n3 = h$bArray.length;
        int n4 = 0;
        String string2 = null;
        while (true) {
            block11: {
                Throwable throwable222;
                Uri uri;
                block14: {
                    block13: {
                        if (n4 >= n3) {
                            if (string2 != null) return string2.build();
                            return null;
                        }
                        h$b h$b = h$bArray[n4];
                        uri = h$b.a;
                        String string3 = "r";
                        uri = contentResolver.openFileDescriptor(uri, string3, null);
                        if (uri == null) {
                            if (uri == null) break block11;
                        } else {
                            block12: {
                                try {
                                    string3 = new Font.Builder((ParcelFileDescriptor)uri);
                                    int n7 = h$b.c;
                                    string3 = string3.setWeight(n7);
                                    n7 = (int)(h$b.d ? 1 : 0);
                                    string3 = string3.setSlant(n7);
                                    int n8 = h$b.b;
                                    h$b = string3.setTtcIndex(n8);
                                    h$b = h$b.build();
                                    if (string2 != null) break block12;
                                    string2 = string3 = new FontFamily.Builder((Font)h$b);
                                    break block13;
                                }
                                catch (Throwable throwable222) {
                                    break block14;
                                }
                            }
                            string2.addFont((Font)h$b);
                        }
                    }
                    uri.close();
                    break block11;
                    {
                        catch (IOException iOException) {}
                    }
                }
                try {
                    uri.close();
                    throw throwable222;
                }
                catch (Throwable throwable3) {
                    throwable222.addSuppressed(throwable3);
                    throw throwable222;
                }
            }
            ++n4;
        }
    }

    public static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        int n3;
        int n4 = fontStyle.getWeight();
        int n7 = fontStyle2.getWeight();
        n4 = Math.abs(n4 - n7) / 100;
        int n8 = fontStyle.getSlant();
        if (n8 == (n3 = fontStyle2.getSlant())) {
            n8 = 0;
            fontStyle = null;
        } else {
            n8 = 2;
        }
        return n4 + n8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Typeface a(Context context, iV0$b fontFamily, Resources resources, int n3) {
        context = null;
        try {
            fontFamily = fontFamily.a;
            int n4 = ((iV0$c[])fontFamily).length;
            int n7 = 0;
            Font.Builder builder = null;
            while (true) {
                block9: {
                    if (n7 < n4) {
                        Object object = fontFamily[n7];
                        int n8 = ((iV0$c)object).f;
                        Font.Builder builder2 = new Font.Builder(resources, n8);
                        n8 = ((iV0$c)object).b;
                        builder2 = builder2.setWeight(n8);
                        n8 = (int)(((iV0$c)object).c ? 1 : 0);
                        builder2 = builder2.setSlant(n8);
                        n8 = ((iV0$c)object).e;
                        builder2 = builder2.setTtcIndex(n8);
                        object = ((iV0$c)object).d;
                        object = builder2.setFontVariationSettings((String)object);
                        object = object.build();
                        if (builder == null) {
                            builder = builder2 = new FontFamily.Builder((Font)object);
                            break block9;
                        } else {
                            builder.addFont((Font)object);
                        }
                        break block9;
                    }
                    if (builder == null) {
                        return null;
                    }
                    fontFamily = builder.build();
                    resources = new Typeface.CustomFallbackBuilder(fontFamily);
                    fontFamily = nt3.g(fontFamily, n3);
                    fontFamily = fontFamily.getStyle();
                    fontFamily = resources.setStyle((FontStyle)fontFamily);
                    return fontFamily.build();
                    catch (IOException iOException) {}
                }
                ++n7;
            }
        }
        catch (Exception exception) {
            return context;
        }
    }

    public final Typeface b(Context context, h$b[] customFallbackBuilder, int n3) {
        block8: {
            context = context.getContentResolver();
            try {
                context = nt3.h((h$b[])customFallbackBuilder, (ContentResolver)context);
                if (context != null) break block8;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        customFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily)context);
        context = nt3.g((FontFamily)context, n3);
        context = context.getStyle();
        context = customFallbackBuilder.setStyle((FontStyle)context);
        return context.build();
    }

    public final Typeface c(Context context, List list, int n3) {
        FontFamily fontFamily;
        block16: {
            context = context.getContentResolver();
            fontFamily = null;
            fontFamily = (FontFamily)list.get(0);
            fontFamily = (h$b[])fontFamily;
            fontFamily = nt3.h((h$b[])fontFamily, (ContentResolver)context);
            if (fontFamily != null) break block16;
            return null;
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamily);
        int n4 = 1;
        while (true) {
            block17: {
                int n7 = list.size();
                if (n4 >= n7) break;
                Object object = list.get(n4);
                object = (h$b[])object;
                object = nt3.h(object, (ContentResolver)context);
                if (object == null) break block17;
                customFallbackBuilder.addCustomFallback(object);
            }
            ++n4;
        }
        try {
            context = nt3.g(fontFamily, n3);
        }
        catch (Exception exception) {
            return null;
        }
        context = context.getStyle();
        context = customFallbackBuilder.setStyle((FontStyle)context);
        return context.build();
    }

    public final Typeface d(Context object, InputStream inputStream) {
        object = new RuntimeException("Do not use this function in API 29 or later.");
        throw object;
    }

    public final Typeface e(Context context, Resources resources, int n3, String string2, int n4) {
        try {
            context = new Font.Builder(resources, n3);
            context = context.build();
        }
        catch (Exception exception) {
            return null;
        }
        resources = new FontFamily.Builder((Font)context);
        resources = resources.build();
        Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily)resources);
        context = context.getStyle();
        context = customFallbackBuilder.setStyle((FontStyle)context);
        return context.build();
    }

    public final h$b f(h$b[] object, int n3) {
        object = new RuntimeException("Do not use this function in API 29 or later.");
        throw object;
    }
}

