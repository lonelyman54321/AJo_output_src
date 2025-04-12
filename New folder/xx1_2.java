/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xx1
 */
public final class xx1_2
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ xx1_2(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        Object object;
        int n3 = this.a;
        switch (n3) {
            default: {
                z40$a z40$a = z40_0.Companion;
                return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.g("visual_filter_position");
            }
            case 0: 
        }
        Object object2 = tx1$a_0.a;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = new yx1_2();
        int n4 = 3;
        Object object3 = "android.util.Log";
        try {
            object3 = Class.forName((String)object3);
            object = wx1_2.b().a();
        }
        catch (ClassNotFoundException classNotFoundException) {
            object3 = new vo1_2((tx1_2)object2, n4);
        }
        boolean bl2 = object instanceof xs1_2;
        if (!bl2) {
            object3 = new vo1_2((tx1_2)object2, n4);
        } else {
            Intrinsics.checkNotNull(object3);
            mx1_1 mx1_12 = new mx1_1((Class)object3, (yx1_2)object2);
            object3 = object = new vo1_2(mx1_12, n4);
        }
        return object3;
    }
}

