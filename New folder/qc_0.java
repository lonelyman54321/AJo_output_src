/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QC
 */
public final class qc_0
implements Function1 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ qc_0(dr0_0 dr0_02, String string2) {
        this.a = dr0_02;
        this.b = string2;
    }

    public final Object invoke(Object object) {
        object = (List)object;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object, "it");
        String string2 = this.b;
        String string3 = "";
        if (string2 == null) {
            string2 = string3;
        }
        dr0_02.Y(string2, string3, (List)object);
        return Unit.a;
    }
}

