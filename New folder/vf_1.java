/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vF
 */
public final class vf_1
implements I83 {
    public static final vf_1 b;
    public final /* synthetic */ int a;

    static {
        vf_1 vf_12;
        b = vf_12 = new vf_1();
    }

    public /* synthetic */ vf_1() {
        this.a = 1;
    }

    public static final void a(uf_1 uf_12) {
        Intrinsics.checkNotNullParameter(uf_12, "<this>");
        IOException iOException = new IOException("Channel was cancelled");
        uf_12.e(iOException);
    }

    public boolean b(Object object, Object object2) {
        boolean bl2;
        if (object == object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public String toString() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return super.toString();
            }
            case 1: 
        }
        return "ReferentialEqualityPolicy";
    }
}

