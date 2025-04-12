/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public final class OK2$g
implements OK2$e {
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            context = context.getResources();
        }
        catch (Exception exception) {
            return null;
        }
        aa3_1 aa3_12 = new aa3_1();
        aa3_12.inflate((Resources)context, (XmlPullParser)xmlResourceParser, attributeSet, theme);
        return aa3_12;
    }
}

