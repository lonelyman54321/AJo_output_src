/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.customview.poolingcontainer.R$id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class vw2 {
    public static final int a = R$id.pooling_container_listener_holder_tag;
    public static final int b = R$id.is_pooling_container_tag;

    public static final void a(View object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        int n3 = 0;
        Serializable serializable = new dD3((View)object, null);
        Intrinsics.checkNotNullParameter(serializable, "block");
        object = zz2_1.a((Function2)((Object)serializable));
        while (bl2 = ((wz2_1)object).hasNext()) {
            int n4;
            serializable = vw2.b((View)((View)((wz2_1)object).next())).a;
            for (n3 = xx_2.h((List)((Object)serializable)); (n4 = -1) < n3; n3 += -1) {
                ww2 ww22 = (ww2)((ArrayList)serializable).get(n3);
                ww22.a();
            }
        }
    }

    public static final xw2 b(View view) {
        int n3 = a;
        xw2 xw22 = (xw2)view.getTag(n3);
        if (xw22 == null) {
            xw22 = new xw2();
            view.setTag(n3, (Object)xw22);
        }
        return xw22;
    }
}

