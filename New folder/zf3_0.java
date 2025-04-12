/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.style.AbsoluteSizeSpan
 *  android.text.style.RelativeSizeSpan
 */
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/*
 * Renamed from Zf3
 */
public final class zf3_0 {
    public static void a(Pe0$a object) {
        int n3;
        ((Pe0$a)object).k = -3.4028235E38f;
        ((Pe0$a)object).j = n3 = -1 << -1;
        Object[] objectArray = ((Pe0$a)object).a;
        int n4 = objectArray instanceof Spanned;
        if (n4 != 0) {
            n4 = objectArray instanceof Spannable;
            if (n4 == 0) {
                objectArray = SpannableString.valueOf((CharSequence)objectArray);
                ((Pe0$a)object).a = objectArray;
            }
            object = ((Pe0$a)object).a;
            object.getClass();
            object = (Spannable)object;
            n3 = object.length();
            Class<Object> clazz = Object.class;
            for (Object object2 : object.getSpans(0, n3, clazz)) {
                boolean bl2 = object2 instanceof AbsoluteSizeSpan;
                if (!bl2 && !(bl2 = object2 instanceof RelativeSizeSpan)) continue;
                object.removeSpan(object2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float b(int n3, float f5, int n4, int n7) {
        float f6;
        float f7 = -3.4028235E38f;
        float f8 = f5 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object == false) {
            return f7;
        }
        if (n3 != 0) {
            n7 = 1;
            if (n3 != n7) {
                n4 = 2;
                if (n3 == n4) return f5;
                return f7;
            }
            f6 = n4;
            return f5 * f6;
        }
        f6 = n7;
        return f5 * f6;
    }
}

