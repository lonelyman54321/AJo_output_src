/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class zD2
implements HO2 {
    public final /* synthetic */ wd2_0 a;

    public zD2(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final void a(int n3, String string2) {
        int n4;
        Intrinsics.checkNotNullParameter(string2, "id");
        wd2_0 wd2_02 = this.a;
        Object object = wd2_02.getView();
        if (object != null) {
            ai0_2.j((View)object);
        }
        if (n3 >= 0 && n3 < (n4 = ((ArrayList)(object = wd2_02.N)).size())) {
            object = wd2_02.N;
            if (object != null) {
                object = (UploadImageAttributes)CollectionsKt.N(n3, (List)object);
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null) {
                boolean bl2;
                Object object2 = ((UploadImageAttributes)object).getReviewId();
                od2_0 od2_02 = new od2_0(wd2_02, n3);
                Object object3 = ((UploadImageAttributes)object).getImageId();
                if ((object2 = (Unit)ai0_2.r(od2_02, object2, object3)) == null && (bl2 = Intrinsics.areEqual(object2 = ((UploadImageAttributes)object).getImageUploadStatus(), object3 = "IN_PROGRESS"))) {
                    object2 = wd2_02.X;
                    object2.put(string2, object);
                    wd2_02.Ua(n3);
                }
            }
        }
    }
}

