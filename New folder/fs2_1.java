/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Payment.BannerInfo;

/*
 * Renamed from fs2
 */
public final class fs2_1
extends ClickableSpan {
    public final /* synthetic */ BannerInfo a;
    public final /* synthetic */ hs2_1 b;

    public fs2_1(hs2_1 hs2_12, BannerInfo bannerInfo) {
        this.b = hs2_12;
        this.a = bannerInfo;
    }

    public final void onClick(View object) {
        object = this.b.c;
        String string2 = this.a.getTncUrl();
        ((es2_2)object).Oa(string2);
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean bl2 = og1_1.b();
        if (bl2) {
            int n3 = hv3_0.m(R$color.pesdk_lux_color_3);
            textPaint.setColor(n3);
            boolean bl3 = true;
            textPaint.setUnderlineText(bl3);
        } else {
            boolean bl4 = false;
            textPaint.setUnderlineText(false);
        }
    }
}

