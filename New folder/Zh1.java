/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.inputmethod.ExtractedText
 */
import android.view.inputmethod.ExtractedText;
import kotlin.text.StringsKt;

public final class Zh1 {
    public static final ExtractedText a(ql3_0 ql3_02) {
        int n3;
        int n4;
        int n7;
        ExtractedText extractedText = new ExtractedText();
        String string2 = ql3_02.a.a;
        extractedText.text = string2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = n7 = string2.length();
        extractedText.partialStartOffset = -1;
        long l2 = ql3_02.b;
        extractedText.selectionStart = n4 = mm3.e(l2);
        extractedText.selectionEnd = n7 = mm3.d(l2);
        extractedText.flags = n3 = StringsKt.G(ql3_02.a.a, '\n') ^ 1;
        return extractedText;
    }
}

