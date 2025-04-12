/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.TypedValue
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.b$a;

public final class Tn3 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public Tn3(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static Tn3 e(Context context, AttributeSet attributeSet, int[] nArray) {
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray);
        Tn3 tn3 = new Tn3(context, (TypedArray)attributeSet);
        return tn3;
    }

    public static Tn3 f(Context context, AttributeSet attributeSet, int[] nArray, int n3, int n4) {
        attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, n4);
        Tn3 tn3 = new Tn3(context, (TypedArray)attributeSet);
        return tn3;
    }

    public final ColorStateList a(int n3) {
        TypedArray typedArray = this.b;
        int n4 = typedArray.hasValue(n3);
        if (n4 != 0) {
            Context context;
            ColorStateList colorStateList = null;
            n4 = typedArray.getResourceId(n3, 0);
            if (n4 != 0 && (colorStateList = t70.getColorStateList(context = this.a, n4)) != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(n3);
    }

    public final Drawable b(int n3) {
        TypedArray typedArray = this.b;
        int n4 = typedArray.hasValue(n3);
        if (n4 != 0 && (n4 = typedArray.getResourceId(n3, 0)) != 0) {
            return xn.a(this.a, n4);
        }
        return typedArray.getDrawable(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable c(int n3) {
        Object object = this.b;
        boolean bl2 = object.hasValue(n3);
        if (!bl2) return null;
        object = this.b;
        Context context = null;
        if ((n3 = object.getResourceId(n3, 0)) == 0) return null;
        object = qn.a();
        context = this.a;
        synchronized (object) {
            OK2 oK2 = object.a;
            boolean bl3 = true;
            return oK2.g(context, n3, bl3);
        }
    }

    public final Typeface d(int n3, int n4, b$a b$a) {
        Object object = this.b;
        int n7 = object.getResourceId(n3, 0);
        n3 = 0;
        Typeface typeface = null;
        if (n7 == 0) {
            return null;
        }
        object = this.c;
        if (object == null) {
            object = new TypedValue();
            this.c = object;
        }
        TypedValue typedValue = this.c;
        object = WK2.a;
        Context context = this.a;
        boolean bl2 = context.isRestricted();
        if (!bl2) {
            boolean bl3 = true;
            typeface = WK2.d(context, n7, typedValue, n4, b$a, bl3, false);
        }
        return typeface;
    }

    public final void g() {
        this.b.recycle();
    }
}

