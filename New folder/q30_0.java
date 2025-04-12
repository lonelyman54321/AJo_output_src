/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q30
 */
public final class q30_0
extends c30_0 {
    public final ml1_2 c;
    public int d;

    public q30_0(lm1_2 lm1_22, ml1_2 ml1_22) {
        Intrinsics.checkNotNullParameter(lm1_22, "writer");
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        super(lm1_22);
        this.c = ml1_22;
    }

    public final void a() {
        int n3;
        int n4 = 1;
        this.b = n4;
        this.d = n3 = this.d + n4;
    }

    public final void b() {
        this.b = false;
        String string2 = "\n";
        this.h(string2);
        int n3 = this.d;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = this.c.a.g;
            this.h(string3);
        }
    }

    public final void c() {
        boolean bl2 = this.b;
        if (bl2) {
            bl2 = false;
            this.b = false;
        } else {
            this.b();
        }
    }

    public final void k() {
        this.e(' ');
    }

    public final void l() {
        int n3;
        this.d = n3 = this.d + -1;
    }
}

