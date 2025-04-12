/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.services.data.Product.PlpExtendedBannerComponent;
import com.ril.ajio.services.data.Product.PlpExtendedBannerListData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class I12
extends RecyclerView$B {
    public final AjioImageView a;

    public I12(View object) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        super((View)object);
        object = this.itemView;
        int n3 = R$id.plpExtendedBannerImage;
        object = (AjioImageView)object.findViewById(n3);
        this.a = object;
    }

    public final void w(PlpExtendedBannerComponent object) {
        boolean bl2;
        int n3;
        Object object2 = null;
        if (object != null) {
            object = ((PlpExtendedBannerComponent)object).getBanners();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            bl2 = false;
            if ((object = (PlpExtendedBannerListData)((ArrayList)object).get(0)) != null) {
                object2 = ((PlpExtendedBannerListData)object).getBannerUrl();
            }
        }
        if (object2 != null && (n3 = object2.length()) != 0) {
            object = new da$a();
            ((da$a)object).k = bl2 = true;
            ((da$a)object).n = object2;
            object2 = this.a;
            ((da$a)object).u = object2;
            ((da$a)object).v = bl2;
            ((da$a)object).a();
        }
    }
}

