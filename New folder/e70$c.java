/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

public final class e70$c
extends qg3_2
implements ix0_2 {
    public int a;
    public /* synthetic */ jb1_2 b;
    public /* synthetic */ uf_1 c;
    public /* synthetic */ at3_0 d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ List f;
    public final /* synthetic */ mv_2 g;

    public e70$c(mv_2 mv_22, f80_0 f80_02, List list, Set set) {
        this.e = set;
        this.f = list;
        this.g = mv_22;
        super(5, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4, Object object5) {
        object = (tq3_0)object;
        object2 = (jb1_2)object2;
        object3 = (uf_1)object3;
        object4 = (at3_0)object4;
        object5 = (f80_0)object5;
        Set set = this.e;
        List list = this.f;
        mv_2 mv_22 = this.g;
        object = new e70$c(mv_22, (f80_0)object5, list, set);
        ((e70$c)object).b = object2;
        ((e70$c)object).c = object3;
        ((e70$c)object).d = object4;
        object2 = Unit.a;
        return ((e70$c)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        k70_0 k70_02;
        at3_0 at3_02;
        uf_1 uf_12;
        int n3;
        j90_0 j90_02;
        block6: {
            boolean bl2;
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n4 = this.a;
            n3 = 1;
            if (n4 != 0) {
                if (n4 == n3) {
                    vl2_2.b(object);
                    return object;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
            object = this.b;
            uf_12 = this.c;
            at3_02 = this.d;
            k70_02 = oa1_0.b((ma1_0)object);
            n4 = 0;
            if (k70_02 == null) {
                return null;
            }
            object6 = mb1_1.b((jb1_2)object).getHeaders();
            object5 = Charsets.UTF_8;
            object4 = "<this>";
            Intrinsics.checkNotNullParameter(object6, (String)object4);
            object3 = "defaultCharset";
            Intrinsics.checkNotNullParameter(object5, (String)object3);
            Intrinsics.checkNotNullParameter(object6, (String)object4);
            Intrinsics.checkNotNullParameter(object5, (String)object3);
            object3 = ja1_1.a;
            object6 = ha1_1.a(object6.get("Accept-Charset"));
            object3 = new Object();
            object6 = CollectionsKt.e0((Iterable)object6, (Comparator)object3).iterator();
            while (bl2 = object6.hasNext()) {
                object3 = ((z31_0)object6.next()).a;
                object2 = "*";
                boolean bl3 = Intrinsics.areEqual(object3, object2);
                if (bl3) {
                    object6 = object5;
                } else {
                    object2 = Charsets.a;
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    String string2 = "name";
                    Intrinsics.checkNotNullParameter(object3, string2);
                    boolean bl4 = Charset.isSupported(object3);
                    if (!bl4) continue;
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object6 = Charset.forName(object3);
                    object4 = "forName(...)";
                    Intrinsics.checkNotNullExpressionValue(object6, (String)object4);
                }
                break block6;
            }
            object6 = null;
        }
        object3 = object6 == null ? object5 : object6;
        object4 = mb1_1.b((jb1_2)object).getUrl();
        this.b = null;
        this.c = null;
        this.a = n3;
        object6 = this.e;
        object5 = this.f;
        object2 = this;
        object = e70_0.b((Set)object6, (List)object5, (fx3_0)object4, at3_02, uf_12, k70_02, object3, this);
        if (object != j90_02) return object;
        return j90_02;
    }
}

