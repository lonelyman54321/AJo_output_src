/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;

/*
 * Renamed from zB0
 */
public final class zb0_2
implements Predicate {
    public final /* synthetic */ Evaluator a;
    public final /* synthetic */ Element b;

    public /* synthetic */ zb0_2(Evaluator evaluator, Element element) {
        this.a = evaluator;
        this.b = element;
    }

    public final boolean test(Object object) {
        Evaluator evaluator = this.a;
        Element element = this.b;
        object = (Element)object;
        return Evaluator.a(evaluator, element, (Element)object);
    }
}

