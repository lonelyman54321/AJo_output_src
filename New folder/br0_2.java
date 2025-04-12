/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.fleek.explore_brands.AllBrandsPageModel;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from bR0
 */
public final class br0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ xr0_2 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;

    public br0_2(dr0_0 dr0_02, int n3, boolean bl2, xr0_2 xr0_22, String string2, String string3, f80_0 f80_02) {
        this.c = dr0_02;
        this.d = n3;
        this.e = bl2;
        this.f = xr0_22;
        this.g = string2;
        this.h = string3;
        this.i = "brandDirectoryApi";
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        xr0_2 xr0_22 = this.f;
        String string2 = this.g;
        dr0_0 dr0_02 = this.c;
        int n3 = this.d;
        boolean bl2 = this.e;
        String string3 = this.h;
        br0_2 br0_22 = new br0_2(dr0_02, n3, bl2, xr0_22, string2, string3, f80_02);
        br0_22.b = object;
        return br0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (br0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((br0_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        String string2;
        String string3;
        String string4;
        int n3;
        Object object2;
        Object object3;
        fs0_2 fs0_22;
        Object object4;
        int n4;
        int n7;
        int n8;
        int n10;
        j90_0 j90_02;
        br0_2 br0_22;
        block26: {
            Object object5;
            block27: {
                void var14_21;
                hv1_1 hv1_12;
                Boolean bl2;
                hv1_1 hv1_13;
                block24: {
                    block25: {
                        br0_22 = this;
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n14 = this.a;
                        n10 = 2;
                        n8 = 4;
                        n7 = 3;
                        n4 = 1;
                        if (n14 == 0) break block24;
                        if (n14 == n4) break block25;
                        if (n14 != n10) {
                            if (n14 != n7 && n14 != n8) {
                                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw illegalStateException;
                            }
                            vl2_2.b(object);
                            return Unit.a;
                        }
                        object4 = (fs0_2)this.b;
                        vl2_2.b(object);
                        fs0_22 = object4;
                        object4 = object;
                        break block26;
                    }
                    object4 = (fs0_2)this.b;
                    vl2_2.b(object);
                    break block27;
                }
                vl2_2.b(object);
                object4 = (fs0_2)this.b;
                object3 = this.c;
                int n15 = ((dr0_0)object3).p();
                object2 = ((dr0_0)object3).k;
                if ((n15 != 0 || (hv1_13 = (hv1_1)((Object)((h83_0)object2).getValue())) != (object5 = hv1_1.IDLE)) && ((n15 = ((dr0_0)object3).p()) == 0 || (n15 = (int)((bl2 = (Boolean)((dr0_0)object3).j.getValue()).booleanValue() ? 1 : 0)) == 0 || (hv1_12 = (hv1_1)((Object)((h83_0)object2).getValue())) != (object2 = hv1_1.IDLE))) return Unit.a;
                n15 = ((dr0_0)object3).p();
                if (n15 == 0) {
                    hv1_1 hv1_14 = hv1_1.LOADING;
                } else {
                    hv1_1 hv1_15 = hv1_1.PAGINATING;
                }
                ((dr0_0)object3).a0((hv1_1)var14_21);
                n3 = br0_22.d;
                if (n3 == 0 && (n3 = (int)(br0_22.e ? 1 : 0)) == 0) {
                    object3 = new KK2$b();
                    br0_22.b = object4;
                    br0_22.a = n4;
                    if ((object3 = object4.emit(object3, br0_22)) == j90_02) {
                        return j90_02;
                    }
                }
            }
            fs0_22 = object4;
            object4 = br0_22.f;
            object3 = ((xr0_2)object4).a;
            String string6 = ServiceUtil.getToken(((xr0_2)object4).a());
            string6 = kp1_0.c("Bearer ", string6);
            object2 = az3_0.b();
            AJIOApplication.Companion.getClass();
            object5 = UserInformation.getInstance((Context)AJIOApplication$a.a()).getCustomerUUID();
            ((FleekQueryParameters)object2).setUserId((String)object5);
            object5 = new LinkedHashMap();
            string4 = ((FleekQueryParameters)object2).getTenantId();
            if (string4 != null) {
                string3 = "tenantId";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getStore()) != null) {
                string3 = "store";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getPlatform()) != null) {
                string3 = "platform";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getChannel()) != null) {
                string3 = "channel";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getUsergroup()) != null) {
                string3 = "usergroup";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getUserstate()) != null) {
                string3 = "userstate";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getCity()) != null) {
                string3 = "city";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getState()) != null) {
                string3 = "state";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getZone()) != null) {
                string3 = "zone";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getPcgroup()) != null) {
                string3 = "pcgroup";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getQuery()) != null) {
                string3 = "query";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getUserId()) != null) {
                string3 = "userId";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getPageSize()) != null) {
                string3 = "pageSize";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getCurrentPage()) != null) {
                string3 = "currentPage";
                object5.put(string3, string4);
            }
            if ((string4 = ((FleekQueryParameters)object2).getCategory()) != null) {
                string3 = "category";
                object5.put(string3, string4);
            }
            if ((object2 = ((FleekQueryParameters)object2).getPage()) != null) {
                string4 = "page";
                object5.put(string4, object2);
            }
            dr0_0.Companion.getClass();
            int n16 = dr0_0.T0;
            br0_22.b = fs0_22;
            br0_22.a = n10;
            int n17 = br0_22.d;
            string2 = br0_22.h;
            object2 = br0_22.g;
            Object object6 = ((xr0_2)object4).b;
            object4 = object3;
            object3 = object2;
            object2 = object6;
            object6 = this;
            object4 = ((cq0_1)object4).a((String)object3, string6, (String)object2, (LinkedHashMap)object5, n17, n16, string2, this);
            if (object4 == j90_02) {
                return j90_02;
            }
        }
        Object object7 = object4;
        dl2_2 dl2_22 = (dl2_2)object4;
        object4 = (AllBrandsPageModel)dl2_22.b;
        object3 = dl2_22.a;
        n3 = ((cl2_2)object3).d();
        string2 = null;
        if (n3 != 0 && (object3 = dl2_22.b) != null) {
            object3 = new kk2_1(object4, n10);
            br0_22.b = null;
            br0_22.a = n7;
            object4 = fs0_22.emit(object3, br0_22);
            if (object4 != j90_02) return Unit.a;
            return j90_02;
        }
        object3 = ApiErrorRepo.INSTANCE;
        object2 = br0_22.i;
        boolean bl3 = true;
        string4 = "";
        string3 = "Forward";
        ((ApiErrorRepo)object3).handleApiError(dl2_22, (String)object2, bl3, string4, string3);
        object3 = new KK2$a(null, object4, n4);
        br0_22.b = null;
        br0_22.a = n8;
        object4 = fs0_22.emit(object3, br0_22);
        if (object4 != j90_02) return Unit.a;
        return j90_02;
    }
}

