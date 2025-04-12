/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class QA1$a
implements fs0_2 {
    public final /* synthetic */ oa1_1 a;

    public QA1$a(oa1_1 oa1_12) {
        this.a = oa1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        object2 = this.a;
        ((oa1_1)object2).q.k(object);
        object2 = ((oa1_1)object2).r;
        object = ((DataCallback)object).getData();
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

