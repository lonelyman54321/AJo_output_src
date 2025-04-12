/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mt0
 */
public final class mt0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mt0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((View)object, "it");
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

