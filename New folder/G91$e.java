/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class G91$e
extends ri3_1 {
    public final /* synthetic */ g91_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ta0_2 g;

    public G91$e(String string2, g91_0 g91_02, int n3, ta0_2 ta0_22) {
        this.e = g91_02;
        this.f = n3;
        this.g = ta0_22;
        super(string2, true);
    }

    public final long a() {
        g91_0 g91_02 = this.e;
        int n3 = this.f;
        ta0_2 ta0_22 = this.g;
        g91_02.getClass();
        Object object = "statusCode";
        Intrinsics.checkNotNullParameter((Object)ta0_22, (String)object);
        object = g91_02.y;
        try {
            ((t91_0)object).n(n3, ta0_22);
        }
        catch (IOException iOException) {
            g91_02.b(iOException);
        }
        return -1;
    }
}

