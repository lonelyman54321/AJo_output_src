/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from us2
 */
public final class us2_2 {
    public static final ArrayList e;
    public final ks2_2 a;
    public final ls2_1 b;
    public List c;
    public boolean d;

    static {
        ArrayList arrayList;
        e = arrayList = new ArrayList();
    }

    public us2_2() {
        throw null;
    }

    public us2_2(ks2_2 object, ls2_1 object2) {
        String string2 = "phase";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "relation";
        Intrinsics.checkNotNullParameter(object2, string3);
        ArrayList arrayList = e;
        Intrinsics.checkNotNull(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        List list = TypeIntrinsics.asMutableList(arrayList);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, string3);
        string2 = "interceptors";
        Intrinsics.checkNotNullParameter(list, string2);
        this.a = object;
        this.b = object2;
        this.c = list;
        this.d = true;
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            return;
        }
        object2 = "The shared empty array list has been modified".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Phase `");
        String string2 = this.a.a;
        stringBuilder.append(string2);
        stringBuilder.append("`, ");
        int n3 = this.c.size();
        stringBuilder.append(n3);
        stringBuilder.append(" handlers");
        return stringBuilder.toString();
    }
}

