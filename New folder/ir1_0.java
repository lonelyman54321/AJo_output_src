/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import com.ril.ajio.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from iR1
 */
public final class ir1_0
implements w3 {
    public final /* synthetic */ lr1_0 a;

    public /* synthetic */ ir1_0(lr1_0 lr1_02) {
        this.a = lr1_02;
    }

    public final void a(Object object) {
        int n3 = 1;
        object = (List)object;
        lr1_0 lr1_02 = this.a;
        Intrinsics.checkNotNullParameter(lr1_02, "this$0");
        Intrinsics.checkNotNullParameter(object, "uris");
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        Object object2 = object;
        object2 = (Collection)object;
        int n4 = object2.size();
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object object3 = (Uri)object.get(i3);
            int n7 = lr1_02.a((Uri)object3);
            if (n7 != 0) {
                if ((object3 = lr1_02.b((Uri)object3)) == null) continue;
                arrayList.add((Uri)object3);
                continue;
            }
            boolean bl2 = lr1_02.f;
            if (bl2) continue;
            lr1_02.f = n3;
            object3 = lr1_02.a;
            n7 = R$string.file_type_invalid;
            object3 = object3.getString(n7);
            Intrinsics.checkNotNullExpressionValue(object3, "getString(...)");
            Object object4 = StringCompanionObject.INSTANCE;
            n7 = R$string.acc_error_message;
            object4 = hv3_0.K(n7);
            Object object5 = new Object[n3];
            object5[0] = object3;
            String string2 = "format(...)";
            object4 = xh2_0.a((Object[])object5, n3, (String)object4, string2);
            object5 = hv3_0.a;
            object5.getClass();
            hv3_0.l0((String)object3, (String)object4);
        }
        lr1_02.b.V7(arrayList);
    }
}

