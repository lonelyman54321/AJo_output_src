/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nM0
 */
public final class nm0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ ArrayList c;

    public nm0_2(ArrayList arrayList) {
        this.c = arrayList;
        super(1);
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "it");
        this.c.add(string2);
    }
}

