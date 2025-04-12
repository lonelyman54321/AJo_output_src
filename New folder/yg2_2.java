/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.Question;
import com.ril.ajio.services.data.dresstool.Style;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yg2
 */
public final class yg2_2
implements Function1 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ int b;

    public /* synthetic */ yg2_2(Question question, int n3) {
        this.a = question;
        this.b = n3;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (UY2)object;
        Question question = this.a;
        Intrinsics.checkNotNullParameter(question, "$question");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        Object object2 = question.getStyles();
        object2 = object2 != null && (object2 = (Style)object2.get(n3 = this.b)) != null ? ((Style)object2).getStyle_name() : null;
        if (object2 == null) {
            object2 = "";
        }
        RY2.e((UY2)object, (String)object2);
        return Unit.a;
    }
}

