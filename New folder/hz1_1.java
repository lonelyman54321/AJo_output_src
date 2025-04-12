/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HZ1
 */
public final class hz1_1
implements F62 {
    public final /* synthetic */ jz1_2 a;

    public /* synthetic */ hz1_1(jz1_2 jz1_22) {
        this.a = jz1_22;
    }

    public final void onChanged(Object object) {
        object = (List)object;
        jz1_2 jz1_22 = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(jz1_22, (String)object2);
        if (object != null) {
            object2 = jz1_22.Qa().e;
            mu1_1 mu1_12 = jz1_22.getViewLifecycleOwner();
            iz1_1 iz1_12 = new iz1_1((List)object, jz1_22);
            ((LiveData)object2).e(mu1_12, iz1_12);
        }
    }
}

