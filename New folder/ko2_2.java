/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KO2
 */
public final class ko2_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ NO2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public ko2_2(NO2 nO2, String string2, int n3, int n4, f80_0 f80_02) {
        this.c = nO2;
        this.d = string2;
        this.e = n3;
        this.f = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.e;
        int n4 = this.f;
        NO2 nO2 = this.c;
        String string2 = this.d;
        ko2_2 ko2_22 = new ko2_2(nO2, string2, n3, n4, f80_02);
        ko2_22.b = object;
        return ko2_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (ko2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ko2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            j90_0 j90_02;
            int n3;
            Object object2;
            block6: {
                int n4;
                int n7;
                block2: {
                    block3: {
                        block4: {
                            n7 = 0;
                            object2 = null;
                            n3 = 2;
                            n4 = 1;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n8 = this.a;
                            if (n8 == 0) break block2;
                            if (n8 == n4) break block3;
                            if (n8 != n3) break block4;
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
                object = (fs0_2)this.b;
                Ch0 ch0 = this.c.a;
                String string2 = "text_review_list";
                Intrinsics.checkNotNullParameter(string2, "<this>");
                Object object3 = UrlHelper.Companion.getInstance();
                Object object4 = new Object[n4];
                object4[0] = null;
                string2 = ((UrlHelper)object3).getApiUrl("reviews", string2, object4);
                object4 = this.d;
                object3 = new Pair("optionCode", object4);
                int n10 = this.e;
                Serializable serializable = new Integer(n10);
                object4 = new Pair("pageSize", serializable);
                int n14 = this.f;
                serializable = new Integer(n14);
                Pair pair = new Pair("pageNumber", serializable);
                String string3 = "true";
                serializable = new Pair("reviewsWithImages", string3);
                int n15 = 4;
                Pair[] pairArray = new Pair[n15];
                pairArray[0] = object3;
                pairArray[n4] = object4;
                pairArray[n3] = pair;
                n7 = 3;
                pairArray[n7] = serializable;
                object2 = fh1_2.h(pairArray);
                this.b = object;
                this.a = n4;
                object2 = ch0.a(string2, (HashMap)object2, this);
                if (object2 == j90_02) {
                    return j90_02;
                }
                Object object5 = object2;
                object2 = object;
                object = object5;
            }
            this.b = null;
            this.a = n3;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

