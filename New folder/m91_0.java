/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M91
 */
public final class m91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    public m91_0(String string2, g91_0 g91_02, int n3, List list, boolean bl2) {
        this.e = g91_02;
        this.f = n3;
        this.g = list;
        super(string2, true);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        int n3;
        Object object;
        Object object2 = this.e.l;
        Object object3 = this.g;
        object2.getClass();
        object2 = "responseHeaders";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        try {
            object2 = this.e;
            object2 = ((g91_0)object2).y;
            int n4 = this.f;
            object = ta0_2.CANCEL;
            ((t91_0)object2).n(n4, (ta0_2)((Object)object));
            object2 = this.e;
            synchronized (object2) {
                object3 = this.e;
                object3 = ((g91_0)object3).A;
                n3 = this.f;
            }
        }
        catch (IOException iOException) {
            return -1;
        }
        {
            object = n3;
            object3.remove(object);
            return -1;
        }
    }
}

