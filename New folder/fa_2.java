/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fa
 */
public final class fa_2
extends au0_2 {
    public final /* synthetic */ da_2 e;

    public fa_2(da_2 da_22, ImageView imageView) {
        this.e = da_22;
        super((View)imageView);
    }

    public final void d(Object object, qr3 qr32) {
        object = (Drawable)object;
        String string2 = "resource";
        Intrinsics.checkNotNullParameter(object, string2);
        super.d(object, qr32);
        object = this.e;
        boolean bl2 = ((da_2)object).p;
        if (bl2) {
            bl2 = ((da_2)object).u;
            if (bl2) {
                object = ((da_2)object).t;
                if (object != null) {
                    bl2 = false;
                    qr32 = null;
                    object.b(null);
                }
            } else {
                qr32 = ((da_2)object).s;
                Intrinsics.checkNotNull(qr32);
                object = ((da_2)object).n;
                if (object == null) {
                    int n3 = R$string.acc_banner;
                    object = hv3_0.K(n3);
                }
                qr32.setContentDescription((CharSequence)object);
            }
        }
    }

    public final void i(Drawable object) {
        super.i((Drawable)object);
        object = this.e;
        boolean bl2 = object.q;
        if (bl2) {
            ImageView imageView = object.s;
            Intrinsics.checkNotNull(imageView);
            object = object.o;
            imageView.setContentDescription((CharSequence)object);
        }
    }
}

