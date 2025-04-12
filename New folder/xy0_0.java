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
import androidx.emoji2.text.EmojiCompat;

/*
 * Renamed from Xy0
 */
public final class xy0_0
implements TransformationMethod {
    public final TransformationMethod a;

    public xy0_0(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View object) {
        int n3;
        int n4 = object.isInEditMode();
        if (n4 != 0) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, (View)object);
        }
        if (charSequence != null && (n3 = ((EmojiCompat)(object = EmojiCompat.a())).b()) == (n4 = 1)) {
            object = EmojiCompat.a();
            object.getClass();
            n4 = charSequence.length();
            charSequence = ((EmojiCompat)object).g(charSequence, 0, n4, 0);
        }
        return charSequence;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean bl2, int n3, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, bl2, n3, rect);
        }
    }
}

