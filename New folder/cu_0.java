/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cU
 */
public final class cu_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cu_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (LP1)object;
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$buttonHeightDp$delegate");
                Intrinsics.checkNotNullParameter(object, "$this$conditional");
                float f5 = ((xs0_0)tr1_02.getValue()).a;
                float f6 = 10;
                return j.d((LP1)object, f5 -= f6);
            }
            case 0: 
        }
        object = (String)object;
        Object object2 = "this$0";
        du_1 du_12 = (du_1)this.b;
        Intrinsics.checkNotNullParameter(du_12, (String)object2);
        if (object == null) {
            object = Unit.a;
        } else {
            object2 = du_12.a;
            if (object2 != null) {
                ((yt_0)object2).g((String)object);
            }
            object = Unit.a;
        }
        return object;
    }
}

