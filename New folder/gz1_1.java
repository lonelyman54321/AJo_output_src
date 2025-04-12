/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GZ1
 */
public final class gz1_1
implements F62 {
    public final /* synthetic */ jz1_2 a;

    public /* synthetic */ gz1_1(jz1_2 jz1_22) {
        this.a = jz1_22;
    }

    public final void onChanged(Object object) {
        int n3;
        object = (Integer)object;
        jz1_2 jz1_22 = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(jz1_22, (String)object2);
        if (object != null) {
            n3 = (Integer)object;
        } else {
            n3 = 0;
            object = null;
        }
        ((jo_2)jz1_22.g.getValue()).y(n3);
        jz1_22.Ra();
        object = jz1_22.Qa().g;
        object2 = jz1_22.getViewLifecycleOwner();
        hz1_1 hz1_12 = new hz1_1(jz1_22);
        ((LiveData)object).e((mu1_1)object2, hz1_12);
    }
}

