/*
 * Decompiled with CFR 0.152.
 */
import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LC
 */
public final class lc_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lc_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object;
                Object object2 = object = this.b;
                object2 = (SystemUiController)object;
                Intrinsics.checkNotNullParameter(object2, "$systemUiController");
                long l2 = nz_1.a;
                jh3_2.h((SystemUiController)object2, l2, false, false, null, 12, null);
                return Unit.a;
            }
            case 0: 
        }
        dr0_0 dr0_02 = (dr0_0)this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        dr0_02.d0();
        return Unit.a;
    }
}

