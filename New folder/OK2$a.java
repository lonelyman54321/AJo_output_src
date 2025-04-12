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
 */
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.graphics.drawable.a;

public final class OK2$a
implements OK2$e {
    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        Resources resources;
        try {
            resources = context.getResources();
        }
        catch (Exception exception) {
            return null;
        }
        return a.g(context, resources, xmlResourceParser, attributeSet, theme);
    }
}

