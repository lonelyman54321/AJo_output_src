/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class La3$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ tr1_0 c;

    public La3$a(dr0_0 dr0_02, tr1_0 tr1_02, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        tr1_0 tr1_02 = this.c;
        object = new La3$a(dr0_02, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (La3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((La3$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            int n7;
            vl2_2.b(object);
            this.b.getClass();
            object = h40_0.a;
            object = "splash_screen_time_in_seconds";
            Intrinsics.checkNotNullParameter(object, "key");
            JSONObject jSONObject = h40_0.D0();
            boolean bl2 = jSONObject.has((String)object);
            if (bl2) {
                n7 = jSONObject.getInt((String)object);
            } else {
                n7 = 0;
                object = null;
            }
            long l2 = n7 *= 1000;
            this.a = n4;
            object = bo0_2.a(l2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = Boolean.FALSE;
        this.c.setValue(object);
        return Unit.a;
    }
}

