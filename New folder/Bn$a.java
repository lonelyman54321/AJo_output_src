/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.textclassifier.TextClassificationManager
 *  android.view.textclassifier.TextClassifier
 *  android.widget.TextView
 */
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public final class Bn$a {
    public static TextClassifier a(TextView textView) {
        textView = textView.getContext();
        Class<TextClassificationManager> clazz = TextClassificationManager.class;
        if ((textView = (TextClassificationManager)textView.getSystemService(clazz)) != null) {
            return textView.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}

