/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 */
import android.text.SpannableStringBuilder;

public final class V93 {
    public static void a(SpannableStringBuilder spannableStringBuilder, Object object, int n3, int n4) {
        int n7;
        Object[] objectArray = object.getClass();
        objectArray = spannableStringBuilder.getSpans(n3, n4, objectArray);
        int n8 = objectArray.length;
        int n10 = 0;
        while (true) {
            n7 = 33;
            if (n10 >= n8) break;
            Object object2 = objectArray[n10];
            int n14 = spannableStringBuilder.getSpanStart(object2);
            if (n14 == n3 && (n14 = spannableStringBuilder.getSpanEnd(object2)) == n4 && (n14 = spannableStringBuilder.getSpanFlags(object2)) == n7) {
                spannableStringBuilder.removeSpan(object2);
            }
            ++n10;
        }
        spannableStringBuilder.setSpan(object, n3, n4, n7);
    }
}

