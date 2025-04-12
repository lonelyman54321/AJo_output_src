/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

public final class br3 {
    public static final /* synthetic */ kn1_0 a(LiveData liveData, NX0 object) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(object, "mapFunction");
        kn1_0 kn1_02 = new kn1_0();
        ar3_0 ar3_02 = new ar3_0(kn1_02, (NX0)object);
        object = new br3$a(ar3_02);
        kn1_02.l(liveData, (F62)object);
        return kn1_02;
    }
}

