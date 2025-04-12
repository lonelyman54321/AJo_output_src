/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pS2
 */
public final class ps2_2
extends ea1_2 {
    public final byte[] f;
    public final boolean g;

    public ps2_2(da1_2 object, bb1_2 object2, jb1_2 jb1_22, byte[] byArray) {
        long l2;
        boolean bl2;
        long l3;
        long l4;
        long l7;
        long l8;
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(object2, "request");
        Intrinsics.checkNotNullParameter(jb1_22, "response");
        Intrinsics.checkNotNullParameter(byArray, "responseBody");
        super((da1_2)object);
        this.f = byArray;
        super(this, (bb1_2)object2);
        Object object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.b = object;
        super(this, byArray, jb1_22);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.c = object;
        object = oa1_0.a(jb1_22);
        int n3 = byArray.length;
        long l12 = n3;
        object2 = object2.getMethod();
        object3 = "method";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null && (l8 = (l7 = (l4 = ((Long)object).longValue()) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0 && !(bl2 = Intrinsics.areEqual(object2, object3 = pa1_0.d)) && (bl2 = (l2 = (l4 = ((Long)object).longValue()) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1))) {
            object3 = new StringBuilder("Content-Length mismatch: expected ");
            ((StringBuilder)object3).append(object);
            ((StringBuilder)object3).append(" bytes, but received ");
            ((StringBuilder)object3).append(l12);
            ((StringBuilder)object3).append(" bytes");
            object = ((StringBuilder)object3).toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.g = true;
    }

    public final boolean b() {
        return this.g;
    }

    public final Object e() {
        return cg2_0.c(this.f);
    }
}

