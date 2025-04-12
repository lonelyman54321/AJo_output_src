/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from R33
 */
public final class r33_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ e43_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ DataError e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public r33_0(e43_0 e43_02, String string2, DataError dataError, boolean bl2, String string3, String string4, f80_0 f80_02) {
        this.a = e43_02;
        this.b = "BackGround_ProductListDetails";
        this.c = string2;
        this.d = 500;
        this.e = dataError;
        this.f = bl2;
        this.g = string3;
        this.h = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        DataError dataError = this.e;
        boolean bl2 = this.f;
        e43_0 e43_02 = this.a;
        String string2 = this.c;
        String string3 = this.g;
        String string4 = this.h;
        object = new r33_0(e43_02, string2, dataError, bl2, string3, string4, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (r33_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((r33_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.d;
        Boolean bl2 = this.f;
        String string2 = this.g;
        String string3 = this.h;
        String string4 = this.b;
        String string5 = this.c;
        int n3 = this.d;
        DataError dataError = this.e;
        ((ServiceErrorEventTracker)object2).trackServiceErrorEvent(string4, string5, n3, dataError, bl2, string2, string3);
        return Unit.a;
    }
}

