/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class lq1$b
implements bl1_0 {
    public final /* synthetic */ bl1_0 a;
    public final /* synthetic */ jq1_2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ bl1_0 d;

    public lq1$b(bl1_0 bl1_02, jq1_2 jq1_22, int n3, bl1_0 bl1_03) {
        this.b = jq1_22;
        this.c = n3;
        this.d = bl1_03;
        this.a = bl1_02;
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final void j() {
        int n3;
        jq1_2 jq1_22 = this.b;
        jq1_22.d = n3 = this.c;
        this.d.j();
        n3 = jq1_22.d;
        jq1_22.b(n3);
    }

    public final Function1 k() {
        return this.a.k();
    }

    public final Map p() {
        return this.a.p();
    }
}

