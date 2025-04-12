/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.FleekSeenComponents;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiRequestBody;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class DR0$i
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;

    public DR0$i(f80_0 f80_02, dr0_0 dr0_02) {
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        object = new DR0$i(f80_02, dr0_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$i)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$i)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        DR0$i dR0$i = this;
        int n3 = 1;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.a;
        if (n4 != 0) {
            if (n4 == n3) {
                vl2_2.b(object);
                return Unit.a;
            }
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw illegalStateException;
        }
        vl2_2.b(object);
        dr0_0 dr0_02 = this.b;
        dr0_02.v0 = n3;
        Object object2 = dr0_02.a;
        List list = dr0_02.s0;
        dr0_02.getClass();
        Object var11_18 = null;
        int n7 = 3;
        SeenApiRequestBody seenApiRequestBody = new SeenApiRequestBody(null, null, n7, null);
        Object object3 = new ArrayList();
        Object object4 = new ArrayList();
        Iterator iterator = ((Iterable)list).iterator();
        while (true) {
            FleekSeenComponents fleekSeenComponents;
            String string2;
            Object object5;
            boolean bl2;
            if (!(bl2 = iterator.hasNext())) {
                rr0_2 rr0_22;
                seenApiRequestBody.setPost((ArrayList)object4);
                seenApiRequestBody.setStory((ArrayList)object3);
                String string3 = ((xr0_2)object2).a().getCustomerUUID();
                object3 = ServiceUtil.getToken(((xr0_2)object2).a());
                object4 = kp1_0.c("Bearer ", (String)object3);
                object3 = UrlHelper.Companion.getInstance();
                object5 = ld3_2.STORE_AJIOGRAM.getStoreId();
                Object[] objectArray = new Object[n3];
                string2 = null;
                objectArray[0] = string3;
                object3 = ((UrlHelper)object3).getApiUrl((String)object5, "seen_api", objectArray);
                bl2 = false;
                object5 = null;
                rr0_2 rr0_23 = rr0_22;
                rr0_22 = new rr0_2((xr0_2)object2, (String)object3, (String)object4, seenApiRequestBody, null);
                br2_2 br2_22 = new br2_2(rr0_22);
                object2 = ir0_2.a;
                object2 = em0_2.b;
                es0_2 es0_22 = ms0_1.m(br2_22, (CoroutineContext)object2);
                object2 = new qg3_2(n7, null);
                object3 = new at0_1(es0_22, (gx0_2)object2);
                DR0$i$a dR0$i$a = new DR0$i$a(dr0_02);
                dR0$i.a = n3;
                Object object6 = ((at0_1)object3).collect(dR0$i$a, dR0$i);
                if (object6 != j90_02) return Unit.a;
                return j90_02;
            }
            object5 = (FleekSeenComponents)iterator.next();
            string2 = ((FleekSeenComponents)object5).getId();
            String string4 = ((FleekSeenComponents)object5).getPageName();
            Long l2 = ((FleekSeenComponents)object5).getTime();
            FleekSeenComponents fleekSeenComponents2 = fleekSeenComponents;
            FleekSeenComponents fleekSeenComponents3 = fleekSeenComponents;
            fleekSeenComponents = null;
            int n8 = 4;
            fleekSeenComponents2(string2, l2, null, string4, n8, null);
            String string5 = ((FleekSeenComponents)object5).getType();
            string2 = "STORY";
            boolean bl3 = Intrinsics.areEqual(string5, string2);
            if (bl3) {
                ((ArrayList)object3).add(fleekSeenComponents3);
            } else {
                String string6;
                bl2 = Intrinsics.areEqual(object5 = ((FleekSeenComponents)object5).getType(), string6 = "POSTS");
                if (bl2) {
                    ((ArrayList)object4).add(fleekSeenComponents3);
                }
            }
            Object var11_21 = null;
        }
    }
}

