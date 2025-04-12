/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cj2
 */
public final class cj2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cj2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4 = (Integer)object;
                StringBuilder stringBuilder = new StringBuilder();
                object2 = (hv2_2)object2;
                String string2 = ((hv2_2)object2).e[n4];
                stringBuilder.append(string2);
                stringBuilder.append(": ");
                object = ((hv2_2)object2).g(n4).h();
                stringBuilder.append((String)object);
                return stringBuilder.toString();
            }
            case 0: 
        }
        object = (Long)object;
        object2 = (dj2_2)object2;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = ((dj2_2)object2).h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object2 = null;
        }
        object3 = eb_2.a;
        Intrinsics.checkNotNull(object);
        object = eb_2.a((Long)object);
        object2.setText((CharSequence)object);
        return Unit.a;
    }
}

