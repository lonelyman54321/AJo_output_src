/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SO2
 */
public final class so2_0
implements Function1 {
    public final /* synthetic */ PO2 a;
    public final /* synthetic */ PO2$b b;
    public final /* synthetic */ UploadImageAttributes c;

    public /* synthetic */ so2_0(PO2 pO2, PO2$b pO2$b, UploadImageAttributes uploadImageAttributes) {
        this.a = pO2;
        this.b = pO2$b;
        this.c = uploadImageAttributes;
    }

    public final Object invoke(Object object) {
        object = (View)object;
        PO2 pO2 = this.a;
        Intrinsics.checkNotNullParameter(pO2, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "this$1");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        object = pO2.c;
        if (object != null) {
            int n3 = ((RecyclerView$B)object2).getBindingAdapterPosition();
            object2 = this.c.getId();
            object.a(n3, (String)object2);
        }
        return Unit.a;
    }
}

