/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Paint$FontMetricsInt
 *  android.os.Build$VERSION
 *  android.text.PrecomputedText$Params
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.ActionMode$Callback
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat$a;

public final class Hm3 {
    public static PrecomputedTextCompat$a a(TextView object) {
        TransformationMethod transformationMethod;
        int n3;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            object = Hm3$c.b((TextView)object);
            PrecomputedTextCompat$a precomputedTextCompat$a = new PrecomputedTextCompat$a((PrecomputedText.Params)object);
            return precomputedTextCompat$a;
        }
        TextPaint textPaint = object.getPaint();
        TextPaint textPaint2 = new TextPaint((Paint)textPaint);
        int n8 = Build.VERSION.SDK_INT;
        boolean bl2 = false;
        int n10 = 1;
        int n14 = 23;
        if (n8 >= n14) {
            n8 = 1;
            n3 = 1;
        } else {
            n8 = 0;
            textPaint = null;
            n3 = 0;
        }
        if (n4 >= n14) {
            n8 = Hm3$a.a((TextView)object);
            n3 = Hm3$a.b((TextView)object);
        }
        if ((n14 = (transformationMethod = object.getTransformationMethod()) instanceof PasswordTransformationMethod) != 0) {
            object = TextDirectionHeuristics.LTR;
        } else if (n4 >= n7 && (n4 = object.getInputType() & 0xF) == (n7 = 3)) {
            byte by2 = Character.getDirectionality(((String)(object = Hm3$c.a(Hm3$b.a(object.getTextLocale()))[0])).codePointAt(0));
            object = by2 != n10 && by2 != (n4 = 2) ? TextDirectionHeuristics.LTR : TextDirectionHeuristics.RTL;
        } else {
            n4 = object.getLayoutDirection();
            if (n4 == n10) {
                bl2 = true;
            }
            int n15 = object.getTextDirection();
            switch (n15) {
                default: {
                    if (bl2) {
                        object = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    object = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                }
                case 7: {
                    object = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                }
                case 6: {
                    object = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                }
                case 5: {
                    object = TextDirectionHeuristics.LOCALE;
                    break;
                }
                case 4: {
                    object = TextDirectionHeuristics.RTL;
                    break;
                }
                case 3: {
                    object = TextDirectionHeuristics.LTR;
                    break;
                }
                case 2: {
                    object = TextDirectionHeuristics.ANYRTL_LTR;
                }
            }
        }
        PrecomputedTextCompat$a precomputedTextCompat$a = new PrecomputedTextCompat$a(textPaint2, (TextDirectionHeuristic)object, n8, n3);
        return precomputedTextCompat$a;
    }

    public static void b(TextView textView, int n3) {
        B41.b(n3);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 28;
        if (n4 >= n7) {
            Hm3$c.c(textView, n3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        n7 = textView.getIncludeFontPadding() ? 1 : 0;
        n4 = n7 != 0 ? fontMetricsInt.top : fontMetricsInt.ascent;
        n7 = Math.abs(n4);
        if (n3 > n7) {
            n3 += n4;
            n4 = textView.getPaddingLeft();
            n7 = textView.getPaddingRight();
            int n8 = textView.getPaddingBottom();
            textView.setPadding(n4, n3, n7, n8);
        }
    }

    public static void c(TextView textView, int n3) {
        B41.b(n3);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n4 = textView.getIncludeFontPadding();
        int n7 = n4 != 0 ? fontMetricsInt.bottom : fontMetricsInt.descent;
        n4 = Math.abs(n7);
        if (n3 > n4) {
            n3 -= n7;
            n7 = textView.getPaddingLeft();
            n4 = textView.getPaddingTop();
            int n8 = textView.getPaddingRight();
            textView.setPadding(n7, n4, n8, n3);
        }
    }

    public static void d(TextView textView, int n3) {
        B41.b(n3);
        TextPaint textPaint = textView.getPaint();
        int n4 = textPaint.getFontMetricsInt(null);
        if (n3 != n4) {
            float f5 = n3 -= n4;
            n4 = 1065353216;
            float f6 = 1.0f;
            textView.setLineSpacing(f5, f6);
        }
    }

    public static void e(TextView object, PrecomputedTextCompat precomputedTextCompat) {
        block4: {
            block3: {
                int n3;
                block2: {
                    n3 = Build.VERSION.SDK_INT;
                    int n4 = 29;
                    if (n3 < n4) break block2;
                    precomputedTextCompat.getClass();
                    object.setText(null);
                    break block3;
                }
                PrecomputedTextCompat$a precomputedTextCompat$a = Hm3.a(object);
                precomputedTextCompat.getClass();
                n3 = precomputedTextCompat$a.a(null) ? 1 : 0;
                if (n3 == 0) break block4;
                object.setText((CharSequence)((Object)precomputedTextCompat));
            }
            return;
        }
        object = new IllegalArgumentException("Given text can not be applied to TextView.");
        throw object;
    }

    public static void f(TextView textView, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            Gm3.a(textView, n3);
        } else {
            Context context = textView.getContext();
            textView.setTextAppearance(context, n3);
        }
    }

    public static ActionMode.Callback g(ActionMode.Callback callback2) {
        int n3;
        int n4 = callback2 instanceof Hm3$e;
        if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 26)) {
            callback2 = ((Hm3$e)callback2).a;
        }
        return callback2;
    }

    public static ActionMode.Callback h(ActionMode.Callback callback2, TextView textView) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4 && n3 <= (n4 = 27) && (n3 = callback2 instanceof Hm3$e) == 0 && callback2 != null) {
            Hm3$e hm3$e = new Hm3$e(callback2, textView);
            return hm3$e;
        }
        return callback2;
    }
}

