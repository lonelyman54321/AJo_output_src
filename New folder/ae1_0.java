/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from ae1
 */
public final class ae1_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ae1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = nw2$a_0.a;
                Object object2 = new SerialDescriptor[]{};
                qw2_2 qw2_22 = (qw2_2)this.b;
                Object object3 = new pw2_2(qw2_22);
                object = uz2_1.c("kotlinx.serialization.Polymorphic", (xz2_1)object, object2, (Function1)object3);
                object2 = qw2_22.a;
                Intrinsics.checkNotNullParameter(object, "<this>");
                Intrinsics.checkNotNullParameter(object2, "context");
                return new v70_0((pz2_1)object, (yn1_2)object2);
            }
            case 0: 
        }
        Object object = (ce1$a)this.b;
        w63_0 w63_02 = w63_0.a;
        object = ((ce1$a)object).a;
        synchronized (w63_02) {
            Throwable throwable2;
            block7: {
                Object object4;
                try {
                    object4 = w63_0.b;
                    if (object4 != null) return object4;
                    object4 = new Lq0$a();
                    object = m.d((Context)object);
                    object = qm0_1.e((File)object);
                    String string2 = hn2_2.b;
                    ((Lq0$a)object4).a = object = hn2$a.b((File)object);
                    w63_0.b = object4 = ((Lq0$a)object4).a();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return object4;
            }
            throw throwable2;
        }
    }
}

