/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xR0
 */
public final class xr0_2 {
    public final cq0_1 a;
    public final String b;
    public final hh3_2 c;
    public final hh3_2 d;
    public final hh3_2 e;

    public xr0_2(cq0_1 object) {
        Intrinsics.checkNotNullParameter(object, "fleekRepo");
        this.a = object;
        this.b = object = em_1.a(AJIOApplication.Companion);
        object = new La(1);
        this.c = object = yr1_2.b((Function0)object);
        object = new Ma(1);
        this.d = object = yr1_2.b((Function0)object);
        object = new Na(1);
        this.e = object = yr1_2.b((Function0)object);
    }

    public static LinkedHashMap b(FleekQueryParameters object) {
        String string2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        String string3 = ((FleekQueryParameters)object).getTenantId();
        if (string3 != null) {
            string2 = "tenantId";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getStore()) != null) {
            string2 = "store";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getPlatform()) != null) {
            string2 = "platform";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getChannel()) != null) {
            string2 = "channel";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getUsergroup()) != null) {
            string2 = "usergroup";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getUserstate()) != null) {
            string2 = "userstate";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getCity()) != null) {
            string2 = "city";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getState()) != null) {
            string2 = "state";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getZone()) != null) {
            string2 = "zone";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getPcgroup()) != null) {
            string2 = "pcgroup";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getQuery()) != null) {
            string2 = "query";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getUserId()) != null) {
            string2 = "userId";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getPageSize()) != null) {
            string2 = "pageSize";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getCurrentPage()) != null) {
            string2 = "currentPage";
            linkedHashMap.put(string2, string3);
        }
        if ((string3 = ((FleekQueryParameters)object).getSeenPostIds()) != null) {
            string2 = "seenPostIds";
            linkedHashMap.put(string2, string3);
        }
        if ((object = ((FleekQueryParameters)object).getSeenStoryPostId()) != null) {
            string3 = "seenStoryPostId";
            linkedHashMap.put(string3, object);
        }
        return linkedHashMap;
    }

    public final UserInformation a() {
        Object object = this.d.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }
}

