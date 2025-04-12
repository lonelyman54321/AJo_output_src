/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.widget.TextView
 */
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

public final class Cn$c
extends Cn$b {
    public void a(StaticLayout.Builder builder, TextView textView) {
        textView = En.a(textView);
        Dn.a(builder, (TextDirectionHeuristic)textView);
    }

    public boolean b(TextView textView) {
        return Fn.a(textView);
    }
}

