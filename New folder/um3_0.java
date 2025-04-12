/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from um3
 */
public final class um3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ArrayList c;

    public um3_0(ArrayList arrayList) {
        this.c = arrayList;
        super(1);
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "it");
        this.c.add(string2);
    }
}

