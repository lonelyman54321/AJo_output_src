/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.PathEffect
 *  android.text.TextPaint
 *  android.text.style.CharacterStyle
 *  android.text.style.UpdateAppearance
 */
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

public final class Rt0
extends CharacterStyle
implements UpdateAppearance {
    public final Qt0 a;

    public Rt0(Qt0 qt0) {
        this.a = qt0;
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            Object object = this.a;
            Object object2 = rM0.a;
            int n3 = Intrinsics.areEqual(object, object2);
            if (n3 != 0) {
                object2 = Paint.Style.FILL;
                textPaint.setStyle((Paint.Style)object2);
            } else {
                n3 = object instanceof re3_1;
                if (n3 != 0) {
                    object2 = Paint.Style.STROKE;
                    textPaint.setStyle((Paint.Style)object2);
                    object2 = object;
                    float f5 = ((re3_1)object).a;
                    textPaint.setStrokeWidth(f5);
                    object2 = object;
                    f5 = ((re3_1)object).b;
                    textPaint.setStrokeMiter(f5);
                    object2 = object;
                    object2 = (re3_1)object;
                    n3 = ((re3_1)object2).d;
                    boolean bl2 = false;
                    boolean bl3 = Ue3.b(n3, 0);
                    int n4 = 2;
                    int n7 = 1;
                    object2 = bl3 ? Paint.Join.MITER : ((bl3 = Ue3.b(n3, n7)) ? Paint.Join.ROUND : ((n3 = (int)(Ue3.b(n3, n4) ? 1 : 0)) != 0 ? Paint.Join.BEVEL : Paint.Join.MITER));
                    textPaint.setStrokeJoin((Paint.Join)object2);
                    object2 = object;
                    object2 = (re3_1)object;
                    n3 = ((re3_1)object2).c;
                    bl2 = Se3.a(n3, 0);
                    object2 = bl2 ? Paint.Cap.BUTT : ((bl2 = Se3.a(n3, n7)) ? Paint.Cap.ROUND : ((n3 = (int)(Se3.a(n3, n4) ? 1 : 0)) != 0 ? Paint.Cap.SQUARE : Paint.Cap.BUTT));
                    textPaint.setStrokeCap((Paint.Cap)object2);
                    object = (re3_1)object;
                    object2 = ((re3_1)object).e;
                    if (object2 != null) {
                        object = "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect";
                        Intrinsics.checkNotNull(object2, (String)object);
                        object2 = ((li)object2).a;
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object2 = null;
                    }
                    textPaint.setPathEffect((PathEffect)object2);
                }
            }
        }
    }
}

