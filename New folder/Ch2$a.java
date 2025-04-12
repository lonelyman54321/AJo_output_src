/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.ItemRowAjiogramProductPdpBinding;
import kotlin.jvm.internal.Intrinsics;

public final class Ch2$a
extends RecyclerView$B {
    public final ItemRowAjiogramProductPdpBinding a;
    public final /* synthetic */ ch2_2 b;

    public Ch2$a(ch2_2 object, ItemRowAjiogramProductPdpBinding itemRowAjiogramProductPdpBinding) {
        Intrinsics.checkNotNullParameter(itemRowAjiogramProductPdpBinding, "binding");
        this.b = object;
        object = itemRowAjiogramProductPdpBinding.getRoot();
        super((View)object);
        this.a = itemRowAjiogramProductPdpBinding;
    }

    public static void w(ImageView imageView, String string2) {
        boolean bl2;
        da$a da$a = new da$a();
        da$a.k = bl2 = true;
        da$a.r = bl2;
        String string3 = hv3_0.K(R$string.product_image);
        da$a.b(string3);
        da$a.n = string2;
        da$a.u = imageView;
        da$a.a();
    }
}

