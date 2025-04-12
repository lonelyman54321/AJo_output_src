/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public final class WK2 {
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
        Object object = new ThreadLocal();
        a = object;
        object = new WeakHashMap(0);
        b = object;
        c = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(WK2$c wK2$c, int n3, ColorStateList colorStateList, Resources.Theme theme) {
        Object object = c;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                Object object2;
                Object object3;
                block3: {
                    try {
                        object3 = b;
                        object2 = ((WeakHashMap)object3).get(wK2$c);
                        object2 = (SparseArray)object2;
                        if (object2 != null) break block3;
                        object2 = new Object();
                        ((WeakHashMap)object3).put(wK2$c, object2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                wK2$c = wK2$c.a;
                wK2$c = wK2$c.getConfiguration();
                object3 = new WK2$b(colorStateList, (Configuration)wK2$c, theme);
                object2.append(n3, object3);
                return;
            }
            throw throwable2;
        }
    }

    public static Drawable b(Resources resources, int n3) {
        return resources.getDrawable(n3, null);
    }

    public static Typeface c(int n3, Context context) {
        boolean bl2 = context.isRestricted();
        if (bl2) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        return WK2.d(context, n3, typedValue, 0, null, false, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface d(Context context, int n3, TypedValue typedValue, int n4, WK2$d wK2$d, boolean bl2, boolean bl3) {
        String string2;
        Object object;
        Object object2;
        WK2$d wK2$d2;
        Object object3;
        block13: {
            WC1 wC1;
            int n7;
            String string3;
            int n8;
            Object object4;
            block18: {
                block17: {
                    object3 = typedValue;
                    wK2$d2 = wK2$d;
                    object4 = context.getResources();
                    n8 = 1;
                    object4.getValue(n3, typedValue, n8 != 0);
                    object2 = typedValue.string;
                    if (object2 == null) {
                        StringBuilder stringBuilder = new StringBuilder("Resource \"");
                        String string4 = object4.getResourceName(n3);
                        stringBuilder.append(string4);
                        stringBuilder.append("\" (");
                        string4 = Integer.toHexString(n3);
                        stringBuilder.append(string4);
                        stringBuilder.append(") is not a Font: ");
                        stringBuilder.append(typedValue);
                        object3 = stringBuilder.toString();
                        object2 = new Resources.NotFoundException((String)object3);
                        throw object2;
                    }
                    string3 = object2.toString();
                    object2 = "res/";
                    n8 = string3.startsWith((String)object2);
                    object = null;
                    n7 = -3;
                    if (n8 != 0) break block17;
                    if (wK2$d != null) {
                        wK2$d.callbackFailAsync(n7, null);
                    }
                    break block13;
                }
                n8 = typedValue.assetCookie;
                wC1 = ft3.b;
                object2 = ft3.b(object4, n3, string3, n8, n4);
                if ((object2 = (Typeface)wC1.get(object2)) == null) break block18;
                if (wK2$d != null) {
                    wK2$d.callbackSuccessAsync((Typeface)object2, null);
                }
                object = object2;
                break block13;
            }
            if (!bl3) {
                block16: {
                    block14: {
                        block15: {
                            object2 = string3.toLowerCase();
                            string2 = ".xml";
                            n8 = (int)(((String)object2).endsWith(string2) ? 1 : 0);
                            if (n8 != 0) {
                                object2 = object4.getXml(n3);
                                if ((object2 = iv0_0.a((XmlResourceParser)object2, object4)) == null) {
                                    if (wK2$d != null) {
                                        wK2$d.callbackFailAsync(n7, null);
                                    }
                                    break block13;
                                }
                                int n10 = typedValue.assetCookie;
                                object3 = context;
                                string2 = object4;
                                object4 = wK2$d;
                                object = ft3.a(context, (iV0$a)object2, (Resources)string2, n3, string3, n10, n4, wK2$d, bl2);
                                break block13;
                            }
                            int n14 = typedValue.assetCookie;
                            object3 = ft3.a;
                            object2 = context;
                            string2 = object4;
                            int n15 = n4;
                            if ((object3 = ((ot3)object3).e(context, (Resources)object4, n3, string3, n4)) != null) {
                                object2 = ft3.b(object4, n3, string3, n14, n4);
                                wC1.put(object2, object3);
                            }
                            if (wK2$d2 == null) break block14;
                            if (object3 == null) break block15;
                            try {
                                wK2$d2.callbackSuccessAsync((Typeface)object3, null);
                                break block14;
                            }
                            catch (IOException | XmlPullParserException throwable) {
                                break block16;
                            }
                        }
                        wK2$d2.callbackFailAsync(n7, null);
                    }
                    object = object3;
                    break block13;
                }
                if (wK2$d2 != null) {
                    wK2$d2.callbackFailAsync(n7, null);
                }
            }
        }
        if (object != null) return object;
        if (wK2$d2 != null) return object;
        if (bl3) {
            return object;
        }
        object2 = new StringBuilder("Font resource ID #0x");
        string2 = Integer.toHexString(n3);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(" could not be retrieved.");
        object2 = ((StringBuilder)object2).toString();
        object3 = new Resources.NotFoundException((String)object2);
        throw object3;
    }
}

