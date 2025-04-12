/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.ril.ajio.data.repo.CouponListRepo;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from tc0
 */
public final class tc0_1
implements bx0_2,
vv1$a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tc0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return (q63_0)oj_0.a((Function1)this.b, "$tmp0", object, "p0", object);
            }
            case 0: 
        }
        return CouponListRepo.d((sc0_1)((Function1)this.b), object);
    }

    public void invoke(Object object) {
        object = (f$c)object;
        ExoPlaybackException exoPlaybackException = ((Mt2)this.b).f;
        object.p(exoPlaybackException);
    }
}

