/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.view.inputmethod.EditorInfo
 */
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/*
 * Renamed from ky0
 */
public final class ky0_0 {
    public static final String[] a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int n3 = 2048;
        int n4 = 1;
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 30;
        if (n7 >= n8) {
            ky0$a.a(editorInfo, charSequence);
        } else {
            charSequence.getClass();
            if (n7 >= n8) {
                ky0$a.a(editorInfo, charSequence);
            } else {
                n7 = editorInfo.initialSelStart;
                n8 = editorInfo.initialSelEnd;
                int n10 = n7 > n8 ? n8 : n7;
                if (n7 <= n8) {
                    n7 = n8;
                }
                n8 = charSequence.length();
                int n14 = 0;
                if (n10 >= 0 && n7 <= n8) {
                    int n15 = editorInfo.inputType & 0xFFF;
                    int n16 = 129;
                    if (n15 != n16 && n15 != (n16 = 225) && n15 != (n16 = 18)) {
                        if (n8 <= n3) {
                            ky0_0.b(editorInfo, charSequence, n10, n7);
                        } else {
                            n8 = n7 - n10;
                            n14 = 1024;
                            n14 = n8 > n14 ? 0 : n8;
                            n15 = charSequence.length() - n7;
                            double d2 = 0.8;
                            double d5 = (double)(n3 -= n14) * d2;
                            n16 = (int)d5;
                            n16 = Math.min(n10, n16);
                            n16 = n3 - n16;
                            n15 = Math.min(n15, n16);
                            n3 -= n15;
                            if ((n16 = (int)(Character.isLowSurrogate(charSequence.charAt(n10 -= (n3 = Math.min(n10, n3)))) ? 1 : 0)) != 0) {
                                n10 += n4;
                                n3 -= n4;
                            }
                            n16 = n7 + n15 - n4;
                            if ((n16 = (int)(Character.isHighSurrogate(charSequence.charAt(n16)) ? 1 : 0)) != 0) {
                                n15 -= n4;
                            }
                            n16 = n3 + n14;
                            int n17 = n16 + n15;
                            if (n14 != n8) {
                                n8 = n10 + n3;
                                CharSequence charSequence2 = charSequence.subSequence(n10, n8);
                                charSequence = charSequence.subSequence(n7, n15 += n7);
                                n7 = 2;
                                CharSequence[] charSequenceArray = new CharSequence[n7];
                                charSequenceArray[0] = charSequence2;
                                charSequenceArray[n4] = charSequence;
                                charSequence = TextUtils.concat((CharSequence[])charSequenceArray);
                            } else {
                                charSequence = charSequence.subSequence(n10, n17 += n10);
                            }
                            ky0_0.b(editorInfo, charSequence, n3, n16);
                        }
                    } else {
                        ky0_0.b(editorInfo, null, 0, 0);
                    }
                } else {
                    ky0_0.b(editorInfo, null, 0, 0);
                }
            }
        }
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int n3, int n4) {
        Object object = editorInfo.extras;
        if (object == null) {
            editorInfo.extras = object = new Bundle();
        }
        object = charSequence != null ? new SpannableStringBuilder(charSequence) : null;
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", (CharSequence)object);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", n3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", n4);
    }
}

