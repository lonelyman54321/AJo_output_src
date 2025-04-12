/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class KY1$b$b
implements fs0_2 {
    public final /* synthetic */ ky1_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public KY1$b$b(ky1_0 ky1_02, String string2, String string3, String string4) {
        this.a = ky1_02;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        object = this.a;
        object2 = this.b;
        String string2 = this.c;
        String string3 = this.d;
        ((ky1_0)object).d((String)object2, string2, string3);
        return Unit.a;
    }
}

