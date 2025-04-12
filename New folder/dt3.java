/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class dt3 {
    public static int a(Context context, int n3, int n4) {
        TypedValue typedValue = new TypedValue();
        context = context.getTheme();
        boolean bl2 = true;
        context.resolveAttribute(n3, typedValue, bl2);
        int n7 = typedValue.resourceId;
        if (n7 != 0) {
            return n3;
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ColorStateList b(TypedArray object, XmlPullParser object2, Resources.Theme object3) {
        StringBuilder stringBuilder;
        void var1_3;
        boolean bl2 = dt3.f((XmlPullParser)var1_3, "tint");
        ColorStateList colorStateList = null;
        if (!bl2) return null;
        TypedValue typedValue = new TypedValue();
        int n3 = 1;
        object.getValue(n3, typedValue);
        int n4 = typedValue.type;
        int n7 = 2;
        if (n4 == n7) {
            stringBuilder = new StringBuilder("Failed to resolve attribute at index 1: ");
            stringBuilder.append(typedValue);
            String string2 = stringBuilder.toString();
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(string2);
            throw unsupportedOperationException;
        }
        n7 = 28;
        if (n4 >= n7 && n4 <= (n7 = 31)) {
            return ColorStateList.valueOf((int)typedValue.data);
        }
        Resources resources = object.getResources();
        n4 = 0;
        int n8 = object.getResourceId(n3, 0);
        try {
            XmlResourceParser xmlResourceParser = resources.getXml(n8);
            return fZ.a(resources, xmlResourceParser, (Resources.Theme)stringBuilder);
        }
        catch (Exception exception) {
            return colorStateList;
        }
    }

    public static O00 c(TypedArray object, XmlPullParser object2, Resources.Theme theme, String string2, int n3) {
        boolean bl2 = dt3.f(object2, string2);
        string2 = null;
        if (bl2) {
            object2 = new TypedValue();
            object.getValue(n3, (TypedValue)object2);
            int n4 = object2.type;
            int n7 = 28;
            if (n4 >= n7 && n4 <= (n7 = 31)) {
                int n8 = object2.data;
                object2 = new O00(null, null, n8);
                return object2;
            }
            object2 = object.getResources();
            int n10 = object.getResourceId(n3, 0);
            try {
                object = O00.a(n10, theme, (Resources)object2);
            }
            catch (Exception exception) {
                n10 = 0;
                object = null;
            }
            if (object != null) {
                return object;
            }
        }
        object = new O00(null, null, 0);
        return object;
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n3, int n4) {
        boolean bl2 = dt3.f(xmlPullParser, string2);
        if (!bl2) {
            return n4;
        }
        return typedArray.getInt(n3, n4);
    }

    public static String e(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n3) {
        boolean bl2 = dt3.f(xmlPullParser, string2);
        if (!bl2) {
            return null;
        }
        return typedArray.getString(n3);
    }

    public static boolean f(XmlPullParser object, String string2) {
        boolean bl2;
        String string3 = "http://schemas.android.com/apk/res/android";
        if ((object = object.getAttributeValue(string3, string2)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] nArray) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, nArray);
        }
        return theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
    }
}

