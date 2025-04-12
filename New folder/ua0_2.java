/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ua0
 */
public final class ua0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ ob0_1 b;

    public ua0_2(d d2, ob0_1 ob0_12, f80_0 f80_02) {
        this.a = d2;
        this.b = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        d d2 = this.a;
        ob0_1 ob0_12 = this.b;
        object = new ua0_2(d2, ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ua0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ua0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a.a();
        object2 = "screenName";
        if (object == null || (object = object.getString((String)object2)) == null) {
            object = "";
        }
        ob0_1 ob0_12 = this.b;
        ob0_12.getClass();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = md3_0.c(ob0_12);
        rb0_1 rb0_12 = new rb0_1(ob0_12, (String)object, null);
        Ae3.d((i90_0)object2, null, null, rb0_12, 3);
        return Unit.a;
    }
}

