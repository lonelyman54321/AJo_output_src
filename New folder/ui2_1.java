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
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Ui2
 */
public final class ui2_1
extends ClickableSpan {
    public final /* synthetic */ vi2_1 a;
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ Product c;

    public ui2_1(vi2_1 vi2_12, Ref$BooleanRef ref$BooleanRef, Product product) {
        this.a = vi2_12;
        this.b = ref$BooleanRef;
        this.c = product;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "textView");
        boolean bl2 = this.b.element;
        vi2_1 vi2_12 = this.a;
        Product product = this.c;
        vi2_12.w(product, bl2);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        int n3 = 0;
        textPaint.setUnderlineText(false);
        vi2_1 vi2_12 = this.a;
        Object object = vi2_12.b;
        int n4 = object.c9();
        if (n4 != 0) {
            n3 = hv3_0.m(R$color.luxe_color_121212);
            textPaint.setColor(n3);
        } else {
            vi2_12 = vi2_12.d;
            if (vi2_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentView");
                n3 = 0;
                vi2_12 = null;
            }
            vi2_12 = vi2_12.getContext();
            object = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(vi2_12, (String)object);
            n4 = R$attr.accent_color_4;
            n3 = tm3_0.a(n4, (Context)vi2_12);
            textPaint.setColor(n3);
        }
    }
}

