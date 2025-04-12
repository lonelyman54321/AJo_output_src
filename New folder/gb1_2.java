/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from gb1
 */
public final class gb1_2
implements Function1 {
    public final /* synthetic */ g00_0 a;

    public /* synthetic */ gb1_2(sg3_2 sg3_22) {
        this.a = sg3_22;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        Object object2 = hb1_2.a;
        g00_0 g00_02 = this.a;
        if (object != null) {
            String string2 = "Cancelling request because engine Job failed with error: ";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append(object);
            charSequence = charSequence.toString();
            object2.g((String)charSequence);
            object2 = "Engine failed";
            object = xc0_2.a((String)object2, (Throwable)object);
            g00_02.d((CancellationException)object);
        } else {
            object = "Cancelling request because engine Job completed";
            object2.g((String)object);
            g00_02.a();
        }
        return Unit.a;
    }
}

