/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.client.plugins.ClientRequestException;
import io.ktor.client.plugins.RedirectResponseException;
import io.ktor.client.plugins.ResponseException;
import io.ktor.client.plugins.ServerResponseException;
import io.ktor.utils.io.charsets.MalformedInputException;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/*
 * Renamed from Qm0
 */
public final class qm0_2
extends qg3_2
implements Function2 {
    public jb1_2 a;
    public int b;
    public int c;
    public /* synthetic */ Object d;

    public qm0_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qm0_2 qm0_22 = new qg3_2(2, f80_02);
        qm0_22.d = object;
        return qm0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (jb1_2)object;
        object2 = (f80_0)object2;
        object = (qm0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qm0_2)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        int n3;
        int n4;
        int n7;
        Object object4;
        block16: {
            Object object5;
            int n8;
            block15: {
                Object object6;
                Object object7;
                Object object8;
                object4 = j90_0.COROUTINE_SUSPENDED;
                n8 = this.c;
                n7 = 300;
                int n10 = 2;
                n4 = 1;
                if (n8 != 0) {
                    if (n8 != n4) {
                        if (n8 != n10) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        n3 = this.b;
                        object3 = this.a;
                        object2 = (jb1_2)this.d;
                        vl2_2.b(object);
                        break block15;
                    }
                    n8 = this.b;
                    object5 = (jb1_2)this.d;
                    vl2_2.b(object);
                } else {
                    vl2_2.b(object);
                    object = (jb1_2)this.d;
                    object3 = ((jb1_2)object).a().getAttributes();
                    object8 = W91.c;
                    object3 = (Boolean)object3.g((xq_2)object8);
                    n8 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                    if (n8 == 0) {
                        object4 = rm0_2.b;
                        object3 = new StringBuilder("Skipping default response validation for ");
                        object = ((jb1_2)object).a().c().getUrl();
                        ((StringBuilder)object3).append(object);
                        object = ((StringBuilder)object3).toString();
                        object4.g((String)object);
                        return Unit.a;
                    }
                    object3 = ((jb1_2)object).e();
                    n8 = ((ub1_2)object3).a;
                    object8 = ((jb1_2)object).a();
                    if (n8 < n7) return Unit.a;
                    object7 = ((ea1_2)object8).getAttributes();
                    boolean bl2 = object7.f((xq_2)(object6 = rm0_2.a));
                    if (bl2) {
                        return Unit.a;
                    }
                    this.d = object;
                    this.b = n8;
                    this.c = n4;
                    object5 = ls2_2.a((ea1_2)object8, this);
                    if (object5 == object4) {
                        return object4;
                    }
                    Object object9 = object5;
                    object5 = object;
                    object = object9;
                }
                object = (ea1_2)object;
                object8 = ((ea1_2)object).getAttributes();
                object7 = rm0_2.a;
                object6 = Unit.a;
                object8.d((xq_2)object7, object6);
                object = ((ea1_2)object).d();
                this.d = object5;
                this.a = object;
                this.b = n8;
                this.c = n10;
                object2 = Charsets.UTF_8;
                object2 = mb1_1.a((jb1_2)object, (Charset)object2, this);
                if (object2 == object4) {
                    return object4;
                }
                n3 = n8;
                object3 = object;
                object = object2;
                object2 = object5;
            }
            object = (String)object;
            break block16;
            {
                catch (MalformedInputException malformedInputException) {}
            }
            catch (MalformedInputException malformedInputException) {
                n3 = n8;
                object2 = object5;
                object3 = object;
                object = "<body failed decoding>";
            }
        }
        n4 = 400;
        if (n7 <= n3 && n3 < n4) {
            object4 = new RedirectResponseException((jb1_2)object3, (String)object);
        } else {
            n7 = 500;
            object4 = n4 <= n3 && n3 < n7 ? new ClientRequestException((jb1_2)object3, (String)object) : (n7 <= n3 && n3 < (n7 = 600) ? new ServerResponseException((jb1_2)object3, (String)object) : new ResponseException((jb1_2)object3, (String)object));
        }
        object = rm0_2.b;
        object3 = new StringBuilder("Default response validation for ");
        fx3_0 fx3_02 = ((jb1_2)object2).a().c().getUrl();
        ((StringBuilder)object3).append(fx3_02);
        ((StringBuilder)object3).append(" failed with ");
        ((StringBuilder)object3).append(object4);
        object3 = ((StringBuilder)object3).toString();
        object.g((String)object3);
        throw object4;
    }
}

