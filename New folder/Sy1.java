/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;

public final class Sy1
extends ClickableSpan {
    public final /* synthetic */ ry1_1 a;

    public Sy1(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        uy1_0.e("click here");
        object = cp_1.Companion;
        Context context = this.a.getContext();
        object.getClass();
        cp$a.C(context, "common_login_signup_screen");
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        int n3 = hv3_0.m(R$color.pesdk_color_3);
        textPaint.setColor(n3);
        textPaint.setUnderlineText(false);
    }
}

