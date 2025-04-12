/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GG1
 */
public final class gg1_0
extends jD3 {
    public final zr1_1 a;
    public final kn1_0 b;
    public final LiveData c;

    public gg1_0() {
        String string2;
        Object object;
        super("");
        this.a = object;
        super();
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(string2, "switchMapFunction");
        kn1_0 kn1_02 = new kn1_0();
        cr3 cr32 = new cr3((GG1$a)((Object)string2), kn1_02);
        kn1_02.l((LiveData)object, cr32);
        Intrinsics.checkNotNullExpressionValue(kn1_02, "Transformations.switchMap(this) { transform(it) }");
        this.b = kn1_02;
        object = bf0_0.b;
        if (object != null) {
            this.c = object = ((VF2)object).a.a().d();
            return;
        }
        string2 = "You can't access the throwable repository if you don't initialize it!".toString();
        object = new IllegalStateException(string2);
        throw object;
    }
}

