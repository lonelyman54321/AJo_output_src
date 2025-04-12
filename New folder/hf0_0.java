/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.c;
import androidx.media3.common.f;
import androidx.media3.common.f$b;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.e;
import com.ril.ajio.data.repo.StoreLPRepo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hF0
 */
public final class hf0_0
implements vv1$b,
o60_0,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ hf0_0(Object object) {
        this.a = object;
    }

    public void a(Object object, c object2) {
        object = (f$c)object;
        e e2 = (e)this.a;
        e2.getClass();
        f$b f$b = new f$b((c)object2);
        object2 = e2.f;
        object.Y((f)object2, f$b);
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public Object apply(Object object) {
        object = (Throwable)object;
        return StoreLPRepo.c((StoreLPRepo)this.a, (Throwable)object);
    }
}

