/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.rto.entity.RTOReasonData;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class WC2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ WC2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                Boolean bl2;
                int n7;
                Boolean bl3;
                Object object2;
                Object object3;
                Object object4;
                object = (Integer)object;
                int n8 = (Integer)object;
                Object object5 = "this$0";
                zQ2 zQ22 = (zQ2)this.b;
                Intrinsics.checkNotNullParameter(zQ22, (String)object5);
                n3 = zQ22.c;
                if (n3 >= 0) {
                    object4 = zQ22.b;
                    object2 = object3 = ((ArrayList)object4).get(n3);
                    object2 = (RTOReasonData)object3;
                    bl3 = Boolean.FALSE;
                    n7 = 5;
                    bl2 = null;
                    n4 = 0;
                    object3 = RTOReasonData.copy$default(object2, null, bl3, false, n7, null);
                    ((ArrayList)object4).set(n3, object3);
                    n3 = zQ22.c;
                    zQ22.notifyItemChanged(n3);
                }
                object5 = zQ22.b;
                object4 = ((ArrayList)object5).get(n8);
                object3 = object4;
                object3 = (RTOReasonData)object4;
                bl2 = Boolean.TRUE;
                n4 = 5;
                n7 = 0;
                object2 = null;
                bl3 = null;
                object4 = RTOReasonData.copy$default(object3, null, bl2, false, n4, null);
                ((ArrayList)object5).set(n8, object4);
                zQ22.notifyItemChanged(n8);
                zQ22.c = n8;
                object5 = zQ22.b;
                object = ((RTOReasonData)((ArrayList)object5).get(n8)).getReason();
                if (object == null) {
                    object = "";
                }
                zQ22.a.invoke(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        ZC2 zC2 = (ZC2)this.b;
        Intrinsics.checkNotNullParameter(zC2, "this$0");
        zC2.g.k(object);
        return Unit.a;
    }
}

