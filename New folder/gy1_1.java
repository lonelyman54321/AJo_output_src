/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/*
 * Renamed from GY1
 */
public final class gy1_1
implements o60_0,
NodeVisitor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gy1_1(Object object, int n3) {
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

    public void head(Node node, int n3) {
        Element.e((StringBuilder)this.b, node, n3);
    }

    public /* synthetic */ void tail(Node node, int n3) {
        k42_0.a(this, node, n3);
    }
}

