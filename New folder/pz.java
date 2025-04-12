/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.BoringLayout
 *  android.text.BoringLayout$Metrics
 *  android.text.TextDirectionHeuristic
 *  android.text.TextPaint
 */
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

public final class pz {
    public static /* bridge */ /* synthetic */ BoringLayout.Metrics a(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring((CharSequence)charSequence, (TextPaint)textPaint, (TextDirectionHeuristic)textDirectionHeuristic, (boolean)true, null);
    }
}

