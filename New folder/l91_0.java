/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from L91
 */
public final class l91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ce_2 g;
    public final /* synthetic */ int h;

    public l91_0(String string2, g91_0 g91_02, int n3, ce_2 ce_22, int n4, boolean bl2) {
        this.e = g91_02;
        this.f = n3;
        this.g = ce_22;
        this.h = n4;
        super(string2, true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        Object object;
        int n3;
        Object object2;
        try {
            Object object3 = this.e;
            object3 = ((g91_0)object3).l;
            object2 = this.g;
            n3 = this.h;
            object3.getClass();
            object3 = "source";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            long l2 = n3;
            ((ce_2)object2).skip(l2);
            object3 = this.e;
            object3 = ((g91_0)object3).y;
            int n4 = this.f;
            object = ta0_2.CANCEL;
            ((t91_0)object3).n(n4, (ta0_2)((Object)object));
            object3 = this.e;
            synchronized (object3) {
                object2 = this.e;
                object2 = ((g91_0)object2).A;
                n3 = this.f;
            }
        }
        catch (IOException iOException) {
            return -1;
        }
        {
            object = n3;
            object2.remove(object);
            return -1;
        }
    }
}

