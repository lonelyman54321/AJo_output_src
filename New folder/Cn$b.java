/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.widget.TextView
 */
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

public class Cn$b
extends Cn$d {
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        textView = (TextDirectionHeuristic)Cn.e(textView, "getTextDirectionHeuristic", textDirectionHeuristic);
        Dn.a(builder, (TextDirectionHeuristic)textView);
    }
}

