/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i;
import androidx.navigation.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from GT1
 */
public final class gt1_1
extends Lambda
implements Function1 {
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ mu1_1 d;

    public gt1_1(yT1 yT12, mu1_1 mu1_12) {
        this.c = yT12;
        this.d = mu1_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        object.getClass();
        mu1_1 mu1_12 = this.d;
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(mu1_12, (String)object2);
        Intrinsics.checkNotNullParameter(mu1_12, (String)object2);
        object2 = ((e)object).o;
        boolean bl2 = Intrinsics.areEqual(mu1_12, object2);
        if (!bl2) {
            object2 = ((e)object).o;
            vs1_0 vs1_02 = ((e)object).s;
            if (object2 != null && (object2 = object2.getLifecycle()) != null) {
                ((i)object2).c(vs1_02);
            }
            ((e)object).o = mu1_12;
            object = mu1_12.getLifecycle();
            ((i)object).a(vs1_02);
        }
        object = new Object();
        return object;
    }
}

