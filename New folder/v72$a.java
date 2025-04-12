/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class v72$a
implements wj_2 {
    public final /* synthetic */ vj_2 a;
    public final /* synthetic */ v72_0 b;

    public v72$a(v72_0 v72_02, vj_2 vj_22) {
        this.b = v72_02;
        this.a = vj_22;
    }

    public final void onFailure(ij_2 object, IOException iOException) {
        object = this.a;
        v72_0 v72_02 = this.b;
        try {
            object.b(v72_02, iOException);
        }
        catch (Throwable throwable) {
            cz3_0.n(throwable);
        }
    }

    public final void onResponse(ij_2 object, cl2_2 object2) {
        object = this.a;
        v72_0 v72_02 = this.b;
        try {
            object2 = v72_02.e((cl2_2)object2);
        }
        catch (Throwable throwable) {
            cz3_0.n(throwable);
            try {
                object.b(v72_02, throwable);
            }
            catch (Throwable throwable2) {
                cz3_0.n(throwable2);
            }
            return;
        }
        try {
            object.a(v72_02, (dl2_2)object2);
        }
        catch (Throwable throwable) {
            cz3_0.n(throwable);
        }
    }
}

