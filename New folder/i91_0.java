/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from I91
 */
public final class i91_0
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ S91 f;

    public i91_0(String string2, g91_0 g91_02, S91 s91) {
        this.e = g91_02;
        this.f = s91;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a() {
        try {
            Object object = this.e;
            object = ((g91_0)object).b;
            S91 object2 = this.f;
            ((G91$b)object).b(object2);
            return -1;
        }
        catch (IOException iOException) {
            Object object = zs2_2.a;
            object = zs2_2.a;
            StringBuilder string3 = new StringBuilder("Http2Connection.Listener failure for ");
            String string2 = this.e.d;
            string3.append(string2);
            String ta0_22 = string3.toString();
            object.getClass();
            int n3 = 4;
            zs2_2.i(n3, ta0_22, iOException);
            try {
                object = this.f;
                ta0_2 ta0_23 = ta0_2.PROTOCOL_ERROR;
                ((S91)object).c(ta0_23, iOException);
                return -1;
            }
            catch (IOException iOException2) {
                return -1;
            }
        }
    }
}

