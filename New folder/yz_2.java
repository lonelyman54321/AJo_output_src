/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;

/*
 * Renamed from yZ
 */
public final class yz_2
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Evaluator)object;
        object2 = (Evaluator)object2;
        return CombiningEvaluator.b((Evaluator)object, (Evaluator)object2);
    }
}

