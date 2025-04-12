/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class M81
implements Function1 {
    public final /* synthetic */ N81 a;

    public /* synthetic */ M81(N81 n81) {
        this.a = n81;
    }

    public final Object invoke(Object object) {
        object = (CharSequence)object;
        N81 n81 = this.a;
        Intrinsics.checkNotNullParameter(n81, "this$0");
        Object object2 = n81.s;
        String string2 = null;
        if (object2 != null) {
            Object object3;
            if (object != null) {
                int n3 = object.length();
                object3 = n3;
            } else {
                boolean bl2 = false;
                object3 = null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object3);
            stringBuilder.append("/500");
            object3 = stringBuilder.toString();
            object2.setText((CharSequence)object3);
        }
        object2 = n81.Qa();
        if (object != null) {
            string2 = object.toString();
        }
        object2.b = string2;
        return Unit.a;
    }
}

