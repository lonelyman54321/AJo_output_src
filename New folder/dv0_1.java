/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.entity.Banner;
import com.ril.ajio.services.entity.BannerAdComponents;
import com.ril.ajio.services.entity.BannerResponse;
import com.ril.ajio.services.entity.Component;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dv0
 */
public final class dv0_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fv0_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ HashMap f;

    public dv0_1(fv0_0 fv0_02, String string2, String string3, HashMap hashMap, f80_0 f80_02) {
        this.c = fv0_02;
        this.d = string2;
        this.e = string3;
        this.f = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        HashMap hashMap = this.f;
        fv0_0 fv0_02 = this.c;
        String string3 = this.d;
        dv0_1 dv0_12 = new dv0_1(fv0_02, string3, string2, hashMap, f80_02);
        dv0_12.b = object;
        return dv0_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (dv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dv0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block10: {
            HashMap hashMap;
            Object object2;
            Object object3;
            int n3;
            int n4;
            int n7;
            j90_0 j90_02;
            block11: {
                block8: {
                    block9: {
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n8 = this.a;
                        n7 = 2;
                        n4 = 3;
                        n3 = 1;
                        if (n8 == 0) break block8;
                        if (n8 == n3) break block9;
                        if (n8 != n7 && n8 != n4) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        vl2_2.b(object);
                        break block10;
                    }
                    object3 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block11;
                }
                vl2_2.b(object);
                object3 = object = this.b;
                object3 = (fs0_2)object;
                object = this.c.a;
                this.b = object3;
                this.a = n3;
                object2 = this.e;
                hashMap = this.f;
                String string2 = this.d;
                object = ((av0_2)object).a(string2, (String)object2, hashMap, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            object = (dl2_2)object;
            object2 = (BannerAdComponents)((dl2_2)object).b;
            object = ((dl2_2)object).a;
            boolean bl2 = ((cl2_2)object).d();
            hashMap = null;
            if (bl2 && object2 != null) {
                object = ((BannerAdComponents)object2).getData();
                if (object != null && (object = ((BannerResponse)object).getComponent()) != null && (object = ((Component)object).getBanners()) != null && (object = (Banner)CollectionsKt.firstOrNull((List)object)) != null) {
                    object = ((Banner)object).getStaticContent();
                } else {
                    bl2 = false;
                    object = null;
                }
                Object object4 = new Gson();
                Class<DressToolModel> clazz = DressToolModel.class;
                object = ((Gson)object4).fromJson((String)object, clazz);
                Intrinsics.checkNotNullExpressionValue(object, "fromJson(...)");
                object = (DressToolModel)object;
                object4 = new kk2_1(object, n7);
                this.b = null;
                this.a = n7;
                object = object3.emit(object4, this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                object = new KK2$a(null, null, n3);
                this.b = null;
                this.a = n4;
                if ((object = object3.emit(object, this)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

