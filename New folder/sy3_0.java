/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sy3
 */
public final class sy3_0
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ hy3_0 b;

    public /* synthetic */ sy3_0(boolean bl2, hy3_0 hy3_02) {
        this.a = bl2;
        this.b = hy3_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = "this$0";
        hy3_0 hy3_02 = this.b;
        Intrinsics.checkNotNullParameter(hy3_02, (String)object2);
        boolean bl2 = this.a;
        if (bl2) {
            object2 = hy3_02.w;
            ((LiveData)object2).k(object);
        } else {
            object2 = hy3_02.w;
            ((LiveData)object2).k(object);
        }
        return Unit.a;
    }
}

