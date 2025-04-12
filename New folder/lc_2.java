/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from lc
 */
public final class lc_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ lc_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Boolean)object;
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).a("api rtb event success", objectArray);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

