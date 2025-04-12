/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class p
extends RecyclerView$B {
    public static final /* synthetic */ int e;
    public final mq3_0 a;
    public final TextView b;
    public final TextView c;
    public final AppCompatImageView d;

    public p(View object, mq3_0 mq3_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = mq3_02;
        int n3 = R$id.transfer_to_bank;
        mq3_02 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(mq3_02, string2);
        mq3_02 = (TextView)mq3_02;
        this.b = mq3_02;
        n3 = R$id.ac_detail_info;
        mq3_02 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(mq3_02, string2);
        mq3_02 = (TextView)mq3_02;
        this.c = mq3_02;
        n3 = R$id.nt_info_iv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AppCompatImageView)((Object)object);
        this.d = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void w(String object, boolean object2, Float f5) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "info");
        int n4 = h40_0.a.O0();
        AppCompatImageView appCompatImageView = this.d;
        TextView textView = this.c;
        if (n4 != 0) {
            n3 = 8;
            textView.setVisibility(n3);
            appCompatImageView.setVisibility(n3);
        } else {
            textView.setVisibility(0);
            appCompatImageView.setVisibility(0);
            textView.setText((CharSequence)object);
        }
        n3 = (int)(h40_0.j1() ? 1 : 0);
        appCompatImageView = this.b;
        if (n4 != 0 && object2 != 0) {
            void var3_8;
            appCompatImageView.setVisibility(0);
            if (var3_8 != null) {
                float f6 = var3_8.floatValue();
                n4 = 1065353216;
                float f7 = 1.0f;
                float f8 = f6 - f7;
                Object object3 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                if (object3 > 0 && n3 != 0) {
                    object = this.itemView.getContext();
                    int n7 = R$drawable.rounded_rect_light_black_stroke_dp;
                    object = t70.getDrawable((Context)object, n7);
                    appCompatImageView.setBackground((Drawable)object);
                    object = this.itemView.getContext();
                    int n8 = R$color.accent_color_10;
                    n3 = t70.getColor((Context)object, n8);
                    appCompatImageView.setTextColor(n3);
                    object = new n(this, (Float)var3_8);
                    appCompatImageView.setOnClickListener((View.OnClickListener)object);
                    return;
                }
            }
            object = this.itemView.getContext();
            int n10 = R$drawable.rounded_rect_light_grey_stroke_dp;
            object = t70.getDrawable((Context)object, n10);
            appCompatImageView.setBackground((Drawable)object);
            object = this.itemView.getContext();
            int n14 = R$color.accent_color_12;
            n3 = t70.getColor((Context)object, n14);
            appCompatImageView.setTextColor(n3);
            object = new Object();
            appCompatImageView.setOnClickListener((View.OnClickListener)object);
            return;
        }
        n3 = 4;
        appCompatImageView.setVisibility(n3);
    }
}

