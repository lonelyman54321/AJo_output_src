/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sQ2
 */
public final class sq2_0
implements Function1 {
    public final /* synthetic */ uq2_0 a;

    public /* synthetic */ sq2_0(uq2_0 uq2_02) {
        this.a = uq2_02;
    }

    public final Object invoke(Object object) {
        object = (CharSequence)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((uq2_0)object2).s;
        String string2 = null;
        if (object3 != null) {
            Object object4;
            if (object != null) {
                int n3 = object.length();
                object4 = n3;
            } else {
                boolean bl2 = false;
                object4 = null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object4);
            stringBuilder.append("/500");
            object4 = stringBuilder.toString();
            object3.setText((CharSequence)object4);
        }
        object3 = ((uq2_0)object2).Qa();
        if (object != null) {
            string2 = object.toString();
        }
        object3.b = string2;
        object3 = ((uq2_0)object2).Qa();
        object2 = new StringBuilder("Other - ");
        ((StringBuilder)object2).append(object);
        object3.c = object = ((StringBuilder)object2).toString();
        return Unit.a;
    }
}

