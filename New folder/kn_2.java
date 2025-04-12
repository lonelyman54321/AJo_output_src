/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kN
 */
public final class kn_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object2 = (ky1_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((ky1_0)object2).l.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (qn_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            object = ((qn_2)object2).s;
            object2 = ((qn_2)object2).Ra().f;
            ((qN$b)((Object)object)).handleMessage((Message)object2);
        }
        return Unit.a;
    }
}

