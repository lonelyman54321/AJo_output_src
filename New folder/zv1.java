/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class zv1
extends Lambda
implements Function1 {
    public final /* synthetic */ LiveData c;
    public final /* synthetic */ mu1_1 d;
    public final /* synthetic */ tr1_0 e;

    public zv1(LiveData liveData, mu1_1 mu1_12, tr1_0 tr1_02) {
        this.c = liveData;
        this.d = mu1_12;
        this.e = tr1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        Object object2 = this.e;
        object = new xv1_0((tr1_0)object2);
        object2 = this.d;
        LiveData liveData = this.c;
        liveData.e((mu1_1)object2, (F62)object);
        object2 = new yv1(liveData, (xv1_0)object);
        return object2;
    }
}

