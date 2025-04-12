/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.DressToolModel;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from bv0
 */
public final class bv0_2
implements Function0 {
    public final /* synthetic */ DressToolModel a;

    public /* synthetic */ bv0_2(DressToolModel dressToolModel) {
        this.a = dressToolModel;
    }

    public final Object invoke() {
        int n3;
        Object object = this.a;
        if (object != null && (object = ((DressToolModel)object).getQuestions()) != null) {
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }
}

