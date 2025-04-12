/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.chuckerteam.chucker.R$color;
import com.chuckerteam.chucker.R$dimen;
import kotlin.jvm.internal.Intrinsics;

public final class Gq3$c
extends Gq3 {
    public final FU a;

    public Gq3$c(FU fU) {
        Intrinsics.checkNotNullParameter(fU, "imageBinding");
        FrameLayout frameLayout = fU.a;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "imageBinding.root");
        super((View)frameLayout);
        this.a = fU;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void w(Fq3 object) {
        Object object2 = "item";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof Fq3$c;
        if (bl2) {
            void var1_7;
            object2 = this.a;
            ImageView imageView = ((FU)object2).b;
            Fq3$c fq3$c = (Fq3$c)object;
            Bitmap bitmap = fq3$c.a;
            imageView.setImageBitmap(bitmap);
            Double d2 = fq3$c.b;
            if (d2 == null) {
                boolean bl3 = false;
                Object var1_4 = null;
            } else {
                eU eU2;
                double d5 = d2;
                String string2 = "context";
                double d7 = 0.25;
                String string3 = "itemView.context";
                Object object3 = d5 == d7 ? 0 : (d5 < d7 ? -1 : 1);
                if (object3 < 0) {
                    int n3 = eU.b;
                    imageView = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(imageView, string3);
                    int n4 = R$color.chucker_chessboard_even_square_light;
                    int n7 = R$color.chucker_chessboard_odd_square_light;
                    int n8 = R$dimen.chucker_half_grid;
                    Intrinsics.checkNotNullParameter(imageView, string2);
                    int n10 = t70.getColor((Context)imageView, n4);
                    n4 = t70.getColor((Context)imageView, n7);
                    imageView = imageView.getResources();
                    n3 = imageView.getDimensionPixelSize(n8);
                    eU2 = new eU(n10, n4, n3);
                } else {
                    int n14 = eU.b;
                    imageView = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(imageView, string3);
                    int n15 = R$color.chucker_chessboard_even_square_dark;
                    int n16 = R$color.chucker_chessboard_odd_square_dark;
                    int n17 = R$dimen.chucker_half_grid;
                    Intrinsics.checkNotNullParameter(imageView, string2);
                    int n18 = t70.getColor((Context)imageView, n15);
                    n15 = t70.getColor((Context)imageView, n16);
                    imageView = imageView.getResources();
                    n14 = imageView.getDimensionPixelSize(n17);
                    eU2 = new eU(n18, n15, n14);
                }
                eU eU3 = eU2;
            }
            object2 = ((FU)object2).a;
            object2.setBackground((Drawable)var1_7);
        }
    }
}

