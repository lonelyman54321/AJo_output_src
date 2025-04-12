/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.os.Bundle
 *  android.view.inputmethod.EditorBoundsInfo$Builder
 */
import android.graphics.RectF;
import android.os.Bundle;
import android.view.inputmethod.EditorBoundsInfo;
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.util.ArrayList;

/*
 * Renamed from jf0
 */
public final class jf0_0 {
    public static /* bridge */ /* synthetic */ EditorBoundsInfo.Builder a(EditorBoundsInfo.Builder builder, RectF rectF) {
        return builder.setHandwritingBounds(rectF);
    }

    public static /* bridge */ /* synthetic */ ArrayList b(Bundle bundle) {
        return bundle.getParcelableArrayList("PDP_OFFER", ProductPromotion.class);
    }
}

