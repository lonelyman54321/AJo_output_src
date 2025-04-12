/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.LuxeFragmentPlpPeekBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductFnlColorVariantData;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class DF1
extends nv2_2 {
    public static final /* synthetic */ gn1_2[] m;
    public final cc3_2 l;

    static {
        in1_2 in1_22 = jz.a(DF1.class, "binding", "getBinding()Lcom/ril/ajio/databinding/LuxeFragmentPlpPeekBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{in1_22};
        m = gn1_2Array;
    }

    public DF1() {
        cc3_2 cc3_22;
        this.l = cc3_22 = z80_0.c(DF1$a.a, this);
    }

    public final void Qa(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        object = m;
        int n4 = 0;
        object = object[0];
        object = this.l.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = (LuxeFragmentPlpPeekBinding)object;
        Object object2 = ih3_1.b;
        Object object3 = this.b;
        if (object3 != null && (object3 = ((lv2)object3).a) != null && (object3 = ((Product)object3).getFnlColorVariantData()) != null) {
            object3 = ((ProductFnlColorVariantData)object3).getColorGroup();
        } else {
            n3 = 0;
            object3 = null;
        }
        n4 = CollectionsKt.F((Iterable)object2, object3);
        if (n4 != 0) {
            object2 = ((LuxeFragmentPlpPeekBinding)object).fppTvAddToCloset;
            n3 = R$string.added_to_wishlist;
            object3 = hv3_0.K(n3);
            object2.setText((CharSequence)object3);
            object = ((LuxeFragmentPlpPeekBinding)object).fppIvAddToCloset;
            n4 = R$drawable.ic_wishlist_added_luxe;
            ((AppCompatImageView)((Object)object)).setImageResource(n4);
        } else {
            object2 = ((LuxeFragmentPlpPeekBinding)object).fppTvAddToCloset;
            n3 = R$string.add_to_wishlist;
            object3 = hv3_0.K(n3);
            object2.setText((CharSequence)object3);
            object = ((LuxeFragmentPlpPeekBinding)object).fppIvAddToCloset;
            n4 = R$drawable.ic_wishlist_luxe;
            ((AppCompatImageView)((Object)object)).setImageResource(n4);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_fragment_plp_peek;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

