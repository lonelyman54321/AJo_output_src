/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.analytics.events.ServiceErrorEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Pb0
 */
public final class pb0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ DataError e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public pb0_1(ob0_1 ob0_12, String string2, String string3, int n3, DataError dataError, boolean bl2, String string4, String string5, f80_0 f80_02) {
        this.a = ob0_12;
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = dataError;
        this.f = bl2;
        this.g = string4;
        this.h = string5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.g;
        String string3 = this.h;
        ob0_1 ob0_12 = this.a;
        String string4 = this.b;
        String string5 = this.c;
        int n3 = this.d;
        DataError dataError = this.e;
        boolean bl2 = this.f;
        object = new pb0_1(ob0_12, string4, string5, n3, dataError, bl2, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pb0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pb0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.D;
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

