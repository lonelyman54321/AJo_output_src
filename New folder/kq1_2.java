/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from kq1
 */
public final class kq1_2
implements bl1_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ jq1$c e;
    public final /* synthetic */ jq1_2 f;
    public final /* synthetic */ Function1 g;

    public kq1_2(int n3, int n4, Map map2, jq1$c jq1$c, jq1_2 jq1_22, Function1 function1) {
        this.a = n3;
        this.b = n4;
        this.c = map2;
        this.d = null;
        this.e = jq1$c;
        this.f = jq1_22;
        this.g = function1;
    }

    public final int getHeight() {
        return this.b;
    }

    public final int getWidth() {
        return this.a;
    }

    public final void j() {
        Object object = this.e;
        boolean bl2 = ((jq1$c)object).W();
        Function1 function1 = this.g;
        jq1_2 jq1_22 = this.f;
        if (bl2 && (object = jq1_22.a.y.b.Q) != null) {
            object = ((tb1_0)object).i;
            function1.invoke(object);
            return;
        }
        object = jq1_22.a.y.b.i;
        function1.invoke(object);
    }

    public final Function1 k() {
        return this.d;
    }

    public final Map p() {
        return this.c;
    }
}

