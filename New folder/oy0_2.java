/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/*
 * Renamed from oy0
 */
public final class oy0_2
implements Consumer {
    public final /* synthetic */ StringBuilder a;

    public /* synthetic */ oy0_2(StringBuilder stringBuilder) {
        this.a = stringBuilder;
    }

    public final void accept(Object object) {
        StringBuilder stringBuilder = this.a;
        object = (Node)object;
        Element.d(stringBuilder, (Node)object);
    }
}

