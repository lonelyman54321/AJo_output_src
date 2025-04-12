/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q42
 */
public final class q42_0
extends Error {
    public q42_0() {
        this(null, 1, null);
    }

    public q42_0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2);
    }

    public /* synthetic */ q42_0(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = "An operation is not implemented.";
        }
        this(string2);
    }
}

