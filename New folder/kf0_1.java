/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.e;
import androidx.media3.common.f$c;
import com.ril.ajio.data.repo.StoreLPRepo;

/*
 * Renamed from kF0
 */
public final class kf0_1
implements vv1$a,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ kf0_1(Object object) {
        this.a = object;
    }

    public Object apply(Object object) {
        object = (Throwable)object;
        return StoreLPRepo.e((StoreLPRepo)this.a, (Throwable)object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        e e2 = ((androidx.media3.exoplayer.e)this.a).R;
        object.g0(e2);
    }
}

