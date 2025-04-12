/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeFilter$FilterResult;

/*
 * Renamed from IY1
 */
public final class iy1_0
implements o60_0,
NodeFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iy1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void accept(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public NodeFilter.FilterResult head(Node node, int n3) {
        return Element.b((AtomicBoolean)this.b, node, n3);
    }

    public /* synthetic */ NodeFilter.FilterResult tail(Node node, int n3) {
        return a42_0.a(this, node, n3);
    }
}

