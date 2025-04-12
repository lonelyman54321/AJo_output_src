/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Shader
 *  android.text.TextPaint
 *  android.text.style.CharacterStyle
 *  android.text.style.UpdateAppearance
 */
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from a13
 */
public final class a13_0
extends CharacterStyle
implements UpdateAppearance {
    public final Z03 a;
    public final float b;
    public final ParcelableSnapshotMutableState c;
    public final mp0 d;

    public a13_0(Z03 object, float f5) {
        this.a = object;
        this.b = f5;
        object = new C63(9205357640488583168L);
        this.c = object = J83.g(object);
        object = new a13$a(this);
        this.d = object = J83.e((Function0)object);
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f5 = this.b;
        lj_1.c(textPaint, f5);
        Shader shader = (Shader)this.d.getValue();
        textPaint.setShader(shader);
    }
}

