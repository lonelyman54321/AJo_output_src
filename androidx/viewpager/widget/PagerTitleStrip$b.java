/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.method.SingleLineTransformationMethod
 *  android.view.View
 */
package androidx.viewpager.widget;

import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

public final class PagerTitleStrip$b
extends SingleLineTransformationMethod {
    public Locale a;

    public final CharSequence getTransformation(CharSequence charSequence, View object) {
        if ((charSequence = super.getTransformation(charSequence, object)) != null) {
            charSequence = charSequence.toString();
            object = this.a;
            charSequence = ((String)charSequence).toUpperCase((Locale)object);
        } else {
            charSequence = null;
        }
        return charSequence;
    }
}

