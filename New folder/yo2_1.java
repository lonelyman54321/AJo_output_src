/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.JsonObject;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from yo2
 */
public final class yo2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oo2_1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ JsonObject e;

    public yo2_1(oo2_1 oo2_12, String string2, JsonObject jsonObject, f80_0 f80_02) {
        this.c = oo2_12;
        this.d = string2;
        this.e = jsonObject;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        JsonObject jsonObject = this.e;
        oo2_1 oo2_12 = this.c;
        yo2_1 yo2_12 = new yo2_1(oo2_12, string2, jsonObject, f80_02);
        yo2_12.b = object;
        return yo2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (yo2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yo2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            String string2;
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.a;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.b;
                object2 = (fs0_2)object;
                object = this.c.a;
                this.b = object2;
                this.a = n3;
                string2 = this.d;
                JsonObject jsonObject = this.e;
                object = object.validateOTP(string2, jsonObject, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            string2 = null;
            this.b = null;
            this.a = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

