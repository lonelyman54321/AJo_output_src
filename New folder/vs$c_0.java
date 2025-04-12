/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vs$c
 */
public final class vs$c_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ ft1_2 e;
    public final /* synthetic */ tr1_0 f;

    public vs$c_0(String string2, ExoPlayer exoPlayer, tr1_0 tr1_02, ft1_2 ft1_22, tr1_0 tr1_03, f80_0 f80_02) {
        this.b = string2;
        this.c = exoPlayer;
        this.d = tr1_02;
        this.e = ft1_22;
        this.f = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.e;
        tr1_0 tr1_02 = this.f;
        String string2 = this.b;
        ExoPlayer exoPlayer = this.c;
        tr1_0 tr1_03 = this.d;
        object = new vs$c_0(string2, exoPlayer, tr1_03, ft1_22, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vs$c_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vs$c_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.d;
        Object object2 = (Component)object.getValue();
        if (object2 != null) {
            object2 = (Component)object.getValue();
            if (object2 != null) {
                object2 = ((Component)object2).getUuid();
            } else {
                n3 = 0;
                object2 = null;
            }
            Object object3 = this.b;
            n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
            if (n3 != 0) {
                if ((object = (Component)object.getValue()) == null) return Unit.a;
                if ((object = ((Component)object).getSubcomponents()) == null) return Unit.a;
                object3 = this.e;
                object2 = new ws_2((ft1_2)object3, (p83_0)object);
                object = J83.k((Function0)object2);
                object3 = this.f;
                object2 = new vs$c$a((tr1_0)object3);
                this.a = n4;
                if ((object = ((m0_0)object).collect((fs0_2)object2, this)) != j90_02) return Unit.a;
                return j90_02;
            }
        }
        object = this.c;
        object.pause();
        return Unit.a;
    }
}

