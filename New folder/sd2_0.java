/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sD2
 */
public final class sd2_0
implements Function1 {
    public final /* synthetic */ wd2_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UploadImageAttributes c;

    public /* synthetic */ sd2_0(int n3, wd2_0 wd2_02, UploadImageAttributes uploadImageAttributes) {
        this.a = wd2_02;
        this.b = n3;
        this.c = uploadImageAttributes;
    }

    public final Object invoke(Object object) {
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        wd2_0 wd2_02 = this.a;
        Intrinsics.checkNotNullParameter(wd2_02, "this$0");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$uploadImageAttributes");
        Object object3 = ((UploadImageAttributes)object2).getId();
        int n3 = 100;
        float f6 = n3;
        f5 *= f6;
        object2 = wd2_02.N;
        int n4 = wd2_02.Qa((String)object3);
        object3 = (UploadImageAttributes)CollectionsKt.N(n4, (List)object2);
        if (object3 != null) {
            int n7 = (int)f5;
            ((UploadImageAttributes)object3).setImageUploadProgressPercent(n7);
            object = wd2_02.N;
            n3 = this.b;
            ((ArrayList)object).set(n3, object3);
            object = wd2_02.M;
            if (object != null) {
                object3 = "PROGRESS_BAR_UPDATE";
                ((RecyclerView$f)object).notifyItemChanged(n3, object3);
            }
        }
        return Unit.a;
    }
}

