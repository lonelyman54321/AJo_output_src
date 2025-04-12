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

public final class OK2$d
implements OK2$e {
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = attributeSet.getClassAttribute();
        if (object != null) {
            Class<Drawable> clazz = OK2$d.class;
            try {
                clazz = clazz.getClassLoader();
            }
            catch (Exception exception) {}
            object = ((ClassLoader)((Object)clazz)).loadClass((String)object);
            clazz = Drawable.class;
            object = object.asSubclass(clazz);
            object = object.getDeclaredConstructor(null);
            object = object.newInstance(null);
            object = object;
            context = context.getResources();
            t00.c(object, (Resources)context, (XmlPullParser)xmlResourceParser, attributeSet, theme);
            return object;
        }
        return null;
    }
}

