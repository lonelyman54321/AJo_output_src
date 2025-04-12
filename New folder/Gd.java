/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.text.method.TransformationMethod
 *  android.view.View
 */
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class Gd
implements TransformationMethod {
    public Locale a;

    public final CharSequence getTransformation(CharSequence charSequence, View object) {
        if (charSequence != null) {
            charSequence = charSequence.toString();
            object = this.a;
            charSequence = ((String)charSequence).toUpperCase((Locale)object);
        } else {
            charSequence = null;
        }
        return charSequence;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean bl2, int n3, Rect rect) {
    }
}

