/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JD2
 */
public final class jd2_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jd2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (List)object;
                Object object2 = (u93_0)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                String string2 = "it";
                Intrinsics.checkNotNullParameter(object, string2);
                object2 = u93_0.Pa((u93_0)object2);
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, string2);
                ((yh0_0)object2).o.setValue(object);
                return Unit.a;
            }
            case 1: {
                int n4;
                object = (DataCallback)object;
                ms2_2 ms2_22 = (ms2_2)this.b;
                Intrinsics.checkNotNullParameter(ms2_22, "this$0");
                Z82 z82 = ms2_22.f;
                if (z82 != null) {
                    z82.b1();
                }
                if ((n4 = ((DataCallback)object).getStatus()) == 0) {
                    ms2_22.Oa();
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        kd2_0 kd2_02 = (kd2_0)this.b;
        Intrinsics.checkNotNullParameter(kd2_02, "this$0");
        kd2_02.b.k(object);
        return Unit.a;
    }
}

